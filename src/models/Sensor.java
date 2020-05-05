
package models;

/**
 *
 * @author Damish
 */
public class Sensor {
    
   public String id;
   public int co2Level;
   public int smokeLevel;
   public int floor;
   public int room;

    public Sensor(){
    
    }
   
    public Sensor(String id, int co2Level, int smokeLevel, int floor, int room) {
        this.id = id;
        this.co2Level = co2Level;
        this.smokeLevel = smokeLevel;
        this.floor = floor;
        this.room = room;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCo2Level() {
        return co2Level;
    }

    public void setCo2Level(int co2Level) {
        this.co2Level = co2Level;
    }

    public int getSmokeLevel() {
        return smokeLevel;
    }

    public void setSmokeLevel(int smokeLevel) {
        this.smokeLevel = smokeLevel;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
    
    
    
    
}
