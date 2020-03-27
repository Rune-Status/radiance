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
public class ext_download implements ResizableIcon {
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(72.0, 98.8);
generalPath.lineTo(0.0, 98.8);
generalPath.lineTo(0.0, 0.8);
generalPath.lineTo(45.0, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.80000305175781), new Point2D.Double(36.0, -0.20000000298023224), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(72.0, 98.8);
generalPath.lineTo(0.0, 98.8);
generalPath.lineTo(0.0, 0.8);
generalPath.lineTo(45.0, 0.8);
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(72.0, 98.8);
generalPath.lineTo(0.0, 98.8);
generalPath.lineTo(0.0, 0.8);
generalPath.lineTo(45.0, 0.8);
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(45.0, 27.5);
generalPath.lineTo(45.0, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 26.575000762939453), new Point2D.Double(58.57500076293945, 13.074999809265137), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(45.0, 27.5);
generalPath.lineTo(45.0, 0.8);
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(45.0, 27.5);
generalPath.lineTo(45.0, 0.8);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(58.8, 61.7);
generalPath.curveTo(58.8, 59.9, 57.399998, 58.5, 55.6, 58.5);
generalPath.lineTo(16.4, 58.5);
generalPath.curveTo(14.599999, 58.5, 13.2, 59.9, 13.2, 61.7);
generalPath.lineTo(13.2, 66.2);
generalPath.curveTo(13.2, 68.0, 14.599999, 69.399994, 16.4, 69.399994);
generalPath.lineTo(55.6, 69.399994);
generalPath.curveTo(57.399998, 69.399994, 58.8, 67.99999, 58.8, 66.2);
generalPath.lineTo(58.8, 61.699997);
generalPath.closePath();
generalPath.moveTo(41.9, 65.8);
generalPath.curveTo(40.9, 65.8, 40.100002, 65.0, 40.100002, 64.0);
generalPath.curveTo(40.100002, 63.0, 40.9, 62.2, 41.9, 62.2);
generalPath.curveTo(42.9, 62.2, 43.7, 63.0, 43.7, 64.0);
generalPath.curveTo(43.8, 65.0, 42.9, 65.8, 41.9, 65.8);
generalPath.closePath();
generalPath.moveTo(47.4, 65.8);
generalPath.curveTo(46.4, 65.8, 45.600002, 65.0, 45.600002, 64.0);
generalPath.curveTo(45.600002, 63.0, 46.4, 62.2, 47.4, 62.2);
generalPath.curveTo(48.4, 62.2, 49.2, 63.0, 49.2, 64.0);
generalPath.curveTo(49.2, 65.0, 48.4, 65.8, 47.4, 65.8);
generalPath.closePath();
generalPath.moveTo(52.9, 65.8);
generalPath.curveTo(51.9, 65.8, 51.100002, 65.0, 51.100002, 64.0);
generalPath.curveTo(51.100002, 63.0, 51.9, 62.2, 52.9, 62.2);
generalPath.curveTo(53.9, 62.2, 54.7, 63.0, 54.7, 64.0);
generalPath.curveTo(54.7, 65.0, 53.9, 65.8, 52.9, 65.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.199999809265137, 63.965999603271484), new Point2D.Double(58.79999923706055, 63.965999603271484), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.4, 56.7);
generalPath.lineTo(55.6, 56.7);
generalPath.curveTo(56.5, 56.7, 57.3, 56.9, 58.0, 57.3);
generalPath.lineTo(54.2, 49.3);
generalPath.curveTo(53.2, 47.0, 51.4, 46.1, 49.600002, 46.1);
generalPath.lineTo(45.300003, 46.1);
generalPath.lineTo(39.100002, 52.399998);
generalPath.curveTo(38.7, 52.8, 38.2, 53.199997, 37.600002, 53.399998);
generalPath.curveTo(37.000004, 53.6, 36.4, 53.8, 35.800003, 53.8);
generalPath.curveTo(35.200005, 53.8, 34.600002, 53.7, 34.000004, 53.399998);
generalPath.lineTo(33.800003, 53.399998);
generalPath.curveTo(33.300003, 53.1, 32.9, 52.8, 32.500004, 52.499996);
generalPath.lineTo(26.400003, 46.199997);
generalPath.lineTo(22.200005, 46.199997);
generalPath.curveTo(20.400005, 46.199997, 18.800005, 47.199997, 17.600004, 49.399998);
generalPath.lineTo(13.800004, 57.399998);
generalPath.curveTo(14.700004, 56.899998, 15.500004, 56.699997, 16.400003, 56.699997);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.968000411987305, 51.724998474121094), new Point2D.Double(58.03200149536133, 51.724998474121094), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1, 43.2);
generalPath.curveTo(45.3, 43.0, 45.5, 42.7, 45.6, 42.4);
generalPath.curveTo(45.699997, 42.100002, 45.8, 41.800003, 45.8, 41.5);
generalPath.curveTo(45.8, 41.2, 45.7, 40.9, 45.6, 40.6);
generalPath.curveTo(45.5, 40.3, 45.3, 40.1, 45.1, 39.8);
generalPath.curveTo(44.899998, 39.6, 44.6, 39.399998, 44.3, 39.3);
generalPath.curveTo(44.0, 39.2, 43.7, 39.1, 43.399998, 39.1);
generalPath.curveTo(43.099995, 39.1, 42.8, 39.199997, 42.499996, 39.3);
generalPath.curveTo(42.199997, 39.399998, 41.899998, 39.6, 41.699997, 39.8);
generalPath.lineTo(38.199997, 43.3);
generalPath.lineTo(38.199997, 32.3);
generalPath.curveTo(38.199997, 32.0, 38.1, 31.699999, 37.999996, 31.4);
generalPath.curveTo(37.899998, 31.1, 37.699997, 30.9, 37.499996, 30.6);
generalPath.curveTo(37.299995, 30.4, 36.999996, 30.2, 36.699997, 30.1);
generalPath.curveTo(36.6, 30.0, 36.299995, 30.0, 35.999996, 30.0);
generalPath.curveTo(35.699997, 30.0, 35.399998, 30.1, 35.099995, 30.2);
generalPath.curveTo(34.799995, 30.300001, 34.499996, 30.5, 34.299995, 30.7);
generalPath.curveTo(34.099995, 30.900002, 33.899994, 31.2, 33.799995, 31.5);
generalPath.curveTo(33.699997, 31.8, 33.599995, 32.1, 33.599995, 32.4);
generalPath.lineTo(33.599995, 43.4);
generalPath.lineTo(30.099995, 39.9);
generalPath.curveTo(29.899994, 39.7, 29.599995, 39.5, 29.299995, 39.4);
generalPath.curveTo(28.999996, 39.300003, 28.699995, 39.2, 28.399996, 39.2);
generalPath.curveTo(28.099997, 39.2, 27.799995, 39.3, 27.499996, 39.4);
generalPath.curveTo(27.199997, 39.5, 26.999996, 39.7, 26.699997, 39.9);
generalPath.curveTo(26.499996, 40.100002, 26.299997, 40.4, 26.199997, 40.7);
generalPath.curveTo(26.099997, 41.0, 25.999996, 41.3, 25.999996, 41.600002);
generalPath.curveTo(25.999996, 41.9, 26.099997, 42.2, 26.199997, 42.500004);
generalPath.curveTo(26.299997, 42.800003, 26.499996, 43.100002, 26.699997, 43.300003);
generalPath.lineTo(34.199997, 51.000004);
generalPath.curveTo(34.399998, 51.200005, 34.699997, 51.400005, 34.999996, 51.500004);
generalPath.curveTo(35.299995, 51.600002, 35.599995, 51.700005, 35.899998, 51.700005);
generalPath.curveTo(36.199997, 51.700005, 36.499996, 51.600006, 36.8, 51.500004);
generalPath.curveTo(37.1, 51.400005, 37.3, 51.200005, 37.6, 51.000004);
generalPath.lineTo(45.1, 43.200005);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.172000885009766, 40.75199890136719), new Point2D.Double(45.82699966430664, 40.75199890136719), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
		return 0.9980000257492065;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_download() {
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
       ext_download base = new ext_download();
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
       ext_download base = new ext_download();
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
        return ext_download::new;
    }
}

