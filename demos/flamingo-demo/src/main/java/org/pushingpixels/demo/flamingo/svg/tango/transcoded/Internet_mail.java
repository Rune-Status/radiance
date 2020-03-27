package org.pushingpixels.demo.flamingo.svg.tango.transcoded;

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
public class Internet_mail implements ResizableIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.4557f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.8006000518798828f, 0.0f, 0.0f, 1.9747999906539917f, 1.083899974822998f, -38.01300048828125f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.5, 38.7);
generalPath.curveTo(26.522034, 40.061657, 23.90613, 41.322495, 19.642813, 42.00509);
generalPath.curveTo(15.379496, 42.68768, 10.120504, 42.68768, 5.8571877, 42.00509);
generalPath.curveTo(1.5938711, 41.322495, -1.0220345, 40.061657, -1.0, 38.7);
generalPath.curveTo(-1.0220345, 37.338345, 1.5938711, 36.077507, 5.8571877, 35.394913);
generalPath.curveTo(10.120504, 34.712322, 15.379496, 34.712322, 19.642813, 35.394913);
generalPath.curveTo(23.90613, 36.077507, 26.522034, 37.338345, 26.5, 38.7);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(6.702700138092041, 73.61599731445312), 7.2284f, new Point2D.Double(6.702700138092041, 73.61599731445312), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9021999835968018f, 0.0f, 0.0f, 0.5256999731063843f, 0.0f, 0.0f));
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
generalPath.moveTo(6.3334, 16.972);
generalPath.lineTo(6.3334, 41.482002);
generalPath.lineTo(43.3064, 41.482002);
generalPath.lineTo(43.2444, 17.090002);
generalPath.curveTo(43.2414, 15.712002, 31.3964, 2.4120016, 29.2114, 2.4120016);
generalPath.lineTo(20.659399, 2.4121015);
generalPath.curveTo(18.3624, 2.4121015, 6.333399, 15.674102, 6.333399, 16.972101);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(11.572999954223633, 4.746200084686279), new Point2D.Double(18.475000381469727, 26.023000717163086), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(226, 226, 226, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.343500018119812f, 0.0f, 0.0f, 1.4178999662399292f, 2.879499912261963f, 0.31459999084472656f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(2.0618999004364014, 15.256999969482422), new Point2D.Double(30.600000381469727, 15.256999969482422), new float[] {0.0f,1.0f}, new Color[] {new Color(152, 150, 144, 255),new Color(101, 100, 96, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.343500018119812f, 0.0f, 0.0f, 1.4178999662399292f, 2.879499912261963f, 0.31459999084472656f));
stroke = new BasicStroke(0.8566f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.3334, 16.972);
generalPath.lineTo(6.3334, 41.482002);
generalPath.lineTo(43.3064, 41.482002);
generalPath.lineTo(43.2444, 17.090002);
generalPath.curveTo(43.2414, 15.712002, 31.3964, 2.4120016, 29.2114, 2.4120016);
generalPath.lineTo(20.659399, 2.4121015);
generalPath.curveTo(18.3624, 2.4121015, 6.333399, 15.674102, 6.333399, 16.972101);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.9231, 16.787);
generalPath.curveTo(6.525, 16.357, 18.8101, 3.0930004, 20.6671, 3.0930004);
generalPath.lineTo(29.043102, 3.0935004);
generalPath.curveTo(30.790102, 3.0935004, 43.0801, 16.2215, 42.4701, 16.9795);
generalPath.lineTo(31.6091, 30.474499);
generalPath.lineTo(19.295101, 30.156498);
generalPath.lineTo(6.9231014, 16.786499);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(5.826600074768066, 7.231100082397461), new Point2D.Double(13.467000007629395, 17.87700080871582), new float[] {0.0f,1.0f}, new Color[] {new Color(237, 237, 237, 255),new Color(200, 200, 200, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.5706000328063965f, 0.0f, 0.0f, 1.190999984741211f, 2.879499912261963f, 0.34299999475479126f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.078, 30.018);
generalPath.lineTo(11.744999, 21.272);
generalPath.lineTo(36.563, 14.3359995);
generalPath.lineTo(39.592, 20.552);
generalPath.lineTo(32.176, 29.992);
shape = generalPath;
paint = new Color(0, 0, 0, 37);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.292, 29.836);
generalPath.lineTo(10.809, 21.026001);
generalPath.lineTo(35.457, 14.133001);
generalPath.lineTo(38.631, 20.404001);
generalPath.lineTo(31.39, 29.811);
shape = generalPath;
paint = new Color(0, 0, 0, 37);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.775, 29.957);
generalPath.lineTo(11.099999, 21.297);
generalPath.lineTo(36.068, 14.232);
generalPath.lineTo(39.354, 20.825);
generalPath.lineTo(31.874, 29.932001);
shape = generalPath;
paint = new Color(0, 0, 0, 37);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.594, 30.441);
generalPath.lineTo(11.261, 21.695);
generalPath.lineTo(35.973, 14.801);
generalPath.lineTo(39.083, 21.189);
generalPath.lineTo(31.963001, 30.175);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(10.184000015258789, 15.14799976348877), new Point2D.Double(15.310999870300293, 29.569000244140625), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(220, 220, 220, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8193000555038452f, 0.0f, 0.0f, 1.0282000303268433f, 2.879499912261963f, 0.34299999475479126f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.488, 29.064);
generalPath.lineTo(7.092001, 40.036);
generalPath.lineTo(21.001001, 30.432);
generalPath.lineTo(30.019001, 30.432);
generalPath.lineTo(42.439003, 39.914);
generalPath.lineTo(30.575003, 29.064001);
generalPath.lineTo(20.488003, 29.064001);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(8.915599822998047, 37.196998596191406), new Point2D.Double(9.885499954223633, 52.090999603271484), new float[] {0.0f,1.0f}, new Color[] {new Color(154, 162, 154, 255),new Color(181, 190, 181, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.4547998905181885f, 0.0f, 0.0f, 0.7620000243186951f, 2.879499912261963f, 0.34299999475479126f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.9635, 16.885);
generalPath.lineTo(18.4795, 31.201);
generalPath.lineTo(19.5475, 30.347);
generalPath.lineTo(6.963501, 16.885);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(8.915599822998047, 37.196998596191406), new Point2D.Double(9.885499954223633, 52.090999603271484), new float[] {0.0f,1.0f}, new Color[] {new Color(154, 162, 154, 255),new Color(181, 190, 181, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.4547998905181885f, 0.0f, 0.0f, 0.7620000243186951f, 2.879499912261963f, 0.34299999475479126f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_9
paint = new LinearGradientPaint(new Point2D.Double(11.232999801635742, 13.685999870300293), new Point2D.Double(21.11199951171875, 24.132999420166016), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(237, 237, 237, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.37090003490448f, 0.0f, 0.0f, 1.4437999725341797f, 2.4310998916625977f, -0.14079000055789948f));
stroke = new BasicStroke(0.8566f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.3077, 17.131);
generalPath.lineTo(7.3389, 40.342003);
generalPath.lineTo(42.2839, 40.342003);
generalPath.lineTo(42.2209, 17.258003);
generalPath.curveTo(42.218903, 16.508003, 31.004902, 3.4590034, 28.836903, 3.4590034);
generalPath.lineTo(20.941902, 3.4592035);
generalPath.curveTo(18.688902, 3.4592035, 7.306902, 16.351204, 7.3079023, 17.131203);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.957, 30.453);
generalPath.lineTo(9.016001, 38.724);
generalPath.lineTo(11.235001, 38.73);
generalPath.lineTo(21.233002, 31.861);
generalPath.lineTo(30.055, 30.438);
generalPath.lineTo(20.957, 30.453);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.428, 21.67);
generalPath.lineTo(12.752001, 23.081);
generalPath.lineTo(35.543, 16.196999);
generalPath.lineTo(38.458, 21.878998);
generalPath.lineTo(39.072, 21.166998);
generalPath.lineTo(36.003, 14.788998);
generalPath.lineTo(11.427998, 21.669998);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.308, 23.636);
generalPath.lineTo(19.334, 30.09);
generalPath.lineTo(20.531, 29.064);
generalPath.lineTo(30.618, 29.106998);
generalPath.lineTo(31.43, 29.833998);
generalPath.lineTo(35.405, 25.089998);
generalPath.curveTo(34.251, 23.678999, 13.307999, 23.635998, 13.307999, 23.635998);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(8.780400276184082, 37.78499984741211), new Point2D.Double(9.761899948120117, 32.202999114990234), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 33),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.39490008354187f, 0.0f, 0.0f, 0.781059980392456f, 2.879499912261963f, 0.34299999475479126f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(41.813, 17.848);
generalPath.lineTo(31.861, 30.479);
generalPath.lineTo(30.793, 29.624);
generalPath.lineTo(41.813, 17.848);
generalPath.closePath();
shape = generalPath;
paint = new Color(177, 177, 177, 255);
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
        return 0.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 1.9837015867233276;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 48.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 44.30292510986328;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Internet_mail() {
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
       Internet_mail base = new Internet_mail();
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
       Internet_mail base = new Internet_mail();
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
        return Internet_mail::new;
    }
}

