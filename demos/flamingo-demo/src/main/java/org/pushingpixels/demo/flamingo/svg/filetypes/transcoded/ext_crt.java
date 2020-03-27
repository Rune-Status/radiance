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
public class ext_crt implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.4, 37.7);
generalPath.lineTo(48.5, 37.7);
generalPath.lineTo(48.5, 32.0);
generalPath.curveTo(48.5, 25.6, 43.3, 20.3, 36.8, 20.3);
generalPath.curveTo(30.3, 20.3, 25.1, 25.6, 25.1, 32.0);
generalPath.lineTo(25.1, 37.7);
generalPath.lineTo(22.2, 37.7);
generalPath.curveTo(21.1, 37.7, 20.2, 38.600002, 20.2, 39.7);
generalPath.lineTo(20.2, 59.5);
generalPath.curveTo(20.2, 60.6, 21.1, 61.5, 22.2, 61.5);
generalPath.lineTo(51.300003, 61.5);
generalPath.curveTo(52.4, 61.5, 53.300003, 60.6, 53.300003, 59.5);
generalPath.lineTo(53.300003, 39.8);
generalPath.curveTo(53.4, 38.6, 52.500004, 37.7, 51.4, 37.7);
generalPath.closePath();
generalPath.moveTo(39.3, 54.2);
generalPath.curveTo(39.5, 54.9, 39.0, 55.5, 38.3, 55.5);
generalPath.lineTo(35.3, 55.5);
generalPath.curveTo(34.6, 55.5, 34.1, 54.8, 34.3, 54.2);
generalPath.lineTo(35.3, 50.5);
generalPath.curveTo(34.2, 49.9, 33.399998, 48.8, 33.399998, 47.4);
generalPath.curveTo(33.399998, 45.4, 34.999996, 43.9, 36.899998, 43.9);
generalPath.curveTo(38.8, 43.9, 40.399998, 45.5, 40.399998, 47.4);
generalPath.curveTo(40.399998, 48.800003, 39.6, 50.0, 38.499996, 50.5);
generalPath.lineTo(39.299995, 54.2);
generalPath.closePath();
generalPath.moveTo(42.6, 37.7);
generalPath.lineTo(31.0, 37.7);
generalPath.lineTo(31.0, 32.0);
generalPath.curveTo(31.0, 28.8, 33.6, 26.2, 36.8, 26.2);
generalPath.curveTo(40.0, 26.2, 42.6, 28.800001, 42.6, 32.0);
generalPath.lineTo(42.6, 37.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.79999923706055, 61.5890007019043), new Point2D.Double(36.79999923706055, 20.33300018310547), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(22.2, 84.5);
generalPath.lineTo(26.1, 85.7);
generalPath.curveTo(25.5, 87.899994, 24.5, 89.5, 23.1, 90.6);
generalPath.curveTo(21.7, 91.7, 19.9, 92.2, 17.8, 92.2);
generalPath.curveTo(15.099999, 92.2, 12.999999, 91.299995, 11.199999, 89.5);
generalPath.curveTo(9.499999, 87.7, 8.599998, 85.2, 8.599998, 82.0);
generalPath.curveTo(8.599998, 78.7, 9.499998, 76.1, 11.199999, 74.2);
generalPath.curveTo(12.9, 72.299995, 15.199999, 71.399994, 18.0, 71.399994);
generalPath.curveTo(20.5, 71.399994, 22.4, 72.09999, 24.0, 73.59999);
generalPath.curveTo(24.9, 74.49999, 25.6, 75.69999, 26.1, 77.29999);
generalPath.lineTo(22.1, 78.29999);
generalPath.curveTo(21.9, 77.29999, 21.4, 76.39999, 20.6, 75.79999);
generalPath.curveTo(19.800001, 75.19999, 18.9, 74.999985, 17.9, 74.999985);
generalPath.curveTo(16.4, 74.999985, 15.2, 75.499985, 14.299999, 76.59998);
generalPath.curveTo(13.4, 77.69998, 12.9, 79.39999, 12.9, 81.79998);
generalPath.curveTo(12.9, 84.29998, 13.4, 86.09998, 14.299999, 87.19998);
generalPath.curveTo(15.199999, 88.29998, 16.4, 88.79998, 17.9, 88.79998);
generalPath.curveTo(19.0, 88.79998, 19.9, 88.49998, 20.699999, 87.79998);
generalPath.curveTo(21.3, 87.09998, 21.9, 85.99998, 22.199999, 84.49998);
generalPath.closePath();
generalPath.moveTo(29.6, 91.9);
generalPath.lineTo(29.6, 71.9);
generalPath.lineTo(38.1, 71.9);
generalPath.curveTo(40.199997, 71.9, 41.8, 72.1, 42.8, 72.4);
generalPath.curveTo(43.8, 72.700005, 44.5, 73.4, 45.1, 74.3);
generalPath.curveTo(45.699997, 75.200005, 46.0, 76.3, 46.0, 77.5);
generalPath.curveTo(46.0, 79.0, 45.6, 80.2, 44.7, 81.2);
generalPath.curveTo(43.800003, 82.2, 42.5, 82.799995, 40.7, 83.1);
generalPath.curveTo(41.600002, 83.6, 42.3, 84.2, 42.9, 84.799995);
generalPath.curveTo(43.5, 85.399994, 44.2, 86.49999, 45.2, 88.1);
generalPath.lineTo(47.600002, 92.0);
generalPath.lineTo(42.800003, 92.0);
generalPath.lineTo(39.9, 87.6);
generalPath.curveTo(38.9, 86.0, 38.100002, 85.1, 37.800003, 84.7);
generalPath.curveTo(37.500004, 84.299995, 37.000004, 84.0, 36.600002, 83.899994);
generalPath.curveTo(36.2, 83.7, 35.500004, 83.7, 34.600002, 83.7);
generalPath.lineTo(33.800003, 83.7);
generalPath.lineTo(33.800003, 92.1);
generalPath.lineTo(29.600002, 92.1);
generalPath.closePath();
generalPath.moveTo(33.7, 80.3);
generalPath.lineTo(36.7, 80.3);
generalPath.curveTo(38.600002, 80.3, 39.9, 80.200005, 40.3, 80.100006);
generalPath.curveTo(40.8, 79.90001, 41.2, 79.700005, 41.399998, 79.3);
generalPath.curveTo(41.599995, 78.9, 41.8, 78.4, 41.8, 77.8);
generalPath.curveTo(41.8, 77.100006, 41.6, 76.600006, 41.3, 76.200005);
generalPath.curveTo(40.899998, 75.8, 40.399998, 75.50001, 39.8, 75.4);
generalPath.curveTo(39.5, 75.4, 38.5, 75.3, 36.8, 75.3);
generalPath.lineTo(33.6, 75.3);
generalPath.lineTo(33.6, 80.3);
generalPath.closePath();
generalPath.moveTo(54.300003, 91.9);
generalPath.lineTo(54.300003, 75.2);
generalPath.lineTo(48.4, 75.2);
generalPath.lineTo(48.4, 71.799995);
generalPath.lineTo(64.3, 71.799995);
generalPath.lineTo(64.3, 75.2);
generalPath.lineTo(58.4, 75.2);
generalPath.lineTo(58.4, 91.899994);
generalPath.lineTo(54.300003, 91.899994);
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
	private ext_crt() {
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
       ext_crt base = new ext_crt();
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
       ext_crt base = new ext_crt();
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
        return ext_crt::new;
    }
}

