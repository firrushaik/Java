Life Cycle Of A Thread :

The life cycle of a thread in Java consists of several distinct states a thread goes through from creation to termination. 
These states are:

New: A thread is created but not yet started. It remains in the new state until the start() method is called.
Runnable: After calling start(), the thread moves to the runnable state. It is now ready to run and waiting for CPU time.
Running: When the thread scheduler picks the thread, it transitions from runnable to running and executes the run() method.
Blocked/Waiting: A thread enters this state if it tries to access a resource locked by another thread or calls wait(), join(), or sleep(). It waits until the resource becomes available, or the wait time elapses.Timed 
Waiting: The thread waits for a specified time interval before becoming runnable again (e.g., during sleep or timed wait).
Terminated (Dead): A thread enters this state once it completes execution or is explicitly stopped. It can no longer be restarted.