package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_wsf implements ResizableIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
transformsStack.push(g.getTransform());
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.2, 40.4);
generalPath.lineTo(43.1, 40.4);
generalPath.lineTo(43.1, 43.600002);
generalPath.lineTo(30.2, 43.600002);
generalPath.lineTo(30.2, 40.4);
generalPath.closePath();
generalPath.moveTo(30.2, 46.800003);
generalPath.lineTo(43.1, 46.800003);
generalPath.lineTo(43.1, 50.0);
generalPath.lineTo(30.2, 50.0);
generalPath.lineTo(30.2, 46.8);
generalPath.closePath();
generalPath.moveTo(30.2, 53.300003);
generalPath.lineTo(43.1, 53.300003);
generalPath.lineTo(43.1, 56.500004);
generalPath.lineTo(30.2, 56.500004);
generalPath.lineTo(30.2, 53.300003);
generalPath.closePath();
generalPath.moveTo(52.800003, 24.200003);
generalPath.lineTo(26.9, 24.200003);
generalPath.curveTo(23.3, 24.200003, 20.4, 27.100002, 20.4, 30.700003);
generalPath.lineTo(20.4, 59.800003);
generalPath.lineTo(14.0, 59.800003);
generalPath.curveTo(14.0, 63.4, 16.9, 66.3, 20.5, 66.3);
generalPath.lineTo(46.3, 66.3);
generalPath.curveTo(49.899998, 66.3, 52.8, 63.4, 52.8, 59.800003);
generalPath.lineTo(52.8, 33.9);
generalPath.lineTo(59.3, 33.9);
generalPath.lineTo(59.3, 30.7);
generalPath.curveTo(59.2, 27.1, 56.399998, 24.2, 52.8, 24.2);
generalPath.closePath();
generalPath.moveTo(49.600002, 59.200005);
generalPath.curveTo(49.600002, 61.300003, 47.9, 63.000004, 45.800003, 63.000004);
generalPath.lineTo(22.1, 63.000004);
generalPath.curveTo(23.7, 61.900005, 23.7, 59.800003, 23.7, 59.800003);
generalPath.lineTo(23.7, 30.7);
generalPath.curveTo(23.7, 28.900002, 25.1, 27.5, 26.900002, 27.5);
generalPath.curveTo(28.7, 27.5, 30.100002, 28.9, 30.100002, 30.7);
generalPath.lineTo(30.100002, 33.9);
generalPath.lineTo(49.5, 33.9);
generalPath.lineTo(49.5, 59.2);
generalPath.closePath();
generalPath.moveTo(33.4, 30.7);
generalPath.lineTo(33.4, 27.5);
generalPath.lineTo(52.800003, 27.5);
generalPath.curveTo(55.700005, 27.5, 56.000004, 29.3, 56.000004, 30.7);
generalPath.lineTo(33.4, 30.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 66.23100280761719), new Point2D.Double(36.63199996948242, 24.231000900268555), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 66.60600280761719), new Point2D.Double(36.63199996948242, 23.856000900268555), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.2, 40.4);
generalPath.lineTo(43.1, 40.4);
generalPath.lineTo(43.1, 43.600002);
generalPath.lineTo(30.2, 43.600002);
generalPath.lineTo(30.2, 40.4);
generalPath.closePath();
generalPath.moveTo(30.2, 46.800003);
generalPath.lineTo(43.1, 46.800003);
generalPath.lineTo(43.1, 50.0);
generalPath.lineTo(30.2, 50.0);
generalPath.lineTo(30.2, 46.8);
generalPath.closePath();
generalPath.moveTo(30.2, 53.300003);
generalPath.lineTo(43.1, 53.300003);
generalPath.lineTo(43.1, 56.500004);
generalPath.lineTo(30.2, 56.500004);
generalPath.lineTo(30.2, 53.300003);
generalPath.closePath();
generalPath.moveTo(52.800003, 24.200003);
generalPath.lineTo(26.9, 24.200003);
generalPath.curveTo(23.3, 24.200003, 20.4, 27.100002, 20.4, 30.700003);
generalPath.lineTo(20.4, 59.800003);
generalPath.lineTo(14.0, 59.800003);
generalPath.curveTo(14.0, 63.4, 16.9, 66.3, 20.5, 66.3);
generalPath.lineTo(46.3, 66.3);
generalPath.curveTo(49.899998, 66.3, 52.8, 63.4, 52.8, 59.800003);
generalPath.lineTo(52.8, 33.9);
generalPath.lineTo(59.3, 33.9);
generalPath.lineTo(59.3, 30.7);
generalPath.curveTo(59.2, 27.1, 56.399998, 24.2, 52.8, 24.2);
generalPath.closePath();
generalPath.moveTo(49.600002, 59.200005);
generalPath.curveTo(49.600002, 61.300003, 47.9, 63.000004, 45.800003, 63.000004);
generalPath.lineTo(22.1, 63.000004);
generalPath.curveTo(23.7, 61.900005, 23.7, 59.800003, 23.7, 59.800003);
generalPath.lineTo(23.7, 30.7);
generalPath.curveTo(23.7, 28.900002, 25.1, 27.5, 26.900002, 27.5);
generalPath.curveTo(28.7, 27.5, 30.100002, 28.9, 30.100002, 30.7);
generalPath.lineTo(30.100002, 33.9);
generalPath.lineTo(49.5, 33.9);
generalPath.lineTo(49.5, 59.2);
generalPath.closePath();
generalPath.moveTo(33.4, 30.7);
generalPath.lineTo(33.4, 27.5);
generalPath.lineTo(52.800003, 27.5);
generalPath.curveTo(55.700005, 27.5, 56.000004, 29.3, 56.000004, 30.7);
generalPath.lineTo(33.4, 30.7);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.2, 91.9);
generalPath.lineTo(10.1, 74.7);
generalPath.lineTo(13.700001, 74.7);
generalPath.lineTo(16.300001, 86.5);
generalPath.lineTo(19.400002, 74.7);
generalPath.lineTo(23.500002, 74.7);
generalPath.lineTo(26.500002, 86.7);
generalPath.lineTo(29.100002, 74.7);
generalPath.lineTo(32.600002, 74.7);
generalPath.lineTo(28.400002, 91.899994);
generalPath.lineTo(24.7, 91.899994);
generalPath.lineTo(21.3, 79.0);
generalPath.lineTo(17.9, 91.8);
generalPath.lineTo(14.2, 91.8);
generalPath.closePath();
generalPath.moveTo(33.5, 86.3);
generalPath.lineTo(36.9, 86.0);
generalPath.curveTo(37.100002, 87.1, 37.5, 88.0, 38.100002, 88.5);
generalPath.curveTo(38.700005, 89.0, 39.600002, 89.3, 40.600002, 89.3);
generalPath.curveTo(41.7, 89.3, 42.600002, 89.100006, 43.100002, 88.600006);
generalPath.curveTo(43.600002, 88.100006, 43.9, 87.600006, 43.9, 86.90001);
generalPath.curveTo(43.9, 86.50001, 43.800003, 86.100006, 43.5, 85.90001);
generalPath.curveTo(43.199997, 85.70001, 42.8, 85.40001, 42.3, 85.20001);
generalPath.curveTo(41.899998, 85.10001, 41.0, 84.80001, 39.5, 84.40001);
generalPath.curveTo(37.6, 83.90001, 36.3, 83.40001, 35.6, 82.70001);
generalPath.curveTo(34.5, 81.80001, 34.0, 80.60001, 34.0, 79.20001);
generalPath.curveTo(34.0, 78.30001, 34.2, 77.500015, 34.7, 76.70001);
generalPath.curveTo(35.2, 75.90001, 35.9, 75.40001, 36.8, 75.000015);
generalPath.curveTo(37.699997, 74.60002, 38.899998, 74.40002, 40.2, 74.40002);
generalPath.curveTo(42.4, 74.40002, 44.0, 74.90002, 45.100002, 75.80002);
generalPath.curveTo(46.200005, 76.70002, 46.800003, 78.000015, 46.800003, 79.60002);
generalPath.lineTo(43.300003, 79.80002);
generalPath.curveTo(43.200005, 78.90002, 42.800003, 78.30002, 42.300003, 77.90002);
generalPath.curveTo(41.800003, 77.500015, 41.100002, 77.30002, 40.100002, 77.30002);
generalPath.curveTo(39.100002, 77.30002, 38.300003, 77.500015, 37.7, 77.90002);
generalPath.curveTo(37.3, 78.20002, 37.100002, 78.500015, 37.100002, 79.000015);
generalPath.curveTo(37.100002, 79.40002, 37.300003, 79.80002, 37.600002, 80.000015);
generalPath.curveTo(38.000004, 80.40002, 39.100002, 80.80002, 40.800003, 81.10001);
generalPath.curveTo(42.500004, 81.40001, 43.700005, 81.90002, 44.500004, 82.30001);
generalPath.curveTo(45.300003, 82.700005, 45.900005, 83.30001, 46.400005, 84.00001);
generalPath.curveTo(46.900005, 84.700005, 47.100006, 85.700005, 47.100006, 86.700005);
generalPath.curveTo(47.100006, 87.700005, 46.800007, 88.600006, 46.300007, 89.50001);
generalPath.curveTo(45.800007, 90.40001, 45.0, 91.0, 44.0, 91.4);
generalPath.curveTo(43.0, 91.8, 41.8, 92.0, 40.3, 92.0);
generalPath.curveTo(38.1, 92.0, 36.5, 91.5, 35.3, 90.5);
generalPath.curveTo(34.1, 89.5, 33.7, 88.2, 33.5, 86.3);
generalPath.closePath();
generalPath.moveTo(50.4, 91.9);
generalPath.lineTo(50.4, 74.7);
generalPath.lineTo(62.2, 74.7);
generalPath.lineTo(62.2, 77.6);
generalPath.lineTo(53.9, 77.6);
generalPath.lineTo(53.9, 81.7);
generalPath.lineTo(61.0, 81.7);
generalPath.lineTo(61.0, 84.6);
generalPath.lineTo(53.8, 84.6);
generalPath.lineTo(53.8, 91.9);
generalPath.lineTo(50.399998, 91.9);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());

}



    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    _paint0(g, origAlpha);


	    shape = null;
	    generalPath = null;
	    paint = null;
	    stroke = null;
	    clip = null;
        transformsStack.clear();
	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12999999523162842;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.7400000095367432;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_wsf() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public synchronized void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static ResizableIcon of(int width, int height) {
       ext_wsf base = new ext_wsf();
       base.width = width;
       base.height = height;
       return base;
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_wsf base = new ext_wsf();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_wsf::new;
    }
}

