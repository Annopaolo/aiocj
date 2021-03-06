/*
 * generated by Xtext
 */
package org.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.services.AiocGrammarAccess;

public class AiocParser extends AbstractContentAssistParser {
	
	@Inject
	private AiocGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.ui.contentassist.antlr.internal.InternalAiocParser createParser() {
		org.ui.contentassist.antlr.internal.InternalAiocParser result = new org.ui.contentassist.antlr.internal.InternalAiocParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAiocJAccess().getAlternatives(), "rule__AiocJ__Alternatives");
					put(grammarAccess.getWhereAccess().getAlternatives(), "rule__Where__Alternatives");
					put(grammarAccess.getWhereCompareConditionAccess().getAlternatives_3_0(), "rule__WhereCompareCondition__Alternatives_3_0");
					put(grammarAccess.getWhereExpressionBasicTermAccess().getAlternatives(), "rule__WhereExpressionBasicTerm__Alternatives");
					put(grammarAccess.getSeqBlockAccess().getEventAlternatives_0_0(), "rule__SeqBlock__EventAlternatives_0_0");
					put(grammarAccess.getLocalCodeAccess().getAlternatives(), "rule__LocalCode__Alternatives");
					put(grammarAccess.getLocalCodeAccess().getAlternatives_2_5(), "rule__LocalCode__Alternatives_2_5");
					put(grammarAccess.getSumExpressionTermAccess().getAlternatives(), "rule__SumExpressionTerm__Alternatives");
					put(grammarAccess.getExpressionBasicTermAccess().getAlternatives(), "rule__ExpressionBasicTerm__Alternatives");
					put(grammarAccess.getConstantAccess().getAlternatives(), "rule__Constant__Alternatives");
					put(grammarAccess.getConditionOperatorAccess().getAlternatives(), "rule__ConditionOperator__Alternatives");
					put(grammarAccess.getAiocAccess().getGroup(), "rule__Aioc__Group__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getRuleAccess().getGroup_3(), "rule__Rule__Group_3__0");
					put(grammarAccess.getNewRoleAccess().getGroup(), "rule__NewRole__Group__0");
					put(grammarAccess.getNewRoleAccess().getGroup_1(), "rule__NewRole__Group_1__0");
					put(grammarAccess.getWhereAccess().getGroup_1(), "rule__Where__Group_1__0");
					put(grammarAccess.getWhereCompareConditionAccess().getGroup(), "rule__WhereCompareCondition__Group__0");
					put(grammarAccess.getWhereCompareConditionAccess().getGroup_3(), "rule__WhereCompareCondition__Group_3__0");
					put(grammarAccess.getWhereExpressionBasicTermAccess().getGroup_0(), "rule__WhereExpressionBasicTerm__Group_0__0");
					put(grammarAccess.getWhereExpressionBasicTermAccess().getGroup_1(), "rule__WhereExpressionBasicTerm__Group_1__0");
					put(grammarAccess.getPreambleAccess().getGroup(), "rule__Preamble__Group__0");
					put(grammarAccess.getFunctionLocationAccess().getGroup(), "rule__FunctionLocation__Group__0");
					put(grammarAccess.getFunctionLocationAccess().getGroup_4(), "rule__FunctionLocation__Group_4__0");
					put(grammarAccess.getFunctionListAccess().getGroup(), "rule__FunctionList__Group__0");
					put(grammarAccess.getFunctionListAccess().getGroup_1(), "rule__FunctionList__Group_1__0");
					put(grammarAccess.getLocationDefinitionAccess().getGroup(), "rule__LocationDefinition__Group__0");
					put(grammarAccess.getChoreographyAccess().getGroup(), "rule__Choreography__Group__0");
					put(grammarAccess.getChoreographyAccess().getGroup_1(), "rule__Choreography__Group_1__0");
					put(grammarAccess.getSeqBlockAccess().getGroup(), "rule__SeqBlock__Group__0");
					put(grammarAccess.getSeqBlockAccess().getGroup_1(), "rule__SeqBlock__Group_1__0");
					put(grammarAccess.getInteractionAccess().getGroup(), "rule__Interaction__Group__0");
					put(grammarAccess.getLocalCodeAccess().getGroup_0(), "rule__LocalCode__Group_0__0");
					put(grammarAccess.getLocalCodeAccess().getGroup_1(), "rule__LocalCode__Group_1__0");
					put(grammarAccess.getLocalCodeAccess().getGroup_2(), "rule__LocalCode__Group_2__0");
					put(grammarAccess.getIfThenElseAccess().getGroup(), "rule__IfThenElse__Group__0");
					put(grammarAccess.getIfThenElseAccess().getGroup_0(), "rule__IfThenElse__Group_0__0");
					put(grammarAccess.getIfThenElseAccess().getGroup_10(), "rule__IfThenElse__Group_10__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getWhileAccess().getGroup_9(), "rule__While__Group_9__0");
					put(grammarAccess.getScopeAccess().getGroup(), "rule__Scope__Group__0");
					put(grammarAccess.getScopeAccess().getGroup_6(), "rule__Scope__Group_6__0");
					put(grammarAccess.getScopeAccess().getGroup_7(), "rule__Scope__Group_7__0");
					put(grammarAccess.getScopeAccess().getGroup_8(), "rule__Scope__Group_8__0");
					put(grammarAccess.getRolesAccess().getGroup(), "rule__Roles__Group__0");
					put(grammarAccess.getRolesAccess().getGroup_1(), "rule__Roles__Group_1__0");
					put(grammarAccess.getNestedChoreographyAccess().getGroup(), "rule__NestedChoreography__Group__0");
					put(grammarAccess.getAssignmentSetAccess().getGroup(), "rule__AssignmentSet__Group__0");
					put(grammarAccess.getAssignmentSetAccess().getGroup_1(), "rule__AssignmentSet__Group_1__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getSumExpressionAccess().getGroup(), "rule__SumExpression__Group__0");
					put(grammarAccess.getSumExpressionTermAccess().getGroup_0(), "rule__SumExpressionTerm__Group_0__0");
					put(grammarAccess.getSumExpressionTermAccess().getGroup_1(), "rule__SumExpressionTerm__Group_1__0");
					put(grammarAccess.getSumExpressionTermAccess().getGroup_2(), "rule__SumExpressionTerm__Group_2__0");
					put(grammarAccess.getSumExpressionTermAccess().getGroup_3(), "rule__SumExpressionTerm__Group_3__0");
					put(grammarAccess.getExpressionBasicTermAccess().getGroup_0(), "rule__ExpressionBasicTerm__Group_0__0");
					put(grammarAccess.getExpressionBasicTermAccess().getGroup_2(), "rule__ExpressionBasicTerm__Group_2__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getConditionAccess().getGroup_1(), "rule__Condition__Group_1__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup_2(), "rule__Function__Group_2__0");
					put(grammarAccess.getFunctionAccess().getGroup_2_1(), "rule__Function__Group_2_1__0");
					put(grammarAccess.getAiocJAccess().getAiocAssignment_0(), "rule__AiocJ__AiocAssignment_0");
					put(grammarAccess.getAiocJAccess().getRuleSetAssignment_1(), "rule__AiocJ__RuleSetAssignment_1");
					put(grammarAccess.getAiocAccess().getFunctionLocationAssignment_0(), "rule__Aioc__FunctionLocationAssignment_0");
					put(grammarAccess.getAiocAccess().getPreambleAssignment_3(), "rule__Aioc__PreambleAssignment_3");
					put(grammarAccess.getAiocAccess().getChoreographyAssignment_7(), "rule__Aioc__ChoreographyAssignment_7");
					put(grammarAccess.getRuleAccess().getFunctionLocationAssignment_2(), "rule__Rule__FunctionLocationAssignment_2");
					put(grammarAccess.getRuleAccess().getNewRolesAssignment_3_2(), "rule__Rule__NewRolesAssignment_3_2");
					put(grammarAccess.getRuleAccess().getLocDefinitionAssignment_4(), "rule__Rule__LocDefinitionAssignment_4");
					put(grammarAccess.getRuleAccess().getWhereAssignment_7(), "rule__Rule__WhereAssignment_7");
					put(grammarAccess.getRuleAccess().getChoreographyAssignment_11(), "rule__Rule__ChoreographyAssignment_11");
					put(grammarAccess.getNewRoleAccess().getRoleAssignment_0(), "rule__NewRole__RoleAssignment_0");
					put(grammarAccess.getNewRoleAccess().getNextRoleAssignment_1_1(), "rule__NewRole__NextRoleAssignment_1_1");
					put(grammarAccess.getWhereAccess().getWhereConditionAssignment_0(), "rule__Where__WhereConditionAssignment_0");
					put(grammarAccess.getWhereAccess().getParenAssignment_1_0(), "rule__Where__ParenAssignment_1_0");
					put(grammarAccess.getWhereAccess().getWhereConditionAssignment_1_1(), "rule__Where__WhereConditionAssignment_1_1");
					put(grammarAccess.getWhereCompareConditionAccess().getLeftAssignment_0(), "rule__WhereCompareCondition__LeftAssignment_0");
					put(grammarAccess.getWhereCompareConditionAccess().getOperatorAssignment_1(), "rule__WhereCompareCondition__OperatorAssignment_1");
					put(grammarAccess.getWhereCompareConditionAccess().getRightAssignment_2(), "rule__WhereCompareCondition__RightAssignment_2");
					put(grammarAccess.getWhereCompareConditionAccess().getAndAssignment_3_0_0(), "rule__WhereCompareCondition__AndAssignment_3_0_0");
					put(grammarAccess.getWhereCompareConditionAccess().getOrAssignment_3_0_1(), "rule__WhereCompareCondition__OrAssignment_3_0_1");
					put(grammarAccess.getWhereCompareConditionAccess().getNextAssignment_3_1(), "rule__WhereCompareCondition__NextAssignment_3_1");
					put(grammarAccess.getWhereExpressionBasicTermAccess().getNVariableAssignment_0_1(), "rule__WhereExpressionBasicTerm__NVariableAssignment_0_1");
					put(grammarAccess.getWhereExpressionBasicTermAccess().getEVariableAssignment_1_1(), "rule__WhereExpressionBasicTerm__EVariableAssignment_1_1");
					put(grammarAccess.getWhereExpressionBasicTermAccess().getSVariableAssignment_2(), "rule__WhereExpressionBasicTerm__SVariableAssignment_2");
					put(grammarAccess.getWhereExpressionBasicTermAccess().getConstantAssignment_3(), "rule__WhereExpressionBasicTerm__ConstantAssignment_3");
					put(grammarAccess.getPreambleAccess().getStarterAssignment_1(), "rule__Preamble__StarterAssignment_1");
					put(grammarAccess.getPreambleAccess().getLocDefinitionAssignment_2(), "rule__Preamble__LocDefinitionAssignment_2");
					put(grammarAccess.getFunctionLocationAccess().getFunctionsAssignment_1(), "rule__FunctionLocation__FunctionsAssignment_1");
					put(grammarAccess.getFunctionLocationAccess().getLocationAssignment_3(), "rule__FunctionLocation__LocationAssignment_3");
					put(grammarAccess.getFunctionLocationAccess().getProtocolAssignment_4_1(), "rule__FunctionLocation__ProtocolAssignment_4_1");
					put(grammarAccess.getFunctionListAccess().getFunctionNameAssignment_0(), "rule__FunctionList__FunctionNameAssignment_0");
					put(grammarAccess.getFunctionListAccess().getFunctionNameAssignment_1_1(), "rule__FunctionList__FunctionNameAssignment_1_1");
					put(grammarAccess.getLocationDefinitionAccess().getRoleAssignment_2(), "rule__LocationDefinition__RoleAssignment_2");
					put(grammarAccess.getLocationDefinitionAccess().getLocationAssignment_4(), "rule__LocationDefinition__LocationAssignment_4");
					put(grammarAccess.getLocationDefinitionAccess().getContinuationAssignment_5(), "rule__LocationDefinition__ContinuationAssignment_5");
					put(grammarAccess.getChoreographyAccess().getSeqBlockAssignment_0(), "rule__Choreography__SeqBlockAssignment_0");
					put(grammarAccess.getChoreographyAccess().getParAssignment_1_1(), "rule__Choreography__ParAssignment_1_1");
					put(grammarAccess.getSeqBlockAccess().getEventAssignment_0(), "rule__SeqBlock__EventAssignment_0");
					put(grammarAccess.getSeqBlockAccess().getNextAssignment_1_1(), "rule__SeqBlock__NextAssignment_1_1");
					put(grammarAccess.getSkipAccess().getSkipAssignment(), "rule__Skip__SkipAssignment");
					put(grammarAccess.getInteractionAccess().getOperationAssignment_0(), "rule__Interaction__OperationAssignment_0");
					put(grammarAccess.getInteractionAccess().getSenderAssignment_2(), "rule__Interaction__SenderAssignment_2");
					put(grammarAccess.getInteractionAccess().getSenderExpressionAssignment_4(), "rule__Interaction__SenderExpressionAssignment_4");
					put(grammarAccess.getInteractionAccess().getReceiverAssignment_7(), "rule__Interaction__ReceiverAssignment_7");
					put(grammarAccess.getInteractionAccess().getReceiverVariableAssignment_9(), "rule__Interaction__ReceiverVariableAssignment_9");
					put(grammarAccess.getLocalCodeAccess().getResultVariableAssignment_0_1(), "rule__LocalCode__ResultVariableAssignment_0_1");
					put(grammarAccess.getLocalCodeAccess().getThreadAssignment_0_3(), "rule__LocalCode__ThreadAssignment_0_3");
					put(grammarAccess.getLocalCodeAccess().getQuestionAssignment_0_7(), "rule__LocalCode__QuestionAssignment_0_7");
					put(grammarAccess.getLocalCodeAccess().getVariableAssignment_1_1(), "rule__LocalCode__VariableAssignment_1_1");
					put(grammarAccess.getLocalCodeAccess().getThreadAssignment_1_3(), "rule__LocalCode__ThreadAssignment_1_3");
					put(grammarAccess.getLocalCodeAccess().getExpressionAssignment_1_7(), "rule__LocalCode__ExpressionAssignment_1_7");
					put(grammarAccess.getLocalCodeAccess().getVariableAssignment_2_1(), "rule__LocalCode__VariableAssignment_2_1");
					put(grammarAccess.getLocalCodeAccess().getThreadAssignment_2_3(), "rule__LocalCode__ThreadAssignment_2_3");
					put(grammarAccess.getLocalCodeAccess().getExpressionAssignment_2_5_0(), "rule__LocalCode__ExpressionAssignment_2_5_0");
					put(grammarAccess.getLocalCodeAccess().getFunctionAssignment_2_5_1(), "rule__LocalCode__FunctionAssignment_2_5_1");
					put(grammarAccess.getIfThenElseAccess().getKeyAssignment_0_0(), "rule__IfThenElse__KeyAssignment_0_0");
					put(grammarAccess.getIfThenElseAccess().getConditionAssignment_3(), "rule__IfThenElse__ConditionAssignment_3");
					put(grammarAccess.getIfThenElseAccess().getThreadAssignment_6(), "rule__IfThenElse__ThreadAssignment_6");
					put(grammarAccess.getIfThenElseAccess().getThenAssignment_8(), "rule__IfThenElse__ThenAssignment_8");
					put(grammarAccess.getIfThenElseAccess().getElseAssignment_10_2(), "rule__IfThenElse__ElseAssignment_10_2");
					put(grammarAccess.getWhileAccess().getConditionAssignment_2(), "rule__While__ConditionAssignment_2");
					put(grammarAccess.getWhileAccess().getThreadAssignment_5(), "rule__While__ThreadAssignment_5");
					put(grammarAccess.getWhileAccess().getChoreographyAssignment_7(), "rule__While__ChoreographyAssignment_7");
					put(grammarAccess.getWhileAccess().getKeyAssignment_9_1(), "rule__While__KeyAssignment_9_1");
					put(grammarAccess.getScopeAccess().getThreadAssignment_2(), "rule__Scope__ThreadAssignment_2");
					put(grammarAccess.getScopeAccess().getChoreographyAssignment_4(), "rule__Scope__ChoreographyAssignment_4");
					put(grammarAccess.getScopeAccess().getPropertiesAssignment_6_2(), "rule__Scope__PropertiesAssignment_6_2");
					put(grammarAccess.getScopeAccess().getRolesAssignment_7_2(), "rule__Scope__RolesAssignment_7_2");
					put(grammarAccess.getScopeAccess().getKeyAssignment_8_1(), "rule__Scope__KeyAssignment_8_1");
					put(grammarAccess.getRolesAccess().getRolesAssignment_0(), "rule__Roles__RolesAssignment_0");
					put(grammarAccess.getRolesAccess().getRolesAssignment_1_1(), "rule__Roles__RolesAssignment_1_1");
					put(grammarAccess.getNestedChoreographyAccess().getChoreographyAssignment_1(), "rule__NestedChoreography__ChoreographyAssignment_1");
					put(grammarAccess.getAssignmentSetAccess().getAssignmentAssignment_0(), "rule__AssignmentSet__AssignmentAssignment_0");
					put(grammarAccess.getAssignmentSetAccess().getContinuationAssignment_1_1(), "rule__AssignmentSet__ContinuationAssignment_1_1");
					put(grammarAccess.getAssignmentAccess().getVariableAssignment_1(), "rule__Assignment__VariableAssignment_1");
					put(grammarAccess.getAssignmentAccess().getExpressionAssignment_3(), "rule__Assignment__ExpressionAssignment_3");
					put(grammarAccess.getExpressionAccess().getSumExpressionAssignment(), "rule__Expression__SumExpressionAssignment");
					put(grammarAccess.getSumExpressionAccess().getChildrenAssignment_0(), "rule__SumExpression__ChildrenAssignment_0");
					put(grammarAccess.getSumExpressionAccess().getChildrenAssignment_1(), "rule__SumExpression__ChildrenAssignment_1");
					put(grammarAccess.getSumExpressionTermAccess().getExpressionAssignment_0_2(), "rule__SumExpressionTerm__ExpressionAssignment_0_2");
					put(grammarAccess.getSumExpressionTermAccess().getExpressionAssignment_1_2(), "rule__SumExpressionTerm__ExpressionAssignment_1_2");
					put(grammarAccess.getSumExpressionTermAccess().getExpressionAssignment_2_2(), "rule__SumExpressionTerm__ExpressionAssignment_2_2");
					put(grammarAccess.getSumExpressionTermAccess().getExpressionAssignment_3_2(), "rule__SumExpressionTerm__ExpressionAssignment_3_2");
					put(grammarAccess.getExpressionBasicTermAccess().getNotAssignment_0_0(), "rule__ExpressionBasicTerm__NotAssignment_0_0");
					put(grammarAccess.getExpressionBasicTermAccess().getVariableAssignment_0_1(), "rule__ExpressionBasicTerm__VariableAssignment_0_1");
					put(grammarAccess.getExpressionBasicTermAccess().getConstantAssignment_1(), "rule__ExpressionBasicTerm__ConstantAssignment_1");
					put(grammarAccess.getExpressionBasicTermAccess().getConditionAssignment_2_1(), "rule__ExpressionBasicTerm__ConditionAssignment_2_1");
					put(grammarAccess.getConstantAccess().getIntValueAssignment_0(), "rule__Constant__IntValueAssignment_0");
					put(grammarAccess.getConstantAccess().getFloatValueAssignment_1(), "rule__Constant__FloatValueAssignment_1");
					put(grammarAccess.getConstantAccess().getStrValueAssignment_2(), "rule__Constant__StrValueAssignment_2");
					put(grammarAccess.getConstantAccess().getTrueAssignment_3(), "rule__Constant__TrueAssignment_3");
					put(grammarAccess.getConstantAccess().getFalseAssignment_4(), "rule__Constant__FalseAssignment_4");
					put(grammarAccess.getConditionAccess().getLeftAssignment_0(), "rule__Condition__LeftAssignment_0");
					put(grammarAccess.getConditionAccess().getOperatorAssignment_1_0(), "rule__Condition__OperatorAssignment_1_0");
					put(grammarAccess.getConditionAccess().getRightAssignment_1_1(), "rule__Condition__RightAssignment_1_1");
					put(grammarAccess.getConditionOperatorAccess().getLtAssignment_0(), "rule__ConditionOperator__LtAssignment_0");
					put(grammarAccess.getConditionOperatorAccess().getLeqAssignment_1(), "rule__ConditionOperator__LeqAssignment_1");
					put(grammarAccess.getConditionOperatorAccess().getEqualAssignment_2(), "rule__ConditionOperator__EqualAssignment_2");
					put(grammarAccess.getConditionOperatorAccess().getGtAssignment_3(), "rule__ConditionOperator__GtAssignment_3");
					put(grammarAccess.getConditionOperatorAccess().getGeqAssignment_4(), "rule__ConditionOperator__GeqAssignment_4");
					put(grammarAccess.getConditionOperatorAccess().getNot_equalAssignment_5(), "rule__ConditionOperator__Not_equalAssignment_5");
					put(grammarAccess.getConditionOperatorAccess().getAndAssignment_6(), "rule__ConditionOperator__AndAssignment_6");
					put(grammarAccess.getConditionOperatorAccess().getOrAssignment_7(), "rule__ConditionOperator__OrAssignment_7");
					put(grammarAccess.getFunctionAccess().getNameAssignment_0(), "rule__Function__NameAssignment_0");
					put(grammarAccess.getFunctionAccess().getParamsAssignment_2_0(), "rule__Function__ParamsAssignment_2_0");
					put(grammarAccess.getFunctionAccess().getParamsAssignment_2_1_1(), "rule__Function__ParamsAssignment_2_1_1");
					put(grammarAccess.getIntegerAccess().getValueAssignment(), "rule__Integer__ValueAssignment");
					put(grammarAccess.getFloatAccess().getValueAssignment(), "rule__Float__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.ui.contentassist.antlr.internal.InternalAiocParser typedParser = (org.ui.contentassist.antlr.internal.InternalAiocParser) parser;
			typedParser.entryRuleAiocJ();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AiocGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AiocGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
