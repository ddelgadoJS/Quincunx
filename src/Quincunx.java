import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;

public class Quincunx extends JApplet {

    Random r = new Random();
    boolean animationDone;
    boolean first = true; // If true first two objects are deleted.
    ArrayList<Ball> balls;
    ArrayList<Integer> stadistics = new ArrayList<>();    
    Image offimage;
    Graphics offg;
    int rows = Main.finalRows;
    
    // iIteration : index to start the for (statistics) depending of the rows.
    // iIteration2 : stop condition.
    int maxIndex, maxValue, finaly, finalx, iIteration, iIteration2;

    class Ball {
        Color color;
        int actualx, actualy, priorx, priory;
        int radius, row;

        Ball() {
            color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            actualx = 695;
            actualy = 29;
            priorx = 0;
            priory = 0;
        }

        void update() {
            priorx = actualx;
            priory = actualy;
            if (r.nextInt(2) == 0) {
                actualx -= 30;
            } else {
                actualx += 30;
            }
            actualy += 40;
            row++;
        }
    }

    private void statisticsUpdate(int x) { // x : position in x axis.
       if((Main.finalRows % 2) == 0){
            switch (x) {
                // Pares
                case 95:
                    stadistics.set(0, stadistics.get(0) + 1);
                    break;
                case 155:
                    stadistics.set(1, stadistics.get(1) + 1);
                    break;
                case 215:
                    stadistics.set(2, stadistics.get(2) + 1);
                    break;
                case 275:
                    stadistics.set(3, stadistics.get(3) + 1);
                    break;
                case 335:
                    stadistics.set(4, stadistics.get(4) + 1);
                    break;
                case 395:
                    stadistics.set(5, stadistics.get(5) + 1);
                    break;
                case 455:
                    stadistics.set(6, stadistics.get(6) + 1);
                    break;
                case 515:
                    stadistics.set(7, stadistics.get(7) + 1);
                    break;
                case 575:
                    stadistics.set(8, stadistics.get(8) + 1);
                    break;
                case 635:
                    stadistics.set(9, stadistics.get(9) + 1);
                    break;
                case 695:
                    stadistics.set(10, stadistics.get(10) + 1);
                    break;
                case 755:
                    stadistics.set(11, stadistics.get(11) + 1);
                    break;
                case 815:
                    stadistics.set(12, stadistics.get(12) + 1);
                    break;
                case 875:
                    stadistics.set(13, stadistics.get(13) + 1);
                    break;
                case 935:
                    stadistics.set(14, stadistics.get(14) + 1);
                    break;
                case 995:
                    stadistics.set(15, stadistics.get(15) + 1);
                    break;
                case 1055:
                    stadistics.set(16, stadistics.get(16) + 1);
                    break;
                case 1115:
                    stadistics.set(17, stadistics.get(17) + 1);
                    break;
                case 1175:
                    stadistics.set(18, stadistics.get(18) + 1);
                    break;
                case 1235:
                    stadistics.set(19, stadistics.get(19) + 1);
                    break;
                case 1295:
                    stadistics.set(20, stadistics.get(20) + 1);
                    break;
            }
        }
        else{
            switch (x) {
                case 125:
                    stadistics.set(0, stadistics.get(0) + 1);
                    break;
                case 185:
                    stadistics.set(1, stadistics.get(1) + 1);
                    break;    
                case 245:
                    stadistics.set(2, stadistics.get(2) + 1);
                    break;
                case 305:
                    stadistics.set(3, stadistics.get(3) + 1);
                    break;
                case 365:
                    stadistics.set(4, stadistics.get(4) + 1);
                    break;
                case 425:
                    stadistics.set(5, stadistics.get(5) + 1);
                    break;  
                case 485:
                    stadistics.set(6, stadistics.get(6) + 1);
                    break;
                case 545:
                    stadistics.set(7, stadistics.get(7) + 1);
                    break;    
                case 605:
                    stadistics.set(8, stadistics.get(8) + 1);
                    break;
                case 665:
                    stadistics.set(9, stadistics.get(9) + 1);
                    break;
                case 725:
                    stadistics.set(10, stadistics.get(10) + 1);
                    break;
                case 785://
                    stadistics.set(11, stadistics.get(11) + 1);
                    break;    
                case 845:
                    stadistics.set(12, stadistics.get(12) + 1);
                    break;
                case 905:
                    stadistics.set(13, stadistics.get(13) + 1);
                    break;
                case 965:
                    stadistics.set(14, stadistics.get(14) + 1);
                    break;
                case 1025:
                    stadistics.set(15, stadistics.get(15) + 1);
                    break;  
                case 1085:
                    stadistics.set(16, stadistics.get(16) + 1);
                    break;
                case 1145:
                    stadistics.set(17, stadistics.get(17) + 1);
                    break;    
                case 1205:
                    stadistics.set(18, stadistics.get(18) + 1);
                    break;
                case 1265:
                    stadistics.set(19, stadistics.get(19) + 1);
                    break;
            }
        }
    }

    private void indexIteration(){
        switch(Main.finalRows){
                case 2 :
                    iIteration = 9;
                    break;
                case 3 :
                    iIteration = 8;
                    break;
                case 4 :
                    iIteration = 8;
                    break;
                case 5 :
                    iIteration = 7;
                    break;
                case 6 :
                    iIteration = 7;
                    break;
                case 7 :
                    iIteration = 6;
                    break;
                case 8 :
                    iIteration = 6;
                    break;
                case 9 :
                    iIteration = 5;
                    break;
                case 10 :
                    iIteration = 5;
                    break;
                case 11 :
                    iIteration = 4;
                    break;
                case 12 :
                    iIteration = 4;
                    break;
                case 13 :
                    iIteration = 3;
                    break;
                case 14 :
                    iIteration = 3;
                    break;
                case 15 :
                    iIteration = 2;
                    break;
                case 16 :
                    iIteration = 2;
                    break;
                case 17 :
                    iIteration = 1;
                    break;
                case 18 :
                    iIteration = 1;
                    break;
                case 19 :
                    iIteration = 0;
                    break;
                case 20 :
                    iIteration = 0;
                    break;
                default :
                    iIteration = iIteration2 = 0;
            }
        if((Main.finalRows % 2) == 0) iIteration2 = 20 - iIteration;
        else iIteration2 = 19 - iIteration;
    }
    
    public void init() {
        // Initialice stadistics array.
        for (int i = 0; i < 21; i++) {
            stadistics.add(0);
        }

        resize(1400, 1150);
        // For the stadistics chart.
        maxIndex = 0;
        maxValue = 1;
        finaly = 29 + (40 * Main.finalRows - 1);
        finalx = 695 - (30 * Main.finalRows);
        balls = new ArrayList<Ball>();
        balls.add(new Ball());
        new Thread() {
            public void run() {
                while (!animationDone) {
                    updateAnimation();
                    repaint();
                    delayAnimation();
                }
            }
        }.start();
    }

    public void updateAnimation() {
        balls.add(new Ball());
        if (first == true) {
            balls.remove(0);
            balls.remove(0);
            first = false;
        }
    }

    public void delayAnimation() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Quincunx.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void paint(Graphics g) {
        update(g);
    }

    public void update(Graphics g) {
        // Painted only one time.
        if (offimage == null) {
            offimage = createImage(getWidth(), getHeight());
            offg = offimage.getGraphics();

            // Background
            offg.setColor(Color.BLACK);
            offg.fillRect(0, 0, 1400, 1150);

            // Triangle        
            offg.setColor(new Color(252,90,184));
            // Initial values.
            int x = 695;
            int y = 50;
            int x_temp;
            for (int i = 0; i <= Main.finalRows - 1; i++) {
                x_temp = x;
                for (int j = 0; j < i + 1; j++) {
                    offg.drawLine(x_temp, y, x_temp + 20, y);
                    x_temp += 60;
                }
                x -= 30;
                y += 40;
            }
        }
        
        // Painted in every iteration.
        if (balls.size() == Main.finalRows + 1) { 
            // Stadistics
            statisticsUpdate(balls.get(0).actualx); // Update stadistics.
            
            for(int i = 0; i < 21; i++) {
                if (maxValue < stadistics.get(i)) {
                    maxValue = stadistics.get(i);
                    maxIndex = i;
                }
            }
            int x2 = finalx - 7;
            indexIteration(); // Updates iTeration & iIteration2 for the for cicle.
            
            for (; iIteration <= iIteration2; iIteration++) { //0 , mainrows3 + 1
                // Erasing
                offg.setColor(Color.BLACK);
                offg.fillRect(x2, finaly + 7, 33, 190);
                if(stadistics.get(iIteration) > 0){
                    // Painting
                    offg.setColor(new Color(21, 244, 238)); // 53,252,127, 
                    offg.fillRect(x2, finaly + 7, 33, ((stadistics.get(iIteration) * 190) / maxValue));
                }
                x2 += 60;
            }
            
            String count;
            int x = finalx + 5;
            indexIteration();
            
            // Erasing all the stadistics.
            offg.setColor(Color.BLACK);
            offg.fillRect(x - 15, finaly - 13, 1250, 20);
            // Painting all the stadistics.
            for (; iIteration <= iIteration2; iIteration++) {
                if(stadistics.get(iIteration) > 0) {
                    count = Integer.toString(stadistics.get(iIteration));             
                    offg.setColor(Color.WHITE);
                    offg.drawString(count, x, finaly + 2);
                }
                x += 60;
            }
            // Erasing balls in last row.
            offg.setColor(Color.BLACK);
            offg.fillOval(balls.get(0).priorx, balls.get(0).priory, 20, 20);
            balls.remove(0);
        }       
        
        for (Ball c : balls) {
            // Erasing
            offg.setColor(Color.BLACK);
            offg.fillOval(c.priorx, c.priory, 20, 20);
            // Painting
            offg.setColor(c.color);
            offg.fillOval(c.actualx, c.actualy, 20, 20);
            c.update();
        }
        g.drawImage(offimage, 0, 0, this);
    }
}
