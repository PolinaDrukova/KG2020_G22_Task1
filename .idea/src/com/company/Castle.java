package com.company;

import java.awt.*;

public class Castle implements Drawable {
    private int x, y, width, height, width2, nPoints;
    private int[] xPoints, yPoints;
    private Color color;

    public Castle(int x, int y, int width, int height, int width2, int[] xPoints,
                  int[] yPoints, int nPoints, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.width2 = width2;
        this.height = height;
        this.xPoints = xPoints;
        this.yPoints = yPoints;
        this.nPoints = nPoints;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);

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
}