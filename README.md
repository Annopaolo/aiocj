This is a branch of the [AIOCJ development framework](http://www.cs.unibo.it/projects/jolie/aiocj.html) dedicated to non-adaptive possibilities; the master repository  can be found [here](https://github.com/thesave/aiocj).
For choreographies that do not use the _adaptation middleware_ of the framework, here it is removed resulting in a significative improvement in execution speed (see the comparison below).

Benchmark
---

The speed of execution was measured by running a choreography composed of 10*_n_ messages, 1 ≤ _n_ ≤ 10, five times for each _n_. Graphs below show the mean of the results for each choreography. Test were run both in the case of sequential and parallel execution. The source code used for benchmarking can be found at the [benchmark](https://github.com/Annopaolo/aiocj/tree/master/benchmark "aiocj/benchmark") directory.
The machine on which tests were run has the following specifications:
* CPU: Intel® Core™ i7-4710HQ CPU @ 2.50GHz × 8
* SO: Ubuntu 17.10 64-bit
* RAM: 8 GB
* Java version: 1.8.0_77
* Jolie version: Jolie 1.6.3 beta

![alt text](https://github.com/Annopaolo/aiocj/blob/master/benchmark/benchmark_sequential.png "Sequential execution")
![alt text](https://github.com/Annopaolo/aiocj/blob/master/benchmark/benchmark_parallel.png "Parallel execution")

AIOCJ is released under the GNU Lesser General Public License v2.1.
