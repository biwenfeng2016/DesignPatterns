package newInstance;

public class DeepCloneDog implements Cloneable {


    private String name;

    private SimpleCloneCat friend;

    public DeepCloneDog() {

    }

    // this is deep clone, clone Dog and the reference data Cat
    @Override // Because the clone method in Object is Protect, so need override that can be use in this class.
    protected Object clone() throws CloneNotSupportedException {
        SimpleCloneCat cloneCat = (SimpleCloneCat) this.friend.clone();
        DeepCloneDog clone = (DeepCloneDog) super.clone();
        clone.setFriend(cloneCat);
        return clone;
    }

    public DeepCloneDog(String dogName) {
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

    public SimpleCloneCat getFriend() {
        return friend;
    }

    public void setFriend(SimpleCloneCat friend) {
        this.friend = friend;
    }
}
