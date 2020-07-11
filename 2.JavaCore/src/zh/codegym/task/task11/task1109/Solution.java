package zh.codegym.task.task11.task1109;

/* 
猫狗示例
*/

public class Solution {

    public static void main(String[] args) {
        Cat cat = new Cat("奥斯卡", 5);
        Dog dog = new Dog("流浪者", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {

    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {

    private String name;
    private int speed;

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}


