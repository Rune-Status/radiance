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
public class ext_webp implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(72.1, 99.0);
generalPath.lineTo(0.3, 99.0);
generalPath.lineTo(0.3, 1.0);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {new Color(0, 107, 105, 255),new Color(0, 128, 127, 255),new Color(0, 147, 147, 255),new Color(0, 163, 163, 255),new Color(0, 176, 175, 255),new Color(8, 184, 183, 255),new Color(20, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(72.1, 99.0);
generalPath.lineTo(0.3, 99.0);
generalPath.lineTo(0.3, 1.0);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(72.1, 99.0);
generalPath.lineTo(0.3, 99.0);
generalPath.lineTo(0.3, 1.0);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(7.0, 91.1);
generalPath.lineTo(3.3, 75.3);
generalPath.lineTo(6.6, 75.3);
generalPath.lineTo(9.0, 86.1);
generalPath.lineTo(11.9, 75.299995);
generalPath.lineTo(15.7, 75.299995);
generalPath.lineTo(18.5, 86.299995);
generalPath.lineTo(20.9, 75.299995);
generalPath.lineTo(24.1, 75.299995);
generalPath.lineTo(20.2, 91.0);
generalPath.lineTo(16.800001, 91.0);
generalPath.lineTo(13.600001, 79.2);
generalPath.lineTo(10.5, 91.0);
generalPath.lineTo(7.0, 91.0);
generalPath.closePath();
generalPath.moveTo(25.7, 91.1);
generalPath.lineTo(25.7, 75.3);
generalPath.lineTo(37.5, 75.3);
generalPath.lineTo(37.5, 78.0);
generalPath.lineTo(28.9, 78.0);
generalPath.lineTo(28.9, 81.5);
generalPath.lineTo(36.9, 81.5);
generalPath.lineTo(36.9, 84.2);
generalPath.lineTo(28.900002, 84.2);
generalPath.lineTo(28.900002, 88.5);
generalPath.lineTo(37.800003, 88.5);
generalPath.lineTo(37.800003, 91.2);
generalPath.lineTo(25.7, 91.2);
generalPath.closePath();
generalPath.moveTo(40.5, 75.299995);
generalPath.lineTo(46.8, 75.299995);
generalPath.curveTo(48.1, 75.299995, 49.0, 75.399994, 49.6, 75.49999);
generalPath.curveTo(50.199997, 75.59999, 50.8, 75.799995, 51.3, 76.09999);
generalPath.curveTo(51.8, 76.39999, 52.2, 76.899994, 52.5, 77.399994);
generalPath.curveTo(52.8, 77.899994, 53.0, 78.59999, 53.0, 79.2);
generalPath.curveTo(53.0, 79.899994, 52.8, 80.6, 52.4, 81.2);
generalPath.curveTo(52.000004, 81.799995, 51.5, 82.299995, 50.800003, 82.6);
generalPath.curveTo(51.800003, 82.9, 52.500004, 83.4, 53.000004, 84.0);
generalPath.curveTo(53.500004, 84.7, 53.800003, 85.5, 53.800003, 86.4);
generalPath.curveTo(53.800003, 87.1, 53.600002, 87.8, 53.300003, 88.5);
generalPath.curveTo(53.000004, 89.2, 52.500004, 89.7, 51.9, 90.1);
generalPath.curveTo(51.300003, 90.5, 50.600002, 90.799995, 49.800003, 90.799995);
generalPath.curveTo(49.300003, 90.899994, 48.000004, 90.899994, 45.9, 90.899994);
generalPath.lineTo(40.5, 90.899994);
generalPath.lineTo(40.5, 75.3);
generalPath.closePath();
generalPath.moveTo(43.7, 77.899994);
generalPath.lineTo(43.7, 81.49999);
generalPath.lineTo(45.8, 81.49999);
generalPath.curveTo(47.0, 81.49999, 47.8, 81.49999, 48.1, 81.399994);
generalPath.curveTo(48.6, 81.299995, 49.1, 81.09999, 49.399998, 80.799995);
generalPath.curveTo(49.699997, 80.49999, 49.899998, 80.1, 49.899998, 79.6);
generalPath.curveTo(49.899998, 79.1, 49.8, 78.7, 49.499996, 78.4);
generalPath.curveTo(49.199997, 78.1, 48.799995, 77.9, 48.299995, 77.8);
generalPath.curveTo(47.999996, 77.8, 47.099995, 77.700005, 45.599995, 77.700005);
generalPath.lineTo(43.699993, 77.700005);
generalPath.closePath();
generalPath.moveTo(43.7, 84.2);
generalPath.lineTo(43.7, 88.399994);
generalPath.lineTo(46.7, 88.399994);
generalPath.curveTo(47.9, 88.399994, 48.600002, 88.399994, 48.9, 88.299995);
generalPath.curveTo(49.4, 88.2, 49.800003, 87.99999, 50.100002, 87.7);
generalPath.curveTo(50.4, 87.399994, 50.500004, 86.899994, 50.500004, 86.399994);
generalPath.curveTo(50.500004, 85.899994, 50.400005, 85.49999, 50.200005, 85.2);
generalPath.curveTo(50.000004, 84.899994, 49.600006, 84.6, 49.200005, 84.5);
generalPath.curveTo(48.800003, 84.3, 47.800003, 84.3, 46.400005, 84.3);
generalPath.lineTo(43.700005, 84.3);
generalPath.closePath();
generalPath.moveTo(56.5, 91.1);
generalPath.lineTo(56.5, 75.3);
generalPath.lineTo(61.6, 75.3);
generalPath.curveTo(63.5, 75.3, 64.799995, 75.4, 65.4, 75.5);
generalPath.curveTo(66.3, 75.7, 67.1, 76.3, 67.700005, 77.0);
generalPath.curveTo(68.3, 77.8, 68.600006, 78.8, 68.600006, 80.1);
generalPath.curveTo(68.600006, 81.1, 68.40001, 81.9, 68.100006, 82.5);
generalPath.curveTo(67.8, 83.1, 67.3, 83.7, 66.8, 84.1);
generalPath.curveTo(66.3, 84.5, 65.700005, 84.7, 65.100006, 84.799995);
generalPath.curveTo(64.3, 84.99999, 63.200005, 84.99999, 61.800007, 84.99999);
generalPath.lineTo(59.70001, 84.99999);
generalPath.lineTo(59.70001, 90.899994);
generalPath.lineTo(56.500008, 90.899994);
generalPath.closePath();
generalPath.moveTo(59.7, 78.0);
generalPath.lineTo(59.7, 82.5);
generalPath.lineTo(61.5, 82.5);
generalPath.curveTo(62.8, 82.5, 63.6, 82.4, 64.0, 82.3);
generalPath.curveTo(64.4, 82.200005, 64.8, 81.9, 65.0, 81.5);
generalPath.curveTo(65.2, 81.1, 65.4, 80.7, 65.4, 80.3);
generalPath.curveTo(65.4, 79.700005, 65.200005, 79.3, 64.9, 78.9);
generalPath.curveTo(64.6, 78.5, 64.1, 78.3, 63.600002, 78.200005);
generalPath.curveTo(63.100002, 78.00001, 62.4, 78.00001, 61.2, 78.00001);
generalPath.lineTo(59.7, 78.00001);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {new Color(214, 237, 232, 255),new Color(211, 235, 230, 255),new Color(199, 227, 223, 255),new Color(183, 216, 213, 255),new Color(160, 203, 201, 255),new Color(132, 186, 185, 255),new Color(98, 167, 167, 255),new Color(52, 147, 148, 255),new Color(0, 127, 127, 255),new Color(0, 107, 106, 255),new Color(0, 107, 105, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(62.7, 56.8);
generalPath.curveTo(61.100002, 56.0, 58.100002, 50.2, 53.5, 49.8);
generalPath.curveTo(49.5, 49.5, 44.4, 48.0, 41.6, 47.8);
generalPath.curveTo(38.1, 42.0, 32.1, 32.8, 27.099998, 27.9);
generalPath.lineTo(40.899998, 28.6);
generalPath.curveTo(37.2, 19.8, 27.7, 23.0, 27.7, 23.0);
generalPath.lineTo(34.100002, 17.7);
generalPath.curveTo(25.900002, 14.400001, 22.500002, 22.400002, 22.500002, 22.400002);
generalPath.curveTo(14.000002, 17.7, 9.600002, 25.7, 9.600002, 25.7);
generalPath.lineTo(18.400002, 26.300001);
generalPath.curveTo(8.4, 29.1, 11.2, 39.0, 11.2, 39.0);
generalPath.lineTo(20.099998, 31.0);
generalPath.curveTo(18.199999, 35.4, 22.399998, 38.5, 22.399998, 38.5);
generalPath.lineTo(25.0, 27.7);
generalPath.curveTo(25.0, 27.7, 34.3, 38.300003, 37.2, 49.1);
generalPath.curveTo(33.5, 51.0, 27.7, 54.1, 23.2, 54.699997);
generalPath.curveTo(17.0, 55.499996, 9.700001, 59.699997, 9.700001, 59.699997);
generalPath.lineTo(9.700001, 64.6);
generalPath.lineTo(62.8, 64.6);
generalPath.lineTo(62.7, 56.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.25, 37.35300064086914), new Point2D.Double(36.25, 85.16100311279297), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
        return 0.13300000131130219;
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
		return 0.7379999160766602;
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
	private ext_webp() {
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
       ext_webp base = new ext_webp();
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
       ext_webp base = new ext_webp();
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
        return ext_webp::new;
    }
}

