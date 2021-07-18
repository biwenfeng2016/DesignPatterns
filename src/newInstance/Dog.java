package newInstance;

public class Dog implements Cloneable {


    private String name;

    private Cat friend;

    public Dog() {

    }

    // this is deep clone, clone Dog and the reference data Cat
    @Override // Because the clone method in Object is Protect, so need override that can be use in this class.
    protected Object clone() throws CloneNotSupportedException {
        Cat cloneCat = (Cat) this.friend.clone();
        Dog clone = (Dog) super.clone();
        clone.setFriend(cloneCat);
        return clone;
    }

    public Dog(String dogName) {
        this.name = dogName;

    }

    public void spellName() {
        System.out.print(name);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getFriend() {
        return friend;
    }

    public void setFriend(Cat friend) {
        this.friend = friend;
    }
}
