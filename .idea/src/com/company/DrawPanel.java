package com.company;
import javax.swing.*;
import java.awt.*;


public class DrawPanel extends JPanel {

    private Back back = new Back(new Color(94, 211, 185),
            new Color(244, 162, 102), 0, 0, 1000, 800);

    private Star star = new Star(0, 0, 1000, 100, 5, 5, Color.white);

    private Moon moon = new Moon(200, 100, new Color(244, 162, 102),
            new Color(94, 211, 185), 800, 300, 300);

    int[] xPointsMount = {300, 1000, 0};//координаты гор
    int[] yPointsMount = {600, 800, 650};
    int[] xPointsMount2 = {1000, 1000, 100};
    int[] yPointsMount2 = {500, 800, 800};
    int[] xPointsMount3 = {0, 1000, 0};
    int[] yPointsMount3 = {600, 800, 800};

    private Mountains mountains = new Mountains(xPointsMount, yPointsMount, xPointsMount2, yPointsMount2,
            xPointsMount3, yPointsMount3, 3, new Color(94, 211, 185), new Color(102, 58, 191),
            new Color(244, 162, 102), new Color(242, 208, 112), 800);

    int[] xPoints = {565, 615, 565}; //координаты флажка
    int[] yPoints = {190, 220, 250};

    private Castle castle = new Castle(350, 450, 80, 200, 5, xPoints, yPoints, 3, Color.white);

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        back.draw(gr);
        star.draw(gr);
        moon.draw(gr);
        castle.draw(gr);
        mountains.draw(gr);
    }

}
