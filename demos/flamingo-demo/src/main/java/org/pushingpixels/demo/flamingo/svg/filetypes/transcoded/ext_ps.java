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
public class ext_ps implements ResizableIcon {
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(-0.2, 99.0);
generalPath.lineTo(-0.2, 1.0);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.0f,0.211f,0.37f,0.512f,0.645f,0.77f,0.889f,1.0f}, new Color[] {new Color(248, 176, 184, 255),new Color(246, 172, 181, 255),new Color(242, 163, 173, 255),new Color(237, 149, 161, 255),new Color(231, 130, 146, 255),new Color(224, 105, 128, 255),new Color(215, 72, 107, 255),new Color(206, 7, 87, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(-0.2, 99.0);
generalPath.lineTo(-0.2, 1.0);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(212, 28, 92, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(-0.2, 99.0);
generalPath.lineTo(-0.2, 1.0);
generalPath.lineTo(45.1, 1.0);
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
generalPath.moveTo(20.0, 91.1);
generalPath.lineTo(20.0, 71.2);
generalPath.lineTo(26.5, 71.2);
generalPath.curveTo(29.0, 71.2, 30.6, 71.299995, 31.3, 71.5);
generalPath.curveTo(32.5, 71.8, 33.399998, 72.4, 34.2, 73.4);
generalPath.curveTo(35.0, 74.4, 35.4, 75.700005, 35.4, 77.3);
generalPath.curveTo(35.4, 78.5, 35.2, 79.5, 34.7, 80.4);
generalPath.curveTo(34.2, 81.3, 33.7, 81.9, 33.0, 82.4);
generalPath.curveTo(32.3, 82.9, 31.6, 83.200005, 30.9, 83.3);
generalPath.curveTo(29.9, 83.5, 28.5, 83.600006, 26.7, 83.600006);
generalPath.lineTo(24.0, 83.600006);
generalPath.lineTo(24.0, 91.100006);
generalPath.lineTo(20.0, 91.100006);
generalPath.closePath();
generalPath.moveTo(24.1, 74.6);
generalPath.lineTo(24.1, 80.2);
generalPath.lineTo(26.300001, 80.2);
generalPath.curveTo(27.900002, 80.2, 29.000002, 80.1, 29.500002, 79.899994);
generalPath.curveTo(30.000002, 79.7, 30.500002, 79.399994, 30.800001, 78.899994);
generalPath.curveTo(31.1, 78.49999, 31.300001, 77.899994, 31.300001, 77.399994);
generalPath.curveTo(31.300001, 76.7, 31.1, 76.09999, 30.7, 75.59999);
generalPath.curveTo(30.300001, 75.09999, 29.7, 74.79999, 29.1, 74.69999);
generalPath.curveTo(28.6, 74.59999, 27.6, 74.59999, 26.2, 74.59999);
generalPath.lineTo(24.1, 74.59999);
generalPath.closePath();
generalPath.moveTo(37.8, 84.6);
generalPath.lineTo(41.8, 84.2);
generalPath.curveTo(42.0, 85.5, 42.5, 86.5, 43.3, 87.1);
generalPath.curveTo(44.0, 87.7, 45.0, 88.0, 46.3, 88.0);
generalPath.curveTo(47.6, 88.0, 48.6, 87.7, 49.3, 87.2);
generalPath.curveTo(50.0, 86.7, 50.3, 86.0, 50.3, 85.299995);
generalPath.curveTo(50.3, 84.799995, 50.2, 84.399994, 49.899998, 84.1);
generalPath.curveTo(49.6, 83.799995, 49.1, 83.5, 48.399998, 83.2);
generalPath.curveTo(47.899998, 83.0, 46.8, 82.7, 45.1, 82.299995);
generalPath.curveTo(42.899998, 81.799995, 41.399998, 81.1, 40.5, 80.299995);
generalPath.curveTo(39.3, 79.2, 38.6, 77.899994, 38.6, 76.299995);
generalPath.curveTo(38.6, 75.299995, 38.899998, 74.299995, 39.5, 73.49999);
generalPath.curveTo(40.1, 72.59999, 40.9, 71.99999, 42.0, 71.49999);
generalPath.curveTo(43.1, 70.99999, 44.4, 70.799995, 46.0, 70.799995);
generalPath.curveTo(48.5, 70.799995, 50.4, 71.299995, 51.7, 72.399994);
generalPath.curveTo(53.0, 73.49999, 53.7, 74.899994, 53.7, 76.799995);
generalPath.lineTo(49.600002, 76.99999);
generalPath.curveTo(49.4, 75.99999, 49.100002, 75.19999, 48.500004, 74.799995);
generalPath.curveTo(47.900005, 74.399994, 47.100002, 74.1, 45.900005, 74.1);
generalPath.curveTo(44.700005, 74.1, 43.800007, 74.299995, 43.100006, 74.799995);
generalPath.curveTo(42.700005, 75.1, 42.500008, 75.49999, 42.500008, 75.99999);
generalPath.curveTo(42.500008, 76.49999, 42.70001, 76.899994, 43.100006, 77.19999);
generalPath.curveTo(43.600006, 77.59999, 44.900005, 78.09999, 46.800007, 78.49999);
generalPath.curveTo(48.70001, 78.899994, 50.20001, 79.399994, 51.20001, 79.899994);
generalPath.curveTo(52.10001, 80.399994, 52.90001, 81.09999, 53.40001, 81.899994);
generalPath.curveTo(53.90001, 82.799995, 54.20001, 83.799995, 54.20001, 85.09999);
generalPath.curveTo(54.20001, 86.19999, 53.90001, 87.29999, 53.20001, 88.29999);
generalPath.curveTo(52.60001, 89.29999, 51.60001, 89.999985, 50.500008, 90.499985);
generalPath.curveTo(49.400005, 90.999985, 47.90001, 91.19998, 46.100006, 91.19998);
generalPath.curveTo(43.500008, 91.19998, 41.600006, 90.59998, 40.200005, 89.499985);
generalPath.curveTo(38.900005, 88.499985, 38.000004, 86.79999, 37.800003, 84.59998);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.73f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.0, 62.3);
generalPath.lineTo(17.4, 59.0);
generalPath.curveTo(17.4, 59.0, 25.099998, 43.8, 22.099998, 38.2);
generalPath.lineTo(38.399998, 25.6);
generalPath.curveTo(38.399998, 25.6, 44.6, 26.6, 47.699997, 32.1);
generalPath.lineTo(40.699997, 51.199997);
generalPath.curveTo(34.3, 50.3, 22.0, 62.3, 22.0, 62.3);
generalPath.closePath();
generalPath.moveTo(33.1, 42.5);
generalPath.curveTo(34.399998, 43.4, 36.1, 43.1, 37.0, 41.9);
generalPath.curveTo(37.9, 40.600002, 37.6, 38.9, 36.4, 38.0);
generalPath.curveTo(35.100002, 37.1, 33.4, 37.4, 32.5, 38.6);
generalPath.curveTo(31.5, 39.8, 31.8, 41.6, 33.1, 42.5);
generalPath.closePath();
generalPath.moveTo(33.1, 42.5);
generalPath.lineTo(19.8, 60.6);
generalPath.moveTo(59.1, 26.199997);
generalPath.curveTo(52.899998, 14.399997, 39.5, 12.199997, 39.5, 12.199997);
generalPath.lineTo(33.5, 20.399998);
generalPath.curveTo(46.9, 22.599998, 53.1, 34.399998, 53.1, 34.399998);
generalPath.lineTo(59.1, 26.199997);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(1729.68896484375, -415.95599365234375), new Point2D.Double(1753.864013671875, -415.95599365234375), new float[] {0.0f,1.0f}, new Color[] {new Color(238, 40, 104, 255),new Color(188, 2, 79, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-0.8102462627304787f, -0.5860895782483186f, -0.5860895782483186f, 0.8102462627304787f, 1202.6828163388243f, 1396.7453704594668f));
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
generalPath.moveTo(19.9, 60.8);
generalPath.lineTo(33.3, 42.6);
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(248, 182, 187, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.9, 60.8);
generalPath.lineTo(33.3, 42.6);
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.1, 27.7);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.265f,0.402f,0.51f,0.604f,0.687f,0.763f,0.834f,0.901f,0.962f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(255, 250, 236, 255),new Color(254, 242, 230, 255),new Color(252, 231, 220, 255),new Color(250, 215, 207, 255),new Color(246, 195, 191, 255),new Color(242, 171, 172, 255),new Color(238, 143, 151, 255),new Color(234, 111, 130, 255),new Color(229, 68, 109, 255),new Color(227, 14, 96, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.1, 27.7);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(212, 28, 92, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.1, 27.7);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
        return 0.12799999117851257;
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
		return 0.7450000047683716;
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
	private ext_ps() {
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
       ext_ps base = new ext_ps();
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
       ext_ps base = new ext_ps();
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
        return ext_ps::new;
    }
}

