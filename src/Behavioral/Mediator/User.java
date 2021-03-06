package Behavioral.Mediator;

/**
 * Created by cristiano on 07/02/17.
 *
 * Users can send and receive messages, so we can have User interface or abstract class.
 */
public abstract class User {

    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}