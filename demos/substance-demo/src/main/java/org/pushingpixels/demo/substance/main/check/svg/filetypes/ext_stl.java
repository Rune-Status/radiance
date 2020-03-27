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
public class ext_stl implements ResizableIcon {
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
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.6);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0179998874664307), new Point2D.Double(36.20000076293945, 101.052001953125), new float[] {0.0f,0.002f,0.092f,0.186f,0.286f,0.393f,0.507f,0.633f,0.781f,1.0f}, new Color[] {new Color(0, 166, 233, 255),new Color(0, 167, 233, 255),new Color(0, 178, 236, 255),new Color(35, 189, 239, 255),new Color(102, 200, 242, 255),new Color(137, 211, 245, 255),new Color(161, 219, 248, 255),new Color(178, 226, 249, 255),new Color(188, 230, 251, 255),new Color(191, 231, 251, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.6);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 150, 219, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.6);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
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
generalPath.moveTo(45.2, 0.8);
generalPath.lineTo(72.3, 27.5);
generalPath.lineTo(45.2, 27.5);
generalPath.lineTo(45.2, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(58.77299880981445, 87.8759994506836), new Point2D.Double(49.74100112915039, 78.84500122070312), new float[] {0.0f,0.03f,0.095f,0.166f,0.241f,0.321f,0.407f,0.503f,0.614f,0.751f,1.0f}, new Color[] {new Color(0, 157, 225, 255),new Color(0, 163, 227, 255),new Color(0, 177, 231, 255),new Color(103, 192, 236, 255),new Color(146, 206, 240, 255),new Color(180, 219, 244, 255),new Color(206, 231, 248, 255),new Color(227, 240, 251, 255),new Color(241, 248, 253, 255),new Color(251, 253, 254, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 0.8);
generalPath.lineTo(72.3, 27.5);
generalPath.lineTo(45.2, 27.5);
generalPath.lineTo(45.2, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 150, 219, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.8);
generalPath.lineTo(72.3, 27.5);
generalPath.lineTo(45.2, 27.5);
generalPath.lineTo(45.2, 0.8);
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
generalPath.moveTo(12.6, 84.1);
generalPath.lineTo(16.300001, 83.7);
generalPath.curveTo(16.500002, 84.899994, 17.000002, 85.799995, 17.6, 86.399994);
generalPath.curveTo(18.300001, 86.99999, 19.2, 87.299995, 20.300001, 87.299995);
generalPath.curveTo(21.500002, 87.299995, 22.400002, 86.99999, 23.000002, 86.49999);
generalPath.curveTo(23.600002, 85.99999, 23.900002, 85.399994, 23.900002, 84.69999);
generalPath.curveTo(23.900002, 84.29999, 23.800001, 83.89999, 23.500002, 83.59999);
generalPath.curveTo(23.200003, 83.29999, 22.800001, 82.99999, 22.100002, 82.79999);
generalPath.curveTo(21.700003, 82.59999, 20.700003, 82.39999, 19.100002, 81.999985);
generalPath.curveTo(17.100002, 81.499985, 15.700003, 80.89999, 14.800002, 80.19998);
generalPath.curveTo(13.700002, 79.19998, 13.100002, 77.999985, 13.100002, 76.499985);
generalPath.curveTo(13.100002, 75.59998, 13.4000025, 74.69998, 13.9000025, 73.89999);
generalPath.curveTo(14.4000025, 73.09999, 15.200003, 72.499985, 16.200003, 71.999985);
generalPath.curveTo(17.200003, 71.59998, 18.400003, 71.39999, 19.900003, 71.39999);
generalPath.curveTo(22.200003, 71.39999, 24.000004, 71.89999, 25.200005, 72.89999);
generalPath.curveTo(26.400005, 73.89999, 27.000004, 75.29999, 27.100004, 76.999985);
generalPath.lineTo(23.300005, 77.19998);
generalPath.curveTo(23.100004, 76.29998, 22.800005, 75.59998, 22.300005, 75.19998);
generalPath.curveTo(21.800005, 74.79998, 21.000006, 74.59998, 19.900005, 74.59998);
generalPath.curveTo(18.800005, 74.59998, 17.900005, 74.79998, 17.300005, 75.29998);
generalPath.curveTo(16.900005, 75.59998, 16.700005, 75.99998, 16.700005, 76.39998);
generalPath.curveTo(16.700005, 76.79998, 16.900005, 77.19998, 17.300005, 77.49998);
generalPath.curveTo(17.800005, 77.89998, 18.900005, 78.29998, 20.800005, 78.699974);
generalPath.curveTo(22.700005, 79.09997, 24.000006, 79.599976, 24.900005, 79.99998);
generalPath.curveTo(25.800005, 80.49998, 26.500006, 81.099976, 27.000006, 81.89998);
generalPath.curveTo(27.500006, 82.69998, 27.700006, 83.69998, 27.700006, 84.79998);
generalPath.curveTo(27.700006, 85.89998, 27.400007, 86.79998, 26.800007, 87.79998);
generalPath.curveTo(26.200006, 88.69998, 25.400007, 89.39998, 24.300007, 89.89998);
generalPath.curveTo(23.200006, 90.29998, 21.900007, 90.599976, 20.200006, 90.599976);
generalPath.curveTo(17.800007, 90.599976, 16.000008, 90.099976, 14.800007, 88.99998);
generalPath.curveTo(13.600007, 87.699974, 12.800007, 86.099976, 12.600007, 84.099976);
generalPath.closePath();
generalPath.moveTo(35.1, 90.1);
generalPath.lineTo(35.1, 74.7);
generalPath.lineTo(29.599998, 74.7);
generalPath.lineTo(29.599998, 71.6);
generalPath.lineTo(44.399998, 71.6);
generalPath.lineTo(44.399998, 74.7);
generalPath.lineTo(38.899998, 74.7);
generalPath.lineTo(38.899998, 90.0);
generalPath.lineTo(35.1, 90.0);
generalPath.closePath();
generalPath.moveTo(47.0, 90.1);
generalPath.lineTo(47.0, 71.8);
generalPath.lineTo(50.8, 71.8);
generalPath.lineTo(50.8, 87.0);
generalPath.lineTo(60.199997, 87.0);
generalPath.lineTo(60.199997, 90.1);
generalPath.lineTo(47.0, 90.1);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(1.7, 9.5);
generalPath.lineTo(19.0, 22.5);
generalPath.lineTo(20.8, 20.1);
generalPath.lineTo(1.0, 5.3);
generalPath.lineTo(1.0, 9.0);
generalPath.lineTo(1.7, 9.5);
generalPath.closePath();
generalPath.moveTo(37.7, 32.8);
generalPath.lineTo(43.2, 25.699999);
generalPath.lineTo(42.0, 24.8);
generalPath.lineTo(35.4, 19.699999);
generalPath.lineTo(36.100002, 20.199999);
generalPath.lineTo(44.300003, 9.499999);
generalPath.lineTo(44.300003, 4.499999);
generalPath.lineTo(33.600002, 18.5);
generalPath.lineTo(26.500002, 13.0);
generalPath.lineTo(13.600002, 29.6);
generalPath.lineTo(20.700003, 35.0);
generalPath.lineTo(1.1, 59.9);
generalPath.lineTo(1.0, 64.2);
generalPath.lineTo(23.1, 36.799995);
generalPath.lineTo(22.2, 36.099995);
generalPath.lineTo(30.300001, 42.199993);
generalPath.lineTo(35.800003, 35.099995);
generalPath.lineTo(71.200005, 61.699997);
generalPath.lineTo(71.200005, 58.0);
generalPath.lineTo(37.7, 32.8);
generalPath.closePath();
generalPath.moveTo(29.7, 38.3);
generalPath.lineTo(17.800001, 29.3);
generalPath.lineTo(26.900002, 17.5);
generalPath.lineTo(38.800003, 26.5);
generalPath.lineTo(29.700003, 38.3);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.099998474121094, 97.4260025024414), new Point2D.Double(36.099998474121094, 37.78200149536133), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 154, 222, 255),new Color(0, 189, 242, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
        return 0.13099998235702515;
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
		return 0.7420000433921814;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 0.9999999403953552;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_stl() {
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
       ext_stl base = new ext_stl();
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
       ext_stl base = new ext_stl();
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
        return ext_stl::new;
    }
}

