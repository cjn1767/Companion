package student.application.lhu_companion_2.responses;

import student.application.lhu_companion_2.models.Events;


public class LoadInitialData {

    Events[] eventName, host, location, time, description;

    public Events[] getEventName() {
        return eventName;
    }

    public void setEventName(Events[] events) {
        this.eventName = eventName;
    }

    public Events[] getHost() {
        return host;
    }

    public void setHost(Events[] events) {
        this.host = host;
    }

    public Events[] getLocation() {
        return location;
    }

    public void setLocation(Events[] events) {
        this.location = location;
    }

    public Events[] getTime() {
        return time;
    }

    public void setTime(Events[] events) {
        this.time = time;
    }

    public Events[] getDescription() {
        return description;
    }

    public void setDescription(Events[] events) {
        this.description = description;
    }


}
