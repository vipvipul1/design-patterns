package observer.example.amazon.products;

import observer.example.amazon.publishers.EventManager;

public class IPhone15 {
    private boolean isLaunched;
    private int stockCount;
    private EventManager eventManager;

    public boolean isLaunched() {
        return isLaunched;
    }

    public void setLaunched(boolean launched) {
        boolean prevLaunchVal = this.isLaunched;
        this.isLaunched = launched;
        // making sure that isLaunched was false before update
        if (!prevLaunchVal && launched) {
            eventManager.notify(this.getClass().getSimpleName(), "launch", 1);
        }
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount += stockCount;
        // making sure that stock count was 0 before update
        if (this.stockCount == stockCount) {
            eventManager.notify( this.getClass().getSimpleName(), "available", this.stockCount);
        }
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }
}