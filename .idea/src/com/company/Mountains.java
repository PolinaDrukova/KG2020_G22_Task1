package com.company;

import java.awt.*;

public class Mountains implements Drawable {
    private int[] xPointsMount, yPointsMount, xPointsMount2, yPointsMount2, xPointsMount3, yPointsMount3;
    private int nPoints, height;
    private Color color1, color2, color3, color4;

    public Mountains(int[] xPointsMount, int[] yPointsMount, int[] xPointsMount2,
                     int[] yPointsMount2,
                     int[] xPointsMount3, int[] yPointsMount3, int nPoints, Color color1, Color color2,
                     Color color3, Color color4, int height) {
        this.xPointsMount = xPointsMount;
        this.xPointsMount2 = xPointsMount2;
        this.xPointsMount3 = xPointsMount3;
        this.yPointsMount = yPointsMount;
        this.yPointsMount2 = yPointsMount2;
        this.yPointsMount3 = yPointsMount3;
        this.nPoints = nPoints;
        this.height = height;
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.color4 = color4;
    }

    @Override
    public void draw(Graphics2D g) {
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
}