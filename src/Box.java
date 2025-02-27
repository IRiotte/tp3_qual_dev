import java.util.ArrayList;


class Thing{
    String name;
    public Thing(String name){
        this.name = name;
    }
}

class Box{

    ArrayList<Thing> contents = new ArrayList<Thing>();

    public void add(Thing truc) {
        this.contents.add(truc);
    }

}