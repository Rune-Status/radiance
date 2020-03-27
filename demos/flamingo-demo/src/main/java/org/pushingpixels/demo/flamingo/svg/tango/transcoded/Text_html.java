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
public class Text_html implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.56725144f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.167598009109497f, 0.0f, 0.0f, 1.0f, -4.880565166473389f, 0.17202000319957733f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.128307, 42.07798);
generalPath.curveTo(40.15366, 43.693268, 37.143654, 45.188953, 32.23805, 45.998688);
generalPath.curveTo(27.332438, 46.808426, 21.28115, 46.808426, 16.375542, 45.998688);
generalPath.curveTo(11.469933, 45.188953, 8.459927, 43.693268, 8.485281, 42.07798);
generalPath.curveTo(8.459927, 40.462692, 11.469933, 38.967007, 16.375542, 38.157272);
generalPath.curveTo(21.28115, 37.347534, 27.332438, 37.347534, 32.23805, 38.157272);
generalPath.curveTo(37.143654, 38.967007, 40.15366, 40.462692, 40.128307, 42.07798);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.306795120239258, 42.077980041503906), 15.821514f, new Point2D.Double(24.306795120239258, 42.077980041503906), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.2849160134792328f, -7.702171174545839E-16f, 30.089279174804688f));
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
shape = new RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746);
paint = new RadialGradientPaint(new Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, new Point2D.Double(33.966678619384766, 35.736915588378906), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(187, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.0411319732666016f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new RadialGradientPaint(new Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, new Point2D.Double(8.824419021606445, 3.7561285495758057), new float[] {0.0f,1.0f}, new Color[] {new Color(163, 163, 163, 255),new Color(76, 76, 76, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_1
paint = new RadialGradientPaint(new Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, new Point2D.Double(8.143556594848633, 7.26789665222168), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(248, 248, 248, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(7.666053771972656, 4.583946228027344, 32.77588653564453, 38.94638442993164, 0.2980971336364746, 0.2980971336364746);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.6464470028877258f, -0.03798932954668999f));
// _0_1_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.967081069946289f, 4.244972229003906f));
// _0_1_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.428, 113.07);
generalPath.curveTo(23.428, 115.043, 21.828, 116.642, 19.855, 116.642);
generalPath.curveTo(17.881, 116.642, 16.282, 115.042, 16.282, 113.07);
generalPath.curveTo(16.282, 111.096, 17.882, 109.497, 19.855, 109.497);
generalPath.curveTo(21.828, 109.497, 23.428, 111.097, 23.428, 113.07);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.428, 63.07);
generalPath.curveTo(23.428, 65.043, 21.828, 66.643, 19.855, 66.643);
generalPath.curveTo(17.881, 66.643, 16.282, 65.043, 16.282, 63.07);
generalPath.curveTo(16.282, 61.096, 17.882, 59.497, 19.855, 59.497);
generalPath.curveTo(21.828, 59.497, 23.428, 61.097, 23.428, 63.07);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.995011, 29.952326);
generalPath.curveTo(9.995011, 30.40553, 9.627486, 30.772825, 9.174282, 30.772825);
generalPath.curveTo(8.720848, 30.772825, 8.353554, 30.4053, 8.353554, 29.952326);
generalPath.curveTo(8.353554, 29.498892, 8.721078, 29.131598, 9.174282, 29.131598);
generalPath.curveTo(9.627486, 29.131598, 9.995011, 29.499123, 9.995011, 29.952326);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(20.892099380493164, 114.56839752197266), 5.256f, new Point2D.Double(20.892099380493164, 114.56839752197266), new float[] {0.0f,1.0f}, new Color[] {new Color(240, 240, 240, 255),new Color(154, 154, 154, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.995011, 18.467176);
generalPath.curveTo(9.995011, 18.92038, 9.627486, 19.287905, 9.174282, 19.287905);
generalPath.curveTo(8.720848, 19.287905, 8.353554, 18.92038, 8.353554, 18.467176);
generalPath.curveTo(8.353554, 18.013742, 8.721078, 17.646446, 9.174282, 17.646446);
generalPath.curveTo(9.627486, 17.646446, 9.995011, 18.013971, 9.995011, 18.467176);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(20.892099380493164, 64.56790161132812), 5.257f, new Point2D.Double(20.892099380493164, 64.56790161132812), new float[] {0.0f,1.0f}, new Color[] {new Color(240, 240, 240, 255),new Color(154, 154, 154, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_3
paint = new Color(0, 0, 0, 4);
stroke = new BasicStroke(0.9885531f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.505723, 5.4942765);
generalPath.lineTo(11.505723, 43.400867);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_4
paint = new Color(255, 255, 255, 52);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(12.5, 5.0205154);
generalPath.lineTo(12.5, 43.038227);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9090909957885742f, 0.0f, 0.0f, 1.0f, 2.3636279106140137f, 0.0f));
// _0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0
shape = new RoundRectangle2D.Double(15.000001907348633, 9.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1
shape = new RoundRectangle2D.Double(15.000001907348633, 11.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_2
shape = new RoundRectangle2D.Double(15.000001907348633, 13.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3
shape = new RoundRectangle2D.Double(15.000001907348633, 15.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4
shape = new RoundRectangle2D.Double(15.000001907348633, 17.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_5
shape = new RoundRectangle2D.Double(15.000001907348633, 19.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6
shape = new RoundRectangle2D.Double(15.000001907348633, 21.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_7
shape = new RoundRectangle2D.Double(15.000001907348633, 23.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_8
shape = new RoundRectangle2D.Double(14.999992370605469, 25.0, 9.900005340576172, 1.0, 0.1364084780216217, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_9
shape = new RoundRectangle2D.Double(14.999992370605469, 29.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_10
shape = new RoundRectangle2D.Double(14.999992370605469, 31.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_11
shape = new RoundRectangle2D.Double(14.999992370605469, 33.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_12
shape = new RoundRectangle2D.Double(14.999992370605469, 35.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_13
shape = new RoundRectangle2D.Double(14.999992370605469, 37.0, 15.40001392364502, 1.0, 0.21219104528427124, 0.13078175485134125);
paint = new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.1605110168457031f, 0.0f, 0.0f, 1.1605110168457031f, 1.8477129936218262f, 3.119486093521118f));
// _0_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.5871359705924988f, 0.0f, 0.0f, 0.7299540042877197f, 11.299189567565918f, 4.3983588218688965f));
// _0_2_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.052803, 38.908627);
generalPath.curveTo(45.08518, 41.587196, 41.241596, 44.06744, 34.97745, 45.410194);
generalPath.curveTo(28.713305, 46.75295, 20.9862, 46.75295, 14.722055, 45.410194);
generalPath.curveTo(8.45791, 44.06744, 4.6143265, 41.587196, 4.646702, 38.908627);
generalPath.curveTo(4.6143265, 36.230057, 8.45791, 33.749813, 14.722055, 32.40706);
generalPath.curveTo(20.9862, 31.064304, 28.713305, 31.064304, 34.97745, 32.40706);
generalPath.curveTo(41.241596, 33.749813, 45.08518, 36.230057, 45.052803, 38.908627);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(15.115513801574707, 63.965389251708984), 12.289036f, new Point2D.Double(15.115513801574707, 63.965389251708984), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.6439900398254395f, 0.0f, 0.0f, 0.6082760095596313f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(37.109608, 24.218857);
generalPath.curveTo(37.109608, 30.50692, 32.012028, 35.60444, 25.72483, 35.60444);
generalPath.curveTo(19.437057, 35.60444, 14.339767, 30.50686, 14.339767, 24.218857);
generalPath.curveTo(14.339767, 17.931082, 19.437057, 12.834081, 25.72483, 12.834081);
generalPath.curveTo(32.012028, 12.834081, 37.109608, 17.931082, 37.109608, 24.218857);
generalPath.lineTo(37.109608, 24.218857);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.247644424438477, 15.716078758239746), 29.99335f, new Point2D.Double(18.247644424438477, 15.716078758239746), new float[] {0.0f,0.15517241f,0.75f,1.0f}, new Color[] {new Color(211, 233, 255, 255),new Color(211, 233, 255, 255),new Color(64, 116, 174, 255),new Color(54, 72, 108, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.5871300101280212f, 0.0f, 0.0f, 0.5871419906616211f, 11.299189567565918f, 10.429670333862305f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(57, 57, 108, 255);
stroke = new BasicStroke(1.7233788f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(37.109608, 24.218857);
generalPath.curveTo(37.109608, 30.50692, 32.012028, 35.60444, 25.72483, 35.60444);
generalPath.curveTo(19.437057, 35.60444, 14.339767, 30.50686, 14.339767, 24.218857);
generalPath.curveTo(14.339767, 17.931082, 19.437057, 12.834081, 25.72483, 12.834081);
generalPath.curveTo(32.012028, 12.834081, 37.109608, 17.931082, 37.109608, 24.218857);
generalPath.lineTo(37.109608, 24.218857);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.42159382f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.49080899357795715f, 0.0f, 0.0f, 0.5871359705924988f, 17.104129791259766f, 10.429670333862305f));
// _0_2_1_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.708637, 15.271057);
generalPath.curveTo(30.729357, 18.601171, 28.269464, 21.684715, 24.26041, 23.354086);
generalPath.curveTo(20.251358, 25.023458, 15.306011, 25.023458, 11.296958, 23.354086);
generalPath.curveTo(7.287905, 21.684715, 4.8280115, 18.601171, 4.848732, 15.271057);
generalPath.curveTo(4.8280115, 11.940943, 7.287905, 8.857399, 11.296958, 7.1880274);
generalPath.curveTo(15.306011, 5.5186563, 20.251358, 5.5186563, 24.26041, 7.1880274);
generalPath.curveTo(28.269464, 8.857399, 30.729357, 11.940943, 30.708637, 15.271057);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(11.82690715789795, 10.476452827453613), 32.66485f, new Point2D.Double(11.82690715789795, 10.476452827453613), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.179535984992981f, 0.0f, 0.0f, 0.8477910161018372f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.5767859816551208f, 0.0f, 0.0f, 0.5767859816551208f, 11.370280265808105f, 10.56641960144043f));
// _0_2_1_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.0713, 20.7144);
generalPath.curveTo(44.0713, 20.9771, 44.0713, 20.7144, 44.0713, 20.7144);
generalPath.lineTo(43.5264, 21.3316);
generalPath.curveTo(43.1924, 20.938, 42.8174, 20.607, 42.4366, 20.2613);
generalPath.lineTo(41.6007, 20.3843);
generalPath.lineTo(40.837, 19.521);
generalPath.lineTo(40.837, 20.5894);
generalPath.lineTo(41.4913, 21.0845);
generalPath.lineTo(41.9268, 21.5777);
generalPath.lineTo(42.5088, 20.9195);
generalPath.curveTo(42.6553, 21.1939, 42.7998, 21.4683, 42.9453, 21.7427);
generalPath.lineTo(42.9453, 22.565);
generalPath.lineTo(42.29, 23.3052);
generalPath.lineTo(41.0908, 24.1284);
generalPath.lineTo(40.1826, 25.0347);
generalPath.lineTo(39.6006, 24.3745);
generalPath.lineTo(39.8916, 23.6343);
generalPath.lineTo(39.3105, 22.9761);
generalPath.lineTo(38.3291, 20.8784);
generalPath.lineTo(37.4932, 19.9331);
generalPath.lineTo(37.2744, 20.1792);
generalPath.lineTo(37.6025, 21.3726);
generalPath.lineTo(38.2197, 22.0718);
generalPath.curveTo(38.5722, 23.0894, 38.9209, 24.062, 39.3838, 25.0347);
generalPath.curveTo(40.1016, 25.0347, 40.7783, 24.9585, 41.4912, 24.8687);
generalPath.lineTo(41.4912, 25.4449);
generalPath.lineTo(40.6191, 27.5841);
generalPath.lineTo(39.8193, 28.4884);
generalPath.lineTo(39.165, 29.8888);
generalPath.curveTo(39.165, 30.6564, 39.165, 31.424, 39.165, 32.1915);
generalPath.lineTo(39.3838, 33.0978);
generalPath.lineTo(39.0205, 33.508);
generalPath.lineTo(38.2197, 34.0021);
generalPath.lineTo(37.3838, 34.7013);
generalPath.lineTo(38.0752, 35.4826);
generalPath.lineTo(37.1299, 36.3068);
generalPath.lineTo(37.3115, 36.84);
generalPath.lineTo(35.8935, 38.4455);
generalPath.lineTo(34.9492, 38.4455);
generalPath.lineTo(34.1494, 38.9396);
generalPath.lineTo(33.6396, 38.9396);
generalPath.lineTo(33.6396, 38.2814);
generalPath.lineTo(33.4228, 36.963);
generalPath.curveTo(33.1415, 36.1368, 32.8486, 35.3165, 32.5507, 34.4962);
generalPath.curveTo(32.5507, 33.8907, 32.5868, 33.2911, 32.623, 32.6857);
generalPath.lineTo(32.9873, 31.8634);
generalPath.lineTo(32.4775, 30.8751);
generalPath.lineTo(32.5146, 29.5177);
generalPath.lineTo(31.8232, 28.7364);
generalPath.lineTo(32.1689, 27.6055);
generalPath.lineTo(31.6064, 26.9673);
generalPath.lineTo(30.624, 26.9673);
generalPath.lineTo(30.2969, 26.5972);
generalPath.lineTo(29.3155, 27.2149);
generalPath.lineTo(28.9161, 26.7613);
generalPath.lineTo(28.0069, 27.543);
generalPath.curveTo(27.3897, 26.8433, 26.7715, 26.1441, 26.1534, 25.4449);
generalPath.lineTo(25.4268, 23.7164);
generalPath.lineTo(26.0811, 22.7301);
generalPath.lineTo(25.7178, 22.319);
generalPath.lineTo(26.5166, 20.4254);
generalPath.curveTo(27.1729, 19.609, 27.8584, 18.8258, 28.5518, 18.0397);
generalPath.lineTo(29.7881, 17.7106);
generalPath.lineTo(31.169, 17.5465);
generalPath.lineTo(32.1143, 17.7936);
generalPath.lineTo(33.459, 19.15);
generalPath.lineTo(33.9317, 18.6158);
generalPath.lineTo(34.585, 18.5338);
generalPath.lineTo(35.8213, 18.9449);
generalPath.lineTo(36.7666, 18.9449);
generalPath.lineTo(37.4209, 18.3687);
generalPath.lineTo(37.7119, 17.9576);
generalPath.lineTo(37.0566, 17.5465);
generalPath.lineTo(35.9658, 17.4645);
generalPath.curveTo(35.6631, 17.0446, 35.3818, 16.6032, 35.0224, 16.2301);
generalPath.lineTo(34.6581, 16.3942);
generalPath.lineTo(34.5126, 17.4645);
generalPath.lineTo(33.8583, 16.7243);
generalPath.lineTo(33.7138, 15.9001);
generalPath.lineTo(32.9872, 15.3259);
generalPath.lineTo(32.6952, 15.3259);
generalPath.lineTo(33.4227, 16.1482);
generalPath.lineTo(33.1317, 16.8884);
generalPath.lineTo(32.5506, 17.0525);
generalPath.lineTo(32.9139, 16.3123);
generalPath.lineTo(32.2586, 15.9842);
generalPath.lineTo(31.6785, 15.326);
generalPath.lineTo(30.5867, 15.5721);
generalPath.lineTo(30.4422, 15.9002);
generalPath.lineTo(29.7879, 16.3123);
generalPath.lineTo(29.4246, 17.2176);
generalPath.lineTo(28.5164, 17.6697);
generalPath.lineTo(28.116, 17.2176);
generalPath.lineTo(27.6805, 17.2176);
generalPath.lineTo(27.6805, 15.7362);
generalPath.lineTo(28.6258, 15.2421);
generalPath.lineTo(29.3524, 15.2421);
generalPath.lineTo(29.2059, 14.6669);
generalPath.lineTo(28.6258, 14.0907);
generalPath.lineTo(29.6063, 13.8846);
generalPath.lineTo(30.1512, 13.2684);
generalPath.lineTo(30.5867, 12.5272);
generalPath.lineTo(31.3875, 12.5272);
generalPath.lineTo(31.1687, 11.952);
generalPath.lineTo(31.6785, 11.6229);
generalPath.lineTo(31.6785, 12.2811);
generalPath.lineTo(32.7683, 12.5272);
generalPath.lineTo(33.8581, 11.6229);
generalPath.lineTo(33.9313, 11.2108);
generalPath.lineTo(34.8756, 10.5531);
generalPath.curveTo(34.5338, 10.5956, 34.192, 10.6268, 33.858, 10.7177);
generalPath.lineTo(33.858, 9.9766);
generalPath.lineTo(34.2213, 9.1538);
generalPath.lineTo(33.858, 9.1538);
generalPath.lineTo(33.0596, 9.894);
generalPath.lineTo(32.8408, 10.3056);
generalPath.lineTo(33.0596, 10.8823);
generalPath.lineTo(32.6953, 11.8686);
generalPath.lineTo(32.1142, 11.5395);
generalPath.lineTo(31.6064, 10.9643);
generalPath.lineTo(30.8056, 11.5395);
generalPath.lineTo(30.5146, 10.2236);
generalPath.lineTo(31.8955, 9.3188);
generalPath.lineTo(31.8955, 8.8247);
generalPath.lineTo(32.7685, 8.249001);
generalPath.lineTo(34.1494, 7.9194);
generalPath.lineTo(35.0947, 8.249001);
generalPath.lineTo(36.8388, 8.5781);
generalPath.lineTo(36.4033, 9.0713005);
generalPath.lineTo(35.458, 9.0713005);
generalPath.lineTo(36.4033, 10.0586);
generalPath.lineTo(37.1299, 9.2363);
generalPath.lineTo(37.3506, 8.8745);
generalPath.curveTo(37.3506, 8.8745, 40.1377, 11.3725, 41.7305, 14.105);
generalPath.curveTo(43.3233, 16.8384, 44.0713, 20.0601, 44.0713, 20.7144);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_1_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.0703, 9.2363);
generalPath.lineTo(25.9971, 9.7295);
generalPath.lineTo(26.5069, 10.0586);
generalPath.lineTo(27.378, 9.4829);
generalPath.lineTo(26.9425, 8.9892);
generalPath.lineTo(26.3605, 9.3188);
generalPath.lineTo(26.0705, 9.2363);
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.8701, 5.8633);
generalPath.lineTo(24.9795, 5.1226);
generalPath.lineTo(22.7998, 5.3692);
generalPath.lineTo(20.1094, 6.1094);
generalPath.lineTo(19.6006, 6.6035);
generalPath.lineTo(21.2725, 7.7549);
generalPath.lineTo(21.2725, 8.4131);
generalPath.lineTo(20.6182, 9.0713005);
generalPath.lineTo(21.4912, 10.8003);
generalPath.lineTo(22.0713, 10.4702);
generalPath.lineTo(22.7998, 9.3188);
generalPath.curveTo(23.9228, 8.971601, 24.9297, 8.5781, 25.9971, 8.0844);
generalPath.lineTo(26.8701, 5.8632);
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_3_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.833, 12.7749);
generalPath.lineTo(28.542, 12.0337);
generalPath.lineTo(28.0322, 12.1987);
generalPath.lineTo(28.1787, 13.103);
generalPath.lineTo(28.833, 12.7749);
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_4_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.123, 12.6089);
generalPath.lineTo(28.9775, 13.5972);
generalPath.lineTo(29.7773, 13.4322);
generalPath.lineTo(30.3584, 12.857);
generalPath.lineTo(29.8496, 12.3629);
generalPath.curveTo(29.6787, 11.9078, 29.4824, 11.483, 29.2685, 11.0465);
generalPath.lineTo(28.833, 11.0465);
generalPath.lineTo(28.833, 11.5397);
generalPath.lineTo(29.123, 11.8688);
generalPath.lineTo(29.123, 12.609);
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_5_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_5_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.3652, 28.2422);
generalPath.lineTo(17.7832, 27.0899);
generalPath.lineTo(16.6929, 26.8433);
generalPath.lineTo(16.1114, 25.2808);
generalPath.lineTo(14.6578, 25.4449);
generalPath.lineTo(13.4224, 24.5406);
generalPath.lineTo(12.1133, 25.692);
generalPath.lineTo(12.1133, 25.8736);
generalPath.curveTo(11.7173, 25.7593, 11.2305, 25.7437, 10.8779, 25.5269);
generalPath.lineTo(10.5869, 24.7046);
generalPath.lineTo(10.5869, 23.7993);
generalPath.lineTo(9.7148, 23.8813);
generalPath.curveTo(9.7876005, 23.3051, 9.8598, 22.7299, 9.9331, 22.1538);
generalPath.lineTo(9.4238, 22.1538);
generalPath.lineTo(8.9155, 22.812);
generalPath.lineTo(8.4062, 23.0581);
generalPath.lineTo(7.6791, 22.6479);
generalPath.lineTo(7.6063, 21.7426);
generalPath.lineTo(7.7518, 20.7553);
generalPath.lineTo(8.8426, 19.933);
generalPath.lineTo(9.7147, 19.933);
generalPath.lineTo(9.8597, 19.4389);
generalPath.lineTo(10.95, 19.685);
generalPath.lineTo(11.7498, 20.6733);
generalPath.lineTo(11.8953, 19.0268);
generalPath.lineTo(13.2766, 17.8754);
generalPath.lineTo(13.7854, 16.641);
generalPath.lineTo(14.803, 16.2299);
generalPath.lineTo(15.3845, 15.4076);
generalPath.lineTo(16.6926, 15.1596);
generalPath.lineTo(17.3474, 14.1733);
generalPath.curveTo(16.6931, 14.1733, 16.0388, 14.1733, 15.3845, 14.1733);
generalPath.lineTo(16.6203, 13.5971);
generalPath.lineTo(17.4919, 13.5971);
generalPath.lineTo(18.7282, 13.185);
generalPath.lineTo(18.8737, 12.6928);
generalPath.lineTo(18.4372, 12.2807);
generalPath.lineTo(17.9284, 12.1157);
generalPath.lineTo(18.0739, 11.6225);
generalPath.lineTo(17.7106, 10.8823);
generalPath.lineTo(16.838, 11.2104);
generalPath.lineTo(16.9835, 10.5527);
generalPath.lineTo(15.9659, 9.9765005);
generalPath.lineTo(15.1666, 11.3744);
generalPath.lineTo(15.2389, 11.8685);
generalPath.lineTo(14.4396, 12.1986);
generalPath.lineTo(13.9303, 13.2679);
generalPath.lineTo(13.7125, 12.2806);
generalPath.lineTo(12.3312, 11.7044);
generalPath.lineTo(12.1129, 10.9642);
generalPath.lineTo(13.9303, 9.8939);
generalPath.lineTo(14.7301, 9.1537);
generalPath.lineTo(14.8029, 8.2489);
generalPath.lineTo(14.3669, 8.001801);
generalPath.lineTo(13.7854, 7.9193);
generalPath.lineTo(13.4221, 8.8246);
generalPath.curveTo(13.4221, 8.8246, 12.8142, 8.9437, 12.6579, 8.9823);
generalPath.curveTo(10.6618, 10.8217, 6.6286, 14.7924, 5.6916, 22.2885);
generalPath.curveTo(5.7287, 22.4623, 6.3708, 23.4701, 6.3708, 23.4701);
generalPath.lineTo(7.8972, 24.3744);
generalPath.lineTo(9.4236, 24.7865);
generalPath.lineTo(10.0784, 25.6097);
generalPath.lineTo(11.0955, 26.3499);
generalPath.lineTo(11.677, 26.2679);
generalPath.lineTo(12.113, 26.4642);
generalPath.lineTo(12.113, 26.597);
generalPath.lineTo(11.5319, 28.16);
generalPath.lineTo(11.0954, 28.8182);
generalPath.lineTo(11.2409, 29.1483);
generalPath.lineTo(10.8776, 30.3807);
generalPath.lineTo(12.1862, 32.7674);
generalPath.lineTo(13.4943, 33.9197);
generalPath.lineTo(14.0763, 34.742);
generalPath.lineTo(14.0031, 36.4705);
generalPath.lineTo(14.4396, 37.4568);
generalPath.lineTo(14.0031, 39.3494);
generalPath.curveTo(14.0031, 39.3494, 13.9689, 39.3377, 14.0246, 39.5271);
generalPath.curveTo(14.0808, 39.7166, 16.3537, 40.9783, 16.4982, 40.8709);
generalPath.curveTo(16.6422, 40.7615, 16.7653, 40.6658, 16.7653, 40.6658);
generalPath.lineTo(16.6203, 40.2556);
generalPath.lineTo(17.2014, 39.6794);
generalPath.lineTo(17.4197, 39.1032);
generalPath.lineTo(18.365, 38.7731);
generalPath.lineTo(19.0916, 36.9626);
generalPath.lineTo(18.8738, 36.4704);
generalPath.lineTo(19.3816, 35.7302);
generalPath.lineTo(20.4724, 35.4822);
generalPath.lineTo(21.0544, 34.1658);
generalPath.lineTo(20.9089, 32.5213);
generalPath.lineTo(21.781, 31.2869);
generalPath.lineTo(21.9265, 30.0525);
generalPath.curveTo(20.7331, 29.4607, 19.5495, 28.8513, 18.365, 28.242);
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_6_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_6_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.7656, 9.5649);
generalPath.lineTo(17.4922, 10.0586);
generalPath.lineTo(18.0742, 10.0586);
generalPath.lineTo(18.0742, 9.4829);
generalPath.lineTo(17.3476, 9.1538);
generalPath.lineTo(16.7656, 9.5649);
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_7_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_7_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.876, 8.9072);
generalPath.lineTo(14.5122, 9.812);
generalPath.lineTo(15.2393, 9.812);
generalPath.lineTo(15.6031, 8.9892);
generalPath.curveTo(15.9166, 8.7675, 16.2286, 8.5444, 16.5479, 8.331);
generalPath.lineTo(17.275, 8.5781);
generalPath.curveTo(17.7594, 8.9072, 18.2438, 9.2363, 18.7286, 9.5649);
generalPath.lineTo(19.4561, 8.9072);
generalPath.lineTo(18.6558, 8.5781);
generalPath.lineTo(18.292, 7.8374);
generalPath.lineTo(16.9111, 7.6728);
generalPath.lineTo(16.8383, 7.2612);
generalPath.lineTo(16.184, 7.4262);
generalPath.lineTo(15.8936, 8.002);
generalPath.lineTo(15.5298, 7.2613);
generalPath.lineTo(15.3848, 7.5904);
generalPath.lineTo(15.4576, 8.4132);
generalPath.lineTo(14.876, 8.9072);
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_8
g.setComposite(AlphaComposite.getInstance(3, 0.75f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_8_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_8_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_8_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_8_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_9
g.setComposite(AlphaComposite.getInstance(3, 0.75f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_9_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_9_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_9_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_9_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_10_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_10_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.4922, 6.8496003);
generalPath.lineTo(17.856, 6.521);

}

private void _paint1(Graphics2D g,float origAlpha) {
generalPath.lineTo(18.5831, 6.3564);
generalPath.curveTo(19.0811, 6.1142, 19.5811, 5.9511, 20.1095, 5.7802);
generalPath.lineTo(19.8195, 5.2865);
generalPath.lineTo(18.881, 5.4213);
generalPath.lineTo(18.4376, 5.8632);
generalPath.lineTo(17.7066, 5.9692);
generalPath.lineTo(17.0567, 6.2744);
generalPath.lineTo(16.7408, 6.4272);
generalPath.lineTo(16.5479, 6.6855);
generalPath.lineTo(17.4922, 6.8496003);
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_11_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_11_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.7285, 14.6665);
generalPath.lineTo(19.165, 14.0083);
generalPath.lineTo(18.5102, 13.5151);
generalPath.lineTo(18.7285, 14.6665);
shape = generalPath;
paint = new Color(0, 0, 0, 182);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.5767859816551208f, 0.0f, 0.0f, 0.5767859816551208f, 11.251660346984863f, 10.447799682617188f));
// _0_2_1_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.0713, 20.7144);
generalPath.curveTo(44.0713, 20.9771, 44.0713, 20.7144, 44.0713, 20.7144);
generalPath.lineTo(43.5264, 21.3316);
generalPath.curveTo(43.1924, 20.938, 42.8174, 20.607, 42.4366, 20.2613);
generalPath.lineTo(41.6007, 20.3843);
generalPath.lineTo(40.837, 19.521);
generalPath.lineTo(40.837, 20.5894);
generalPath.lineTo(41.4913, 21.0845);
generalPath.lineTo(41.9268, 21.5777);
generalPath.lineTo(42.5088, 20.9195);
generalPath.curveTo(42.6553, 21.1939, 42.7998, 21.4683, 42.9453, 21.7427);
generalPath.lineTo(42.9453, 22.565);
generalPath.lineTo(42.29, 23.3052);
generalPath.lineTo(41.0908, 24.1284);
generalPath.lineTo(40.1826, 25.0347);
generalPath.lineTo(39.6006, 24.3745);
generalPath.lineTo(39.8916, 23.6343);
generalPath.lineTo(39.3105, 22.9761);
generalPath.lineTo(38.3291, 20.8784);
generalPath.lineTo(37.4932, 19.9331);
generalPath.lineTo(37.2744, 20.1792);
generalPath.lineTo(37.6025, 21.3726);
generalPath.lineTo(38.2197, 22.0718);
generalPath.curveTo(38.5722, 23.0894, 38.9209, 24.062, 39.3838, 25.0347);
generalPath.curveTo(40.1016, 25.0347, 40.7783, 24.9585, 41.4912, 24.8687);
generalPath.lineTo(41.4912, 25.4449);
generalPath.lineTo(40.6191, 27.5841);
generalPath.lineTo(39.8193, 28.4884);
generalPath.lineTo(39.165, 29.8888);
generalPath.curveTo(39.165, 30.6564, 39.165, 31.424, 39.165, 32.1915);
generalPath.lineTo(39.3838, 33.0978);
generalPath.lineTo(39.0205, 33.508);
generalPath.lineTo(38.2197, 34.0021);
generalPath.lineTo(37.3838, 34.7013);
generalPath.lineTo(38.0752, 35.4826);
generalPath.lineTo(37.1299, 36.3068);
generalPath.lineTo(37.3115, 36.84);
generalPath.lineTo(35.8935, 38.4455);
generalPath.lineTo(34.9492, 38.4455);
generalPath.lineTo(34.1494, 38.9396);
generalPath.lineTo(33.6396, 38.9396);
generalPath.lineTo(33.6396, 38.2814);
generalPath.lineTo(33.4228, 36.963);
generalPath.curveTo(33.1415, 36.1368, 32.8486, 35.3165, 32.5507, 34.4962);
generalPath.curveTo(32.5507, 33.8907, 32.5868, 33.2911, 32.623, 32.6857);
generalPath.lineTo(32.9873, 31.8634);
generalPath.lineTo(32.4775, 30.8751);
generalPath.lineTo(32.5146, 29.5177);
generalPath.lineTo(31.8232, 28.7364);
generalPath.lineTo(32.1689, 27.6055);
generalPath.lineTo(31.6064, 26.9673);
generalPath.lineTo(30.624, 26.9673);
generalPath.lineTo(30.2969, 26.5972);
generalPath.lineTo(29.3155, 27.2149);
generalPath.lineTo(28.9161, 26.7613);
generalPath.lineTo(28.0069, 27.543);
generalPath.curveTo(27.3897, 26.8433, 26.7715, 26.1441, 26.1534, 25.4449);
generalPath.lineTo(25.4268, 23.7164);
generalPath.lineTo(26.0811, 22.7301);
generalPath.lineTo(25.7178, 22.319);
generalPath.lineTo(26.5166, 20.4254);
generalPath.curveTo(27.1729, 19.609, 27.8584, 18.8258, 28.5518, 18.0397);
generalPath.lineTo(29.7881, 17.7106);
generalPath.lineTo(31.169, 17.5465);
generalPath.lineTo(32.1143, 17.7936);
generalPath.lineTo(33.459, 19.15);
generalPath.lineTo(33.9317, 18.6158);
generalPath.lineTo(34.585, 18.5338);
generalPath.lineTo(35.8213, 18.9449);
generalPath.lineTo(36.7666, 18.9449);
generalPath.lineTo(37.4209, 18.3687);
generalPath.lineTo(37.7119, 17.9576);
generalPath.lineTo(37.0566, 17.5465);
generalPath.lineTo(35.9658, 17.4645);
generalPath.curveTo(35.6631, 17.0446, 35.3818, 16.6032, 35.0224, 16.2301);
generalPath.lineTo(34.6581, 16.3942);
generalPath.lineTo(34.5126, 17.4645);
generalPath.lineTo(33.8583, 16.7243);
generalPath.lineTo(33.7138, 15.9001);
generalPath.lineTo(32.9872, 15.3259);
generalPath.lineTo(32.6952, 15.3259);
generalPath.lineTo(33.4227, 16.1482);
generalPath.lineTo(33.1317, 16.8884);
generalPath.lineTo(32.5506, 17.0525);
generalPath.lineTo(32.9139, 16.3123);
generalPath.lineTo(32.2586, 15.9842);
generalPath.lineTo(31.6785, 15.326);
generalPath.lineTo(30.5867, 15.5721);
generalPath.lineTo(30.4422, 15.9002);
generalPath.lineTo(29.7879, 16.3123);
generalPath.lineTo(29.4246, 17.2176);
generalPath.lineTo(28.5164, 17.6697);
generalPath.lineTo(28.116, 17.2176);
generalPath.lineTo(27.6805, 17.2176);
generalPath.lineTo(27.6805, 15.7362);
generalPath.lineTo(28.6258, 15.2421);
generalPath.lineTo(29.3524, 15.2421);
generalPath.lineTo(29.2059, 14.6669);
generalPath.lineTo(28.6258, 14.0907);
generalPath.lineTo(29.6063, 13.8846);
generalPath.lineTo(30.1512, 13.2684);
generalPath.lineTo(30.5867, 12.5272);
generalPath.lineTo(31.3875, 12.5272);
generalPath.lineTo(31.1687, 11.952);
generalPath.lineTo(31.6785, 11.6229);
generalPath.lineTo(31.6785, 12.2811);
generalPath.lineTo(32.7683, 12.5272);
generalPath.lineTo(33.8581, 11.6229);
generalPath.lineTo(33.9313, 11.2108);
generalPath.lineTo(34.8756, 10.5531);
generalPath.curveTo(34.5338, 10.5956, 34.192, 10.6268, 33.858, 10.7177);
generalPath.lineTo(33.858, 9.9766);
generalPath.lineTo(34.2213, 9.1538);
generalPath.lineTo(33.858, 9.1538);
generalPath.lineTo(33.0596, 9.894);
generalPath.lineTo(32.8408, 10.3056);
generalPath.lineTo(33.0596, 10.8823);
generalPath.lineTo(32.6953, 11.8686);
generalPath.lineTo(32.1142, 11.5395);
generalPath.lineTo(31.6064, 10.9643);
generalPath.lineTo(30.8056, 11.5395);
generalPath.lineTo(30.5146, 10.2236);
generalPath.lineTo(31.8955, 9.3188);
generalPath.lineTo(31.8955, 8.8247);
generalPath.lineTo(32.7685, 8.249001);
generalPath.lineTo(34.1494, 7.9194);
generalPath.lineTo(35.0947, 8.249001);
generalPath.lineTo(36.8388, 8.5781);
generalPath.lineTo(36.4033, 9.0713005);
generalPath.lineTo(35.458, 9.0713005);
generalPath.lineTo(36.4033, 10.0586);
generalPath.lineTo(37.1299, 9.2363);
generalPath.lineTo(37.3506, 8.8745);
generalPath.curveTo(37.3506, 8.8745, 40.1377, 11.3725, 41.7305, 14.105);
generalPath.curveTo(43.3233, 16.8384, 44.0713, 20.0601, 44.0713, 20.7144);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_1_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.0703, 9.2363);
generalPath.lineTo(25.9971, 9.7295);
generalPath.lineTo(26.5069, 10.0586);
generalPath.lineTo(27.378, 9.4829);
generalPath.lineTo(26.9425, 8.9892);
generalPath.lineTo(26.3605, 9.3188);
generalPath.lineTo(26.0705, 9.2363);
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.8701, 5.8633);
generalPath.lineTo(24.9795, 5.1226);
generalPath.lineTo(22.7998, 5.3692);
generalPath.lineTo(20.1094, 6.1094);
generalPath.lineTo(19.6006, 6.6035);
generalPath.lineTo(21.2725, 7.7549);
generalPath.lineTo(21.2725, 8.4131);
generalPath.lineTo(20.6182, 9.0713005);
generalPath.lineTo(21.4912, 10.8003);
generalPath.lineTo(22.0713, 10.4702);
generalPath.lineTo(22.7998, 9.3188);
generalPath.curveTo(23.9228, 8.971601, 24.9297, 8.5781, 25.9971, 8.0844);
generalPath.lineTo(26.8701, 5.8632);
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_3_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.833, 12.7749);
generalPath.lineTo(28.542, 12.0337);
generalPath.lineTo(28.0322, 12.1987);
generalPath.lineTo(28.1787, 13.103);
generalPath.lineTo(28.833, 12.7749);
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_4_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.123, 12.6089);
generalPath.lineTo(28.9775, 13.5972);
generalPath.lineTo(29.7773, 13.4322);
generalPath.lineTo(30.3584, 12.857);
generalPath.lineTo(29.8496, 12.3629);
generalPath.curveTo(29.6787, 11.9078, 29.4824, 11.483, 29.2685, 11.0465);
generalPath.lineTo(28.833, 11.0465);
generalPath.lineTo(28.833, 11.5397);
generalPath.lineTo(29.123, 11.8688);
generalPath.lineTo(29.123, 12.609);
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_5_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_5_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.3652, 28.2422);
generalPath.lineTo(17.7832, 27.0899);
generalPath.lineTo(16.6929, 26.8433);
generalPath.lineTo(16.1114, 25.2808);
generalPath.lineTo(14.6578, 25.4449);
generalPath.lineTo(13.4224, 24.5406);
generalPath.lineTo(12.1133, 25.692);
generalPath.lineTo(12.1133, 25.8736);
generalPath.curveTo(11.7173, 25.7593, 11.2305, 25.7437, 10.8779, 25.5269);
generalPath.lineTo(10.5869, 24.7046);
generalPath.lineTo(10.5869, 23.7993);
generalPath.lineTo(9.7148, 23.8813);
generalPath.curveTo(9.7876005, 23.3051, 9.8598, 22.7299, 9.9331, 22.1538);
generalPath.lineTo(9.4238, 22.1538);
generalPath.lineTo(8.9155, 22.812);
generalPath.lineTo(8.4062, 23.0581);
generalPath.lineTo(7.6791, 22.6479);
generalPath.lineTo(7.6063, 21.7426);
generalPath.lineTo(7.7518, 20.7553);
generalPath.lineTo(8.8426, 19.933);
generalPath.lineTo(9.7147, 19.933);
generalPath.lineTo(9.8597, 19.4389);
generalPath.lineTo(10.95, 19.685);
generalPath.lineTo(11.7498, 20.6733);
generalPath.lineTo(11.8953, 19.0268);
generalPath.lineTo(13.2766, 17.8754);
generalPath.lineTo(13.7854, 16.641);
generalPath.lineTo(14.803, 16.2299);
generalPath.lineTo(15.3845, 15.4076);
generalPath.lineTo(16.6926, 15.1596);
generalPath.lineTo(17.3474, 14.1733);
generalPath.curveTo(16.6931, 14.1733, 16.0388, 14.1733, 15.3845, 14.1733);
generalPath.lineTo(16.6203, 13.5971);
generalPath.lineTo(17.4919, 13.5971);
generalPath.lineTo(18.7282, 13.185);
generalPath.lineTo(18.8737, 12.6928);
generalPath.lineTo(18.4372, 12.2807);
generalPath.lineTo(17.9284, 12.1157);
generalPath.lineTo(18.0739, 11.6225);
generalPath.lineTo(17.7106, 10.8823);
generalPath.lineTo(16.838, 11.2104);
generalPath.lineTo(16.9835, 10.5527);
generalPath.lineTo(15.9659, 9.9765005);
generalPath.lineTo(15.1666, 11.3744);
generalPath.lineTo(15.2389, 11.8685);
generalPath.lineTo(14.4396, 12.1986);
generalPath.lineTo(13.9303, 13.2679);
generalPath.lineTo(13.7125, 12.2806);
generalPath.lineTo(12.3312, 11.7044);
generalPath.lineTo(12.1129, 10.9642);
generalPath.lineTo(13.9303, 9.8939);
generalPath.lineTo(14.7301, 9.1537);
generalPath.lineTo(14.8029, 8.2489);
generalPath.lineTo(14.3669, 8.001801);
generalPath.lineTo(13.7854, 7.9193);
generalPath.lineTo(13.4221, 8.8246);
generalPath.curveTo(13.4221, 8.8246, 12.8142, 8.9437, 12.6579, 8.9823);
generalPath.curveTo(10.6618, 10.8217, 6.6286, 14.7924, 5.6916, 22.2885);
generalPath.curveTo(5.7287, 22.4623, 6.3708, 23.4701, 6.3708, 23.4701);
generalPath.lineTo(7.8972, 24.3744);
generalPath.lineTo(9.4236, 24.7865);
generalPath.lineTo(10.0784, 25.6097);
generalPath.lineTo(11.0955, 26.3499);
generalPath.lineTo(11.677, 26.2679);
generalPath.lineTo(12.113, 26.4642);
generalPath.lineTo(12.113, 26.597);
generalPath.lineTo(11.5319, 28.16);
generalPath.lineTo(11.0954, 28.8182);
generalPath.lineTo(11.2409, 29.1483);
generalPath.lineTo(10.8776, 30.3807);
generalPath.lineTo(12.1862, 32.7674);
generalPath.lineTo(13.4943, 33.9197);
generalPath.lineTo(14.0763, 34.742);
generalPath.lineTo(14.0031, 36.4705);
generalPath.lineTo(14.4396, 37.4568);
generalPath.lineTo(14.0031, 39.3494);
generalPath.curveTo(14.0031, 39.3494, 13.9689, 39.3377, 14.0246, 39.5271);
generalPath.curveTo(14.0808, 39.7166, 16.3537, 40.9783, 16.4982, 40.8709);
generalPath.curveTo(16.6422, 40.7615, 16.7653, 40.6658, 16.7653, 40.6658);
generalPath.lineTo(16.6203, 40.2556);
generalPath.lineTo(17.2014, 39.6794);
generalPath.lineTo(17.4197, 39.1032);
generalPath.lineTo(18.365, 38.7731);
generalPath.lineTo(19.0916, 36.9626);
generalPath.lineTo(18.8738, 36.4704);
generalPath.lineTo(19.3816, 35.7302);
generalPath.lineTo(20.4724, 35.4822);
generalPath.lineTo(21.0544, 34.1658);
generalPath.lineTo(20.9089, 32.5213);
generalPath.lineTo(21.781, 31.2869);
generalPath.lineTo(21.9265, 30.0525);
generalPath.curveTo(20.7331, 29.4607, 19.5495, 28.8513, 18.365, 28.242);
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_6_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_6_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.7656, 9.5649);
generalPath.lineTo(17.4922, 10.0586);
generalPath.lineTo(18.0742, 10.0586);
generalPath.lineTo(18.0742, 9.4829);
generalPath.lineTo(17.3476, 9.1538);
generalPath.lineTo(16.7656, 9.5649);
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_7_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_7_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.876, 8.9072);
generalPath.lineTo(14.5122, 9.812);
generalPath.lineTo(15.2393, 9.812);
generalPath.lineTo(15.6031, 8.9892);
generalPath.curveTo(15.9166, 8.7675, 16.2286, 8.5444, 16.5479, 8.331);
generalPath.lineTo(17.275, 8.5781);
generalPath.curveTo(17.7594, 8.9072, 18.2438, 9.2363, 18.7286, 9.5649);
generalPath.lineTo(19.4561, 8.9072);
generalPath.lineTo(18.6558, 8.5781);
generalPath.lineTo(18.292, 7.8374);
generalPath.lineTo(16.9111, 7.6728);
generalPath.lineTo(16.8383, 7.2612);
generalPath.lineTo(16.184, 7.4262);
generalPath.lineTo(15.8936, 8.002);
generalPath.lineTo(15.5298, 7.2613);
generalPath.lineTo(15.3848, 7.5904);
generalPath.lineTo(15.4576, 8.4132);
generalPath.lineTo(14.876, 8.9072);
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_8
g.setComposite(AlphaComposite.getInstance(3, 0.75f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_8_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_8_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_8_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_8_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_9
g.setComposite(AlphaComposite.getInstance(3, 0.75f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_9_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_9_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_9_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_9_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_10
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_10_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_10_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.4922, 6.8496003);
generalPath.lineTo(17.856, 6.521);
generalPath.lineTo(18.5831, 6.3564);
generalPath.curveTo(19.0811, 6.1142, 19.5811, 5.9511, 20.1095, 5.7802);
generalPath.lineTo(19.8195, 5.2865);
generalPath.lineTo(18.881, 5.4213);
generalPath.lineTo(18.4376, 5.8632);
generalPath.lineTo(17.7066, 5.9692);
generalPath.lineTo(17.0567, 6.2744);
generalPath.lineTo(16.7408, 6.4272);
generalPath.lineTo(16.5479, 6.6855);
generalPath.lineTo(17.4922, 6.8496003);
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_11_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_11_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.7285, 14.6665);
generalPath.lineTo(19.165, 14.0083);
generalPath.lineTo(18.5102, 13.5151);
generalPath.lineTo(18.7285, 14.6665);
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(18.633779525756836, 17.486207962036133), 40.692665f, new Point2D.Double(18.93430519104004, 17.810213088989258), new float[] {0.0f,0.37931034f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(254, 254, 254, 255),new Color(29, 29, 29, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.036821961402893f, 0.0f, 0.0f, 0.9644860029220581f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_5
paint = new RadialGradientPaint(new Point2D.Double(15.601279258728027, 12.142301559448242), 43.526714f, new Point2D.Double(15.601279258728027, 12.142301559448242), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 42)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.5871300101280212f, 0.0f, 0.0f, 0.5871419906616211f, 11.299189567565918f, 10.429670333862305f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.531418, 24.218876);
generalPath.curveTo(36.531418, 30.187597, 31.692724, 35.026237, 25.724825, 35.026237);
generalPath.curveTo(19.756376, 35.026237, 14.917956, 30.187544, 14.917956, 24.218876);
generalPath.curveTo(14.917956, 18.25043, 19.756376, 13.412282, 25.724825, 13.412282);
generalPath.curveTo(31.692724, 13.412282, 36.531418, 18.25043, 36.531418, 24.218876);
generalPath.lineTo(36.531418, 24.218876);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
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
_paint1(g, origAlpha);


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
        return 4.997228145599365;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.1464462280273438;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 40.916595458984375;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 44.6827278137207;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Text_html() {
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
       Text_html base = new Text_html();
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
       Text_html base = new Text_html();
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
        return Text_html::new;
    }
}

