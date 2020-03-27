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
public class Applications_other implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.1863800287246704f, 0.0f, 0.0f, 1.1863800287246704f, -4.539687156677246f, -7.794678211212158f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.285713, 38.714287);
generalPath.curveTo(44.31765, 42.239277, 40.526283, 45.503265, 34.347244, 47.27033);
generalPath.curveTo(28.168203, 49.037388, 20.546082, 49.037388, 14.367041, 47.27033);
generalPath.curveTo(8.188001, 45.503265, 4.396636, 42.239277, 4.4285717, 38.714287);
generalPath.curveTo(4.396636, 35.189297, 8.188001, 31.925306, 14.367041, 30.158247);
generalPath.curveTo(20.546082, 28.391186, 28.168203, 28.391186, 34.347244, 30.158247);
generalPath.curveTo(40.526283, 31.925306, 44.31765, 35.189297, 44.285713, 38.714287);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(14.287617683410645, 68.87297058105469), 11.68987f, new Point2D.Double(14.287617683410645, 72.56800079345703), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 83),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.399258017539978f, -2.2344450201217114E-7f, 8.196177958552653E-8f, 0.513264000415802f, 4.365074157714844f, 4.839284896850586f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(24.2858, 43.196358);
generalPath.lineTo(4.3751874, 23.285744);
generalPath.lineTo(24.2858, 3.375129);
generalPath.lineTo(44.196415, 23.285744);
generalPath.lineTo(24.2858, 43.196358);
generalPath.lineTo(24.2858, 43.196358);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.28580093383789, 36.72077178955078), 20.410614f, new Point2D.Double(24.28580093383789, 36.72077178955078), new float[] {0.0f,1.0f}, new Color[] {new Color(252, 175, 62, 255),new Color(211, 127, 3, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.7278729677200317f, -1.5237149729209637E-23f, 1.384133924351158E-23f, 1.7278729677200317f, -17.676979064941406f, -26.728050231933594f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(245, 121, 0, 255);
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(24.2858, 43.196358);
generalPath.lineTo(4.3751874, 23.285744);
generalPath.lineTo(24.2858, 3.375129);
generalPath.lineTo(44.196415, 23.285744);
generalPath.lineTo(24.2858, 43.196358);
generalPath.lineTo(24.2858, 43.196358);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(39.439934, 19.376677);
generalPath.lineTo(38.70148, 20.400862);
generalPath.curveTo(38.06473, 20.132368, 37.400864, 19.915792, 36.715298, 19.755976);
generalPath.lineTo(36.72111, 18.179117);
generalPath.curveTo(36.293385, 18.090782, 35.8581, 18.022982, 35.417007, 17.974747);
generalPath.lineTo(34.93523, 19.476637);
generalPath.curveTo(34.59119, 19.448158, 34.24347, 19.432468, 33.891872, 19.432468);
generalPath.curveTo(33.54066, 19.432468, 33.192745, 19.447966, 32.848705, 19.476637);
generalPath.lineTo(32.36693, 17.974747);
generalPath.curveTo(31.925642, 18.022982, 31.490555, 18.090782, 31.062826, 18.179117);
generalPath.lineTo(31.06883, 19.756168);
generalPath.curveTo(30.383074, 19.915792, 29.719398, 20.132368, 29.08265, 20.400862);
generalPath.lineTo(28.16017, 19.121359);
generalPath.curveTo(27.757816, 19.303453, 27.365927, 19.50395, 26.985273, 19.721882);
generalPath.lineTo(27.47809, 21.219896);
generalPath.curveTo(26.880861, 21.582148, 26.316368, 21.993216, 25.79062, 22.447868);
generalPath.lineTo(24.518478, 21.51609);
generalPath.curveTo(24.19284, 21.812672, 23.88115, 22.124363, 23.584763, 22.45);
generalPath.lineTo(24.516348, 23.721947);
generalPath.curveTo(24.0615, 24.247696, 23.650433, 24.811995, 23.288181, 25.409613);
generalPath.lineTo(21.790167, 24.916601);
generalPath.curveTo(21.572235, 25.29745, 21.371544, 25.689533, 21.189838, 26.091688);
generalPath.lineTo(22.469147, 27.013975);
generalPath.curveTo(22.200653, 27.650724, 21.984077, 28.314594, 21.824066, 29.000353);
generalPath.lineTo(20.247404, 28.994541);
generalPath.curveTo(20.15907, 29.422268, 20.091267, 29.857552, 20.043226, 30.29884);
generalPath.lineTo(21.544922, 30.780613);
generalPath.curveTo(21.516056, 31.12446, 21.500753, 31.472378, 21.500753, 31.82378);
generalPath.curveTo(21.500753, 32.175182, 21.516445, 32.522903, 21.544922, 32.86714);
generalPath.lineTo(20.043226, 33.348915);
generalPath.curveTo(20.091072, 33.79001, 20.159264, 34.225098, 20.24721, 34.65302);
generalPath.lineTo(21.82426, 34.647015);
generalPath.curveTo(21.984077, 35.33277, 22.200653, 35.99664, 22.468952, 36.633194);
generalPath.lineTo(21.189644, 37.555485);
generalPath.curveTo(21.371351, 37.957836, 21.572235, 38.349724, 21.78978, 38.73057);
generalPath.lineTo(23.287989, 38.23756);
generalPath.curveTo(23.65024, 38.834988, 24.061308, 39.399284, 24.51596, 39.92484);
generalPath.lineTo(23.584375, 41.19698);
generalPath.curveTo(23.862747, 41.50286, 24.155453, 41.794987, 24.459784, 42.0751);
generalPath.lineTo(43.29878, 23.23591);
generalPath.lineTo(42.291836, 22.22897);
generalPath.lineTo(41.993122, 22.447676);
generalPath.curveTo(41.467377, 21.993023, 40.903076, 21.581953, 40.305653, 21.219704);
generalPath.lineTo(40.547607, 20.484547);
generalPath.lineTo(39.439545, 19.376484);
generalPath.lineTo(39.439934, 19.376677);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.916729, 14.330733);
generalPath.curveTo(19.916729, 20.815414, 15.682846, 26.310202, 9.82949, 28.204756);
generalPath.lineTo(12.056461, 30.431923);
generalPath.curveTo(12.073315, 30.424948, 12.09036, 30.418943, 12.10702, 30.411776);
generalPath.lineTo(12.288533, 30.663609);
generalPath.lineTo(13.700537, 32.07561);
generalPath.curveTo(14.163716, 31.856712, 14.617207, 31.621153, 15.059852, 31.367964);
generalPath.lineTo(14.365763, 29.258772);
generalPath.curveTo(15.207077, 28.749102, 16.00151, 28.17008, 16.74151, 27.530039);
generalPath.lineTo(18.53262, 28.841698);
generalPath.curveTo(18.99134, 28.424238, 19.429916, 27.985662, 19.847183, 27.527134);
generalPath.lineTo(18.535719, 25.73622);
generalPath.curveTo(19.17576, 24.996023, 19.754587, 24.201591, 20.26445, 23.360472);
generalPath.lineTo(22.373837, 24.05456);
generalPath.curveTo(22.68049, 23.518156, 22.96293, 22.966255, 23.21883, 22.399828);
generalPath.lineTo(21.417648, 21.101536);
generalPath.curveTo(21.795591, 20.205206, 22.1005, 19.270521, 22.325407, 18.305035);
generalPath.lineTo(24.545406, 18.313559);
generalPath.curveTo(24.669579, 17.711292, 24.765274, 17.09837, 24.832882, 16.477507);
generalPath.lineTo(22.718458, 15.799109);
generalPath.curveTo(22.758753, 15.314816, 22.78045, 14.825099, 22.78045, 14.330539);
generalPath.curveTo(22.78045, 13.835786, 22.758753, 13.346069, 22.718458, 12.861776);
generalPath.lineTo(24.832882, 12.18396);
generalPath.curveTo(24.765274, 11.562709, 24.669579, 10.949981, 24.545212, 10.347714);
generalPath.lineTo(22.325407, 10.356044);
generalPath.curveTo(22.1005, 9.390556, 21.795591, 8.455872, 21.417648, 7.559541);
generalPath.lineTo(23.21883, 6.2610555);
generalPath.curveTo(23.076448, 5.946265, 22.924961, 5.636124, 22.766695, 5.330632);
generalPath.lineTo(18.962671, 9.134269);
generalPath.curveTo(19.578691, 10.748514, 19.916922, 12.500106, 19.916922, 14.330539);
generalPath.lineTo(19.916729, 14.330733);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.47252747f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_3
paint = new LinearGradientPaint(new Point2D.Double(26.50260353088379, 10.027483940124512), new Point2D.Double(28.786495208740234, 52.80744552612305), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(24.285791, 41.605354);
generalPath.lineTo(5.9661765, 23.285736);
generalPath.lineTo(24.285791, 4.966119);
generalPath.lineTo(42.605408, 23.285736);
generalPath.lineTo(24.285791, 41.605354);
generalPath.lineTo(24.285791, 41.605354);
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
        return 0.676393985748291;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 2.8263134956359863;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 47.323604583740234;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 45.17368698120117;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Applications_other() {
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
       Applications_other base = new Applications_other();
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
       Applications_other base = new Applications_other();
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
        return Applications_other::new;
    }
}

