/**
 * Created by cristiano on 08/02/17.
 *
 * Memento design pattern is one of the behavioral design pattern.
 * Memento design pattern is used when we want to save the state of an object so that
 * we can restore later on.
 * Memento pattern is used to implement this in such a way that the saved state data
 * of the object is not accessible outside of the object,
 * this protects the integrity of saved state data.
 *
 * Memento design pattern is implemented with two objects – Originator and Caretaker.
 *
 * Originator is the object whose state needs to be saved and restored and it uses
 * an inner class to save the state of Object.
 * The inner class is called Memento and it’s private, so that it can’t
 * be accessed from other objects.
 *
 * Caretaker is the helper class that is responsible for storing and restoring
 * the Originator’s state through Memento object.
 * Since Memento is private to Originator, Caretaker can’t access it and it’s stored
 * as an Object within the caretaker.
 *
 *
 *
 * Example: One of the best real life example is the text editors where we can
 *          save it’s data anytime and use undo to restore it to previous saved state.
 */
package Behavioral.Memento;