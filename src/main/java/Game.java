import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Game {


    public static ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

    public static class GameObject {

        private String image;
        private String name;
        private int posX;
        private int posY;
        private int energy;


        public GameObject(String image, int posX, int posY, int energy) {
            this.image = image;
            this.posX = posX;
            this.posY = posY;
            this.energy = energy;
        }


        public GameObject(String image, String name, int posX, int posY, int energy) {
            this.image = image;
            this.name = name;
            this.posX = posX;
            this.posY = posY;
            this.energy = energy;
        }

        public void move(int deltaX, int deltaY) {
            posX += deltaX;
            posY += deltaY;
            energy -= (Math.abs(deltaX) + Math.abs(deltaY));


        }

        public void move(int deltaX, int deltaY, boolean isJump) {
            move(deltaX, deltaY);
            if (isJump == true) {
                energy -= (Math.abs(deltaX) + Math.abs(deltaY));
            }

        }


    }


    public static class Player extends GameObject {

        public Player(String image, String name, int posX, int posY, int energy) {
            super(image, name, posX, posY, energy);
        }
    }


    public static class Three extends GameObject {

        public Three(String image, int posX, int posY, int energy) {
            super(image, posX, posY, energy);

        }

    }



    public static class World extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (GameObject obj : gameObjects) {
                g.drawString(obj.image, obj.posX, obj.posY);
            }
        }
    }










    public static void main(String[] args) {

        GameObject player = new Player("@","Именованный Баклан", 10,10, 10000);
        GameObject three0 = new  Three("^",0 + (int)(Math.random() * 500), 0 + (int)(Math.random() * 500),300);
        GameObject three1 = new Three("^",0 + (int)(Math.random() * 500), 0 + (int)(Math.random() * 500),300);
        GameObject three2 = new Three("^",0 + (int)(Math.random() * 500), 0 + (int)(Math.random() * 500),300);
        GameObject three3 = new Three("^",0 + (int)(Math.random() * 500), 0 + (int)(Math.random() * 500),300);
        GameObject three4 = new Three("^",0 + (int)(Math.random() * 500), 0 + (int)(Math.random() * 500),300);
        GameObject three5 = new Three("^",0 + (int)(Math.random() * 500), 0 + (int)(Math.random() * 500),300);
        GameObject three6 = new Three("^",0 + (int)(Math.random() * 500), 0 + (int)(Math.random() * 500),300);
        GameObject three7 = new Three("^",0 + (int)(Math.random() * 500), 0 + (int)(Math.random() * 500),300);
        GameObject three8 = new Three("^",0 + (int)(Math.random() * 500), 0 + (int)(Math.random() * 500),300);
        GameObject three9 = new Three("^",0 + (int)(Math.random() * 500), 0 + (int)(Math.random() * 500),300);
        GameObject three10 = new Three("^",0 + (int)(Math.random() * 500), 0 + (int)(Math.random() * 500),300);
        gameObjects.add(player);
        gameObjects.add(three0);
        gameObjects.add(three1);
        gameObjects.add(three2);
        gameObjects.add(three3);
        gameObjects.add(three4);
        gameObjects.add(three5);
        gameObjects.add(three6);
        gameObjects.add(three7);
        gameObjects.add(three8);
        gameObjects.add(three9);
        gameObjects.add(three10);


        JFrame window = new JFrame("Game");
        World world = new World();
        window.setContentPane(world);
        window.setSize(500, 500);

        window.setVisible(true);





    }
}
