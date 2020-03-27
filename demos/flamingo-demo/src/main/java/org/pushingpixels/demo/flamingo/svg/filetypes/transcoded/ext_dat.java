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
public class ext_dat implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
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
generalPath.moveTo(35.8, 22.8);
generalPath.curveTo(32.0, 22.8, 28.9, 26.4, 28.9, 30.9);
generalPath.curveTo(28.9, 35.4, 32.0, 39.0, 35.8, 39.0);
generalPath.curveTo(39.6, 39.0, 42.7, 35.4, 42.7, 30.9);
generalPath.curveTo(42.7, 26.399998, 39.600002, 22.8, 35.8, 22.8);
generalPath.closePath();
generalPath.moveTo(35.8, 35.9);
generalPath.curveTo(33.7, 35.9, 31.9, 33.7, 31.9, 30.900002);
generalPath.curveTo(31.9, 28.100002, 33.6, 25.900002, 35.8, 25.900002);
generalPath.curveTo(37.899998, 25.900002, 39.7, 28.100002, 39.7, 30.900002);
generalPath.curveTo(39.600002, 33.600002, 37.9, 35.9, 35.8, 35.9);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.79399871826172, 38.97600173950195), new Point2D.Double(35.79399871826172, 22.783000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(35.79399871826172, 39.47600173950195), new Point2D.Double(35.79399871826172, 22.283000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.8, 22.8);
generalPath.curveTo(32.0, 22.8, 28.9, 26.4, 28.9, 30.9);
generalPath.curveTo(28.9, 35.4, 32.0, 39.0, 35.8, 39.0);
generalPath.curveTo(39.6, 39.0, 42.7, 35.4, 42.7, 30.9);
generalPath.curveTo(42.7, 26.399998, 39.600002, 22.8, 35.8, 22.8);
generalPath.closePath();
generalPath.moveTo(35.8, 35.9);
generalPath.curveTo(33.7, 35.9, 31.9, 33.7, 31.9, 30.900002);
generalPath.curveTo(31.9, 28.100002, 33.6, 25.900002, 35.8, 25.900002);
generalPath.curveTo(37.899998, 25.900002, 39.7, 28.100002, 39.7, 30.900002);
generalPath.curveTo(39.600002, 33.600002, 37.9, 35.9, 35.8, 35.9);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(21.8, 37.4);
generalPath.lineTo(21.8, 24.3);
generalPath.curveTo(21.8, 23.4, 21.099998, 22.8, 20.3, 22.8);
generalPath.curveTo(19.4, 22.8, 18.8, 23.5, 18.8, 24.3);
generalPath.lineTo(18.8, 37.4);
generalPath.curveTo(18.8, 38.300003, 19.5, 38.9, 20.3, 38.9);
generalPath.curveTo(21.099998, 39.0, 21.8, 38.300003, 21.8, 37.4);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(20.25, 38.97600173950195), new Point2D.Double(20.25, 22.783000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(20.25, 39.47600173950195), new Point2D.Double(20.25, 22.283000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.8, 37.4);
generalPath.lineTo(21.8, 24.3);
generalPath.curveTo(21.8, 23.4, 21.099998, 22.8, 20.3, 22.8);
generalPath.curveTo(19.4, 22.8, 18.8, 23.5, 18.8, 24.3);
generalPath.lineTo(18.8, 37.4);
generalPath.curveTo(18.8, 38.300003, 19.5, 38.9, 20.3, 38.9);
generalPath.curveTo(21.099998, 39.0, 21.8, 38.300003, 21.8, 37.4);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.2, 46.5);
generalPath.curveTo(16.400002, 46.5, 13.300001, 50.1, 13.300001, 54.6);
generalPath.curveTo(13.300001, 59.1, 16.400002, 62.699997, 20.2, 62.699997);
generalPath.curveTo(24.0, 62.699997, 27.1, 59.1, 27.1, 54.6);
generalPath.curveTo(27.2, 50.1, 24.1, 46.5, 20.2, 46.5);
generalPath.closePath();
generalPath.moveTo(20.2, 59.6);
generalPath.curveTo(18.1, 59.6, 16.300001, 57.399998, 16.300001, 54.6);
generalPath.curveTo(16.300001, 51.8, 18.000002, 49.6, 20.2, 49.6);
generalPath.curveTo(22.4, 49.6, 24.1, 51.8, 24.1, 54.6);
generalPath.curveTo(24.1, 57.3, 22.4, 59.6, 20.2, 59.6);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(20.25, 62.64899826049805), new Point2D.Double(20.25, 46.457000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(20.25, 63.14899826049805), new Point2D.Double(20.25, 45.957000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.2, 46.5);
generalPath.curveTo(16.400002, 46.5, 13.300001, 50.1, 13.300001, 54.6);
generalPath.curveTo(13.300001, 59.1, 16.400002, 62.699997, 20.2, 62.699997);
generalPath.curveTo(24.0, 62.699997, 27.1, 59.1, 27.1, 54.6);
generalPath.curveTo(27.2, 50.1, 24.1, 46.5, 20.2, 46.5);
generalPath.closePath();
generalPath.moveTo(20.2, 59.6);
generalPath.curveTo(18.1, 59.6, 16.300001, 57.399998, 16.300001, 54.6);
generalPath.curveTo(16.300001, 51.8, 18.000002, 49.6, 20.2, 49.6);
generalPath.curveTo(22.4, 49.6, 24.1, 51.8, 24.1, 54.6);
generalPath.curveTo(24.1, 57.3, 22.4, 59.6, 20.2, 59.6);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(37.3, 61.1);
generalPath.lineTo(37.3, 48.0);
generalPath.curveTo(37.3, 47.1, 36.6, 46.5, 35.8, 46.5);
generalPath.curveTo(34.899998, 46.5, 34.3, 47.2, 34.3, 48.0);
generalPath.lineTo(34.3, 61.1);
generalPath.curveTo(34.3, 62.0, 35.0, 62.6, 35.8, 62.6);
generalPath.curveTo(36.6, 62.6, 37.3, 62.0, 37.3, 61.1);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.79399871826172, 62.64899826049805), new Point2D.Double(35.79399871826172, 46.457000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(35.79399871826172, 63.14899826049805), new Point2D.Double(35.79399871826172, 45.957000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(37.3, 61.1);
generalPath.lineTo(37.3, 48.0);
generalPath.curveTo(37.3, 47.1, 36.6, 46.5, 35.8, 46.5);
generalPath.curveTo(34.899998, 46.5, 34.3, 47.2, 34.3, 48.0);
generalPath.lineTo(34.3, 61.1);
generalPath.curveTo(34.3, 62.0, 35.0, 62.6, 35.8, 62.6);
generalPath.curveTo(36.6, 62.6, 37.3, 62.0, 37.3, 61.1);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.3, 38.6);
generalPath.lineTo(53.3, 25.5);
generalPath.curveTo(53.3, 24.6, 52.6, 24.0, 51.8, 24.0);
generalPath.curveTo(50.899998, 24.0, 50.3, 24.7, 50.3, 25.5);
generalPath.lineTo(50.3, 38.6);
generalPath.curveTo(50.3, 39.5, 51.0, 40.1, 51.8, 40.1);
generalPath.curveTo(52.6, 40.1, 53.3, 39.399998, 53.3, 38.6);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(51.750999450683594, 40.11000061035156), new Point2D.Double(51.750999450683594, 23.917999267578125), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(51.750999450683594, 40.61000061035156), new Point2D.Double(51.750999450683594, 23.417999267578125), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.3, 38.6);
generalPath.lineTo(53.3, 25.5);
generalPath.curveTo(53.3, 24.6, 52.6, 24.0, 51.8, 24.0);
generalPath.curveTo(50.899998, 24.0, 50.3, 24.7, 50.3, 25.5);
generalPath.lineTo(50.3, 38.6);
generalPath.curveTo(50.3, 39.5, 51.0, 40.1, 51.8, 40.1);
generalPath.curveTo(52.6, 40.1, 53.3, 39.399998, 53.3, 38.6);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.8, 47.6);
generalPath.curveTo(48.0, 47.6, 44.899998, 51.199997, 44.899998, 55.699997);
generalPath.curveTo(44.899998, 60.199997, 47.999996, 63.799995, 51.8, 63.799995);
generalPath.curveTo(55.600002, 63.799995, 58.7, 60.199997, 58.7, 55.699997);
generalPath.curveTo(58.7, 51.199997, 55.600002, 47.6, 51.8, 47.6);
generalPath.closePath();
generalPath.moveTo(51.8, 60.699997);
generalPath.curveTo(49.7, 60.699997, 47.899998, 58.499996, 47.899998, 55.699997);
generalPath.curveTo(47.899998, 52.899998, 49.6, 50.699997, 51.8, 50.699997);
generalPath.curveTo(54.0, 50.699997, 55.7, 52.899998, 55.7, 55.699997);
generalPath.curveTo(55.600002, 58.499996, 53.9, 60.699997, 51.8, 60.699997);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(51.750999450683594, 63.78300094604492), new Point2D.Double(51.750999450683594, 47.590999603271484), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(51.750999450683594, 64.28299713134766), new Point2D.Double(51.750999450683594, 47.090999603271484), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.8, 47.6);
generalPath.curveTo(48.0, 47.6, 44.899998, 51.199997, 44.899998, 55.699997);
generalPath.curveTo(44.899998, 60.199997, 47.999996, 63.799995, 51.8, 63.799995);
generalPath.curveTo(55.600002, 63.799995, 58.7, 60.199997, 58.7, 55.699997);
generalPath.curveTo(58.7, 51.199997, 55.600002, 47.6, 51.8, 47.6);
generalPath.closePath();
generalPath.moveTo(51.8, 60.699997);
generalPath.curveTo(49.7, 60.699997, 47.899998, 58.499996, 47.899998, 55.699997);
generalPath.curveTo(47.899998, 52.899998, 49.6, 50.699997, 51.8, 50.699997);
generalPath.curveTo(54.0, 50.699997, 55.7, 52.899998, 55.7, 55.699997);
generalPath.curveTo(55.600002, 58.499996, 53.9, 60.699997, 51.8, 60.699997);
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
generalPath.moveTo(10.3, 71.5);
generalPath.lineTo(17.7, 71.5);
generalPath.curveTo(19.400002, 71.5, 20.6, 71.6, 21.5, 71.9);
generalPath.curveTo(22.7, 72.200005, 23.7, 72.9, 24.5, 73.700005);
generalPath.curveTo(25.3, 74.600006, 26.0, 75.700005, 26.4, 76.9);
generalPath.curveTo(26.8, 78.1, 27.1, 79.8, 27.1, 81.6);
generalPath.curveTo(27.1, 83.2, 26.9, 84.7, 26.5, 85.9);
generalPath.curveTo(26.0, 87.4, 25.3, 88.5, 24.4, 89.4);
generalPath.curveTo(23.699999, 90.1, 22.8, 90.6, 21.6, 91.0);
generalPath.curveTo(20.7, 91.3, 19.5, 91.4, 18.0, 91.4);
generalPath.lineTo(10.4, 91.4);
generalPath.lineTo(10.4, 71.5);
generalPath.closePath();
generalPath.moveTo(14.3, 74.9);
generalPath.lineTo(14.3, 88.200005);
generalPath.lineTo(17.3, 88.200005);
generalPath.curveTo(18.4, 88.200005, 19.199999, 88.100006, 19.699999, 88.00001);
generalPath.curveTo(20.4, 87.80001, 20.9, 87.600006, 21.3, 87.200005);
generalPath.curveTo(21.699999, 86.8, 22.099998, 86.200005, 22.4, 85.3);
generalPath.curveTo(22.7, 84.4, 22.8, 83.200005, 22.8, 81.600006);
generalPath.curveTo(22.8, 80.00001, 22.699999, 78.90001, 22.4, 78.00001);
generalPath.curveTo(22.1, 77.100006, 21.699999, 76.50001, 21.3, 76.100006);
generalPath.curveTo(20.9, 75.700005, 20.199999, 75.3, 19.4, 75.200005);
generalPath.curveTo(18.8, 75.100006, 17.699999, 75.00001, 16.1, 75.00001);
generalPath.lineTo(14.3, 75.00001);
generalPath.closePath();
generalPath.moveTo(48.6, 91.5);
generalPath.lineTo(44.199997, 91.5);
generalPath.lineTo(42.4, 87.0);
generalPath.lineTo(34.4, 87.0);
generalPath.lineTo(32.7, 91.6);
generalPath.lineTo(28.400002, 91.6);
generalPath.lineTo(36.2, 71.6);
generalPath.lineTo(40.5, 71.6);
generalPath.lineTo(48.6, 91.5);
generalPath.closePath();
generalPath.moveTo(41.1, 83.6);
generalPath.lineTo(38.3, 76.2);
generalPath.lineTo(35.6, 83.6);
generalPath.lineTo(41.1, 83.6);
generalPath.closePath();
generalPath.moveTo(53.199997, 91.5);
generalPath.lineTo(53.199997, 74.9);
generalPath.lineTo(47.299995, 74.9);
generalPath.lineTo(47.299995, 71.5);
generalPath.lineTo(63.199997, 71.5);
generalPath.lineTo(63.199997, 74.9);
generalPath.lineTo(57.299995, 74.9);
generalPath.lineTo(57.299995, 91.600006);
generalPath.lineTo(53.199997, 91.600006);
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
	private ext_dat() {
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
       ext_dat base = new ext_dat();
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
       ext_dat base = new ext_dat();
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
        return ext_dat::new;
    }
}

