package com.company;

import java.awt.*;

public class Back implements Drawable {
    private int x, y, width, height;
    private Color color1, color2;

    public Back(Color color1, Color color2, int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color1 = color1;
        this.color2 = color2;
    }
    @Override
    public void draw(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        GradientPaint gp2 = new GradientPaint(0, 0, color2, 0, height, color1);
        g.setPaint(gp2);
        g.fillRect(x, y, width, height);
    }

}