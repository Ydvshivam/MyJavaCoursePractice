/*
Multitasking is proccess of multiple tasks simultaneously
1.Proccess basess multitasking or multiprocessing
2.Thread based multitasking or multithreading

1.Mulitasking or proccesed based

d.In case of process based multitasking each process has address in memory in otherr words each process allocating with the separte memory area.
a. Process based multitasking having heavy weight, beacuase swtichng from one process to onther process requres time, each process will be aloccated with separete memory area.
b.Coast of communication between is high

2.Thread based multitasking or mulithreading

a.All the thread shares the same memory area, a thread is light weight and process is heavy weight beacuse in process there is separet memeory
b.Thread is light weight

Note: At least one process is requred for each thread, multithreading in java is process of executing multithread simultaneously

*By default java program is execute by only one thread that is called main thread or one thread or single thread
Main thread will be started by the JVM.

/*There are two ways to create thread in java 
1st. One is extendign thread claass 
2sd. By implenting runover interface
*/

There is concept called 
Whatever the new thread created by the user should be register with the thread sechedular.
It is taking care of scheduling process time of all the register thread




