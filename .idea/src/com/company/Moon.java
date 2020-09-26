package com.company;

import java.awt.*;

public class Moon implements Drawable {
    public int x, y, height, width2, height2;
    public Color color1, color2;

    public Moon(int x, int y, Color color1, Color color2, int height, int width2,
                int height2) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width2 = width2;
        this.height2 = height2;
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        GradientPaint gp2 = new GradientPaint(0, 0, color1, 0, height, color2);
        g.setColor(Color.WHITE);
        g.fillOval(x, y, width2, height2);
        g.setPaint(gp2);
        g.fillOval(x + 30, y, width2, height2);
    }
}

