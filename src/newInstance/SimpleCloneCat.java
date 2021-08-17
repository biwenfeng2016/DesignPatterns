package newInstance;

public class SimpleCloneCat implements  Cloneable{

    private String name;

    public SimpleCloneCat(String name){

        this.name = name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // A simple clone for Cat class, and deep clone please see the Dog Class
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
