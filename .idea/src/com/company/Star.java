package com.company;

import java.awt.*;
import java.util.Random;

public class Star implements Drawable {
    private int x, y, width, n, width2, height2;
    private Color color;


    public Star(int x, int y, int width, int n, int width2, int height2, Color color) {
        this.x = x;
        this.y = y;
        this.n = n;
        this.width = width;
        this.width2 = width2;
        this.height2 = height2;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            g.fillOval(random.nextInt(width ) + x, random.nextInt(width ) + y, width2, height2);
        }
    }
}
