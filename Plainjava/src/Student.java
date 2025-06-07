public class Student {
    private int id;
    private String name;
    private String room;

    public Student(int id, String name, String room) {
        this.id = id;
        this.name = name;
        this.room = room;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getRoom() { return room; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Room: " + room;
    }
}
