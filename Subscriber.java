
public class Subscriber implements SubscriberObserver {
    private String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }
    @Override
    public void update(Subscriber subscriber) {

    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }
    //Represents users or entities subscribed to the news service.
    //Subscribers receive immediate notifications about any breaking news published by the agency.
}
