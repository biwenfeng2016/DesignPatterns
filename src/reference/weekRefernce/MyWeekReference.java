package reference.weekRefernce;

import com.sun.org.apache.bcel.internal.generic.DUP;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public class MyWeekReference {

    public static void main(String[] args) throws InterruptedException {

        Duck duck = new Duck();
        Dog dog = new Dog(duck);
        dog.setFriendsForDuck();
        System.out.println("dog.getDuckFriend().getWeakChickenFriendName() = " + dog.getDuckFriend().getWeakChickenFriendName());
        System.out.println("dog.getDuckFriend().getStrongChickenFriendName() = " + dog.getDuckFriend().getStrongChickenFriendName());
        dog.eatChicken();
        System.gc();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("dog.getDuckFriend().getWeakChickenFriendName() = " + dog.getDuckFriend().getWeakChickenFriendName());
        System.out.println("dog.getDuckFriend().getStrongChickenFriendName() = " + dog.getDuckFriend().getStrongChickenFriendName());




    }

}

class Dog {

    Chicken kobe = new Chicken("kobe");
    Chicken bryant = new Chicken("bryant");
    WeakReference<Chicken>  weakChicken = new WeakReference<Chicken>(kobe);

    public Duck getDuckFriend() {
        return duckFriend;
    }

    Duck duckFriend;
    public Dog(Duck duckFriend){
       this.duckFriend=duckFriend;

    }



    public void eatChicken(){

        kobe=null;
        bryant=null;
    }

    public void setFriendsForDuck(){
        duckFriend.setWeakChickenFriend(weakChicken);
        duckFriend.setStrongChickenFriend(bryant);

    }


}

class Chicken {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Chicken(String name) {

        this.name=name;

    }
}

class Duck {

    private  Chicken strongChickenFriend ;

    private  WeakReference<Chicken>  weakChickenFriend;

    public void setWeakChickenFriend(WeakReference<Chicken> weakChickenFriend) {
        this.weakChickenFriend = weakChickenFriend;
    }

    public void setStrongChickenFriend(Chicken strongChickenFriend) {
        this.strongChickenFriend = strongChickenFriend;
    }



    public String getWeakChickenFriendName(){

        return weakChickenFriend.get()==null?"OMG, Kobe is Die, maybe eat by that dog":weakChickenFriend.get().getName();
    }

    public String getStrongChickenFriendName(){

        return strongChickenFriend==null?"OMG, Bryant is Die, maybe eat by that dog":strongChickenFriend.getName();
    }




}
