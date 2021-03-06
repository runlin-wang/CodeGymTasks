package zh.codegym.task.task05.task0505;

/* 
猫类大屠杀
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("小猫咪", 5, 3, 5);
        Cat cat2 = new Cat("小猫咪", 3, 1, 2);
        Cat cat3 = new Cat("小猫咪", 1, 2, 3);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
