package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        Color color1 = new Color(102, 58, 191);//используемые цвета
        Color color2 = new Color(94, 211, 185);
        Color color3 = new Color(244, 162, 102);
        Color color4 = new Color(242, 208, 112);

        int[] xPoints = {565, 615, 565}; //координаты флажка
        int[] yPoints = {190, 220, 250};

        int[] xPointsMount = {300, 1000, 0};//координаты гор
        int[] yPointsMount = {600, 800, 650};
        int[] xPointsMount2 = {1000, 1000, 100};
        int[] yPointsMount2 = {500, 800, 800};
        int[] xPointsMount3 = {0, 1000, 0};
        int[] yPointsMount3 = {600, 800, 800};


        back(gr, color2, color3, 0, 0, getWidth(), getHeight());
        star(gr, 0, 0, getWidth(), 100, 5, 5);
        castle(gr, 350, 450, 80, 200, 5, xPoints, yPoints, 3);
        mountains(gr, xPointsMount, yPointsMount, xPointsMount2, yPointsMount2, xPointsMount3, yPointsMount3,
                3, color2, color1, color3, color4, getHeight(), 4);

        moon(gr, 200, 100, color3, color2, getHeight(), 300, 300);
    }

    public static void back(Graphics2D gr, Color color2, Color color3, int x, int y, int width, int height) {
        gr.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        GradientPaint gp2 = new GradientPaint(0, 0, color3, 0, height, color2);
        gr.setPaint(gp2);
        gr.fillRect(x, y, width, height);
    }

    public static void star(Graphics2D g, int x, int y, int width, int n, int width2, int height2) {
        g.setColor(Color.WHITE);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            g.fillOval(random.nextInt(width) + x, random.nextInt(width) + y, width2, height2);
        }
    }

    public static void castle(Graphics2D g, int x, int y, int width, int height, int width2, int[] xPoints, int[] yPoints, int nPoints) {
        g.setColor(Color.white);

        g.fillRect(x, y, width, height);
        int i = 1;
        while (i <= width / (2 * width2)) {
            g.fillRect(x - width2 * 2 + i * 10, y - width2 * 2, width2, width2 * 2);
            i++;
        }

        g.fillRect(x + 80, y + 50, width + 20, height);
        g.fillRect(x + 180, y - 50, width - 10, height + 200);

        i = 1;
        while (i <= (width - 10) / (2 * width2)) {
            g.fillRect(x + 180 - width2 * 2 + i * 10, y - 50 - width2 * 2, width2, width2 * 2);
            i++;
        }

        g.setStroke(new BasicStroke(5.0f));
        g.drawLine(x + 215, y - 50, x + 215, y - 200);

        Polygon polygon = new Polygon(xPoints, yPoints, nPoints);
        g.setPaint(Color.red);
        g.fillPolygon(polygon);


    }

    public static void mountains(Graphics2D g, int[] xPointsMount, int[] yPointsMount, int[] xPointsMount2, int[] yPointsMount2,
                                 int[] xPointsMount3, int[] yPointsMount3, int nPoints, Color color1, Color color2,
                                 Color color3, Color color4, int height, int n) {
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        GradientPaint gp1 = new GradientPaint(0, 0, color2, 0, height, color1);
        GradientPaint gp2 = new GradientPaint(0, 0, color2, 0, height, color3);
        GradientPaint gp3 = new GradientPaint(0, 0, color4, 0, height, color3);

        Polygon polygon = new Polygon(xPointsMount, yPointsMount, nPoints);
        Polygon polygon2 = new Polygon(xPointsMount2, yPointsMount2, nPoints);
        Polygon polygon3 = new Polygon(xPointsMount3, yPointsMount3, nPoints);

        g.setPaint(gp1);
        g.fillPolygon(polygon);
        g.setPaint(gp2);
        g.fillPolygon(polygon2);
        g.setPaint(gp3);
        g.fillPolygon(polygon3);

    }

    public static void moon(Graphics2D g, int x, int y, Color color1, Color color2, int height, int width2, int height2) {
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        GradientPaint gp2 = new GradientPaint(0, 0, color1, 0, height, color2);
        g.setColor(Color.WHITE);
        g.fillOval(x, y, width2, height2);
        g.setPaint(gp2);
        g.fillOval(x + 30, y, width2, height2);
    }

}