/***************************************************************************
 *   Copyright (C) 2011-2012 by Fabrizio Montesi <famontesi@gmail.com>     *
 *   Copyright (C) 2013-2014 by Saverio Giallorenzo <sgiallor@cs.unibo.it> *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU Library General Public License as       *
 *   published by the Free Software Foundation; either version 2 of the    *
 *   License, or (at your option) any later version.                       *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU Library General Public     *
 *   License along with this program; if not, write to the                 *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 *                                                                         *
 *   For details about the authors of this software, see the AUTHORS file. *
 ***************************************************************************/


package org.epp.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jolie.lang.parse.ast.OLSyntaxNode;
import jolie.lang.parse.ast.OneWayOperationDeclaration;
import jolie.lang.parse.ast.OperationDeclaration;
import jolie.lang.parse.ast.OutputPortInfo;
import org.epp.impl.merging.MergeUtils;
import org.epp.impl.merging.MergingException;

/**
 * Result of a thread endpoint projection.
 * 
 * This class offers methods for merging thread projections, and accessing
 * information such as the used input operations and their correlation sets.
 * 
 * @authors Fabrizio Montesi, Saverio Giallorenzo
 *
 */
public class ThreadProjectionResult
{
	// The projected Jolie abstract syntax node
	private OLSyntaxNode jolieNode;
	
	// Procedure projections: procedure name -> projection
	private Map< String, ThreadProjectionResult > procedureProjections = new HashMap< String, ThreadProjectionResult >();
	
	// { op | op is an operation without correlation set }
	private final Set< String > uncorrelatedInputOperations;
	
	// output port name -> output port
	private final Map< String, OutputPortInfo > outputPorts;
	
	// { s | s is a filename to be included at the beginning of the Jolie program }
	private final Set< String > includes;
	
	/**
	 * Constructor.
	 */
	public ThreadProjectionResult()
	{
		this.uncorrelatedInputOperations = new HashSet< String >();
		this.outputPorts = new HashMap< String, OutputPortInfo >();
		this.includes = new HashSet< String >();
	}
	
	public void addInclude( String include )
	{
		includes.add( include );
	}

	public Set< String > includes()
	{
		return includes;
	}
	
	public OLSyntaxNode jolieNode()
	{
		return jolieNode;
	}
	
	public Map< String, ThreadProjectionResult > procedureProjections()
	{
		return procedureProjections;
	}
	
	public void setJolieNode( OLSyntaxNode jolieNode )
	{
		this.jolieNode = jolieNode;
	}
	
	public Set< String > uncorrelatedInputOperations()
	{
		return uncorrelatedInputOperations;
	}
	
	public void addUncorrelatedInputOperation( String id ){
		uncorrelatedInputOperations.add( id );
	}
	
	public Map< String, OutputPortInfo > outputPorts()
	{
		return outputPorts;
	}

	public void addOWToOutputPort( String outputPortName, String operationName )
	{
		getOutputPort( outputPortName ).addOperation( 
				new OneWayOperationDeclaration( 
						JolieEppUtils.PARSING_CONTEXT, 
						operationName ) 
		);
	}
	
	public void addRRToOutputPort( String outputPortName, String operationName )
	{
		getOutputPort( outputPortName ).addOperation( JolieEppUtils.getMHOperationDeclaration( operationName ) );
	}
	
	public OutputPortInfo getOutputPort( String outputPortName )
	{
		OutputPortInfo port = outputPorts.get( outputPortName );
		if ( port == null ) {
			port = new OutputPortInfo( JolieEppUtils.PARSING_CONTEXT, outputPortName );
			port.setProtocolId( "sodep" );
			outputPorts.put( outputPortName, port );
		}
		return port;
	}
	
	public void addOutputPorts( Set< OutputPortInfo > ol ){
		if( ol != null ) {
			for( OutputPortInfo o : ol ){
				outputPorts.put( o.id(), o );
			}
		}
	}

	public void merge( ThreadProjectionResult other )
		throws MergingException
	{
		mergeNamesOnly( other );
		jolieNode = MergeUtils.optimizeAndMerge( jolieNode, other.jolieNode ).jolieNode();
	}
	
	public void mergeNamesOnly( ThreadProjectionResult other )
	{
		uncorrelatedInputOperations.addAll( other.uncorrelatedInputOperations );
		
		for( Map.Entry< String, OutputPortInfo > entry : other.outputPorts.entrySet() ) {
			for( OperationDeclaration opDecl : entry.getValue().operations() ) {
				if ( opDecl instanceof OneWayOperationDeclaration ) {
					addOWToOutputPort( entry.getKey(), opDecl.id() );
				} else {
					addRRToOutputPort( entry.getKey(), opDecl.id() );
				}
			}
		}
		includes.addAll( other.includes );
	}
}
