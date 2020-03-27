package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_image implements ResizableIcon {
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
generalPath.moveTo(0.0, 1.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.lineTo(0.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-63.0, 145.11099243164062), new Point2D.Double(-63.0, 243.11099243164062), new float[] {0.0f,1.0f}, new Color[] {new Color(75, 160, 216, 255),new Color(254, 254, 254, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 99.0f, 244.11099243164062f));
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
paint = new Color(0, 153, 219, 255);
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
generalPath.moveTo(45.0, 27.7);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.lineTo(45.0, 27.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-41.250999450683594, 228.9969940185547), new Point2D.Double(-47.00600051879883, 223.24200439453125), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 133, 201, 255),new Color(220, 233, 247, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 99.0f, 244.11099243164062f));
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
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 153, 219, 255);
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
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.0, 36.6);
generalPath.lineTo(36.0, 36.6);
generalPath.lineTo(36.0, 9.9);
generalPath.lineTo(9.0, 9.9);
generalPath.lineTo(9.0, 36.6);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-76.5, 207.47500610351562), new Point2D.Double(-76.5, 234.20199584960938), new float[] {0.0f,0.005f,1.0f}, new Color[] {new Color(230, 235, 246, 255),new Color(230, 235, 246, 255),new Color(0, 175, 238, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 99.0f, 244.11099243164062f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(18.4, 15.5);
generalPath.curveTo(14.099999, 13.2, 12.0, 17.2, 12.0, 17.2);
generalPath.lineTo(16.4, 17.5);
generalPath.curveTo(11.4, 19.0, 12.7, 23.9, 12.7, 23.9);
generalPath.lineTo(17.1, 19.9);
generalPath.curveTo(16.1, 22.1, 18.300001, 23.699999, 18.300001, 23.699999);
generalPath.lineTo(19.6, 18.3);
generalPath.curveTo(19.6, 18.3, 24.3, 23.599998, 25.7, 29.0);
generalPath.curveTo(23.800001, 29.9, 21.0, 31.5, 18.7, 31.8);
generalPath.curveTo(15.6, 32.2, 11.900001, 34.3, 11.900001, 34.3);
generalPath.lineTo(11.900001, 36.8);
generalPath.lineTo(35.9, 36.8);
generalPath.lineTo(36.0, 30.3);
generalPath.lineTo(34.0, 29.199999);
generalPath.curveTo(32.0, 28.999998, 29.5, 28.3, 28.0, 28.199999);
generalPath.curveTo(26.2, 25.3, 23.2, 20.699999, 20.7, 18.199999);
generalPath.lineTo(27.6, 18.599998);
generalPath.curveTo(25.7, 14.199999, 21.0, 15.799998, 21.0, 15.799998);
generalPath.lineTo(24.2, 13.099998);
generalPath.curveTo(23.5, 12.799998, 22.900002, 12.699999, 22.300001, 12.699999);
generalPath.curveTo(19.6, 12.699999, 18.400002, 15.499999, 18.400002, 15.499999);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-74.93499755859375, 207.47500610351562), new Point2D.Double(-74.93499755859375, 231.38400268554688), new float[] {0.0f,0.005f,1.0f}, new Color[] {new Color(0, 150, 216, 255),new Color(0, 150, 216, 255),new Color(0, 95, 142, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 99.0f, 244.11099243164062f));
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
generalPath.moveTo(9.0, 49.6);
generalPath.lineTo(63.0, 49.6);
generalPath.lineTo(63.0, 45.5);
generalPath.lineTo(9.0, 45.5);
generalPath.lineTo(9.0, 49.6);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-77.51300048828125, 211.052001953125), new Point2D.Double(-48.48699951171875, 182.0240020751953), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 149, 214, 255),new Color(131, 190, 231, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 99.0f, 244.11099243164062f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.0, 60.1);
generalPath.lineTo(63.0, 60.1);
generalPath.lineTo(63.0, 56.0);
generalPath.lineTo(9.0, 56.0);
generalPath.lineTo(9.0, 60.1);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-77.51399993896484, 200.5260009765625), new Point2D.Double(-48.486000061035156, 171.4980010986328), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 149, 214, 255),new Color(131, 190, 231, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 99.0f, 244.11099243164062f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.0, 70.7);
generalPath.lineTo(63.0, 70.7);
generalPath.lineTo(63.0, 66.6);
generalPath.lineTo(9.0, 66.6);
generalPath.lineTo(9.0, 70.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-77.51399993896484, 189.99899291992188), new Point2D.Double(-48.486000061035156, 160.9709930419922), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 149, 214, 255),new Color(131, 190, 231, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 99.0f, 244.11099243164062f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.0, 81.2);
generalPath.lineTo(63.0, 81.2);
generalPath.lineTo(63.0, 77.1);
generalPath.lineTo(9.0, 77.1);
generalPath.lineTo(9.0, 81.2);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-77.51399993896484, 179.4720001220703), new Point2D.Double(-48.486000061035156, 150.4429931640625), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 147, 214, 255),new Color(102, 180, 227, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 99.0f, 244.11099243164062f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.0, 91.7);
generalPath.lineTo(63.0, 91.7);
generalPath.lineTo(63.0, 87.6);
generalPath.lineTo(9.0, 87.6);
generalPath.lineTo(9.0, 91.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(-77.51300048828125, 168.94500732421875), new Point2D.Double(-48.48699951171875, 139.91700744628906), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 135, 203, 255),new Color(74, 166, 220, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 99.0f, 244.11099243164062f));
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
	private ext_image() {
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
       ext_image base = new ext_image();
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
       ext_image base = new ext_image();
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
        return ext_image::new;
    }
}

