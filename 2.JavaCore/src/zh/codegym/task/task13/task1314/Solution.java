package zh.codegym.task.task13.task1314;

import java.awt.*;

/* 
大狐狸还是狐狸
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "狐狸";
        }
    }

    public static class BigFox extends Fox {
//        public Color() {
//            return Color.GRAY;
//        }

        @Override
        public Color getColor() {
            return null;
        }
    }
}
