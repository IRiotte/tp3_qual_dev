import org.junit.*;
import static org.junit.Assert.assertEquals;
    public class TestsBoxes{

        
    @Test
    public void testBoxCreate() {
        
    }

    /** on veut pouvoir mettre des trucs dedans */
    @Test
    public void testBoxAdd(){
        Box b = new Box();
        b.add(new Thing("truc1"));
        b.add(new Thing("truc2"));
    }

    // on veut pouvoir vérifier si un truc est dans la boite
    @Test
    public void testBoxContains(){
        Box b = new Box();
        Thing t = new Thing("truc1");
        b.add(t);
        assertEquals(true, b.estDans(t));
    }

    // on veut pouvoir ouvrir et fermer la boite
    @Test
    public void testBoxOpenClose(){
        Box b = new Box();
        assertEquals(true, b.isOpen());
        b.close();
        assertEquals(false, b.isOpen());
        b.open();
        assertEquals(true, b.isOpen());
    }

    // on veut pouvoir enlever un truc de la boite
    @Test
    public void testBoxRemove(){
        Box b = new Box();
        Thing t = new Thing("truc1");
        b.add(t);
        b.remove(t);
        assertEquals(false, b.estDans(t));
    }

    // on veut pouvoir regarder dans la boite
    @Test
    public void testBoxLook(){
        Box b = new Box();
        Thing t = new Thing("truc1");
        b.add(t);
        assertEquals("la boite contient: truc1, ", b.actionLook());
        b.close();
        assertEquals("la boite est fermee", b.actionLook());
    }


    @Test
    public void testThingBoxVolumeCapacity(){
        Box b = new Box();
        Thing t = new Thing(3);
        assertEquals(3, t.volume());
        assertEquals(-1, b.capacity());
        b.setCapacity(5);
        assertEquals(5, b.capacity());
    }


    @Test
    public void testBoxHasRoomFor() {
        Box b = new Box();
        b.setCapacity(10);
        Thing t1 = new Thing(3);
        Thing t2 = new Thing(7);
        Thing t3 = new Thing(1);
        
        assertEquals(true, b.hasRoomFor(t1));
        b.add(t1);
        assertEquals(true, b.hasRoomFor(t2));
        b.add(t2);
        assertEquals(false, b.hasRoomFor(t3));
    }


};