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
public class ext_cue implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
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
generalPath.moveTo(44.8, 1.0);
generalPath.lineTo(71.8, 27.7);
generalPath.lineTo(71.8, 99.0);
generalPath.lineTo(-0.19999695, 99.0);
generalPath.lineTo(-0.19999695, 1.0);
generalPath.lineTo(44.800003, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 2.994999885559082), new Point2D.Double(35.75, 101.0009994506836), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {new Color(239, 196, 2, 255),new Color(241, 200, 41, 255),new Color(244, 210, 100, 255),new Color(247, 220, 139, 255),new Color(249, 229, 172, 255),new Color(251, 236, 199, 255),new Color(252, 243, 221, 255),new Color(254, 249, 238, 255),new Color(255, 253, 249, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.8, 1.0);
generalPath.lineTo(71.8, 27.7);
generalPath.lineTo(71.8, 99.0);
generalPath.lineTo(-0.19999695, 99.0);
generalPath.lineTo(-0.19999695, 1.0);
generalPath.lineTo(44.800003, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8, 1.0);
generalPath.lineTo(71.8, 27.7);
generalPath.lineTo(71.8, 99.0);
generalPath.lineTo(-0.19999695, 99.0);
generalPath.lineTo(-0.19999695, 1.0);
generalPath.lineTo(44.800003, 1.0);
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
generalPath.moveTo(20.9, 84.8);
generalPath.lineTo(24.8, 86.0);
generalPath.curveTo(24.199999, 88.2, 23.199999, 89.8, 21.8, 90.8);
generalPath.curveTo(20.4, 91.9, 18.599998, 92.4, 16.5, 92.4);
generalPath.curveTo(13.8, 92.4, 11.7, 91.5, 9.9, 89.700005);
generalPath.curveTo(8.2, 87.9, 7.2999997, 85.4, 7.2999997, 82.3);
generalPath.curveTo(7.2999997, 79.0, 8.2, 76.4, 9.9, 74.600006);
generalPath.curveTo(11.599999, 72.80001, 13.9, 71.90001, 16.7, 71.90001);
generalPath.curveTo(19.2, 71.90001, 21.1, 72.600006, 22.7, 74.100006);
generalPath.curveTo(23.6, 74.90001, 24.300001, 76.200005, 24.800001, 77.8);
generalPath.lineTo(20.800001, 78.700005);
generalPath.curveTo(20.6, 77.700005, 20.1, 76.9, 19.300001, 76.3);
generalPath.curveTo(18.500002, 75.700005, 17.6, 75.4, 16.6, 75.4);
generalPath.curveTo(15.1, 75.4, 13.900001, 75.9, 13.0, 77.0);
generalPath.curveTo(12.1, 78.1, 11.6, 79.8, 11.6, 82.1);
generalPath.curveTo(11.6, 84.6, 12.1, 86.4, 13.0, 87.5);
generalPath.curveTo(13.9, 88.6, 15.1, 89.1, 16.6, 89.1);
generalPath.curveTo(17.7, 89.1, 18.6, 88.799995, 19.4, 88.1);
generalPath.curveTo(20.0, 87.299995, 20.6, 86.2, 20.9, 84.799995);
generalPath.closePath();
generalPath.moveTo(28.3, 72.200005);
generalPath.lineTo(32.3, 72.200005);
generalPath.lineTo(32.3, 83.0);
generalPath.curveTo(32.3, 84.7, 32.3, 85.8, 32.5, 86.3);
generalPath.curveTo(32.7, 87.100006, 33.1, 87.8, 33.7, 88.3);
generalPath.curveTo(34.4, 88.8, 35.2, 89.0, 36.4, 89.0);
generalPath.curveTo(37.5, 89.0, 38.4, 88.8, 39.0, 88.3);
generalPath.curveTo(39.6, 87.8, 39.9, 87.3, 40.1, 86.600006);
generalPath.curveTo(40.199997, 85.90001, 40.3, 84.8, 40.3, 83.200005);
generalPath.lineTo(40.3, 72.200005);
generalPath.lineTo(44.3, 72.200005);
generalPath.lineTo(44.3, 82.600006);
generalPath.curveTo(44.3, 85.00001, 44.2, 86.700005, 44.0, 87.600006);
generalPath.curveTo(43.8, 88.600006, 43.4, 89.40001, 42.8, 90.100006);
generalPath.curveTo(42.199997, 90.8, 41.399998, 91.3, 40.399998, 91.700005);
generalPath.curveTo(39.399998, 92.100006, 38.1, 92.3, 36.499996, 92.3);
generalPath.curveTo(34.599995, 92.3, 33.099995, 92.100006, 32.099995, 91.600006);
generalPath.curveTo(31.099995, 91.200005, 30.299995, 90.600006, 29.799995, 89.90001);
generalPath.curveTo(29.299995, 89.20001, 28.799995, 88.50001, 28.699995, 87.70001);
generalPath.curveTo(28.399996, 86.60001, 28.299995, 84.90001, 28.299995, 82.70001);
generalPath.lineTo(28.299995, 72.2);
generalPath.closePath();
generalPath.moveTo(48.6, 92.100006);
generalPath.lineTo(48.6, 72.2);
generalPath.lineTo(63.5, 72.2);
generalPath.lineTo(63.5, 75.6);
generalPath.lineTo(52.6, 75.6);
generalPath.lineTo(52.6, 80.0);
generalPath.lineTo(62.699997, 80.0);
generalPath.lineTo(62.699997, 83.3);
generalPath.lineTo(52.6, 83.3);
generalPath.lineTo(52.6, 88.700005);
generalPath.lineTo(63.8, 88.700005);
generalPath.lineTo(63.8, 92.0);
generalPath.lineTo(48.6, 92.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.8, 18.8);
generalPath.curveTo(23.4, 18.8, 13.299999, 28.8, 13.299999, 41.1);
generalPath.curveTo(13.299999, 53.399998, 23.4, 63.399998, 35.8, 63.399998);
generalPath.curveTo(48.199997, 63.399998, 58.3, 53.399998, 58.3, 41.1);
generalPath.curveTo(58.3, 28.8, 48.199997, 18.8, 35.8, 18.8);
generalPath.closePath();
generalPath.moveTo(35.8, 48.699997);
generalPath.curveTo(31.5, 48.699997, 28.099998, 45.199997, 28.099998, 41.1);
generalPath.curveTo(28.099998, 36.8, 31.599998, 33.5, 35.8, 33.5);
generalPath.curveTo(40.1, 33.5, 43.5, 37.0, 43.5, 41.1);
generalPath.curveTo(43.5, 45.3, 40.0, 48.699997, 35.8, 48.699997);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 38.632999420166016), new Point2D.Double(35.75, 83.18099975585938), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {new Color(164, 125, 3, 255),new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.8, 38.3);
generalPath.curveTo(34.2, 38.3, 33.0, 39.6, 33.0, 41.1);
generalPath.curveTo(33.0, 42.699997, 34.3, 43.899998, 35.8, 43.899998);
generalPath.curveTo(37.399998, 43.899998, 38.6, 42.6, 38.6, 41.1);
generalPath.curveTo(38.5, 39.5, 37.399998, 38.3, 35.8, 38.3);
generalPath.closePath();
generalPath.moveTo(35.8, 42.1);
generalPath.curveTo(35.3, 42.1, 34.8, 41.699997, 34.8, 41.1);
generalPath.curveTo(34.8, 40.6, 35.2, 40.1, 35.8, 40.1);
generalPath.curveTo(36.3, 40.1, 36.8, 40.5, 36.8, 41.1);
generalPath.curveTo(36.8, 41.6, 36.2, 42.1, 35.8, 42.1);
generalPath.closePath();
shape = generalPath;
paint = new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.8, 32.8);
generalPath.curveTo(31.099998, 32.8, 27.4, 36.6, 27.4, 41.1);
generalPath.curveTo(27.4, 45.8, 31.199999, 49.399998, 35.8, 49.399998);
generalPath.curveTo(40.5, 49.399998, 44.199997, 45.6, 44.199997, 41.1);
generalPath.curveTo(44.199997, 36.399998, 40.499996, 32.8, 35.799995, 32.8);
generalPath.closePath();
generalPath.moveTo(35.8, 48.0);
generalPath.curveTo(31.9, 48.0, 28.8, 44.9, 28.8, 41.1);
generalPath.curveTo(28.8, 37.299995, 31.9, 34.199997, 35.8, 34.199997);
generalPath.curveTo(39.699997, 34.199997, 42.8, 37.299995, 42.8, 41.1);
generalPath.curveTo(42.8, 44.9, 39.7, 48.0, 35.8, 48.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.2, 27.7);
generalPath.lineTo(45.199997, 27.7);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.34400177001953, 74.2300033569336), new Point2D.Double(58.84400177001953, 87.7300033569336), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 254, 251, 255),new Color(254, 250, 241, 255),new Color(253, 245, 228, 255),new Color(252, 240, 210, 255),new Color(250, 233, 188, 255),new Color(249, 226, 162, 255),new Color(247, 218, 131, 255),new Color(244, 209, 93, 255),new Color(241, 200, 39, 255),new Color(239, 196, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.2, 27.7);
generalPath.lineTo(45.199997, 27.7);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.2, 27.7);
generalPath.lineTo(45.199997, 27.7);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
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
        return 0.12800002098083496;
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
		return 0.7410314083099365;
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
	private ext_cue() {
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
       ext_cue base = new ext_cue();
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
       ext_cue base = new ext_cue();
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
        return ext_cue::new;
    }
}

