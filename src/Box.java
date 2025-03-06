import java.util.ArrayList;


class Thing{
    String name;
    int volume;

    public Thing(String name){
        this.name = name;
    }

    public Thing(int volume){
        this.volume = volume;
    }

    public int volume(){
        return this.volume;
    }
}

class Box{

    private ArrayList<Thing> contents = new ArrayList<Thing>();
    private boolean open = true;
    private int capacity = -1;

    public void add(Thing truc) {
        this.contents.add(truc);
    }

    public boolean estDans(Thing truc){
        return this.contents.contains(truc);
    }

    public boolean isOpen() {
        return open;
    }

    public void close() {
        open = false;
    }

    public void open() {
        open = true;
    }

    public void remove(Thing truc) {
        this.contents.remove(truc);
        //lever une exception si le truc n'est pas dans la boite
    }


    public String actionLook() {
        if (open) {
            String res = "la boite contient: ";
            for (Thing truc : this.contents) {
                res += truc.name + ", ";
            }
            return res;
            }
        return "la boite est fermee";
    }

    public int capacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean hasRoomFor(Thing truc) {
        if (capacity == -1) {
            return true;
        }
        int totalVolume = 0;
        for (Thing t : this.contents) {
            totalVolume += t.volume();
        }
        return totalVolume + truc.volume() <= capacity;
    }



}