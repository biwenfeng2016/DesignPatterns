package newInstance;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class CloneTest {

    @Test
    public  void CloneTest() throws IOException, CloneNotSupportedException {
        File file = new File("C:\\rrr.txt");
        Dog dog = new Dog();
        Cat cat = new Cat("小猫");
        dog.setFriend(cat);
        Dog cloneDog = (Dog) dog.clone();
        System.out.println(dog==cloneDog);
        dog.setName("泰迪");
        System.out.println(dog.getName());
        cat.setName("大猫");
        System.out.println(cloneDog.getName());
        System.out.println(cloneDog.getFriend().getName());

        MyFileInputStream myFileInputStream = new MyFileInputStream(file);
        MyFileInputStream myFileInputStream2 = new MyFileInputStream(file);
        MyFileInputStream cloneMyFileInputStream = (MyFileInputStream) myFileInputStream.clone();
        System.out.println( myFileInputStream.read());
        System.out.println( myFileInputStream.read());

        byte[] bytes = new byte[4];
        byte[] bytes1 = new byte[4];
        cloneMyFileInputStream.read(bytes);
        myFileInputStream2.read(bytes1);

        System.out.println(new String(bytes));
        System.out.println(new String(bytes1));

    }

}
