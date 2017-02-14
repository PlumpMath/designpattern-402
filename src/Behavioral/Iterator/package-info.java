/**
 * Created by cristiano on 08/02/17.
 * Iterator:
 *
 * "Provides a way to access the elements of an aggregate object without exposing its underlying representation."
 *
 * Iterator pattern is not only about traversing through a collection, we can provide different kind of iterators
 * based on our requirements.
 *
 * Iterator design pattern hides the actual implementation of traversal through the collection and client
 * programs just use iterator methods.
 *
 *
 * Iterator Pattern Example:
 *
 * Let’s understand iterator pattern with a simple example.
 * Suppose we have a list of Radio channels and the client program want to traverse through them one by one
 * or based on the type of channel.
 * For example some client programs are only interested in English channels and want to process only them,
 * they don’t want to process other types of channels.
 *
 * So we can provide a collection of channels to the client and let them write the logic to traverse
 * through the channels and decide whether to process them.
 * But this solution has lots of issues such as client has to come up with the logic for traversal.
 * We can’t make sure that client logic is correct.
 * Furthermore if the number of client grows then it will become very hard to maintain.
 *
 * Here we can use Iterator pattern and provide iteration based on type of channel.
 * We should make sure that client program can access the list of channels only through the iterator.
 */
package Behavioral.Iterator;