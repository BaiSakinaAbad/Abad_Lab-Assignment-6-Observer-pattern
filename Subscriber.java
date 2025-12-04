
public class Subscriber implements SubscriberObserver {
    private String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }
    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }
    @Override
    public void update(Subscriber subscriber) {

    }
    //Represents users or entities subscribed to the news service.
    //Subscribers receive immediate notifications about any breaking news published by the agency.
}
