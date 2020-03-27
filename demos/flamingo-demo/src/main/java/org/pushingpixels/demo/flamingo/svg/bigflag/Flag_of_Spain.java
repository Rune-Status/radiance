package org.pushingpixels.demo.flamingo.svg.bigflag;

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
public class Flag_of_Spain implements ResizableIcon {
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
shape = new Rectangle2D.Double(0.0, 0.0, 750.0, 500.0);
paint = new Color(198, 11, 30, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new Rectangle2D.Double(0.0, 125.0, 750.0, 250.0);
paint = new Color(255, 196, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.99, 222.24);
generalPath.curveTo(167.99, 222.24, 167.48001, 222.24, 167.20001, 222.08);
generalPath.curveTo(166.92001, 221.92, 166.07, 221.12, 166.07, 221.12);
generalPath.lineTo(165.39001, 220.62999);
generalPath.lineTo(164.77002, 219.77998);
generalPath.curveTo(164.77002, 219.77998, 164.04002, 218.59999, 164.37003, 217.68999);
generalPath.curveTo(164.71002, 216.77998, 165.28003, 216.45999, 165.79002, 216.18999);
generalPath.curveTo(166.30002, 215.93, 167.37003, 215.59999, 167.37003, 215.59999);
generalPath.curveTo(167.37003, 215.59999, 168.22003, 215.23, 168.50003, 215.18);
generalPath.curveTo(168.78003, 215.12, 169.80003, 214.85999, 169.80003, 214.85999);
generalPath.curveTo(169.80003, 214.85999, 170.08003, 214.69998, 170.36003, 214.58998);
generalPath.curveTo(170.65002, 214.47998, 171.04002, 214.47998, 171.27003, 214.42998);
generalPath.curveTo(171.49004, 214.36998, 172.06003, 214.18997, 172.40004, 214.16998);
generalPath.curveTo(172.92004, 214.14998, 173.76004, 214.26999, 174.04004, 214.26999);
generalPath.curveTo(174.32004, 214.26999, 175.28004, 214.31999, 175.68004, 214.31999);
generalPath.curveTo(176.07004, 214.31999, 177.48004, 214.20999, 177.88004, 214.20999);
generalPath.curveTo(178.27003, 214.20999, 178.56003, 214.15999, 179.01004, 214.20999);
generalPath.curveTo(179.46004, 214.26999, 180.25005, 214.53, 180.48004, 214.63998);
generalPath.curveTo(180.71004, 214.74997, 182.06004, 215.22998, 182.57004, 215.38998);
generalPath.curveTo(183.08003, 215.54999, 184.32004, 215.75998, 184.89005, 216.02998);
generalPath.curveTo(185.45004, 216.29999, 185.80005, 216.74998, 186.08005, 217.12999);
generalPath.curveTo(186.36005, 217.49998, 186.42004, 217.90999, 186.53004, 218.18);
generalPath.curveTo(186.64005, 218.43999, 186.64005, 219.01999, 186.53004, 219.29);
generalPath.curveTo(186.42004, 219.54999, 186.02005, 220.09999, 186.02005, 220.09999);
generalPath.lineTo(185.40005, 221.12);
generalPath.lineTo(184.61006, 221.76);
generalPath.curveTo(184.61006, 221.76, 184.04005, 222.29999, 183.59006, 222.23999);
generalPath.curveTo(183.14006, 222.2, 178.56006, 221.37999, 175.62006, 221.37999);
generalPath.curveTo(172.68005, 221.37999, 167.98006, 222.23999, 167.98006, 222.23999);
generalPath.lineTo(167.99005, 222.23999);
generalPath.closePath();
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.99, 222.24);
generalPath.curveTo(167.99, 222.24, 167.48001, 222.24, 167.20001, 222.08);
generalPath.curveTo(166.92001, 221.92, 166.07, 221.12, 166.07, 221.12);
generalPath.lineTo(165.39001, 220.62999);
generalPath.lineTo(164.77002, 219.77998);
generalPath.curveTo(164.77002, 219.77998, 164.04002, 218.59999, 164.37003, 217.68999);
generalPath.curveTo(164.71002, 216.77998, 165.28003, 216.45999, 165.79002, 216.18999);
generalPath.curveTo(166.30002, 215.93, 167.37003, 215.59999, 167.37003, 215.59999);
generalPath.curveTo(167.37003, 215.59999, 168.22003, 215.23, 168.50003, 215.18);
generalPath.curveTo(168.78003, 215.12, 169.80003, 214.85999, 169.80003, 214.85999);
generalPath.curveTo(169.80003, 214.85999, 170.08003, 214.69998, 170.36003, 214.58998);
generalPath.curveTo(170.65002, 214.47998, 171.04002, 214.47998, 171.27003, 214.42998);
generalPath.curveTo(171.49004, 214.36998, 172.06003, 214.18997, 172.40004, 214.16998);
generalPath.curveTo(172.92004, 214.14998, 173.76004, 214.26999, 174.04004, 214.26999);
generalPath.curveTo(174.32004, 214.26999, 175.28004, 214.31999, 175.68004, 214.31999);
generalPath.curveTo(176.07004, 214.31999, 177.48004, 214.20999, 177.88004, 214.20999);
generalPath.curveTo(178.27003, 214.20999, 178.56003, 214.15999, 179.01004, 214.20999);
generalPath.curveTo(179.46004, 214.26999, 180.25005, 214.53, 180.48004, 214.63998);
generalPath.curveTo(180.71004, 214.74997, 182.06004, 215.22998, 182.57004, 215.38998);
generalPath.curveTo(183.08003, 215.54999, 184.32004, 215.75998, 184.89005, 216.02998);
generalPath.curveTo(185.45004, 216.29999, 185.80005, 216.74998, 186.08005, 217.12999);
generalPath.curveTo(186.36005, 217.49998, 186.42004, 217.90999, 186.53004, 218.18);
generalPath.curveTo(186.64005, 218.43999, 186.64005, 219.01999, 186.53004, 219.29);
generalPath.curveTo(186.42004, 219.54999, 186.02005, 220.09999, 186.02005, 220.09999);
generalPath.lineTo(185.40005, 221.12);
generalPath.lineTo(184.61006, 221.76);
generalPath.curveTo(184.61006, 221.76, 184.04005, 222.29999, 183.59006, 222.23999);
generalPath.curveTo(183.14006, 222.2, 178.56006, 221.37999, 175.62006, 221.37999);
generalPath.curveTo(172.68005, 221.37999, 167.98006, 222.23999, 167.98006, 222.23999);
generalPath.lineTo(167.99005, 222.23999);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_1_0
shape = new Ellipse2D.Double(174.27999877929688, 213.17999267578125, 2.759999990463257, 5.0);
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(174.27999877929688, 213.17999267578125, 2.759999990463257, 5.0);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_1_1
shape = new Ellipse2D.Double(175.0399932861328, 213.37998962402344, 1.2799999713897705, 4.599999904632568);
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(175.0399932861328, 213.37998962402344, 1.2799999713897705, 4.599999904632568);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_1_2
shape = new Ellipse2D.Double(174.75, 212.1699981689453, 1.8600000143051147, 1.7400000095367432);
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_1_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(176.96, 212.74);
generalPath.lineTo(176.96, 213.32);
generalPath.lineTo(174.43001, 213.32);
generalPath.lineTo(174.43001, 212.74);
generalPath.lineTo(175.37001, 212.74);
generalPath.lineTo(175.37001, 211.42);
generalPath.lineTo(174.75002, 211.42);
generalPath.lineTo(174.75002, 210.84999);
generalPath.lineTo(175.37001, 210.84999);
generalPath.lineTo(175.37001, 210.27998);
generalPath.lineTo(175.97002, 210.27998);
generalPath.lineTo(175.97002, 210.84999);
generalPath.lineTo(176.59001, 210.84999);
generalPath.lineTo(176.59001, 211.42);
generalPath.lineTo(175.97002, 211.42);
generalPath.lineTo(175.97002, 212.74);
generalPath.lineTo(176.96002, 212.74);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(176.96, 212.74);
generalPath.lineTo(176.96, 213.32);
generalPath.lineTo(174.43001, 213.32);
generalPath.lineTo(174.43001, 212.74);
generalPath.lineTo(175.37001, 212.74);
generalPath.lineTo(175.37001, 211.42);
generalPath.lineTo(174.75002, 211.42);
generalPath.lineTo(174.75002, 210.84999);
generalPath.lineTo(175.37001, 210.84999);
generalPath.lineTo(175.37001, 210.27998);
generalPath.lineTo(175.97002, 210.27998);
generalPath.lineTo(175.97002, 210.84999);
generalPath.lineTo(176.59001, 210.84999);
generalPath.lineTo(176.59001, 211.42);
generalPath.lineTo(175.97002, 211.42);
generalPath.lineTo(175.97002, 212.74);
generalPath.lineTo(176.96002, 212.74);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_1_4
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.94, 212.2);
generalPath.curveTo(176.38776, 212.3169, 176.67447, 212.72514, 176.6114, 213.156);
generalPath.curveTo(176.54834, 213.58685, 176.15488, 213.90797, 175.69, 213.90797);
generalPath.curveTo(175.22513, 213.90797, 174.83167, 213.58685, 174.7686, 213.156);
generalPath.curveTo(174.70554, 212.72514, 174.99225, 212.3169, 175.44, 212.2);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_1_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.68, 222.08);
generalPath.lineTo(170.87, 222.08);
generalPath.lineTo(170.76, 220.90001);
generalPath.lineTo(170.53, 219.67001);
generalPath.lineTo(170.3, 218.14001);
generalPath.curveTo(168.97, 216.39001, 167.75, 215.24002, 167.34, 215.49002);
generalPath.curveTo(167.44, 215.17001, 167.56, 214.93002, 167.81, 214.78001);
generalPath.curveTo(168.98999, 214.08002, 171.42, 215.76001, 173.25, 218.52002);
generalPath.curveTo(173.41, 218.77002, 173.57, 219.02002, 173.71, 219.27002);
generalPath.lineTo(177.68001, 219.27002);
generalPath.curveTo(177.82, 219.02002, 177.98001, 218.77002, 178.14001, 218.52002);
generalPath.curveTo(179.96002, 215.76003, 182.40001, 214.08002, 183.57, 214.78001);
generalPath.curveTo(183.83, 214.93001, 183.94, 215.17001, 184.04001, 215.49002);
generalPath.curveTo(183.63, 215.25002, 182.42001, 216.39001, 181.08, 218.14001);
generalPath.lineTo(180.85, 219.67001);
generalPath.lineTo(180.62001, 220.90001);
generalPath.lineTo(180.52, 222.08);
generalPath.lineTo(175.68001, 222.08);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.68, 222.08);
generalPath.lineTo(170.87, 222.08);
generalPath.lineTo(170.76, 220.90001);
generalPath.lineTo(170.53, 219.67001);
generalPath.lineTo(170.3, 218.14001);
generalPath.curveTo(168.97, 216.39001, 167.75, 215.24002, 167.34, 215.49002);
generalPath.curveTo(167.44, 215.17001, 167.56, 214.93002, 167.81, 214.78001);
generalPath.curveTo(168.98999, 214.08002, 171.42, 215.76001, 173.25, 218.52002);
generalPath.curveTo(173.41, 218.77002, 173.57, 219.02002, 173.71, 219.27002);
generalPath.lineTo(177.68001, 219.27002);
generalPath.curveTo(177.82, 219.02002, 177.98001, 218.77002, 178.14001, 218.52002);
generalPath.curveTo(179.96002, 215.76003, 182.40001, 214.08002, 183.57, 214.78001);
generalPath.curveTo(183.83, 214.93001, 183.94, 215.17001, 184.04001, 215.49002);
generalPath.curveTo(183.63, 215.25002, 182.42001, 216.39001, 181.08, 218.14001);
generalPath.lineTo(180.85, 219.67001);
generalPath.lineTo(180.62001, 220.90001);
generalPath.lineTo(180.52, 222.08);
generalPath.lineTo(175.68001, 222.08);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_1_6
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.55, 215.44);
generalPath.curveTo(168.46, 214.91, 170.57, 216.58, 172.28, 219.18001);
generalPath.moveTo(183.83, 215.44);
generalPath.curveTo(182.92, 214.91, 180.82, 216.58, 179.1, 219.18001);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.58, 224.25);
generalPath.curveTo(168.38, 223.68, 168.0, 223.17, 168.0, 223.17);
generalPath.curveTo(169.95, 222.59999, 172.66, 222.24, 175.67, 222.23);
generalPath.curveTo(178.68, 222.23999, 181.42, 222.59999, 183.36, 223.17);
generalPath.curveTo(183.36, 223.17, 183.14, 223.55, 182.84, 224.08);
generalPath.curveTo(182.67, 224.38, 182.45, 224.89, 182.45999, 224.89);
generalPath.curveTo(180.70999, 224.35, 178.43999, 224.08, 175.65999, 224.06999);
generalPath.curveTo(172.87, 224.07999, 170.19998, 224.42, 168.79999, 224.93);
generalPath.curveTo(168.81999, 224.93, 168.69998, 224.60999, 168.56999, 224.25);
generalPath.lineTo(168.57999, 224.25);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.58, 224.25);
generalPath.curveTo(168.38, 223.68, 168.0, 223.17, 168.0, 223.17);
generalPath.curveTo(169.95, 222.59999, 172.66, 222.24, 175.67, 222.23);
generalPath.curveTo(178.68, 222.23999, 181.42, 222.59999, 183.36, 223.17);
generalPath.curveTo(183.36, 223.17, 183.14, 223.55, 182.84, 224.08);
generalPath.curveTo(182.67, 224.38, 182.45, 224.89, 182.45999, 224.89);
generalPath.curveTo(180.70999, 224.35, 178.43999, 224.08, 175.65999, 224.06999);
generalPath.curveTo(172.87, 224.07999, 170.19998, 224.42, 168.79999, 224.93);
generalPath.curveTo(168.81999, 224.93, 168.69998, 224.60999, 168.56999, 224.25);
generalPath.lineTo(168.57999, 224.25);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.67, 226.73);
generalPath.curveTo(178.09999, 226.72, 180.78, 226.34999, 181.77, 226.09999);
generalPath.curveTo(182.43001, 225.9, 182.82, 225.60999, 182.75, 225.26);
generalPath.curveTo(182.71, 225.09999, 182.57, 224.95999, 182.38, 224.87999);
generalPath.curveTo(180.92, 224.40999, 178.31, 224.07999, 175.67, 224.07999);
generalPath.curveTo(173.04, 224.07999, 170.4, 224.40999, 168.95, 224.87999);
generalPath.curveTo(168.76, 224.95999, 168.62, 225.09999, 168.58, 225.26);
generalPath.curveTo(168.51, 225.61, 168.90001, 225.9, 169.56, 226.09999);
generalPath.curveTo(170.55, 226.34999, 173.23999, 226.71999, 175.67, 226.73);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.67, 226.73);
generalPath.curveTo(178.09999, 226.72, 180.78, 226.34999, 181.77, 226.09999);
generalPath.curveTo(182.43001, 225.9, 182.82, 225.60999, 182.75, 225.26);
generalPath.curveTo(182.71, 225.09999, 182.57, 224.95999, 182.38, 224.87999);
generalPath.curveTo(180.92, 224.40999, 178.31, 224.07999, 175.67, 224.07999);
generalPath.curveTo(173.04, 224.07999, 170.4, 224.40999, 168.95, 224.87999);
generalPath.curveTo(168.76, 224.95999, 168.62, 225.09999, 168.58, 225.26);
generalPath.curveTo(168.51, 225.61, 168.90001, 225.9, 169.56, 226.09999);
generalPath.curveTo(170.55, 226.34999, 173.23999, 226.71999, 175.67, 226.73);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.48, 222.08);
generalPath.lineTo(182.89, 221.55);
generalPath.curveTo(182.89, 221.55, 182.31999, 221.89, 181.61, 221.79001);
generalPath.curveTo(180.91, 221.68001, 180.68001, 220.82, 180.68001, 220.82);
generalPath.curveTo(180.68001, 220.82, 179.89001, 221.49, 179.24, 221.44);
generalPath.curveTo(178.59001, 221.38, 178.17, 220.82, 178.17, 220.82);
generalPath.curveTo(178.17, 220.82, 177.45999, 221.33, 176.84, 221.28001);
generalPath.curveTo(176.22, 221.22002, 175.62999, 220.45001, 175.62999, 220.45001);
generalPath.curveTo(175.62999, 220.45001, 174.99998, 221.25002, 174.37999, 221.31001);
generalPath.curveTo(173.76, 221.36002, 173.24998, 220.77002, 173.24998, 220.77002);
generalPath.curveTo(173.24998, 220.77002, 172.96999, 221.36002, 172.17998, 221.49002);
generalPath.curveTo(171.38997, 221.62003, 170.70998, 220.87003, 170.70998, 220.87003);
generalPath.curveTo(170.70998, 220.87003, 170.25998, 221.60002, 169.71997, 221.79002);
generalPath.curveTo(169.17998, 221.97002, 168.47997, 221.52002, 168.47997, 221.52002);
generalPath.curveTo(168.47997, 221.52002, 168.35997, 221.79002, 168.27997, 221.95001);
generalPath.curveTo(168.19997, 222.11, 167.96997, 222.14001, 167.96997, 222.14001);
generalPath.lineTo(168.14996, 222.61002);
generalPath.curveTo(170.07996, 222.05002, 172.70996, 221.70001, 175.67996, 221.70001);
generalPath.curveTo(178.64996, 221.70001, 181.34996, 222.05002, 183.28996, 222.62001);
generalPath.lineTo(183.48996, 222.08002);
generalPath.lineTo(183.47997, 222.08002);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.48, 222.08);
generalPath.lineTo(182.89, 221.55);
generalPath.curveTo(182.89, 221.55, 182.31999, 221.89, 181.61, 221.79001);
generalPath.curveTo(180.91, 221.68001, 180.68001, 220.82, 180.68001, 220.82);
generalPath.curveTo(180.68001, 220.82, 179.89001, 221.49, 179.24, 221.44);
generalPath.curveTo(178.59001, 221.38, 178.17, 220.82, 178.17, 220.82);
generalPath.curveTo(178.17, 220.82, 177.45999, 221.33, 176.84, 221.28001);
generalPath.curveTo(176.22, 221.22002, 175.62999, 220.45001, 175.62999, 220.45001);
generalPath.curveTo(175.62999, 220.45001, 174.99998, 221.25002, 174.37999, 221.31001);
generalPath.curveTo(173.76, 221.36002, 173.24998, 220.77002, 173.24998, 220.77002);
generalPath.curveTo(173.24998, 220.77002, 172.96999, 221.36002, 172.17998, 221.49002);
generalPath.curveTo(171.38997, 221.62003, 170.70998, 220.87003, 170.70998, 220.87003);
generalPath.curveTo(170.70998, 220.87003, 170.25998, 221.60002, 169.71997, 221.79002);
generalPath.curveTo(169.17998, 221.97002, 168.47997, 221.52002, 168.47997, 221.52002);
generalPath.curveTo(168.47997, 221.52002, 168.35997, 221.79002, 168.27997, 221.95001);
generalPath.curveTo(168.19997, 222.11, 167.96997, 222.14001, 167.96997, 222.14001);
generalPath.lineTo(168.14996, 222.61002);
generalPath.curveTo(170.07996, 222.05002, 172.70996, 221.70001, 175.67996, 221.70001);
generalPath.curveTo(178.64996, 221.70001, 181.34996, 222.05002, 183.28996, 222.62001);
generalPath.lineTo(183.48996, 222.08002);
generalPath.lineTo(183.47997, 222.08002);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.69, 219.49);
generalPath.lineTo(175.97, 219.54001);
generalPath.curveTo(175.92, 219.66, 175.91, 219.78001, 175.91, 219.92001);
generalPath.curveTo(175.91, 220.50002, 176.41, 220.97002, 177.03, 220.97002);
generalPath.curveTo(177.52, 220.97002, 177.94, 220.66002, 178.09, 220.24002);
generalPath.curveTo(178.09999, 220.25002, 178.2, 219.86002, 178.23999, 219.86002);
generalPath.curveTo(178.26999, 219.86002, 178.26999, 220.27002, 178.29, 220.27002);
generalPath.curveTo(178.36, 220.80002, 178.84, 221.16002, 179.39, 221.16002);
generalPath.curveTo(180.01, 221.16002, 180.5, 220.69002, 180.5, 220.10002);
generalPath.curveTo(180.5, 220.06003, 180.5, 220.02002, 180.49, 219.98003);
generalPath.lineTo(180.84001, 219.63002);
generalPath.lineTo(181.03001, 220.07002);
generalPath.curveTo(180.96, 220.21002, 180.93001, 220.36002, 180.93001, 220.53003);
generalPath.curveTo(180.93001, 221.09003, 181.40001, 221.54002, 181.99, 221.54002);
generalPath.curveTo(182.36, 221.54002, 182.68001, 221.36003, 182.87001, 221.09003);
generalPath.lineTo(183.1, 220.80003);
generalPath.lineTo(183.1, 221.16003);
generalPath.curveTo(183.1, 221.50003, 183.24, 221.82004, 183.59001, 221.87004);
generalPath.curveTo(183.59001, 221.87004, 183.97002, 221.90004, 184.50002, 221.49004);
generalPath.curveTo(185.02002, 221.08003, 185.30002, 220.74004, 185.30002, 220.74004);
generalPath.lineTo(185.33002, 221.16003);
generalPath.curveTo(185.33002, 221.16003, 184.82002, 222.00003, 184.36002, 222.26004);
generalPath.curveTo(184.11002, 222.41003, 183.72002, 222.57004, 183.41002, 222.51004);
generalPath.curveTo(183.09001, 222.46004, 182.86002, 222.20004, 182.74002, 221.90004);
generalPath.curveTo(182.51003, 222.04004, 182.23003, 222.12004, 181.94002, 222.12004);
generalPath.curveTo(181.31001, 222.12004, 180.74002, 221.77003, 180.52002, 221.26004);
generalPath.curveTo(180.23003, 221.57004, 179.83002, 221.76004, 179.36002, 221.76004);
generalPath.curveTo(178.85002, 221.76004, 178.39001, 221.53004, 178.10002, 221.18004);
generalPath.curveTo(177.82002, 221.45004, 177.43002, 221.61003, 177.01003, 221.61003);
generalPath.curveTo(176.46002, 221.61003, 175.96002, 221.33003, 175.68002, 220.92003);
generalPath.curveTo(175.39003, 221.33003, 174.90002, 221.61003, 174.34003, 221.61003);
generalPath.curveTo(173.92003, 221.61003, 173.53003, 221.45003, 173.25003, 221.18004);
generalPath.curveTo(172.96004, 221.53004, 172.50003, 221.76004, 172.00003, 221.76004);
generalPath.curveTo(171.52003, 221.76004, 171.12003, 221.57004, 170.83003, 221.26004);
generalPath.curveTo(170.61003, 221.77003, 170.04004, 222.12004, 169.41003, 222.12004);
generalPath.curveTo(169.12004, 222.12004, 168.85004, 222.04004, 168.62004, 221.90004);
generalPath.curveTo(168.50005, 222.20004, 168.27003, 222.46004, 167.94005, 222.51004);
generalPath.curveTo(167.64005, 222.57004, 167.25005, 222.41003, 167.00005, 222.26004);
generalPath.curveTo(166.53004, 222.00005, 165.98004, 221.16003, 165.98004, 221.16003);
generalPath.lineTo(166.05005, 220.74004);
generalPath.curveTo(166.05005, 220.74004, 166.34004, 221.08003, 166.86005, 221.49004);
generalPath.curveTo(167.38005, 221.90004, 167.77005, 221.87004, 167.77005, 221.87004);
generalPath.curveTo(168.11005, 221.82004, 168.26006, 221.50005, 168.26006, 221.16003);
generalPath.lineTo(168.26006, 220.80003);
generalPath.lineTo(168.48006, 221.09003);
generalPath.curveTo(168.67006, 221.36003, 168.99005, 221.54002, 169.36006, 221.54002);
generalPath.curveTo(169.95006, 221.54002, 170.42006, 221.09003, 170.42006, 220.53003);
generalPath.curveTo(170.42006, 220.36003, 170.40005, 220.21002, 170.32005, 220.07002);
generalPath.lineTo(170.51006, 219.63002);
generalPath.lineTo(170.86006, 219.98003);
generalPath.curveTo(170.85007, 220.02002, 170.85007, 220.06003, 170.85007, 220.10002);
generalPath.curveTo(170.85007, 220.69002, 171.34007, 221.16002, 171.96007, 221.16002);
generalPath.curveTo(172.51007, 221.16002, 172.99007, 220.80002, 173.07007, 220.27002);
generalPath.curveTo(173.08006, 220.27002, 173.08006, 219.86002, 173.11006, 219.86002);
generalPath.curveTo(173.16006, 219.86002, 173.25006, 220.25002, 173.27007, 220.24002);
generalPath.curveTo(173.41006, 220.66002, 173.83006, 220.97002, 174.33006, 220.97002);
generalPath.curveTo(174.94006, 220.97002, 175.44006, 220.50002, 175.44006, 219.92001);
generalPath.curveTo(175.44006, 219.78001, 175.44006, 219.66002, 175.39006, 219.54001);
generalPath.lineTo(175.68005, 219.49);
generalPath.lineTo(175.69005, 219.49);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.69, 219.49);
generalPath.lineTo(175.97, 219.54001);
generalPath.curveTo(175.92, 219.66, 175.91, 219.78001, 175.91, 219.92001);
generalPath.curveTo(175.91, 220.50002, 176.41, 220.97002, 177.03, 220.97002);
generalPath.curveTo(177.52, 220.97002, 177.94, 220.66002, 178.09, 220.24002);
generalPath.curveTo(178.09999, 220.25002, 178.2, 219.86002, 178.23999, 219.86002);
generalPath.curveTo(178.26999, 219.86002, 178.26999, 220.27002, 178.29, 220.27002);
generalPath.curveTo(178.36, 220.80002, 178.84, 221.16002, 179.39, 221.16002);
generalPath.curveTo(180.01, 221.16002, 180.5, 220.69002, 180.5, 220.10002);
generalPath.curveTo(180.5, 220.06003, 180.5, 220.02002, 180.49, 219.98003);
generalPath.lineTo(180.84001, 219.63002);
generalPath.lineTo(181.03001, 220.07002);
generalPath.curveTo(180.96, 220.21002, 180.93001, 220.36002, 180.93001, 220.53003);
generalPath.curveTo(180.93001, 221.09003, 181.40001, 221.54002, 181.99, 221.54002);
generalPath.curveTo(182.36, 221.54002, 182.68001, 221.36003, 182.87001, 221.09003);
generalPath.lineTo(183.1, 220.80003);
generalPath.lineTo(183.1, 221.16003);
generalPath.curveTo(183.1, 221.50003, 183.24, 221.82004, 183.59001, 221.87004);
generalPath.curveTo(183.59001, 221.87004, 183.97002, 221.90004, 184.50002, 221.49004);
generalPath.curveTo(185.02002, 221.08003, 185.30002, 220.74004, 185.30002, 220.74004);
generalPath.lineTo(185.33002, 221.16003);
generalPath.curveTo(185.33002, 221.16003, 184.82002, 222.00003, 184.36002, 222.26004);
generalPath.curveTo(184.11002, 222.41003, 183.72002, 222.57004, 183.41002, 222.51004);
generalPath.curveTo(183.09001, 222.46004, 182.86002, 222.20004, 182.74002, 221.90004);
generalPath.curveTo(182.51003, 222.04004, 182.23003, 222.12004, 181.94002, 222.12004);
generalPath.curveTo(181.31001, 222.12004, 180.74002, 221.77003, 180.52002, 221.26004);
generalPath.curveTo(180.23003, 221.57004, 179.83002, 221.76004, 179.36002, 221.76004);
generalPath.curveTo(178.85002, 221.76004, 178.39001, 221.53004, 178.10002, 221.18004);
generalPath.curveTo(177.82002, 221.45004, 177.43002, 221.61003, 177.01003, 221.61003);
generalPath.curveTo(176.46002, 221.61003, 175.96002, 221.33003, 175.68002, 220.92003);
generalPath.curveTo(175.39003, 221.33003, 174.90002, 221.61003, 174.34003, 221.61003);
generalPath.curveTo(173.92003, 221.61003, 173.53003, 221.45003, 173.25003, 221.18004);
generalPath.curveTo(172.96004, 221.53004, 172.50003, 221.76004, 172.00003, 221.76004);
generalPath.curveTo(171.52003, 221.76004, 171.12003, 221.57004, 170.83003, 221.26004);
generalPath.curveTo(170.61003, 221.77003, 170.04004, 222.12004, 169.41003, 222.12004);
generalPath.curveTo(169.12004, 222.12004, 168.85004, 222.04004, 168.62004, 221.90004);
generalPath.curveTo(168.50005, 222.20004, 168.27003, 222.46004, 167.94005, 222.51004);
generalPath.curveTo(167.64005, 222.57004, 167.25005, 222.41003, 167.00005, 222.26004);
generalPath.curveTo(166.53004, 222.00005, 165.98004, 221.16003, 165.98004, 221.16003);
generalPath.lineTo(166.05005, 220.74004);
generalPath.curveTo(166.05005, 220.74004, 166.34004, 221.08003, 166.86005, 221.49004);
generalPath.curveTo(167.38005, 221.90004, 167.77005, 221.87004, 167.77005, 221.87004);
generalPath.curveTo(168.11005, 221.82004, 168.26006, 221.50005, 168.26006, 221.16003);
generalPath.lineTo(168.26006, 220.80003);
generalPath.lineTo(168.48006, 221.09003);
generalPath.curveTo(168.67006, 221.36003, 168.99005, 221.54002, 169.36006, 221.54002);
generalPath.curveTo(169.95006, 221.54002, 170.42006, 221.09003, 170.42006, 220.53003);
generalPath.curveTo(170.42006, 220.36003, 170.40005, 220.21002, 170.32005, 220.07002);
generalPath.lineTo(170.51006, 219.63002);
generalPath.lineTo(170.86006, 219.98003);
generalPath.curveTo(170.85007, 220.02002, 170.85007, 220.06003, 170.85007, 220.10002);
generalPath.curveTo(170.85007, 220.69002, 171.34007, 221.16002, 171.96007, 221.16002);
generalPath.curveTo(172.51007, 221.16002, 172.99007, 220.80002, 173.07007, 220.27002);
generalPath.curveTo(173.08006, 220.27002, 173.08006, 219.86002, 173.11006, 219.86002);
generalPath.curveTo(173.16006, 219.86002, 173.25006, 220.25002, 173.27007, 220.24002);
generalPath.curveTo(173.41006, 220.66002, 173.83006, 220.97002, 174.33006, 220.97002);
generalPath.curveTo(174.94006, 220.97002, 175.44006, 220.50002, 175.44006, 219.92001);
generalPath.curveTo(175.44006, 219.78001, 175.44006, 219.66002, 175.39006, 219.54001);
generalPath.lineTo(175.68005, 219.49);
generalPath.lineTo(175.69005, 219.49);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.67, 222.23);
generalPath.curveTo(172.66, 222.23999, 169.95, 222.59999, 168.0, 223.17);
generalPath.curveTo(167.87, 223.20999, 167.71, 223.11, 167.67, 223.0);
generalPath.curveTo(167.63, 222.87, 167.72, 222.72, 167.84999, 222.68);
generalPath.curveTo(169.79999, 222.07999, 172.57999, 221.7, 175.67, 221.7);
generalPath.curveTo(178.76001, 221.7, 181.55, 222.08, 183.5, 222.68);
generalPath.curveTo(183.63, 222.71999, 183.72, 222.87, 183.68, 223.0);
generalPath.curveTo(183.64, 223.11, 183.48, 223.21, 183.34999, 223.17);
generalPath.curveTo(181.4, 222.59999, 178.68, 222.24, 175.67, 222.23);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.67, 222.23);
generalPath.curveTo(172.66, 222.23999, 169.95, 222.59999, 168.0, 223.17);
generalPath.curveTo(167.87, 223.20999, 167.71, 223.11, 167.67, 223.0);
generalPath.curveTo(167.63, 222.87, 167.72, 222.72, 167.84999, 222.68);
generalPath.curveTo(169.79999, 222.07999, 172.57999, 221.7, 175.67, 221.7);
generalPath.curveTo(178.76001, 221.7, 181.55, 222.08, 183.5, 222.68);
generalPath.curveTo(183.63, 222.71999, 183.72, 222.87, 183.68, 223.0);
generalPath.curveTo(183.64, 223.11, 183.48, 223.21, 183.34999, 223.17);
generalPath.curveTo(181.4, 222.59999, 178.68, 222.24, 175.67, 222.23);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(165.43, 221.0);
generalPath.curveTo(165.42, 221.01, 165.04999, 220.52, 164.78, 220.27);
generalPath.curveTo(164.58, 220.09001, 164.1, 219.94, 164.1, 219.94);
generalPath.curveTo(164.1, 219.86, 164.38, 219.66, 164.68001, 219.66);
generalPath.curveTo(164.86, 219.66, 165.03001, 219.73001, 165.13, 219.86);
generalPath.lineTo(165.17, 219.66);
generalPath.curveTo(165.17, 219.66, 165.41, 219.71, 165.52, 219.98001);
generalPath.curveTo(165.64, 220.27, 165.57, 220.70001, 165.57, 220.70001);
generalPath.curveTo(165.57, 220.70001, 165.52, 220.90001, 165.43001, 221.00002);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(165.43, 221.0);
generalPath.curveTo(165.42, 221.01, 165.04999, 220.52, 164.78, 220.27);
generalPath.curveTo(164.58, 220.09001, 164.1, 219.94, 164.1, 219.94);
generalPath.curveTo(164.1, 219.86, 164.38, 219.66, 164.68001, 219.66);
generalPath.curveTo(164.86, 219.66, 165.03001, 219.73001, 165.13, 219.86);
generalPath.lineTo(165.17, 219.66);
generalPath.curveTo(165.17, 219.66, 165.41, 219.71, 165.52, 219.98001);
generalPath.curveTo(165.64, 220.27, 165.57, 220.70001, 165.57, 220.70001);
generalPath.curveTo(165.57, 220.70001, 165.52, 220.90001, 165.43001, 221.00002);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.32, 220.22);
generalPath.lineTo(167.21, 220.88);
generalPath.lineTo(165.81001, 221.03);
generalPath.lineTo(165.6, 220.91);
generalPath.lineTo(165.64, 220.68001);
generalPath.lineTo(166.7, 219.81001);
generalPath.lineTo(167.31999, 220.22002);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.32, 220.22);
generalPath.lineTo(167.21, 220.88);
generalPath.lineTo(165.81001, 221.03);
generalPath.lineTo(165.6, 220.91);
generalPath.lineTo(165.64, 220.68001);
generalPath.lineTo(166.7, 219.81001);
generalPath.lineTo(167.31999, 220.22002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(165.45, 220.75);
generalPath.curveTo(165.56999, 220.63, 165.81, 220.66, 165.98, 220.81);
generalPath.curveTo(166.15999, 220.95999, 166.22, 221.19, 166.09999, 221.31);
generalPath.curveTo(165.98, 221.44, 165.73999, 221.41, 165.56999, 221.25);
generalPath.curveTo(165.39, 221.1, 165.32999, 220.87, 165.45, 220.75);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(165.45, 220.75);
generalPath.curveTo(165.56999, 220.63, 165.81, 220.66, 165.98, 220.81);
generalPath.curveTo(166.15999, 220.95999, 166.22, 221.19, 166.09999, 221.31);
generalPath.curveTo(165.98, 221.44, 165.73999, 221.41, 165.56999, 221.25);
generalPath.curveTo(165.39, 221.1, 165.32999, 220.87, 165.45, 220.75);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.02, 220.88);
generalPath.curveTo(167.96, 220.70001, 168.02, 220.51001, 168.15001, 220.46);
generalPath.curveTo(168.29001, 220.43001, 168.45001, 220.55, 168.52, 220.73001);
generalPath.curveTo(168.58, 220.92001, 168.52, 221.11002, 168.38, 221.15001);
generalPath.curveTo(168.25, 221.19, 168.09001, 221.07, 168.02, 220.88);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.02, 220.88);
generalPath.curveTo(167.96, 220.70001, 168.02, 220.51001, 168.15001, 220.46);
generalPath.curveTo(168.29001, 220.43001, 168.45001, 220.55, 168.52, 220.73001);
generalPath.curveTo(168.58, 220.92001, 168.52, 221.11002, 168.38, 221.15001);
generalPath.curveTo(168.25, 221.19, 168.09001, 221.07, 168.02, 220.88);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.67, 220.04);
generalPath.lineTo(169.18, 220.51999);
generalPath.lineTo(170.4, 219.85999);
generalPath.lineTo(170.48999, 219.64998);
generalPath.lineTo(170.31999, 219.47998);
generalPath.lineTo(168.92, 219.35999);
generalPath.lineTo(168.67, 220.03998);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.67, 220.04);
generalPath.lineTo(169.18, 220.51999);
generalPath.lineTo(170.4, 219.85999);
generalPath.lineTo(170.48999, 219.64998);
generalPath.lineTo(170.31999, 219.47998);
generalPath.lineTo(168.92, 219.35999);
generalPath.lineTo(168.67, 220.03998);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.08, 217.76);
generalPath.lineTo(169.41, 218.4);
generalPath.lineTo(170.27, 219.54);
generalPath.lineTo(170.5, 219.62999);
generalPath.lineTo(170.67, 219.45);
generalPath.lineTo(170.97, 218.08);
generalPath.lineTo(170.08, 217.76);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.08, 217.76);
generalPath.lineTo(169.41, 218.4);
generalPath.lineTo(170.27, 219.54);
generalPath.lineTo(170.5, 219.62999);
generalPath.lineTo(170.67, 219.45);
generalPath.lineTo(170.97, 218.08);
generalPath.lineTo(170.08, 217.76);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(172.36, 219.3);
generalPath.lineTo(172.1, 219.93001);
generalPath.lineTo(170.70001, 219.8);
generalPath.lineTo(170.52002, 219.64);
generalPath.lineTo(170.62003, 219.42);
generalPath.lineTo(171.84003, 218.78);
generalPath.lineTo(172.36003, 219.3);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(172.36, 219.3);
generalPath.lineTo(172.1, 219.93001);
generalPath.lineTo(170.70001, 219.8);
generalPath.lineTo(170.52002, 219.64);
generalPath.lineTo(170.62003, 219.42);
generalPath.lineTo(171.84003, 218.78);
generalPath.lineTo(172.36003, 219.3);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_12
shape = new Ellipse2D.Double(170.01998901367188, 219.17999267578125, 0.9800000190734863, 0.9399999976158142);
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(170.01998901367188, 219.17999267578125, 0.9800000190734863, 0.9399999976158142);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(172.87, 219.95);
generalPath.curveTo(172.84, 219.75, 172.94, 219.58, 173.08, 219.56);
generalPath.curveTo(173.22, 219.54, 173.36, 219.69, 173.38, 219.89);
generalPath.curveTo(173.41, 220.08, 173.31, 220.26, 173.17, 220.27);
generalPath.curveTo(173.03, 220.29001, 172.89, 220.14, 172.87, 219.95);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}

}

private void _paint1(Graphics2D g,float origAlpha) {
generalPath.moveTo(172.87, 219.95);
generalPath.curveTo(172.84, 219.75, 172.94, 219.58, 173.08, 219.56);
generalPath.curveTo(173.22, 219.54, 173.36, 219.69, 173.38, 219.89);
generalPath.curveTo(173.41, 220.08, 173.31, 220.26, 173.17, 220.27);
generalPath.curveTo(173.03, 220.29001, 172.89, 220.14, 172.87, 219.95);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(173.78, 219.24);
generalPath.lineTo(174.18, 219.81001);
generalPath.lineTo(175.51999, 219.39001);
generalPath.lineTo(175.65999, 219.21002);
generalPath.lineTo(175.51, 219.01003);
generalPath.lineTo(174.18, 218.62003);
generalPath.lineTo(173.78, 219.24002);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(173.78, 219.24);
generalPath.lineTo(174.18, 219.81001);
generalPath.lineTo(175.51999, 219.39001);
generalPath.lineTo(175.65999, 219.21002);
generalPath.lineTo(175.51, 219.01003);
generalPath.lineTo(174.18, 218.62003);
generalPath.lineTo(173.78, 219.24002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.66, 217.15);
generalPath.lineTo(174.8, 217.67);
generalPath.lineTo(175.44, 219.05);
generalPath.lineTo(175.66, 219.19);
generalPath.lineTo(175.88, 219.05);
generalPath.lineTo(176.52, 217.67);
generalPath.lineTo(175.66, 217.15);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.66, 217.15);
generalPath.lineTo(174.8, 217.67);
generalPath.lineTo(175.44, 219.05);
generalPath.lineTo(175.66, 219.19);
generalPath.lineTo(175.88, 219.05);
generalPath.lineTo(176.52, 217.67);
generalPath.lineTo(175.66, 217.15);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(177.55, 219.24);
generalPath.lineTo(177.16, 219.81001);
generalPath.lineTo(175.82, 219.39001);
generalPath.lineTo(175.68001, 219.21002);
generalPath.lineTo(175.82, 219.01003);
generalPath.lineTo(177.16, 218.62003);
generalPath.lineTo(177.55, 219.24002);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(177.55, 219.24);
generalPath.lineTo(177.16, 219.81001);
generalPath.lineTo(175.82, 219.39001);
generalPath.lineTo(175.68001, 219.21002);
generalPath.lineTo(175.82, 219.01003);
generalPath.lineTo(177.16, 218.62003);
generalPath.lineTo(177.55, 219.24002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_17
shape = new Ellipse2D.Double(175.17999267578125, 218.74000549316406, 0.9800000190734863, 0.9399999976158142);
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(175.17999267578125, 218.74000549316406, 0.9800000190734863, 0.9399999976158142);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(178.5, 219.95);
generalPath.curveTo(178.52, 219.75, 178.42, 219.58, 178.28, 219.56);
generalPath.curveTo(178.14, 219.54, 178.0, 219.69, 177.98, 219.89);
generalPath.curveTo(177.95999, 220.08, 178.05, 220.26, 178.19, 220.27);
generalPath.curveTo(178.33, 220.29001, 178.47, 220.14, 178.5, 219.95);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(178.5, 219.95);
generalPath.curveTo(178.52, 219.75, 178.42, 219.58, 178.28, 219.56);
generalPath.curveTo(178.14, 219.54, 178.0, 219.69, 177.98, 219.89);
generalPath.curveTo(177.95999, 220.08, 178.05, 220.26, 178.19, 220.27);
generalPath.curveTo(178.33, 220.29001, 178.47, 220.14, 178.5, 219.95);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(178.99, 219.3);
generalPath.lineTo(179.25, 219.93001);
generalPath.lineTo(180.65, 219.8);
generalPath.lineTo(180.82999, 219.64);
generalPath.lineTo(180.72998, 219.42);
generalPath.lineTo(179.50998, 218.78);
generalPath.lineTo(178.98997, 219.3);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(178.99, 219.3);
generalPath.lineTo(179.25, 219.93001);
generalPath.lineTo(180.65, 219.8);
generalPath.lineTo(180.82999, 219.64);
generalPath.lineTo(180.72998, 219.42);
generalPath.lineTo(179.50998, 218.78);
generalPath.lineTo(178.98997, 219.3);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_20
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(181.27, 217.76);
generalPath.lineTo(181.94, 218.4);
generalPath.lineTo(181.08, 219.54);
generalPath.lineTo(180.85, 219.62999);
generalPath.lineTo(180.68001, 219.45);
generalPath.lineTo(180.38, 218.08);
generalPath.lineTo(181.27, 217.76);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(181.27, 217.76);
generalPath.lineTo(181.94, 218.4);
generalPath.lineTo(181.08, 219.54);
generalPath.lineTo(180.85, 219.62999);
generalPath.lineTo(180.68001, 219.45);
generalPath.lineTo(180.38, 218.08);
generalPath.lineTo(181.27, 217.76);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_21
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(182.68, 220.04);
generalPath.lineTo(182.17, 220.51999);
generalPath.lineTo(180.95, 219.85999);
generalPath.lineTo(180.84999, 219.64998);
generalPath.lineTo(181.04, 219.47998);
generalPath.lineTo(182.43999, 219.35999);
generalPath.lineTo(182.68, 220.03998);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(182.68, 220.04);
generalPath.lineTo(182.17, 220.51999);
generalPath.lineTo(180.95, 219.85999);
generalPath.lineTo(180.84999, 219.64998);
generalPath.lineTo(181.04, 219.47998);
generalPath.lineTo(182.43999, 219.35999);
generalPath.lineTo(182.68, 220.03998);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_22
shape = new Ellipse2D.Double(180.36000061035156, 219.17999267578125, 0.9800000190734863, 0.9399999976158142);
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(180.36000061035156, 219.17999267578125, 0.9800000190734863, 0.9399999976158142);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_23
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.34, 220.88);
generalPath.curveTo(183.4, 220.70001, 183.34, 220.51001, 183.20999, 220.46);
generalPath.curveTo(183.06999, 220.43001, 182.90999, 220.55, 182.84, 220.73001);
generalPath.curveTo(182.78, 220.92001, 182.84, 221.11002, 182.98, 221.15001);
generalPath.curveTo(183.11, 221.19, 183.26999, 221.07, 183.34, 220.88);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.34, 220.88);
generalPath.curveTo(183.4, 220.70001, 183.34, 220.51001, 183.20999, 220.46);
generalPath.curveTo(183.06999, 220.43001, 182.90999, 220.55, 182.84, 220.73001);
generalPath.curveTo(182.78, 220.92001, 182.84, 221.11002, 182.98, 221.15001);
generalPath.curveTo(183.11, 221.19, 183.26999, 221.07, 183.34, 220.88);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_24
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(185.73, 221.0);
generalPath.curveTo(185.73999, 221.01, 186.11, 220.52, 186.39, 220.27);
generalPath.curveTo(186.58, 220.09001, 187.06, 219.94, 187.06, 219.94);
generalPath.curveTo(187.06, 219.86, 186.78, 219.66, 186.48, 219.66);
generalPath.curveTo(186.3, 219.66, 186.12999, 219.73001, 186.03, 219.86);
generalPath.lineTo(185.99, 219.66);
generalPath.curveTo(185.99, 219.66, 185.75, 219.71, 185.63, 219.98001);
generalPath.curveTo(185.52, 220.27, 185.6, 220.70001, 185.6, 220.70001);
generalPath.curveTo(185.6, 220.70001, 185.64, 220.90001, 185.73001, 221.00002);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(185.73, 221.0);
generalPath.curveTo(185.73999, 221.01, 186.11, 220.52, 186.39, 220.27);
generalPath.curveTo(186.58, 220.09001, 187.06, 219.94, 187.06, 219.94);
generalPath.curveTo(187.06, 219.86, 186.78, 219.66, 186.48, 219.66);
generalPath.curveTo(186.3, 219.66, 186.12999, 219.73001, 186.03, 219.86);
generalPath.lineTo(185.99, 219.66);
generalPath.curveTo(185.99, 219.66, 185.75, 219.71, 185.63, 219.98001);
generalPath.curveTo(185.52, 220.27, 185.6, 220.70001, 185.6, 220.70001);
generalPath.curveTo(185.6, 220.70001, 185.64, 220.90001, 185.73001, 221.00002);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_25
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.84, 220.22);
generalPath.lineTo(183.95, 220.88);
generalPath.lineTo(185.34999, 221.03);
generalPath.lineTo(185.56, 220.91);
generalPath.lineTo(185.51, 220.68001);
generalPath.lineTo(184.45999, 219.81001);
generalPath.lineTo(183.84, 220.22002);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.84, 220.22);
generalPath.lineTo(183.95, 220.88);
generalPath.lineTo(185.34999, 221.03);
generalPath.lineTo(185.56, 220.91);
generalPath.lineTo(185.51, 220.68001);
generalPath.lineTo(184.45999, 219.81001);
generalPath.lineTo(183.84, 220.22002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_2_26
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(185.74, 220.75);
generalPath.curveTo(185.63, 220.63, 185.39, 220.66, 185.21, 220.81);
generalPath.curveTo(185.03001, 220.95999, 184.97, 221.19, 185.09001, 221.31);
generalPath.curveTo(185.21, 221.44, 185.45001, 221.41, 185.63, 221.25);
generalPath.curveTo(185.81, 221.1, 185.86, 220.87, 185.74, 220.75);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(185.74, 220.75);
generalPath.curveTo(185.63, 220.63, 185.39, 220.66, 185.21, 220.81);
generalPath.curveTo(185.03001, 220.95999, 184.97, 221.19, 185.09001, 221.31);
generalPath.curveTo(185.21, 221.44, 185.45001, 221.41, 185.63, 221.25);
generalPath.curveTo(185.81, 221.1, 185.86, 220.87, 185.74, 220.75);
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
// _0_2_0_0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.05, 224.3);
generalPath.lineTo(168.36, 223.8);
generalPath.lineTo(169.01, 223.93001);
generalPath.lineTo(168.62999, 224.49);
generalPath.lineTo(168.04999, 224.3);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.05, 224.3);
generalPath.lineTo(168.36, 223.8);
generalPath.lineTo(169.01, 223.93001);
generalPath.lineTo(168.62999, 224.49);
generalPath.lineTo(168.04999, 224.3);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.85, 223.81);
generalPath.lineTo(170.16, 223.92);
generalPath.curveTo(169.98001, 223.94, 169.81, 223.83, 169.78, 223.66);
generalPath.curveTo(169.76, 223.49, 169.88, 223.34, 170.05, 223.31);
generalPath.lineTo(170.75, 223.20999);
generalPath.lineTo(171.46, 223.09999);
generalPath.curveTo(171.64, 223.07999, 171.8, 223.18999, 171.83, 223.34999);
generalPath.curveTo(171.85, 223.51999, 171.73, 223.68, 171.56, 223.7);
generalPath.lineTo(170.84999, 223.81);
shape = generalPath;
paint = new Color(5, 142, 110, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.85, 223.81);
generalPath.lineTo(170.16, 223.92);
generalPath.curveTo(169.98001, 223.94, 169.81, 223.83, 169.78, 223.66);
generalPath.curveTo(169.76, 223.49, 169.88, 223.34, 170.05, 223.31);
generalPath.lineTo(170.75, 223.20999);
generalPath.lineTo(171.46, 223.09999);
generalPath.curveTo(171.64, 223.07999, 171.8, 223.18999, 171.83, 223.34999);
generalPath.curveTo(171.85, 223.51999, 171.73, 223.68, 171.56, 223.7);
generalPath.lineTo(170.84999, 223.81);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_2
shape = new Ellipse2D.Double(172.75, 222.88999938964844, 0.8799999952316284, 0.8199999928474426);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(172.75, 222.88999938964844, 0.8799999952316284, 0.8199999928474426);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.7, 223.48);
generalPath.lineTo(174.73999, 223.48);
generalPath.curveTo(174.56, 223.48, 174.40999, 223.34, 174.40999, 223.17);
generalPath.curveTo(174.40999, 223.0, 174.54999, 222.86, 174.73, 222.86);
generalPath.lineTo(176.69, 222.86);
generalPath.curveTo(176.88, 222.86, 177.02, 223.0, 177.02, 223.17);
generalPath.curveTo(177.02, 223.34, 176.87001, 223.48, 176.69, 223.48);
generalPath.lineTo(175.7, 223.48);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.7, 223.48);
generalPath.lineTo(174.73999, 223.48);
generalPath.curveTo(174.56, 223.48, 174.40999, 223.34, 174.40999, 223.17);
generalPath.curveTo(174.40999, 223.0, 174.54999, 222.86, 174.73, 222.86);
generalPath.lineTo(176.69, 222.86);
generalPath.curveTo(176.88, 222.86, 177.02, 223.0, 177.02, 223.17);
generalPath.curveTo(177.02, 223.34, 176.87001, 223.48, 176.69, 223.48);
generalPath.lineTo(175.7, 223.48);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_4
shape = new Ellipse2D.Double(177.72000122070312, 222.88999938964844, 0.8799999952316284, 0.8199999928474426);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(177.72000122070312, 222.88999938964844, 0.8799999952316284, 0.8199999928474426);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(180.5, 223.81);
generalPath.lineTo(181.19, 223.92);
generalPath.curveTo(181.37, 223.94, 181.54001, 223.83, 181.57, 223.66);
generalPath.curveTo(181.59001, 223.49, 181.48001, 223.34, 181.3, 223.31);
generalPath.lineTo(180.6, 223.20999);
generalPath.lineTo(179.89, 223.09999);
generalPath.curveTo(179.71, 223.07999, 179.54, 223.18999, 179.52, 223.34999);
generalPath.curveTo(179.49, 223.51999, 179.61, 223.68, 179.79001, 223.7);
generalPath.lineTo(180.50002, 223.81);
shape = generalPath;
paint = new Color(5, 142, 110, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(180.5, 223.81);
generalPath.lineTo(181.19, 223.92);
generalPath.curveTo(181.37, 223.94, 181.54001, 223.83, 181.57, 223.66);
generalPath.curveTo(181.59001, 223.49, 181.48001, 223.34, 181.3, 223.31);
generalPath.lineTo(180.6, 223.20999);
generalPath.lineTo(179.89, 223.09999);
generalPath.curveTo(179.71, 223.07999, 179.54, 223.18999, 179.52, 223.34999);
generalPath.curveTo(179.49, 223.51999, 179.61, 223.68, 179.79001, 223.7);
generalPath.lineTo(180.50002, 223.81);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.24, 224.33);
generalPath.lineTo(182.99, 223.8);
generalPath.lineTo(182.32, 223.86);
generalPath.lineTo(182.64001, 224.45);
generalPath.lineTo(183.24002, 224.33);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.24, 224.33);
generalPath.lineTo(182.99, 223.8);
generalPath.lineTo(182.32, 223.86);
generalPath.lineTo(182.64001, 224.45);
generalPath.lineTo(183.24002, 224.33);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.66, 226.16);
generalPath.curveTo(173.23001, 226.16, 171.03, 225.94, 169.36, 225.51001);
generalPath.curveTo(171.03, 225.08002, 173.23, 224.82, 175.66, 224.81001);
generalPath.curveTo(178.1, 224.81001, 180.31, 225.08002, 181.99, 225.51001);
generalPath.curveTo(180.31001, 225.94, 178.1, 226.16, 175.66, 226.16);
generalPath.closePath();
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.66, 226.16);
generalPath.curveTo(173.23001, 226.16, 171.03, 225.94, 169.36, 225.51001);
generalPath.curveTo(171.03, 225.08002, 173.23, 224.82, 175.66, 224.81001);
generalPath.curveTo(178.1, 224.81001, 180.31, 225.08002, 181.99, 225.51001);
generalPath.curveTo(180.31001, 225.94, 178.1, 226.16, 175.66, 226.16);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_8
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.01f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(176.8, 226.08);
generalPath.lineTo(176.8, 224.92);
generalPath.moveTo(176.22, 226.12);
generalPath.lineTo(176.23, 224.89);
generalPath.moveTo(175.8, 226.14);
generalPath.lineTo(175.8, 224.88);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_9
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.02f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.44, 226.15);
generalPath.lineTo(175.44, 224.87999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_10
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.03f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.09, 226.15);
generalPath.lineTo(175.09, 224.87999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_11
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.04f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(174.77, 226.15);
generalPath.lineTo(174.77, 224.87999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_12
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.04f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(174.44, 226.15);
generalPath.lineTo(174.44, 224.87999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_13
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.05f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(174.16, 226.15);
generalPath.lineTo(174.16, 224.87999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_14
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.06f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(173.61, 226.08);
generalPath.lineTo(173.6, 224.93001);
generalPath.moveTo(173.87001, 226.1);
generalPath.lineTo(173.87001, 224.89);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_15
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.07f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(173.1, 226.03);
generalPath.lineTo(173.1, 224.97);
generalPath.moveTo(173.36, 226.06);
generalPath.lineTo(173.35, 224.93);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_16
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.08f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(172.42, 225.97);
generalPath.lineTo(172.42, 225.04001);
generalPath.moveTo(172.65, 225.98001);
generalPath.lineTo(172.65, 225.00002);
generalPath.moveTo(172.87999, 226.02002);
generalPath.lineTo(172.87999, 225.00002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_17
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.09f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(172.19, 225.96);
generalPath.lineTo(172.19, 225.06001);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_18
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.1f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(171.97, 225.92);
generalPath.lineTo(171.97, 225.06999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_19
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.11f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(171.73, 225.89);
generalPath.lineTo(171.73, 225.11);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_20
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.12f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(171.24, 225.82);
generalPath.lineTo(171.23001, 225.20001);
generalPath.moveTo(171.49, 225.86002);
generalPath.lineTo(171.49, 225.16002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_21
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.12f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.99, 225.77);
generalPath.lineTo(170.99, 225.22);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);

}

private void _paint2(Graphics2D g,float origAlpha) {
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_22
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.13f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.76, 225.73);
generalPath.lineTo(170.76, 225.26999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_23
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.14f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.51, 225.67);
generalPath.lineTo(170.51, 225.31);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_24
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.15f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.26, 225.64);
generalPath.lineTo(170.26, 225.37);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0_3_25
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.18f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(169.99, 225.58);
generalPath.lineTo(169.99, 225.45);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.28, 330.68);
generalPath.curveTo(189.74, 330.68, 188.37, 330.35, 187.35, 329.81);
generalPath.curveTo(186.35, 329.3, 184.99, 328.99, 183.49, 328.99);
generalPath.curveTo(181.98001, 328.99, 180.59001, 329.31, 179.58, 329.81998);
generalPath.curveTo(178.57, 330.34998, 177.18001, 330.67996, 175.66, 330.67996);
generalPath.curveTo(174.12001, 330.67996, 172.74, 330.31998, 171.73001, 329.77997);
generalPath.curveTo(170.73001, 329.28998, 169.40001, 328.98996, 167.94002, 328.98996);
generalPath.curveTo(166.42001, 328.98996, 165.08002, 329.27997, 164.08002, 329.79996);
generalPath.curveTo(163.06001, 330.33997, 161.66002, 330.67996, 160.13002, 330.67996);
generalPath.lineTo(160.13002, 333.08997);
generalPath.curveTo(161.66002, 333.08997, 163.06001, 332.73996, 164.08002, 332.20996);
generalPath.curveTo(165.08002, 331.68997, 166.42001, 331.38995, 167.94002, 331.38995);
generalPath.curveTo(169.39001, 331.38995, 170.73001, 331.69995, 171.73001, 332.18994);
generalPath.curveTo(172.74, 332.71994, 174.12001, 333.08994, 175.66, 333.08994);
generalPath.curveTo(177.18001, 333.08994, 178.57, 332.75995, 179.58, 332.22995);
generalPath.curveTo(180.59, 331.70996, 181.98, 331.38995, 183.49, 331.38995);
generalPath.curveTo(184.99, 331.38995, 186.35, 331.70996, 187.35, 332.21994);
generalPath.curveTo(188.37001, 332.75995, 189.72, 333.08994, 191.26001, 333.08994);
generalPath.lineTo(191.28001, 330.67993);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 91, 191, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.28, 330.68);
generalPath.curveTo(189.74, 330.68, 188.37, 330.35, 187.35, 329.81);
generalPath.curveTo(186.35, 329.3, 184.99, 328.99, 183.49, 328.99);
generalPath.curveTo(181.98001, 328.99, 180.59001, 329.31, 179.58, 329.81998);
generalPath.curveTo(178.57, 330.34998, 177.18001, 330.67996, 175.66, 330.67996);
generalPath.curveTo(174.12001, 330.67996, 172.74, 330.31998, 171.73001, 329.77997);
generalPath.curveTo(170.73001, 329.28998, 169.40001, 328.98996, 167.94002, 328.98996);
generalPath.curveTo(166.42001, 328.98996, 165.08002, 329.27997, 164.08002, 329.79996);
generalPath.curveTo(163.06001, 330.33997, 161.66002, 330.67996, 160.13002, 330.67996);
generalPath.lineTo(160.13002, 333.08997);
generalPath.curveTo(161.66002, 333.08997, 163.06001, 332.73996, 164.08002, 332.20996);
generalPath.curveTo(165.08002, 331.68997, 166.42001, 331.38995, 167.94002, 331.38995);
generalPath.curveTo(169.39001, 331.38995, 170.73001, 331.69995, 171.73001, 332.18994);
generalPath.curveTo(172.74, 332.71994, 174.12001, 333.08994, 175.66, 333.08994);
generalPath.curveTo(177.18001, 333.08994, 178.57, 332.75995, 179.58, 332.22995);
generalPath.curveTo(180.59, 331.70996, 181.98, 331.38995, 183.49, 331.38995);
generalPath.curveTo(184.99, 331.38995, 186.35, 331.70996, 187.35, 332.21994);
generalPath.curveTo(188.37001, 332.75995, 189.72, 333.08994, 191.26001, 333.08994);
generalPath.lineTo(191.28001, 330.67993);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.28, 333.09);
generalPath.curveTo(189.74, 333.09, 188.37, 332.76, 187.35, 332.22);
generalPath.curveTo(186.35, 331.71, 184.99, 331.39, 183.49, 331.39);
generalPath.curveTo(181.98001, 331.39, 180.59001, 331.71002, 179.58, 332.23);
generalPath.curveTo(178.57, 332.76, 177.18001, 333.09, 175.66, 333.09);
generalPath.curveTo(174.12001, 333.09, 172.74, 332.72, 171.73001, 332.19);
generalPath.curveTo(170.73001, 331.7, 169.40001, 331.39, 167.94002, 331.39);
generalPath.curveTo(166.42001, 331.39, 165.08002, 331.69, 164.08002, 332.21002);
generalPath.curveTo(163.06001, 332.74002, 161.66002, 333.09003, 160.13002, 333.09003);
generalPath.lineTo(160.13002, 335.50003);
generalPath.curveTo(161.66002, 335.50003, 163.06001, 335.15002, 164.08002, 334.62003);
generalPath.curveTo(165.08002, 334.10004, 166.42001, 333.80002, 167.94002, 333.80002);
generalPath.curveTo(169.39001, 333.80002, 170.73001, 334.11002, 171.73001, 334.6);
generalPath.curveTo(172.74, 335.14, 174.12001, 335.5, 175.66, 335.5);
generalPath.curveTo(177.18001, 335.5, 178.57, 335.16, 179.58, 334.64);
generalPath.curveTo(180.59, 334.12003, 181.98, 333.80002, 183.49, 333.80002);
generalPath.curveTo(184.99, 333.80002, 186.35, 334.12003, 187.35, 334.64);
generalPath.curveTo(188.37001, 335.17, 189.72, 335.5, 191.26001, 335.5);
generalPath.lineTo(191.28001, 333.09);
shape = generalPath;
paint = new Color(204, 204, 204, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.28, 333.09);
generalPath.curveTo(189.74, 333.09, 188.37, 332.76, 187.35, 332.22);
generalPath.curveTo(186.35, 331.71, 184.99, 331.39, 183.49, 331.39);
generalPath.curveTo(181.98001, 331.39, 180.59001, 331.71002, 179.58, 332.23);
generalPath.curveTo(178.57, 332.76, 177.18001, 333.09, 175.66, 333.09);
generalPath.curveTo(174.12001, 333.09, 172.74, 332.72, 171.73001, 332.19);
generalPath.curveTo(170.73001, 331.7, 169.40001, 331.39, 167.94002, 331.39);
generalPath.curveTo(166.42001, 331.39, 165.08002, 331.69, 164.08002, 332.21002);
generalPath.curveTo(163.06001, 332.74002, 161.66002, 333.09003, 160.13002, 333.09003);
generalPath.lineTo(160.13002, 335.50003);
generalPath.curveTo(161.66002, 335.50003, 163.06001, 335.15002, 164.08002, 334.62003);
generalPath.curveTo(165.08002, 334.10004, 166.42001, 333.80002, 167.94002, 333.80002);
generalPath.curveTo(169.39001, 333.80002, 170.73001, 334.11002, 171.73001, 334.6);
generalPath.curveTo(172.74, 335.14, 174.12001, 335.5, 175.66, 335.5);
generalPath.curveTo(177.18001, 335.5, 178.57, 335.16, 179.58, 334.64);
generalPath.curveTo(180.59, 334.12003, 181.98, 333.80002, 183.49, 333.80002);
generalPath.curveTo(184.99, 333.80002, 186.35, 334.12003, 187.35, 334.64);
generalPath.curveTo(188.37001, 335.17, 189.72, 335.5, 191.26001, 335.5);
generalPath.lineTo(191.28001, 333.09);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.28, 335.5);
generalPath.curveTo(189.74, 335.5, 188.37, 335.17, 187.35, 334.64);
generalPath.curveTo(186.35, 334.12003, 184.99, 333.80002, 183.49, 333.80002);
generalPath.curveTo(181.98001, 333.80002, 180.59001, 334.12003, 179.58, 334.64);
generalPath.curveTo(178.56999, 335.16, 177.18001, 335.5, 175.66, 335.5);
generalPath.curveTo(174.12001, 335.5, 172.74, 335.14, 171.73001, 334.6);
generalPath.curveTo(170.73001, 334.11002, 169.40001, 333.80002, 167.94002, 333.80002);
generalPath.curveTo(166.42001, 333.80002, 165.08002, 334.1, 164.08002, 334.62003);
generalPath.curveTo(163.06001, 335.15002, 161.66002, 335.50003, 160.13002, 335.50003);
generalPath.lineTo(160.13002, 337.90002);
generalPath.curveTo(161.66002, 337.90002, 163.06001, 337.56003, 164.08002, 337.02002);
generalPath.curveTo(165.08002, 336.51, 166.42001, 336.22003, 167.94002, 336.22003);
generalPath.curveTo(169.39001, 336.22003, 170.73001, 336.52002, 171.73001, 337.01004);
generalPath.curveTo(172.74, 337.55005, 174.12001, 337.90005, 175.66, 337.90005);
generalPath.curveTo(177.18001, 337.90005, 178.57, 337.58005, 179.58, 337.05005);
generalPath.curveTo(180.59, 336.53006, 181.98, 336.22006, 183.49, 336.22006);
generalPath.curveTo(184.99, 336.22006, 186.35, 336.53006, 187.35, 337.04007);
generalPath.curveTo(188.37001, 337.59006, 189.72, 337.90005, 191.26001, 337.90005);
generalPath.lineTo(191.28001, 335.50006);
shape = generalPath;
paint = new Color(0, 91, 191, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.28, 335.5);
generalPath.curveTo(189.74, 335.5, 188.37, 335.17, 187.35, 334.64);
generalPath.curveTo(186.35, 334.12003, 184.99, 333.80002, 183.49, 333.80002);
generalPath.curveTo(181.98001, 333.80002, 180.59001, 334.12003, 179.58, 334.64);
generalPath.curveTo(178.56999, 335.16, 177.18001, 335.5, 175.66, 335.5);
generalPath.curveTo(174.12001, 335.5, 172.74, 335.14, 171.73001, 334.6);
generalPath.curveTo(170.73001, 334.11002, 169.40001, 333.80002, 167.94002, 333.80002);
generalPath.curveTo(166.42001, 333.80002, 165.08002, 334.1, 164.08002, 334.62003);
generalPath.curveTo(163.06001, 335.15002, 161.66002, 335.50003, 160.13002, 335.50003);
generalPath.lineTo(160.13002, 337.90002);
generalPath.curveTo(161.66002, 337.90002, 163.06001, 337.56003, 164.08002, 337.02002);
generalPath.curveTo(165.08002, 336.51, 166.42001, 336.22003, 167.94002, 336.22003);
generalPath.curveTo(169.39001, 336.22003, 170.73001, 336.52002, 171.73001, 337.01004);
generalPath.curveTo(172.74, 337.55005, 174.12001, 337.90005, 175.66, 337.90005);
generalPath.curveTo(177.18001, 337.90005, 178.57, 337.58005, 179.58, 337.05005);
generalPath.curveTo(180.59, 336.53006, 181.98, 336.22006, 183.49, 336.22006);
generalPath.curveTo(184.99, 336.22006, 186.35, 336.53006, 187.35, 337.04007);
generalPath.curveTo(188.37001, 337.59006, 189.72, 337.90005, 191.26001, 337.90005);
generalPath.lineTo(191.28001, 335.50006);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.26, 340.32);
generalPath.curveTo(189.72, 340.32, 188.37, 339.99002, 187.34999, 339.45);
generalPath.curveTo(186.34999, 338.94, 184.98999, 338.63, 183.48999, 338.63);
generalPath.curveTo(181.98, 338.63, 180.59, 338.94, 179.57999, 339.46);
generalPath.curveTo(178.56998, 339.97998, 177.18, 340.31998, 175.65999, 340.31998);
generalPath.curveTo(174.12, 340.31998, 172.73999, 339.94998, 171.73, 339.41998);
generalPath.curveTo(170.73, 338.91998, 169.4, 338.62997, 167.94, 338.62997);
generalPath.curveTo(166.42, 338.62997, 165.08, 338.91998, 164.08, 339.43997);
generalPath.curveTo(163.06, 339.96997, 161.66, 340.31998, 160.13, 340.31998);
generalPath.lineTo(160.13, 337.91998);
generalPath.curveTo(161.66, 337.91998, 163.06, 337.56, 164.08, 337.02);
generalPath.curveTo(165.08, 336.50998, 166.42, 336.22, 167.94, 336.22);
generalPath.curveTo(169.39, 336.22, 170.73, 336.52, 171.73, 337.01);
generalPath.curveTo(172.73999, 337.55002, 174.12, 337.90002, 175.65999, 337.90002);
generalPath.curveTo(177.18, 337.90002, 178.56999, 337.58002, 179.57999, 337.05002);
generalPath.curveTo(180.58998, 336.53003, 181.97998, 336.22003, 183.48999, 336.22003);
generalPath.curveTo(184.98999, 336.22003, 186.34999, 336.53003, 187.34999, 337.04004);
generalPath.curveTo(188.37, 337.59003, 189.73999, 337.90002, 191.27998, 337.90002);
generalPath.lineTo(191.25998, 340.32004);
shape = generalPath;
paint = new Color(204, 204, 204, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.26, 340.32);
generalPath.curveTo(189.72, 340.32, 188.37, 339.99002, 187.34999, 339.45);
generalPath.curveTo(186.34999, 338.94, 184.98999, 338.63, 183.48999, 338.63);
generalPath.curveTo(181.98, 338.63, 180.59, 338.94, 179.57999, 339.46);
generalPath.curveTo(178.56998, 339.97998, 177.18, 340.31998, 175.65999, 340.31998);
generalPath.curveTo(174.12, 340.31998, 172.73999, 339.94998, 171.73, 339.41998);
generalPath.curveTo(170.73, 338.91998, 169.4, 338.62997, 167.94, 338.62997);
generalPath.curveTo(166.42, 338.62997, 165.08, 338.91998, 164.08, 339.43997);
generalPath.curveTo(163.06, 339.96997, 161.66, 340.31998, 160.13, 340.31998);
generalPath.lineTo(160.13, 337.91998);
generalPath.curveTo(161.66, 337.91998, 163.06, 337.56, 164.08, 337.02);
generalPath.curveTo(165.08, 336.50998, 166.42, 336.22, 167.94, 336.22);
generalPath.curveTo(169.39, 336.22, 170.73, 336.52, 171.73, 337.01);
generalPath.curveTo(172.73999, 337.55002, 174.12, 337.90002, 175.65999, 337.90002);
generalPath.curveTo(177.18, 337.90002, 178.56999, 337.58002, 179.57999, 337.05002);
generalPath.curveTo(180.58998, 336.53003, 181.97998, 336.22003, 183.48999, 336.22003);
generalPath.curveTo(184.98999, 336.22003, 186.34999, 336.53003, 187.34999, 337.04004);
generalPath.curveTo(188.37, 337.59003, 189.73999, 337.90002, 191.27998, 337.90002);
generalPath.lineTo(191.25998, 340.32004);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.26, 342.73);
generalPath.curveTo(189.72, 342.73, 188.37, 342.40002, 187.34999, 341.87003);
generalPath.curveTo(186.34999, 341.35004, 184.98999, 341.03003, 183.48999, 341.03003);
generalPath.curveTo(181.98, 341.03003, 180.59, 341.35004, 179.57999, 341.87003);
generalPath.curveTo(178.56998, 342.39, 177.18, 342.73, 175.65999, 342.73);
generalPath.curveTo(174.12, 342.73, 172.73999, 342.36002, 171.73, 341.83002);
generalPath.curveTo(170.73, 341.33002, 169.4, 341.03003, 167.94, 341.03003);
generalPath.curveTo(166.42, 341.03003, 165.08, 341.33002, 164.08, 341.85004);
generalPath.curveTo(163.06, 342.38004, 161.66, 342.73004, 160.13, 342.73004);
generalPath.lineTo(160.13, 340.34003);
generalPath.curveTo(161.66, 340.34003, 163.06, 339.97003, 164.08, 339.44003);
generalPath.curveTo(165.08, 338.92004, 166.42, 338.63004, 167.94, 338.63004);
generalPath.curveTo(169.39, 338.63004, 170.73, 338.93002, 171.73, 339.42004);
generalPath.curveTo(172.73999, 339.95004, 174.12, 340.32004, 175.65999, 340.32004);
generalPath.curveTo(177.18, 340.32004, 178.56999, 339.98004, 179.57999, 339.46005);
generalPath.curveTo(180.58998, 338.94006, 181.97998, 338.63007, 183.48999, 338.63007);
generalPath.curveTo(184.98999, 338.63007, 186.34999, 338.94006, 187.34999, 339.45007);
generalPath.curveTo(188.37, 339.99008, 189.73, 340.32007, 191.27998, 340.32007);
generalPath.lineTo(191.25998, 342.73007);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 91, 191, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.26, 342.73);
generalPath.curveTo(189.72, 342.73, 188.37, 342.40002, 187.34999, 341.87003);
generalPath.curveTo(186.34999, 341.35004, 184.98999, 341.03003, 183.48999, 341.03003);
generalPath.curveTo(181.98, 341.03003, 180.59, 341.35004, 179.57999, 341.87003);
generalPath.curveTo(178.56998, 342.39, 177.18, 342.73, 175.65999, 342.73);
generalPath.curveTo(174.12, 342.73, 172.73999, 342.36002, 171.73, 341.83002);
generalPath.curveTo(170.73, 341.33002, 169.4, 341.03003, 167.94, 341.03003);
generalPath.curveTo(166.42, 341.03003, 165.08, 341.33002, 164.08, 341.85004);
generalPath.curveTo(163.06, 342.38004, 161.66, 342.73004, 160.13, 342.73004);
generalPath.lineTo(160.13, 340.34003);
generalPath.curveTo(161.66, 340.34003, 163.06, 339.97003, 164.08, 339.44003);
generalPath.curveTo(165.08, 338.92004, 166.42, 338.63004, 167.94, 338.63004);
generalPath.curveTo(169.39, 338.63004, 170.73, 338.93002, 171.73, 339.42004);
generalPath.curveTo(172.73999, 339.95004, 174.12, 340.32004, 175.65999, 340.32004);
generalPath.curveTo(177.18, 340.32004, 178.56999, 339.98004, 179.57999, 339.46005);
generalPath.curveTo(180.58998, 338.94006, 181.97998, 338.63007, 183.48999, 338.63007);
generalPath.curveTo(184.98999, 338.63007, 186.34999, 338.94006, 187.34999, 339.45007);
generalPath.curveTo(188.37, 339.99008, 189.73, 340.32007, 191.27998, 340.32007);
generalPath.lineTo(191.25998, 342.73007);
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
// _0_2_0_1_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(166.92, 320.78);
generalPath.curveTo(166.97, 320.99, 167.05, 321.18, 167.05, 321.4);
generalPath.curveTo(167.05, 322.86, 165.78, 324.03, 164.24, 324.03);
generalPath.lineTo(187.18001, 324.03);
generalPath.curveTo(185.63, 324.03, 184.37001, 322.86, 184.37001, 321.4);
generalPath.curveTo(184.37001, 321.19, 184.41, 320.99, 184.46, 320.78);
generalPath.curveTo(184.33, 320.83, 184.17001, 320.84, 184.02, 320.84);
generalPath.lineTo(167.33, 320.84);
generalPath.curveTo(167.2, 320.84, 167.04001, 320.82, 166.92, 320.78);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(166.92, 320.78);
generalPath.curveTo(166.97, 320.99, 167.05, 321.18, 167.05, 321.4);
generalPath.curveTo(167.05, 322.86, 165.78, 324.03, 164.24, 324.03);
generalPath.lineTo(187.18001, 324.03);
generalPath.curveTo(185.63, 324.03, 184.37001, 322.86, 184.37001, 321.4);
generalPath.curveTo(184.37001, 321.19, 184.41, 320.99, 184.46, 320.78);
generalPath.curveTo(184.33, 320.83, 184.17001, 320.84, 184.02, 320.84);
generalPath.lineTo(167.33, 320.84);
generalPath.curveTo(167.2, 320.84, 167.04001, 320.82, 166.92, 320.78);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_1_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.33, 319.27);
generalPath.lineTo(184.02, 319.27);
generalPath.curveTo(184.59001, 319.27, 185.04001, 319.62, 185.04001, 320.05);
generalPath.curveTo(185.04001, 320.47998, 184.59001, 320.84, 184.02, 320.84);
generalPath.lineTo(167.33, 320.84);
generalPath.curveTo(166.77, 320.84, 166.31, 320.48, 166.31, 320.05);
generalPath.curveTo(166.31, 319.61996, 166.77, 319.27, 167.33, 319.27);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.33, 319.27);
generalPath.lineTo(184.02, 319.27);
generalPath.curveTo(184.59001, 319.27, 185.04001, 319.62, 185.04001, 320.05);
generalPath.curveTo(185.04001, 320.47998, 184.59001, 320.84, 184.02, 320.84);
generalPath.lineTo(167.33, 320.84);
generalPath.curveTo(166.77, 320.84, 166.31, 320.48, 166.31, 320.05);
generalPath.curveTo(166.31, 319.61996, 166.77, 319.27, 167.33, 319.27);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_1_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(164.27, 329.86);
generalPath.lineTo(187.14, 329.86);
generalPath.lineTo(187.14, 324.03);
generalPath.lineTo(164.27, 324.03);
generalPath.lineTo(164.27, 329.86);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(164.27, 329.86);
generalPath.lineTo(187.14, 329.86);
generalPath.lineTo(187.14, 324.03);
generalPath.lineTo(164.27, 324.03);
generalPath.lineTo(164.27, 329.86);
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
// _0_2_0_1_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.55, 318.32);
generalPath.lineTo(183.8, 318.32);
generalPath.lineTo(183.8, 238.69);
generalPath.lineTo(167.55, 238.69);
generalPath.lineTo(167.55, 318.32);
generalPath.closePath();
shape = generalPath;
paint = new Color(204, 204, 204, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.55, 318.32);
generalPath.lineTo(183.8, 318.32);
generalPath.lineTo(183.8, 238.69);
generalPath.lineTo(167.55, 238.69);
generalPath.lineTo(167.55, 318.32);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_3
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(179.13, 238.8);
generalPath.lineTo(179.13, 318.26);
generalPath.moveTo(180.96, 238.80002);
generalPath.lineTo(180.96, 318.26);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(164.58, 232.37);
generalPath.lineTo(186.87, 232.37);
generalPath.lineTo(186.87, 226.53);
generalPath.lineTo(164.57999, 226.53);
generalPath.lineTo(164.57999, 232.37);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(164.58, 232.37);
generalPath.lineTo(186.87, 232.37);
generalPath.lineTo(186.87, 226.53);
generalPath.lineTo(164.57999, 226.53);
generalPath.lineTo(164.57999, 232.37);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_4_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(166.92, 236.26);
generalPath.curveTo(167.06, 236.2, 167.16, 236.18999, 167.33, 236.18999);
generalPath.lineTo(184.02, 236.18999);
generalPath.curveTo(184.19, 236.18999, 184.34001, 236.21999, 184.48001, 236.26999);
generalPath.curveTo(183.90001, 236.07999, 183.49, 235.55998, 183.49, 234.94998);
generalPath.curveTo(183.49, 234.33998, 183.94, 233.80998, 184.52, 233.61998);
generalPath.curveTo(184.38, 233.65997, 184.19, 233.69998, 184.03, 233.69998);
generalPath.lineTo(167.33, 233.69998);
generalPath.curveTo(167.16, 233.69998, 167.0, 233.68999, 166.86, 233.63998);
generalPath.lineTo(166.95, 233.65999);
generalPath.curveTo(167.55, 233.83998, 167.89, 234.37, 167.89, 234.94998);
generalPath.curveTo(167.89, 235.50998, 167.51, 236.07999, 166.92, 236.25998);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(166.92, 236.26);
generalPath.curveTo(167.06, 236.2, 167.16, 236.18999, 167.33, 236.18999);
generalPath.lineTo(184.02, 236.18999);
generalPath.curveTo(184.19, 236.18999, 184.34001, 236.21999, 184.48001, 236.26999);
generalPath.curveTo(183.90001, 236.07999, 183.49, 235.55998, 183.49, 234.94998);
generalPath.curveTo(183.49, 234.33998, 183.94, 233.80998, 184.52, 233.61998);
generalPath.curveTo(184.38, 233.65997, 184.19, 233.69998, 184.03, 233.69998);
generalPath.lineTo(167.33, 233.69998);
generalPath.curveTo(167.16, 233.69998, 167.0, 233.68999, 166.86, 233.63998);
generalPath.lineTo(166.95, 233.65999);
generalPath.curveTo(167.55, 233.83998, 167.89, 234.37, 167.89, 234.94998);
generalPath.curveTo(167.89, 235.50998, 167.51, 236.07999, 166.92, 236.25998);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_4_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.33, 236.19);
generalPath.lineTo(184.02, 236.19);
generalPath.curveTo(184.59001, 236.19, 185.04001, 236.54001, 185.04001, 236.97);
generalPath.curveTo(185.04001, 237.41, 184.59001, 237.76, 184.02, 237.76);
generalPath.lineTo(167.33, 237.76);
generalPath.curveTo(166.77, 237.76, 166.31, 237.40999, 166.31, 236.97);
generalPath.curveTo(166.31, 236.54001, 166.77, 236.19, 167.33, 236.19);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.33, 236.19);
generalPath.lineTo(184.02, 236.19);
generalPath.curveTo(184.59001, 236.19, 185.04001, 236.54001, 185.04001, 236.97);
generalPath.curveTo(185.04001, 237.41, 184.59001, 237.76, 184.02, 237.76);
generalPath.lineTo(167.33, 237.76);
generalPath.curveTo(166.77, 237.76, 166.31, 237.40999, 166.31, 236.97);
generalPath.curveTo(166.31, 236.54001, 166.77, 236.19, 167.33, 236.19);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1_4_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.33, 232.37);
generalPath.lineTo(184.03, 232.37);
generalPath.curveTo(184.6, 232.37, 185.06, 232.67, 185.06, 233.03);
generalPath.curveTo(185.06, 233.4, 184.59999, 233.7, 184.03, 233.7);
generalPath.lineTo(167.33, 233.7);
generalPath.curveTo(166.77, 233.7, 166.31, 233.4, 166.31, 233.03);
generalPath.curveTo(166.31, 232.67, 166.77, 232.37, 167.33, 232.37);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.33, 232.37);
generalPath.lineTo(184.03, 232.37);
generalPath.curveTo(184.6, 232.37, 185.06, 232.67, 185.06, 233.03);
generalPath.curveTo(185.06, 233.4, 184.59999, 233.7, 184.03, 233.7);
generalPath.lineTo(167.33, 233.7);
generalPath.curveTo(166.77, 233.7, 166.31, 233.4, 166.31, 233.03);
generalPath.curveTo(166.31, 232.67, 166.77, 232.37, 167.33, 232.37);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(162.48, 298.62);
generalPath.curveTo(160.22, 299.91998, 158.68, 301.26, 158.93, 301.93);
generalPath.curveTo(159.04999, 302.53998, 159.76999, 303.0, 160.79999, 303.68);
generalPath.curveTo(162.41998, 304.81, 163.4, 306.82, 162.62999, 307.75);
generalPath.curveTo(163.96999, 306.67, 164.81999, 305.06, 164.81999, 303.26);
generalPath.curveTo(164.81999, 301.39, 163.92, 299.7, 162.48, 298.62);
generalPath.closePath();
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(162.48, 298.62);
generalPath.curveTo(160.22, 299.91998, 158.68, 301.26, 158.93, 301.93);
generalPath.curveTo(159.04999, 302.53998, 159.76999, 303.0, 160.79999, 303.68);
generalPath.curveTo(162.41998, 304.81, 163.4, 306.82, 162.62999, 307.75);
generalPath.curveTo(163.96999, 306.67, 164.81999, 305.06, 164.81999, 303.26);
generalPath.curveTo(164.81999, 301.39, 163.92, 299.7, 162.48, 298.62);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(200.4, 268.47);
generalPath.curveTo(196.86, 267.01, 190.82999, 265.92, 183.90999, 265.69);
generalPath.curveTo(181.51999, 265.71, 178.87, 265.94, 176.12, 266.39);
generalPath.curveTo(166.4, 268.02002, 158.98999, 271.90002, 159.57999, 275.06003);
generalPath.curveTo(159.58998, 275.12003, 159.61998, 275.26004, 159.62999, 275.32004);
generalPath.curveTo(159.62999, 275.32004, 155.98999, 267.11005, 155.93, 266.80005);
generalPath.curveTo(155.28, 263.29004, 163.48999, 258.98004, 174.28, 257.18005);
generalPath.curveTo(177.67, 256.61005, 180.97, 256.39005, 183.84, 256.42004);
generalPath.curveTo(190.73999, 256.42004, 196.73999, 257.31006, 200.36, 258.65005);
generalPath.lineTo(200.4, 268.47006);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(200.4, 268.47);
generalPath.curveTo(196.86, 267.01, 190.82999, 265.92, 183.90999, 265.69);
generalPath.curveTo(181.51999, 265.71, 178.87, 265.94, 176.12, 266.39);
generalPath.curveTo(166.4, 268.02002, 158.98999, 271.90002, 159.57999, 275.06003);
generalPath.curveTo(159.58998, 275.12003, 159.61998, 275.26004, 159.62999, 275.32004);
generalPath.curveTo(159.62999, 275.32004, 155.98999, 267.11005, 155.93, 266.80005);
generalPath.curveTo(155.28, 263.29004, 163.48999, 258.98004, 174.28, 257.18005);
generalPath.curveTo(177.67, 256.61005, 180.97, 256.39005, 183.84, 256.42004);
generalPath.curveTo(190.73999, 256.42004, 196.73999, 257.31006, 200.36, 258.65005);
generalPath.lineTo(200.4, 268.47006);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.52, 278.47);
generalPath.curveTo(163.01001, 278.15, 159.94, 276.94, 159.58, 275.06);
generalPath.curveTo(159.3, 273.56, 160.83, 271.88998, 163.55, 270.38);
generalPath.curveTo(164.76001, 270.52002, 166.13, 270.68, 167.55, 270.68);
generalPath.lineTo(167.52, 278.47);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.52, 278.47);
generalPath.curveTo(163.01001, 278.15, 159.94, 276.94, 159.58, 275.06);
generalPath.curveTo(159.3, 273.56, 160.83, 271.88998, 163.55, 270.38);
generalPath.curveTo(164.76001, 270.52002, 166.13, 270.68, 167.55, 270.68);
generalPath.lineTo(167.52, 278.47);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_2_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.83, 272.38);
generalPath.curveTo(186.65001, 272.81, 188.76, 273.51, 189.81, 274.37);
generalPath.lineTo(189.91, 274.54);
generalPath.curveTo(190.41, 275.57, 187.94, 277.76, 183.8, 280.21002);
generalPath.lineTo(183.83, 272.38004);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.83, 272.38);
generalPath.curveTo(186.65001, 272.81, 188.76, 273.51, 189.81, 274.37);
generalPath.lineTo(189.91, 274.54);
generalPath.curveTo(190.41, 275.57, 187.94, 277.76, 183.8, 280.21002);
generalPath.lineTo(183.83, 272.38004);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_2_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(157.42, 293.83);
generalPath.curveTo(156.99, 292.55, 161.39, 289.97, 167.6, 287.68997);
generalPath.curveTo(170.44, 286.67996, 172.78, 285.61996, 175.69, 284.33997);
generalPath.curveTo(184.32, 280.51996, 190.69, 276.13995, 189.91, 274.54996);
generalPath.lineTo(189.82, 274.37994);
generalPath.curveTo(190.28001, 274.75995, 191.0, 282.61993, 191.0, 282.61993);
generalPath.curveTo(191.78, 284.07993, 185.95, 288.39993, 178.0, 292.19992);
generalPath.curveTo(175.46, 293.41992, 170.09, 295.39993, 167.56, 296.28992);
generalPath.curveTo(163.02, 297.85992, 158.52, 300.82993, 158.93, 301.92993);
generalPath.lineTo(157.42, 293.83994);
generalPath.lineTo(157.42, 293.82993);
generalPath.closePath();
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(157.42, 293.83);
generalPath.curveTo(156.99, 292.55, 161.39, 289.97, 167.6, 287.68997);
generalPath.curveTo(170.44, 286.67996, 172.78, 285.61996, 175.69, 284.33997);
generalPath.curveTo(184.32, 280.51996, 190.69, 276.13995, 189.91, 274.54996);
generalPath.lineTo(189.82, 274.37994);
generalPath.curveTo(190.28001, 274.75995, 191.0, 282.61993, 191.0, 282.61993);
generalPath.curveTo(191.78, 284.07993, 185.95, 288.39993, 178.0, 292.19992);
generalPath.curveTo(175.46, 293.41992, 170.09, 295.39993, 167.56, 296.28992);
generalPath.curveTo(163.02, 297.85992, 158.52, 300.82993, 158.93, 301.92993);
generalPath.lineTo(157.42, 293.83994);
generalPath.lineTo(157.42, 293.82993);
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
// _0_2_0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(324.85, 220.42);
generalPath.curveTo(324.85, 220.42, 324.11002, 221.2, 323.57, 221.31);
generalPath.curveTo(323.04, 221.41, 322.36002, 220.81999, 322.36002, 220.81999);
generalPath.curveTo(322.36002, 220.81999, 321.88, 221.32999, 321.28003, 221.45999);
generalPath.curveTo(320.69003, 221.59999, 319.87003, 220.79999, 319.87003, 220.79999);
generalPath.curveTo(319.87003, 220.79999, 319.30002, 221.59999, 318.80002, 221.79);
generalPath.curveTo(318.29, 221.96999, 317.67, 221.54999, 317.67, 221.54999);
generalPath.curveTo(317.67, 221.54999, 317.44, 221.93999, 317.02002, 222.15999);
generalPath.curveTo(316.84003, 222.24998, 316.54, 222.10999, 316.54, 222.10999);
generalPath.lineTo(315.94, 221.72998);
generalPath.lineTo(315.26, 221.00998);
generalPath.lineTo(314.64, 220.76997);
generalPath.curveTo(314.64, 220.76997, 314.36002, 219.85997, 314.33002, 219.69997);
generalPath.curveTo(314.31003, 219.53996, 314.25003, 219.12996, 314.25003, 219.12996);
generalPath.curveTo(314.12003, 218.47997, 315.12003, 217.72997, 316.55002, 217.40996);

}

private void _paint3(Graphics2D g,float origAlpha) {
generalPath.curveTo(317.37003, 217.21996, 318.09003, 217.22997, 318.61002, 217.38995);
generalPath.curveTo(319.18002, 216.90996, 320.39, 216.56995, 321.81003, 216.56995);
generalPath.curveTo(323.10004, 216.56995, 324.23004, 216.83995, 324.85004, 217.26994);
generalPath.curveTo(325.46002, 216.83995, 326.59003, 216.56995, 327.88004, 216.56995);
generalPath.curveTo(329.30005, 216.56995, 330.50003, 216.90994, 331.07004, 217.38995);
generalPath.curveTo(331.60004, 217.22995, 332.31003, 217.21996, 333.14005, 217.40996);
generalPath.curveTo(334.56006, 217.72997, 335.57004, 218.47997, 335.44003, 219.12996);
generalPath.curveTo(335.44003, 219.12996, 335.38004, 219.53996, 335.36005, 219.69997);
generalPath.curveTo(335.33005, 219.85997, 335.04004, 220.76997, 335.04004, 220.76997);
generalPath.lineTo(334.42004, 221.00998);
generalPath.lineTo(333.74005, 221.72998);
generalPath.lineTo(333.16006, 222.10999);
generalPath.curveTo(333.16006, 222.10999, 332.86008, 222.24998, 332.68005, 222.15999);
generalPath.curveTo(332.25006, 221.94998, 332.02005, 221.54999, 332.02005, 221.54999);
generalPath.curveTo(332.02005, 221.54999, 331.40005, 221.96999, 330.89005, 221.79);
generalPath.curveTo(330.38004, 221.59999, 329.82004, 220.79999, 329.82004, 220.79999);
generalPath.curveTo(329.82004, 220.79999, 329.00003, 221.59999, 328.40002, 221.45999);
generalPath.curveTo(327.81003, 221.32999, 327.33002, 220.81999, 327.33002, 220.81999);
generalPath.curveTo(327.33002, 220.81999, 326.65002, 221.40999, 326.12003, 221.31);
generalPath.curveTo(325.58002, 221.2, 324.85004, 220.42, 324.85004, 220.42);
generalPath.closePath();
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.27f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(324.85, 220.42);
generalPath.curveTo(324.85, 220.42, 324.11002, 221.2, 323.57, 221.31);
generalPath.curveTo(323.04, 221.41, 322.36002, 220.81999, 322.36002, 220.81999);
generalPath.curveTo(322.36002, 220.81999, 321.88, 221.32999, 321.28003, 221.45999);
generalPath.curveTo(320.69003, 221.59999, 319.87003, 220.79999, 319.87003, 220.79999);
generalPath.curveTo(319.87003, 220.79999, 319.30002, 221.59999, 318.80002, 221.79);
generalPath.curveTo(318.29, 221.96999, 317.67, 221.54999, 317.67, 221.54999);
generalPath.curveTo(317.67, 221.54999, 317.44, 221.93999, 317.02002, 222.15999);
generalPath.curveTo(316.84003, 222.24998, 316.54, 222.10999, 316.54, 222.10999);
generalPath.lineTo(315.94, 221.72998);
generalPath.lineTo(315.26, 221.00998);
generalPath.lineTo(314.64, 220.76997);
generalPath.curveTo(314.64, 220.76997, 314.36002, 219.85997, 314.33002, 219.69997);
generalPath.curveTo(314.31003, 219.53996, 314.25003, 219.12996, 314.25003, 219.12996);
generalPath.curveTo(314.12003, 218.47997, 315.12003, 217.72997, 316.55002, 217.40996);
generalPath.curveTo(317.37003, 217.21996, 318.09003, 217.22997, 318.61002, 217.38995);
generalPath.curveTo(319.18002, 216.90996, 320.39, 216.56995, 321.81003, 216.56995);
generalPath.curveTo(323.10004, 216.56995, 324.23004, 216.83995, 324.85004, 217.26994);
generalPath.curveTo(325.46002, 216.83995, 326.59003, 216.56995, 327.88004, 216.56995);
generalPath.curveTo(329.30005, 216.56995, 330.50003, 216.90994, 331.07004, 217.38995);
generalPath.curveTo(331.60004, 217.22995, 332.31003, 217.21996, 333.14005, 217.40996);
generalPath.curveTo(334.56006, 217.72997, 335.57004, 218.47997, 335.44003, 219.12996);
generalPath.curveTo(335.44003, 219.12996, 335.38004, 219.53996, 335.36005, 219.69997);
generalPath.curveTo(335.33005, 219.85997, 335.04004, 220.76997, 335.04004, 220.76997);
generalPath.lineTo(334.42004, 221.00998);
generalPath.lineTo(333.74005, 221.72998);
generalPath.lineTo(333.16006, 222.10999);
generalPath.curveTo(333.16006, 222.10999, 332.86008, 222.24998, 332.68005, 222.15999);
generalPath.curveTo(332.25006, 221.94998, 332.02005, 221.54999, 332.02005, 221.54999);
generalPath.curveTo(332.02005, 221.54999, 331.40005, 221.96999, 330.89005, 221.79);
generalPath.curveTo(330.38004, 221.59999, 329.82004, 220.79999, 329.82004, 220.79999);
generalPath.curveTo(329.82004, 220.79999, 329.00003, 221.59999, 328.40002, 221.45999);
generalPath.curveTo(327.81003, 221.32999, 327.33002, 220.81999, 327.33002, 220.81999);
generalPath.curveTo(327.33002, 220.81999, 326.65002, 221.40999, 326.12003, 221.31);
generalPath.curveTo(325.58002, 221.2, 324.85004, 220.42, 324.85004, 220.42);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_1_0
shape = new Ellipse2D.Double(323.44000244140625, 214.239990234375, 2.759999990463257, 3.9200000762939453);
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(323.44000244140625, 214.239990234375, 2.759999990463257, 3.9200000762939453);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_1_1
shape = new Ellipse2D.Double(324.2200012207031, 214.38999938964844, 1.2599999904632568, 3.619999885559082);
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(324.2200012207031, 214.38999938964844, 1.2599999904632568, 3.619999885559082);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_1_2
shape = new Ellipse2D.Double(323.9100036621094, 213.0699920654297, 1.8600000143051147, 1.7599999904632568);
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_1_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(326.13, 213.64);
generalPath.lineTo(326.13, 214.22);
generalPath.lineTo(323.6, 214.22);
generalPath.lineTo(323.6, 213.64);
generalPath.lineTo(324.54, 213.64);
generalPath.lineTo(324.54, 212.34);
generalPath.lineTo(323.92, 212.34);
generalPath.lineTo(323.92, 211.76);
generalPath.lineTo(324.54, 211.76);
generalPath.lineTo(324.54, 211.18);
generalPath.lineTo(325.15, 211.18);
generalPath.lineTo(325.15, 211.76);
generalPath.lineTo(325.75998, 211.76);
generalPath.lineTo(325.75998, 212.34);
generalPath.lineTo(325.15, 212.34);
generalPath.lineTo(325.15, 213.64);
generalPath.lineTo(326.13, 213.64);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.3f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(326.13, 213.64);
generalPath.lineTo(326.13, 214.22);
generalPath.lineTo(323.6, 214.22);
generalPath.lineTo(323.6, 213.64);
generalPath.lineTo(324.54, 213.64);
generalPath.lineTo(324.54, 212.34);
generalPath.lineTo(323.92, 212.34);
generalPath.lineTo(323.92, 211.76);
generalPath.lineTo(324.54, 211.76);
generalPath.lineTo(324.54, 211.18);
generalPath.lineTo(325.15, 211.18);
generalPath.lineTo(325.15, 211.76);
generalPath.lineTo(325.75998, 211.76);
generalPath.lineTo(325.75998, 212.34);
generalPath.lineTo(325.15, 212.34);
generalPath.lineTo(325.15, 213.64);
generalPath.lineTo(326.13, 213.64);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_1_4
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(325.11, 213.12);
generalPath.curveTo(325.55334, 213.24908, 325.82837, 213.66759, 325.75464, 214.10094);
generalPath.curveTo(325.6809, 214.53429, 325.28098, 214.84998, 324.8172, 214.84088);
generalPath.curveTo(324.35342, 214.8318, 323.96765, 214.50072, 323.91296, 214.06485);
generalPath.curveTo(323.85825, 213.62898, 324.15137, 213.22162, 324.59998, 213.11);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_0
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,1,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(314.41, 219.99);
generalPath.curveTo(314.28, 219.66, 314.19, 219.29001, 314.19, 218.91);
generalPath.curveTo(314.19, 217.32, 315.45, 216.03, 317.02, 216.03);
generalPath.curveTo(317.52, 216.03, 317.97998, 216.16, 318.38998, 216.4);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_1
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(319.48, 217.93);
generalPath.curveTo(319.33002, 217.67, 319.19, 217.39, 319.19, 217.09);
generalPath.curveTo(319.19, 215.94, 320.38, 215.01, 321.83002, 215.01);
generalPath.curveTo(322.45, 215.01, 323.03003, 215.18, 323.48, 215.45999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_2
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(330.17, 217.96);
generalPath.curveTo(330.32, 217.70001, 330.42, 217.39, 330.42, 217.09001);
generalPath.curveTo(330.42, 215.94002, 329.24002, 215.01001, 327.78, 215.01001);
generalPath.curveTo(327.16, 215.01001, 326.59, 215.18001, 326.13998, 215.46);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_3
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,1,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(335.21, 219.99);
generalPath.curveTo(335.34, 219.66, 335.41998, 219.29001, 335.41998, 218.91);
generalPath.curveTo(335.41998, 217.32, 334.15997, 216.03, 332.59998, 216.03);
generalPath.curveTo(332.09998, 216.03, 331.62997, 216.16, 331.21997, 216.4);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_4
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(313.1199951171875, 218.25, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_5
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(313.28997802734375, 216.67001342773438, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_6
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(314.30999755859375, 215.47000122070312, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_7
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(315.65997314453125, 214.82000732421875, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_8
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(317.0999755859375, 214.8800048828125, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_9
shape = new Ellipse2D.Double(317.97998046875, 216.65000915527344, 0.8999999761581421, 0.8600000143051147);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(317.97998046875, 216.65000915527344, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_10
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(318.22998046875, 215.15000915527344, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_11
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(319.3599853515625, 214.2100067138672, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_12
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(320.7799987792969, 213.760009765625, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_13
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(322.2200012207031, 213.8100128173828, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_14
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(326.489990234375, 213.8100128173828, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_15
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(327.94000244140625, 213.760009765625, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_16
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(329.3499755859375, 214.2100067138672, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_17
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(330.47998046875, 215.15000915527344, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_18
shape = new Ellipse2D.Double(330.72998046875, 216.65000915527344, 0.8999999761581421, 0.8600000143051147);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(330.72998046875, 216.65000915527344, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_19
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(331.6099853515625, 214.8800048828125, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_20
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(333.05999755859375, 214.82000732421875, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_21
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(334.40997314453125, 215.47000122070312, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_22
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(335.42999267578125, 216.67001342773438, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_2_23
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.21f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(335.5999755859375, 218.25, 0.8999999761581421, 0.8600000143051147);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 149.1699981689453f, 0.0f));
// _0_2_0_3_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.58, 224.25);
generalPath.curveTo(168.38, 223.68, 168.0, 223.17, 168.0, 223.17);
generalPath.curveTo(169.95, 222.59999, 172.66, 222.24, 175.67, 222.23);
generalPath.curveTo(178.68, 222.23999, 181.42, 222.59999, 183.36, 223.17);
generalPath.curveTo(183.36, 223.17, 183.14, 223.55, 182.84, 224.08);
generalPath.curveTo(182.67, 224.38, 182.45, 224.89, 182.45999, 224.89);
generalPath.curveTo(180.70999, 224.35, 178.43999, 224.08, 175.65999, 224.06999);
generalPath.curveTo(172.87, 224.07999, 170.19998, 224.42, 168.79999, 224.93);
generalPath.curveTo(168.81999, 224.93, 168.69998, 224.60999, 168.56999, 224.25);
generalPath.lineTo(168.57999, 224.25);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.58, 224.25);
generalPath.curveTo(168.38, 223.68, 168.0, 223.17, 168.0, 223.17);
generalPath.curveTo(169.95, 222.59999, 172.66, 222.24, 175.67, 222.23);
generalPath.curveTo(178.68, 222.23999, 181.42, 222.59999, 183.36, 223.17);
generalPath.curveTo(183.36, 223.17, 183.14, 223.55, 182.84, 224.08);
generalPath.curveTo(182.67, 224.38, 182.45, 224.89, 182.45999, 224.89);
generalPath.curveTo(180.70999, 224.35, 178.43999, 224.08, 175.65999, 224.06999);
generalPath.curveTo(172.87, 224.07999, 170.19998, 224.42, 168.79999, 224.93);
generalPath.curveTo(168.81999, 224.93, 168.69998, 224.60999, 168.56999, 224.25);
generalPath.lineTo(168.57999, 224.25);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.67, 226.73);
generalPath.curveTo(178.09999, 226.72, 180.78, 226.34999, 181.77, 226.09999);
generalPath.curveTo(182.43001, 225.9, 182.82, 225.60999, 182.75, 225.26);
generalPath.curveTo(182.71, 225.09999, 182.57, 224.95999, 182.38, 224.87999);
generalPath.curveTo(180.92, 224.40999, 178.31, 224.07999, 175.67, 224.07999);
generalPath.curveTo(173.04, 224.07999, 170.4, 224.40999, 168.95, 224.87999);
generalPath.curveTo(168.76, 224.95999, 168.62, 225.09999, 168.58, 225.26);
generalPath.curveTo(168.51, 225.61, 168.90001, 225.9, 169.56, 226.09999);
generalPath.curveTo(170.55, 226.34999, 173.23999, 226.71999, 175.67, 226.73);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.67, 226.73);
generalPath.curveTo(178.09999, 226.72, 180.78, 226.34999, 181.77, 226.09999);
generalPath.curveTo(182.43001, 225.9, 182.82, 225.60999, 182.75, 225.26);
generalPath.curveTo(182.71, 225.09999, 182.57, 224.95999, 182.38, 224.87999);
generalPath.curveTo(180.92, 224.40999, 178.31, 224.07999, 175.67, 224.07999);
generalPath.curveTo(173.04, 224.07999, 170.4, 224.40999, 168.95, 224.87999);
generalPath.curveTo(168.76, 224.95999, 168.62, 225.09999, 168.58, 225.26);
generalPath.curveTo(168.51, 225.61, 168.90001, 225.9, 169.56, 226.09999);
generalPath.curveTo(170.55, 226.34999, 173.23999, 226.71999, 175.67, 226.73);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.48, 222.08);
generalPath.lineTo(182.89, 221.55);
generalPath.curveTo(182.89, 221.55, 182.31999, 221.89, 181.61, 221.79001);
generalPath.curveTo(180.91, 221.68001, 180.68001, 220.82, 180.68001, 220.82);
generalPath.curveTo(180.68001, 220.82, 179.89001, 221.49, 179.24, 221.44);
generalPath.curveTo(178.59001, 221.38, 178.17, 220.82, 178.17, 220.82);
generalPath.curveTo(178.17, 220.82, 177.45999, 221.33, 176.84, 221.28001);
generalPath.curveTo(176.22, 221.22002, 175.62999, 220.45001, 175.62999, 220.45001);
generalPath.curveTo(175.62999, 220.45001, 174.99998, 221.25002, 174.37999, 221.31001);
generalPath.curveTo(173.76, 221.36002, 173.24998, 220.77002, 173.24998, 220.77002);
generalPath.curveTo(173.24998, 220.77002, 172.96999, 221.36002, 172.17998, 221.49002);
generalPath.curveTo(171.38997, 221.62003, 170.70998, 220.87003, 170.70998, 220.87003);
generalPath.curveTo(170.70998, 220.87003, 170.25998, 221.60002, 169.71997, 221.79002);
generalPath.curveTo(169.17998, 221.97002, 168.47997, 221.52002, 168.47997, 221.52002);
generalPath.curveTo(168.47997, 221.52002, 168.35997, 221.79002, 168.27997, 221.95001);
generalPath.curveTo(168.19997, 222.11, 167.96997, 222.14001, 167.96997, 222.14001);
generalPath.lineTo(168.14996, 222.61002);
generalPath.curveTo(170.07996, 222.05002, 172.70996, 221.70001, 175.67996, 221.70001);
generalPath.curveTo(178.64996, 221.70001, 181.34996, 222.05002, 183.28996, 222.62001);
generalPath.lineTo(183.48996, 222.08002);
generalPath.lineTo(183.47997, 222.08002);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.48, 222.08);
generalPath.lineTo(182.89, 221.55);
generalPath.curveTo(182.89, 221.55, 182.31999, 221.89, 181.61, 221.79001);
generalPath.curveTo(180.91, 221.68001, 180.68001, 220.82, 180.68001, 220.82);
generalPath.curveTo(180.68001, 220.82, 179.89001, 221.49, 179.24, 221.44);
generalPath.curveTo(178.59001, 221.38, 178.17, 220.82, 178.17, 220.82);
generalPath.curveTo(178.17, 220.82, 177.45999, 221.33, 176.84, 221.28001);
generalPath.curveTo(176.22, 221.22002, 175.62999, 220.45001, 175.62999, 220.45001);
generalPath.curveTo(175.62999, 220.45001, 174.99998, 221.25002, 174.37999, 221.31001);
generalPath.curveTo(173.76, 221.36002, 173.24998, 220.77002, 173.24998, 220.77002);
generalPath.curveTo(173.24998, 220.77002, 172.96999, 221.36002, 172.17998, 221.49002);
generalPath.curveTo(171.38997, 221.62003, 170.70998, 220.87003, 170.70998, 220.87003);
generalPath.curveTo(170.70998, 220.87003, 170.25998, 221.60002, 169.71997, 221.79002);
generalPath.curveTo(169.17998, 221.97002, 168.47997, 221.52002, 168.47997, 221.52002);
generalPath.curveTo(168.47997, 221.52002, 168.35997, 221.79002, 168.27997, 221.95001);
generalPath.curveTo(168.19997, 222.11, 167.96997, 222.14001, 167.96997, 222.14001);
generalPath.lineTo(168.14996, 222.61002);
generalPath.curveTo(170.07996, 222.05002, 172.70996, 221.70001, 175.67996, 221.70001);
generalPath.curveTo(178.64996, 221.70001, 181.34996, 222.05002, 183.28996, 222.62001);
generalPath.lineTo(183.48996, 222.08002);
generalPath.lineTo(183.47997, 222.08002);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.69, 219.49);
generalPath.lineTo(175.97, 219.54001);
generalPath.curveTo(175.92, 219.66, 175.91, 219.78001, 175.91, 219.92001);
generalPath.curveTo(175.91, 220.50002, 176.41, 220.97002, 177.03, 220.97002);
generalPath.curveTo(177.52, 220.97002, 177.94, 220.66002, 178.09, 220.24002);
generalPath.curveTo(178.09999, 220.25002, 178.2, 219.86002, 178.23999, 219.86002);
generalPath.curveTo(178.26999, 219.86002, 178.26999, 220.27002, 178.29, 220.27002);
generalPath.curveTo(178.36, 220.80002, 178.84, 221.16002, 179.39, 221.16002);
generalPath.curveTo(180.01, 221.16002, 180.5, 220.69002, 180.5, 220.10002);
generalPath.curveTo(180.5, 220.06003, 180.5, 220.02002, 180.49, 219.98003);
generalPath.lineTo(180.84001, 219.63002);
generalPath.lineTo(181.03001, 220.07002);
generalPath.curveTo(180.96, 220.21002, 180.93001, 220.36002, 180.93001, 220.53003);
generalPath.curveTo(180.93001, 221.09003, 181.40001, 221.54002, 181.99, 221.54002);
generalPath.curveTo(182.36, 221.54002, 182.68001, 221.36003, 182.87001, 221.09003);
generalPath.lineTo(183.1, 220.80003);
generalPath.lineTo(183.1, 221.16003);
generalPath.curveTo(183.1, 221.50003, 183.24, 221.82004, 183.59001, 221.87004);
generalPath.curveTo(183.59001, 221.87004, 183.97002, 221.90004, 184.50002, 221.49004);
generalPath.curveTo(185.02002, 221.08003, 185.30002, 220.74004, 185.30002, 220.74004);
generalPath.lineTo(185.33002, 221.16003);
generalPath.curveTo(185.33002, 221.16003, 184.82002, 222.00003, 184.36002, 222.26004);
generalPath.curveTo(184.11002, 222.41003, 183.72002, 222.57004, 183.41002, 222.51004);
generalPath.curveTo(183.09001, 222.46004, 182.86002, 222.20004, 182.74002, 221.90004);
generalPath.curveTo(182.51003, 222.04004, 182.23003, 222.12004, 181.94002, 222.12004);
generalPath.curveTo(181.31001, 222.12004, 180.74002, 221.77003, 180.52002, 221.26004);
generalPath.curveTo(180.23003, 221.57004, 179.83002, 221.76004, 179.36002, 221.76004);
generalPath.curveTo(178.85002, 221.76004, 178.39001, 221.53004, 178.10002, 221.18004);
generalPath.curveTo(177.82002, 221.45004, 177.43002, 221.61003, 177.01003, 221.61003);
generalPath.curveTo(176.46002, 221.61003, 175.96002, 221.33003, 175.68002, 220.92003);
generalPath.curveTo(175.39003, 221.33003, 174.90002, 221.61003, 174.34003, 221.61003);
generalPath.curveTo(173.92003, 221.61003, 173.53003, 221.45003, 173.25003, 221.18004);
generalPath.curveTo(172.96004, 221.53004, 172.50003, 221.76004, 172.00003, 221.76004);
generalPath.curveTo(171.52003, 221.76004, 171.12003, 221.57004, 170.83003, 221.26004);
generalPath.curveTo(170.61003, 221.77003, 170.04004, 222.12004, 169.41003, 222.12004);
generalPath.curveTo(169.12004, 222.12004, 168.85004, 222.04004, 168.62004, 221.90004);
generalPath.curveTo(168.50005, 222.20004, 168.27003, 222.46004, 167.94005, 222.51004);
generalPath.curveTo(167.64005, 222.57004, 167.25005, 222.41003, 167.00005, 222.26004);
generalPath.curveTo(166.53004, 222.00005, 165.98004, 221.16003, 165.98004, 221.16003);
generalPath.lineTo(166.05005, 220.74004);
generalPath.curveTo(166.05005, 220.74004, 166.34004, 221.08003, 166.86005, 221.49004);
generalPath.curveTo(167.38005, 221.90004, 167.77005, 221.87004, 167.77005, 221.87004);
generalPath.curveTo(168.11005, 221.82004, 168.26006, 221.50005, 168.26006, 221.16003);
generalPath.lineTo(168.26006, 220.80003);
generalPath.lineTo(168.48006, 221.09003);
generalPath.curveTo(168.67006, 221.36003, 168.99005, 221.54002, 169.36006, 221.54002);
generalPath.curveTo(169.95006, 221.54002, 170.42006, 221.09003, 170.42006, 220.53003);
generalPath.curveTo(170.42006, 220.36003, 170.40005, 220.21002, 170.32005, 220.07002);
generalPath.lineTo(170.51006, 219.63002);
generalPath.lineTo(170.86006, 219.98003);
generalPath.curveTo(170.85007, 220.02002, 170.85007, 220.06003, 170.85007, 220.10002);
generalPath.curveTo(170.85007, 220.69002, 171.34007, 221.16002, 171.96007, 221.16002);
generalPath.curveTo(172.51007, 221.16002, 172.99007, 220.80002, 173.07007, 220.27002);
generalPath.curveTo(173.08006, 220.27002, 173.08006, 219.86002, 173.11006, 219.86002);
generalPath.curveTo(173.16006, 219.86002, 173.25006, 220.25002, 173.27007, 220.24002);
generalPath.curveTo(173.41006, 220.66002, 173.83006, 220.97002, 174.33006, 220.97002);
generalPath.curveTo(174.94006, 220.97002, 175.44006, 220.50002, 175.44006, 219.92001);
generalPath.curveTo(175.44006, 219.78001, 175.44006, 219.66002, 175.39006, 219.54001);
generalPath.lineTo(175.68005, 219.49);
generalPath.lineTo(175.69005, 219.49);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.69, 219.49);
generalPath.lineTo(175.97, 219.54001);
generalPath.curveTo(175.92, 219.66, 175.91, 219.78001, 175.91, 219.92001);
generalPath.curveTo(175.91, 220.50002, 176.41, 220.97002, 177.03, 220.97002);
generalPath.curveTo(177.52, 220.97002, 177.94, 220.66002, 178.09, 220.24002);
generalPath.curveTo(178.09999, 220.25002, 178.2, 219.86002, 178.23999, 219.86002);
generalPath.curveTo(178.26999, 219.86002, 178.26999, 220.27002, 178.29, 220.27002);
generalPath.curveTo(178.36, 220.80002, 178.84, 221.16002, 179.39, 221.16002);
generalPath.curveTo(180.01, 221.16002, 180.5, 220.69002, 180.5, 220.10002);
generalPath.curveTo(180.5, 220.06003, 180.5, 220.02002, 180.49, 219.98003);
generalPath.lineTo(180.84001, 219.63002);
generalPath.lineTo(181.03001, 220.07002);
generalPath.curveTo(180.96, 220.21002, 180.93001, 220.36002, 180.93001, 220.53003);
generalPath.curveTo(180.93001, 221.09003, 181.40001, 221.54002, 181.99, 221.54002);
generalPath.curveTo(182.36, 221.54002, 182.68001, 221.36003, 182.87001, 221.09003);
generalPath.lineTo(183.1, 220.80003);
generalPath.lineTo(183.1, 221.16003);
generalPath.curveTo(183.1, 221.50003, 183.24, 221.82004, 183.59001, 221.87004);
generalPath.curveTo(183.59001, 221.87004, 183.97002, 221.90004, 184.50002, 221.49004);
generalPath.curveTo(185.02002, 221.08003, 185.30002, 220.74004, 185.30002, 220.74004);
generalPath.lineTo(185.33002, 221.16003);
generalPath.curveTo(185.33002, 221.16003, 184.82002, 222.00003, 184.36002, 222.26004);
generalPath.curveTo(184.11002, 222.41003, 183.72002, 222.57004, 183.41002, 222.51004);
generalPath.curveTo(183.09001, 222.46004, 182.86002, 222.20004, 182.74002, 221.90004);
generalPath.curveTo(182.51003, 222.04004, 182.23003, 222.12004, 181.94002, 222.12004);
generalPath.curveTo(181.31001, 222.12004, 180.74002, 221.77003, 180.52002, 221.26004);
generalPath.curveTo(180.23003, 221.57004, 179.83002, 221.76004, 179.36002, 221.76004);
generalPath.curveTo(178.85002, 221.76004, 178.39001, 221.53004, 178.10002, 221.18004);
generalPath.curveTo(177.82002, 221.45004, 177.43002, 221.61003, 177.01003, 221.61003);
generalPath.curveTo(176.46002, 221.61003, 175.96002, 221.33003, 175.68002, 220.92003);
generalPath.curveTo(175.39003, 221.33003, 174.90002, 221.61003, 174.34003, 221.61003);
generalPath.curveTo(173.92003, 221.61003, 173.53003, 221.45003, 173.25003, 221.18004);
generalPath.curveTo(172.96004, 221.53004, 172.50003, 221.76004, 172.00003, 221.76004);
generalPath.curveTo(171.52003, 221.76004, 171.12003, 221.57004, 170.83003, 221.26004);
generalPath.curveTo(170.61003, 221.77003, 170.04004, 222.12004, 169.41003, 222.12004);
generalPath.curveTo(169.12004, 222.12004, 168.85004, 222.04004, 168.62004, 221.90004);
generalPath.curveTo(168.50005, 222.20004, 168.27003, 222.46004, 167.94005, 222.51004);
generalPath.curveTo(167.64005, 222.57004, 167.25005, 222.41003, 167.00005, 222.26004);
generalPath.curveTo(166.53004, 222.00005, 165.98004, 221.16003, 165.98004, 221.16003);
generalPath.lineTo(166.05005, 220.74004);
generalPath.curveTo(166.05005, 220.74004, 166.34004, 221.08003, 166.86005, 221.49004);
generalPath.curveTo(167.38005, 221.90004, 167.77005, 221.87004, 167.77005, 221.87004);
generalPath.curveTo(168.11005, 221.82004, 168.26006, 221.50005, 168.26006, 221.16003);
generalPath.lineTo(168.26006, 220.80003);
generalPath.lineTo(168.48006, 221.09003);
generalPath.curveTo(168.67006, 221.36003, 168.99005, 221.54002, 169.36006, 221.54002);
generalPath.curveTo(169.95006, 221.54002, 170.42006, 221.09003, 170.42006, 220.53003);
generalPath.curveTo(170.42006, 220.36003, 170.40005, 220.21002, 170.32005, 220.07002);
generalPath.lineTo(170.51006, 219.63002);
generalPath.lineTo(170.86006, 219.98003);
generalPath.curveTo(170.85007, 220.02002, 170.85007, 220.06003, 170.85007, 220.10002);
generalPath.curveTo(170.85007, 220.69002, 171.34007, 221.16002, 171.96007, 221.16002);
generalPath.curveTo(172.51007, 221.16002, 172.99007, 220.80002, 173.07007, 220.27002);
generalPath.curveTo(173.08006, 220.27002, 173.08006, 219.86002, 173.11006, 219.86002);
generalPath.curveTo(173.16006, 219.86002, 173.25006, 220.25002, 173.27007, 220.24002);
generalPath.curveTo(173.41006, 220.66002, 173.83006, 220.97002, 174.33006, 220.97002);
generalPath.curveTo(174.94006, 220.97002, 175.44006, 220.50002, 175.44006, 219.92001);
generalPath.curveTo(175.44006, 219.78001, 175.44006, 219.66002, 175.39006, 219.54001);
generalPath.lineTo(175.68005, 219.49);
generalPath.lineTo(175.69005, 219.49);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.67, 222.23);
generalPath.curveTo(172.66, 222.23999, 169.95, 222.59999, 168.0, 223.17);
generalPath.curveTo(167.87, 223.20999, 167.71, 223.11, 167.67, 223.0);
generalPath.curveTo(167.63, 222.87, 167.72, 222.72, 167.84999, 222.68);
generalPath.curveTo(169.79999, 222.07999, 172.57999, 221.7, 175.67, 221.7);
generalPath.curveTo(178.76001, 221.7, 181.55, 222.08, 183.5, 222.68);
generalPath.curveTo(183.63, 222.71999, 183.72, 222.87, 183.68, 223.0);
generalPath.curveTo(183.64, 223.11, 183.48, 223.21, 183.34999, 223.17);
generalPath.curveTo(181.4, 222.59999, 178.68, 222.24, 175.67, 222.23);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.67, 222.23);
generalPath.curveTo(172.66, 222.23999, 169.95, 222.59999, 168.0, 223.17);
generalPath.curveTo(167.87, 223.20999, 167.71, 223.11, 167.67, 223.0);
generalPath.curveTo(167.63, 222.87, 167.72, 222.72, 167.84999, 222.68);
generalPath.curveTo(169.79999, 222.07999, 172.57999, 221.7, 175.67, 221.7);
generalPath.curveTo(178.76001, 221.7, 181.55, 222.08, 183.5, 222.68);
generalPath.curveTo(183.63, 222.71999, 183.72, 222.87, 183.68, 223.0);
generalPath.curveTo(183.64, 223.11, 183.48, 223.21, 183.34999, 223.17);
generalPath.curveTo(181.4, 222.59999, 178.68, 222.24, 175.67, 222.23);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(165.43, 221.0);
generalPath.curveTo(165.42, 221.01, 165.04999, 220.52, 164.78, 220.27);
generalPath.curveTo(164.58, 220.09001, 164.1, 219.94, 164.1, 219.94);
generalPath.curveTo(164.1, 219.86, 164.38, 219.66, 164.68001, 219.66);
generalPath.curveTo(164.86, 219.66, 165.03001, 219.73001, 165.13, 219.86);
generalPath.lineTo(165.17, 219.66);
generalPath.curveTo(165.17, 219.66, 165.41, 219.71, 165.52, 219.98001);
generalPath.curveTo(165.64, 220.27, 165.57, 220.70001, 165.57, 220.70001);
generalPath.curveTo(165.57, 220.70001, 165.52, 220.90001, 165.43001, 221.00002);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(165.43, 221.0);
generalPath.curveTo(165.42, 221.01, 165.04999, 220.52, 164.78, 220.27);
generalPath.curveTo(164.58, 220.09001, 164.1, 219.94, 164.1, 219.94);
generalPath.curveTo(164.1, 219.86, 164.38, 219.66, 164.68001, 219.66);
generalPath.curveTo(164.86, 219.66, 165.03001, 219.73001, 165.13, 219.86);
generalPath.lineTo(165.17, 219.66);
generalPath.curveTo(165.17, 219.66, 165.41, 219.71, 165.52, 219.98001);
generalPath.curveTo(165.64, 220.27, 165.57, 220.70001, 165.57, 220.70001);
generalPath.curveTo(165.57, 220.70001, 165.52, 220.90001, 165.43001, 221.00002);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.32, 220.22);
generalPath.lineTo(167.21, 220.88);
generalPath.lineTo(165.81001, 221.03);
generalPath.lineTo(165.6, 220.91);
generalPath.lineTo(165.64, 220.68001);
generalPath.lineTo(166.7, 219.81001);
generalPath.lineTo(167.31999, 220.22002);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.32, 220.22);
generalPath.lineTo(167.21, 220.88);
generalPath.lineTo(165.81001, 221.03);
generalPath.lineTo(165.6, 220.91);
generalPath.lineTo(165.64, 220.68001);
generalPath.lineTo(166.7, 219.81001);
generalPath.lineTo(167.31999, 220.22002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(165.45, 220.75);
generalPath.curveTo(165.56999, 220.63, 165.81, 220.66, 165.98, 220.81);
generalPath.curveTo(166.15999, 220.95999, 166.22, 221.19, 166.09999, 221.31);
generalPath.curveTo(165.98, 221.44, 165.73999, 221.41, 165.56999, 221.25);
generalPath.curveTo(165.39, 221.1, 165.32999, 220.87, 165.45, 220.75);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(165.45, 220.75);
generalPath.curveTo(165.56999, 220.63, 165.81, 220.66, 165.98, 220.81);
generalPath.curveTo(166.15999, 220.95999, 166.22, 221.19, 166.09999, 221.31);
generalPath.curveTo(165.98, 221.44, 165.73999, 221.41, 165.56999, 221.25);
generalPath.curveTo(165.39, 221.1, 165.32999, 220.87, 165.45, 220.75);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.02, 220.88);

}

private void _paint4(Graphics2D g,float origAlpha) {
generalPath.curveTo(167.96, 220.70001, 168.02, 220.51001, 168.15001, 220.46);
generalPath.curveTo(168.29001, 220.43001, 168.45001, 220.55, 168.52, 220.73001);
generalPath.curveTo(168.58, 220.92001, 168.52, 221.11002, 168.38, 221.15001);
generalPath.curveTo(168.25, 221.19, 168.09001, 221.07, 168.02, 220.88);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.02, 220.88);
generalPath.curveTo(167.96, 220.70001, 168.02, 220.51001, 168.15001, 220.46);
generalPath.curveTo(168.29001, 220.43001, 168.45001, 220.55, 168.52, 220.73001);
generalPath.curveTo(168.58, 220.92001, 168.52, 221.11002, 168.38, 221.15001);
generalPath.curveTo(168.25, 221.19, 168.09001, 221.07, 168.02, 220.88);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.67, 220.04);
generalPath.lineTo(169.18, 220.51999);
generalPath.lineTo(170.4, 219.85999);
generalPath.lineTo(170.48999, 219.64998);
generalPath.lineTo(170.31999, 219.47998);
generalPath.lineTo(168.92, 219.35999);
generalPath.lineTo(168.67, 220.03998);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.67, 220.04);
generalPath.lineTo(169.18, 220.51999);
generalPath.lineTo(170.4, 219.85999);
generalPath.lineTo(170.48999, 219.64998);
generalPath.lineTo(170.31999, 219.47998);
generalPath.lineTo(168.92, 219.35999);
generalPath.lineTo(168.67, 220.03998);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.08, 217.76);
generalPath.lineTo(169.41, 218.4);
generalPath.lineTo(170.27, 219.54);
generalPath.lineTo(170.5, 219.62999);
generalPath.lineTo(170.67, 219.45);
generalPath.lineTo(170.97, 218.08);
generalPath.lineTo(170.08, 217.76);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.08, 217.76);
generalPath.lineTo(169.41, 218.4);
generalPath.lineTo(170.27, 219.54);
generalPath.lineTo(170.5, 219.62999);
generalPath.lineTo(170.67, 219.45);
generalPath.lineTo(170.97, 218.08);
generalPath.lineTo(170.08, 217.76);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(172.36, 219.3);
generalPath.lineTo(172.1, 219.93001);
generalPath.lineTo(170.70001, 219.8);
generalPath.lineTo(170.52002, 219.64);
generalPath.lineTo(170.62003, 219.42);
generalPath.lineTo(171.84003, 218.78);
generalPath.lineTo(172.36003, 219.3);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(172.36, 219.3);
generalPath.lineTo(172.1, 219.93001);
generalPath.lineTo(170.70001, 219.8);
generalPath.lineTo(170.52002, 219.64);
generalPath.lineTo(170.62003, 219.42);
generalPath.lineTo(171.84003, 218.78);
generalPath.lineTo(172.36003, 219.3);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_12
shape = new Ellipse2D.Double(170.01998901367188, 219.17999267578125, 0.9800000190734863, 0.9399999976158142);
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(170.01998901367188, 219.17999267578125, 0.9800000190734863, 0.9399999976158142);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(172.87, 219.95);
generalPath.curveTo(172.84, 219.75, 172.94, 219.58, 173.08, 219.56);
generalPath.curveTo(173.22, 219.54, 173.36, 219.69, 173.38, 219.89);
generalPath.curveTo(173.41, 220.08, 173.31, 220.26, 173.17, 220.27);
generalPath.curveTo(173.03, 220.29001, 172.89, 220.14, 172.87, 219.95);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(172.87, 219.95);
generalPath.curveTo(172.84, 219.75, 172.94, 219.58, 173.08, 219.56);
generalPath.curveTo(173.22, 219.54, 173.36, 219.69, 173.38, 219.89);
generalPath.curveTo(173.41, 220.08, 173.31, 220.26, 173.17, 220.27);
generalPath.curveTo(173.03, 220.29001, 172.89, 220.14, 172.87, 219.95);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(173.78, 219.24);
generalPath.lineTo(174.18, 219.81001);
generalPath.lineTo(175.51999, 219.39001);
generalPath.lineTo(175.65999, 219.21002);
generalPath.lineTo(175.51, 219.01003);
generalPath.lineTo(174.18, 218.62003);
generalPath.lineTo(173.78, 219.24002);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(173.78, 219.24);
generalPath.lineTo(174.18, 219.81001);
generalPath.lineTo(175.51999, 219.39001);
generalPath.lineTo(175.65999, 219.21002);
generalPath.lineTo(175.51, 219.01003);
generalPath.lineTo(174.18, 218.62003);
generalPath.lineTo(173.78, 219.24002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.66, 217.15);
generalPath.lineTo(174.8, 217.67);
generalPath.lineTo(175.44, 219.05);
generalPath.lineTo(175.66, 219.19);
generalPath.lineTo(175.88, 219.05);
generalPath.lineTo(176.52, 217.67);
generalPath.lineTo(175.66, 217.15);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.66, 217.15);
generalPath.lineTo(174.8, 217.67);
generalPath.lineTo(175.44, 219.05);
generalPath.lineTo(175.66, 219.19);
generalPath.lineTo(175.88, 219.05);
generalPath.lineTo(176.52, 217.67);
generalPath.lineTo(175.66, 217.15);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(177.55, 219.24);
generalPath.lineTo(177.16, 219.81001);
generalPath.lineTo(175.82, 219.39001);
generalPath.lineTo(175.68001, 219.21002);
generalPath.lineTo(175.82, 219.01003);
generalPath.lineTo(177.16, 218.62003);
generalPath.lineTo(177.55, 219.24002);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(177.55, 219.24);
generalPath.lineTo(177.16, 219.81001);
generalPath.lineTo(175.82, 219.39001);
generalPath.lineTo(175.68001, 219.21002);
generalPath.lineTo(175.82, 219.01003);
generalPath.lineTo(177.16, 218.62003);
generalPath.lineTo(177.55, 219.24002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_17
shape = new Ellipse2D.Double(175.17999267578125, 218.74000549316406, 0.9800000190734863, 0.9399999976158142);
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(175.17999267578125, 218.74000549316406, 0.9800000190734863, 0.9399999976158142);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(178.5, 219.95);
generalPath.curveTo(178.52, 219.75, 178.42, 219.58, 178.28, 219.56);
generalPath.curveTo(178.14, 219.54, 178.0, 219.69, 177.98, 219.89);
generalPath.curveTo(177.95999, 220.08, 178.05, 220.26, 178.19, 220.27);
generalPath.curveTo(178.33, 220.29001, 178.47, 220.14, 178.5, 219.95);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(178.5, 219.95);
generalPath.curveTo(178.52, 219.75, 178.42, 219.58, 178.28, 219.56);
generalPath.curveTo(178.14, 219.54, 178.0, 219.69, 177.98, 219.89);
generalPath.curveTo(177.95999, 220.08, 178.05, 220.26, 178.19, 220.27);
generalPath.curveTo(178.33, 220.29001, 178.47, 220.14, 178.5, 219.95);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(178.99, 219.3);
generalPath.lineTo(179.25, 219.93001);
generalPath.lineTo(180.65, 219.8);
generalPath.lineTo(180.82999, 219.64);
generalPath.lineTo(180.72998, 219.42);
generalPath.lineTo(179.50998, 218.78);
generalPath.lineTo(178.98997, 219.3);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(178.99, 219.3);
generalPath.lineTo(179.25, 219.93001);
generalPath.lineTo(180.65, 219.8);
generalPath.lineTo(180.82999, 219.64);
generalPath.lineTo(180.72998, 219.42);
generalPath.lineTo(179.50998, 218.78);
generalPath.lineTo(178.98997, 219.3);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_20
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(181.27, 217.76);
generalPath.lineTo(181.94, 218.4);
generalPath.lineTo(181.08, 219.54);
generalPath.lineTo(180.85, 219.62999);
generalPath.lineTo(180.68001, 219.45);
generalPath.lineTo(180.38, 218.08);
generalPath.lineTo(181.27, 217.76);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(181.27, 217.76);
generalPath.lineTo(181.94, 218.4);
generalPath.lineTo(181.08, 219.54);
generalPath.lineTo(180.85, 219.62999);
generalPath.lineTo(180.68001, 219.45);
generalPath.lineTo(180.38, 218.08);
generalPath.lineTo(181.27, 217.76);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_21
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(182.68, 220.04);
generalPath.lineTo(182.17, 220.51999);
generalPath.lineTo(180.95, 219.85999);
generalPath.lineTo(180.84999, 219.64998);
generalPath.lineTo(181.04, 219.47998);
generalPath.lineTo(182.43999, 219.35999);
generalPath.lineTo(182.68, 220.03998);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(182.68, 220.04);
generalPath.lineTo(182.17, 220.51999);
generalPath.lineTo(180.95, 219.85999);
generalPath.lineTo(180.84999, 219.64998);
generalPath.lineTo(181.04, 219.47998);
generalPath.lineTo(182.43999, 219.35999);
generalPath.lineTo(182.68, 220.03998);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_22
shape = new Ellipse2D.Double(180.36000061035156, 219.17999267578125, 0.9800000190734863, 0.9399999976158142);
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(180.36000061035156, 219.17999267578125, 0.9800000190734863, 0.9399999976158142);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_23
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.34, 220.88);
generalPath.curveTo(183.4, 220.70001, 183.34, 220.51001, 183.20999, 220.46);
generalPath.curveTo(183.06999, 220.43001, 182.90999, 220.55, 182.84, 220.73001);
generalPath.curveTo(182.78, 220.92001, 182.84, 221.11002, 182.98, 221.15001);
generalPath.curveTo(183.11, 221.19, 183.26999, 221.07, 183.34, 220.88);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.34, 220.88);
generalPath.curveTo(183.4, 220.70001, 183.34, 220.51001, 183.20999, 220.46);
generalPath.curveTo(183.06999, 220.43001, 182.90999, 220.55, 182.84, 220.73001);
generalPath.curveTo(182.78, 220.92001, 182.84, 221.11002, 182.98, 221.15001);
generalPath.curveTo(183.11, 221.19, 183.26999, 221.07, 183.34, 220.88);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_24
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(185.73, 221.0);
generalPath.curveTo(185.73999, 221.01, 186.11, 220.52, 186.39, 220.27);
generalPath.curveTo(186.58, 220.09001, 187.06, 219.94, 187.06, 219.94);
generalPath.curveTo(187.06, 219.86, 186.78, 219.66, 186.48, 219.66);
generalPath.curveTo(186.3, 219.66, 186.12999, 219.73001, 186.03, 219.86);
generalPath.lineTo(185.99, 219.66);
generalPath.curveTo(185.99, 219.66, 185.75, 219.71, 185.63, 219.98001);
generalPath.curveTo(185.52, 220.27, 185.6, 220.70001, 185.6, 220.70001);
generalPath.curveTo(185.6, 220.70001, 185.64, 220.90001, 185.73001, 221.00002);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(185.73, 221.0);
generalPath.curveTo(185.73999, 221.01, 186.11, 220.52, 186.39, 220.27);
generalPath.curveTo(186.58, 220.09001, 187.06, 219.94, 187.06, 219.94);
generalPath.curveTo(187.06, 219.86, 186.78, 219.66, 186.48, 219.66);
generalPath.curveTo(186.3, 219.66, 186.12999, 219.73001, 186.03, 219.86);
generalPath.lineTo(185.99, 219.66);
generalPath.curveTo(185.99, 219.66, 185.75, 219.71, 185.63, 219.98001);
generalPath.curveTo(185.52, 220.27, 185.6, 220.70001, 185.6, 220.70001);
generalPath.curveTo(185.6, 220.70001, 185.64, 220.90001, 185.73001, 221.00002);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_25
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.84, 220.22);
generalPath.lineTo(183.95, 220.88);
generalPath.lineTo(185.34999, 221.03);
generalPath.lineTo(185.56, 220.91);
generalPath.lineTo(185.51, 220.68001);
generalPath.lineTo(184.45999, 219.81001);
generalPath.lineTo(183.84, 220.22002);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.84, 220.22);
generalPath.lineTo(183.95, 220.88);
generalPath.lineTo(185.34999, 221.03);
generalPath.lineTo(185.56, 220.91);
generalPath.lineTo(185.51, 220.68001);
generalPath.lineTo(184.45999, 219.81001);
generalPath.lineTo(183.84, 220.22002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_3_0_26
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(185.74, 220.75);
generalPath.curveTo(185.63, 220.63, 185.39, 220.66, 185.21, 220.81);
generalPath.curveTo(185.03001, 220.95999, 184.97, 221.19, 185.09001, 221.31);
generalPath.curveTo(185.21, 221.44, 185.45001, 221.41, 185.63, 221.25);
generalPath.curveTo(185.81, 221.1, 185.86, 220.87, 185.74, 220.75);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(185.74, 220.75);
generalPath.curveTo(185.63, 220.63, 185.39, 220.66, 185.21, 220.81);
generalPath.curveTo(185.03001, 220.95999, 184.97, 221.19, 185.09001, 221.31);
generalPath.curveTo(185.21, 221.44, 185.45001, 221.41, 185.63, 221.25);
generalPath.curveTo(185.81, 221.1, 185.86, 220.87, 185.74, 220.75);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 149.1699981689453f, 0.0f));
// _0_2_0_3_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.05, 224.3);
generalPath.lineTo(168.36, 223.8);
generalPath.lineTo(169.01, 223.93001);
generalPath.lineTo(168.62999, 224.49);
generalPath.lineTo(168.04999, 224.3);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(168.05, 224.3);
generalPath.lineTo(168.36, 223.8);
generalPath.lineTo(169.01, 223.93001);
generalPath.lineTo(168.62999, 224.49);
generalPath.lineTo(168.04999, 224.3);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.85, 223.81);
generalPath.lineTo(170.16, 223.92);
generalPath.curveTo(169.98001, 223.94, 169.81, 223.83, 169.78, 223.66);
generalPath.curveTo(169.76, 223.49, 169.88, 223.34, 170.05, 223.31);
generalPath.lineTo(170.75, 223.20999);
generalPath.lineTo(171.46, 223.09999);
generalPath.curveTo(171.64, 223.07999, 171.8, 223.18999, 171.83, 223.34999);
generalPath.curveTo(171.85, 223.51999, 171.73, 223.68, 171.56, 223.7);
generalPath.lineTo(170.84999, 223.81);
shape = generalPath;
paint = new Color(5, 142, 110, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.85, 223.81);
generalPath.lineTo(170.16, 223.92);
generalPath.curveTo(169.98001, 223.94, 169.81, 223.83, 169.78, 223.66);
generalPath.curveTo(169.76, 223.49, 169.88, 223.34, 170.05, 223.31);
generalPath.lineTo(170.75, 223.20999);
generalPath.lineTo(171.46, 223.09999);
generalPath.curveTo(171.64, 223.07999, 171.8, 223.18999, 171.83, 223.34999);
generalPath.curveTo(171.85, 223.51999, 171.73, 223.68, 171.56, 223.7);
generalPath.lineTo(170.84999, 223.81);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_2
shape = new Ellipse2D.Double(172.75, 222.88999938964844, 0.8799999952316284, 0.8199999928474426);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(172.75, 222.88999938964844, 0.8799999952316284, 0.8199999928474426);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.7, 223.48);
generalPath.lineTo(174.73999, 223.48);
generalPath.curveTo(174.56, 223.48, 174.40999, 223.34, 174.40999, 223.17);
generalPath.curveTo(174.40999, 223.0, 174.54999, 222.86, 174.73, 222.86);
generalPath.lineTo(176.69, 222.86);
generalPath.curveTo(176.88, 222.86, 177.02, 223.0, 177.02, 223.17);
generalPath.curveTo(177.02, 223.34, 176.87001, 223.48, 176.69, 223.48);
generalPath.lineTo(175.7, 223.48);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.7, 223.48);
generalPath.lineTo(174.73999, 223.48);
generalPath.curveTo(174.56, 223.48, 174.40999, 223.34, 174.40999, 223.17);
generalPath.curveTo(174.40999, 223.0, 174.54999, 222.86, 174.73, 222.86);
generalPath.lineTo(176.69, 222.86);
generalPath.curveTo(176.88, 222.86, 177.02, 223.0, 177.02, 223.17);
generalPath.curveTo(177.02, 223.34, 176.87001, 223.48, 176.69, 223.48);
generalPath.lineTo(175.7, 223.48);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_4
shape = new Ellipse2D.Double(177.72000122070312, 222.88999938964844, 0.8799999952316284, 0.8199999928474426);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(177.72000122070312, 222.88999938964844, 0.8799999952316284, 0.8199999928474426);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(180.5, 223.81);
generalPath.lineTo(181.19, 223.92);
generalPath.curveTo(181.37, 223.94, 181.54001, 223.83, 181.57, 223.66);
generalPath.curveTo(181.59001, 223.49, 181.48001, 223.34, 181.3, 223.31);
generalPath.lineTo(180.6, 223.20999);
generalPath.lineTo(179.89, 223.09999);
generalPath.curveTo(179.71, 223.07999, 179.54, 223.18999, 179.52, 223.34999);
generalPath.curveTo(179.49, 223.51999, 179.61, 223.68, 179.79001, 223.7);
generalPath.lineTo(180.50002, 223.81);
shape = generalPath;
paint = new Color(5, 142, 110, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(180.5, 223.81);
generalPath.lineTo(181.19, 223.92);
generalPath.curveTo(181.37, 223.94, 181.54001, 223.83, 181.57, 223.66);
generalPath.curveTo(181.59001, 223.49, 181.48001, 223.34, 181.3, 223.31);
generalPath.lineTo(180.6, 223.20999);
generalPath.lineTo(179.89, 223.09999);
generalPath.curveTo(179.71, 223.07999, 179.54, 223.18999, 179.52, 223.34999);
generalPath.curveTo(179.49, 223.51999, 179.61, 223.68, 179.79001, 223.7);
generalPath.lineTo(180.50002, 223.81);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.24, 224.33);
generalPath.lineTo(182.99, 223.8);
generalPath.lineTo(182.32, 223.86);
generalPath.lineTo(182.64001, 224.45);
generalPath.lineTo(183.24002, 224.33);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.24, 224.33);
generalPath.lineTo(182.99, 223.8);
generalPath.lineTo(182.32, 223.86);
generalPath.lineTo(182.64001, 224.45);
generalPath.lineTo(183.24002, 224.33);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.66, 226.16);
generalPath.curveTo(173.23001, 226.16, 171.03, 225.94, 169.36, 225.51001);
generalPath.curveTo(171.03, 225.08002, 173.23, 224.82, 175.66, 224.81001);
generalPath.curveTo(178.1, 224.81001, 180.31, 225.08002, 181.99, 225.51001);
generalPath.curveTo(180.31001, 225.94, 178.1, 226.16, 175.66, 226.16);
generalPath.closePath();
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.66, 226.16);
generalPath.curveTo(173.23001, 226.16, 171.03, 225.94, 169.36, 225.51001);
generalPath.curveTo(171.03, 225.08002, 173.23, 224.82, 175.66, 224.81001);
generalPath.curveTo(178.1, 224.81001, 180.31, 225.08002, 181.99, 225.51001);
generalPath.curveTo(180.31001, 225.94, 178.1, 226.16, 175.66, 226.16);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_8
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.01f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(176.8, 226.08);
generalPath.lineTo(176.8, 224.92);
generalPath.moveTo(176.22, 226.12);
generalPath.lineTo(176.23, 224.89);
generalPath.moveTo(175.8, 226.14);
generalPath.lineTo(175.8, 224.88);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_9
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.02f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.44, 226.15);
generalPath.lineTo(175.44, 224.87999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_10
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.03f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(175.09, 226.15);
generalPath.lineTo(175.09, 224.87999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_11
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.04f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(174.77, 226.15);
generalPath.lineTo(174.77, 224.87999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);

}

private void _paint5(Graphics2D g,float origAlpha) {
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_12
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.04f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(174.44, 226.15);
generalPath.lineTo(174.44, 224.87999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_13
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.05f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(174.16, 226.15);
generalPath.lineTo(174.16, 224.87999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_14
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.06f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(173.61, 226.08);
generalPath.lineTo(173.6, 224.93001);
generalPath.moveTo(173.87001, 226.1);
generalPath.lineTo(173.87001, 224.89);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_15
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.07f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(173.1, 226.03);
generalPath.lineTo(173.1, 224.97);
generalPath.moveTo(173.36, 226.06);
generalPath.lineTo(173.35, 224.93);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_16
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.08f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(172.42, 225.97);
generalPath.lineTo(172.42, 225.04001);
generalPath.moveTo(172.65, 225.98001);
generalPath.lineTo(172.65, 225.00002);
generalPath.moveTo(172.87999, 226.02002);
generalPath.lineTo(172.87999, 225.00002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_17
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.09f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(172.19, 225.96);
generalPath.lineTo(172.19, 225.06001);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_18
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.1f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(171.97, 225.92);
generalPath.lineTo(171.97, 225.06999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_19
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.11f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(171.73, 225.89);
generalPath.lineTo(171.73, 225.11);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_20
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.12f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(171.24, 225.82);
generalPath.lineTo(171.23001, 225.20001);
generalPath.moveTo(171.49, 225.86002);
generalPath.lineTo(171.49, 225.16002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_21
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.12f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.99, 225.77);
generalPath.lineTo(170.99, 225.22);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_22
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.13f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.76, 225.73);
generalPath.lineTo(170.76, 225.26999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_23
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.14f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.51, 225.67);
generalPath.lineTo(170.51, 225.31);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_24
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.15f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(170.26, 225.64);
generalPath.lineTo(170.26, 225.37);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3_4_0_25
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.18f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(169.99, 225.58);
generalPath.lineTo(169.99, 225.45);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 149.1699981689453f, 0.0f));
// _0_2_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.28, 330.68);
generalPath.curveTo(189.74, 330.68, 188.37, 330.35, 187.35, 329.81);
generalPath.curveTo(186.35, 329.3, 184.99, 328.99, 183.49, 328.99);
generalPath.curveTo(181.98001, 328.99, 180.59001, 329.31, 179.58, 329.81998);
generalPath.curveTo(178.57, 330.34998, 177.18001, 330.67996, 175.66, 330.67996);
generalPath.curveTo(174.12001, 330.67996, 172.74, 330.31998, 171.73001, 329.77997);
generalPath.curveTo(170.73001, 329.28998, 169.40001, 328.98996, 167.94002, 328.98996);
generalPath.curveTo(166.42001, 328.98996, 165.08002, 329.27997, 164.08002, 329.79996);
generalPath.curveTo(163.06001, 330.33997, 161.66002, 330.67996, 160.13002, 330.67996);
generalPath.lineTo(160.13002, 333.08997);
generalPath.curveTo(161.66002, 333.08997, 163.06001, 332.73996, 164.08002, 332.20996);
generalPath.curveTo(165.08002, 331.68997, 166.42001, 331.38995, 167.94002, 331.38995);
generalPath.curveTo(169.39001, 331.38995, 170.73001, 331.69995, 171.73001, 332.18994);
generalPath.curveTo(172.74, 332.71994, 174.12001, 333.08994, 175.66, 333.08994);
generalPath.curveTo(177.18001, 333.08994, 178.57, 332.75995, 179.58, 332.22995);
generalPath.curveTo(180.59, 331.70996, 181.98, 331.38995, 183.49, 331.38995);
generalPath.curveTo(184.99, 331.38995, 186.35, 331.70996, 187.35, 332.21994);
generalPath.curveTo(188.37001, 332.75995, 189.72, 333.08994, 191.26001, 333.08994);
generalPath.lineTo(191.28001, 330.67993);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 91, 191, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.28, 330.68);
generalPath.curveTo(189.74, 330.68, 188.37, 330.35, 187.35, 329.81);
generalPath.curveTo(186.35, 329.3, 184.99, 328.99, 183.49, 328.99);
generalPath.curveTo(181.98001, 328.99, 180.59001, 329.31, 179.58, 329.81998);
generalPath.curveTo(178.57, 330.34998, 177.18001, 330.67996, 175.66, 330.67996);
generalPath.curveTo(174.12001, 330.67996, 172.74, 330.31998, 171.73001, 329.77997);
generalPath.curveTo(170.73001, 329.28998, 169.40001, 328.98996, 167.94002, 328.98996);
generalPath.curveTo(166.42001, 328.98996, 165.08002, 329.27997, 164.08002, 329.79996);
generalPath.curveTo(163.06001, 330.33997, 161.66002, 330.67996, 160.13002, 330.67996);
generalPath.lineTo(160.13002, 333.08997);
generalPath.curveTo(161.66002, 333.08997, 163.06001, 332.73996, 164.08002, 332.20996);
generalPath.curveTo(165.08002, 331.68997, 166.42001, 331.38995, 167.94002, 331.38995);
generalPath.curveTo(169.39001, 331.38995, 170.73001, 331.69995, 171.73001, 332.18994);
generalPath.curveTo(172.74, 332.71994, 174.12001, 333.08994, 175.66, 333.08994);
generalPath.curveTo(177.18001, 333.08994, 178.57, 332.75995, 179.58, 332.22995);
generalPath.curveTo(180.59, 331.70996, 181.98, 331.38995, 183.49, 331.38995);
generalPath.curveTo(184.99, 331.38995, 186.35, 331.70996, 187.35, 332.21994);
generalPath.curveTo(188.37001, 332.75995, 189.72, 333.08994, 191.26001, 333.08994);
generalPath.lineTo(191.28001, 330.67993);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.28, 333.09);
generalPath.curveTo(189.74, 333.09, 188.37, 332.76, 187.35, 332.22);
generalPath.curveTo(186.35, 331.71, 184.99, 331.39, 183.49, 331.39);
generalPath.curveTo(181.98001, 331.39, 180.59001, 331.71002, 179.58, 332.23);
generalPath.curveTo(178.57, 332.76, 177.18001, 333.09, 175.66, 333.09);
generalPath.curveTo(174.12001, 333.09, 172.74, 332.72, 171.73001, 332.19);
generalPath.curveTo(170.73001, 331.7, 169.40001, 331.39, 167.94002, 331.39);
generalPath.curveTo(166.42001, 331.39, 165.08002, 331.69, 164.08002, 332.21002);
generalPath.curveTo(163.06001, 332.74002, 161.66002, 333.09003, 160.13002, 333.09003);
generalPath.lineTo(160.13002, 335.50003);
generalPath.curveTo(161.66002, 335.50003, 163.06001, 335.15002, 164.08002, 334.62003);
generalPath.curveTo(165.08002, 334.10004, 166.42001, 333.80002, 167.94002, 333.80002);
generalPath.curveTo(169.39001, 333.80002, 170.73001, 334.11002, 171.73001, 334.6);
generalPath.curveTo(172.74, 335.14, 174.12001, 335.5, 175.66, 335.5);
generalPath.curveTo(177.18001, 335.5, 178.57, 335.16, 179.58, 334.64);
generalPath.curveTo(180.59, 334.12003, 181.98, 333.80002, 183.49, 333.80002);
generalPath.curveTo(184.99, 333.80002, 186.35, 334.12003, 187.35, 334.64);
generalPath.curveTo(188.37001, 335.17, 189.72, 335.5, 191.26001, 335.5);
generalPath.lineTo(191.28001, 333.09);
shape = generalPath;
paint = new Color(204, 204, 204, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.28, 333.09);
generalPath.curveTo(189.74, 333.09, 188.37, 332.76, 187.35, 332.22);
generalPath.curveTo(186.35, 331.71, 184.99, 331.39, 183.49, 331.39);
generalPath.curveTo(181.98001, 331.39, 180.59001, 331.71002, 179.58, 332.23);
generalPath.curveTo(178.57, 332.76, 177.18001, 333.09, 175.66, 333.09);
generalPath.curveTo(174.12001, 333.09, 172.74, 332.72, 171.73001, 332.19);
generalPath.curveTo(170.73001, 331.7, 169.40001, 331.39, 167.94002, 331.39);
generalPath.curveTo(166.42001, 331.39, 165.08002, 331.69, 164.08002, 332.21002);
generalPath.curveTo(163.06001, 332.74002, 161.66002, 333.09003, 160.13002, 333.09003);
generalPath.lineTo(160.13002, 335.50003);
generalPath.curveTo(161.66002, 335.50003, 163.06001, 335.15002, 164.08002, 334.62003);
generalPath.curveTo(165.08002, 334.10004, 166.42001, 333.80002, 167.94002, 333.80002);
generalPath.curveTo(169.39001, 333.80002, 170.73001, 334.11002, 171.73001, 334.6);
generalPath.curveTo(172.74, 335.14, 174.12001, 335.5, 175.66, 335.5);
generalPath.curveTo(177.18001, 335.5, 178.57, 335.16, 179.58, 334.64);
generalPath.curveTo(180.59, 334.12003, 181.98, 333.80002, 183.49, 333.80002);
generalPath.curveTo(184.99, 333.80002, 186.35, 334.12003, 187.35, 334.64);
generalPath.curveTo(188.37001, 335.17, 189.72, 335.5, 191.26001, 335.5);
generalPath.lineTo(191.28001, 333.09);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.28, 335.5);
generalPath.curveTo(189.74, 335.5, 188.37, 335.17, 187.35, 334.64);
generalPath.curveTo(186.35, 334.12003, 184.99, 333.80002, 183.49, 333.80002);
generalPath.curveTo(181.98001, 333.80002, 180.59001, 334.12003, 179.58, 334.64);
generalPath.curveTo(178.56999, 335.16, 177.18001, 335.5, 175.66, 335.5);
generalPath.curveTo(174.12001, 335.5, 172.74, 335.14, 171.73001, 334.6);
generalPath.curveTo(170.73001, 334.11002, 169.40001, 333.80002, 167.94002, 333.80002);
generalPath.curveTo(166.42001, 333.80002, 165.08002, 334.1, 164.08002, 334.62003);
generalPath.curveTo(163.06001, 335.15002, 161.66002, 335.50003, 160.13002, 335.50003);
generalPath.lineTo(160.13002, 337.90002);
generalPath.curveTo(161.66002, 337.90002, 163.06001, 337.56003, 164.08002, 337.02002);
generalPath.curveTo(165.08002, 336.51, 166.42001, 336.22003, 167.94002, 336.22003);
generalPath.curveTo(169.39001, 336.22003, 170.73001, 336.52002, 171.73001, 337.01004);
generalPath.curveTo(172.74, 337.55005, 174.12001, 337.90005, 175.66, 337.90005);
generalPath.curveTo(177.18001, 337.90005, 178.57, 337.58005, 179.58, 337.05005);
generalPath.curveTo(180.59, 336.53006, 181.98, 336.22006, 183.49, 336.22006);
generalPath.curveTo(184.99, 336.22006, 186.35, 336.53006, 187.35, 337.04007);
generalPath.curveTo(188.37001, 337.59006, 189.72, 337.90005, 191.26001, 337.90005);
generalPath.lineTo(191.28001, 335.50006);
shape = generalPath;
paint = new Color(0, 91, 191, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.28, 335.5);
generalPath.curveTo(189.74, 335.5, 188.37, 335.17, 187.35, 334.64);
generalPath.curveTo(186.35, 334.12003, 184.99, 333.80002, 183.49, 333.80002);
generalPath.curveTo(181.98001, 333.80002, 180.59001, 334.12003, 179.58, 334.64);
generalPath.curveTo(178.56999, 335.16, 177.18001, 335.5, 175.66, 335.5);
generalPath.curveTo(174.12001, 335.5, 172.74, 335.14, 171.73001, 334.6);
generalPath.curveTo(170.73001, 334.11002, 169.40001, 333.80002, 167.94002, 333.80002);
generalPath.curveTo(166.42001, 333.80002, 165.08002, 334.1, 164.08002, 334.62003);
generalPath.curveTo(163.06001, 335.15002, 161.66002, 335.50003, 160.13002, 335.50003);
generalPath.lineTo(160.13002, 337.90002);
generalPath.curveTo(161.66002, 337.90002, 163.06001, 337.56003, 164.08002, 337.02002);
generalPath.curveTo(165.08002, 336.51, 166.42001, 336.22003, 167.94002, 336.22003);
generalPath.curveTo(169.39001, 336.22003, 170.73001, 336.52002, 171.73001, 337.01004);
generalPath.curveTo(172.74, 337.55005, 174.12001, 337.90005, 175.66, 337.90005);
generalPath.curveTo(177.18001, 337.90005, 178.57, 337.58005, 179.58, 337.05005);
generalPath.curveTo(180.59, 336.53006, 181.98, 336.22006, 183.49, 336.22006);
generalPath.curveTo(184.99, 336.22006, 186.35, 336.53006, 187.35, 337.04007);
generalPath.curveTo(188.37001, 337.59006, 189.72, 337.90005, 191.26001, 337.90005);
generalPath.lineTo(191.28001, 335.50006);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.26, 340.32);
generalPath.curveTo(189.72, 340.32, 188.37, 339.99002, 187.34999, 339.45);
generalPath.curveTo(186.34999, 338.94, 184.98999, 338.63, 183.48999, 338.63);
generalPath.curveTo(181.98, 338.63, 180.59, 338.94, 179.57999, 339.46);
generalPath.curveTo(178.56998, 339.97998, 177.18, 340.31998, 175.65999, 340.31998);
generalPath.curveTo(174.12, 340.31998, 172.73999, 339.94998, 171.73, 339.41998);
generalPath.curveTo(170.73, 338.91998, 169.4, 338.62997, 167.94, 338.62997);
generalPath.curveTo(166.42, 338.62997, 165.08, 338.91998, 164.08, 339.43997);
generalPath.curveTo(163.06, 339.96997, 161.66, 340.31998, 160.13, 340.31998);
generalPath.lineTo(160.13, 337.91998);
generalPath.curveTo(161.66, 337.91998, 163.06, 337.56, 164.08, 337.02);
generalPath.curveTo(165.08, 336.50998, 166.42, 336.22, 167.94, 336.22);
generalPath.curveTo(169.39, 336.22, 170.73, 336.52, 171.73, 337.01);
generalPath.curveTo(172.73999, 337.55002, 174.12, 337.90002, 175.65999, 337.90002);
generalPath.curveTo(177.18, 337.90002, 178.56999, 337.58002, 179.57999, 337.05002);
generalPath.curveTo(180.58998, 336.53003, 181.97998, 336.22003, 183.48999, 336.22003);
generalPath.curveTo(184.98999, 336.22003, 186.34999, 336.53003, 187.34999, 337.04004);
generalPath.curveTo(188.37, 337.59003, 189.73999, 337.90002, 191.27998, 337.90002);
generalPath.lineTo(191.25998, 340.32004);
shape = generalPath;
paint = new Color(204, 204, 204, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.26, 340.32);
generalPath.curveTo(189.72, 340.32, 188.37, 339.99002, 187.34999, 339.45);
generalPath.curveTo(186.34999, 338.94, 184.98999, 338.63, 183.48999, 338.63);
generalPath.curveTo(181.98, 338.63, 180.59, 338.94, 179.57999, 339.46);
generalPath.curveTo(178.56998, 339.97998, 177.18, 340.31998, 175.65999, 340.31998);
generalPath.curveTo(174.12, 340.31998, 172.73999, 339.94998, 171.73, 339.41998);
generalPath.curveTo(170.73, 338.91998, 169.4, 338.62997, 167.94, 338.62997);
generalPath.curveTo(166.42, 338.62997, 165.08, 338.91998, 164.08, 339.43997);
generalPath.curveTo(163.06, 339.96997, 161.66, 340.31998, 160.13, 340.31998);
generalPath.lineTo(160.13, 337.91998);
generalPath.curveTo(161.66, 337.91998, 163.06, 337.56, 164.08, 337.02);
generalPath.curveTo(165.08, 336.50998, 166.42, 336.22, 167.94, 336.22);
generalPath.curveTo(169.39, 336.22, 170.73, 336.52, 171.73, 337.01);
generalPath.curveTo(172.73999, 337.55002, 174.12, 337.90002, 175.65999, 337.90002);
generalPath.curveTo(177.18, 337.90002, 178.56999, 337.58002, 179.57999, 337.05002);
generalPath.curveTo(180.58998, 336.53003, 181.97998, 336.22003, 183.48999, 336.22003);
generalPath.curveTo(184.98999, 336.22003, 186.34999, 336.53003, 187.34999, 337.04004);
generalPath.curveTo(188.37, 337.59003, 189.73999, 337.90002, 191.27998, 337.90002);
generalPath.lineTo(191.25998, 340.32004);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.26, 342.73);
generalPath.curveTo(189.72, 342.73, 188.37, 342.40002, 187.34999, 341.87003);
generalPath.curveTo(186.34999, 341.35004, 184.98999, 341.03003, 183.48999, 341.03003);
generalPath.curveTo(181.98, 341.03003, 180.59, 341.35004, 179.57999, 341.87003);
generalPath.curveTo(178.56998, 342.39, 177.18, 342.73, 175.65999, 342.73);
generalPath.curveTo(174.12, 342.73, 172.73999, 342.36002, 171.73, 341.83002);
generalPath.curveTo(170.73, 341.33002, 169.4, 341.03003, 167.94, 341.03003);
generalPath.curveTo(166.42, 341.03003, 165.08, 341.33002, 164.08, 341.85004);
generalPath.curveTo(163.06, 342.38004, 161.66, 342.73004, 160.13, 342.73004);
generalPath.lineTo(160.13, 340.34003);
generalPath.curveTo(161.66, 340.34003, 163.06, 339.97003, 164.08, 339.44003);
generalPath.curveTo(165.08, 338.92004, 166.42, 338.63004, 167.94, 338.63004);
generalPath.curveTo(169.39, 338.63004, 170.73, 338.93002, 171.73, 339.42004);
generalPath.curveTo(172.73999, 339.95004, 174.12, 340.32004, 175.65999, 340.32004);
generalPath.curveTo(177.18, 340.32004, 178.56999, 339.98004, 179.57999, 339.46005);
generalPath.curveTo(180.58998, 338.94006, 181.97998, 338.63007, 183.48999, 338.63007);
generalPath.curveTo(184.98999, 338.63007, 186.34999, 338.94006, 187.34999, 339.45007);
generalPath.curveTo(188.37, 339.99008, 189.73, 340.32007, 191.27998, 340.32007);
generalPath.lineTo(191.25998, 342.73007);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 91, 191, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(191.26, 342.73);
generalPath.curveTo(189.72, 342.73, 188.37, 342.40002, 187.34999, 341.87003);
generalPath.curveTo(186.34999, 341.35004, 184.98999, 341.03003, 183.48999, 341.03003);
generalPath.curveTo(181.98, 341.03003, 180.59, 341.35004, 179.57999, 341.87003);
generalPath.curveTo(178.56998, 342.39, 177.18, 342.73, 175.65999, 342.73);
generalPath.curveTo(174.12, 342.73, 172.73999, 342.36002, 171.73, 341.83002);
generalPath.curveTo(170.73, 341.33002, 169.4, 341.03003, 167.94, 341.03003);
generalPath.curveTo(166.42, 341.03003, 165.08, 341.33002, 164.08, 341.85004);
generalPath.curveTo(163.06, 342.38004, 161.66, 342.73004, 160.13, 342.73004);
generalPath.lineTo(160.13, 340.34003);
generalPath.curveTo(161.66, 340.34003, 163.06, 339.97003, 164.08, 339.44003);
generalPath.curveTo(165.08, 338.92004, 166.42, 338.63004, 167.94, 338.63004);
generalPath.curveTo(169.39, 338.63004, 170.73, 338.93002, 171.73, 339.42004);
generalPath.curveTo(172.73999, 339.95004, 174.12, 340.32004, 175.65999, 340.32004);
generalPath.curveTo(177.18, 340.32004, 178.56999, 339.98004, 179.57999, 339.46005);
generalPath.curveTo(180.58998, 338.94006, 181.97998, 338.63007, 183.48999, 338.63007);
generalPath.curveTo(184.98999, 338.63007, 186.34999, 338.94006, 187.34999, 339.45007);
generalPath.curveTo(188.37, 339.99008, 189.73, 340.32007, 191.27998, 340.32007);
generalPath.lineTo(191.25998, 342.73007);
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
// _0_2_0_4_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(166.92, 320.78);
generalPath.curveTo(166.97, 320.99, 167.05, 321.18, 167.05, 321.4);
generalPath.curveTo(167.05, 322.86, 165.78, 324.03, 164.24, 324.03);
generalPath.lineTo(187.18001, 324.03);
generalPath.curveTo(185.63, 324.03, 184.37001, 322.86, 184.37001, 321.4);
generalPath.curveTo(184.37001, 321.19, 184.41, 320.99, 184.46, 320.78);
generalPath.curveTo(184.33, 320.83, 184.17001, 320.84, 184.02, 320.84);
generalPath.lineTo(167.33, 320.84);
generalPath.curveTo(167.2, 320.84, 167.04001, 320.82, 166.92, 320.78);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(166.92, 320.78);
generalPath.curveTo(166.97, 320.99, 167.05, 321.18, 167.05, 321.4);
generalPath.curveTo(167.05, 322.86, 165.78, 324.03, 164.24, 324.03);
generalPath.lineTo(187.18001, 324.03);
generalPath.curveTo(185.63, 324.03, 184.37001, 322.86, 184.37001, 321.4);
generalPath.curveTo(184.37001, 321.19, 184.41, 320.99, 184.46, 320.78);
generalPath.curveTo(184.33, 320.83, 184.17001, 320.84, 184.02, 320.84);
generalPath.lineTo(167.33, 320.84);
generalPath.curveTo(167.2, 320.84, 167.04001, 320.82, 166.92, 320.78);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_1_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.33, 319.27);
generalPath.lineTo(184.02, 319.27);
generalPath.curveTo(184.59001, 319.27, 185.04001, 319.62, 185.04001, 320.05);
generalPath.curveTo(185.04001, 320.47998, 184.59001, 320.84, 184.02, 320.84);
generalPath.lineTo(167.33, 320.84);
generalPath.curveTo(166.77, 320.84, 166.31, 320.48, 166.31, 320.05);
generalPath.curveTo(166.31, 319.61996, 166.77, 319.27, 167.33, 319.27);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.33, 319.27);
generalPath.lineTo(184.02, 319.27);
generalPath.curveTo(184.59001, 319.27, 185.04001, 319.62, 185.04001, 320.05);
generalPath.curveTo(185.04001, 320.47998, 184.59001, 320.84, 184.02, 320.84);
generalPath.lineTo(167.33, 320.84);
generalPath.curveTo(166.77, 320.84, 166.31, 320.48, 166.31, 320.05);
generalPath.curveTo(166.31, 319.61996, 166.77, 319.27, 167.33, 319.27);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_1_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(164.27, 329.86);
generalPath.lineTo(187.14, 329.86);
generalPath.lineTo(187.14, 324.03);
generalPath.lineTo(164.27, 324.03);
generalPath.lineTo(164.27, 329.86);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(164.27, 329.86);
generalPath.lineTo(187.14, 329.86);
generalPath.lineTo(187.14, 324.03);
generalPath.lineTo(164.27, 324.03);
generalPath.lineTo(164.27, 329.86);
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
// _0_2_0_4_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.55, 318.32);
generalPath.lineTo(183.8, 318.32);
generalPath.lineTo(183.8, 238.69);
generalPath.lineTo(167.55, 238.69);
generalPath.lineTo(167.55, 318.32);
generalPath.closePath();
shape = generalPath;
paint = new Color(204, 204, 204, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.55, 318.32);
generalPath.lineTo(183.8, 318.32);
generalPath.lineTo(183.8, 238.69);
generalPath.lineTo(167.55, 238.69);
generalPath.lineTo(167.55, 318.32);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_3
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(179.13, 238.8);
generalPath.lineTo(179.13, 318.26);
generalPath.moveTo(180.96, 238.80002);
generalPath.lineTo(180.96, 318.26);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(164.58, 232.37);
generalPath.lineTo(186.87, 232.37);
generalPath.lineTo(186.87, 226.53);
generalPath.lineTo(164.57999, 226.53);
generalPath.lineTo(164.57999, 232.37);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(164.58, 232.37);
generalPath.lineTo(186.87, 232.37);
generalPath.lineTo(186.87, 226.53);
generalPath.lineTo(164.57999, 226.53);
generalPath.lineTo(164.57999, 232.37);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_4_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(166.92, 236.26);
generalPath.curveTo(167.06, 236.2, 167.16, 236.18999, 167.33, 236.18999);
generalPath.lineTo(184.02, 236.18999);
generalPath.curveTo(184.19, 236.18999, 184.34001, 236.21999, 184.48001, 236.26999);
generalPath.curveTo(183.90001, 236.07999, 183.49, 235.55998, 183.49, 234.94998);
generalPath.curveTo(183.49, 234.33998, 183.94, 233.80998, 184.52, 233.61998);
generalPath.curveTo(184.38, 233.65997, 184.19, 233.69998, 184.03, 233.69998);
generalPath.lineTo(167.33, 233.69998);
generalPath.curveTo(167.16, 233.69998, 167.0, 233.68999, 166.86, 233.63998);
generalPath.lineTo(166.95, 233.65999);
generalPath.curveTo(167.55, 233.83998, 167.89, 234.37, 167.89, 234.94998);
generalPath.curveTo(167.89, 235.50998, 167.51, 236.07999, 166.92, 236.25998);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(166.92, 236.26);
generalPath.curveTo(167.06, 236.2, 167.16, 236.18999, 167.33, 236.18999);
generalPath.lineTo(184.02, 236.18999);
generalPath.curveTo(184.19, 236.18999, 184.34001, 236.21999, 184.48001, 236.26999);
generalPath.curveTo(183.90001, 236.07999, 183.49, 235.55998, 183.49, 234.94998);
generalPath.curveTo(183.49, 234.33998, 183.94, 233.80998, 184.52, 233.61998);
generalPath.curveTo(184.38, 233.65997, 184.19, 233.69998, 184.03, 233.69998);
generalPath.lineTo(167.33, 233.69998);
generalPath.curveTo(167.16, 233.69998, 167.0, 233.68999, 166.86, 233.63998);
generalPath.lineTo(166.95, 233.65999);
generalPath.curveTo(167.55, 233.83998, 167.89, 234.37, 167.89, 234.94998);
generalPath.curveTo(167.89, 235.50998, 167.51, 236.07999, 166.92, 236.25998);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_4_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.33, 236.19);
generalPath.lineTo(184.02, 236.19);
generalPath.curveTo(184.59001, 236.19, 185.04001, 236.54001, 185.04001, 236.97);
generalPath.curveTo(185.04001, 237.41, 184.59001, 237.76, 184.02, 237.76);
generalPath.lineTo(167.33, 237.76);
generalPath.curveTo(166.77, 237.76, 166.31, 237.40999, 166.31, 236.97);
generalPath.curveTo(166.31, 236.54001, 166.77, 236.19, 167.33, 236.19);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.33, 236.19);
generalPath.lineTo(184.02, 236.19);
generalPath.curveTo(184.59001, 236.19, 185.04001, 236.54001, 185.04001, 236.97);
generalPath.curveTo(185.04001, 237.41, 184.59001, 237.76, 184.02, 237.76);
generalPath.lineTo(167.33, 237.76);
generalPath.curveTo(166.77, 237.76, 166.31, 237.40999, 166.31, 236.97);
generalPath.curveTo(166.31, 236.54001, 166.77, 236.19, 167.33, 236.19);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4_0_4_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.33, 232.37);
generalPath.lineTo(184.03, 232.37);
generalPath.curveTo(184.6, 232.37, 185.06, 232.67, 185.06, 233.03);
generalPath.curveTo(185.06, 233.4, 184.59999, 233.7, 184.03, 233.7);
generalPath.lineTo(167.33, 233.7);
generalPath.curveTo(166.77, 233.7, 166.31, 233.4, 166.31, 233.03);
generalPath.curveTo(166.31, 232.67, 166.77, 232.37, 167.33, 232.37);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.33, 232.37);
generalPath.lineTo(184.03, 232.37);
generalPath.curveTo(184.6, 232.37, 185.06, 232.67, 185.06, 233.03);
generalPath.curveTo(185.06, 233.4, 184.59999, 233.7, 184.03, 233.7);
generalPath.lineTo(167.33, 233.7);
generalPath.curveTo(166.77, 233.7, 166.31, 233.4, 166.31, 233.03);
generalPath.curveTo(166.31, 232.67, 166.77, 232.37, 167.33, 232.37);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 500.57000732421875f, 0.0f));
// _0_2_0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_5_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_5_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(162.48, 298.62);
generalPath.curveTo(160.22, 299.91998, 158.68, 301.26, 158.93, 301.93);
generalPath.curveTo(159.04999, 302.53998, 159.76999, 303.0, 160.79999, 303.68);
generalPath.curveTo(162.41998, 304.81, 163.4, 306.82, 162.62999, 307.75);
generalPath.curveTo(163.96999, 306.67, 164.81999, 305.06, 164.81999, 303.26);
generalPath.curveTo(164.81999, 301.39, 163.92, 299.7, 162.48, 298.62);
generalPath.closePath();
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(162.48, 298.62);
generalPath.curveTo(160.22, 299.91998, 158.68, 301.26, 158.93, 301.93);
generalPath.curveTo(159.04999, 302.53998, 159.76999, 303.0, 160.79999, 303.68);
generalPath.curveTo(162.41998, 304.81, 163.4, 306.82, 162.62999, 307.75);
generalPath.curveTo(163.96999, 306.67, 164.81999, 305.06, 164.81999, 303.26);

}

private void _paint6(Graphics2D g,float origAlpha) {
generalPath.curveTo(164.81999, 301.39, 163.92, 299.7, 162.48, 298.62);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_5_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(200.4, 268.47);
generalPath.curveTo(196.86, 267.01, 190.82999, 265.92, 183.90999, 265.69);
generalPath.curveTo(181.51999, 265.71, 178.87, 265.94, 176.12, 266.39);
generalPath.curveTo(166.4, 268.02002, 158.98999, 271.90002, 159.57999, 275.06003);
generalPath.curveTo(159.58998, 275.12003, 159.61998, 275.26004, 159.62999, 275.32004);
generalPath.curveTo(159.62999, 275.32004, 155.98999, 267.11005, 155.93, 266.80005);
generalPath.curveTo(155.28, 263.29004, 163.48999, 258.98004, 174.28, 257.18005);
generalPath.curveTo(177.67, 256.61005, 180.97, 256.39005, 183.84, 256.42004);
generalPath.curveTo(190.73999, 256.42004, 196.73999, 257.31006, 200.36, 258.65005);
generalPath.lineTo(200.4, 268.47006);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(200.4, 268.47);
generalPath.curveTo(196.86, 267.01, 190.82999, 265.92, 183.90999, 265.69);
generalPath.curveTo(181.51999, 265.71, 178.87, 265.94, 176.12, 266.39);
generalPath.curveTo(166.4, 268.02002, 158.98999, 271.90002, 159.57999, 275.06003);
generalPath.curveTo(159.58998, 275.12003, 159.61998, 275.26004, 159.62999, 275.32004);
generalPath.curveTo(159.62999, 275.32004, 155.98999, 267.11005, 155.93, 266.80005);
generalPath.curveTo(155.28, 263.29004, 163.48999, 258.98004, 174.28, 257.18005);
generalPath.curveTo(177.67, 256.61005, 180.97, 256.39005, 183.84, 256.42004);
generalPath.curveTo(190.73999, 256.42004, 196.73999, 257.31006, 200.36, 258.65005);
generalPath.lineTo(200.4, 268.47006);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_5_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.52, 278.47);
generalPath.curveTo(163.01001, 278.15, 159.94, 276.94, 159.58, 275.06);
generalPath.curveTo(159.3, 273.56, 160.83, 271.88998, 163.55, 270.38);
generalPath.curveTo(164.76001, 270.52002, 166.13, 270.68, 167.55, 270.68);
generalPath.lineTo(167.52, 278.47);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(167.52, 278.47);
generalPath.curveTo(163.01001, 278.15, 159.94, 276.94, 159.58, 275.06);
generalPath.curveTo(159.3, 273.56, 160.83, 271.88998, 163.55, 270.38);
generalPath.curveTo(164.76001, 270.52002, 166.13, 270.68, 167.55, 270.68);
generalPath.lineTo(167.52, 278.47);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_5_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.83, 272.38);
generalPath.curveTo(186.65001, 272.81, 188.76, 273.51, 189.81, 274.37);
generalPath.lineTo(189.91, 274.54);
generalPath.curveTo(190.41, 275.57, 187.94, 277.76, 183.8, 280.21002);
generalPath.lineTo(183.83, 272.38004);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(183.83, 272.38);
generalPath.curveTo(186.65001, 272.81, 188.76, 273.51, 189.81, 274.37);
generalPath.lineTo(189.91, 274.54);
generalPath.curveTo(190.41, 275.57, 187.94, 277.76, 183.8, 280.21002);
generalPath.lineTo(183.83, 272.38004);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_5_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(157.42, 293.83);
generalPath.curveTo(156.99, 292.55, 161.39, 289.97, 167.6, 287.68997);
generalPath.curveTo(170.44, 286.67996, 172.78, 285.61996, 175.69, 284.33997);
generalPath.curveTo(184.32, 280.51996, 190.69, 276.13995, 189.91, 274.54996);
generalPath.lineTo(189.82, 274.37994);
generalPath.curveTo(190.28001, 274.75995, 191.0, 282.61993, 191.0, 282.61993);
generalPath.curveTo(191.78, 284.07993, 185.95, 288.39993, 178.0, 292.19992);
generalPath.curveTo(175.46, 293.41992, 170.09, 295.39993, 167.56, 296.28992);
generalPath.curveTo(163.02, 297.85992, 158.52, 300.82993, 158.93, 301.92993);
generalPath.lineTo(157.42, 293.83994);
generalPath.lineTo(157.42, 293.82993);
generalPath.closePath();
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(157.42, 293.83);
generalPath.curveTo(156.99, 292.55, 161.39, 289.97, 167.6, 287.68997);
generalPath.curveTo(170.44, 286.67996, 172.78, 285.61996, 175.69, 284.33997);
generalPath.curveTo(184.32, 280.51996, 190.69, 276.13995, 189.91, 274.54996);
generalPath.lineTo(189.82, 274.37994);
generalPath.curveTo(190.28001, 274.75995, 191.0, 282.61993, 191.0, 282.61993);
generalPath.curveTo(191.78, 284.07993, 185.95, 288.39993, 178.0, 292.19992);
generalPath.curveTo(175.46, 293.41992, 170.09, 295.39993, 167.56, 296.28992);
generalPath.curveTo(163.02, 297.85992, 158.52, 300.82993, 158.93, 301.92993);
generalPath.lineTo(157.42, 293.83994);
generalPath.lineTo(157.42, 293.82993);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(166.42, 264.65);
generalPath.curveTo(168.41, 263.93, 169.70999, 263.07, 169.08, 261.50998);
generalPath.curveTo(168.67, 260.50998, 167.65001, 260.31998, 166.11, 260.87997);
generalPath.lineTo(163.4, 261.86996);
generalPath.lineTo(165.84, 267.89996);
generalPath.curveTo(166.11, 267.77997, 166.37999, 267.65997, 166.65, 267.55997);
generalPath.curveTo(166.93, 267.45996, 167.22, 267.37997, 167.5, 267.29996);
generalPath.lineTo(166.42, 264.65994);
generalPath.lineTo(166.42, 264.64993);
generalPath.closePath();
generalPath.moveTo(165.24, 261.74);
generalPath.lineTo(165.93001, 261.49);
generalPath.curveTo(166.50002, 261.28, 167.14001, 261.59, 167.43001, 262.28998);
generalPath.curveTo(167.64001, 262.81998, 167.59001, 263.41998, 166.93001, 263.83997);
generalPath.curveTo(166.72, 263.96997, 166.47, 264.06998, 166.23001, 264.16995);
generalPath.lineTo(165.24, 261.73996);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(172.78, 259.22);
generalPath.curveTo(172.49, 259.3, 172.20999, 259.38, 171.92, 259.44);
generalPath.curveTo(171.63, 259.49, 171.33, 259.53, 171.04, 259.56);
generalPath.lineTo(172.45, 265.84);
generalPath.lineTo(176.83, 264.96);
generalPath.curveTo(176.78, 264.84, 176.71, 264.69998, 176.69, 264.58);
generalPath.curveTo(176.66, 264.43997, 176.66, 264.3, 176.65001, 264.16998);
generalPath.curveTo(175.88, 264.38998, 175.04001, 264.62997, 174.04001, 264.83);
generalPath.lineTo(172.78001, 259.22);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(181.56, 264.63);
generalPath.curveTo(182.38, 262.35, 183.38, 260.17, 184.37, 257.96);
generalPath.curveTo(184.19, 257.99, 184.01, 258.02, 183.83, 258.03);
generalPath.curveTo(183.65001, 258.04, 183.46, 258.04, 183.29001, 258.03);
generalPath.curveTo(182.76001, 259.63998, 182.11002, 261.24, 181.42001, 262.83);
generalPath.curveTo(180.6, 261.31998, 179.69002, 259.84, 178.99002, 258.31998);
generalPath.curveTo(178.65002, 258.36, 178.30002, 258.40997, 177.96002, 258.43997);
generalPath.curveTo(177.62003, 258.45996, 177.26003, 258.44998, 176.92003, 258.45996);
generalPath.curveTo(178.18002, 260.51996, 179.40002, 262.56995, 180.56003, 264.68997);
generalPath.curveTo(180.72003, 264.65997, 180.88004, 264.62997, 181.06003, 264.61);
generalPath.curveTo(181.22003, 264.59998, 181.39003, 264.62, 181.56003, 264.62997);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.72, 259.8);
generalPath.curveTo(190.87, 259.49, 191.03, 259.19998, 191.2, 258.90997);
generalPath.curveTo(190.95999, 258.68997, 190.23999, 258.36, 189.39, 258.27997);
generalPath.curveTo(187.6, 258.09998, 186.58, 258.88995, 186.46, 259.96997);
generalPath.curveTo(186.20001, 262.22998, 189.77, 262.03998, 189.6, 263.53998);
generalPath.curveTo(189.53, 264.18, 188.85, 264.43997, 188.12001, 264.36996);
generalPath.curveTo(187.31001, 264.28998, 186.71, 263.83997, 186.61002, 263.17996);
generalPath.lineTo(186.39001, 263.15997);
generalPath.curveTo(186.27002, 263.55, 186.10002, 263.92996, 185.91002, 264.30997);
generalPath.curveTo(186.44002, 264.64996, 187.12003, 264.83997, 187.76003, 264.89996);
generalPath.curveTo(189.59003, 265.08997, 190.98003, 264.35995, 191.11003, 263.15997);
generalPath.curveTo(191.34003, 261.00998, 187.74004, 260.88998, 187.88004, 259.61996);
generalPath.curveTo(187.94003, 259.08997, 188.35004, 258.73996, 189.28003, 258.82996);
generalPath.curveTo(189.95003, 258.89996, 190.36003, 259.25995, 190.54002, 259.77997);
generalPath.lineTo(190.72002, 259.79996);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(310.3, 264.98);
generalPath.curveTo(310.91998, 262.65002, 311.71, 260.40002, 312.49, 258.11002);
generalPath.curveTo(312.31998, 258.16, 312.13998, 258.2, 311.96, 258.22);
generalPath.curveTo(311.78998, 258.25, 311.6, 258.26, 311.41998, 258.27);
generalPath.curveTo(311.05, 259.91, 310.53998, 261.56, 309.99997, 263.21);
generalPath.curveTo(309.03998, 261.77, 307.99997, 260.37, 307.16998, 258.91);
generalPath.curveTo(306.83, 258.98, 306.49, 259.06, 306.15, 259.11002);
generalPath.curveTo(305.81, 259.16003, 305.46, 259.18002, 305.11, 259.22);
generalPath.curveTo(306.56, 261.16, 307.96, 263.11002, 309.31, 265.13);
generalPath.curveTo(309.47, 265.09, 309.63, 265.03, 309.81, 265.01);
generalPath.curveTo(309.97, 264.99002, 310.13998, 264.99002, 310.3, 264.98);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(316.48, 258.16);
generalPath.curveTo(316.19, 258.17, 315.89, 258.2, 315.6, 258.19);
generalPath.curveTo(315.30002, 258.19, 315.0, 258.15, 314.71, 258.13);
generalPath.lineTo(314.59, 264.54);
generalPath.lineTo(319.08, 264.62);
generalPath.curveTo(319.05, 264.49, 319.02, 264.34, 319.02, 264.21);
generalPath.curveTo(319.02, 264.08, 319.06, 263.94, 319.09, 263.81);
generalPath.curveTo(318.28, 263.86, 317.41, 263.91, 316.38, 263.88998);
generalPath.lineTo(316.48, 258.15997);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(323.52, 259.21);
generalPath.curveTo(324.24, 259.27, 324.93, 259.4, 325.62, 259.52);
generalPath.curveTo(325.61, 259.38998, 325.59, 259.25, 325.6, 259.11);
generalPath.curveTo(325.61002, 258.97998, 325.66, 258.84998, 325.7, 258.71997);
generalPath.lineTo(319.63, 258.21997);
generalPath.curveTo(319.64, 258.36, 319.66, 258.48996, 319.65, 258.61996);
generalPath.curveTo(319.63998, 258.75998, 319.59, 258.88995, 319.55, 259.01996);
generalPath.curveTo(320.16998, 258.99997, 320.91998, 258.99997, 321.75998, 259.06995);
generalPath.lineTo(321.22998, 264.83994);
generalPath.curveTo(321.52, 264.83994, 321.81998, 264.83994, 322.11, 264.86993);
generalPath.curveTo(322.40997, 264.88992, 322.69998, 264.93994, 322.99, 264.97992);
generalPath.lineTo(323.52, 259.20993);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(326.01, 265.53);
generalPath.curveTo(326.30002, 265.58, 326.6, 265.62, 326.89, 265.68);
generalPath.curveTo(327.17, 265.74, 327.46002, 265.83, 327.74002, 265.91);
generalPath.lineTo(328.46002, 262.97);
generalPath.lineTo(328.54, 262.98);
generalPath.curveTo(328.7, 263.39, 328.92, 263.88, 329.03, 264.17);
generalPath.lineTo(329.93, 266.39);
generalPath.curveTo(330.28998, 266.45, 330.63998, 266.5, 330.97998, 266.57);
generalPath.curveTo(331.33997, 266.65, 331.68, 266.75, 332.02, 266.85);
generalPath.lineTo(331.71, 266.18);
generalPath.curveTo(331.22998, 265.18, 330.72, 264.16998, 330.3, 263.16);
generalPath.curveTo(331.41998, 263.2, 332.28, 262.80002, 332.5, 261.9);
generalPath.curveTo(332.65, 261.28, 332.4, 260.79, 331.82, 260.37);
generalPath.curveTo(331.38, 260.06, 330.54, 259.9, 329.99002, 259.77);
generalPath.lineTo(327.55002, 259.24);
generalPath.lineTo(326.01, 265.53);
generalPath.moveTo(329.15002, 260.11);
generalPath.curveTo(329.86002, 260.27, 330.74002, 260.37997, 330.74002, 261.18);
generalPath.curveTo(330.73, 261.38998, 330.71002, 261.53, 330.68002, 261.66);
generalPath.curveTo(330.45, 262.6, 329.74002, 262.92, 328.55002, 262.57);
generalPath.lineTo(329.15002, 260.11002);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(337.57, 267.46);
generalPath.curveTo(337.52002, 268.15, 337.39, 268.83, 337.26, 269.56);
generalPath.curveTo(337.56, 269.7, 337.87, 269.83, 338.16, 270.0);
generalPath.curveTo(338.46, 270.16, 338.73, 270.34, 339.02, 270.52);
generalPath.lineTo(339.62, 263.28998);
generalPath.curveTo(339.47998, 263.22998, 339.35, 263.16998, 339.21, 263.09998);
generalPath.curveTo(339.08, 263.02997, 338.96, 262.94998, 338.84, 262.86);
generalPath.lineTo(332.46, 266.90997);
generalPath.curveTo(332.63, 266.98996, 332.81, 267.06998, 332.97, 267.15997);
generalPath.curveTo(333.14, 267.24997, 333.28, 267.34998, 333.44, 267.43997);
generalPath.curveTo(333.98, 266.98996, 334.54, 266.61996, 335.18, 266.13998);
generalPath.lineTo(337.57, 267.44998);
generalPath.lineTo(337.57, 267.46);
generalPath.closePath();
generalPath.moveTo(335.76, 265.8);
generalPath.lineTo(337.89, 264.43);
generalPath.lineTo(337.64, 266.83);
generalPath.lineTo(335.76, 265.8);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(249.65, 182.72);
generalPath.curveTo(256.29, 182.72, 262.21, 183.71, 266.06, 185.23);
generalPath.curveTo(268.26, 186.23, 271.22, 186.95999, 274.46, 187.4);
generalPath.curveTo(276.93, 187.73, 279.27, 187.79, 281.31, 187.64);
generalPath.curveTo(284.04, 187.58, 287.98, 188.38, 291.93, 190.12);
generalPath.curveTo(295.19, 191.56999, 297.91998, 193.33, 299.72998, 195.03);
generalPath.lineTo(298.15997, 196.43);
generalPath.lineTo(297.70996, 200.39);
generalPath.lineTo(293.40997, 205.31);
generalPath.lineTo(291.25998, 207.14);
generalPath.lineTo(286.16998, 211.21);
generalPath.lineTo(283.56998, 211.42001);
generalPath.lineTo(282.77997, 213.67001);
generalPath.lineTo(249.86996, 209.81001);
generalPath.lineTo(216.84996, 213.67001);
generalPath.lineTo(216.05997, 211.42001);
generalPath.lineTo(213.44997, 211.21);
generalPath.lineTo(208.36996, 207.14);
generalPath.lineTo(206.21997, 205.31);
generalPath.lineTo(201.91997, 200.39);
generalPath.lineTo(201.47997, 196.43);
generalPath.lineTo(199.89996, 195.03);
generalPath.curveTo(201.71997, 193.33, 204.43996, 191.56999, 207.69997, 190.12);
generalPath.curveTo(211.64996, 188.37999, 215.58997, 187.58, 218.31996, 187.64);
generalPath.curveTo(220.35995, 187.79, 222.69997, 187.73, 225.16997, 187.4);
generalPath.curveTo(228.40997, 186.95999, 231.36996, 186.23, 233.56996, 185.23);
generalPath.curveTo(237.42996, 183.70999, 243.00996, 182.72, 249.64996, 182.72);
generalPath.closePath();
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(249.65, 182.72);
generalPath.curveTo(256.29, 182.72, 262.21, 183.71, 266.06, 185.23);
generalPath.curveTo(268.26, 186.23, 271.22, 186.95999, 274.46, 187.4);
generalPath.curveTo(276.93, 187.73, 279.27, 187.79, 281.31, 187.64);
generalPath.curveTo(284.04, 187.58, 287.98, 188.38, 291.93, 190.12);
generalPath.curveTo(295.19, 191.56999, 297.91998, 193.33, 299.72998, 195.03);
generalPath.lineTo(298.15997, 196.43);
generalPath.lineTo(297.70996, 200.39);
generalPath.lineTo(293.40997, 205.31);
generalPath.lineTo(291.25998, 207.14);
generalPath.lineTo(286.16998, 211.21);
generalPath.lineTo(283.56998, 211.42001);
generalPath.lineTo(282.77997, 213.67001);
generalPath.lineTo(249.86996, 209.81001);
generalPath.lineTo(216.84996, 213.67001);
generalPath.lineTo(216.05997, 211.42001);
generalPath.lineTo(213.44997, 211.21);
generalPath.lineTo(208.36996, 207.14);
generalPath.lineTo(206.21997, 205.31);
generalPath.lineTo(201.91997, 200.39);
generalPath.lineTo(201.47997, 196.43);
generalPath.lineTo(199.89996, 195.03);
generalPath.curveTo(201.71997, 193.33, 204.43996, 191.56999, 207.69997, 190.12);
generalPath.curveTo(211.64996, 188.37999, 215.58997, 187.58, 218.31996, 187.64);
generalPath.curveTo(220.35995, 187.79, 222.69997, 187.73, 225.16997, 187.4);
generalPath.curveTo(228.40997, 186.95999, 231.36996, 186.23, 233.56996, 185.23);
generalPath.curveTo(237.42996, 183.70999, 243.00996, 182.72, 249.64996, 182.72);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(225.34, 191.42);
generalPath.lineTo(226.72, 192.53);
generalPath.lineTo(228.8, 189.13);
generalPath.curveTo(226.55, 187.75, 225.0, 185.35, 225.0, 182.62001);
generalPath.curveTo(225.0, 182.31001, 225.02, 182.01001, 225.06, 181.71);
generalPath.curveTo(225.27, 177.37001, 230.56, 173.79001, 237.26, 173.79001);
generalPath.curveTo(240.73999, 173.79001, 243.89, 174.74, 246.09999, 176.27);
generalPath.curveTo(246.15999, 175.6, 246.21999, 175.02, 246.31, 174.41);
generalPath.curveTo(243.88, 172.99, 240.70999, 172.13, 237.26, 172.13);
generalPath.curveTo(229.54999, 172.13, 223.51999, 176.52, 223.23, 181.70001);
generalPath.curveTo(223.2, 182.01001, 223.18, 182.31001, 223.18, 182.62001);
generalPath.curveTo(223.18, 185.38, 224.43999, 187.88, 226.43999, 189.61002);
generalPath.lineTo(225.33998, 191.42001);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(225.34, 191.42);
generalPath.lineTo(226.72, 192.53);
generalPath.lineTo(228.8, 189.13);
generalPath.curveTo(226.55, 187.75, 225.0, 185.35, 225.0, 182.62001);
generalPath.curveTo(225.0, 182.31001, 225.02, 182.01001, 225.06, 181.71);
generalPath.curveTo(225.27, 177.37001, 230.56, 173.79001, 237.26, 173.79001);
generalPath.curveTo(240.73999, 173.79001, 243.89, 174.74, 246.09999, 176.27);
generalPath.curveTo(246.15999, 175.6, 246.21999, 175.02, 246.31, 174.41);
generalPath.curveTo(243.88, 172.99, 240.70999, 172.13, 237.26, 172.13);
generalPath.curveTo(229.54999, 172.13, 223.51999, 176.52, 223.23, 181.70001);
generalPath.curveTo(223.2, 182.01001, 223.18, 182.31001, 223.18, 182.62001);
generalPath.curveTo(223.18, 185.38, 224.43999, 187.88, 226.43999, 189.61002);
generalPath.lineTo(225.33998, 191.42001);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(225.43, 191.46);
generalPath.curveTo(222.79999, 189.49, 221.15999, 186.82, 221.15999, 183.88);
generalPath.curveTo(221.15999, 180.5, 223.37999, 177.48001, 226.73999, 175.47);
generalPath.curveTo(224.66998, 177.14, 223.40999, 179.3, 223.23, 181.7);
generalPath.curveTo(223.2, 182.01, 223.18, 182.31, 223.18, 182.62);
generalPath.curveTo(223.18, 185.37999, 224.43999, 187.87999, 226.43999, 189.61);
generalPath.lineTo(225.43, 191.46);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(225.43, 191.46);
generalPath.curveTo(222.79999, 189.49, 221.15999, 186.82, 221.15999, 183.88);
generalPath.curveTo(221.15999, 180.5, 223.37999, 177.48001, 226.73999, 175.47);
generalPath.curveTo(224.66998, 177.14, 223.40999, 179.3, 223.23, 181.7);
generalPath.curveTo(223.2, 182.01, 223.18, 182.31, 223.18, 182.62);
generalPath.curveTo(223.18, 185.37999, 224.43999, 187.87999, 226.43999, 189.61);
generalPath.lineTo(225.43, 191.46);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(202.21, 194.89);
generalPath.curveTo(200.73001, 193.24, 199.83, 191.1, 199.83, 188.77);
generalPath.curveTo(199.83, 187.36, 200.16, 186.02, 200.74, 184.82);
generalPath.curveTo(202.87001, 180.44, 209.56, 177.25, 217.5, 177.25);
generalPath.curveTo(219.66, 177.25, 221.73, 177.48, 223.64, 177.92);
generalPath.curveTo(223.22, 178.38, 222.89, 178.89, 222.56, 179.4);
generalPath.curveTo(220.97, 179.09, 219.27, 178.92, 217.5, 178.92);
generalPath.curveTo(210.23, 178.92, 204.14, 181.75, 202.38, 185.56999);
generalPath.curveTo(201.91, 186.54, 201.65001, 187.62999, 201.65001, 188.76999);
generalPath.curveTo(201.65001, 191.09, 202.74, 193.16998, 204.44, 194.59);
generalPath.lineTo(201.81, 198.89);
generalPath.lineTo(200.4, 197.77);
generalPath.lineTo(202.20999, 194.89);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(202.21, 194.89);
generalPath.curveTo(200.73001, 193.24, 199.83, 191.1, 199.83, 188.77);
generalPath.curveTo(199.83, 187.36, 200.16, 186.02, 200.74, 184.82);
generalPath.curveTo(202.87001, 180.44, 209.56, 177.25, 217.5, 177.25);
generalPath.curveTo(219.66, 177.25, 221.73, 177.48, 223.64, 177.92);
generalPath.curveTo(223.22, 178.38, 222.89, 178.89, 222.56, 179.4);
generalPath.curveTo(220.97, 179.09, 219.27, 178.92, 217.5, 178.92);
generalPath.curveTo(210.23, 178.92, 204.14, 181.75, 202.38, 185.56999);
generalPath.curveTo(201.91, 186.54, 201.65001, 187.62999, 201.65001, 188.76999);
generalPath.curveTo(201.65001, 191.09, 202.74, 193.16998, 204.44, 194.59);
generalPath.lineTo(201.81, 198.89);
generalPath.lineTo(200.4, 197.77);
generalPath.lineTo(202.20999, 194.89);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.9, 180.48);
generalPath.curveTo(202.98999, 181.69, 201.54, 183.17, 200.73999, 184.81999);
generalPath.curveTo(200.15999, 186.01999, 199.82999, 187.35999, 199.82999, 188.76999);
generalPath.curveTo(199.82999, 191.09999, 200.72998, 193.23999, 202.20999, 194.88998);
generalPath.lineTo(200.60999, 197.47998);
generalPath.curveTo(199.07999, 195.51997, 198.18999, 193.21999, 198.18999, 190.77998);
generalPath.curveTo(198.18999, 186.57999, 200.85999, 182.90999, 204.9, 180.47998);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.9, 180.48);
generalPath.curveTo(202.98999, 181.69, 201.54, 183.17, 200.73999, 184.81999);
generalPath.curveTo(200.15999, 186.01999, 199.82999, 187.35999, 199.82999, 188.76999);
generalPath.curveTo(199.82999, 191.09999, 200.72998, 193.23999, 202.20999, 194.88998);
generalPath.lineTo(200.60999, 197.47998);
generalPath.curveTo(199.07999, 195.51997, 198.18999, 193.21999, 198.18999, 190.77998);
generalPath.curveTo(198.18999, 186.57999, 200.85999, 182.90999, 204.9, 180.47998);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.04, 171.27);
generalPath.curveTo(251.79999, 171.27, 253.31999, 172.43001, 253.68, 174.0);
generalPath.curveTo(253.90999, 175.38, 254.06, 176.95, 254.09, 178.62);
generalPath.curveTo(254.09999, 178.79999, 254.08, 178.97, 254.08, 179.14);
generalPath.curveTo(254.08, 179.34, 254.12, 179.55, 254.13, 179.75);
generalPath.curveTo(254.19, 183.27, 254.69, 186.37, 255.40001, 188.27);
generalPath.lineTo(250.04001, 193.41);
generalPath.lineTo(244.61002, 188.27);
generalPath.curveTo(245.33002, 186.37001, 245.83002, 183.27, 245.90001, 179.75);
generalPath.curveTo(245.90001, 179.55, 245.94, 179.34, 245.94, 179.14);
generalPath.curveTo(245.94, 178.97, 245.93001, 178.8, 245.93001, 178.62);
generalPath.curveTo(245.96, 176.95, 246.11, 175.37999, 246.34001, 174.0);
generalPath.curveTo(246.70001, 172.43, 248.28001, 171.27, 250.04001, 171.27);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.04, 171.27);
generalPath.curveTo(251.79999, 171.27, 253.31999, 172.43001, 253.68, 174.0);
generalPath.curveTo(253.90999, 175.38, 254.06, 176.95, 254.09, 178.62);
generalPath.curveTo(254.09999, 178.79999, 254.08, 178.97, 254.08, 179.14);
generalPath.curveTo(254.08, 179.34, 254.12, 179.55, 254.13, 179.75);
generalPath.curveTo(254.19, 183.27, 254.69, 186.37, 255.40001, 188.27);
generalPath.lineTo(250.04001, 193.41);
generalPath.lineTo(244.61002, 188.27);
generalPath.curveTo(245.33002, 186.37001, 245.83002, 183.27, 245.90001, 179.75);
generalPath.curveTo(245.90001, 179.55, 245.94, 179.34, 245.94, 179.14);
generalPath.curveTo(245.94, 178.97, 245.93001, 178.8, 245.93001, 178.62);
generalPath.curveTo(245.96, 176.95, 246.11, 175.37999, 246.34001, 174.0);
generalPath.curveTo(246.70001, 172.43, 248.28001, 171.27, 250.04001, 171.27);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.04, 172.94);
generalPath.curveTo(250.95, 172.94, 251.71999, 173.52, 251.90999, 174.33);
generalPath.curveTo(252.13998, 175.64, 252.27998, 177.13, 252.30998, 178.71);
generalPath.curveTo(252.30998, 178.87001, 252.29999, 179.03001, 252.29999, 179.19);
generalPath.curveTo(252.29999, 179.39, 252.32999, 179.58, 252.33998, 179.78);
generalPath.curveTo(252.38998, 183.1, 252.86998, 186.03, 253.54999, 187.83);
generalPath.lineTo(250.01, 191.18001);
generalPath.lineTo(246.47, 187.83);
generalPath.curveTo(247.14, 186.03, 247.62, 183.1, 247.68001, 179.78);
generalPath.curveTo(247.68001, 179.58, 247.72, 179.39, 247.72, 179.19);
generalPath.curveTo(247.72, 179.03, 247.71, 178.87, 247.71, 178.71);
generalPath.curveTo(247.74, 177.13, 247.88, 175.64, 248.11, 174.33);
generalPath.curveTo(248.29, 173.52, 249.13, 172.94, 250.04, 172.94);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.04, 172.94);
generalPath.curveTo(250.95, 172.94, 251.71999, 173.52, 251.90999, 174.33);
generalPath.curveTo(252.13998, 175.64, 252.27998, 177.13, 252.30998, 178.71);
generalPath.curveTo(252.30998, 178.87001, 252.29999, 179.03001, 252.29999, 179.19);
generalPath.curveTo(252.29999, 179.39, 252.32999, 179.58, 252.33998, 179.78);
generalPath.curveTo(252.38998, 183.1, 252.86998, 186.03, 253.54999, 187.83);
generalPath.lineTo(250.01, 191.18001);
generalPath.lineTo(246.47, 187.83);
generalPath.curveTo(247.14, 186.03, 247.62, 183.1, 247.68001, 179.78);
generalPath.curveTo(247.68001, 179.58, 247.72, 179.39, 247.72, 179.19);
generalPath.curveTo(247.72, 179.03, 247.71, 178.87, 247.71, 178.71);
generalPath.curveTo(247.74, 177.13, 247.88, 175.64, 248.11, 174.33);
generalPath.curveTo(248.29, 173.52, 249.13, 172.94, 250.04, 172.94);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(274.7, 191.42);
generalPath.lineTo(273.31, 192.53);
generalPath.lineTo(271.23, 189.13);
generalPath.curveTo(273.49002, 187.75, 275.04, 185.35, 275.04, 182.62001);
generalPath.curveTo(275.04, 182.31001, 275.02002, 182.01001, 274.98, 181.71);
generalPath.curveTo(274.77002, 177.37001, 269.48, 173.79001, 262.78, 173.79001);
generalPath.curveTo(259.29, 173.79001, 256.15, 174.74, 253.94, 176.27);
generalPath.curveTo(253.88, 175.6, 253.82, 175.02, 253.72, 174.41);
generalPath.curveTo(256.16, 172.99, 259.32, 172.13, 262.78, 172.13);
generalPath.curveTo(270.49, 172.13, 276.52, 176.52, 276.81, 181.70001);
generalPath.curveTo(276.84, 182.01001, 276.86, 182.31001, 276.86, 182.62001);
generalPath.curveTo(276.86, 185.38, 275.59, 187.88, 273.59, 189.61002);
generalPath.lineTo(274.69998, 191.42001);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(274.7, 191.42);
generalPath.lineTo(273.31, 192.53);
generalPath.lineTo(271.23, 189.13);
generalPath.curveTo(273.49002, 187.75, 275.04, 185.35, 275.04, 182.62001);
generalPath.curveTo(275.04, 182.31001, 275.02002, 182.01001, 274.98, 181.71);
generalPath.curveTo(274.77002, 177.37001, 269.48, 173.79001, 262.78, 173.79001);
generalPath.curveTo(259.29, 173.79001, 256.15, 174.74, 253.94, 176.27);
generalPath.curveTo(253.88, 175.6, 253.82, 175.02, 253.72, 174.41);
generalPath.curveTo(256.16, 172.99, 259.32, 172.13, 262.78, 172.13);
generalPath.curveTo(270.49, 172.13, 276.52, 176.52, 276.81, 181.70001);
generalPath.curveTo(276.84, 182.01001, 276.86, 182.31001, 276.86, 182.62001);
generalPath.curveTo(276.86, 185.38, 275.59, 187.88, 273.59, 189.61002);
generalPath.lineTo(274.69998, 191.42001);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(274.61, 191.46);
generalPath.curveTo(277.24, 189.49, 278.87997, 186.82, 278.87997, 183.88);
generalPath.curveTo(278.87997, 180.5, 276.65997, 177.48001, 273.3, 175.47);
generalPath.curveTo(275.37, 177.14, 276.62997, 179.3, 276.81, 181.7);
generalPath.curveTo(276.84, 182.01, 276.86, 182.31, 276.86, 182.62);
generalPath.curveTo(276.86, 185.37999, 275.59, 187.87999, 273.59, 189.61);
generalPath.lineTo(274.61, 191.46);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(274.61, 191.46);
generalPath.curveTo(277.24, 189.49, 278.87997, 186.82, 278.87997, 183.88);
generalPath.curveTo(278.87997, 180.5, 276.65997, 177.48001, 273.3, 175.47);
generalPath.curveTo(275.37, 177.14, 276.62997, 179.3, 276.81, 181.7);
generalPath.curveTo(276.84, 182.01, 276.86, 182.31, 276.86, 182.62);
generalPath.curveTo(276.86, 185.37999, 275.59, 187.87999, 273.59, 189.61);
generalPath.lineTo(274.61, 191.46);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(297.83, 194.89);
generalPath.curveTo(299.3, 193.24, 300.21, 191.1, 300.21, 188.77);
generalPath.curveTo(300.21, 187.36, 299.88, 186.02, 299.3, 184.82);
generalPath.curveTo(297.15997, 180.44, 290.47998, 177.25, 282.53998, 177.25);
generalPath.curveTo(280.37997, 177.25, 278.30997, 177.48, 276.38998, 177.92);
generalPath.curveTo(276.81998, 178.38, 277.15, 178.89, 277.47998, 179.4);
generalPath.curveTo(279.05997, 179.09, 280.77, 178.92, 282.53998, 178.92);
generalPath.curveTo(289.80997, 178.92, 295.88998, 181.75, 297.64996, 185.56999);
generalPath.curveTo(298.11996, 186.54, 298.37997, 187.62999, 298.37997, 188.76999);
generalPath.curveTo(298.37997, 191.09, 297.28998, 193.16998, 295.58997, 194.59);
generalPath.lineTo(298.21997, 198.89);
generalPath.lineTo(299.63998, 197.77);
generalPath.lineTo(297.83, 194.89);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(297.83, 194.89);
generalPath.curveTo(299.3, 193.24, 300.21, 191.1, 300.21, 188.77);
generalPath.curveTo(300.21, 187.36, 299.88, 186.02, 299.3, 184.82);
generalPath.curveTo(297.15997, 180.44, 290.47998, 177.25, 282.53998, 177.25);
generalPath.curveTo(280.37997, 177.25, 278.30997, 177.48, 276.38998, 177.92);
generalPath.curveTo(276.81998, 178.38, 277.15, 178.89, 277.47998, 179.4);
generalPath.curveTo(279.05997, 179.09, 280.77, 178.92, 282.53998, 178.92);
generalPath.curveTo(289.80997, 178.92, 295.88998, 181.75, 297.64996, 185.56999);
generalPath.curveTo(298.11996, 186.54, 298.37997, 187.62999, 298.37997, 188.76999);
generalPath.curveTo(298.37997, 191.09, 297.28998, 193.16998, 295.58997, 194.59);
generalPath.lineTo(298.21997, 198.89);
generalPath.lineTo(299.63998, 197.77);
generalPath.lineTo(297.83, 194.89);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(295.14, 180.48);
generalPath.curveTo(297.05002, 181.69, 298.5, 183.17, 299.30002, 184.81999);
generalPath.curveTo(299.88, 186.01999, 300.21002, 187.35999, 300.21002, 188.76999);
generalPath.curveTo(300.21002, 191.09999, 299.30002, 193.23999, 297.83002, 194.88998);
generalPath.lineTo(299.43002, 197.47998);
generalPath.curveTo(300.96002, 195.51997, 301.84003, 193.21999, 301.84003, 190.77998);
generalPath.curveTo(301.84003, 186.57999, 299.17, 182.90999, 295.14, 180.47998);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(295.14, 180.48);
generalPath.curveTo(297.05002, 181.69, 298.5, 183.17, 299.30002, 184.81999);
generalPath.curveTo(299.88, 186.01999, 300.21002, 187.35999, 300.21002, 188.76999);
generalPath.curveTo(300.21002, 191.09999, 299.30002, 193.23999, 297.83002, 194.88998);
generalPath.lineTo(299.43002, 197.47998);
generalPath.curveTo(300.96002, 195.51997, 301.84003, 193.21999, 301.84003, 190.77998);
generalPath.curveTo(301.84003, 186.57999, 299.17, 182.90999, 295.14, 180.47998);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1_10
shape = new Ellipse2D.Double(245.62001037597656, 163.10000610351562, 8.859999656677246, 8.399999618530273);
paint = new Color(0, 91, 191, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(245.62001037597656, 163.10000610351562, 8.859999656677246, 8.399999618530273);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);

}

private void _paint7(Graphics2D g,float origAlpha) {
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_1_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(248.89, 155.54);
generalPath.lineTo(248.89, 157.79999);
generalPath.lineTo(246.47, 157.79999);
generalPath.lineTo(246.47, 160.09999);
generalPath.lineTo(248.89, 160.09999);
generalPath.lineTo(248.89, 163.24998);
generalPath.lineTo(248.89, 166.70999);
generalPath.lineTo(245.84, 166.70999);
generalPath.curveTo(245.81, 166.92, 245.62, 167.07999, 245.62, 167.29999);
generalPath.curveTo(245.62, 167.87999, 245.73999, 168.43999, 245.97, 168.93999);
generalPath.curveTo(245.97, 168.95999, 245.99, 168.95999, 246.0, 168.96999);
generalPath.lineTo(254.12, 168.96999);
generalPath.curveTo(254.12, 168.95999, 254.14, 168.95999, 254.15, 168.93999);
generalPath.curveTo(254.37, 168.43999, 254.5, 167.87999, 254.5, 167.29999);
generalPath.curveTo(254.5, 167.07999, 254.31, 166.91998, 254.28, 166.70999);
generalPath.lineTo(251.31999, 166.70999);
generalPath.lineTo(251.31999, 163.28);
generalPath.lineTo(251.31999, 160.1);
generalPath.lineTo(253.73999, 160.1);
generalPath.lineTo(253.73999, 157.8);
generalPath.lineTo(251.31999, 157.8);
generalPath.lineTo(251.31999, 155.54001);
generalPath.lineTo(248.89, 155.54001);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(248.89, 155.54);
generalPath.lineTo(248.89, 157.79999);
generalPath.lineTo(246.47, 157.79999);
generalPath.lineTo(246.47, 160.09999);
generalPath.lineTo(248.89, 160.09999);
generalPath.lineTo(248.89, 163.24998);
generalPath.lineTo(248.89, 166.70999);
generalPath.lineTo(245.84, 166.70999);
generalPath.curveTo(245.81, 166.92, 245.62, 167.07999, 245.62, 167.29999);
generalPath.curveTo(245.62, 167.87999, 245.73999, 168.43999, 245.97, 168.93999);
generalPath.curveTo(245.97, 168.95999, 245.99, 168.95999, 246.0, 168.96999);
generalPath.lineTo(254.12, 168.96999);
generalPath.curveTo(254.12, 168.95999, 254.14, 168.95999, 254.15, 168.93999);
generalPath.curveTo(254.37, 168.43999, 254.5, 167.87999, 254.5, 167.29999);
generalPath.curveTo(254.5, 167.07999, 254.31, 166.91998, 254.28, 166.70999);
generalPath.lineTo(251.31999, 166.70999);
generalPath.lineTo(251.31999, 163.28);
generalPath.lineTo(251.31999, 160.1);
generalPath.lineTo(253.73999, 160.1);
generalPath.lineTo(253.73999, 157.8);
generalPath.lineTo(251.31999, 157.8);
generalPath.lineTo(251.31999, 155.54001);
generalPath.lineTo(248.89, 155.54001);
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
// _0_2_1_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_0
shape = new Ellipse2D.Double(248.12998962402344, 187.13999938964844, 3.819999933242798, 3.5999999046325684);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(248.12998962402344, 187.13999938964844, 3.819999933242798, 3.5999999046325684);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_1
shape = new Ellipse2D.Double(248.12998962402344, 183.59999084472656, 3.819999933242798, 3.5999999046325684);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(248.12998962402344, 183.59999084472656, 3.819999933242798, 3.5999999046325684);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_2
shape = new Ellipse2D.Double(248.51998901367188, 180.16000366210938, 3.0399999618530273, 2.880000114440918);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(248.51998901367188, 180.16000366210938, 3.0399999618530273, 2.880000114440918);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_3
shape = new Ellipse2D.Double(248.9399871826172, 177.13999938964844, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(248.9399871826172, 177.13999938964844, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_4
shape = new Ellipse2D.Double(249.1599884033203, 174.34999084472656, 1.7599999904632568, 1.659999966621399);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(249.1599884033203, 174.34999084472656, 1.7599999904632568, 1.659999966621399);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_5
shape = new Ellipse2D.Double(197.83999633789062, 197.6300048828125, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(197.83999633789062, 197.6300048828125, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_6
shape = new Ellipse2D.Double(196.33999633789062, 194.98001098632812, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(196.33999633789062, 194.98001098632812, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_7
shape = new Ellipse2D.Double(195.33999633789062, 191.90000915527344, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(195.33999633789062, 191.90000915527344, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_8
shape = new Ellipse2D.Double(195.20999145507812, 188.60000610351562, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(195.20999145507812, 188.60000610351562, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_9
shape = new Ellipse2D.Double(196.01998901367188, 185.36000061035156, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(196.01998901367188, 185.36000061035156, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_10
shape = new Ellipse2D.Double(197.70999145507812, 182.41000366210938, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(197.70999145507812, 182.41000366210938, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_11
shape = new Ellipse2D.Double(199.95999145507812, 179.98001098632812, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(199.95999145507812, 179.98001098632812, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_12
shape = new Ellipse2D.Double(202.57998657226562, 177.97000122070312, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(202.57998657226562, 177.97000122070312, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_13
shape = new Ellipse2D.Double(205.6999969482422, 176.32000732421875, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(205.6999969482422, 176.32000732421875, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_14
shape = new Ellipse2D.Double(208.9399871826172, 175.15000915527344, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(208.9399871826172, 175.15000915527344, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_15
shape = new Ellipse2D.Double(212.55999755859375, 174.5, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(212.55999755859375, 174.5, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_16
shape = new Ellipse2D.Double(216.0, 174.32000732421875, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(216.0, 174.32000732421875, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_17
shape = new Ellipse2D.Double(219.3699951171875, 174.44000244140625, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(219.3699951171875, 174.44000244140625, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_18
shape = new Ellipse2D.Double(223.11000061035156, 189.28001403808594, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(223.11000061035156, 189.28001403808594, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_19
shape = new Ellipse2D.Double(221.239990234375, 186.61000061035156, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(221.239990234375, 186.61000061035156, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_20
shape = new Ellipse2D.Double(220.25, 183.7100067138672, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(220.25, 183.7100067138672, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_21
shape = new Ellipse2D.Double(220.3699951171875, 180.53001403808594, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(220.3699951171875, 180.53001403808594, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_22
shape = new Ellipse2D.Double(221.05999755859375, 177.3300018310547, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(221.05999755859375, 177.3300018310547, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_23
shape = new Ellipse2D.Double(222.739990234375, 174.44000244140625, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(222.739990234375, 174.44000244140625, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_24
shape = new Ellipse2D.Double(225.29998779296875, 172.4300079345703, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(225.29998779296875, 172.4300079345703, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_25
shape = new Ellipse2D.Double(228.2899932861328, 170.77000427246094, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(228.2899932861328, 170.77000427246094, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_26
shape = new Ellipse2D.Double(231.59999084472656, 169.78001403808594, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(231.59999084472656, 169.78001403808594, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_27
shape = new Ellipse2D.Double(235.02999877929688, 169.19000244140625, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(235.02999877929688, 169.19000244140625, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_28
shape = new Ellipse2D.Double(238.39999389648438, 169.24000549316406, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(238.39999389648438, 169.24000549316406, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_29
shape = new Ellipse2D.Double(241.88999938964844, 169.8300018310547, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(241.88999938964844, 169.8300018310547, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_30
shape = new Ellipse2D.Double(245.12998962402344, 170.95001220703125, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(245.12998962402344, 170.95001220703125, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_31
shape = new Ellipse2D.Double(252.6999969482422, 170.95001220703125, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(252.6999969482422, 170.95001220703125, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_32
shape = new Ellipse2D.Double(255.94000244140625, 169.8300018310547, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(255.94000244140625, 169.8300018310547, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_33
shape = new Ellipse2D.Double(259.44000244140625, 169.24000549316406, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(259.44000244140625, 169.24000549316406, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_34
shape = new Ellipse2D.Double(262.79998779296875, 169.19000244140625, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(262.79998779296875, 169.19000244140625, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_35
shape = new Ellipse2D.Double(266.239990234375, 169.78001403808594, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(266.239990234375, 169.78001403808594, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_36
shape = new Ellipse2D.Double(269.5400085449219, 170.77000427246094, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(269.5400085449219, 170.77000427246094, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_37
shape = new Ellipse2D.Double(272.5400085449219, 172.4300079345703, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(272.5400085449219, 172.4300079345703, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_38
shape = new Ellipse2D.Double(275.0899963378906, 174.44000244140625, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(275.0899963378906, 174.44000244140625, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_39
shape = new Ellipse2D.Double(276.7799987792969, 177.3300018310547, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(276.7799987792969, 177.3300018310547, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_40
shape = new Ellipse2D.Double(277.4700012207031, 180.53001403808594, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(277.4700012207031, 180.53001403808594, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_41
shape = new Ellipse2D.Double(277.5899963378906, 183.7100067138672, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(277.5899963378906, 183.7100067138672, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_42
shape = new Ellipse2D.Double(276.5899963378906, 186.61000061035156, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(276.5899963378906, 186.61000061035156, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_43
shape = new Ellipse2D.Double(274.72998046875, 189.28001403808594, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(274.72998046875, 189.28001403808594, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_44
shape = new Ellipse2D.Double(278.4700012207031, 174.44000244140625, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(278.4700012207031, 174.44000244140625, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_45
shape = new Ellipse2D.Double(281.8399963378906, 174.32000732421875, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(281.8399963378906, 174.32000732421875, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_46
shape = new Ellipse2D.Double(285.2799987792969, 174.5, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(285.2799987792969, 174.5, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_47
shape = new Ellipse2D.Double(288.8999938964844, 175.15000915527344, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(288.8999938964844, 175.15000915527344, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_48
shape = new Ellipse2D.Double(292.1399841308594, 176.32000732421875, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(292.1399841308594, 176.32000732421875, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_49
shape = new Ellipse2D.Double(295.2599792480469, 177.97000122070312, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(295.2599792480469, 177.97000122070312, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_50
shape = new Ellipse2D.Double(297.8699951171875, 179.98001098632812, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(297.8699951171875, 179.98001098632812, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_51
shape = new Ellipse2D.Double(300.1199951171875, 182.41000366210938, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(300.1199951171875, 182.41000366210938, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_52
shape = new Ellipse2D.Double(301.80999755859375, 185.36000061035156, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(301.80999755859375, 185.36000061035156, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_53
shape = new Ellipse2D.Double(302.6199951171875, 188.60000610351562, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(302.6199951171875, 188.60000610351562, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_54
shape = new Ellipse2D.Double(302.5, 191.90000915527344, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(302.5, 191.90000915527344, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_55
shape = new Ellipse2D.Double(301.5, 194.98001098632812, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(301.5, 194.98001098632812, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_2_56
shape = new Ellipse2D.Double(300.0, 197.6300048828125, 2.200000047683716, 2.0799999237060547);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(300.0, 197.6300048828125, 2.200000047683716, 2.0799999237060547);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.15, 226.18);
generalPath.curveTo(237.89, 226.15999, 226.9, 224.70999, 219.06, 222.34999);
generalPath.curveTo(218.48999, 222.17, 218.19, 221.65, 218.22, 221.09999);
generalPath.curveTo(218.21, 220.57999, 218.51, 220.09999, 219.06, 219.93);
generalPath.curveTo(226.9, 217.56999, 237.89, 216.12, 250.15, 216.09999);
generalPath.curveTo(262.41998, 216.12, 273.4, 217.56999, 281.24, 219.93);
generalPath.curveTo(281.78998, 220.09999, 282.08, 220.57999, 282.06998, 221.09999);
generalPath.curveTo(282.09998, 221.65, 281.8, 222.17, 281.24, 222.34999);
generalPath.curveTo(273.4, 224.70999, 262.41998, 226.15999, 250.15, 226.18);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.15, 226.18);
generalPath.curveTo(237.89, 226.15999, 226.9, 224.70999, 219.06, 222.34999);
generalPath.curveTo(218.48999, 222.17, 218.19, 221.65, 218.22, 221.09999);
generalPath.curveTo(218.21, 220.57999, 218.51, 220.09999, 219.06, 219.93);
generalPath.curveTo(226.9, 217.56999, 237.89, 216.12, 250.15, 216.09999);
generalPath.curveTo(262.41998, 216.12, 273.4, 217.56999, 281.24, 219.93);
generalPath.curveTo(281.78998, 220.09999, 282.08, 220.57999, 282.06998, 221.09999);
generalPath.curveTo(282.09998, 221.65, 281.8, 222.17, 281.24, 222.34999);
generalPath.curveTo(273.4, 224.70999, 262.41998, 226.15999, 250.15, 226.18);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.07, 216.09);
generalPath.curveTo(237.66, 216.12, 226.52, 217.67, 218.68001, 220.09);
generalPath.curveTo(219.33, 219.78, 219.27, 218.97, 218.46, 216.89);
generalPath.curveTo(217.48001, 214.36, 215.96, 214.47, 215.96, 214.47);
generalPath.curveTo(224.62001, 211.91, 236.69, 210.31, 250.12001, 210.29001);
generalPath.curveTo(263.56, 210.31001, 275.72, 211.91, 284.39, 214.47);
generalPath.curveTo(284.39, 214.47, 282.86002, 214.36, 281.88, 216.89);
generalPath.curveTo(281.07, 218.97, 281.01, 219.78, 281.67, 220.09);
generalPath.curveTo(273.83002, 217.67, 262.48, 216.12, 250.07, 216.09);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}

}

private void _paint8(Graphics2D g,float origAlpha) {
generalPath.moveTo(250.07, 216.09);
generalPath.curveTo(237.66, 216.12, 226.52, 217.67, 218.68001, 220.09);
generalPath.curveTo(219.33, 219.78, 219.27, 218.97, 218.46, 216.89);
generalPath.curveTo(217.48001, 214.36, 215.96, 214.47, 215.96, 214.47);
generalPath.curveTo(224.62001, 211.91, 236.69, 210.31, 250.12001, 210.29001);
generalPath.curveTo(263.56, 210.31001, 275.72, 211.91, 284.39, 214.47);
generalPath.curveTo(284.39, 214.47, 282.86002, 214.36, 281.88, 216.89);
generalPath.curveTo(281.07, 218.97, 281.01, 219.78, 281.67, 220.09);
generalPath.curveTo(273.83002, 217.67, 262.48, 216.12, 250.07, 216.09);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.12, 210.3);
generalPath.curveTo(236.69, 210.32, 224.62, 211.92, 215.95999, 214.48);
generalPath.curveTo(215.37999, 214.65, 214.76999, 214.43, 214.57999, 213.87999);
generalPath.curveTo(214.38998, 213.32999, 214.69998, 212.7, 215.27998, 212.52998);
generalPath.curveTo(223.98999, 209.85999, 236.35999, 208.17998, 250.11998, 208.14998);
generalPath.curveTo(263.88998, 208.17998, 276.30997, 209.85999, 285.02, 212.52998);
generalPath.curveTo(285.59998, 212.69998, 285.91, 213.32999, 285.72, 213.87999);
generalPath.curveTo(285.53, 214.43, 284.92, 214.65, 284.34, 214.48);
generalPath.curveTo(275.66998, 211.92, 263.56, 210.31999, 250.12, 210.3);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.12, 210.3);
generalPath.curveTo(236.69, 210.32, 224.62, 211.92, 215.95999, 214.48);
generalPath.curveTo(215.37999, 214.65, 214.76999, 214.43, 214.57999, 213.87999);
generalPath.curveTo(214.38998, 213.32999, 214.69998, 212.7, 215.27998, 212.52998);
generalPath.curveTo(223.98999, 209.85999, 236.35999, 208.17998, 250.11998, 208.14998);
generalPath.curveTo(263.88998, 208.17998, 276.30997, 209.85999, 285.02, 212.52998);
generalPath.curveTo(285.59998, 212.69998, 285.91, 213.32999, 285.72, 213.87999);
generalPath.curveTo(285.53, 214.43, 284.92, 214.65, 284.34, 214.48);
generalPath.curveTo(275.66998, 211.92, 263.56, 210.31999, 250.12, 210.3);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.2, 199.78);
generalPath.lineTo(251.43, 200.0);
generalPath.curveTo(251.23999, 200.5, 251.18999, 201.05, 251.18999, 201.63);
generalPath.curveTo(251.18999, 204.20001, 253.4, 206.28, 256.11, 206.28);
generalPath.curveTo(258.28998, 206.28, 260.15, 204.93, 260.78, 203.06999);
generalPath.curveTo(260.86, 203.12, 261.25, 201.39, 261.46, 201.40999);
generalPath.curveTo(261.63, 201.43, 261.61, 203.20999, 261.68, 203.18);
generalPath.curveTo(261.99, 205.51999, 264.13998, 207.10999, 266.55, 207.10999);
generalPath.curveTo(269.25998, 207.10999, 271.46, 205.02998, 271.46, 202.45999);
generalPath.curveTo(271.46, 202.26999, 271.44998, 202.07999, 271.41998, 201.88998);
generalPath.lineTo(272.96, 200.36998);
generalPath.lineTo(273.78998, 202.30998);
generalPath.curveTo(273.46, 202.91998, 273.33, 203.60999, 273.33, 204.33998);
generalPath.curveTo(273.33, 206.79999, 275.43, 208.77998, 278.02, 208.77998);
generalPath.curveTo(279.65, 208.77998, 281.08, 207.99998, 281.91998, 206.80998);
generalPath.lineTo(282.90997, 205.55998);
generalPath.lineTo(282.89996, 207.08998);
generalPath.curveTo(282.89996, 208.63998, 283.55997, 210.01997, 285.05997, 210.26997);
generalPath.curveTo(285.05997, 210.26997, 286.78998, 210.36998, 289.08997, 208.56998);
generalPath.curveTo(291.37997, 206.76997, 292.63995, 205.27998, 292.63995, 205.27998);
generalPath.lineTo(292.83997, 207.07999);
generalPath.curveTo(292.83997, 207.07999, 290.93997, 210.02998, 288.86996, 211.22998);
generalPath.curveTo(287.72995, 211.88998, 286.00998, 212.57999, 284.63995, 212.35999);
generalPath.curveTo(283.19995, 212.11998, 282.15994, 210.95999, 281.62994, 209.61998);
generalPath.curveTo(280.59995, 210.22998, 279.37994, 210.58998, 278.07996, 210.58998);
generalPath.curveTo(275.26996, 210.58998, 272.74997, 209.04999, 271.75995, 206.72998);
generalPath.curveTo(270.46994, 208.12997, 268.66995, 208.97998, 266.55994, 208.97998);
generalPath.curveTo(264.31995, 208.97998, 262.26993, 207.96999, 260.98993, 206.41998);
generalPath.curveTo(259.71994, 207.57999, 258.00992, 208.28998, 256.10992, 208.28998);
generalPath.curveTo(253.62993, 208.28998, 251.41992, 207.06998, 250.16992, 205.23997);
generalPath.curveTo(248.91992, 207.06998, 246.70992, 208.28998, 244.22992, 208.28998);
generalPath.curveTo(242.33992, 208.28998, 240.61992, 207.57997, 239.35992, 206.41998);
generalPath.curveTo(238.07993, 207.96999, 236.01993, 208.97998, 233.77992, 208.97998);
generalPath.curveTo(231.66992, 208.97998, 229.87993, 208.12997, 228.58992, 206.72998);
generalPath.curveTo(227.58992, 209.04999, 225.06992, 210.58998, 222.26991, 210.58998);
generalPath.curveTo(220.95992, 210.58998, 219.74991, 210.22998, 218.71991, 209.61998);
generalPath.curveTo(218.17992, 210.95998, 217.1499, 212.11998, 215.6999, 212.35999);
generalPath.curveTo(214.3399, 212.57999, 212.6199, 211.88998, 211.4799, 211.22998);
generalPath.curveTo(209.3999, 210.02998, 207.49991, 207.07999, 207.49991, 207.07999);
generalPath.lineTo(207.6999, 205.27998);
generalPath.curveTo(207.6999, 205.27998, 208.96991, 206.76999, 211.2599, 208.56998);
generalPath.curveTo(213.5499, 210.37997, 215.2799, 210.26997, 215.2799, 210.26997);
generalPath.curveTo(216.7899, 210.01997, 217.43991, 208.63997, 217.43991, 207.08998);
generalPath.lineTo(217.42992, 205.55998);
generalPath.lineTo(218.41992, 206.80998);
generalPath.curveTo(219.25992, 207.99998, 220.69992, 208.77998, 222.31992, 208.77998);
generalPath.curveTo(224.90991, 208.77998, 227.00992, 206.79999, 227.00992, 204.33998);
generalPath.curveTo(227.00992, 203.60999, 226.87991, 202.91998, 226.54991, 202.30998);
generalPath.lineTo(227.37991, 200.36998);
generalPath.lineTo(228.9199, 201.88998);
generalPath.curveTo(228.8999, 202.07999, 228.87991, 202.26999, 228.87991, 202.45999);
generalPath.curveTo(228.87991, 205.03, 231.07991, 207.10999, 233.78992, 207.10999);
generalPath.curveTo(236.20992, 207.10999, 238.34991, 205.51999, 238.66992, 203.18);
generalPath.curveTo(238.72992, 203.20999, 238.71992, 201.43, 238.88992, 201.40999);
generalPath.curveTo(239.08992, 201.38998, 239.48993, 203.12, 239.55992, 203.06999);
generalPath.curveTo(240.19992, 204.93, 242.04993, 206.28, 244.23991, 206.28);
generalPath.curveTo(246.94992, 206.28, 249.14992, 204.2, 249.14992, 201.63);
generalPath.curveTo(249.14992, 201.05, 249.11992, 200.5, 248.90991, 200.0);
generalPath.lineTo(250.1999, 199.78);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.2, 199.78);
generalPath.lineTo(251.43, 200.0);
generalPath.curveTo(251.23999, 200.5, 251.18999, 201.05, 251.18999, 201.63);
generalPath.curveTo(251.18999, 204.20001, 253.4, 206.28, 256.11, 206.28);
generalPath.curveTo(258.28998, 206.28, 260.15, 204.93, 260.78, 203.06999);
generalPath.curveTo(260.86, 203.12, 261.25, 201.39, 261.46, 201.40999);
generalPath.curveTo(261.63, 201.43, 261.61, 203.20999, 261.68, 203.18);
generalPath.curveTo(261.99, 205.51999, 264.13998, 207.10999, 266.55, 207.10999);
generalPath.curveTo(269.25998, 207.10999, 271.46, 205.02998, 271.46, 202.45999);
generalPath.curveTo(271.46, 202.26999, 271.44998, 202.07999, 271.41998, 201.88998);
generalPath.lineTo(272.96, 200.36998);
generalPath.lineTo(273.78998, 202.30998);
generalPath.curveTo(273.46, 202.91998, 273.33, 203.60999, 273.33, 204.33998);
generalPath.curveTo(273.33, 206.79999, 275.43, 208.77998, 278.02, 208.77998);
generalPath.curveTo(279.65, 208.77998, 281.08, 207.99998, 281.91998, 206.80998);
generalPath.lineTo(282.90997, 205.55998);
generalPath.lineTo(282.89996, 207.08998);
generalPath.curveTo(282.89996, 208.63998, 283.55997, 210.01997, 285.05997, 210.26997);
generalPath.curveTo(285.05997, 210.26997, 286.78998, 210.36998, 289.08997, 208.56998);
generalPath.curveTo(291.37997, 206.76997, 292.63995, 205.27998, 292.63995, 205.27998);
generalPath.lineTo(292.83997, 207.07999);
generalPath.curveTo(292.83997, 207.07999, 290.93997, 210.02998, 288.86996, 211.22998);
generalPath.curveTo(287.72995, 211.88998, 286.00998, 212.57999, 284.63995, 212.35999);
generalPath.curveTo(283.19995, 212.11998, 282.15994, 210.95999, 281.62994, 209.61998);
generalPath.curveTo(280.59995, 210.22998, 279.37994, 210.58998, 278.07996, 210.58998);
generalPath.curveTo(275.26996, 210.58998, 272.74997, 209.04999, 271.75995, 206.72998);
generalPath.curveTo(270.46994, 208.12997, 268.66995, 208.97998, 266.55994, 208.97998);
generalPath.curveTo(264.31995, 208.97998, 262.26993, 207.96999, 260.98993, 206.41998);
generalPath.curveTo(259.71994, 207.57999, 258.00992, 208.28998, 256.10992, 208.28998);
generalPath.curveTo(253.62993, 208.28998, 251.41992, 207.06998, 250.16992, 205.23997);
generalPath.curveTo(248.91992, 207.06998, 246.70992, 208.28998, 244.22992, 208.28998);
generalPath.curveTo(242.33992, 208.28998, 240.61992, 207.57997, 239.35992, 206.41998);
generalPath.curveTo(238.07993, 207.96999, 236.01993, 208.97998, 233.77992, 208.97998);
generalPath.curveTo(231.66992, 208.97998, 229.87993, 208.12997, 228.58992, 206.72998);
generalPath.curveTo(227.58992, 209.04999, 225.06992, 210.58998, 222.26991, 210.58998);
generalPath.curveTo(220.95992, 210.58998, 219.74991, 210.22998, 218.71991, 209.61998);
generalPath.curveTo(218.17992, 210.95998, 217.1499, 212.11998, 215.6999, 212.35999);
generalPath.curveTo(214.3399, 212.57999, 212.6199, 211.88998, 211.4799, 211.22998);
generalPath.curveTo(209.3999, 210.02998, 207.49991, 207.07999, 207.49991, 207.07999);
generalPath.lineTo(207.6999, 205.27998);
generalPath.curveTo(207.6999, 205.27998, 208.96991, 206.76999, 211.2599, 208.56998);
generalPath.curveTo(213.5499, 210.37997, 215.2799, 210.26997, 215.2799, 210.26997);
generalPath.curveTo(216.7899, 210.01997, 217.43991, 208.63997, 217.43991, 207.08998);
generalPath.lineTo(217.42992, 205.55998);
generalPath.lineTo(218.41992, 206.80998);
generalPath.curveTo(219.25992, 207.99998, 220.69992, 208.77998, 222.31992, 208.77998);
generalPath.curveTo(224.90991, 208.77998, 227.00992, 206.79999, 227.00992, 204.33998);
generalPath.curveTo(227.00992, 203.60999, 226.87991, 202.91998, 226.54991, 202.30998);
generalPath.lineTo(227.37991, 200.36998);
generalPath.lineTo(228.9199, 201.88998);
generalPath.curveTo(228.8999, 202.07999, 228.87991, 202.26999, 228.87991, 202.45999);
generalPath.curveTo(228.87991, 205.03, 231.07991, 207.10999, 233.78992, 207.10999);
generalPath.curveTo(236.20992, 207.10999, 238.34991, 205.51999, 238.66992, 203.18);
generalPath.curveTo(238.72992, 203.20999, 238.71992, 201.43, 238.88992, 201.40999);
generalPath.curveTo(239.08992, 201.38998, 239.48993, 203.12, 239.55992, 203.06999);
generalPath.curveTo(240.19992, 204.93, 242.04993, 206.28, 244.23991, 206.28);
generalPath.curveTo(246.94992, 206.28, 249.14992, 204.2, 249.14992, 201.63);
generalPath.curveTo(249.14992, 201.05, 249.11992, 200.5, 248.90991, 200.0);
generalPath.lineTo(250.1999, 199.78);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(208.37, 206.32);
generalPath.curveTo(208.26, 205.95001, 208.01999, 205.57, 207.65, 205.26001);
generalPath.curveTo(206.86, 204.58002, 205.81, 204.47002, 205.29, 205.01001);
generalPath.curveTo(205.21999, 205.08002, 205.15999, 205.18001, 205.12, 205.26001);
generalPath.curveTo(205.12, 205.26001, 204.01, 203.18001, 202.70999, 202.48001);
generalPath.curveTo(201.42, 201.78001, 199.21999, 201.96, 199.21999, 201.96);
generalPath.curveTo(199.21999, 200.36, 200.51999, 199.07, 202.20999, 199.07);
generalPath.curveTo(203.2, 199.07, 204.12999, 199.48001, 204.68999, 200.18001);
generalPath.lineTo(204.91998, 199.11);
generalPath.curveTo(204.91998, 199.11, 206.27998, 199.38, 206.89998, 200.93001);
generalPath.curveTo(207.51997, 202.48001, 206.83998, 204.73001, 206.83998, 204.73001);
generalPath.curveTo(206.83998, 204.73001, 207.17998, 203.77, 207.68999, 203.12001);
generalPath.curveTo(208.19998, 202.48001, 209.49998, 201.78001, 210.18, 201.46);
generalPath.curveTo(210.84999, 201.15001, 211.54999, 200.67001, 211.54999, 200.67001);
generalPath.curveTo(211.54999, 200.67001, 211.57999, 200.85, 211.59999, 201.28001);
generalPath.curveTo(211.62999, 201.79001, 211.59, 202.11002, 211.59, 202.11002);
generalPath.curveTo(212.83, 201.94002, 214.28, 202.15001, 215.42, 202.59001);
generalPath.curveTo(214.93, 203.54001, 214.01, 204.43001, 212.8, 204.89001);
generalPath.curveTo(212.8, 204.89001, 213.24, 205.25002, 213.63, 205.64001);
generalPath.curveTo(213.97, 205.98001, 214.07, 206.13002, 214.07, 206.13002);
generalPath.curveTo(214.07, 206.13002, 213.22, 206.26003, 212.8, 206.32002);
generalPath.curveTo(212.37001, 206.37003, 210.96, 206.60002, 210.11, 206.54002);
generalPath.curveTo(209.49, 206.50003, 208.79, 206.40002, 208.37, 206.32002);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(208.37, 206.32);
generalPath.curveTo(208.26, 205.95001, 208.01999, 205.57, 207.65, 205.26001);
generalPath.curveTo(206.86, 204.58002, 205.81, 204.47002, 205.29, 205.01001);
generalPath.curveTo(205.21999, 205.08002, 205.15999, 205.18001, 205.12, 205.26001);
generalPath.curveTo(205.12, 205.26001, 204.01, 203.18001, 202.70999, 202.48001);
generalPath.curveTo(201.42, 201.78001, 199.21999, 201.96, 199.21999, 201.96);
generalPath.curveTo(199.21999, 200.36, 200.51999, 199.07, 202.20999, 199.07);
generalPath.curveTo(203.2, 199.07, 204.12999, 199.48001, 204.68999, 200.18001);
generalPath.lineTo(204.91998, 199.11);
generalPath.curveTo(204.91998, 199.11, 206.27998, 199.38, 206.89998, 200.93001);
generalPath.curveTo(207.51997, 202.48001, 206.83998, 204.73001, 206.83998, 204.73001);
generalPath.curveTo(206.83998, 204.73001, 207.17998, 203.77, 207.68999, 203.12001);
generalPath.curveTo(208.19998, 202.48001, 209.49998, 201.78001, 210.18, 201.46);
generalPath.curveTo(210.84999, 201.15001, 211.54999, 200.67001, 211.54999, 200.67001);
generalPath.curveTo(211.54999, 200.67001, 211.57999, 200.85, 211.59999, 201.28001);
generalPath.curveTo(211.62999, 201.79001, 211.59, 202.11002, 211.59, 202.11002);
generalPath.curveTo(212.83, 201.94002, 214.28, 202.15001, 215.42, 202.59001);
generalPath.curveTo(214.93, 203.54001, 214.01, 204.43001, 212.8, 204.89001);
generalPath.curveTo(212.8, 204.89001, 213.24, 205.25002, 213.63, 205.64001);
generalPath.curveTo(213.97, 205.98001, 214.07, 206.13002, 214.07, 206.13002);
generalPath.curveTo(214.07, 206.13002, 213.22, 206.26003, 212.8, 206.32002);
generalPath.curveTo(212.37001, 206.37003, 210.96, 206.60002, 210.11, 206.54002);
generalPath.curveTo(209.49, 206.50003, 208.79, 206.40002, 208.37, 206.32002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(205.29, 205.01);
generalPath.curveTo(205.81, 204.47, 206.86, 204.58, 207.65, 205.26);
generalPath.curveTo(208.45, 205.93, 208.67, 206.92, 208.15999, 207.45);
generalPath.curveTo(207.65, 207.98999, 206.58998, 207.87, 205.79999, 207.2);
generalPath.curveTo(205.01, 206.52, 204.77998, 205.54, 205.29, 205.01);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(205.29, 205.01);
generalPath.curveTo(205.81, 204.47, 206.86, 204.58, 207.65, 205.26);
generalPath.curveTo(208.45, 205.93, 208.67, 206.92, 208.15999, 207.45);
generalPath.curveTo(207.65, 207.98999, 206.58998, 207.87, 205.79999, 207.2);
generalPath.curveTo(205.01, 206.52, 204.77998, 205.54, 205.29, 205.01);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(216.39, 205.91);
generalPath.curveTo(216.11, 205.08, 216.36, 204.26001, 216.96, 204.08);
generalPath.curveTo(217.56001, 203.89, 218.28001, 204.41, 218.56001, 205.24);
generalPath.curveTo(218.84001, 206.07, 218.59001, 206.89, 217.99, 207.08);
generalPath.curveTo(217.39, 207.26, 216.68001, 206.74, 216.39, 205.91);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(216.39, 205.91);
generalPath.curveTo(216.11, 205.08, 216.36, 204.26001, 216.96, 204.08);
generalPath.curveTo(217.56001, 203.89, 218.28001, 204.41, 218.56001, 205.24);
generalPath.curveTo(218.84001, 206.07, 218.59001, 206.89, 217.99, 207.08);
generalPath.curveTo(217.39, 207.26, 216.68001, 206.74, 216.39, 205.91);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(226.12, 201.86);
generalPath.curveTo(225.79, 201.59, 225.53, 201.22, 225.45, 200.78);
generalPath.curveTo(225.37, 200.34, 225.45999, 199.91, 225.68, 199.55);
generalPath.curveTo(225.68, 199.55, 224.79999, 199.11, 223.84999, 198.86);
generalPath.curveTo(223.12999, 198.67, 221.85999, 198.66, 221.48, 198.66);
generalPath.curveTo(221.09999, 198.64, 220.33, 198.63, 220.33, 198.63);
generalPath.curveTo(220.33, 198.63, 220.40001, 198.8, 220.61, 199.18001);
generalPath.curveTo(220.88, 199.64001, 221.11, 199.93001, 221.11, 199.93001);
generalPath.curveTo(219.84, 200.22, 218.76, 201.05, 218.08, 202.02);
generalPath.curveTo(219.07, 202.7, 220.38, 203.12001, 221.68001, 202.99);
generalPath.curveTo(221.68001, 202.99, 221.56001, 203.33, 221.48001, 203.85);
generalPath.curveTo(221.42001, 204.28, 221.42001, 204.46, 221.42001, 204.46);
generalPath.curveTo(221.42001, 204.46, 222.13002, 204.20001, 222.49002, 204.07);
generalPath.curveTo(222.84003, 203.94, 224.03001, 203.52, 224.64001, 203.11);
generalPath.curveTo(225.44002, 202.57, 226.12001, 201.86, 226.12001, 201.86);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(226.12, 201.86);
generalPath.curveTo(225.79, 201.59, 225.53, 201.22, 225.45, 200.78);
generalPath.curveTo(225.37, 200.34, 225.45999, 199.91, 225.68, 199.55);
generalPath.curveTo(225.68, 199.55, 224.79999, 199.11, 223.84999, 198.86);
generalPath.curveTo(223.12999, 198.67, 221.85999, 198.66, 221.48, 198.66);
generalPath.curveTo(221.09999, 198.64, 220.33, 198.63, 220.33, 198.63);
generalPath.curveTo(220.33, 198.63, 220.40001, 198.8, 220.61, 199.18001);
generalPath.curveTo(220.88, 199.64001, 221.11, 199.93001, 221.11, 199.93001);
generalPath.curveTo(219.84, 200.22, 218.76, 201.05, 218.08, 202.02);
generalPath.curveTo(219.07, 202.7, 220.38, 203.12001, 221.68001, 202.99);
generalPath.curveTo(221.68001, 202.99, 221.56001, 203.33, 221.48001, 203.85);
generalPath.curveTo(221.42001, 204.28, 221.42001, 204.46, 221.42001, 204.46);
generalPath.curveTo(221.42001, 204.46, 222.13002, 204.20001, 222.49002, 204.07);
generalPath.curveTo(222.84003, 203.94, 224.03001, 203.52, 224.64001, 203.11);
generalPath.curveTo(225.44002, 202.57, 226.12001, 201.86, 226.12001, 201.86);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(225.68, 191.65);
generalPath.curveTo(226.73999, 192.31999, 227.65999, 193.43999, 227.98, 194.68);
generalPath.curveTo(227.98, 194.68, 228.11, 194.43, 228.69, 194.09);
generalPath.curveTo(229.28, 193.76, 229.78, 193.76999, 229.78, 193.76999);
generalPath.curveTo(229.78, 193.76999, 229.61, 194.73999, 229.53, 195.09);
generalPath.curveTo(229.44, 195.43, 229.44, 196.47, 229.20999, 197.41);
generalPath.curveTo(228.98, 198.34, 228.57999, 199.09, 228.57999, 199.09);
generalPath.curveTo(228.15999, 198.75, 227.58998, 198.58, 226.99998, 198.68);
generalPath.curveTo(226.41998, 198.78, 225.93999, 199.12, 225.67998, 199.57999);
generalPath.curveTo(225.67998, 199.57999, 225.01997, 198.99998, 224.46997, 198.19998);
generalPath.curveTo(223.91997, 197.38998, 223.53998, 196.41998, 223.33997, 196.11998);
generalPath.curveTo(223.12996, 195.81998, 222.61996, 194.96999, 222.61996, 194.96999);
generalPath.curveTo(222.61996, 194.96999, 223.08997, 194.79, 223.75996, 194.91998);
generalPath.curveTo(224.42996, 195.03998, 224.63997, 195.23999, 224.63997, 195.23999);
generalPath.curveTo(224.49997, 193.95999, 224.91997, 192.62, 225.67996, 191.65);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(225.68, 191.65);
generalPath.curveTo(226.73999, 192.31999, 227.65999, 193.43999, 227.98, 194.68);
generalPath.curveTo(227.98, 194.68, 228.11, 194.43, 228.69, 194.09);
generalPath.curveTo(229.28, 193.76, 229.78, 193.76999, 229.78, 193.76999);
generalPath.curveTo(229.78, 193.76999, 229.61, 194.73999, 229.53, 195.09);
generalPath.curveTo(229.44, 195.43, 229.44, 196.47, 229.20999, 197.41);
generalPath.curveTo(228.98, 198.34, 228.57999, 199.09, 228.57999, 199.09);
generalPath.curveTo(228.15999, 198.75, 227.58998, 198.58, 226.99998, 198.68);
generalPath.curveTo(226.41998, 198.78, 225.93999, 199.12, 225.67998, 199.57999);
generalPath.curveTo(225.67998, 199.57999, 225.01997, 198.99998, 224.46997, 198.19998);
generalPath.curveTo(223.91997, 197.38998, 223.53998, 196.41998, 223.33997, 196.11998);
generalPath.curveTo(223.12996, 195.81998, 222.61996, 194.96999, 222.61996, 194.96999);
generalPath.curveTo(222.61996, 194.96999, 223.08997, 194.79, 223.75996, 194.91998);
generalPath.curveTo(224.42996, 195.03998, 224.63997, 195.23999, 224.63997, 195.23999);
generalPath.curveTo(224.49997, 193.95999, 224.91997, 192.62, 225.67996, 191.65);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(228.97, 201.38);
generalPath.curveTo(229.19, 201.03, 229.29001, 200.59001, 229.21, 200.15001);
generalPath.curveTo(229.13, 199.71, 228.89, 199.34001, 228.55, 199.08);
generalPath.curveTo(228.55, 199.08, 229.22, 198.37, 230.02, 197.82);
generalPath.curveTo(230.62001, 197.41, 231.82, 197.0, 232.17, 196.87001);
generalPath.curveTo(232.53, 196.74, 233.24, 196.47002, 233.24, 196.47002);
generalPath.curveTo(233.24, 196.47002, 233.24, 196.65001, 233.18001, 197.08002);
generalPath.curveTo(233.1, 197.60002, 232.98001, 197.95001, 232.98001, 197.95001);
generalPath.curveTo(234.28001, 197.81001, 235.6, 198.24, 236.59001, 198.93001);
generalPath.curveTo(235.90001, 199.90001, 234.82, 200.72, 233.55002, 201.01001);
generalPath.curveTo(233.55002, 201.01001, 233.78001, 201.29001, 234.05002, 201.75002);
generalPath.curveTo(234.26003, 202.14001, 234.33002, 202.31001, 234.33002, 202.31001);
generalPath.curveTo(234.33002, 202.31001, 233.56001, 202.29001, 233.18002, 202.28001);
generalPath.curveTo(232.80002, 202.28001, 231.53003, 202.27002, 230.81003, 202.08002);
generalPath.curveTo(229.86003, 201.83002, 228.97003, 201.39001, 228.97003, 201.39001);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(228.97, 201.38);
generalPath.curveTo(229.19, 201.03, 229.29001, 200.59001, 229.21, 200.15001);
generalPath.curveTo(229.13, 199.71, 228.89, 199.34001, 228.55, 199.08);
generalPath.curveTo(228.55, 199.08, 229.22, 198.37, 230.02, 197.82);
generalPath.curveTo(230.62001, 197.41, 231.82, 197.0, 232.17, 196.87001);
generalPath.curveTo(232.53, 196.74, 233.24, 196.47002, 233.24, 196.47002);
generalPath.curveTo(233.24, 196.47002, 233.24, 196.65001, 233.18001, 197.08002);
generalPath.curveTo(233.1, 197.60002, 232.98001, 197.95001, 232.98001, 197.95001);
generalPath.curveTo(234.28001, 197.81001, 235.6, 198.24, 236.59001, 198.93001);
generalPath.curveTo(235.90001, 199.90001, 234.82, 200.72, 233.55002, 201.01001);
generalPath.curveTo(233.55002, 201.01001, 233.78001, 201.29001, 234.05002, 201.75002);
generalPath.curveTo(234.26003, 202.14001, 234.33002, 202.31001, 234.33002, 202.31001);
generalPath.curveTo(234.33002, 202.31001, 233.56001, 202.29001, 233.18002, 202.28001);
generalPath.curveTo(232.80002, 202.28001, 231.53003, 202.27002, 230.81003, 202.08002);
generalPath.curveTo(229.86003, 201.83002, 228.97003, 201.39001, 228.97003, 201.39001);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_10
shape = new Ellipse2D.Double(225.1999969482422, 198.38999938964844, 4.340000152587891, 4.119999885559082);
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(225.1999969482422, 198.38999938964844, 4.340000152587891, 4.119999885559082);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(237.76, 201.77);
generalPath.curveTo(237.65, 200.90001, 238.06999, 200.14, 238.68999, 200.07);
generalPath.curveTo(239.31999, 200.0, 239.91998, 200.64001, 240.02998, 201.51001);
generalPath.curveTo(240.13998, 202.37001, 239.72998, 203.14001, 239.09999, 203.21);
generalPath.curveTo(238.48, 203.28001, 237.87999, 202.64, 237.76, 201.77);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(237.76, 201.77);
generalPath.curveTo(237.65, 200.90001, 238.06999, 200.14, 238.68999, 200.07);
generalPath.curveTo(239.31999, 200.0, 239.91998, 200.64001, 240.02998, 201.51001);
generalPath.curveTo(240.13998, 202.37001, 239.72998, 203.14001, 239.09999, 203.21);
generalPath.curveTo(238.48, 203.28001, 237.87999, 202.64, 237.76, 201.77);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(248.5, 199.83);
generalPath.curveTo(248.18, 199.47, 247.97, 199.01, 247.97, 198.5);
generalPath.curveTo(247.97, 198.0, 248.16, 197.53, 248.48, 197.18);
generalPath.curveTo(248.48, 197.18, 247.59, 196.51, 246.59, 196.06);
generalPath.curveTo(245.81999, 195.70999, 244.41, 195.47, 243.98999, 195.39);
generalPath.curveTo(243.56, 195.31, 242.70999, 195.15, 242.70999, 195.15);
generalPath.curveTo(242.70999, 195.15, 242.74998, 195.34999, 242.90999, 195.81999);
generalPath.curveTo(243.10999, 196.37999, 243.30998, 196.74998, 243.30998, 196.74998);
generalPath.curveTo(241.83998, 196.82999, 240.45998, 197.55998, 239.49998, 198.50998);
generalPath.curveTo(240.45999, 199.44998, 241.83998, 200.16998, 243.30998, 200.25998);
generalPath.curveTo(243.30998, 200.25998, 243.10999, 200.61998, 242.90999, 201.18997);
generalPath.curveTo(242.74998, 201.64998, 242.70999, 201.85997, 242.70999, 201.85997);
generalPath.curveTo(242.70999, 201.85997, 243.56, 201.69997, 243.98999, 201.61996);
generalPath.curveTo(244.40999, 201.53996, 245.81999, 201.29996, 246.59, 200.94997);
generalPath.curveTo(247.59, 200.48996, 248.5, 199.83997, 248.5, 199.83997);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(248.5, 199.83);
generalPath.curveTo(248.18, 199.47, 247.97, 199.01, 247.97, 198.5);
generalPath.curveTo(247.97, 198.0, 248.16, 197.53, 248.48, 197.18);
generalPath.curveTo(248.48, 197.18, 247.59, 196.51, 246.59, 196.06);
generalPath.curveTo(245.81999, 195.70999, 244.41, 195.47, 243.98999, 195.39);
generalPath.curveTo(243.56, 195.31, 242.70999, 195.15, 242.70999, 195.15);
generalPath.curveTo(242.70999, 195.15, 242.74998, 195.34999, 242.90999, 195.81999);
generalPath.curveTo(243.10999, 196.37999, 243.30998, 196.74998, 243.30998, 196.74998);
generalPath.curveTo(241.83998, 196.82999, 240.45998, 197.55998, 239.49998, 198.50998);
generalPath.curveTo(240.45999, 199.44998, 241.83998, 200.16998, 243.30998, 200.25998);
generalPath.curveTo(243.30998, 200.25998, 243.10999, 200.61998, 242.90999, 201.18997);
generalPath.curveTo(242.74998, 201.64998, 242.70999, 201.85997, 242.70999, 201.85997);
generalPath.curveTo(242.70999, 201.85997, 243.56, 201.69997, 243.98999, 201.61996);
generalPath.curveTo(244.40999, 201.53996, 245.81999, 201.29996, 246.59, 200.94997);
generalPath.curveTo(247.59, 200.48996, 248.5, 199.83997, 248.5, 199.83997);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.11, 188.36);
generalPath.curveTo(251.16, 189.31, 251.96, 190.72, 252.06, 192.18001);
generalPath.curveTo(252.06, 192.18001, 252.25, 191.91, 252.97, 191.65001);
generalPath.curveTo(253.7, 191.39001, 254.25, 191.49, 254.25, 191.49);
generalPath.curveTo(254.25, 191.49, 253.86, 192.54001, 253.7, 192.91);
generalPath.curveTo(253.53, 193.28, 253.31, 194.44, 252.86, 195.44);
generalPath.curveTo(252.42, 196.44, 251.81, 197.2, 251.81, 197.2);
generalPath.curveTo(251.41, 196.75, 250.81, 196.45, 250.14, 196.45);
generalPath.curveTo(249.46, 196.45, 248.87, 196.75, 248.47, 197.2);
generalPath.curveTo(248.47, 197.2, 247.86, 196.44, 247.42, 195.44);
generalPath.curveTo(246.97, 194.44, 246.75, 193.28, 246.58, 192.91);
generalPath.curveTo(246.41, 192.54001, 246.02, 191.49, 246.02, 191.49);
generalPath.curveTo(246.02, 191.49, 246.58, 191.39, 247.3, 191.65001);
generalPath.curveTo(248.02, 191.91002, 248.22, 192.18001, 248.22, 192.18001);
generalPath.curveTo(248.32, 190.72, 249.08, 189.31001, 250.11, 188.36);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.11, 188.36);
generalPath.curveTo(251.16, 189.31, 251.96, 190.72, 252.06, 192.18001);
generalPath.curveTo(252.06, 192.18001, 252.25, 191.91, 252.97, 191.65001);
generalPath.curveTo(253.7, 191.39001, 254.25, 191.49, 254.25, 191.49);
generalPath.curveTo(254.25, 191.49, 253.86, 192.54001, 253.7, 192.91);
generalPath.curveTo(253.53, 193.28, 253.31, 194.44, 252.86, 195.44);
generalPath.curveTo(252.42, 196.44, 251.81, 197.2, 251.81, 197.2);
generalPath.curveTo(251.41, 196.75, 250.81, 196.45, 250.14, 196.45);
generalPath.curveTo(249.46, 196.45, 248.87, 196.75, 248.47, 197.2);
generalPath.curveTo(248.47, 197.2, 247.86, 196.44, 247.42, 195.44);
generalPath.curveTo(246.97, 194.44, 246.75, 193.28, 246.58, 192.91);
generalPath.curveTo(246.41, 192.54001, 246.02, 191.49, 246.02, 191.49);
generalPath.curveTo(246.02, 191.49, 246.58, 191.39, 247.3, 191.65001);
generalPath.curveTo(248.02, 191.91002, 248.22, 192.18001, 248.22, 192.18001);
generalPath.curveTo(248.32, 190.72, 249.08, 189.31001, 250.11, 188.36);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(251.76, 199.83);
generalPath.curveTo(252.09, 199.47, 252.29, 199.01, 252.29, 198.5);
generalPath.curveTo(252.29, 198.0, 252.09999, 197.53, 251.78, 197.18);
generalPath.curveTo(251.78, 197.18, 252.67, 196.51, 253.68, 196.06);
generalPath.curveTo(254.43999, 195.70999, 255.84999, 195.47, 256.28, 195.39);
generalPath.curveTo(256.7, 195.31, 257.54, 195.15, 257.54, 195.15);
generalPath.curveTo(257.54, 195.15, 257.52002, 195.34999, 257.35, 195.81999);
generalPath.curveTo(257.15, 196.37999, 256.95, 196.74998, 256.95, 196.74998);
generalPath.curveTo(258.42, 196.82999, 259.81, 197.55998, 260.76, 198.50998);
generalPath.curveTo(259.81, 199.44998, 258.43002, 200.16998, 256.95, 200.25998);
generalPath.curveTo(256.95, 200.25998, 257.15002, 200.61998, 257.35, 201.18997);
generalPath.curveTo(257.51, 201.64998, 257.54, 201.85997, 257.54, 201.85997);
generalPath.lineTo(256.28, 201.61996);
generalPath.curveTo(255.85, 201.53996, 254.44, 201.29996, 253.68, 200.94997);
generalPath.curveTo(252.67, 200.48996, 251.76, 199.83997, 251.76, 199.83997);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(251.76, 199.83);
generalPath.curveTo(252.09, 199.47, 252.29, 199.01, 252.29, 198.5);
generalPath.curveTo(252.29, 198.0, 252.09999, 197.53, 251.78, 197.18);
generalPath.curveTo(251.78, 197.18, 252.67, 196.51, 253.68, 196.06);
generalPath.curveTo(254.43999, 195.70999, 255.84999, 195.47, 256.28, 195.39);
generalPath.curveTo(256.7, 195.31, 257.54, 195.15, 257.54, 195.15);
generalPath.curveTo(257.54, 195.15, 257.52002, 195.34999, 257.35, 195.81999);
generalPath.curveTo(257.15, 196.37999, 256.95, 196.74998, 256.95, 196.74998);
generalPath.curveTo(258.42, 196.82999, 259.81, 197.55998, 260.76, 198.50998);
generalPath.curveTo(259.81, 199.44998, 258.43002, 200.16998, 256.95, 200.25998);
generalPath.curveTo(256.95, 200.25998, 257.15002, 200.61998, 257.35, 201.18997);
generalPath.curveTo(257.51, 201.64998, 257.54, 201.85997, 257.54, 201.85997);
generalPath.lineTo(256.28, 201.61996);
generalPath.curveTo(255.85, 201.53996, 254.44, 201.29996, 253.68, 200.94997);
generalPath.curveTo(252.67, 200.48996, 251.76, 199.83997, 251.76, 199.83997);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_15
shape = new Ellipse2D.Double(247.97000122070312, 196.44000244140625, 4.340000152587891, 4.119999885559082);
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(247.97000122070312, 196.44000244140625, 4.340000152587891, 4.119999885559082);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(262.58, 201.77);
generalPath.curveTo(262.68997, 200.90001, 262.28, 200.14, 261.65, 200.07);
generalPath.curveTo(261.02, 200.00002, 260.41998, 200.64001, 260.31, 201.51001);
generalPath.curveTo(260.2, 202.37001, 260.62, 203.14001, 261.24, 203.21);
generalPath.curveTo(261.87, 203.28001, 262.47, 202.64, 262.58, 201.77);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(262.58, 201.77);
generalPath.curveTo(262.68997, 200.90001, 262.28, 200.14, 261.65, 200.07);
generalPath.curveTo(261.02, 200.00002, 260.41998, 200.64001, 260.31, 201.51001);
generalPath.curveTo(260.2, 202.37001, 260.62, 203.14001, 261.24, 203.21);
generalPath.curveTo(261.87, 203.28001, 262.47, 202.64, 262.58, 201.77);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_17
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(271.38, 201.38);
generalPath.curveTo(271.16, 201.03, 271.06, 200.59001, 271.13, 200.15001);
generalPath.curveTo(271.22, 199.71, 271.46, 199.34001, 271.80002, 199.08);
generalPath.curveTo(271.80002, 199.08, 271.13, 198.37, 270.33002, 197.82);
generalPath.curveTo(269.72003, 197.41, 268.53003, 197.0, 268.17, 196.87001);
generalPath.curveTo(267.82, 196.74, 267.11002, 196.47002, 267.11002, 196.47002);
generalPath.curveTo(267.11002, 196.47002, 267.1, 196.65001, 267.17, 197.08002);
generalPath.curveTo(267.25, 197.60002, 267.36002, 197.95001, 267.36002, 197.95001);
generalPath.curveTo(266.07, 197.81001, 264.75003, 198.24, 263.76, 198.93001);
generalPath.curveTo(264.44, 199.90001, 265.53, 200.72, 266.79, 201.01001);
generalPath.curveTo(266.79, 201.01001, 266.56, 201.29001, 266.30002, 201.75002);
generalPath.curveTo(266.08002, 202.14001, 266.02002, 202.31001, 266.02002, 202.31001);
generalPath.lineTo(267.16003, 202.28001);
generalPath.curveTo(267.54004, 202.28001, 268.82004, 202.27002, 269.53003, 202.08002);
generalPath.curveTo(270.48004, 201.83002, 271.37003, 201.39001, 271.37003, 201.39001);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(271.38, 201.38);
generalPath.curveTo(271.16, 201.03, 271.06, 200.59001, 271.13, 200.15001);
generalPath.curveTo(271.22, 199.71, 271.46, 199.34001, 271.80002, 199.08);
generalPath.curveTo(271.80002, 199.08, 271.13, 198.37, 270.33002, 197.82);
generalPath.curveTo(269.72003, 197.41, 268.53003, 197.0, 268.17, 196.87001);
generalPath.curveTo(267.82, 196.74, 267.11002, 196.47002, 267.11002, 196.47002);
generalPath.curveTo(267.11002, 196.47002, 267.1, 196.65001, 267.17, 197.08002);
generalPath.curveTo(267.25, 197.60002, 267.36002, 197.95001, 267.36002, 197.95001);
generalPath.curveTo(266.07, 197.81001, 264.75003, 198.24, 263.76, 198.93001);
generalPath.curveTo(264.44, 199.90001, 265.53, 200.72, 266.79, 201.01001);
generalPath.curveTo(266.79, 201.01001, 266.56, 201.29001, 266.30002, 201.75002);
generalPath.curveTo(266.08002, 202.14001, 266.02002, 202.31001, 266.02002, 202.31001);
generalPath.lineTo(267.16003, 202.28001);
generalPath.curveTo(267.54004, 202.28001, 268.82004, 202.27002, 269.53003, 202.08002);
generalPath.curveTo(270.48004, 201.83002, 271.37003, 201.39001, 271.37003, 201.39001);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(274.67, 191.65);
generalPath.curveTo(273.61002, 192.31999, 272.69, 193.43999, 272.36002, 194.68);
generalPath.curveTo(272.36002, 194.68, 272.24002, 194.43, 271.65002, 194.09);
generalPath.curveTo(271.07004, 193.76, 270.56003, 193.76999, 270.56003, 193.76999);
generalPath.curveTo(270.56003, 193.76999, 270.73004, 194.73999, 270.82004, 195.09);
generalPath.curveTo(270.91003, 195.43, 270.91003, 196.47, 271.13004, 197.41);
generalPath.curveTo(271.36005, 198.34, 271.77005, 199.09, 271.77005, 199.09);
generalPath.curveTo(272.19006, 198.75, 272.76004, 198.58, 273.34006, 198.68);
generalPath.curveTo(273.93005, 198.78, 274.40005, 199.12, 274.67004, 199.57999);
generalPath.curveTo(274.67004, 199.57999, 275.33005, 198.99998, 275.88004, 198.19998);
generalPath.curveTo(276.42004, 197.38998, 276.80005, 196.41998, 277.00003, 196.11998);
generalPath.curveTo(277.21002, 195.81998, 277.72003, 194.96999, 277.72003, 194.96999);
generalPath.curveTo(277.72003, 194.96999, 277.25003, 194.79, 276.58002, 194.91998);
generalPath.curveTo(275.91, 195.03998, 275.7, 195.23999, 275.7, 195.23999);
generalPath.curveTo(275.85, 193.95999, 275.42, 192.62, 274.67, 191.65);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(274.67, 191.65);
generalPath.curveTo(273.61002, 192.31999, 272.69, 193.43999, 272.36002, 194.68);
generalPath.curveTo(272.36002, 194.68, 272.24002, 194.43, 271.65002, 194.09);
generalPath.curveTo(271.07004, 193.76, 270.56003, 193.76999, 270.56003, 193.76999);
generalPath.curveTo(270.56003, 193.76999, 270.73004, 194.73999, 270.82004, 195.09);
generalPath.curveTo(270.91003, 195.43, 270.91003, 196.47, 271.13004, 197.41);
generalPath.curveTo(271.36005, 198.34, 271.77005, 199.09, 271.77005, 199.09);
generalPath.curveTo(272.19006, 198.75, 272.76004, 198.58, 273.34006, 198.68);
generalPath.curveTo(273.93005, 198.78, 274.40005, 199.12, 274.67004, 199.57999);
generalPath.curveTo(274.67004, 199.57999, 275.33005, 198.99998, 275.88004, 198.19998);
generalPath.curveTo(276.42004, 197.38998, 276.80005, 196.41998, 277.00003, 196.11998);
generalPath.curveTo(277.21002, 195.81998, 277.72003, 194.96999, 277.72003, 194.96999);
generalPath.curveTo(277.72003, 194.96999, 277.25003, 194.79, 276.58002, 194.91998);
generalPath.curveTo(275.91, 195.03998, 275.7, 195.23999, 275.7, 195.23999);
generalPath.curveTo(275.85, 193.95999, 275.42, 192.62, 274.67, 191.65);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(274.22, 201.86);
generalPath.curveTo(274.56, 201.59, 274.82, 201.22, 274.89, 200.78);
generalPath.curveTo(274.98, 200.34, 274.89, 199.91, 274.67, 199.55);
generalPath.curveTo(274.67, 199.55, 275.55002, 199.11, 276.5, 198.86);
generalPath.curveTo(277.22, 198.67, 278.49, 198.66, 278.86, 198.66);
generalPath.curveTo(279.25, 198.64, 280.00998, 198.63, 280.00998, 198.63);
generalPath.curveTo(280.00998, 198.63, 279.94998, 198.8, 279.72998, 199.18001);
generalPath.curveTo(279.46997, 199.64001, 279.24, 199.93001, 279.24, 199.93001);
generalPath.curveTo(280.5, 200.22, 281.58, 201.05, 282.27, 202.02);
generalPath.curveTo(281.28, 202.7, 279.96, 203.12001, 278.66998, 202.99);
generalPath.curveTo(278.66998, 202.99, 278.77997, 203.33, 278.86, 203.85);
generalPath.curveTo(278.91998, 204.28, 278.91998, 204.46, 278.91998, 204.46);
generalPath.curveTo(278.91998, 204.46, 278.21, 204.20001, 277.86, 204.07);
generalPath.curveTo(277.5, 203.94, 276.31, 203.52, 275.69998, 203.11);
generalPath.curveTo(274.90997, 202.57, 274.21997, 201.86, 274.21997, 201.86);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(274.22, 201.86);
generalPath.curveTo(274.56, 201.59, 274.82, 201.22, 274.89, 200.78);
generalPath.curveTo(274.98, 200.34, 274.89, 199.91, 274.67, 199.55);
generalPath.curveTo(274.67, 199.55, 275.55002, 199.11, 276.5, 198.86);
generalPath.curveTo(277.22, 198.67, 278.49, 198.66, 278.86, 198.66);
generalPath.curveTo(279.25, 198.64, 280.00998, 198.63, 280.00998, 198.63);
generalPath.curveTo(280.00998, 198.63, 279.94998, 198.8, 279.72998, 199.18001);
generalPath.curveTo(279.46997, 199.64001, 279.24, 199.93001, 279.24, 199.93001);
generalPath.curveTo(280.5, 200.22, 281.58, 201.05, 282.27, 202.02);
generalPath.curveTo(281.28, 202.7, 279.96, 203.12001, 278.66998, 202.99);
generalPath.curveTo(278.66998, 202.99, 278.77997, 203.33, 278.86, 203.85);
generalPath.curveTo(278.91998, 204.28, 278.91998, 204.46, 278.91998, 204.46);
generalPath.curveTo(278.91998, 204.46, 278.21, 204.20001, 277.86, 204.07);
generalPath.curveTo(277.5, 203.94, 276.31, 203.52, 275.69998, 203.11);
generalPath.curveTo(274.90997, 202.57, 274.21997, 201.86, 274.21997, 201.86);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_20
shape = new Ellipse2D.Double(270.80999755859375, 198.38999938964844, 4.340000152587891, 4.119999885559082);
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(270.80999755859375, 198.38999938964844, 4.340000152587891, 4.119999885559082);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_21
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.96, 205.91);
generalPath.curveTo(284.24, 205.08, 283.99, 204.26001, 283.38998, 204.08);
generalPath.curveTo(282.78998, 203.89, 282.06998, 204.41, 281.78, 205.24);
generalPath.curveTo(281.5, 206.07, 281.75, 206.89, 282.35, 207.08);
generalPath.curveTo(282.95, 207.26, 283.67, 206.74, 283.96, 205.91);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.96, 205.91);
generalPath.curveTo(284.24, 205.08, 283.99, 204.26001, 283.38998, 204.08);
generalPath.curveTo(282.78998, 203.89, 282.06998, 204.41, 281.78, 205.24);
generalPath.curveTo(281.5, 206.07, 281.75, 206.89, 282.35, 207.08);
generalPath.curveTo(282.95, 207.26, 283.67, 206.74, 283.96, 205.91);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_22
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(291.97, 206.32);
generalPath.curveTo(292.08, 205.95001, 292.33, 205.57, 292.69, 205.26001);
generalPath.curveTo(293.48, 204.58002, 294.54, 204.47002, 295.05, 205.01001);
generalPath.curveTo(295.12, 205.08002, 295.19, 205.18001, 295.22998, 205.26001);
generalPath.curveTo(295.22998, 205.26001, 296.33, 203.18001, 297.62997, 202.48001);

}

private void _paint9(Graphics2D g,float origAlpha) {
generalPath.curveTo(298.92996, 201.78001, 301.12997, 201.96, 301.12997, 201.96);
generalPath.curveTo(301.12997, 200.36, 299.81998, 199.07, 298.12997, 199.07);
generalPath.curveTo(297.13998, 199.07, 296.20996, 199.48001, 295.65997, 200.18001);
generalPath.lineTo(295.42996, 199.11);
generalPath.curveTo(295.42996, 199.11, 294.06998, 199.38, 293.44995, 200.93001);
generalPath.curveTo(292.82993, 202.48001, 293.49994, 204.73001, 293.49994, 204.73001);
generalPath.curveTo(293.49994, 204.73001, 293.16995, 203.77, 292.65994, 203.12001);
generalPath.curveTo(292.14993, 202.48001, 290.84995, 201.78001, 290.16995, 201.46);
generalPath.curveTo(289.48996, 201.15001, 288.79996, 200.67001, 288.79996, 200.67001);
generalPath.curveTo(288.79996, 200.67001, 288.76996, 200.85, 288.73996, 201.28001);
generalPath.curveTo(288.71997, 201.79001, 288.75995, 202.11002, 288.75995, 202.11002);
generalPath.curveTo(287.50995, 201.94002, 286.05994, 202.15001, 284.92996, 202.59001);
generalPath.curveTo(285.40997, 203.54001, 286.32996, 204.43001, 287.53995, 204.89001);
generalPath.curveTo(287.53995, 204.89001, 287.10995, 205.25002, 286.70996, 205.64001);
generalPath.curveTo(286.37997, 205.98001, 286.27997, 206.13002, 286.27997, 206.13002);
generalPath.curveTo(286.27997, 206.13002, 287.12997, 206.26003, 287.54996, 206.32002);
generalPath.curveTo(287.97995, 206.37003, 289.38995, 206.60002, 290.22995, 206.54002);
generalPath.curveTo(290.85995, 206.50003, 291.54996, 206.40002, 291.96994, 206.32002);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(291.97, 206.32);
generalPath.curveTo(292.08, 205.95001, 292.33, 205.57, 292.69, 205.26001);
generalPath.curveTo(293.48, 204.58002, 294.54, 204.47002, 295.05, 205.01001);
generalPath.curveTo(295.12, 205.08002, 295.19, 205.18001, 295.22998, 205.26001);
generalPath.curveTo(295.22998, 205.26001, 296.33, 203.18001, 297.62997, 202.48001);
generalPath.curveTo(298.92996, 201.78001, 301.12997, 201.96, 301.12997, 201.96);
generalPath.curveTo(301.12997, 200.36, 299.81998, 199.07, 298.12997, 199.07);
generalPath.curveTo(297.13998, 199.07, 296.20996, 199.48001, 295.65997, 200.18001);
generalPath.lineTo(295.42996, 199.11);
generalPath.curveTo(295.42996, 199.11, 294.06998, 199.38, 293.44995, 200.93001);
generalPath.curveTo(292.82993, 202.48001, 293.49994, 204.73001, 293.49994, 204.73001);
generalPath.curveTo(293.49994, 204.73001, 293.16995, 203.77, 292.65994, 203.12001);
generalPath.curveTo(292.14993, 202.48001, 290.84995, 201.78001, 290.16995, 201.46);
generalPath.curveTo(289.48996, 201.15001, 288.79996, 200.67001, 288.79996, 200.67001);
generalPath.curveTo(288.79996, 200.67001, 288.76996, 200.85, 288.73996, 201.28001);
generalPath.curveTo(288.71997, 201.79001, 288.75995, 202.11002, 288.75995, 202.11002);
generalPath.curveTo(287.50995, 201.94002, 286.05994, 202.15001, 284.92996, 202.59001);
generalPath.curveTo(285.40997, 203.54001, 286.32996, 204.43001, 287.53995, 204.89001);
generalPath.curveTo(287.53995, 204.89001, 287.10995, 205.25002, 286.70996, 205.64001);
generalPath.curveTo(286.37997, 205.98001, 286.27997, 206.13002, 286.27997, 206.13002);
generalPath.curveTo(286.27997, 206.13002, 287.12997, 206.26003, 287.54996, 206.32002);
generalPath.curveTo(287.97995, 206.37003, 289.38995, 206.60002, 290.22995, 206.54002);
generalPath.curveTo(290.85995, 206.50003, 291.54996, 206.40002, 291.96994, 206.32002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_3_23
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(295.05, 205.01);
generalPath.curveTo(294.53998, 204.47, 293.47998, 204.58, 292.69, 205.26);
generalPath.curveTo(291.9, 205.93, 291.67, 206.92, 292.18, 207.45);
generalPath.curveTo(292.69, 207.98999, 293.75, 207.87, 294.53998, 207.2);
generalPath.curveTo(295.33, 206.52, 295.55997, 205.54, 295.05, 205.01);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(295.05, 205.01);
generalPath.curveTo(294.53998, 204.47, 293.47998, 204.58, 292.69, 205.26);
generalPath.curveTo(291.9, 205.93, 291.67, 206.92, 292.18, 207.45);
generalPath.curveTo(292.69, 207.98999, 293.75, 207.87, 294.53998, 207.2);
generalPath.curveTo(295.33, 206.52, 295.55997, 205.54, 295.05, 205.01);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.12, 224.57);
generalPath.curveTo(239.06, 224.56001, 229.04999, 223.28001, 221.44, 221.31001);
generalPath.curveTo(229.05, 219.34001, 239.06, 218.14001, 250.12, 218.12001);
generalPath.curveTo(261.19, 218.14001, 271.25, 219.34001, 278.86, 221.31001);
generalPath.curveTo(271.25, 223.28001, 261.18997, 224.56001, 250.11998, 224.57);
generalPath.closePath();
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.12, 224.57);
generalPath.curveTo(239.06, 224.56001, 229.04999, 223.28001, 221.44, 221.31001);
generalPath.curveTo(229.05, 219.34001, 239.06, 218.14001, 250.12, 218.12001);
generalPath.curveTo(261.19, 218.14001, 271.25, 219.34001, 278.86, 221.31001);
generalPath.curveTo(271.25, 223.28001, 261.18997, 224.56001, 250.11998, 224.57);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_1
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.05f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(258.04, 224.28);
generalPath.lineTo(258.04, 218.27);
generalPath.moveTo(255.02, 224.48001);
generalPath.lineTo(255.06, 218.11002);
generalPath.moveTo(252.81999, 224.56001);
generalPath.lineTo(252.81999, 218.07);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_2
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.09f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.95, 224.64);
generalPath.lineTo(250.95, 218.06999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_3
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.14f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(249.16, 224.64);
generalPath.lineTo(249.16, 218.06999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_4
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.18f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(247.48, 224.64);
generalPath.lineTo(247.48, 218.06999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_5
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.23f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(245.81, 224.64);
generalPath.lineTo(245.81, 218.06999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_6
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.28f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(244.32, 224.64);
generalPath.lineTo(244.32, 218.06999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_7
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.33f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(241.48, 224.28);
generalPath.lineTo(241.44, 218.31);
generalPath.moveTo(242.83, 224.36);
generalPath.lineTo(242.83, 218.11);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_8
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.37f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(238.86, 224.01);
generalPath.lineTo(238.86, 218.51);
generalPath.moveTo(240.19, 224.17);
generalPath.lineTo(240.15001, 218.31);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_9
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.42f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(235.35, 223.7);
generalPath.lineTo(235.35, 218.86);
generalPath.moveTo(236.5, 223.78);
generalPath.lineTo(236.5, 218.7);
generalPath.moveTo(237.69, 223.94);
generalPath.lineTo(237.69, 218.66);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_10
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.46f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(234.12, 223.66);
generalPath.lineTo(234.12, 218.98001);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_11
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.51f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(232.97, 223.42);
generalPath.lineTo(232.97, 219.06);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_12
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.56f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(231.74, 223.31);
generalPath.lineTo(231.74, 219.25);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_13
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.6f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(229.22, 222.95);
generalPath.lineTo(229.18001, 219.73);
generalPath.moveTo(230.51001, 223.11);
generalPath.lineTo(230.51001, 219.49);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_14
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.63f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(227.93, 222.68);
generalPath.lineTo(227.93, 219.84);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_15
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.68f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(226.74, 222.45);
generalPath.lineTo(226.74, 220.09);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_16
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.73f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(225.45, 222.13);
generalPath.lineTo(225.45, 220.28);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_17
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.77f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(224.12, 221.98);
generalPath.lineTo(224.12, 220.59999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_18
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.91f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(222.72, 221.66);
generalPath.lineTo(222.72, 220.99);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_19
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(220.12, 221.66);
generalPath.curveTo(227.87, 219.48001, 238.41, 218.14, 250.12, 218.12001);
generalPath.curveTo(261.84, 218.14001, 272.43, 219.48001, 280.18, 221.66);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_20
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(216.72, 217.16);
generalPath.lineTo(217.94, 215.57);
generalPath.lineTo(221.31, 216.0);
generalPath.lineTo(218.62, 217.96);
generalPath.lineTo(216.72, 217.16);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(216.72, 217.16);
generalPath.lineTo(217.94, 215.57);
generalPath.lineTo(221.31, 216.0);
generalPath.lineTo(218.62, 217.96);
generalPath.lineTo(216.72, 217.16);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_21
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(224.03, 215.28);
generalPath.curveTo(224.03, 214.7, 224.52, 214.24, 225.13, 214.24);
generalPath.curveTo(225.74, 214.24, 226.23001, 214.70001, 226.23001, 215.28);
generalPath.curveTo(226.23001, 215.85, 225.74, 216.31999, 225.13, 216.31999);
generalPath.curveTo(224.52, 216.31999, 224.03, 215.84999, 224.03, 215.28);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(224.03, 215.28);
generalPath.curveTo(224.03, 214.7, 224.52, 214.24, 225.13, 214.24);
generalPath.curveTo(225.74, 214.24, 226.23001, 214.70001, 226.23001, 215.28);
generalPath.curveTo(226.23001, 215.85, 225.74, 216.31999, 225.13, 216.31999);
generalPath.curveTo(224.52, 216.31999, 224.03, 215.84999, 224.03, 215.28);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_22
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(233.64, 215.07);
generalPath.lineTo(231.28, 215.34001);
generalPath.curveTo(230.67, 215.41002, 230.11, 215.01001, 230.04, 214.44002);
generalPath.curveTo(229.95999, 213.87001, 230.39, 213.35002, 231.0, 213.29002);
generalPath.lineTo(233.37, 213.01003);
generalPath.lineTo(235.79, 212.73003);
generalPath.curveTo(236.39, 212.66002, 236.93999, 213.06003, 237.01, 213.63002);
generalPath.curveTo(237.08, 214.20001, 236.65, 214.72002, 236.04999, 214.79002);
generalPath.lineTo(233.63998, 215.07002);
shape = generalPath;
paint = new Color(5, 142, 110, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(233.64, 215.07);
generalPath.lineTo(231.28, 215.34001);
generalPath.curveTo(230.67, 215.41002, 230.11, 215.01001, 230.04, 214.44002);
generalPath.curveTo(229.95999, 213.87001, 230.39, 213.35002, 231.0, 213.29002);
generalPath.lineTo(233.37, 213.01003);
generalPath.lineTo(235.79, 212.73003);
generalPath.curveTo(236.39, 212.66002, 236.93999, 213.06003, 237.01, 213.63002);
generalPath.curveTo(237.08, 214.20001, 236.65, 214.72002, 236.04999, 214.79002);
generalPath.lineTo(233.63998, 215.07002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_23
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(240.54, 213.35);
generalPath.curveTo(240.54, 212.77, 241.03, 212.31001, 241.64, 212.31001);
generalPath.curveTo(242.24, 212.31001, 242.74, 212.77002, 242.74, 213.35);
generalPath.curveTo(242.74, 213.92001, 242.24, 214.39, 241.64, 214.39);
generalPath.curveTo(241.03, 214.39, 240.54, 213.92, 240.54, 213.35);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(240.54, 213.35);
generalPath.curveTo(240.54, 212.77, 241.03, 212.31001, 241.64, 212.31001);
generalPath.curveTo(242.24, 212.31001, 242.74, 212.77002, 242.74, 213.35);
generalPath.curveTo(242.74, 213.92001, 242.24, 214.39, 241.64, 214.39);
generalPath.curveTo(241.03, 214.39, 240.54, 213.92, 240.54, 213.35);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_24
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.15, 214.16);
generalPath.lineTo(246.86, 214.16);
generalPath.curveTo(246.26, 214.16, 245.75, 213.7, 245.75, 213.13);
generalPath.curveTo(245.75, 212.55, 246.24, 212.09001, 246.85, 212.09001);
generalPath.lineTo(253.49, 212.09001);
generalPath.curveTo(254.1, 212.09001, 254.59001, 212.55002, 254.59001, 213.13);
generalPath.curveTo(254.59001, 213.70001, 254.08002, 214.16, 253.48001, 214.16);
generalPath.lineTo(250.15001, 214.16);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.15, 214.16);
generalPath.lineTo(246.86, 214.16);
generalPath.curveTo(246.26, 214.16, 245.75, 213.7, 245.75, 213.13);
generalPath.curveTo(245.75, 212.55, 246.24, 212.09001, 246.85, 212.09001);
generalPath.lineTo(253.49, 212.09001);
generalPath.curveTo(254.1, 212.09001, 254.59001, 212.55002, 254.59001, 213.13);
generalPath.curveTo(254.59001, 213.70001, 254.08002, 214.16, 253.48001, 214.16);
generalPath.lineTo(250.15001, 214.16);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_25
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(257.56, 213.35);
generalPath.curveTo(257.56, 212.77, 258.06, 212.31001, 258.66, 212.31001);
generalPath.curveTo(259.27, 212.31001, 259.76, 212.77002, 259.76, 213.35);
generalPath.curveTo(259.76, 213.92001, 259.27002, 214.39, 258.66, 214.39);
generalPath.curveTo(258.06, 214.39, 257.56, 213.92, 257.56, 213.35);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(257.56, 213.35);
generalPath.curveTo(257.56, 212.77, 258.06, 212.31001, 258.66, 212.31001);
generalPath.curveTo(259.27, 212.31001, 259.76, 212.77002, 259.76, 213.35);
generalPath.curveTo(259.76, 213.92001, 259.27002, 214.39, 258.66, 214.39);
generalPath.curveTo(258.06, 214.39, 257.56, 213.92, 257.56, 213.35);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_26
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(266.66, 215.07);
generalPath.lineTo(269.02, 215.34001);
generalPath.curveTo(269.62, 215.41002, 270.19, 215.01001, 270.25998, 214.44002);
generalPath.curveTo(270.32996, 213.87003, 269.9, 213.35002, 269.3, 213.29002);
generalPath.lineTo(266.93, 213.01003);
generalPath.lineTo(264.50998, 212.73003);
generalPath.curveTo(263.9, 212.66002, 263.36, 213.06003, 263.28998, 213.63002);
generalPath.curveTo(263.21, 214.20003, 263.64996, 214.72002, 264.24997, 214.79002);
generalPath.lineTo(266.65997, 215.07002);
shape = generalPath;
paint = new Color(5, 142, 110, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(266.66, 215.07);
generalPath.lineTo(269.02, 215.34001);
generalPath.curveTo(269.62, 215.41002, 270.19, 215.01001, 270.25998, 214.44002);
generalPath.curveTo(270.32996, 213.87003, 269.9, 213.35002, 269.3, 213.29002);
generalPath.lineTo(266.93, 213.01003);
generalPath.lineTo(264.50998, 212.73003);
generalPath.curveTo(263.9, 212.66002, 263.36, 213.06003, 263.28998, 213.63002);
generalPath.curveTo(263.21, 214.20003, 263.64996, 214.72002, 264.24997, 214.79002);
generalPath.lineTo(266.65997, 215.07002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_27
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(274.07, 215.28);
generalPath.curveTo(274.07, 214.7, 274.56, 214.24, 275.17, 214.24);
generalPath.curveTo(275.78003, 214.24, 276.27002, 214.70001, 276.27002, 215.28);
generalPath.curveTo(276.27002, 215.85, 275.78003, 216.31999, 275.17, 216.31999);
generalPath.curveTo(274.56, 216.31999, 274.07, 215.84999, 274.07, 215.28);
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(274.07, 215.28);
generalPath.curveTo(274.07, 214.7, 274.56, 214.24, 275.17, 214.24);
generalPath.curveTo(275.78003, 214.24, 276.27002, 214.70001, 276.27002, 215.28);
generalPath.curveTo(276.27002, 215.85, 275.78003, 216.31999, 275.17, 216.31999);
generalPath.curveTo(274.56, 216.31999, 274.07, 215.84999, 274.07, 215.28);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1_4_28
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.57, 217.16);
generalPath.lineTo(282.36002, 215.57);
generalPath.lineTo(278.99002, 216.0);
generalPath.lineTo(281.68002, 217.96);
generalPath.lineTo(283.57004, 217.16);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.57, 217.16);
generalPath.lineTo(282.36002, 215.57);
generalPath.lineTo(278.99002, 216.0);
generalPath.lineTo(281.68002, 217.96);
generalPath.lineTo(283.57004, 217.16);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.49, 344.33);
generalPath.curveTo(237.41, 344.33, 224.44, 341.12997, 213.54001, 335.78998);
generalPath.curveTo(205.51001, 331.80997, 200.18001, 323.78998, 200.18001, 314.59998);
generalPath.lineTo(200.18001, 281.3);
generalPath.lineTo(300.6, 281.3);
generalPath.lineTo(300.6, 314.59998);
generalPath.curveTo(300.6, 323.78998, 295.28, 331.80997, 287.24002, 335.78998);
generalPath.curveTo(276.34003, 341.12997, 263.58002, 344.33, 250.49002, 344.33);
generalPath.closePath();
shape = generalPath;
paint = new Color(204, 204, 204, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.49, 344.33);
generalPath.curveTo(237.41, 344.33, 224.44, 341.12997, 213.54001, 335.78998);
generalPath.curveTo(205.51001, 331.80997, 200.18001, 323.78998, 200.18001, 314.59998);
generalPath.lineTo(200.18001, 281.3);
generalPath.lineTo(300.6, 281.3);
generalPath.lineTo(300.6, 314.59998);
generalPath.curveTo(300.6, 323.78998, 295.28, 331.80997, 287.24002, 335.78998);
generalPath.curveTo(276.34003, 341.12997, 263.58002, 344.33, 250.49002, 344.33);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(252.91, 329.55);
generalPath.curveTo(255.0, 330.18, 256.06, 331.74, 256.06, 333.56);
generalPath.curveTo(256.06, 335.94, 253.76, 337.74, 250.76, 337.74);
generalPath.curveTo(247.76999, 337.74, 245.34, 335.94, 245.34, 333.56);
generalPath.curveTo(245.34, 331.77, 246.34, 329.76, 248.42, 329.62);
generalPath.curveTo(248.42, 329.62, 248.36, 329.43, 248.18, 329.12);
generalPath.curveTo(247.95999, 328.88998, 247.54, 328.46, 247.54, 328.46);
generalPath.curveTo(247.54, 328.46, 248.32999, 328.31, 248.79, 328.47998);
generalPath.curveTo(249.25, 328.65997, 249.56, 328.94998, 249.56, 328.94998);
generalPath.curveTo(249.56, 328.94998, 249.77, 328.52, 250.08, 328.18997);
generalPath.curveTo(250.38, 327.86, 250.78, 327.65997, 250.78, 327.65997);
generalPath.curveTo(250.78, 327.65997, 251.24, 328.03998, 251.39, 328.3);
generalPath.curveTo(251.54, 328.56998, 251.64, 328.88998, 251.64, 328.88998);
generalPath.curveTo(251.64, 328.88998, 252.06, 328.53998, 252.43, 328.4);
generalPath.curveTo(252.79999, 328.25, 253.26999, 328.13998, 253.26999, 328.13998);
generalPath.curveTo(253.26999, 328.13998, 253.13998, 328.59998, 253.04999, 328.83);
generalPath.curveTo(252.95999, 329.06, 252.90999, 329.55, 252.90999, 329.55);
shape = generalPath;
paint = new Color(255, 214, 145, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(252.91, 329.55);
generalPath.curveTo(255.0, 330.18, 256.06, 331.74, 256.06, 333.56);
generalPath.curveTo(256.06, 335.94, 253.76, 337.74, 250.76, 337.74);
generalPath.curveTo(247.76999, 337.74, 245.34, 335.94, 245.34, 333.56);
generalPath.curveTo(245.34, 331.77, 246.34, 329.76, 248.42, 329.62);
generalPath.curveTo(248.42, 329.62, 248.36, 329.43, 248.18, 329.12);
generalPath.curveTo(247.95999, 328.88998, 247.54, 328.46, 247.54, 328.46);
generalPath.curveTo(247.54, 328.46, 248.32999, 328.31, 248.79, 328.47998);
generalPath.curveTo(249.25, 328.65997, 249.56, 328.94998, 249.56, 328.94998);
generalPath.curveTo(249.56, 328.94998, 249.77, 328.52, 250.08, 328.18997);
generalPath.curveTo(250.38, 327.86, 250.78, 327.65997, 250.78, 327.65997);
generalPath.curveTo(250.78, 327.65997, 251.24, 328.03998, 251.39, 328.3);
generalPath.curveTo(251.54, 328.56998, 251.64, 328.88998, 251.64, 328.88998);
generalPath.curveTo(251.64, 328.88998, 252.06, 328.53998, 252.43, 328.4);
generalPath.curveTo(252.79999, 328.25, 253.26999, 328.13998, 253.26999, 328.13998);
generalPath.curveTo(253.26999, 328.13998, 253.13998, 328.59998, 253.04999, 328.83);
generalPath.curveTo(252.95999, 329.06, 252.90999, 329.55, 252.90999, 329.55);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.32, 340.32);
generalPath.curveTo(250.32, 340.32, 246.34001, 337.64, 244.62001, 337.28);
generalPath.curveTo(242.41, 336.81, 239.93001, 337.19, 238.86002, 337.13);
generalPath.curveTo(238.89001, 337.16, 240.15001, 338.06, 240.70001, 338.61002);
generalPath.curveTo(241.25002, 339.16003, 243.09001, 340.26, 244.13, 340.52002);
generalPath.curveTo(247.35, 341.33002, 250.32, 340.32, 250.32, 340.32);
shape = generalPath;
paint = new Color(5, 142, 110, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.32, 340.32);
generalPath.curveTo(250.32, 340.32, 246.34001, 337.64, 244.62001, 337.28);
generalPath.curveTo(242.41, 336.81, 239.93001, 337.19, 238.86002, 337.13);
generalPath.curveTo(238.89001, 337.16, 240.15001, 338.06, 240.70001, 338.61002);
generalPath.curveTo(241.25002, 339.16003, 243.09001, 340.26, 244.13, 340.52002);
generalPath.curveTo(247.35, 341.33002, 250.32, 340.32, 250.32, 340.32);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(251.46, 340.56);
generalPath.curveTo(251.46, 340.56, 254.0, 337.9, 256.67, 337.54);
generalPath.curveTo(259.82, 337.1, 261.89, 337.80002, 263.11002, 338.12);
generalPath.curveTo(263.14, 338.12, 262.1, 338.61, 261.55002, 338.99);
generalPath.curveTo(261.00003, 339.36, 259.58002, 340.56, 257.41, 340.58);
generalPath.curveTo(255.23001, 340.61, 252.83, 340.34998, 252.44, 340.40997);
generalPath.curveTo(252.04001, 340.46997, 251.46, 340.55997, 251.46, 340.55997);
shape = generalPath;
paint = new Color(5, 142, 110, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}

}

private void _paint10(Graphics2D g,float origAlpha) {
generalPath.moveTo(251.46, 340.56);
generalPath.curveTo(251.46, 340.56, 254.0, 337.9, 256.67, 337.54);
generalPath.curveTo(259.82, 337.1, 261.89, 337.80002, 263.11002, 338.12);
generalPath.curveTo(263.14, 338.12, 262.1, 338.61, 261.55002, 338.99);
generalPath.curveTo(261.00003, 339.36, 259.58002, 340.56, 257.41, 340.58);
generalPath.curveTo(255.23001, 340.61, 252.83, 340.34998, 252.44, 340.40997);
generalPath.curveTo(252.04001, 340.46997, 251.46, 340.55997, 251.46, 340.55997);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.69, 337.28);
generalPath.curveTo(249.69, 336.35, 249.07, 335.03, 249.07, 333.56);
generalPath.curveTo(249.07, 332.1, 249.69, 330.78, 250.70001, 329.85);
generalPath.curveTo(251.69002, 330.78, 252.31001, 332.1, 252.31001, 333.56);
generalPath.curveTo(252.31001, 335.03, 251.69002, 336.35, 250.69002, 337.28);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.69, 337.28);
generalPath.curveTo(249.69, 336.35, 249.07, 335.03, 249.07, 333.56);
generalPath.curveTo(249.07, 332.1, 249.69, 330.78, 250.70001, 329.85);
generalPath.curveTo(251.69002, 330.78, 252.31001, 332.1, 252.31001, 333.56);
generalPath.curveTo(252.31001, 335.03, 251.69002, 336.35, 250.69002, 337.28);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(249.68, 342.71);
generalPath.curveTo(249.68, 342.71, 250.29, 341.19, 250.34999, 339.88);
generalPath.curveTo(250.40999, 338.79, 250.2, 337.71, 250.2, 337.71);
generalPath.lineTo(250.72, 337.71);
generalPath.lineTo(251.0, 337.71);
generalPath.curveTo(251.0, 337.71, 251.39, 338.87, 251.39, 339.88);
generalPath.curveTo(251.39, 340.9, 251.21, 342.25, 251.21, 342.25);
generalPath.curveTo(251.21, 342.25, 250.66, 342.33, 250.48001, 342.42);
generalPath.curveTo(250.29001, 342.51, 249.68001, 342.71002, 249.68001, 342.71002);
shape = generalPath;
paint = new Color(5, 142, 110, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(249.68, 342.71);
generalPath.curveTo(249.68, 342.71, 250.29, 341.19, 250.34999, 339.88);
generalPath.curveTo(250.40999, 338.79, 250.2, 337.71, 250.2, 337.71);
generalPath.lineTo(250.72, 337.71);
generalPath.lineTo(251.0, 337.71);
generalPath.curveTo(251.0, 337.71, 251.39, 338.87, 251.39, 339.88);
generalPath.curveTo(251.39, 340.9, 251.21, 342.25, 251.21, 342.25);
generalPath.curveTo(251.21, 342.25, 250.66, 342.33, 250.48001, 342.42);
generalPath.curveTo(250.29001, 342.51, 249.68001, 342.71002, 249.68001, 342.71002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.32, 314.57);
generalPath.curveTo(250.32, 327.73, 239.16, 338.39, 225.27, 338.39);
generalPath.curveTo(211.38, 338.39, 200.12001, 327.73, 200.12001, 314.57);
generalPath.lineTo(200.12001, 281.22);
generalPath.lineTo(250.32, 281.22);
generalPath.lineTo(250.32, 314.57);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.32, 314.57);
generalPath.curveTo(250.32, 327.73, 239.16, 338.39, 225.27, 338.39);
generalPath.curveTo(211.38, 338.39, 200.12001, 327.73, 200.12001, 314.57);
generalPath.lineTo(200.12001, 281.22);
generalPath.lineTo(250.32, 281.22);
generalPath.lineTo(250.32, 314.57);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_1_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(200.03, 314.12);
generalPath.curveTo(200.18, 321.13998, 202.98, 326.37, 205.76, 329.79);
generalPath.lineTo(205.76, 280.32);
generalPath.lineTo(200.09999, 280.32);
generalPath.lineTo(200.02998, 314.12);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(200.03, 314.12);
generalPath.curveTo(200.18, 321.13998, 202.98, 326.37, 205.76, 329.79);
generalPath.lineTo(205.76, 280.32);
generalPath.lineTo(200.09999, 280.32);
generalPath.lineTo(200.02998, 314.12);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_1_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(211.08, 334.23);
generalPath.curveTo(212.65001, 335.06, 214.8, 336.45, 217.11, 337.0);
generalPath.lineTo(216.96, 280.04);
generalPath.lineTo(211.08, 280.04);
generalPath.lineTo(211.08, 334.23);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(211.08, 334.23);
generalPath.curveTo(212.65001, 335.06, 214.8, 336.45, 217.11, 337.0);
generalPath.lineTo(216.96, 280.04);
generalPath.lineTo(211.08, 280.04);
generalPath.lineTo(211.08, 334.23);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_1_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(222.28, 338.25);
generalPath.curveTo(224.58, 338.48, 226.29, 338.44, 228.15, 338.25);
generalPath.lineTo(228.15, 280.04);
generalPath.lineTo(222.28, 280.04);
generalPath.lineTo(222.28, 338.25);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(222.28, 338.25);
generalPath.curveTo(224.58, 338.48, 226.29, 338.44, 228.15, 338.25);
generalPath.lineTo(228.15, 280.04);
generalPath.lineTo(222.28, 280.04);
generalPath.lineTo(222.28, 338.25);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_1_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(233.32, 337.0);
generalPath.curveTo(235.62001, 336.54, 238.22, 335.11, 239.35, 334.37);
generalPath.lineTo(239.35, 280.03998);
generalPath.lineTo(233.47, 280.03998);
generalPath.lineTo(233.32, 336.99997);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(233.32, 337.0);
generalPath.curveTo(235.62001, 336.54, 238.22, 335.11, 239.35, 334.37);
generalPath.lineTo(239.35, 280.03998);
generalPath.lineTo(233.47, 280.03998);
generalPath.lineTo(233.32, 336.99997);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_1_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(244.81, 329.24);
generalPath.curveTo(247.26, 327.06, 249.56, 322.12, 250.4, 316.47998);
generalPath.lineTo(250.54, 280.03998);
generalPath.lineTo(244.67, 280.03998);
generalPath.lineTo(244.81, 329.24);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(244.81, 329.24);
generalPath.curveTo(247.26, 327.06, 249.56, 322.12, 250.4, 316.47998);
generalPath.lineTo(250.54, 280.03998);
generalPath.lineTo(244.67, 280.03998);
generalPath.lineTo(244.81, 329.24);
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
// _0_2_2_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(300.65, 281.22);
generalPath.lineTo(300.65, 314.57);
generalPath.curveTo(300.65, 327.73, 289.37, 338.39, 275.47998, 338.39);
generalPath.curveTo(261.58, 338.39, 250.31998, 327.73, 250.31998, 314.57);
generalPath.lineTo(250.31998, 281.22);
generalPath.lineTo(300.64996, 281.22);
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(300.65, 281.22);
generalPath.lineTo(300.65, 314.57);
generalPath.curveTo(300.65, 327.73, 289.37, 338.39, 275.47998, 338.39);
generalPath.curveTo(261.58, 338.39, 250.31998, 327.73, 250.31998, 314.57);
generalPath.lineTo(250.31998, 281.22);
generalPath.lineTo(300.64996, 281.22);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(272.71, 306.14);
generalPath.curveTo(272.75998, 306.0, 272.83, 305.87003, 272.9, 305.74002);
generalPath.lineTo(268.63998, 301.00003);
generalPath.lineTo(266.96997, 301.72003);
generalPath.lineTo(263.90997, 298.33002);
generalPath.lineTo(264.90997, 296.87003);
generalPath.lineTo(259.56998, 290.88004);
generalPath.curveTo(259.49997, 290.90002, 259.36996, 290.90002, 259.3, 290.92004);
generalPath.lineTo(259.33, 294.94003);
generalPath.lineTo(261.08, 295.44003);
generalPath.lineTo(261.08, 299.90002);
generalPath.lineTo(259.33, 300.38004);
generalPath.lineTo(259.3, 304.46002);
generalPath.curveTo(260.13998, 304.72003, 260.78, 305.34003, 261.03998, 306.13004);
generalPath.lineTo(264.24997, 306.14005);
generalPath.lineTo(264.75998, 304.47003);
generalPath.lineTo(269.47998, 304.47003);
generalPath.lineTo(269.97998, 306.14005);
generalPath.closePath();
generalPath.moveTo(265.72998, 287.64);
generalPath.lineTo(265.72998, 289.25);
generalPath.lineTo(268.49, 289.25);
generalPath.lineTo(268.49, 287.64);
generalPath.closePath();
generalPath.moveTo(258.43, 308.01);
generalPath.curveTo(259.07, 308.01, 259.59, 307.52002, 259.59, 306.91);
generalPath.curveTo(259.59, 306.3, 259.07, 305.80002, 258.43, 305.80002);
generalPath.curveTo(257.78, 305.80002, 257.25998, 306.30002, 257.25998, 306.91);
generalPath.curveTo(257.25998, 307.52, 257.77997, 308.01, 258.43, 308.01);
generalPath.closePath();
generalPath.moveTo(274.41998, 298.28);
generalPath.lineTo(272.65997, 297.8);
generalPath.lineTo(272.65997, 293.34);
generalPath.lineTo(274.41998, 292.84);
generalPath.lineTo(274.40997, 290.91998);
generalPath.curveTo(273.55997, 290.66998, 272.89996, 290.05, 272.61996, 289.24997);
generalPath.lineTo(269.93997, 289.24997);
generalPath.lineTo(269.42996, 290.91998);
generalPath.lineTo(264.71997, 290.91998);
generalPath.lineTo(264.20996, 289.24997);
generalPath.lineTo(261.11996, 289.24997);
generalPath.curveTo(261.03998, 289.46997, 260.94995, 289.66998, 260.82996, 289.85995);
generalPath.lineTo(266.20996, 295.81995);
generalPath.lineTo(267.87997, 295.10995);
generalPath.lineTo(270.93997, 298.50995);
generalPath.lineTo(269.93997, 299.95996);
generalPath.lineTo(274.11996, 304.59998);
generalPath.curveTo(274.20996, 304.55997, 274.29996, 304.52, 274.39996, 304.47998);
generalPath.closePath();
generalPath.moveTo(267.16998, 296.88998);
generalPath.lineTo(265.87997, 297.93);
generalPath.lineTo(267.64996, 299.91);
generalPath.lineTo(268.93997, 298.86002);
generalPath.closePath();
generalPath.moveTo(275.17432, 333.0759);
generalPath.curveTo(273.93433, 333.0109, 272.91922, 332.1737, 272.66, 331.05997);
generalPath.curveTo(270.99, 330.82996, 269.41, 330.39996, 267.93, 329.75998);
generalPath.lineTo(268.77, 328.33);
generalPath.curveTo(270.06, 328.87997, 271.43, 329.24, 272.84998, 329.43997);
generalPath.curveTo(273.15997, 328.77997, 273.70996, 328.27997, 274.42996, 328.03998);
generalPath.lineTo(274.43997, 322.41998);
generalPath.lineTo(272.67996, 321.93);
generalPath.lineTo(272.67996, 317.47);
generalPath.lineTo(274.43997, 316.99);
generalPath.lineTo(274.43997, 309.34998);
generalPath.curveTo(274.36996, 309.33, 274.30997, 309.3, 274.23996, 309.25998);
generalPath.lineTo(270.25995, 313.68);
generalPath.lineTo(271.25995, 315.12);
generalPath.lineTo(268.19995, 318.52);
generalPath.lineTo(266.52994, 317.81);
generalPath.lineTo(263.22995, 321.48);
generalPath.curveTo(263.79996, 322.35, 263.77994, 323.48, 263.11996, 324.33002);
generalPath.curveTo(264.05997, 325.38, 265.14996, 326.31003, 266.35995, 327.08002);
generalPath.lineTo(265.51996, 328.52002);
generalPath.curveTo(264.09995, 327.63, 262.81995, 326.53003, 261.72995, 325.30002);
generalPath.curveTo(260.85995, 325.56003, 259.86996, 325.41, 259.12994, 324.80002);
generalPath.curveTo(257.97995, 323.87003, 257.83994, 322.24002, 258.82996, 321.16);
generalPath.lineTo(258.96997, 321.0);
generalPath.curveTo(258.27997, 319.44, 257.80997, 317.76, 257.64996, 316.0);
generalPath.lineTo(259.35995, 316.01);
generalPath.curveTo(259.49997, 317.51, 259.86996, 318.94, 260.44995, 320.28);
generalPath.curveTo(260.93994, 320.22, 261.44995, 320.27, 261.90994, 320.44);
generalPath.lineTo(265.22995, 316.76);
generalPath.lineTo(264.22995, 315.31);
generalPath.lineTo(267.28995, 311.91);
generalPath.lineTo(268.95996, 312.63);
generalPath.lineTo(272.94995, 308.2);
generalPath.curveTo(272.85995, 308.06, 272.79996, 307.91, 272.73996, 307.74002);
generalPath.lineTo(269.97995, 307.75003);
generalPath.lineTo(269.47995, 309.42004);
generalPath.lineTo(264.75995, 309.42004);
generalPath.lineTo(264.24994, 307.75003);
generalPath.lineTo(261.00995, 307.74002);
generalPath.curveTo(260.73996, 308.50003, 260.10995, 309.1, 259.31995, 309.36002);
generalPath.lineTo(259.30994, 313.40002);
generalPath.lineTo(257.59995, 313.39);
generalPath.lineTo(257.59995, 309.38);
generalPath.curveTo(256.49994, 309.05002, 255.68994, 308.07, 255.68994, 306.91);
generalPath.curveTo(255.68994, 305.76, 256.50995, 304.76, 257.60995, 304.43);
generalPath.lineTo(257.61996, 300.38);
generalPath.lineTo(255.85997, 299.9);
generalPath.lineTo(255.85997, 295.44);
generalPath.lineTo(257.61996, 294.94);
generalPath.lineTo(257.61996, 290.89);
generalPath.curveTo(256.53998, 290.54, 255.77997, 289.57, 255.77997, 288.44);
generalPath.curveTo(255.77997, 287.01, 256.99997, 285.86002, 258.50998, 285.86002);
generalPath.curveTo(259.72998, 285.86002, 260.75998, 286.6, 261.11996, 287.64);
generalPath.lineTo(264.20996, 287.64);
generalPath.lineTo(264.71997, 285.97);
generalPath.lineTo(269.42996, 285.97);
generalPath.lineTo(269.93997, 287.64);
generalPath.lineTo(272.61996, 287.64);
generalPath.curveTo(272.9769, 286.60892, 273.98254, 285.8727, 275.17892, 285.86017);
generalPath.lineTo(275.25003, 294.23);
generalPath.lineTo(274.40002, 294.23);
generalPath.lineTo(274.40002, 296.84);
generalPath.lineTo(275.24503, 296.84);
generalPath.lineTo(275.22363, 318.43);
generalPath.lineTo(274.44003, 318.43);
generalPath.lineTo(274.44003, 321.03998);
generalPath.lineTo(275.21948, 321.03998);
generalPath.closePath();
generalPath.moveTo(269.2603, 314.7699);
generalPath.lineTo(267.9703, 313.7299);
generalPath.lineTo(266.1903, 315.7099);
generalPath.lineTo(267.48032, 316.7499);
generalPath.closePath();
generalPath.moveTo(259.30032, 296.3299);
generalPath.lineTo(257.61032, 296.3299);
generalPath.lineTo(257.6003, 298.93988);
generalPath.lineTo(259.30032, 298.93988);
generalPath.closePath();
generalPath.moveTo(268.46033, 307.7399);
generalPath.lineTo(268.46033, 306.1399);
generalPath.lineTo(265.61032, 306.1399);
generalPath.lineTo(265.61032, 307.7399);
generalPath.closePath();
generalPath.moveTo(257.86032, 317.4299);
generalPath.lineTo(256.1003, 317.0399);
generalPath.lineTo(255.85031, 312.58987);
generalPath.lineTo(257.6003, 312.0099);
generalPath.lineTo(257.6003, 314.5699);
generalPath.curveTo(257.6003, 315.55988, 257.6903, 316.4899, 257.86032, 317.42987);
generalPath.closePath();
generalPath.moveTo(259.3203, 311.9099);
generalPath.lineTo(261.0703, 312.31992);
generalPath.curveTo(261.0703, 312.31992, 261.1603, 315.1899, 261.1203, 314.53992);
generalPath.curveTo(261.0803, 313.79993, 261.3103, 316.7799, 261.3103, 316.7799);
generalPath.lineTo(259.5503, 317.3599);
generalPath.curveTo(259.3703, 316.4599, 259.3103, 315.5199, 259.3103, 314.5699);
generalPath.closePath();
generalPath.moveTo(270.1303, 328.8399);
generalPath.lineTo(270.52032, 327.1399);
generalPath.curveTo(269.00034, 326.65988, 267.59033, 325.9599, 266.3503, 325.0499);
generalPath.lineTo(265.0903, 326.15988);
generalPath.curveTo(266.5703, 327.30988, 268.2803, 328.23987, 270.1303, 328.83987);
generalPath.closePath();
generalPath.moveTo(269.2803, 330.2799);
generalPath.lineTo(267.98032, 331.4999);
generalPath.curveTo(266.5103, 330.9599, 265.12033, 330.2399, 263.86032, 329.38992);
generalPath.lineTo(264.24033, 327.61993);
generalPath.curveTo(265.74033, 328.74994, 267.45032, 329.64993, 269.28033, 330.27994);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(200, 177, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(272.71, 306.14);
generalPath.curveTo(272.75998, 306.0, 272.83, 305.87003, 272.9, 305.74002);
generalPath.lineTo(268.63998, 301.00003);
generalPath.lineTo(266.96997, 301.72003);
generalPath.lineTo(263.90997, 298.33002);
generalPath.lineTo(264.90997, 296.87003);
generalPath.lineTo(259.56998, 290.88004);
generalPath.curveTo(259.49997, 290.90002, 259.36996, 290.90002, 259.3, 290.92004);
generalPath.lineTo(259.33, 294.94003);
generalPath.lineTo(261.08, 295.44003);
generalPath.lineTo(261.08, 299.90002);
generalPath.lineTo(259.33, 300.38004);
generalPath.lineTo(259.3, 304.46002);
generalPath.curveTo(260.13998, 304.72003, 260.78, 305.34003, 261.03998, 306.13004);
generalPath.lineTo(264.24997, 306.14005);
generalPath.lineTo(264.75998, 304.47003);
generalPath.lineTo(269.47998, 304.47003);
generalPath.lineTo(269.97998, 306.14005);
generalPath.closePath();
generalPath.moveTo(265.72998, 287.64);
generalPath.lineTo(265.72998, 289.25);
generalPath.lineTo(268.49, 289.25);
generalPath.lineTo(268.49, 287.64);
generalPath.closePath();
generalPath.moveTo(258.43, 308.01);
generalPath.curveTo(259.07, 308.01, 259.59, 307.52002, 259.59, 306.91);
generalPath.curveTo(259.59, 306.3, 259.07, 305.80002, 258.43, 305.80002);
generalPath.curveTo(257.78, 305.80002, 257.25998, 306.30002, 257.25998, 306.91);
generalPath.curveTo(257.25998, 307.52, 257.77997, 308.01, 258.43, 308.01);
generalPath.closePath();
generalPath.moveTo(274.41998, 298.28);
generalPath.lineTo(272.65997, 297.8);
generalPath.lineTo(272.65997, 293.34);
generalPath.lineTo(274.41998, 292.84);
generalPath.lineTo(274.40997, 290.91998);
generalPath.curveTo(273.55997, 290.66998, 272.89996, 290.05, 272.61996, 289.24997);
generalPath.lineTo(269.93997, 289.24997);
generalPath.lineTo(269.42996, 290.91998);
generalPath.lineTo(264.71997, 290.91998);
generalPath.lineTo(264.20996, 289.24997);
generalPath.lineTo(261.11996, 289.24997);
generalPath.curveTo(261.03998, 289.46997, 260.94995, 289.66998, 260.82996, 289.85995);
generalPath.lineTo(266.20996, 295.81995);
generalPath.lineTo(267.87997, 295.10995);
generalPath.lineTo(270.93997, 298.50995);
generalPath.lineTo(269.93997, 299.95996);
generalPath.lineTo(274.11996, 304.59998);
generalPath.curveTo(274.20996, 304.55997, 274.29996, 304.52, 274.39996, 304.47998);
generalPath.closePath();
generalPath.moveTo(267.16998, 296.88998);
generalPath.lineTo(265.87997, 297.93);
generalPath.lineTo(267.64996, 299.91);
generalPath.lineTo(268.93997, 298.86002);
generalPath.closePath();
generalPath.moveTo(275.17432, 333.0759);
generalPath.curveTo(273.93433, 333.0109, 272.91922, 332.1737, 272.66, 331.05997);
generalPath.curveTo(270.99, 330.82996, 269.41, 330.39996, 267.93, 329.75998);
generalPath.lineTo(268.77, 328.33);
generalPath.curveTo(270.06, 328.87997, 271.43, 329.24, 272.84998, 329.43997);
generalPath.curveTo(273.15997, 328.77997, 273.70996, 328.27997, 274.42996, 328.03998);
generalPath.lineTo(274.43997, 322.41998);
generalPath.lineTo(272.67996, 321.93);
generalPath.lineTo(272.67996, 317.47);
generalPath.lineTo(274.43997, 316.99);
generalPath.lineTo(274.43997, 309.34998);
generalPath.curveTo(274.36996, 309.33, 274.30997, 309.3, 274.23996, 309.25998);
generalPath.lineTo(270.25995, 313.68);
generalPath.lineTo(271.25995, 315.12);
generalPath.lineTo(268.19995, 318.52);
generalPath.lineTo(266.52994, 317.81);
generalPath.lineTo(263.22995, 321.48);
generalPath.curveTo(263.79996, 322.35, 263.77994, 323.48, 263.11996, 324.33002);
generalPath.curveTo(264.05997, 325.38, 265.14996, 326.31003, 266.35995, 327.08002);
generalPath.lineTo(265.51996, 328.52002);
generalPath.curveTo(264.09995, 327.63, 262.81995, 326.53003, 261.72995, 325.30002);
generalPath.curveTo(260.85995, 325.56003, 259.86996, 325.41, 259.12994, 324.80002);
generalPath.curveTo(257.97995, 323.87003, 257.83994, 322.24002, 258.82996, 321.16);
generalPath.lineTo(258.96997, 321.0);
generalPath.curveTo(258.27997, 319.44, 257.80997, 317.76, 257.64996, 316.0);
generalPath.lineTo(259.35995, 316.01);
generalPath.curveTo(259.49997, 317.51, 259.86996, 318.94, 260.44995, 320.28);
generalPath.curveTo(260.93994, 320.22, 261.44995, 320.27, 261.90994, 320.44);
generalPath.lineTo(265.22995, 316.76);
generalPath.lineTo(264.22995, 315.31);
generalPath.lineTo(267.28995, 311.91);
generalPath.lineTo(268.95996, 312.63);
generalPath.lineTo(272.94995, 308.2);
generalPath.curveTo(272.85995, 308.06, 272.79996, 307.91, 272.73996, 307.74002);
generalPath.lineTo(269.97995, 307.75003);
generalPath.lineTo(269.47995, 309.42004);
generalPath.lineTo(264.75995, 309.42004);
generalPath.lineTo(264.24994, 307.75003);
generalPath.lineTo(261.00995, 307.74002);
generalPath.curveTo(260.73996, 308.50003, 260.10995, 309.1, 259.31995, 309.36002);
generalPath.lineTo(259.30994, 313.40002);
generalPath.lineTo(257.59995, 313.39);
generalPath.lineTo(257.59995, 309.38);
generalPath.curveTo(256.49994, 309.05002, 255.68994, 308.07, 255.68994, 306.91);
generalPath.curveTo(255.68994, 305.76, 256.50995, 304.76, 257.60995, 304.43);
generalPath.lineTo(257.61996, 300.38);
generalPath.lineTo(255.85997, 299.9);
generalPath.lineTo(255.85997, 295.44);
generalPath.lineTo(257.61996, 294.94);
generalPath.lineTo(257.61996, 290.89);
generalPath.curveTo(256.53998, 290.54, 255.77997, 289.57, 255.77997, 288.44);
generalPath.curveTo(255.77997, 287.01, 256.99997, 285.86002, 258.50998, 285.86002);
generalPath.curveTo(259.72998, 285.86002, 260.75998, 286.6, 261.11996, 287.64);
generalPath.lineTo(264.20996, 287.64);
generalPath.lineTo(264.71997, 285.97);
generalPath.lineTo(269.42996, 285.97);
generalPath.lineTo(269.93997, 287.64);
generalPath.lineTo(272.61996, 287.64);
generalPath.curveTo(272.9769, 286.60892, 273.98254, 285.8727, 275.17892, 285.86017);
generalPath.lineTo(275.25003, 294.23);
generalPath.lineTo(274.40002, 294.23);
generalPath.lineTo(274.40002, 296.84);
generalPath.lineTo(275.24503, 296.84);
generalPath.lineTo(275.22363, 318.43);
generalPath.lineTo(274.44003, 318.43);
generalPath.lineTo(274.44003, 321.03998);
generalPath.lineTo(275.21948, 321.03998);
generalPath.closePath();
generalPath.moveTo(269.2603, 314.7699);
generalPath.lineTo(267.9703, 313.7299);
generalPath.lineTo(266.1903, 315.7099);
generalPath.lineTo(267.48032, 316.7499);
generalPath.closePath();
generalPath.moveTo(259.30032, 296.3299);
generalPath.lineTo(257.61032, 296.3299);
generalPath.lineTo(257.6003, 298.93988);
generalPath.lineTo(259.30032, 298.93988);
generalPath.closePath();
generalPath.moveTo(268.46033, 307.7399);
generalPath.lineTo(268.46033, 306.1399);
generalPath.lineTo(265.61032, 306.1399);
generalPath.lineTo(265.61032, 307.7399);
generalPath.closePath();
generalPath.moveTo(257.86032, 317.4299);
generalPath.lineTo(256.1003, 317.0399);
generalPath.lineTo(255.85031, 312.58987);
generalPath.lineTo(257.6003, 312.0099);
generalPath.lineTo(257.6003, 314.5699);
generalPath.curveTo(257.6003, 315.55988, 257.6903, 316.4899, 257.86032, 317.42987);
generalPath.closePath();
generalPath.moveTo(259.3203, 311.9099);
generalPath.lineTo(261.0703, 312.31992);
generalPath.curveTo(261.0703, 312.31992, 261.1603, 315.1899, 261.1203, 314.53992);
generalPath.curveTo(261.0803, 313.79993, 261.3103, 316.7799, 261.3103, 316.7799);
generalPath.lineTo(259.5503, 317.3599);
generalPath.curveTo(259.3703, 316.4599, 259.3103, 315.5199, 259.3103, 314.5699);
generalPath.closePath();
generalPath.moveTo(270.1303, 328.8399);
generalPath.lineTo(270.52032, 327.1399);
generalPath.curveTo(269.00034, 326.65988, 267.59033, 325.9599, 266.3503, 325.0499);
generalPath.lineTo(265.0903, 326.15988);
generalPath.curveTo(266.5703, 327.30988, 268.2803, 328.23987, 270.1303, 328.83987);
generalPath.closePath();
generalPath.moveTo(269.2803, 330.2799);
generalPath.lineTo(267.98032, 331.4999);
generalPath.curveTo(266.5103, 330.9599, 265.12033, 330.2399, 263.86032, 329.38992);
generalPath.lineTo(264.24033, 327.61993);
generalPath.curveTo(265.74033, 328.74994, 267.45032, 329.64993, 269.28033, 330.27994);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 550.4299926757812f, 0.0f));
// _0_2_2_2_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_2_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(272.71, 306.14);
generalPath.curveTo(272.75998, 306.0, 272.83, 305.87003, 272.9, 305.74002);
generalPath.lineTo(268.63998, 301.00003);
generalPath.lineTo(266.96997, 301.72003);
generalPath.lineTo(263.90997, 298.33002);
generalPath.lineTo(264.90997, 296.87003);
generalPath.lineTo(259.56998, 290.88004);
generalPath.curveTo(259.49997, 290.90002, 259.36996, 290.90002, 259.3, 290.92004);
generalPath.lineTo(259.33, 294.94003);
generalPath.lineTo(261.08, 295.44003);
generalPath.lineTo(261.08, 299.90002);
generalPath.lineTo(259.33, 300.38004);
generalPath.lineTo(259.3, 304.46002);
generalPath.curveTo(260.13998, 304.72003, 260.78, 305.34003, 261.03998, 306.13004);
generalPath.lineTo(264.24997, 306.14005);
generalPath.lineTo(264.75998, 304.47003);
generalPath.lineTo(269.47998, 304.47003);
generalPath.lineTo(269.97998, 306.14005);
generalPath.closePath();
generalPath.moveTo(265.72998, 287.64);
generalPath.lineTo(265.72998, 289.25);
generalPath.lineTo(268.49, 289.25);
generalPath.lineTo(268.49, 287.64);
generalPath.closePath();
generalPath.moveTo(258.43, 308.01);
generalPath.curveTo(259.07, 308.01, 259.59, 307.52002, 259.59, 306.91);
generalPath.curveTo(259.59, 306.3, 259.07, 305.80002, 258.43, 305.80002);
generalPath.curveTo(257.78, 305.80002, 257.25998, 306.30002, 257.25998, 306.91);
generalPath.curveTo(257.25998, 307.52, 257.77997, 308.01, 258.43, 308.01);
generalPath.closePath();
generalPath.moveTo(274.41998, 298.28);
generalPath.lineTo(272.65997, 297.8);
generalPath.lineTo(272.65997, 293.34);
generalPath.lineTo(274.41998, 292.84);
generalPath.lineTo(274.40997, 290.91998);
generalPath.curveTo(273.55997, 290.66998, 272.89996, 290.05, 272.61996, 289.24997);
generalPath.lineTo(269.93997, 289.24997);
generalPath.lineTo(269.42996, 290.91998);
generalPath.lineTo(264.71997, 290.91998);
generalPath.lineTo(264.20996, 289.24997);
generalPath.lineTo(261.11996, 289.24997);
generalPath.curveTo(261.03998, 289.46997, 260.94995, 289.66998, 260.82996, 289.85995);
generalPath.lineTo(266.20996, 295.81995);
generalPath.lineTo(267.87997, 295.10995);
generalPath.lineTo(270.93997, 298.50995);
generalPath.lineTo(269.93997, 299.95996);
generalPath.lineTo(274.11996, 304.59998);
generalPath.curveTo(274.20996, 304.55997, 274.29996, 304.52, 274.39996, 304.47998);
generalPath.closePath();
generalPath.moveTo(267.16998, 296.88998);
generalPath.lineTo(265.87997, 297.93);
generalPath.lineTo(267.64996, 299.91);
generalPath.lineTo(268.93997, 298.86002);
generalPath.closePath();
generalPath.moveTo(275.17432, 333.0759);
generalPath.curveTo(273.93433, 333.0109, 272.91922, 332.1737, 272.66, 331.05997);
generalPath.curveTo(270.99, 330.82996, 269.41, 330.39996, 267.93, 329.75998);
generalPath.lineTo(268.77, 328.33);
generalPath.curveTo(270.06, 328.87997, 271.43, 329.24, 272.84998, 329.43997);
generalPath.curveTo(273.15997, 328.77997, 273.70996, 328.27997, 274.42996, 328.03998);
generalPath.lineTo(274.43997, 322.41998);
generalPath.lineTo(272.67996, 321.93);
generalPath.lineTo(272.67996, 317.47);
generalPath.lineTo(274.43997, 316.99);
generalPath.lineTo(274.43997, 309.34998);
generalPath.curveTo(274.36996, 309.33, 274.30997, 309.3, 274.23996, 309.25998);
generalPath.lineTo(270.25995, 313.68);
generalPath.lineTo(271.25995, 315.12);
generalPath.lineTo(268.19995, 318.52);
generalPath.lineTo(266.52994, 317.81);
generalPath.lineTo(263.22995, 321.48);
generalPath.curveTo(263.79996, 322.35, 263.77994, 323.48, 263.11996, 324.33002);
generalPath.curveTo(264.05997, 325.38, 265.14996, 326.31003, 266.35995, 327.08002);
generalPath.lineTo(265.51996, 328.52002);
generalPath.curveTo(264.09995, 327.63, 262.81995, 326.53003, 261.72995, 325.30002);
generalPath.curveTo(260.85995, 325.56003, 259.86996, 325.41, 259.12994, 324.80002);
generalPath.curveTo(257.97995, 323.87003, 257.83994, 322.24002, 258.82996, 321.16);
generalPath.lineTo(258.96997, 321.0);
generalPath.curveTo(258.27997, 319.44, 257.80997, 317.76, 257.64996, 316.0);
generalPath.lineTo(259.35995, 316.01);
generalPath.curveTo(259.49997, 317.51, 259.86996, 318.94, 260.44995, 320.28);
generalPath.curveTo(260.93994, 320.22, 261.44995, 320.27, 261.90994, 320.44);
generalPath.lineTo(265.22995, 316.76);
generalPath.lineTo(264.22995, 315.31);
generalPath.lineTo(267.28995, 311.91);
generalPath.lineTo(268.95996, 312.63);
generalPath.lineTo(272.94995, 308.2);
generalPath.curveTo(272.85995, 308.06, 272.79996, 307.91, 272.73996, 307.74002);
generalPath.lineTo(269.97995, 307.75003);
generalPath.lineTo(269.47995, 309.42004);
generalPath.lineTo(264.75995, 309.42004);
generalPath.lineTo(264.24994, 307.75003);
generalPath.lineTo(261.00995, 307.74002);
generalPath.curveTo(260.73996, 308.50003, 260.10995, 309.1, 259.31995, 309.36002);
generalPath.lineTo(259.30994, 313.40002);
generalPath.lineTo(257.59995, 313.39);
generalPath.lineTo(257.59995, 309.38);
generalPath.curveTo(256.49994, 309.05002, 255.68994, 308.07, 255.68994, 306.91);
generalPath.curveTo(255.68994, 305.76, 256.50995, 304.76, 257.60995, 304.43);
generalPath.lineTo(257.61996, 300.38);
generalPath.lineTo(255.85997, 299.9);
generalPath.lineTo(255.85997, 295.44);
generalPath.lineTo(257.61996, 294.94);
generalPath.lineTo(257.61996, 290.89);
generalPath.curveTo(256.53998, 290.54, 255.77997, 289.57, 255.77997, 288.44);
generalPath.curveTo(255.77997, 287.01, 256.99997, 285.86002, 258.50998, 285.86002);
generalPath.curveTo(259.72998, 285.86002, 260.75998, 286.6, 261.11996, 287.64);
generalPath.lineTo(264.20996, 287.64);
generalPath.lineTo(264.71997, 285.97);
generalPath.lineTo(269.42996, 285.97);
generalPath.lineTo(269.93997, 287.64);
generalPath.lineTo(272.61996, 287.64);
generalPath.curveTo(272.9769, 286.60892, 273.98254, 285.8727, 275.17892, 285.86017);
generalPath.lineTo(275.25003, 294.23);
generalPath.lineTo(274.40002, 294.23);
generalPath.lineTo(274.40002, 296.84);
generalPath.lineTo(275.24503, 296.84);
generalPath.lineTo(275.22363, 318.43);
generalPath.lineTo(274.44003, 318.43);
generalPath.lineTo(274.44003, 321.03998);
generalPath.lineTo(275.21948, 321.03998);
generalPath.closePath();
generalPath.moveTo(269.2603, 314.7699);
generalPath.lineTo(267.9703, 313.7299);
generalPath.lineTo(266.1903, 315.7099);
generalPath.lineTo(267.48032, 316.7499);
generalPath.closePath();
generalPath.moveTo(259.30032, 296.3299);
generalPath.lineTo(257.61032, 296.3299);
generalPath.lineTo(257.6003, 298.93988);
generalPath.lineTo(259.30032, 298.93988);
generalPath.closePath();
generalPath.moveTo(268.46033, 307.7399);
generalPath.lineTo(268.46033, 306.1399);
generalPath.lineTo(265.61032, 306.1399);
generalPath.lineTo(265.61032, 307.7399);
generalPath.closePath();
generalPath.moveTo(257.86032, 317.4299);
generalPath.lineTo(256.1003, 317.0399);
generalPath.lineTo(255.85031, 312.58987);
generalPath.lineTo(257.6003, 312.0099);
generalPath.lineTo(257.6003, 314.5699);
generalPath.curveTo(257.6003, 315.55988, 257.6903, 316.4899, 257.86032, 317.42987);
generalPath.closePath();
generalPath.moveTo(259.3203, 311.9099);
generalPath.lineTo(261.0703, 312.31992);
generalPath.curveTo(261.0703, 312.31992, 261.1603, 315.1899, 261.1203, 314.53992);
generalPath.curveTo(261.0803, 313.79993, 261.3103, 316.7799, 261.3103, 316.7799);
generalPath.lineTo(259.5503, 317.3599);
generalPath.curveTo(259.3703, 316.4599, 259.3103, 315.5199, 259.3103, 314.5699);
generalPath.closePath();
generalPath.moveTo(270.1303, 328.8399);
generalPath.lineTo(270.52032, 327.1399);
generalPath.curveTo(269.00034, 326.65988, 267.59033, 325.9599, 266.3503, 325.0499);
generalPath.lineTo(265.0903, 326.15988);
generalPath.curveTo(266.5703, 327.30988, 268.2803, 328.23987, 270.1303, 328.83987);
generalPath.closePath();
generalPath.moveTo(269.2803, 330.2799);
generalPath.lineTo(267.98032, 331.4999);
generalPath.curveTo(266.5103, 330.9599, 265.12033, 330.2399, 263.86032, 329.38992);
generalPath.lineTo(264.24033, 327.61993);
generalPath.curveTo(265.74033, 328.74994, 267.45032, 329.64993, 269.28033, 330.27994);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(200, 177, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(272.71, 306.14);
generalPath.curveTo(272.75998, 306.0, 272.83, 305.87003, 272.9, 305.74002);
generalPath.lineTo(268.63998, 301.00003);
generalPath.lineTo(266.96997, 301.72003);
generalPath.lineTo(263.90997, 298.33002);
generalPath.lineTo(264.90997, 296.87003);
generalPath.lineTo(259.56998, 290.88004);
generalPath.curveTo(259.49997, 290.90002, 259.36996, 290.90002, 259.3, 290.92004);
generalPath.lineTo(259.33, 294.94003);
generalPath.lineTo(261.08, 295.44003);
generalPath.lineTo(261.08, 299.90002);
generalPath.lineTo(259.33, 300.38004);
generalPath.lineTo(259.3, 304.46002);
generalPath.curveTo(260.13998, 304.72003, 260.78, 305.34003, 261.03998, 306.13004);
generalPath.lineTo(264.24997, 306.14005);
generalPath.lineTo(264.75998, 304.47003);
generalPath.lineTo(269.47998, 304.47003);
generalPath.lineTo(269.97998, 306.14005);
generalPath.closePath();
generalPath.moveTo(265.72998, 287.64);
generalPath.lineTo(265.72998, 289.25);
generalPath.lineTo(268.49, 289.25);
generalPath.lineTo(268.49, 287.64);
generalPath.closePath();
generalPath.moveTo(258.43, 308.01);
generalPath.curveTo(259.07, 308.01, 259.59, 307.52002, 259.59, 306.91);
generalPath.curveTo(259.59, 306.3, 259.07, 305.80002, 258.43, 305.80002);
generalPath.curveTo(257.78, 305.80002, 257.25998, 306.30002, 257.25998, 306.91);
generalPath.curveTo(257.25998, 307.52, 257.77997, 308.01, 258.43, 308.01);
generalPath.closePath();
generalPath.moveTo(274.41998, 298.28);
generalPath.lineTo(272.65997, 297.8);
generalPath.lineTo(272.65997, 293.34);
generalPath.lineTo(274.41998, 292.84);
generalPath.lineTo(274.40997, 290.91998);
generalPath.curveTo(273.55997, 290.66998, 272.89996, 290.05, 272.61996, 289.24997);
generalPath.lineTo(269.93997, 289.24997);
generalPath.lineTo(269.42996, 290.91998);
generalPath.lineTo(264.71997, 290.91998);
generalPath.lineTo(264.20996, 289.24997);
generalPath.lineTo(261.11996, 289.24997);
generalPath.curveTo(261.03998, 289.46997, 260.94995, 289.66998, 260.82996, 289.85995);
generalPath.lineTo(266.20996, 295.81995);
generalPath.lineTo(267.87997, 295.10995);
generalPath.lineTo(270.93997, 298.50995);
generalPath.lineTo(269.93997, 299.95996);
generalPath.lineTo(274.11996, 304.59998);
generalPath.curveTo(274.20996, 304.55997, 274.29996, 304.52, 274.39996, 304.47998);
generalPath.closePath();
generalPath.moveTo(267.16998, 296.88998);
generalPath.lineTo(265.87997, 297.93);
generalPath.lineTo(267.64996, 299.91);
generalPath.lineTo(268.93997, 298.86002);
generalPath.closePath();
generalPath.moveTo(275.17432, 333.0759);
generalPath.curveTo(273.93433, 333.0109, 272.91922, 332.1737, 272.66, 331.05997);
generalPath.curveTo(270.99, 330.82996, 269.41, 330.39996, 267.93, 329.75998);
generalPath.lineTo(268.77, 328.33);
generalPath.curveTo(270.06, 328.87997, 271.43, 329.24, 272.84998, 329.43997);
generalPath.curveTo(273.15997, 328.77997, 273.70996, 328.27997, 274.42996, 328.03998);
generalPath.lineTo(274.43997, 322.41998);
generalPath.lineTo(272.67996, 321.93);
generalPath.lineTo(272.67996, 317.47);
generalPath.lineTo(274.43997, 316.99);
generalPath.lineTo(274.43997, 309.34998);
generalPath.curveTo(274.36996, 309.33, 274.30997, 309.3, 274.23996, 309.25998);
generalPath.lineTo(270.25995, 313.68);
generalPath.lineTo(271.25995, 315.12);
generalPath.lineTo(268.19995, 318.52);
generalPath.lineTo(266.52994, 317.81);
generalPath.lineTo(263.22995, 321.48);
generalPath.curveTo(263.79996, 322.35, 263.77994, 323.48, 263.11996, 324.33002);
generalPath.curveTo(264.05997, 325.38, 265.14996, 326.31003, 266.35995, 327.08002);
generalPath.lineTo(265.51996, 328.52002);
generalPath.curveTo(264.09995, 327.63, 262.81995, 326.53003, 261.72995, 325.30002);
generalPath.curveTo(260.85995, 325.56003, 259.86996, 325.41, 259.12994, 324.80002);
generalPath.curveTo(257.97995, 323.87003, 257.83994, 322.24002, 258.82996, 321.16);
generalPath.lineTo(258.96997, 321.0);
generalPath.curveTo(258.27997, 319.44, 257.80997, 317.76, 257.64996, 316.0);
generalPath.lineTo(259.35995, 316.01);
generalPath.curveTo(259.49997, 317.51, 259.86996, 318.94, 260.44995, 320.28);
generalPath.curveTo(260.93994, 320.22, 261.44995, 320.27, 261.90994, 320.44);
generalPath.lineTo(265.22995, 316.76);
generalPath.lineTo(264.22995, 315.31);
generalPath.lineTo(267.28995, 311.91);
generalPath.lineTo(268.95996, 312.63);
generalPath.lineTo(272.94995, 308.2);
generalPath.curveTo(272.85995, 308.06, 272.79996, 307.91, 272.73996, 307.74002);
generalPath.lineTo(269.97995, 307.75003);
generalPath.lineTo(269.47995, 309.42004);
generalPath.lineTo(264.75995, 309.42004);
generalPath.lineTo(264.24994, 307.75003);
generalPath.lineTo(261.00995, 307.74002);
generalPath.curveTo(260.73996, 308.50003, 260.10995, 309.1, 259.31995, 309.36002);
generalPath.lineTo(259.30994, 313.40002);
generalPath.lineTo(257.59995, 313.39);
generalPath.lineTo(257.59995, 309.38);
generalPath.curveTo(256.49994, 309.05002, 255.68994, 308.07, 255.68994, 306.91);
generalPath.curveTo(255.68994, 305.76, 256.50995, 304.76, 257.60995, 304.43);
generalPath.lineTo(257.61996, 300.38);
generalPath.lineTo(255.85997, 299.9);
generalPath.lineTo(255.85997, 295.44);
generalPath.lineTo(257.61996, 294.94);

}

private void _paint11(Graphics2D g,float origAlpha) {
generalPath.lineTo(257.61996, 290.89);
generalPath.curveTo(256.53998, 290.54, 255.77997, 289.57, 255.77997, 288.44);
generalPath.curveTo(255.77997, 287.01, 256.99997, 285.86002, 258.50998, 285.86002);
generalPath.curveTo(259.72998, 285.86002, 260.75998, 286.6, 261.11996, 287.64);
generalPath.lineTo(264.20996, 287.64);
generalPath.lineTo(264.71997, 285.97);
generalPath.lineTo(269.42996, 285.97);
generalPath.lineTo(269.93997, 287.64);
generalPath.lineTo(272.61996, 287.64);
generalPath.curveTo(272.9769, 286.60892, 273.98254, 285.8727, 275.17892, 285.86017);
generalPath.lineTo(275.25003, 294.23);
generalPath.lineTo(274.40002, 294.23);
generalPath.lineTo(274.40002, 296.84);
generalPath.lineTo(275.24503, 296.84);
generalPath.lineTo(275.22363, 318.43);
generalPath.lineTo(274.44003, 318.43);
generalPath.lineTo(274.44003, 321.03998);
generalPath.lineTo(275.21948, 321.03998);
generalPath.closePath();
generalPath.moveTo(269.2603, 314.7699);
generalPath.lineTo(267.9703, 313.7299);
generalPath.lineTo(266.1903, 315.7099);
generalPath.lineTo(267.48032, 316.7499);
generalPath.closePath();
generalPath.moveTo(259.30032, 296.3299);
generalPath.lineTo(257.61032, 296.3299);
generalPath.lineTo(257.6003, 298.93988);
generalPath.lineTo(259.30032, 298.93988);
generalPath.closePath();
generalPath.moveTo(268.46033, 307.7399);
generalPath.lineTo(268.46033, 306.1399);
generalPath.lineTo(265.61032, 306.1399);
generalPath.lineTo(265.61032, 307.7399);
generalPath.closePath();
generalPath.moveTo(257.86032, 317.4299);
generalPath.lineTo(256.1003, 317.0399);
generalPath.lineTo(255.85031, 312.58987);
generalPath.lineTo(257.6003, 312.0099);
generalPath.lineTo(257.6003, 314.5699);
generalPath.curveTo(257.6003, 315.55988, 257.6903, 316.4899, 257.86032, 317.42987);
generalPath.closePath();
generalPath.moveTo(259.3203, 311.9099);
generalPath.lineTo(261.0703, 312.31992);
generalPath.curveTo(261.0703, 312.31992, 261.1603, 315.1899, 261.1203, 314.53992);
generalPath.curveTo(261.0803, 313.79993, 261.3103, 316.7799, 261.3103, 316.7799);
generalPath.lineTo(259.5503, 317.3599);
generalPath.curveTo(259.3703, 316.4599, 259.3103, 315.5199, 259.3103, 314.5699);
generalPath.closePath();
generalPath.moveTo(270.1303, 328.8399);
generalPath.lineTo(270.52032, 327.1399);
generalPath.curveTo(269.00034, 326.65988, 267.59033, 325.9599, 266.3503, 325.0499);
generalPath.lineTo(265.0903, 326.15988);
generalPath.curveTo(266.5703, 327.30988, 268.2803, 328.23987, 270.1303, 328.83987);
generalPath.closePath();
generalPath.moveTo(269.2803, 330.2799);
generalPath.lineTo(267.98032, 331.4999);
generalPath.curveTo(266.5103, 330.9599, 265.12033, 330.2399, 263.86032, 329.38992);
generalPath.lineTo(264.24033, 327.61993);
generalPath.curveTo(265.74033, 328.74994, 267.45032, 329.64993, 269.28033, 330.27994);
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
// _0_2_2_2_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(272.59, 306.94);
generalPath.curveTo(272.59, 305.5, 273.82, 304.34, 275.33, 304.34);
generalPath.curveTo(276.83997, 304.34, 278.06, 305.5, 278.06, 306.94);
generalPath.curveTo(278.06, 308.37, 276.84, 309.52, 275.33, 309.52);
generalPath.curveTo(273.81998, 309.52, 272.59, 308.37, 272.59, 306.94);
shape = generalPath;
paint = new Color(5, 142, 110, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(200.12, 281.25);
generalPath.lineTo(250.29999, 281.25);
generalPath.lineTo(250.29999, 225.53);
generalPath.lineTo(200.12, 225.53);
generalPath.lineTo(200.12, 281.25);
generalPath.closePath();
shape = generalPath;
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(200.12, 281.25);
generalPath.lineTo(250.29999, 281.25);
generalPath.lineTo(250.29999, 225.53);
generalPath.lineTo(200.12, 225.53);
generalPath.lineTo(200.12, 281.25);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(217.34, 238.41);
generalPath.lineTo(216.42, 238.41);
generalPath.lineTo(216.42, 237.49);
generalPath.lineTo(214.8, 237.49);
generalPath.lineTo(214.8, 241.18001);
generalPath.lineTo(216.42, 241.18001);
generalPath.lineTo(216.42, 243.73001);
generalPath.lineTo(212.95, 243.73001);
generalPath.lineTo(212.95, 251.12001);
generalPath.lineTo(214.8, 251.12001);
generalPath.lineTo(214.8, 265.91);
generalPath.lineTo(211.1, 265.91);
generalPath.lineTo(211.1, 273.54);
generalPath.lineTo(239.52, 273.54);
generalPath.lineTo(239.52, 265.91);
generalPath.lineTo(235.83, 265.91);
generalPath.lineTo(235.83, 251.12001);
generalPath.lineTo(237.68001, 251.12001);
generalPath.lineTo(237.68001, 243.73001);
generalPath.lineTo(234.21, 243.73001);
generalPath.lineTo(234.21, 241.18001);
generalPath.lineTo(235.83, 241.18001);
generalPath.lineTo(235.83, 237.49);
generalPath.lineTo(234.21, 237.49);
generalPath.lineTo(234.21, 238.41);
generalPath.lineTo(233.28001, 238.41);
generalPath.lineTo(233.28001, 237.49);
generalPath.lineTo(231.67001, 237.49);
generalPath.lineTo(231.67001, 238.41);
generalPath.lineTo(230.51001, 238.41);
generalPath.lineTo(230.51001, 237.49);
generalPath.lineTo(228.89001, 237.49);
generalPath.lineTo(228.89001, 241.18001);
generalPath.lineTo(230.51001, 241.18001);
generalPath.lineTo(230.51001, 243.73001);
generalPath.lineTo(227.05, 243.73001);
generalPath.lineTo(227.05, 235.64001);
generalPath.lineTo(228.89, 235.64001);
generalPath.lineTo(228.89, 231.94002);
generalPath.lineTo(227.05, 231.94002);
generalPath.lineTo(227.05, 232.87001);
generalPath.lineTo(226.12001, 232.87001);
generalPath.lineTo(226.12001, 231.94002);
generalPath.lineTo(224.50002, 231.94002);
generalPath.lineTo(224.50002, 232.87001);
generalPath.lineTo(223.58002, 232.87001);
generalPath.lineTo(223.58002, 231.94002);
generalPath.lineTo(221.73001, 231.94002);
generalPath.lineTo(221.73001, 235.64001);
generalPath.lineTo(223.58002, 235.64001);
generalPath.lineTo(223.58002, 243.73001);
generalPath.lineTo(220.11002, 243.73001);
generalPath.lineTo(220.11002, 241.18001);
generalPath.lineTo(221.73001, 241.18001);
generalPath.lineTo(221.73001, 237.49);
generalPath.lineTo(220.11002, 237.49);
generalPath.lineTo(220.11002, 238.41);
generalPath.lineTo(219.19002, 238.41);
generalPath.lineTo(219.19002, 237.49);
generalPath.lineTo(217.34001, 237.49);
generalPath.lineTo(217.34001, 238.41);
generalPath.closePath();
generalPath.moveTo(211.09999, 273.54);
generalPath.lineTo(239.51999, 273.54);
generalPath.moveTo(211.09999, 271.69);
generalPath.lineTo(239.51999, 271.69);
generalPath.moveTo(211.09999, 269.84);
generalPath.lineTo(239.51999, 269.84);
generalPath.moveTo(211.09999, 267.99);
generalPath.lineTo(239.51999, 267.99);
generalPath.moveTo(211.09999, 265.91);
generalPath.lineTo(239.51999, 265.91);
generalPath.moveTo(214.79999, 264.29);
generalPath.lineTo(235.82999, 264.29);
generalPath.moveTo(214.79999, 262.44);
generalPath.lineTo(235.82999, 262.44);
generalPath.moveTo(214.79999, 260.36002);
generalPath.lineTo(235.82999, 260.36002);
generalPath.moveTo(214.79999, 258.52002);
generalPath.lineTo(235.82999, 258.52002);
generalPath.moveTo(214.79999, 256.67);
generalPath.lineTo(235.82999, 256.67);
generalPath.moveTo(214.79999, 254.82);
generalPath.lineTo(235.82999, 254.82);
generalPath.moveTo(214.79999, 252.97);
generalPath.lineTo(235.82999, 252.97);
generalPath.moveTo(212.94998, 251.12);
generalPath.lineTo(237.67998, 251.12);
generalPath.moveTo(212.94998, 249.26999);
generalPath.lineTo(237.67998, 249.26999);
generalPath.moveTo(212.94998, 247.41998);
generalPath.lineTo(237.67998, 247.41998);
generalPath.moveTo(212.94998, 245.57999);
generalPath.lineTo(237.67998, 245.57999);
generalPath.moveTo(216.41998, 243.72998);
generalPath.lineTo(234.20999, 243.72998);
generalPath.moveTo(223.57999, 241.87997);
generalPath.lineTo(227.04999, 241.87997);
generalPath.moveTo(223.57999, 240.02997);
generalPath.lineTo(227.04999, 240.02997);
generalPath.moveTo(223.57999, 238.17996);
generalPath.lineTo(227.04999, 238.17996);
generalPath.moveTo(223.57999, 236.32996);
generalPath.lineTo(227.04999, 236.32996);
generalPath.moveTo(221.72998, 234.01996);
generalPath.lineTo(228.88998, 234.01996);
generalPath.moveTo(216.41998, 241.87996);
generalPath.lineTo(220.10999, 241.87996);
generalPath.moveTo(214.79999, 239.56996);
generalPath.lineTo(221.72998, 239.56996);
generalPath.moveTo(214.79999, 273.53998);
generalPath.lineTo(214.79999, 271.68997);
generalPath.moveTo(214.79999, 269.83997);
generalPath.lineTo(214.79999, 267.98996);
generalPath.moveTo(212.94998, 269.83997);
generalPath.lineTo(212.94998, 271.68997);
generalPath.moveTo(216.41998, 271.68997);
generalPath.lineTo(216.41998, 269.83997);
generalPath.moveTo(218.25998, 273.53998);
generalPath.lineTo(218.25998, 271.68997);
generalPath.moveTo(218.25998, 269.83997);
generalPath.lineTo(218.25998, 267.98996);
generalPath.moveTo(218.25998, 265.90997);
generalPath.lineTo(218.25998, 264.28998);
generalPath.moveTo(218.25998, 262.43997);
generalPath.lineTo(218.25998, 260.36);
generalPath.moveTo(216.41998, 267.99);
generalPath.lineTo(216.41998, 265.91);
generalPath.moveTo(212.94998, 267.99);
generalPath.lineTo(212.94998, 265.91);
generalPath.moveTo(220.10999, 265.91);
generalPath.lineTo(220.10999, 267.99);
generalPath.moveTo(221.72998, 265.91);
generalPath.lineTo(221.72998, 264.29);
generalPath.moveTo(216.41998, 262.44);
generalPath.lineTo(216.41998, 264.29);
generalPath.moveTo(220.10999, 262.44);
generalPath.lineTo(220.10999, 264.29);
generalPath.moveTo(223.57999, 262.44);
generalPath.lineTo(223.57999, 264.29);
generalPath.moveTo(221.72998, 262.44);
generalPath.lineTo(221.72998, 260.36002);
generalPath.moveTo(223.57999, 258.52002);
generalPath.lineTo(223.57999, 260.36002);
generalPath.moveTo(223.57999, 254.82002);
generalPath.lineTo(223.57999, 256.67);
generalPath.moveTo(221.72998, 252.97002);
generalPath.lineTo(221.72998, 254.82002);
generalPath.moveTo(223.57999, 251.12003);
generalPath.lineTo(223.57999, 252.97003);
generalPath.moveTo(220.10999, 251.12003);
generalPath.lineTo(220.10999, 252.97003);
generalPath.moveTo(216.41998, 251.12003);
generalPath.lineTo(216.41998, 252.97003);
generalPath.moveTo(214.79999, 249.27003);
generalPath.lineTo(214.79999, 251.12004);
generalPath.moveTo(218.26, 249.27003);
generalPath.lineTo(218.26, 251.12004);
generalPath.moveTo(221.73, 249.27003);
generalPath.lineTo(221.73, 251.12004);
generalPath.moveTo(223.58, 247.42004);
generalPath.lineTo(223.58, 249.27005);
generalPath.moveTo(220.11, 247.42004);
generalPath.lineTo(220.11, 249.27005);
generalPath.moveTo(216.42, 247.42004);
generalPath.lineTo(216.42, 249.27005);
generalPath.moveTo(214.8, 245.58005);
generalPath.lineTo(214.8, 247.42004);
generalPath.moveTo(221.73, 245.58005);
generalPath.lineTo(221.73, 247.42004);
generalPath.moveTo(218.26, 241.88005);
generalPath.lineTo(218.26, 243.73006);
generalPath.moveTo(234.20999, 241.88005);
generalPath.lineTo(230.51, 241.88005);
generalPath.moveTo(235.83, 239.57005);
generalPath.lineTo(228.89, 239.57005);
generalPath.moveTo(235.83, 273.54004);
generalPath.lineTo(235.83, 271.69003);
generalPath.moveTo(235.83, 269.84003);
generalPath.lineTo(235.83, 267.99002);
generalPath.moveTo(237.68001, 269.84003);
generalPath.lineTo(237.68001, 271.69003);
generalPath.moveTo(234.21, 271.69003);
generalPath.lineTo(234.21, 269.84003);
generalPath.moveTo(232.36, 273.54004);
generalPath.lineTo(232.36, 271.69003);
generalPath.moveTo(232.36, 269.84003);
generalPath.lineTo(232.36, 267.99002);
generalPath.moveTo(232.36, 265.91003);
generalPath.lineTo(232.36, 264.29004);
generalPath.moveTo(232.36, 262.44003);
generalPath.lineTo(232.36, 260.36005);
generalPath.moveTo(234.21, 267.99005);
generalPath.lineTo(234.21, 265.91006);
generalPath.moveTo(237.68001, 267.99005);
generalPath.lineTo(237.68001, 265.91006);
generalPath.moveTo(230.51001, 265.91006);
generalPath.lineTo(230.51001, 267.99005);
generalPath.moveTo(228.89001, 265.91006);
generalPath.lineTo(228.89001, 264.29007);
generalPath.moveTo(234.21002, 262.44006);
generalPath.lineTo(234.21002, 264.29007);
generalPath.moveTo(230.51003, 262.44006);
generalPath.lineTo(230.51003, 264.29007);
generalPath.moveTo(227.05002, 262.44006);
generalPath.lineTo(227.05002, 264.29007);
generalPath.moveTo(228.89001, 262.44006);
generalPath.lineTo(228.89001, 260.36008);
generalPath.moveTo(227.05002, 258.52008);
generalPath.lineTo(227.05002, 260.36008);
generalPath.moveTo(227.05002, 254.82008);
generalPath.lineTo(227.05002, 256.67007);
generalPath.moveTo(228.89001, 252.97008);
generalPath.lineTo(228.89001, 254.82008);
generalPath.moveTo(227.05002, 251.12009);
generalPath.lineTo(227.05002, 252.9701);
generalPath.moveTo(230.51003, 251.12009);
generalPath.lineTo(230.51003, 252.9701);
generalPath.moveTo(234.21002, 251.12009);
generalPath.lineTo(234.21002, 252.9701);
generalPath.moveTo(235.83002, 249.2701);
generalPath.lineTo(235.83002, 251.1201);
generalPath.moveTo(232.36002, 249.2701);
generalPath.lineTo(232.36002, 251.1201);
generalPath.moveTo(228.89001, 249.2701);
generalPath.lineTo(228.89001, 251.1201);
generalPath.moveTo(227.05002, 247.4201);
generalPath.lineTo(227.05002, 249.27011);
generalPath.moveTo(230.51003, 247.4201);
generalPath.lineTo(230.51003, 249.27011);
generalPath.moveTo(234.21002, 247.4201);
generalPath.lineTo(234.21002, 249.27011);
generalPath.moveTo(235.83002, 245.58011);
generalPath.lineTo(235.83002, 247.4201);
generalPath.moveTo(228.89001, 245.58011);
generalPath.lineTo(228.89001, 247.4201);
generalPath.moveTo(232.36002, 241.88011);
generalPath.lineTo(232.36002, 243.73012);
generalPath.moveTo(225.20001, 262.44012);
generalPath.lineTo(225.20001, 260.36014);
generalPath.moveTo(225.20001, 254.82014);
generalPath.lineTo(225.20001, 252.97014);
generalPath.moveTo(225.20001, 258.52014);
generalPath.lineTo(225.20001, 256.67014);
generalPath.moveTo(225.20001, 251.12013);
generalPath.lineTo(225.20001, 249.27013);
generalPath.moveTo(225.20001, 247.42012);
generalPath.lineTo(225.20001, 245.58012);
generalPath.moveTo(225.20001, 241.88013);
generalPath.lineTo(225.20001, 240.03012);
generalPath.moveTo(225.20001, 238.18011);
generalPath.lineTo(225.20001, 236.33011);
generalPath.moveTo(216.42001, 241.18011);
generalPath.lineTo(220.11002, 241.18011);
generalPath.moveTo(223.58002, 235.64012);
generalPath.lineTo(227.05002, 235.64012);
generalPath.moveTo(230.51003, 241.18011);
generalPath.lineTo(234.21002, 241.18011);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.46f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(217.34, 238.41);
generalPath.lineTo(216.42, 238.41);
generalPath.lineTo(216.42, 237.49);
generalPath.lineTo(214.8, 237.49);
generalPath.lineTo(214.8, 241.18001);
generalPath.lineTo(216.42, 241.18001);
generalPath.lineTo(216.42, 243.73001);
generalPath.lineTo(212.95, 243.73001);
generalPath.lineTo(212.95, 251.12001);
generalPath.lineTo(214.8, 251.12001);
generalPath.lineTo(214.8, 265.91);
generalPath.lineTo(211.1, 265.91);
generalPath.lineTo(211.1, 273.54);
generalPath.lineTo(239.52, 273.54);
generalPath.lineTo(239.52, 265.91);
generalPath.lineTo(235.83, 265.91);
generalPath.lineTo(235.83, 251.12001);
generalPath.lineTo(237.68001, 251.12001);
generalPath.lineTo(237.68001, 243.73001);
generalPath.lineTo(234.21, 243.73001);
generalPath.lineTo(234.21, 241.18001);
generalPath.lineTo(235.83, 241.18001);
generalPath.lineTo(235.83, 237.49);
generalPath.lineTo(234.21, 237.49);
generalPath.lineTo(234.21, 238.41);
generalPath.lineTo(233.28001, 238.41);
generalPath.lineTo(233.28001, 237.49);
generalPath.lineTo(231.67001, 237.49);
generalPath.lineTo(231.67001, 238.41);
generalPath.lineTo(230.51001, 238.41);
generalPath.lineTo(230.51001, 237.49);
generalPath.lineTo(228.89001, 237.49);
generalPath.lineTo(228.89001, 241.18001);
generalPath.lineTo(230.51001, 241.18001);
generalPath.lineTo(230.51001, 243.73001);
generalPath.lineTo(227.05, 243.73001);
generalPath.lineTo(227.05, 235.64001);
generalPath.lineTo(228.89, 235.64001);
generalPath.lineTo(228.89, 231.94002);
generalPath.lineTo(227.05, 231.94002);
generalPath.lineTo(227.05, 232.87001);
generalPath.lineTo(226.12001, 232.87001);
generalPath.lineTo(226.12001, 231.94002);
generalPath.lineTo(224.50002, 231.94002);
generalPath.lineTo(224.50002, 232.87001);
generalPath.lineTo(223.58002, 232.87001);
generalPath.lineTo(223.58002, 231.94002);
generalPath.lineTo(221.73001, 231.94002);
generalPath.lineTo(221.73001, 235.64001);
generalPath.lineTo(223.58002, 235.64001);
generalPath.lineTo(223.58002, 243.73001);
generalPath.lineTo(220.11002, 243.73001);
generalPath.lineTo(220.11002, 241.18001);
generalPath.lineTo(221.73001, 241.18001);
generalPath.lineTo(221.73001, 237.49);
generalPath.lineTo(220.11002, 237.49);
generalPath.lineTo(220.11002, 238.41);
generalPath.lineTo(219.19002, 238.41);
generalPath.lineTo(219.19002, 237.49);
generalPath.lineTo(217.34001, 237.49);
generalPath.lineTo(217.34001, 238.41);
generalPath.closePath();
generalPath.moveTo(211.09999, 273.54);
generalPath.lineTo(239.51999, 273.54);
generalPath.moveTo(211.09999, 271.69);
generalPath.lineTo(239.51999, 271.69);
generalPath.moveTo(211.09999, 269.84);
generalPath.lineTo(239.51999, 269.84);
generalPath.moveTo(211.09999, 267.99);
generalPath.lineTo(239.51999, 267.99);
generalPath.moveTo(211.09999, 265.91);
generalPath.lineTo(239.51999, 265.91);
generalPath.moveTo(214.79999, 264.29);
generalPath.lineTo(235.82999, 264.29);
generalPath.moveTo(214.79999, 262.44);
generalPath.lineTo(235.82999, 262.44);
generalPath.moveTo(214.79999, 260.36002);
generalPath.lineTo(235.82999, 260.36002);
generalPath.moveTo(214.79999, 258.52002);
generalPath.lineTo(235.82999, 258.52002);
generalPath.moveTo(214.79999, 256.67);
generalPath.lineTo(235.82999, 256.67);
generalPath.moveTo(214.79999, 254.82);
generalPath.lineTo(235.82999, 254.82);
generalPath.moveTo(214.79999, 252.97);
generalPath.lineTo(235.82999, 252.97);
generalPath.moveTo(212.94998, 251.12);
generalPath.lineTo(237.67998, 251.12);
generalPath.moveTo(212.94998, 249.26999);
generalPath.lineTo(237.67998, 249.26999);
generalPath.moveTo(212.94998, 247.41998);
generalPath.lineTo(237.67998, 247.41998);
generalPath.moveTo(212.94998, 245.57999);
generalPath.lineTo(237.67998, 245.57999);
generalPath.moveTo(216.41998, 243.72998);
generalPath.lineTo(234.20999, 243.72998);
generalPath.moveTo(223.57999, 241.87997);
generalPath.lineTo(227.04999, 241.87997);
generalPath.moveTo(223.57999, 240.02997);
generalPath.lineTo(227.04999, 240.02997);
generalPath.moveTo(223.57999, 238.17996);
generalPath.lineTo(227.04999, 238.17996);
generalPath.moveTo(223.57999, 236.32996);
generalPath.lineTo(227.04999, 236.32996);
generalPath.moveTo(221.72998, 234.01996);
generalPath.lineTo(228.88998, 234.01996);
generalPath.moveTo(216.41998, 241.87996);
generalPath.lineTo(220.10999, 241.87996);
generalPath.moveTo(214.79999, 239.56996);
generalPath.lineTo(221.72998, 239.56996);
generalPath.moveTo(214.79999, 273.53998);
generalPath.lineTo(214.79999, 271.68997);
generalPath.moveTo(214.79999, 269.83997);
generalPath.lineTo(214.79999, 267.98996);
generalPath.moveTo(212.94998, 269.83997);
generalPath.lineTo(212.94998, 271.68997);
generalPath.moveTo(216.41998, 271.68997);
generalPath.lineTo(216.41998, 269.83997);
generalPath.moveTo(218.25998, 273.53998);
generalPath.lineTo(218.25998, 271.68997);
generalPath.moveTo(218.25998, 269.83997);
generalPath.lineTo(218.25998, 267.98996);
generalPath.moveTo(218.25998, 265.90997);
generalPath.lineTo(218.25998, 264.28998);
generalPath.moveTo(218.25998, 262.43997);
generalPath.lineTo(218.25998, 260.36);
generalPath.moveTo(216.41998, 267.99);
generalPath.lineTo(216.41998, 265.91);
generalPath.moveTo(212.94998, 267.99);
generalPath.lineTo(212.94998, 265.91);
generalPath.moveTo(220.10999, 265.91);
generalPath.lineTo(220.10999, 267.99);
generalPath.moveTo(221.72998, 265.91);
generalPath.lineTo(221.72998, 264.29);
generalPath.moveTo(216.41998, 262.44);
generalPath.lineTo(216.41998, 264.29);
generalPath.moveTo(220.10999, 262.44);
generalPath.lineTo(220.10999, 264.29);
generalPath.moveTo(223.57999, 262.44);
generalPath.lineTo(223.57999, 264.29);
generalPath.moveTo(221.72998, 262.44);
generalPath.lineTo(221.72998, 260.36002);
generalPath.moveTo(223.57999, 258.52002);
generalPath.lineTo(223.57999, 260.36002);
generalPath.moveTo(223.57999, 254.82002);
generalPath.lineTo(223.57999, 256.67);
generalPath.moveTo(221.72998, 252.97002);
generalPath.lineTo(221.72998, 254.82002);
generalPath.moveTo(223.57999, 251.12003);
generalPath.lineTo(223.57999, 252.97003);
generalPath.moveTo(220.10999, 251.12003);
generalPath.lineTo(220.10999, 252.97003);
generalPath.moveTo(216.41998, 251.12003);
generalPath.lineTo(216.41998, 252.97003);
generalPath.moveTo(214.79999, 249.27003);
generalPath.lineTo(214.79999, 251.12004);
generalPath.moveTo(218.26, 249.27003);
generalPath.lineTo(218.26, 251.12004);
generalPath.moveTo(221.73, 249.27003);
generalPath.lineTo(221.73, 251.12004);
generalPath.moveTo(223.58, 247.42004);
generalPath.lineTo(223.58, 249.27005);
generalPath.moveTo(220.11, 247.42004);
generalPath.lineTo(220.11, 249.27005);
generalPath.moveTo(216.42, 247.42004);
generalPath.lineTo(216.42, 249.27005);
generalPath.moveTo(214.8, 245.58005);
generalPath.lineTo(214.8, 247.42004);
generalPath.moveTo(221.73, 245.58005);
generalPath.lineTo(221.73, 247.42004);
generalPath.moveTo(218.26, 241.88005);
generalPath.lineTo(218.26, 243.73006);
generalPath.moveTo(234.20999, 241.88005);
generalPath.lineTo(230.51, 241.88005);
generalPath.moveTo(235.83, 239.57005);
generalPath.lineTo(228.89, 239.57005);
generalPath.moveTo(235.83, 273.54004);
generalPath.lineTo(235.83, 271.69003);
generalPath.moveTo(235.83, 269.84003);
generalPath.lineTo(235.83, 267.99002);
generalPath.moveTo(237.68001, 269.84003);
generalPath.lineTo(237.68001, 271.69003);
generalPath.moveTo(234.21, 271.69003);
generalPath.lineTo(234.21, 269.84003);
generalPath.moveTo(232.36, 273.54004);
generalPath.lineTo(232.36, 271.69003);
generalPath.moveTo(232.36, 269.84003);
generalPath.lineTo(232.36, 267.99002);
generalPath.moveTo(232.36, 265.91003);
generalPath.lineTo(232.36, 264.29004);
generalPath.moveTo(232.36, 262.44003);
generalPath.lineTo(232.36, 260.36005);
generalPath.moveTo(234.21, 267.99005);
generalPath.lineTo(234.21, 265.91006);
generalPath.moveTo(237.68001, 267.99005);
generalPath.lineTo(237.68001, 265.91006);
generalPath.moveTo(230.51001, 265.91006);
generalPath.lineTo(230.51001, 267.99005);
generalPath.moveTo(228.89001, 265.91006);
generalPath.lineTo(228.89001, 264.29007);
generalPath.moveTo(234.21002, 262.44006);
generalPath.lineTo(234.21002, 264.29007);
generalPath.moveTo(230.51003, 262.44006);
generalPath.lineTo(230.51003, 264.29007);
generalPath.moveTo(227.05002, 262.44006);
generalPath.lineTo(227.05002, 264.29007);
generalPath.moveTo(228.89001, 262.44006);
generalPath.lineTo(228.89001, 260.36008);
generalPath.moveTo(227.05002, 258.52008);
generalPath.lineTo(227.05002, 260.36008);
generalPath.moveTo(227.05002, 254.82008);
generalPath.lineTo(227.05002, 256.67007);
generalPath.moveTo(228.89001, 252.97008);
generalPath.lineTo(228.89001, 254.82008);
generalPath.moveTo(227.05002, 251.12009);
generalPath.lineTo(227.05002, 252.9701);
generalPath.moveTo(230.51003, 251.12009);
generalPath.lineTo(230.51003, 252.9701);
generalPath.moveTo(234.21002, 251.12009);
generalPath.lineTo(234.21002, 252.9701);
generalPath.moveTo(235.83002, 249.2701);
generalPath.lineTo(235.83002, 251.1201);
generalPath.moveTo(232.36002, 249.2701);
generalPath.lineTo(232.36002, 251.1201);
generalPath.moveTo(228.89001, 249.2701);
generalPath.lineTo(228.89001, 251.1201);
generalPath.moveTo(227.05002, 247.4201);
generalPath.lineTo(227.05002, 249.27011);
generalPath.moveTo(230.51003, 247.4201);
generalPath.lineTo(230.51003, 249.27011);
generalPath.moveTo(234.21002, 247.4201);
generalPath.lineTo(234.21002, 249.27011);
generalPath.moveTo(235.83002, 245.58011);
generalPath.lineTo(235.83002, 247.4201);
generalPath.moveTo(228.89001, 245.58011);
generalPath.lineTo(228.89001, 247.4201);
generalPath.moveTo(232.36002, 241.88011);
generalPath.lineTo(232.36002, 243.73012);
generalPath.moveTo(225.20001, 262.44012);
generalPath.lineTo(225.20001, 260.36014);
generalPath.moveTo(225.20001, 254.82014);
generalPath.lineTo(225.20001, 252.97014);
generalPath.moveTo(225.20001, 258.52014);
generalPath.lineTo(225.20001, 256.67014);
generalPath.moveTo(225.20001, 251.12013);
generalPath.lineTo(225.20001, 249.27013);
generalPath.moveTo(225.20001, 247.42012);
generalPath.lineTo(225.20001, 245.58012);
generalPath.moveTo(225.20001, 241.88013);
generalPath.lineTo(225.20001, 240.03012);
generalPath.moveTo(225.20001, 238.18011);
generalPath.lineTo(225.20001, 236.33011);
generalPath.moveTo(216.42001, 241.18011);
generalPath.lineTo(220.11002, 241.18011);
generalPath.moveTo(223.58002, 235.64012);
generalPath.lineTo(227.05002, 235.64012);
generalPath.moveTo(230.51003, 241.18011);
generalPath.lineTo(234.21002, 241.18011);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(230.05, 273.54);
generalPath.lineTo(230.05, 268.68002);
generalPath.curveTo(230.05, 267.76, 229.59, 264.98, 225.2, 264.98);
generalPath.curveTo(221.04, 264.98, 220.58, 267.76, 220.58, 268.68002);
generalPath.lineTo(220.58, 273.54);
generalPath.lineTo(230.05, 273.54);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.46f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(230.05, 273.54);
generalPath.lineTo(230.05, 268.68002);
generalPath.curveTo(230.05, 267.76, 229.59, 264.98, 225.2, 264.98);
generalPath.curveTo(221.04, 264.98, 220.58, 267.76, 220.58, 268.68002);
generalPath.lineTo(220.58, 273.54);
generalPath.lineTo(230.05, 273.54);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(222.19, 268.91);
generalPath.lineTo(219.88, 268.68);
generalPath.curveTo(219.88, 267.75998, 220.11, 266.37, 220.81, 265.91);
generalPath.lineTo(222.89, 267.53);
generalPath.curveTo(222.66, 267.76, 222.19, 268.45, 222.19, 268.91);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.46f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(222.19, 268.91);
generalPath.lineTo(219.88, 268.68);
generalPath.curveTo(219.88, 267.75998, 220.11, 266.37, 220.81, 265.91);
generalPath.lineTo(222.89, 267.53);
generalPath.curveTo(222.66, 267.76, 222.19, 268.45, 222.19, 268.91);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(226.12, 266.6);
generalPath.lineTo(227.28, 264.52002);
generalPath.curveTo(226.81999, 264.29, 225.89, 264.06003, 225.2, 264.06003);
generalPath.curveTo(224.73999, 264.06003, 223.81, 264.29004, 223.34999, 264.52002);
generalPath.lineTo(224.49998, 266.6);
generalPath.lineTo(226.11998, 266.6);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.46f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(226.12, 266.6);
generalPath.lineTo(227.28, 264.52002);
generalPath.curveTo(226.81999, 264.29, 225.89, 264.06003, 225.2, 264.06003);
generalPath.curveTo(224.73999, 264.06003, 223.81, 264.29004, 223.34999, 264.52002);
generalPath.lineTo(224.49998, 266.6);
generalPath.lineTo(226.11998, 266.6);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(228.43, 268.91);
generalPath.lineTo(230.73999, 268.68);
generalPath.curveTo(230.73999, 267.75998, 230.51, 266.37, 229.81999, 265.91);
generalPath.lineTo(227.73999, 267.53);
generalPath.curveTo(227.96999, 267.76, 228.43, 268.45, 228.43, 268.91);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.46f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(228.43, 268.91);
generalPath.lineTo(230.73999, 268.68);
generalPath.curveTo(230.73999, 267.75998, 230.51, 266.37, 229.81999, 265.91);
generalPath.lineTo(227.73999, 267.53);
generalPath.curveTo(227.96999, 267.76, 228.43, 268.45, 228.43, 268.91);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(221.73, 260.83);
generalPath.lineTo(221.73, 255.73999);
generalPath.curveTo(221.73, 254.35999, 220.81, 253.2, 219.19, 253.2);
generalPath.curveTo(217.57, 253.2, 216.65001, 254.36, 216.65001, 255.73999);
generalPath.lineTo(216.65001, 260.83);
generalPath.lineTo(221.73001, 260.83);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.46f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(221.73, 260.83);
generalPath.lineTo(221.73, 255.73999);
generalPath.curveTo(221.73, 254.35999, 220.81, 253.2, 219.19, 253.2);
generalPath.curveTo(217.57, 253.2, 216.65001, 254.36, 216.65001, 255.73999);
generalPath.lineTo(216.65001, 260.83);
generalPath.lineTo(221.73001, 260.83);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(228.89, 260.83);
generalPath.lineTo(228.89, 255.73999);
generalPath.curveTo(228.89, 254.35999, 229.81999, 253.2, 231.44, 253.2);
generalPath.curveTo(233.05, 253.2, 233.98, 254.36, 233.98, 255.73999);
generalPath.lineTo(233.98, 260.83);
generalPath.lineTo(228.89, 260.83);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.46f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(228.89, 260.83);
generalPath.lineTo(228.89, 255.73999);
generalPath.curveTo(228.89, 254.35999, 229.81999, 253.2, 231.44, 253.2);
generalPath.curveTo(233.05, 253.2, 233.98, 254.36, 233.98, 255.73999);
generalPath.lineTo(233.98, 260.83);
generalPath.lineTo(228.89, 260.83);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(220.11, 248.35);
generalPath.lineTo(220.34, 243.73001);
generalPath.lineTo(215.95, 243.73001);
generalPath.lineTo(216.42, 248.35);
generalPath.lineTo(220.11, 248.35);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.46f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(220.11, 248.35);
generalPath.lineTo(220.34, 243.73001);
generalPath.lineTo(215.95, 243.73001);
generalPath.lineTo(216.42, 248.35);
generalPath.lineTo(220.11, 248.35);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(227.05, 248.35);
generalPath.lineTo(227.51001, 243.73001);
generalPath.lineTo(223.12001, 243.73001);
generalPath.lineTo(223.35, 248.35);
generalPath.lineTo(227.05, 248.35);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.46f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(227.05, 248.35);
generalPath.lineTo(227.51001, 243.73001);
generalPath.lineTo(223.12001, 243.73001);
generalPath.lineTo(223.35, 248.35);
generalPath.lineTo(227.05, 248.35);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(230.51, 248.35);
generalPath.lineTo(230.04999, 243.73001);
generalPath.lineTo(234.66998, 243.73001);
generalPath.lineTo(234.20998, 248.35);
generalPath.lineTo(230.50998, 248.35);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.46f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(230.51, 248.35);
generalPath.lineTo(230.04999, 243.73001);

}

private void _paint12(Graphics2D g,float origAlpha) {
generalPath.lineTo(234.66998, 243.73001);
generalPath.lineTo(234.20998, 248.35);
generalPath.lineTo(230.50998, 248.35);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_11
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_11_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(228.43, 273.54);
generalPath.lineTo(228.43, 269.38);
generalPath.curveTo(228.43, 268.68, 227.96999, 266.6, 225.2, 266.6);
generalPath.curveTo(222.66, 266.6, 222.19, 268.68, 222.19, 269.38);
generalPath.lineTo(222.19, 273.54);
generalPath.lineTo(228.43001, 273.54);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 57, 240, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_11_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(221.27, 260.36);
generalPath.lineTo(221.27, 255.96999);
generalPath.curveTo(221.27, 254.81999, 220.58, 253.65999, 219.19, 253.65999);
generalPath.curveTo(217.8, 253.65999, 217.11, 254.81999, 217.11, 255.96999);
generalPath.lineTo(217.11, 260.36);
generalPath.lineTo(221.27, 260.36);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 57, 240, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_3_11_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(229.36, 260.36);
generalPath.lineTo(229.36, 255.96999);
generalPath.curveTo(229.36, 254.81999, 230.05, 253.65999, 231.44, 253.65999);
generalPath.curveTo(232.82, 253.65999, 233.52, 254.81999, 233.52, 255.96999);
generalPath.lineTo(233.52, 260.36);
generalPath.lineTo(229.36, 260.36);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 57, 240, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.28, 281.25);
generalPath.lineTo(300.6, 281.25);
generalPath.lineTo(300.6, 225.53);
generalPath.lineTo(250.28, 225.53);
generalPath.lineTo(250.28, 281.25);
generalPath.closePath();
shape = generalPath;
paint = new Color(204, 204, 204, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.52f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(250.28, 281.25);
generalPath.lineTo(300.6, 281.25);
generalPath.lineTo(300.6, 225.53);
generalPath.lineTo(250.28, 225.53);
generalPath.lineTo(250.28, 281.25);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(275.93, 239.26);
generalPath.lineTo(275.97998, 238.64);
generalPath.lineTo(276.06998, 238.3);
generalPath.curveTo(276.06998, 238.3, 274.46, 238.43001, 273.61, 238.19);
generalPath.curveTo(272.75998, 237.95, 272.0, 237.6, 271.21, 236.94);
generalPath.curveTo(270.41998, 236.26001, 270.11, 235.84, 269.53998, 235.76001);
generalPath.curveTo(268.18, 235.54001, 267.13998, 236.16, 267.13998, 236.16);
generalPath.curveTo(267.13998, 236.16, 268.15997, 236.53, 268.91998, 237.47);
generalPath.curveTo(269.68, 238.41, 270.50998, 238.88, 270.87, 239.0);
generalPath.curveTo(271.46, 239.18, 273.53, 239.05, 274.09, 239.07);
generalPath.curveTo(274.66, 239.1, 275.93, 239.26001, 275.93, 239.26001);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(275.93, 239.26);
generalPath.lineTo(275.97998, 238.64);
generalPath.lineTo(276.06998, 238.3);
generalPath.curveTo(276.06998, 238.3, 274.46, 238.43001, 273.61, 238.19);
generalPath.curveTo(272.75998, 237.95, 272.0, 237.6, 271.21, 236.94);
generalPath.curveTo(270.41998, 236.26001, 270.11, 235.84, 269.53998, 235.76001);
generalPath.curveTo(268.18, 235.54001, 267.13998, 236.16, 267.13998, 236.16);
generalPath.curveTo(267.13998, 236.16, 268.15997, 236.53, 268.91998, 237.47);
generalPath.curveTo(269.68, 238.41, 270.50998, 238.88, 270.87, 239.0);
generalPath.curveTo(271.46, 239.18, 273.53, 239.05, 274.09, 239.07);
generalPath.curveTo(274.66, 239.1, 275.93, 239.26001, 275.93, 239.26001);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.46, 237.0);
generalPath.curveTo(283.46, 237.0, 283.47, 237.72, 283.53998, 238.4);
generalPath.curveTo(283.59998, 239.06999, 283.31998, 239.64, 283.43, 240.01);
generalPath.curveTo(283.54, 240.37999, 283.59, 240.67, 283.72998, 240.93999);
generalPath.curveTo(283.87, 241.19998, 283.93997, 241.87999, 283.93997, 241.87999);
generalPath.curveTo(283.93997, 241.87999, 283.55997, 241.59999, 283.19998, 241.34);
generalPath.curveTo(282.84998, 241.06999, 282.59998, 240.9, 282.59998, 240.9);
generalPath.curveTo(282.59998, 240.9, 282.66998, 241.62, 282.69998, 241.93);
generalPath.curveTo(282.74, 242.23999, 282.91998, 242.81999, 283.21, 243.17);
generalPath.curveTo(283.5, 243.5, 284.08, 244.06, 284.25998, 244.5);
generalPath.curveTo(284.43997, 244.95, 284.4, 245.94, 284.4, 245.94);
generalPath.curveTo(284.4, 245.94, 283.94, 245.19, 283.53, 245.05);
generalPath.curveTo(283.13998, 244.91, 282.27, 244.43001, 282.27, 244.43001);
generalPath.curveTo(282.27, 244.43001, 283.06, 245.22, 283.06, 245.98001);
generalPath.curveTo(283.06, 246.73001, 282.74, 247.58002, 282.74, 247.58002);
generalPath.curveTo(282.74, 247.58002, 282.38, 246.90002, 281.91, 246.46002);
generalPath.curveTo(281.44, 246.01003, 280.78, 245.56003, 280.78, 245.56003);
generalPath.curveTo(280.78, 245.56003, 281.3, 246.73003, 281.3, 247.51003);
generalPath.curveTo(281.3, 248.30002, 281.15, 249.98003, 281.15, 249.98003);
generalPath.curveTo(281.15, 249.98003, 280.75998, 249.34003, 280.36, 249.02002);
generalPath.curveTo(279.96, 248.71002, 279.49, 248.44002, 279.34, 248.24002);
generalPath.curveTo(279.19998, 248.03001, 279.82, 248.88002, 279.88, 249.40002);
generalPath.curveTo(279.95, 249.91002, 280.2, 251.75003, 281.80002, 254.09003);
generalPath.curveTo(282.74002, 255.46002, 284.19003, 257.86002, 287.30002, 257.07004);
generalPath.curveTo(290.41, 256.29004, 289.26, 252.10004, 288.6, 250.15004);
generalPath.curveTo(287.95, 248.20004, 287.62, 246.04004, 287.66, 245.28004);
generalPath.curveTo(287.7, 244.53004, 288.24, 242.31004, 288.17, 241.89005);
generalPath.curveTo(288.1, 241.48004, 287.93002, 239.89005, 288.31003, 238.61005);
generalPath.curveTo(288.71002, 237.28004, 289.04004, 236.76004, 289.26004, 236.21005);
generalPath.curveTo(289.47003, 235.66005, 289.65005, 235.35005, 289.72003, 234.87006);
generalPath.curveTo(289.79, 234.39006, 289.79004, 233.50006, 289.79004, 233.50006);
generalPath.curveTo(289.79004, 233.50006, 290.37003, 234.56006, 290.52005, 234.94006);
generalPath.curveTo(290.66006, 235.32007, 290.66006, 236.44006, 290.66006, 236.44006);
generalPath.curveTo(290.66006, 236.44006, 290.77005, 235.32007, 291.64008, 234.77007);
generalPath.curveTo(292.5101, 234.22006, 293.52008, 233.64006, 293.77008, 233.33006);
generalPath.curveTo(294.02008, 233.02007, 294.10007, 232.82007, 294.10007, 232.82007);
generalPath.curveTo(294.10007, 232.82007, 294.02008, 234.74007, 293.48007, 235.49007);
generalPath.curveTo(293.1201, 235.98007, 291.71008, 237.58006, 291.71008, 237.58006);
generalPath.curveTo(291.71008, 237.58006, 292.4401, 237.30006, 292.9401, 237.28006);
generalPath.curveTo(293.4501, 237.24007, 293.8101, 237.28006, 293.8101, 237.28006);
generalPath.curveTo(293.8101, 237.28006, 293.1901, 237.76006, 292.4001, 238.92006);
generalPath.curveTo(291.6001, 240.08006, 291.93008, 240.18005, 291.3501, 241.14006);
generalPath.curveTo(290.7701, 242.10007, 290.3001, 242.14006, 289.5701, 242.72006);
generalPath.curveTo(288.4901, 243.59006, 289.0701, 247.06006, 289.2101, 247.58006);
generalPath.curveTo(289.3601, 248.09006, 291.2401, 252.34006, 291.28012, 253.37006);
generalPath.curveTo(291.31012, 254.40005, 291.4901, 256.70004, 289.6801, 258.17004);
generalPath.curveTo(288.5201, 259.12006, 286.6101, 259.13004, 286.1701, 259.40005);
generalPath.curveTo(285.7401, 259.68005, 284.8801, 260.53006, 284.8801, 262.31006);
generalPath.curveTo(284.8801, 264.10007, 285.5201, 264.37006, 286.0301, 264.82007);
generalPath.curveTo(286.5401, 265.26007, 287.1901, 265.02008, 287.33008, 265.37006);
generalPath.curveTo(287.48007, 265.71005, 287.55008, 265.91006, 287.77008, 266.12006);
generalPath.curveTo(287.98007, 266.32007, 288.13007, 266.56006, 288.0601, 266.94006);
generalPath.curveTo(287.9801, 267.32007, 287.1501, 268.17007, 286.86008, 268.79007);
generalPath.curveTo(286.57007, 269.40005, 285.99008, 271.02008, 285.99008, 271.26007);
generalPath.curveTo(285.99008, 271.50006, 285.92007, 272.25006, 286.17007, 272.63007);
generalPath.curveTo(286.17007, 272.63007, 287.08008, 273.69006, 286.46008, 273.89008);
generalPath.curveTo(286.0601, 274.0301, 285.68008, 273.64008, 285.49008, 273.69006);
generalPath.curveTo(284.95007, 273.83008, 284.6601, 274.16006, 284.51007, 274.14008);
generalPath.curveTo(284.1501, 274.07007, 284.1501, 273.89008, 284.11008, 273.38007);
generalPath.curveTo(284.08008, 272.87006, 284.10007, 272.66006, 283.94006, 272.66006);
generalPath.curveTo(283.72006, 272.66006, 283.61008, 272.84006, 283.57007, 273.11008);
generalPath.curveTo(283.53006, 273.3801, 283.53006, 274.0001, 283.28006, 274.0001);
generalPath.curveTo(283.03006, 274.0001, 282.67007, 273.55008, 282.45007, 273.4501);
generalPath.curveTo(282.23007, 273.35013, 281.6201, 273.2501, 281.58008, 272.9701);
generalPath.curveTo(281.55008, 272.7001, 281.94006, 272.1201, 282.3401, 272.0101);
generalPath.curveTo(282.74008, 271.9101, 283.1001, 271.7101, 282.8501, 271.5001);
generalPath.curveTo(282.5901, 271.30008, 282.3401, 271.30008, 282.0901, 271.5001);
generalPath.curveTo(281.8401, 271.71008, 281.30008, 271.5401, 281.33008, 271.2301);
generalPath.curveTo(281.3701, 270.9201, 281.44006, 270.5401, 281.4001, 270.37012);
generalPath.curveTo(281.3701, 270.2001, 280.93008, 269.8601, 281.5001, 269.5501);
generalPath.curveTo(282.0901, 269.2401, 282.3401, 269.8201, 282.9201, 269.72012);
generalPath.curveTo(283.50012, 269.62015, 283.7801, 269.41013, 284.0001, 269.07013);
generalPath.curveTo(284.2201, 268.73013, 284.18008, 268.01013, 283.7801, 267.57013);
generalPath.curveTo(283.39008, 267.12012, 282.99008, 267.05014, 282.8401, 266.77014);
generalPath.curveTo(282.70007, 266.50015, 282.4801, 265.85013, 282.4801, 265.85013);
generalPath.curveTo(282.4801, 265.85013, 282.5901, 267.05014, 282.5201, 267.22012);
generalPath.curveTo(282.45013, 267.3901, 282.4801, 268.11014, 282.4801, 268.11014);
generalPath.curveTo(282.4801, 268.11014, 282.0901, 267.66013, 281.7601, 267.32013);
generalPath.curveTo(281.4401, 266.98013, 281.1101, 265.95013, 281.1101, 265.95013);
generalPath.curveTo(281.1101, 265.95013, 281.0801, 266.91013, 281.0801, 267.29013);
generalPath.curveTo(281.0801, 267.66013, 281.5101, 268.01013, 281.37012, 268.15012);
generalPath.curveTo(281.22012, 268.28012, 280.54013, 267.4301, 280.35013, 267.29013);
generalPath.curveTo(280.17014, 267.15012, 279.59012, 266.71014, 279.34012, 266.23013);
generalPath.curveTo(279.09012, 265.75012, 278.90012, 265.07013, 278.8301, 264.82013);
generalPath.curveTo(278.7601, 264.58014, 278.6401, 263.51013, 278.7601, 263.24014);
generalPath.curveTo(278.9401, 262.84015, 279.2301, 262.11014, 279.2301, 262.11014);
generalPath.lineTo(277.8201, 262.11014);
generalPath.curveTo(277.0601, 262.11014, 276.5201, 261.88013, 276.2301, 262.39014);
generalPath.curveTo(275.9401, 262.90015, 276.0801, 263.93015, 276.4401, 265.27014);
generalPath.curveTo(276.8101, 266.60013, 277.02008, 267.25015, 276.9201, 267.49014);
generalPath.curveTo(276.81012, 267.73013, 276.34012, 268.28015, 276.1601, 268.38016);
generalPath.curveTo(275.9701, 268.49014, 275.4701, 268.45016, 275.2501, 268.35016);
generalPath.curveTo(275.0401, 268.25015, 274.68008, 268.08017, 273.99008, 268.08017);
generalPath.curveTo(273.30008, 268.08017, 272.8701, 268.11017, 272.6201, 268.05017);
generalPath.curveTo(272.36008, 267.98016, 271.74008, 267.67017, 271.45007, 267.74017);
generalPath.curveTo(271.16006, 267.81018, 270.66006, 268.06018, 270.80008, 268.46017);
generalPath.curveTo(271.02008, 269.07016, 270.5901, 269.21017, 270.29007, 269.18018);
generalPath.curveTo(270.00006, 269.14017, 269.76007, 269.04016, 269.39008, 268.9402);
generalPath.curveTo(269.0301, 268.8302, 268.49008, 268.9402, 268.5601, 268.52017);
generalPath.curveTo(268.6301, 268.11017, 268.7801, 268.08017, 268.96008, 267.78018);
generalPath.curveTo(269.14008, 267.46017, 269.21008, 267.2602, 269.0001, 267.24017);
generalPath.curveTo(268.7501, 267.22018, 268.49008, 267.1902, 268.30008, 267.35016);
generalPath.curveTo(268.10007, 267.51016, 267.79007, 267.86017, 267.54007, 267.73016);
generalPath.curveTo(267.28006, 267.59015, 267.08008, 267.30017, 267.08008, 266.65018);
generalPath.curveTo(267.08008, 266.01016, 266.4001, 265.45016, 267.0301, 265.48016);
generalPath.curveTo(267.6501, 265.51016, 268.4401, 265.96017, 268.58008, 265.61017);
generalPath.curveTo(268.72006, 265.26016, 268.64008, 265.10016, 268.30008, 264.83017);
generalPath.curveTo(267.96008, 264.56018, 267.54007, 264.40018, 267.99008, 264.06018);
generalPath.curveTo(268.4401, 263.71017, 268.55008, 263.71017, 268.73007, 263.52017);
generalPath.curveTo(268.9001, 263.34018, 269.14008, 262.73016, 269.46008, 262.88016);
generalPath.curveTo(270.08008, 263.18015, 269.48007, 263.61017, 270.11008, 264.30017);
generalPath.curveTo(270.73007, 264.99017, 271.1201, 265.24017, 272.17007, 265.13016);
generalPath.curveTo(273.21008, 265.02017, 273.50006, 264.89017, 273.50006, 264.59015);
generalPath.curveTo(273.50006, 264.30014, 273.41006, 263.77014, 273.38007, 263.55014);
generalPath.curveTo(273.36008, 263.34015, 273.53006, 262.56015, 273.53006, 262.56015);
generalPath.curveTo(273.53006, 262.56015, 273.05005, 262.86014, 272.90005, 263.15015);
generalPath.curveTo(272.77005, 263.44016, 272.48004, 263.95013, 272.48004, 263.95013);
generalPath.curveTo(272.48004, 263.95013, 272.37006, 263.35013, 272.40005, 262.86014);
generalPath.curveTo(272.42004, 262.57013, 272.52005, 262.07013, 272.51004, 261.97012);
generalPath.curveTo(272.48004, 261.70013, 272.28003, 261.03012, 272.28003, 261.03012);
generalPath.curveTo(272.28003, 261.03012, 272.12003, 261.76013, 272.00003, 261.97012);
generalPath.curveTo(271.89005, 262.1801, 271.84003, 263.04013, 271.84003, 263.04013);
generalPath.curveTo(271.84003, 263.04013, 271.17, 262.46014, 271.36002, 261.49014);
generalPath.curveTo(271.49002, 260.74014, 271.24002, 259.75015, 271.47, 259.43015);
generalPath.curveTo(271.69, 259.10016, 272.22, 257.79013, 273.53, 257.74014);
generalPath.curveTo(274.83, 257.69016, 275.84, 257.79013, 276.3, 257.77014);
generalPath.curveTo(276.75, 257.74014, 278.36, 257.44016, 278.36, 257.44016);
generalPath.curveTo(278.36, 257.44016, 275.38998, 255.92015, 274.71997, 255.46016);
generalPath.curveTo(274.03998, 255.01016, 272.98996, 253.83015, 272.64996, 253.30016);
generalPath.curveTo(272.30997, 252.76016, 271.99997, 251.72015, 271.99997, 251.72015);
generalPath.curveTo(271.99997, 251.72015, 271.46997, 251.74016, 270.97998, 252.01015);
generalPath.curveTo(270.49997, 252.28015, 270.02, 252.68015, 269.74, 253.00015);
generalPath.curveTo(269.46, 253.32016, 269.00998, 254.05016, 269.00998, 254.05016);
generalPath.curveTo(269.00998, 254.05016, 269.08997, 253.11015, 269.08997, 252.82016);
generalPath.curveTo(269.08997, 252.53017, 269.02997, 251.96016, 269.02997, 251.96016);
generalPath.curveTo(269.02997, 251.96016, 268.69998, 253.24016, 268.01996, 253.72015);
generalPath.curveTo(267.33997, 254.21016, 266.54996, 254.87015, 266.54996, 254.87015);
generalPath.curveTo(266.54996, 254.87015, 266.62994, 254.16014, 266.62994, 253.99014);
generalPath.curveTo(266.62994, 253.83014, 266.79996, 253.00014, 266.79996, 253.00014);
generalPath.curveTo(266.79996, 253.00014, 266.31995, 253.72014, 265.58997, 253.86014);
generalPath.curveTo(264.84998, 253.99014, 263.77997, 253.97014, 263.68997, 254.42014);
generalPath.curveTo(263.61, 254.87013, 263.88998, 255.49014, 263.71997, 255.81013);
generalPath.curveTo(263.54996, 256.13013, 263.17996, 256.35013, 263.17996, 256.35013);
generalPath.curveTo(263.17996, 256.35013, 262.75995, 256.00012, 262.38995, 255.97012);
generalPath.curveTo(262.02997, 255.94012, 261.67996, 256.13013, 261.67996, 256.13013);
generalPath.curveTo(261.67996, 256.13013, 261.36996, 255.73013, 261.48996, 255.46013);
generalPath.curveTo(261.59995, 255.20013, 262.15997, 254.80013, 262.02997, 254.63013);
generalPath.curveTo(261.87997, 254.47012, 261.42996, 254.69012, 261.14996, 254.82013);
generalPath.curveTo(260.86996, 254.96013, 260.26996, 255.09013, 260.32996, 254.63013);
generalPath.curveTo(260.37994, 254.18013, 260.52997, 253.91013, 260.37994, 253.59013);
generalPath.curveTo(260.23993, 253.27013, 260.32996, 253.06013, 260.55994, 252.98013);
generalPath.curveTo(260.77994, 252.90013, 261.67993, 253.00014, 261.76993, 252.79013);
generalPath.curveTo(261.8499, 252.58012, 261.54993, 252.31013, 260.94992, 252.18013);
generalPath.curveTo(260.35992, 252.04013, 260.06992, 251.69012, 260.3799, 251.40013);
generalPath.curveTo(260.69992, 251.10013, 260.7799, 251.02013, 260.91992, 250.76013);
generalPath.curveTo(261.05994, 250.49013, 261.11993, 250.00014, 261.6599, 250.25014);
generalPath.curveTo(262.1899, 250.49014, 262.07993, 251.08014, 262.6499, 251.26013);
generalPath.curveTo(263.2099, 251.45013, 264.53992, 251.18013, 264.81992, 251.02013);
generalPath.curveTo(265.0999, 250.86012, 266.00992, 250.19012, 266.31992, 250.03012);
generalPath.curveTo(266.6299, 249.88013, 267.9299, 248.91013, 267.9299, 248.91013);
generalPath.curveTo(267.9299, 248.91013, 267.1699, 248.38013, 266.8799, 248.11012);
generalPath.curveTo(266.5999, 247.84012, 266.0999, 247.20012, 265.8399, 247.06012);
generalPath.curveTo(265.5899, 246.93011, 264.3399, 246.45012, 263.9199, 246.42012);
generalPath.curveTo(263.49988, 246.40012, 262.1999, 245.94012, 262.1999, 245.94012);
generalPath.curveTo(262.1999, 245.94012, 262.7899, 245.75012, 262.9899, 245.59012);
generalPath.curveTo(263.1799, 245.43011, 263.6299, 245.03012, 263.8599, 245.06012);
generalPath.curveTo(264.0799, 245.08012, 264.1399, 245.08012, 264.1399, 245.08012);
generalPath.curveTo(264.1399, 245.08012, 262.9299, 245.03012, 262.6699, 244.95012);
generalPath.curveTo(262.4199, 244.87012, 261.6799, 244.41013, 261.3999, 244.41013);
generalPath.curveTo(261.1199, 244.41013, 260.5599, 244.52013, 260.5599, 244.52013);
generalPath.curveTo(260.5599, 244.52013, 261.31992, 244.04013, 261.9399, 243.93013);
generalPath.curveTo(262.5599, 243.83012, 263.03992, 243.85013, 263.03992, 243.85013);
generalPath.curveTo(263.03992, 243.85013, 262.07993, 243.58012, 261.8499, 243.27013);
generalPath.curveTo(261.6299, 242.94012, 261.3999, 242.47012, 261.22992, 242.25012);
generalPath.curveTo(261.0599, 242.04012, 260.94992, 241.69012, 260.63992, 241.66013);
generalPath.curveTo(260.32993, 241.63013, 259.78992, 242.04013, 259.47992, 242.01013);
generalPath.curveTo(259.16992, 241.98013, 258.9399, 241.79013, 258.9099, 241.34013);
generalPath.curveTo(258.88992, 240.88013, 258.9099, 241.04013, 258.8099, 240.80014);
generalPath.curveTo(258.6899, 240.56013, 258.2399, 240.00014, 258.6599, 239.87015);
generalPath.curveTo(259.0899, 239.73015, 259.9899, 239.95015, 260.07993, 239.79015);
generalPath.curveTo(260.1599, 239.63014, 259.5999, 239.14015, 259.22992, 238.96014);
generalPath.curveTo(258.85992, 238.77014, 258.26993, 238.45015, 258.57993, 238.18015);
generalPath.curveTo(258.88992, 237.92015, 259.19992, 237.81015, 259.36993, 237.57014);
generalPath.curveTo(259.53995, 237.33014, 259.73993, 236.66014, 260.10992, 236.87015);
generalPath.curveTo(260.4699, 237.08015, 260.97992, 238.13014, 261.26993, 238.05014);
generalPath.curveTo(261.54993, 237.97014, 261.56992, 237.22014, 261.51993, 236.90015);
generalPath.curveTo(261.45993, 236.58014, 261.51993, 236.02014, 261.79993, 236.07014);
generalPath.curveTo(262.07993, 236.12015, 262.30994, 236.50014, 262.75992, 236.53015);
generalPath.curveTo(263.20993, 236.55016, 263.88992, 236.42015, 263.82993, 236.74016);
generalPath.curveTo(263.77994, 237.06017, 263.51993, 237.45016, 263.20993, 237.80016);
generalPath.curveTo(262.90994, 238.16016, 262.75992, 238.85016, 262.95993, 239.30016);
generalPath.curveTo(263.15994, 239.76016, 263.66992, 240.49016, 264.11993, 240.78015);
generalPath.curveTo(264.56995, 241.07014, 265.41992, 241.29015, 265.95993, 241.63016);
generalPath.curveTo(266.48993, 241.98016, 267.73993, 242.97015, 268.15994, 243.08015);
generalPath.curveTo(268.57996, 243.19016, 269.00995, 243.40016, 269.00995, 243.40016);
generalPath.curveTo(269.00995, 243.40016, 269.48996, 243.19016, 270.13995, 243.19016);
generalPath.curveTo(270.78995, 243.19016, 272.27997, 243.29016, 272.84995, 243.05016);
generalPath.curveTo(273.41992, 242.81015, 274.14993, 242.41016, 273.92993, 241.90016);
generalPath.curveTo(273.69992, 241.39017, 272.45993, 240.94016, 272.56995, 240.54016);
generalPath.curveTo(272.67996, 240.14017, 273.13995, 240.11017, 273.89993, 240.08015);
generalPath.curveTo(274.65994, 240.06015, 275.69992, 240.22015, 275.89993, 239.14015);
generalPath.curveTo(276.09995, 238.08015, 276.15994, 237.46016, 275.08994, 237.22015);
generalPath.curveTo(274.00995, 236.98015, 273.21994, 236.95015, 273.01993, 236.18016);
generalPath.curveTo(272.81992, 235.40016, 272.6299, 235.21016, 272.8499, 235.00017);
generalPath.curveTo(273.07993, 234.79016, 273.4699, 234.68016, 274.25992, 234.63017);
generalPath.curveTo(275.0599, 234.57018, 275.95993, 234.57018, 276.2199, 234.38017);
generalPath.curveTo(276.4699, 234.20018, 276.5199, 233.69017, 276.8299, 233.47017);
generalPath.curveTo(277.1399, 233.26016, 278.3599, 233.07018, 278.3599, 233.07018);
generalPath.curveTo(278.3599, 233.07018, 279.8199, 233.78018, 281.15988, 234.78018);
generalPath.curveTo(282.36987, 235.68018, 283.45987, 237.01018, 283.45987, 237.01018);
shape = generalPath;
paint = new Color(237, 114, 170, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.46, 237.0);
generalPath.curveTo(283.46, 237.0, 283.47, 237.72, 283.53998, 238.4);
generalPath.curveTo(283.59998, 239.06999, 283.31998, 239.64, 283.43, 240.01);
generalPath.curveTo(283.54, 240.37999, 283.59, 240.67, 283.72998, 240.93999);
generalPath.curveTo(283.87, 241.19998, 283.93997, 241.87999, 283.93997, 241.87999);
generalPath.curveTo(283.93997, 241.87999, 283.55997, 241.59999, 283.19998, 241.34);
generalPath.curveTo(282.84998, 241.06999, 282.59998, 240.9, 282.59998, 240.9);
generalPath.curveTo(282.59998, 240.9, 282.66998, 241.62, 282.69998, 241.93);
generalPath.curveTo(282.74, 242.23999, 282.91998, 242.81999, 283.21, 243.17);
generalPath.curveTo(283.5, 243.5, 284.08, 244.06, 284.25998, 244.5);
generalPath.curveTo(284.43997, 244.95, 284.4, 245.94, 284.4, 245.94);
generalPath.curveTo(284.4, 245.94, 283.94, 245.19, 283.53, 245.05);
generalPath.curveTo(283.13998, 244.91, 282.27, 244.43001, 282.27, 244.43001);
generalPath.curveTo(282.27, 244.43001, 283.06, 245.22, 283.06, 245.98001);
generalPath.curveTo(283.06, 246.73001, 282.74, 247.58002, 282.74, 247.58002);
generalPath.curveTo(282.74, 247.58002, 282.38, 246.90002, 281.91, 246.46002);
generalPath.curveTo(281.44, 246.01003, 280.78, 245.56003, 280.78, 245.56003);
generalPath.curveTo(280.78, 245.56003, 281.3, 246.73003, 281.3, 247.51003);
generalPath.curveTo(281.3, 248.30002, 281.15, 249.98003, 281.15, 249.98003);
generalPath.curveTo(281.15, 249.98003, 280.75998, 249.34003, 280.36, 249.02002);
generalPath.curveTo(279.96, 248.71002, 279.49, 248.44002, 279.34, 248.24002);
generalPath.curveTo(279.19998, 248.03001, 279.82, 248.88002, 279.88, 249.40002);
generalPath.curveTo(279.95, 249.91002, 280.2, 251.75003, 281.80002, 254.09003);
generalPath.curveTo(282.74002, 255.46002, 284.19003, 257.86002, 287.30002, 257.07004);
generalPath.curveTo(290.41, 256.29004, 289.26, 252.10004, 288.6, 250.15004);
generalPath.curveTo(287.95, 248.20004, 287.62, 246.04004, 287.66, 245.28004);
generalPath.curveTo(287.7, 244.53004, 288.24, 242.31004, 288.17, 241.89005);
generalPath.curveTo(288.1, 241.48004, 287.93002, 239.89005, 288.31003, 238.61005);
generalPath.curveTo(288.71002, 237.28004, 289.04004, 236.76004, 289.26004, 236.21005);
generalPath.curveTo(289.47003, 235.66005, 289.65005, 235.35005, 289.72003, 234.87006);
generalPath.curveTo(289.79, 234.39006, 289.79004, 233.50006, 289.79004, 233.50006);
generalPath.curveTo(289.79004, 233.50006, 290.37003, 234.56006, 290.52005, 234.94006);
generalPath.curveTo(290.66006, 235.32007, 290.66006, 236.44006, 290.66006, 236.44006);
generalPath.curveTo(290.66006, 236.44006, 290.77005, 235.32007, 291.64008, 234.77007);
generalPath.curveTo(292.5101, 234.22006, 293.52008, 233.64006, 293.77008, 233.33006);
generalPath.curveTo(294.02008, 233.02007, 294.10007, 232.82007, 294.10007, 232.82007);
generalPath.curveTo(294.10007, 232.82007, 294.02008, 234.74007, 293.48007, 235.49007);
generalPath.curveTo(293.1201, 235.98007, 291.71008, 237.58006, 291.71008, 237.58006);
generalPath.curveTo(291.71008, 237.58006, 292.4401, 237.30006, 292.9401, 237.28006);
generalPath.curveTo(293.4501, 237.24007, 293.8101, 237.28006, 293.8101, 237.28006);
generalPath.curveTo(293.8101, 237.28006, 293.1901, 237.76006, 292.4001, 238.92006);
generalPath.curveTo(291.6001, 240.08006, 291.93008, 240.18005, 291.3501, 241.14006);
generalPath.curveTo(290.7701, 242.10007, 290.3001, 242.14006, 289.5701, 242.72006);
generalPath.curveTo(288.4901, 243.59006, 289.0701, 247.06006, 289.2101, 247.58006);
generalPath.curveTo(289.3601, 248.09006, 291.2401, 252.34006, 291.28012, 253.37006);
generalPath.curveTo(291.31012, 254.40005, 291.4901, 256.70004, 289.6801, 258.17004);
generalPath.curveTo(288.5201, 259.12006, 286.6101, 259.13004, 286.1701, 259.40005);
generalPath.curveTo(285.7401, 259.68005, 284.8801, 260.53006, 284.8801, 262.31006);
generalPath.curveTo(284.8801, 264.10007, 285.5201, 264.37006, 286.0301, 264.82007);
generalPath.curveTo(286.5401, 265.26007, 287.1901, 265.02008, 287.33008, 265.37006);
generalPath.curveTo(287.48007, 265.71005, 287.55008, 265.91006, 287.77008, 266.12006);
generalPath.curveTo(287.98007, 266.32007, 288.13007, 266.56006, 288.0601, 266.94006);
generalPath.curveTo(287.9801, 267.32007, 287.1501, 268.17007, 286.86008, 268.79007);
generalPath.curveTo(286.57007, 269.40005, 285.99008, 271.02008, 285.99008, 271.26007);
generalPath.curveTo(285.99008, 271.50006, 285.92007, 272.25006, 286.17007, 272.63007);
generalPath.curveTo(286.17007, 272.63007, 287.08008, 273.69006, 286.46008, 273.89008);
generalPath.curveTo(286.0601, 274.0301, 285.68008, 273.64008, 285.49008, 273.69006);
generalPath.curveTo(284.95007, 273.83008, 284.6601, 274.16006, 284.51007, 274.14008);
generalPath.curveTo(284.1501, 274.07007, 284.1501, 273.89008, 284.11008, 273.38007);
generalPath.curveTo(284.08008, 272.87006, 284.10007, 272.66006, 283.94006, 272.66006);
generalPath.curveTo(283.72006, 272.66006, 283.61008, 272.84006, 283.57007, 273.11008);
generalPath.curveTo(283.53006, 273.3801, 283.53006, 274.0001, 283.28006, 274.0001);
generalPath.curveTo(283.03006, 274.0001, 282.67007, 273.55008, 282.45007, 273.4501);
generalPath.curveTo(282.23007, 273.35013, 281.6201, 273.2501, 281.58008, 272.9701);
generalPath.curveTo(281.55008, 272.7001, 281.94006, 272.1201, 282.3401, 272.0101);
generalPath.curveTo(282.74008, 271.9101, 283.1001, 271.7101, 282.8501, 271.5001);
generalPath.curveTo(282.5901, 271.30008, 282.3401, 271.30008, 282.0901, 271.5001);
generalPath.curveTo(281.8401, 271.71008, 281.30008, 271.5401, 281.33008, 271.2301);
generalPath.curveTo(281.3701, 270.9201, 281.44006, 270.5401, 281.4001, 270.37012);
generalPath.curveTo(281.3701, 270.2001, 280.93008, 269.8601, 281.5001, 269.5501);
generalPath.curveTo(282.0901, 269.2401, 282.3401, 269.8201, 282.9201, 269.72012);
generalPath.curveTo(283.50012, 269.62015, 283.7801, 269.41013, 284.0001, 269.07013);
generalPath.curveTo(284.2201, 268.73013, 284.18008, 268.01013, 283.7801, 267.57013);
generalPath.curveTo(283.39008, 267.12012, 282.99008, 267.05014, 282.8401, 266.77014);
generalPath.curveTo(282.70007, 266.50015, 282.4801, 265.85013, 282.4801, 265.85013);
generalPath.curveTo(282.4801, 265.85013, 282.5901, 267.05014, 282.5201, 267.22012);
generalPath.curveTo(282.45013, 267.3901, 282.4801, 268.11014, 282.4801, 268.11014);
generalPath.curveTo(282.4801, 268.11014, 282.0901, 267.66013, 281.7601, 267.32013);
generalPath.curveTo(281.4401, 266.98013, 281.1101, 265.95013, 281.1101, 265.95013);
generalPath.curveTo(281.1101, 265.95013, 281.0801, 266.91013, 281.0801, 267.29013);
generalPath.curveTo(281.0801, 267.66013, 281.5101, 268.01013, 281.37012, 268.15012);
generalPath.curveTo(281.22012, 268.28012, 280.54013, 267.4301, 280.35013, 267.29013);
generalPath.curveTo(280.17014, 267.15012, 279.59012, 266.71014, 279.34012, 266.23013);
generalPath.curveTo(279.09012, 265.75012, 278.90012, 265.07013, 278.8301, 264.82013);
generalPath.curveTo(278.7601, 264.58014, 278.6401, 263.51013, 278.7601, 263.24014);
generalPath.curveTo(278.9401, 262.84015, 279.2301, 262.11014, 279.2301, 262.11014);
generalPath.lineTo(277.8201, 262.11014);
generalPath.curveTo(277.0601, 262.11014, 276.5201, 261.88013, 276.2301, 262.39014);
generalPath.curveTo(275.9401, 262.90015, 276.0801, 263.93015, 276.4401, 265.27014);
generalPath.curveTo(276.8101, 266.60013, 277.02008, 267.25015, 276.9201, 267.49014);
generalPath.curveTo(276.81012, 267.73013, 276.34012, 268.28015, 276.1601, 268.38016);
generalPath.curveTo(275.9701, 268.49014, 275.4701, 268.45016, 275.2501, 268.35016);
generalPath.curveTo(275.0401, 268.25015, 274.68008, 268.08017, 273.99008, 268.08017);
generalPath.curveTo(273.30008, 268.08017, 272.8701, 268.11017, 272.6201, 268.05017);
generalPath.curveTo(272.36008, 267.98016, 271.74008, 267.67017, 271.45007, 267.74017);
generalPath.curveTo(271.16006, 267.81018, 270.66006, 268.06018, 270.80008, 268.46017);
generalPath.curveTo(271.02008, 269.07016, 270.5901, 269.21017, 270.29007, 269.18018);
generalPath.curveTo(270.00006, 269.14017, 269.76007, 269.04016, 269.39008, 268.9402);
generalPath.curveTo(269.0301, 268.8302, 268.49008, 268.9402, 268.5601, 268.52017);
generalPath.curveTo(268.6301, 268.11017, 268.7801, 268.08017, 268.96008, 267.78018);
generalPath.curveTo(269.14008, 267.46017, 269.21008, 267.2602, 269.0001, 267.24017);
generalPath.curveTo(268.7501, 267.22018, 268.49008, 267.1902, 268.30008, 267.35016);
generalPath.curveTo(268.10007, 267.51016, 267.79007, 267.86017, 267.54007, 267.73016);
generalPath.curveTo(267.28006, 267.59015, 267.08008, 267.30017, 267.08008, 266.65018);
generalPath.curveTo(267.08008, 266.01016, 266.4001, 265.45016, 267.0301, 265.48016);
generalPath.curveTo(267.6501, 265.51016, 268.4401, 265.96017, 268.58008, 265.61017);
generalPath.curveTo(268.72006, 265.26016, 268.64008, 265.10016, 268.30008, 264.83017);
generalPath.curveTo(267.96008, 264.56018, 267.54007, 264.40018, 267.99008, 264.06018);
generalPath.curveTo(268.4401, 263.71017, 268.55008, 263.71017, 268.73007, 263.52017);
generalPath.curveTo(268.9001, 263.34018, 269.14008, 262.73016, 269.46008, 262.88016);
generalPath.curveTo(270.08008, 263.18015, 269.48007, 263.61017, 270.11008, 264.30017);
generalPath.curveTo(270.73007, 264.99017, 271.1201, 265.24017, 272.17007, 265.13016);
generalPath.curveTo(273.21008, 265.02017, 273.50006, 264.89017, 273.50006, 264.59015);
generalPath.curveTo(273.50006, 264.30014, 273.41006, 263.77014, 273.38007, 263.55014);
generalPath.curveTo(273.36008, 263.34015, 273.53006, 262.56015, 273.53006, 262.56015);
generalPath.curveTo(273.53006, 262.56015, 273.05005, 262.86014, 272.90005, 263.15015);
generalPath.curveTo(272.77005, 263.44016, 272.48004, 263.95013, 272.48004, 263.95013);
generalPath.curveTo(272.48004, 263.95013, 272.37006, 263.35013, 272.40005, 262.86014);
generalPath.curveTo(272.42004, 262.57013, 272.52005, 262.07013, 272.51004, 261.97012);
generalPath.curveTo(272.48004, 261.70013, 272.28003, 261.03012, 272.28003, 261.03012);
generalPath.curveTo(272.28003, 261.03012, 272.12003, 261.76013, 272.00003, 261.97012);
generalPath.curveTo(271.89005, 262.1801, 271.84003, 263.04013, 271.84003, 263.04013);
generalPath.curveTo(271.84003, 263.04013, 271.17, 262.46014, 271.36002, 261.49014);
generalPath.curveTo(271.49002, 260.74014, 271.24002, 259.75015, 271.47, 259.43015);
generalPath.curveTo(271.69, 259.10016, 272.22, 257.79013, 273.53, 257.74014);
generalPath.curveTo(274.83, 257.69016, 275.84, 257.79013, 276.3, 257.77014);
generalPath.curveTo(276.75, 257.74014, 278.36, 257.44016, 278.36, 257.44016);
generalPath.curveTo(278.36, 257.44016, 275.38998, 255.92015, 274.71997, 255.46016);
generalPath.curveTo(274.03998, 255.01016, 272.98996, 253.83015, 272.64996, 253.30016);
generalPath.curveTo(272.30997, 252.76016, 271.99997, 251.72015, 271.99997, 251.72015);
generalPath.curveTo(271.99997, 251.72015, 271.46997, 251.74016, 270.97998, 252.01015);
generalPath.curveTo(270.49997, 252.28015, 270.02, 252.68015, 269.74, 253.00015);
generalPath.curveTo(269.46, 253.32016, 269.00998, 254.05016, 269.00998, 254.05016);
generalPath.curveTo(269.00998, 254.05016, 269.08997, 253.11015, 269.08997, 252.82016);
generalPath.curveTo(269.08997, 252.53017, 269.02997, 251.96016, 269.02997, 251.96016);
generalPath.curveTo(269.02997, 251.96016, 268.69998, 253.24016, 268.01996, 253.72015);
generalPath.curveTo(267.33997, 254.21016, 266.54996, 254.87015, 266.54996, 254.87015);
generalPath.curveTo(266.54996, 254.87015, 266.62994, 254.16014, 266.62994, 253.99014);
generalPath.curveTo(266.62994, 253.83014, 266.79996, 253.00014, 266.79996, 253.00014);
generalPath.curveTo(266.79996, 253.00014, 266.31995, 253.72014, 265.58997, 253.86014);
generalPath.curveTo(264.84998, 253.99014, 263.77997, 253.97014, 263.68997, 254.42014);
generalPath.curveTo(263.61, 254.87013, 263.88998, 255.49014, 263.71997, 255.81013);
generalPath.curveTo(263.54996, 256.13013, 263.17996, 256.35013, 263.17996, 256.35013);
generalPath.curveTo(263.17996, 256.35013, 262.75995, 256.00012, 262.38995, 255.97012);
generalPath.curveTo(262.02997, 255.94012, 261.67996, 256.13013, 261.67996, 256.13013);
generalPath.curveTo(261.67996, 256.13013, 261.36996, 255.73013, 261.48996, 255.46013);
generalPath.curveTo(261.59995, 255.20013, 262.15997, 254.80013, 262.02997, 254.63013);
generalPath.curveTo(261.87997, 254.47012, 261.42996, 254.69012, 261.14996, 254.82013);
generalPath.curveTo(260.86996, 254.96013, 260.26996, 255.09013, 260.32996, 254.63013);
generalPath.curveTo(260.37994, 254.18013, 260.52997, 253.91013, 260.37994, 253.59013);
generalPath.curveTo(260.23993, 253.27013, 260.32996, 253.06013, 260.55994, 252.98013);
generalPath.curveTo(260.77994, 252.90013, 261.67993, 253.00014, 261.76993, 252.79013);
generalPath.curveTo(261.8499, 252.58012, 261.54993, 252.31013, 260.94992, 252.18013);
generalPath.curveTo(260.35992, 252.04013, 260.06992, 251.69012, 260.3799, 251.40013);
generalPath.curveTo(260.69992, 251.10013, 260.7799, 251.02013, 260.91992, 250.76013);
generalPath.curveTo(261.05994, 250.49013, 261.11993, 250.00014, 261.6599, 250.25014);
generalPath.curveTo(262.1899, 250.49014, 262.07993, 251.08014, 262.6499, 251.26013);
generalPath.curveTo(263.2099, 251.45013, 264.53992, 251.18013, 264.81992, 251.02013);
generalPath.curveTo(265.0999, 250.86012, 266.00992, 250.19012, 266.31992, 250.03012);
generalPath.curveTo(266.6299, 249.88013, 267.9299, 248.91013, 267.9299, 248.91013);
generalPath.curveTo(267.9299, 248.91013, 267.1699, 248.38013, 266.8799, 248.11012);
generalPath.curveTo(266.5999, 247.84012, 266.0999, 247.20012, 265.8399, 247.06012);
generalPath.curveTo(265.5899, 246.93011, 264.3399, 246.45012, 263.9199, 246.42012);
generalPath.curveTo(263.49988, 246.40012, 262.1999, 245.94012, 262.1999, 245.94012);
generalPath.curveTo(262.1999, 245.94012, 262.7899, 245.75012, 262.9899, 245.59012);
generalPath.curveTo(263.1799, 245.43011, 263.6299, 245.03012, 263.8599, 245.06012);
generalPath.curveTo(264.0799, 245.08012, 264.1399, 245.08012, 264.1399, 245.08012);
generalPath.curveTo(264.1399, 245.08012, 262.9299, 245.03012, 262.6699, 244.95012);
generalPath.curveTo(262.4199, 244.87012, 261.6799, 244.41013, 261.3999, 244.41013);
generalPath.curveTo(261.1199, 244.41013, 260.5599, 244.52013, 260.5599, 244.52013);
generalPath.curveTo(260.5599, 244.52013, 261.31992, 244.04013, 261.9399, 243.93013);
generalPath.curveTo(262.5599, 243.83012, 263.03992, 243.85013, 263.03992, 243.85013);
generalPath.curveTo(263.03992, 243.85013, 262.07993, 243.58012, 261.8499, 243.27013);
generalPath.curveTo(261.6299, 242.94012, 261.3999, 242.47012, 261.22992, 242.25012);
generalPath.curveTo(261.0599, 242.04012, 260.94992, 241.69012, 260.63992, 241.66013);
generalPath.curveTo(260.32993, 241.63013, 259.78992, 242.04013, 259.47992, 242.01013);
generalPath.curveTo(259.16992, 241.98013, 258.9399, 241.79013, 258.9099, 241.34013);
generalPath.curveTo(258.88992, 240.88013, 258.9099, 241.04013, 258.8099, 240.80014);
generalPath.curveTo(258.6899, 240.56013, 258.2399, 240.00014, 258.6599, 239.87015);
generalPath.curveTo(259.0899, 239.73015, 259.9899, 239.95015, 260.07993, 239.79015);
generalPath.curveTo(260.1599, 239.63014, 259.5999, 239.14015, 259.22992, 238.96014);
generalPath.curveTo(258.85992, 238.77014, 258.26993, 238.45015, 258.57993, 238.18015);
generalPath.curveTo(258.88992, 237.92015, 259.19992, 237.81015, 259.36993, 237.57014);
generalPath.curveTo(259.53995, 237.33014, 259.73993, 236.66014, 260.10992, 236.87015);
generalPath.curveTo(260.4699, 237.08015, 260.97992, 238.13014, 261.26993, 238.05014);
generalPath.curveTo(261.54993, 237.97014, 261.56992, 237.22014, 261.51993, 236.90015);
generalPath.curveTo(261.45993, 236.58014, 261.51993, 236.02014, 261.79993, 236.07014);
generalPath.curveTo(262.07993, 236.12015, 262.30994, 236.50014, 262.75992, 236.53015);
generalPath.curveTo(263.20993, 236.55016, 263.88992, 236.42015, 263.82993, 236.74016);
generalPath.curveTo(263.77994, 237.06017, 263.51993, 237.45016, 263.20993, 237.80016);
generalPath.curveTo(262.90994, 238.16016, 262.75992, 238.85016, 262.95993, 239.30016);
generalPath.curveTo(263.15994, 239.76016, 263.66992, 240.49016, 264.11993, 240.78015);
generalPath.curveTo(264.56995, 241.07014, 265.41992, 241.29015, 265.95993, 241.63016);
generalPath.curveTo(266.48993, 241.98016, 267.73993, 242.97015, 268.15994, 243.08015);
generalPath.curveTo(268.57996, 243.19016, 269.00995, 243.40016, 269.00995, 243.40016);
generalPath.curveTo(269.00995, 243.40016, 269.48996, 243.19016, 270.13995, 243.19016);
generalPath.curveTo(270.78995, 243.19016, 272.27997, 243.29016, 272.84995, 243.05016);
generalPath.curveTo(273.41992, 242.81015, 274.14993, 242.41016, 273.92993, 241.90016);
generalPath.curveTo(273.69992, 241.39017, 272.45993, 240.94016, 272.56995, 240.54016);
generalPath.curveTo(272.67996, 240.14017, 273.13995, 240.11017, 273.89993, 240.08015);
generalPath.curveTo(274.65994, 240.06015, 275.69992, 240.22015, 275.89993, 239.14015);
generalPath.curveTo(276.09995, 238.08015, 276.15994, 237.46016, 275.08994, 237.22015);
generalPath.curveTo(274.00995, 236.98015, 273.21994, 236.95015, 273.01993, 236.18016);
generalPath.curveTo(272.81992, 235.40016, 272.6299, 235.21016, 272.8499, 235.00017);
generalPath.curveTo(273.07993, 234.79016, 273.4699, 234.68016, 274.25992, 234.63017);
generalPath.curveTo(275.0599, 234.57018, 275.95993, 234.57018, 276.2199, 234.38017);
generalPath.curveTo(276.4699, 234.20018, 276.5199, 233.69017, 276.8299, 233.47017);
generalPath.curveTo(277.1399, 233.26016, 278.3599, 233.07018, 278.3599, 233.07018);
generalPath.curveTo(278.3599, 233.07018, 279.8199, 233.78018, 281.15988, 234.78018);
generalPath.curveTo(282.36987, 235.68018, 283.45987, 237.01018, 283.45987, 237.01018);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_2_1
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(269.0, 243.39);
generalPath.curveTo(269.0, 243.39, 268.2, 243.62, 267.9, 244.06);
generalPath.curveTo(267.53, 244.59, 267.56, 245.13, 267.56, 245.13);
generalPath.curveTo(267.56, 245.13, 268.24, 244.57, 269.12, 244.8);
generalPath.curveTo(269.99, 245.04001, 270.08, 245.13, 270.44998, 245.1);
generalPath.curveTo(270.81998, 245.07, 271.71997, 244.75, 271.71997, 244.75);
generalPath.curveTo(271.71997, 244.75, 270.97998, 245.61, 271.06998, 246.2);
generalPath.curveTo(271.14996, 246.78, 271.25998, 247.05, 271.24, 247.34999);
generalPath.curveTo(271.18, 248.06999, 270.63998, 248.95999, 270.63998, 248.95999);
generalPath.curveTo(270.63998, 248.95999, 270.94998, 248.76999, 271.68997, 248.60999);
generalPath.curveTo(272.41998, 248.44998, 273.04996, 248.09999, 273.43997, 247.79999);
generalPath.curveTo(273.83, 247.51, 274.33997, 246.77998, 274.33997, 246.77998);
generalPath.curveTo(274.33997, 246.77998, 274.17996, 247.77998, 274.33997, 248.19998);
generalPath.curveTo(274.50998, 248.63998, 274.56998, 249.86998, 274.56998, 249.86998);
generalPath.curveTo(274.56998, 249.86998, 275.03998, 249.44998, 275.41998, 249.24998);
generalPath.curveTo(275.61, 249.13998, 276.12, 248.86998, 276.31998, 248.54999);
generalPath.curveTo(276.46, 248.32999, 276.63998, 247.48999, 276.63998, 247.48999);
generalPath.curveTo(276.63998, 247.48999, 276.74997, 248.38998, 277.03, 248.82999);
generalPath.curveTo(277.31, 249.24998, 277.73, 250.56999, 277.73, 250.56999);
generalPath.curveTo(277.73, 250.56999, 278.02002, 249.70999, 278.33002, 249.35999);
generalPath.curveTo(278.64, 249.00998, 279.01, 248.55998, 279.03003, 248.28998);
generalPath.curveTo(279.06003, 248.01997, 278.95004, 247.43997, 278.95004, 247.43997);
generalPath.lineTo(279.34006, 248.28998);
generalPath.moveTo(267.93005, 248.89998);
generalPath.curveTo(267.93005, 248.89998, 268.41006, 248.06998, 268.86005, 247.79997);
generalPath.curveTo(269.32004, 247.53998, 269.94003, 247.05997, 270.11005, 246.99997);
generalPath.curveTo(270.27005, 246.94997, 271.01004, 246.53996, 271.01004, 246.53996);
generalPath.moveTo(272.00003, 251.70996);
generalPath.curveTo(272.00003, 251.70996, 273.09003, 251.15996, 273.41003, 250.95996);
generalPath.curveTo(274.09003, 250.55997, 274.57004, 249.83997, 274.57004, 249.83997);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_2_2
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(282.57, 240.9);
generalPath.curveTo(282.57, 240.9, 282.23, 240.42, 282.15, 240.25);
generalPath.curveTo(282.06, 240.1, 281.91998, 239.77, 281.91998, 239.77);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_2_3
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(278.33, 257.41);
generalPath.curveTo(278.33, 257.41, 280.37, 258.67, 280.31, 259.72);
generalPath.curveTo(280.25, 260.76, 279.18, 262.13, 279.18, 262.13);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(273.05, 236.24);
generalPath.curveTo(273.05, 236.24, 272.87997, 235.76001, 272.84998, 235.62001);
generalPath.curveTo(272.81998, 235.49, 272.72998, 235.33002, 272.72998, 235.33002);
generalPath.curveTo(272.72998, 235.33002, 273.61, 235.33002, 273.58, 235.60002);
generalPath.curveTo(273.56, 235.87003, 273.3, 235.87003, 273.24, 235.97002);
generalPath.curveTo(273.19, 236.08002, 273.05, 236.24002, 273.05, 236.24002);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(273.05, 236.24);
generalPath.curveTo(273.05, 236.24, 272.87997, 235.76001, 272.84998, 235.62001);
generalPath.curveTo(272.81998, 235.49, 272.72998, 235.33002, 272.72998, 235.33002);
generalPath.curveTo(272.72998, 235.33002, 273.61, 235.33002, 273.58, 235.60002);
generalPath.curveTo(273.56, 235.87003, 273.3, 235.87003, 273.24, 235.97002);
generalPath.curveTo(273.19, 236.08002, 273.05, 236.24002, 273.05, 236.24002);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(277.06, 234.85);
generalPath.lineTo(277.0, 234.42001);
generalPath.curveTo(277.0, 234.42001, 277.77, 234.42001, 278.13, 234.68001);
generalPath.curveTo(278.7, 235.08, 279.06, 235.70001, 279.04, 235.73001);
generalPath.curveTo(278.94, 235.82, 278.5, 235.46, 278.19, 235.36002);
generalPath.curveTo(278.19, 235.36002, 277.96, 235.41002, 277.74, 235.41002);
generalPath.curveTo(277.50998, 235.41002, 277.4, 235.30002, 277.37, 235.20001);
generalPath.curveTo(277.34, 235.08002, 277.4, 234.90001, 277.4, 234.90001);
generalPath.lineTo(277.06, 234.85);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.05f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(277.06, 234.85);
generalPath.lineTo(277.0, 234.42001);
generalPath.curveTo(277.0, 234.42001, 277.77, 234.42001, 278.13, 234.68001);
generalPath.curveTo(278.7, 235.08, 279.06, 235.70001, 279.04, 235.73001);
generalPath.curveTo(278.94, 235.82, 278.5, 235.46, 278.19, 235.36002);
generalPath.curveTo(278.19, 235.36002, 277.96, 235.41002, 277.74, 235.41002);
generalPath.curveTo(277.50998, 235.41002, 277.4, 235.30002, 277.37, 235.20001);
generalPath.curveTo(277.34, 235.08002, 277.4, 234.90001, 277.4, 234.90001);
generalPath.lineTo(277.06, 234.85);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(273.08, 240.14);
generalPath.lineTo(273.40997, 239.61);
generalPath.lineTo(273.74997, 240.1);
generalPath.lineTo(273.07996, 240.14);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(273.08, 240.14);
generalPath.lineTo(273.40997, 239.61);
generalPath.lineTo(273.74997, 240.1);
generalPath.lineTo(273.07996, 240.14);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_5_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(273.89, 240.12);
generalPath.lineTo(274.29, 239.59);
generalPath.lineTo(274.72, 240.06999);
generalPath.lineTo(273.89, 240.12);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(273.89, 240.12);
generalPath.lineTo(274.29, 239.59);
generalPath.lineTo(274.72, 240.06999);
generalPath.lineTo(273.89, 240.12);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_5_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(273.53, 236.83);
generalPath.lineTo(274.35, 237.12);
generalPath.lineTo(273.61002, 237.5);
generalPath.lineTo(273.53003, 236.83);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(273.53, 236.83);
generalPath.lineTo(274.35, 237.12);
generalPath.lineTo(273.61002, 237.5);
generalPath.lineTo(273.53003, 236.83);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_5_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(274.52, 237.1);
generalPath.lineTo(275.25, 237.28);
generalPath.lineTo(274.66, 237.74);
generalPath.lineTo(274.52, 237.1);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(274.52, 237.1);
generalPath.lineTo(275.25, 237.28);
generalPath.lineTo(274.66, 237.74);
generalPath.lineTo(274.52, 237.1);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(261.88, 236.08);
generalPath.curveTo(261.88, 236.08, 262.36002, 236.42, 262.73, 236.48);
generalPath.curveTo(263.1, 236.53, 263.49002, 236.53, 263.55002, 236.53);
generalPath.curveTo(263.6, 236.53, 263.72003, 235.99, 263.66, 235.62);
generalPath.curveTo(263.46, 234.42, 262.36002, 234.15, 262.36002, 234.15);
generalPath.curveTo(262.36002, 234.15, 262.69, 234.87999, 262.53003, 235.22);
generalPath.curveTo(262.30002, 235.7, 261.88004, 236.08, 261.88004, 236.08);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(261.88, 236.08);
generalPath.curveTo(261.88, 236.08, 262.36002, 236.42, 262.73, 236.48);
generalPath.curveTo(263.1, 236.53, 263.49002, 236.53, 263.55002, 236.53);
generalPath.curveTo(263.6, 236.53, 263.72003, 235.99, 263.66, 235.62);
generalPath.curveTo(263.46, 234.42, 262.36002, 234.15, 262.36002, 234.15);
generalPath.curveTo(262.36002, 234.15, 262.69, 234.87999, 262.53003, 235.22);
generalPath.curveTo(262.30002, 235.7, 261.88004, 236.08, 261.88004, 236.08);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(259.59, 237.12);
generalPath.curveTo(259.59, 237.12, 259.16, 236.34999, 258.26, 236.45);
generalPath.curveTo(257.36002, 236.56, 256.76, 237.26, 256.76, 237.26);
generalPath.curveTo(256.76, 237.26, 257.76, 237.23, 258.01, 237.39);
generalPath.curveTo(258.38, 237.63, 258.49002, 238.25, 258.49002, 238.25);
generalPath.curveTo(258.49002, 238.25, 259.03003, 237.93, 259.2, 237.71);
generalPath.curveTo(259.36002, 237.5, 259.59003, 237.12001, 259.59003, 237.12001);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(259.59, 237.12);
generalPath.curveTo(259.59, 237.12, 259.16, 236.34999, 258.26, 236.45);
generalPath.curveTo(257.36002, 236.56, 256.76, 237.26, 256.76, 237.26);
generalPath.curveTo(256.76, 237.26, 257.76, 237.23, 258.01, 237.39);

}

private void _paint13(Graphics2D g,float origAlpha) {
generalPath.curveTo(258.38, 237.63, 258.49002, 238.25, 258.49002, 238.25);
generalPath.curveTo(258.49002, 238.25, 259.03003, 237.93, 259.2, 237.71);
generalPath.curveTo(259.36002, 237.5, 259.59003, 237.12001, 259.59003, 237.12001);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(258.49, 240.25);
generalPath.curveTo(258.49, 240.25, 257.72, 240.36, 257.3, 240.84);
generalPath.curveTo(256.87, 241.33, 256.94, 242.23999, 256.94, 242.23999);
generalPath.curveTo(256.94, 242.23999, 257.44, 241.7, 257.89, 241.7);
generalPath.curveTo(258.35, 241.7, 259.05002, 241.86, 259.05002, 241.86);
generalPath.curveTo(259.05002, 241.86, 258.83002, 241.3, 258.83002, 241.06);
generalPath.curveTo(258.83002, 240.81999, 258.49002, 240.25, 258.49002, 240.25);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(258.49, 240.25);
generalPath.curveTo(258.49, 240.25, 257.72, 240.36, 257.3, 240.84);
generalPath.curveTo(256.87, 241.33, 256.94, 242.23999, 256.94, 242.23999);
generalPath.curveTo(256.94, 242.23999, 257.44, 241.7, 257.89, 241.7);
generalPath.curveTo(258.35, 241.7, 259.05002, 241.86, 259.05002, 241.86);
generalPath.curveTo(259.05002, 241.86, 258.83002, 241.3, 258.83002, 241.06);
generalPath.curveTo(258.83002, 240.81999, 258.49002, 240.25, 258.49002, 240.25);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(261.06, 250.37);
generalPath.curveTo(261.06, 250.37, 260.63998, 249.92, 259.9, 250.04999);
generalPath.curveTo(259.16, 250.18999, 258.68, 251.01999, 258.68, 251.01999);
generalPath.curveTo(258.68, 251.01999, 259.31, 250.84999, 259.68, 250.93999);
generalPath.curveTo(260.03998, 251.01999, 260.3, 251.38998, 260.3, 251.38998);
generalPath.curveTo(260.3, 251.38998, 260.63998, 251.09999, 260.75, 250.93999);
generalPath.curveTo(260.86002, 250.77998, 261.06, 250.36998, 261.06, 250.36998);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(261.06, 250.37);
generalPath.curveTo(261.06, 250.37, 260.63998, 249.92, 259.9, 250.04999);
generalPath.curveTo(259.16, 250.18999, 258.68, 251.01999, 258.68, 251.01999);
generalPath.curveTo(258.68, 251.01999, 259.31, 250.84999, 259.68, 250.93999);
generalPath.curveTo(260.03998, 251.01999, 260.3, 251.38998, 260.3, 251.38998);
generalPath.curveTo(260.3, 251.38998, 260.63998, 251.09999, 260.75, 250.93999);
generalPath.curveTo(260.86002, 250.77998, 261.06, 250.36998, 261.06, 250.36998);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(260.21, 253.34);
generalPath.curveTo(260.21, 253.34, 259.59, 253.23999, 259.05, 253.67);
generalPath.curveTo(258.52, 254.09999, 258.49, 254.92, 258.49, 254.92);
generalPath.curveTo(258.49, 254.92, 259.0, 254.49, 259.4, 254.55);
generalPath.curveTo(259.79, 254.6, 260.27, 254.82, 260.27, 254.82);
generalPath.curveTo(260.27, 254.82, 260.34998, 254.31001, 260.37997, 254.18001);
generalPath.curveTo(260.46997, 253.8, 260.20996, 253.34001, 260.20996, 253.34001);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(260.21, 253.34);
generalPath.curveTo(260.21, 253.34, 259.59, 253.23999, 259.05, 253.67);
generalPath.curveTo(258.52, 254.09999, 258.49, 254.92, 258.49, 254.92);
generalPath.curveTo(258.49, 254.92, 259.0, 254.49, 259.4, 254.55);
generalPath.curveTo(259.79, 254.6, 260.27, 254.82, 260.27, 254.82);
generalPath.curveTo(260.27, 254.82, 260.34998, 254.31001, 260.37997, 254.18001);
generalPath.curveTo(260.46997, 253.8, 260.20996, 253.34001, 260.20996, 253.34001);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(261.66, 256.08);
generalPath.curveTo(261.66, 256.08, 261.61002, 256.87, 261.99, 257.36);
generalPath.curveTo(262.38998, 257.87, 263.12, 257.94998, 263.12, 257.94998);
generalPath.curveTo(263.12, 257.94998, 262.88, 257.41998, 262.84, 257.15);
generalPath.curveTo(262.78, 256.75, 263.18, 256.4, 263.18, 256.4);
generalPath.curveTo(263.18, 256.4, 262.81, 256.02, 262.44998, 256.02);
generalPath.curveTo(262.08, 256.02, 261.65997, 256.08, 261.65997, 256.08);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(261.66, 256.08);
generalPath.curveTo(261.66, 256.08, 261.61002, 256.87, 261.99, 257.36);
generalPath.curveTo(262.38998, 257.87, 263.12, 257.94998, 263.12, 257.94998);
generalPath.curveTo(263.12, 257.94998, 262.88, 257.41998, 262.84, 257.15);
generalPath.curveTo(262.78, 256.75, 263.18, 256.4, 263.18, 256.4);
generalPath.curveTo(263.18, 256.4, 262.81, 256.02, 262.44998, 256.02);
generalPath.curveTo(262.08, 256.02, 261.65997, 256.08, 261.65997, 256.08);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(269.0, 263.12);
generalPath.curveTo(269.0, 263.12, 268.49, 262.47998, 267.79, 262.5);
generalPath.curveTo(267.08002, 262.53, 266.34, 263.19, 266.34, 263.19);
generalPath.curveTo(266.34, 263.19, 267.22, 263.12, 267.44998, 263.41);
generalPath.curveTo(267.68, 263.71, 267.9, 264.08002, 267.9, 264.08002);
generalPath.curveTo(267.9, 264.08002, 268.3, 263.87003, 268.47, 263.73);
generalPath.curveTo(268.64, 263.6, 269.0, 263.12003, 269.0, 263.12003);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(269.0, 263.12);
generalPath.curveTo(269.0, 263.12, 268.49, 262.47998, 267.79, 262.5);
generalPath.curveTo(267.08002, 262.53, 266.34, 263.19, 266.34, 263.19);
generalPath.curveTo(266.34, 263.19, 267.22, 263.12, 267.44998, 263.41);
generalPath.curveTo(267.68, 263.71, 267.9, 264.08002, 267.9, 264.08002);
generalPath.curveTo(267.9, 264.08002, 268.3, 263.87003, 268.47, 263.73);
generalPath.curveTo(268.64, 263.6, 269.0, 263.12003, 269.0, 263.12003);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(266.83, 265.93);
generalPath.curveTo(266.83, 265.93, 265.9, 265.78998, 265.43997, 266.28);
generalPath.curveTo(264.98996, 266.76, 265.01996, 267.63998, 265.01996, 267.63998);
generalPath.curveTo(265.01996, 267.63998, 265.57996, 267.03, 266.08997, 267.08);
generalPath.curveTo(266.59998, 267.12997, 267.16995, 267.4, 267.16995, 267.4);
generalPath.curveTo(267.16995, 267.4, 267.07996, 266.87, 267.01996, 266.62);
generalPath.curveTo(266.96997, 266.38, 266.82996, 265.93, 266.82996, 265.93);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(266.83, 265.93);
generalPath.curveTo(266.83, 265.93, 265.9, 265.78998, 265.43997, 266.28);
generalPath.curveTo(264.98996, 266.76, 265.01996, 267.63998, 265.01996, 267.63998);
generalPath.curveTo(265.01996, 267.63998, 265.57996, 267.03, 266.08997, 267.08);
generalPath.curveTo(266.59998, 267.12997, 267.16995, 267.4, 267.16995, 267.4);
generalPath.curveTo(267.16995, 267.4, 267.07996, 266.87, 267.01996, 266.62);
generalPath.curveTo(266.96997, 266.38, 266.82996, 265.93, 266.82996, 265.93);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(268.84, 268.9);
generalPath.curveTo(268.84, 268.9, 268.38, 269.54, 268.72, 270.05);
generalPath.curveTo(269.06, 270.55997, 269.77, 270.8, 269.77, 270.8);
generalPath.curveTo(269.77, 270.8, 269.50998, 270.43, 269.62997, 270.0);
generalPath.curveTo(269.71997, 269.66, 270.3, 269.2, 270.3, 269.2);
generalPath.lineTo(268.84, 268.90002);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(268.84, 268.9);
generalPath.curveTo(268.84, 268.9, 268.38, 269.54, 268.72, 270.05);
generalPath.curveTo(269.06, 270.55997, 269.77, 270.8, 269.77, 270.8);
generalPath.curveTo(269.77, 270.8, 269.50998, 270.43, 269.62997, 270.0);
generalPath.curveTo(269.71997, 269.66, 270.3, 269.2, 270.3, 269.2);
generalPath.lineTo(268.84, 268.90002);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(281.24, 270.11);
generalPath.curveTo(281.24, 270.11, 280.43, 269.91998, 279.97, 270.18997);
generalPath.curveTo(279.52, 270.44998, 279.15, 271.58, 279.15, 271.58);
generalPath.curveTo(279.15, 271.58, 279.88998, 270.96, 280.43, 271.03998);
generalPath.curveTo(280.96, 271.11996, 281.36, 271.33997, 281.36, 271.33997);
generalPath.curveTo(281.36, 271.33997, 281.43997, 270.87997, 281.37997, 270.55997);
generalPath.curveTo(281.34998, 270.36996, 281.23996, 270.10995, 281.23996, 270.10995);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(281.24, 270.11);
generalPath.curveTo(281.24, 270.11, 280.43, 269.91998, 279.97, 270.18997);
generalPath.curveTo(279.52, 270.44998, 279.15, 271.58, 279.15, 271.58);
generalPath.curveTo(279.15, 271.58, 279.88998, 270.96, 280.43, 271.03998);
generalPath.curveTo(280.96, 271.11996, 281.36, 271.33997, 281.36, 271.33997);
generalPath.curveTo(281.36, 271.33997, 281.43997, 270.87997, 281.37997, 270.55997);
generalPath.curveTo(281.34998, 270.36996, 281.23996, 270.10995, 281.23996, 270.10995);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(281.64, 273.1);
generalPath.curveTo(281.64, 273.1, 281.02002, 273.74002, 281.24002, 274.28);
generalPath.curveTo(281.47003, 274.82, 281.86002, 275.38, 281.86002, 275.38);
generalPath.curveTo(281.86002, 275.38, 281.84003, 274.58002, 282.09003, 274.36002);
generalPath.curveTo(282.46002, 274.04, 283.14, 273.99002, 283.14, 273.99002);
generalPath.curveTo(283.14, 273.99002, 282.6, 273.51, 282.43002, 273.45);
generalPath.curveTo(282.26, 273.40002, 281.64, 273.1, 281.64, 273.1);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(281.64, 273.1);
generalPath.curveTo(281.64, 273.1, 281.02002, 273.74002, 281.24002, 274.28);
generalPath.curveTo(281.47003, 274.82, 281.86002, 275.38, 281.86002, 275.38);
generalPath.curveTo(281.86002, 275.38, 281.84003, 274.58002, 282.09003, 274.36002);
generalPath.curveTo(282.46002, 274.04, 283.14, 273.99002, 283.14, 273.99002);
generalPath.curveTo(283.14, 273.99002, 282.6, 273.51, 282.43002, 273.45);
generalPath.curveTo(282.26, 273.40002, 281.64, 273.1, 281.64, 273.1);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_6_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(284.75, 274.04);
generalPath.curveTo(284.75, 274.04, 284.44, 274.82, 285.03, 275.32);
generalPath.curveTo(285.62, 275.84, 286.13998, 275.89, 286.13998, 275.89);
generalPath.curveTo(286.13998, 275.89, 285.68, 275.08002, 285.81998, 274.66);
generalPath.curveTo(285.96997, 274.21, 286.36, 273.94, 286.36, 273.94);
generalPath.curveTo(286.36, 273.94, 285.62, 273.69, 285.50998, 273.72);
generalPath.curveTo(285.4, 273.74, 284.74997, 274.04, 284.74997, 274.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(219, 68, 70, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.39f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(284.75, 274.04);
generalPath.curveTo(284.75, 274.04, 284.44, 274.82, 285.03, 275.32);
generalPath.curveTo(285.62, 275.84, 286.13998, 275.89, 286.13998, 275.89);
generalPath.curveTo(286.13998, 275.89, 285.68, 275.08002, 285.81998, 274.66);
generalPath.curveTo(285.96997, 274.21, 286.36, 273.94, 286.36, 273.94);
generalPath.curveTo(286.36, 273.94, 285.62, 273.69, 285.50998, 273.72);
generalPath.curveTo(285.4, 273.74, 284.74997, 274.04, 284.74997, 274.04);
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
// _0_2_2_4_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(282.88, 232.71);
generalPath.lineTo(282.59, 232.73001);
generalPath.curveTo(282.58, 232.76001, 282.44998, 232.97002, 282.33, 233.08002);
generalPath.curveTo(282.06998, 233.33002, 281.68, 233.36002, 281.47, 233.15002);
generalPath.curveTo(281.36002, 233.04002, 281.31, 232.89003, 281.33, 232.74002);
generalPath.curveTo(281.15997, 232.83002, 280.97998, 232.83002, 280.81998, 232.73003);
generalPath.curveTo(280.55997, 232.58003, 280.49997, 232.23003, 280.67996, 231.94003);
generalPath.curveTo(280.70996, 231.88004, 280.73996, 231.80003, 280.78995, 231.76004);
generalPath.lineTo(280.76996, 231.44003);
generalPath.lineTo(280.41995, 231.52003);
generalPath.lineTo(280.31995, 231.71004);
generalPath.curveTo(280.09995, 231.96004, 279.77994, 232.02003, 279.61993, 231.88004);
generalPath.curveTo(279.53995, 231.81003, 279.47992, 231.62004, 279.48993, 231.61003);
generalPath.curveTo(279.48993, 231.62003, 279.39993, 231.70003, 279.31992, 231.72003);
generalPath.curveTo(278.7799, 231.85004, 278.56992, 230.67003, 278.54993, 230.37003);
generalPath.lineTo(278.3799, 230.62003);
generalPath.curveTo(278.3799, 230.62003, 278.53992, 231.32002, 278.4599, 231.92003);
generalPath.curveTo(278.3799, 232.51003, 278.1699, 233.11003, 278.1699, 233.11003);
generalPath.curveTo(278.90988, 233.30003, 280.02988, 233.91003, 281.1399, 234.76003);
generalPath.curveTo(282.2499, 235.61002, 283.1199, 236.54002, 283.4799, 237.18002);
generalPath.curveTo(283.4799, 237.18002, 284.05988, 236.86002, 284.65988, 236.67003);
generalPath.curveTo(285.2599, 236.48004, 286.01987, 236.47003, 286.01987, 236.47003);
generalPath.lineTo(286.23987, 236.26003);
generalPath.curveTo(285.91986, 236.31003, 284.65988, 236.36003, 284.67987, 235.83003);
generalPath.curveTo(284.67987, 235.75003, 284.74988, 235.65004, 284.75986, 235.65004);
generalPath.curveTo(284.74985, 235.66003, 284.54987, 235.64005, 284.45987, 235.59004);
generalPath.curveTo(284.27988, 235.46004, 284.27988, 235.16005, 284.47986, 234.90004);
generalPath.lineTo(284.65985, 234.77003);
generalPath.lineTo(284.66986, 234.43004);
generalPath.lineTo(284.32986, 234.48004);
generalPath.curveTo(284.29987, 234.52003, 284.21988, 234.57004, 284.17987, 234.61005);
generalPath.curveTo(283.90988, 234.84004, 283.52988, 234.86005, 283.3199, 234.64005);
generalPath.curveTo(283.18988, 234.52005, 283.14987, 234.35005, 283.2099, 234.18004);
generalPath.curveTo(283.0499, 234.22003, 282.8899, 234.21004, 282.7599, 234.13004);
generalPath.curveTo(282.49988, 233.98004, 282.4499, 233.61003, 282.6499, 233.33003);
generalPath.curveTo(282.7399, 233.19003, 282.9299, 233.02003, 282.9599, 233.01003);
generalPath.lineTo(282.8899, 232.71002);
generalPath.lineTo(282.87988, 232.71002);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(282.88, 232.71);
generalPath.lineTo(282.59, 232.73001);
generalPath.curveTo(282.58, 232.76001, 282.44998, 232.97002, 282.33, 233.08002);
generalPath.curveTo(282.06998, 233.33002, 281.68, 233.36002, 281.47, 233.15002);
generalPath.curveTo(281.36002, 233.04002, 281.31, 232.89003, 281.33, 232.74002);
generalPath.curveTo(281.15997, 232.83002, 280.97998, 232.83002, 280.81998, 232.73003);
generalPath.curveTo(280.55997, 232.58003, 280.49997, 232.23003, 280.67996, 231.94003);
generalPath.curveTo(280.70996, 231.88004, 280.73996, 231.80003, 280.78995, 231.76004);
generalPath.lineTo(280.76996, 231.44003);
generalPath.lineTo(280.41995, 231.52003);
generalPath.lineTo(280.31995, 231.71004);
generalPath.curveTo(280.09995, 231.96004, 279.77994, 232.02003, 279.61993, 231.88004);
generalPath.curveTo(279.53995, 231.81003, 279.47992, 231.62004, 279.48993, 231.61003);
generalPath.curveTo(279.48993, 231.62003, 279.39993, 231.70003, 279.31992, 231.72003);
generalPath.curveTo(278.7799, 231.85004, 278.56992, 230.67003, 278.54993, 230.37003);
generalPath.lineTo(278.3799, 230.62003);
generalPath.curveTo(278.3799, 230.62003, 278.53992, 231.32002, 278.4599, 231.92003);
generalPath.curveTo(278.3799, 232.51003, 278.1699, 233.11003, 278.1699, 233.11003);
generalPath.curveTo(278.90988, 233.30003, 280.02988, 233.91003, 281.1399, 234.76003);
generalPath.curveTo(282.2499, 235.61002, 283.1199, 236.54002, 283.4799, 237.18002);
generalPath.curveTo(283.4799, 237.18002, 284.05988, 236.86002, 284.65988, 236.67003);
generalPath.curveTo(285.2599, 236.48004, 286.01987, 236.47003, 286.01987, 236.47003);
generalPath.lineTo(286.23987, 236.26003);
generalPath.curveTo(285.91986, 236.31003, 284.65988, 236.36003, 284.67987, 235.83003);
generalPath.curveTo(284.67987, 235.75003, 284.74988, 235.65004, 284.75986, 235.65004);
generalPath.curveTo(284.74985, 235.66003, 284.54987, 235.64005, 284.45987, 235.59004);
generalPath.curveTo(284.27988, 235.46004, 284.27988, 235.16005, 284.47986, 234.90004);
generalPath.lineTo(284.65985, 234.77003);
generalPath.lineTo(284.66986, 234.43004);
generalPath.lineTo(284.32986, 234.48004);
generalPath.curveTo(284.29987, 234.52003, 284.21988, 234.57004, 284.17987, 234.61005);
generalPath.curveTo(283.90988, 234.84004, 283.52988, 234.86005, 283.3199, 234.64005);
generalPath.curveTo(283.18988, 234.52005, 283.14987, 234.35005, 283.2099, 234.18004);
generalPath.curveTo(283.0499, 234.22003, 282.8899, 234.21004, 282.7599, 234.13004);
generalPath.curveTo(282.49988, 233.98004, 282.4499, 233.61003, 282.6499, 233.33003);
generalPath.curveTo(282.7399, 233.19003, 282.9299, 233.02003, 282.9599, 233.01003);
generalPath.lineTo(282.8899, 232.71002);
generalPath.lineTo(282.87988, 232.71002);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(280.63, 233.4);
generalPath.curveTo(280.68, 233.32999, 280.78, 233.34, 280.86002, 233.4);
generalPath.curveTo(280.94003, 233.45999, 280.96002, 233.56, 280.92, 233.61);
generalPath.curveTo(280.87003, 233.67, 280.77002, 233.67, 280.68002, 233.6);
generalPath.curveTo(280.61002, 233.55, 280.58002, 233.45001, 280.63004, 233.40001);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.05f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(280.63, 233.4);
generalPath.curveTo(280.68, 233.32999, 280.78, 233.34, 280.86002, 233.4);
generalPath.curveTo(280.94003, 233.45999, 280.96002, 233.56, 280.92, 233.61);
generalPath.curveTo(280.87003, 233.67, 280.77002, 233.67, 280.68002, 233.6);
generalPath.curveTo(280.61002, 233.55, 280.58002, 233.45001, 280.63004, 233.40001);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_1_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(281.58, 234.19);
generalPath.lineTo(281.25, 233.94);
generalPath.curveTo(281.19, 233.90001, 281.18, 233.82, 281.21, 233.78);
generalPath.curveTo(281.25, 233.74, 281.33, 233.74, 281.38998, 233.78);
generalPath.lineTo(281.71997, 234.04);
generalPath.lineTo(282.04996, 234.29);
generalPath.curveTo(282.09995, 234.32999, 282.12994, 234.40999, 282.08997, 234.45);
generalPath.curveTo(282.05, 234.49, 281.96997, 234.48999, 281.90997, 234.45);
generalPath.lineTo(281.58, 234.19);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.05f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(281.58, 234.19);
generalPath.lineTo(281.25, 233.94);
generalPath.curveTo(281.19, 233.90001, 281.18, 233.82, 281.21, 233.78);
generalPath.curveTo(281.25, 233.74, 281.33, 233.74, 281.38998, 233.78);
generalPath.lineTo(281.71997, 234.04);
generalPath.lineTo(282.04996, 234.29);
generalPath.curveTo(282.09995, 234.32999, 282.12994, 234.40999, 282.08997, 234.45);
generalPath.curveTo(282.05, 234.49, 281.96997, 234.48999, 281.90997, 234.45);
generalPath.lineTo(281.58, 234.19);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_1_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(279.84, 233.0);
generalPath.lineTo(279.58, 232.85);
generalPath.curveTo(279.50998, 232.81001, 279.47998, 232.73001, 279.50998, 232.68001);
generalPath.curveTo(279.53998, 232.63, 279.61996, 232.62001, 279.68, 232.66);
generalPath.lineTo(279.94, 232.82);
generalPath.lineTo(280.2, 232.97);
generalPath.curveTo(280.26, 233.0, 280.29, 233.08, 280.27002, 233.13);
generalPath.curveTo(280.24002, 233.18001, 280.16003, 233.19, 280.1, 233.15001);
generalPath.lineTo(279.84, 233.00002);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.05f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(279.84, 233.0);
generalPath.lineTo(279.58, 232.85);
generalPath.curveTo(279.50998, 232.81001, 279.47998, 232.73001, 279.50998, 232.68001);
generalPath.curveTo(279.53998, 232.63, 279.61996, 232.62001, 279.68, 232.66);
generalPath.lineTo(279.94, 232.82);
generalPath.lineTo(280.2, 232.97);
generalPath.curveTo(280.26, 233.0, 280.29, 233.08, 280.27002, 233.13);
generalPath.curveTo(280.24002, 233.18001, 280.16003, 233.19, 280.1, 233.15001);
generalPath.lineTo(279.84, 233.00002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_1_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(278.8, 232.29);
generalPath.curveTo(278.84998, 232.23, 278.96, 232.23, 279.03998, 232.29);
generalPath.curveTo(279.11996, 232.36, 279.13998, 232.45, 279.08997, 232.51);
generalPath.curveTo(279.03998, 232.56, 278.93997, 232.56, 278.85995, 232.5);
generalPath.curveTo(278.77994, 232.44, 278.75995, 232.35, 278.79996, 232.29);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.05f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(278.8, 232.29);
generalPath.curveTo(278.84998, 232.23, 278.96, 232.23, 279.03998, 232.29);
generalPath.curveTo(279.11996, 232.36, 279.13998, 232.45, 279.08997, 232.51);
generalPath.curveTo(279.03998, 232.56, 278.93997, 232.56, 278.85995, 232.5);
generalPath.curveTo(278.77994, 232.44, 278.75995, 232.35, 278.79996, 232.29);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_1_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(282.63, 234.92);
generalPath.curveTo(282.68, 234.87, 282.66, 234.78, 282.58002, 234.70999);
generalPath.curveTo(282.50003, 234.65, 282.39, 234.65, 282.34003, 234.70999);
generalPath.curveTo(282.30002, 234.76, 282.32004, 234.85999, 282.40002, 234.92);
generalPath.curveTo(282.48, 234.98001, 282.58002, 234.98, 282.63004, 234.92);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.05f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(282.63, 234.92);
generalPath.curveTo(282.68, 234.87, 282.66, 234.78, 282.58002, 234.70999);
generalPath.curveTo(282.50003, 234.65, 282.39, 234.65, 282.34003, 234.70999);
generalPath.curveTo(282.30002, 234.76, 282.32004, 234.85999, 282.40002, 234.92);
generalPath.curveTo(282.48, 234.98001, 282.58002, 234.98, 282.63004, 234.92);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_1_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.2, 235.58);
generalPath.lineTo(283.42, 235.79001);
generalPath.curveTo(283.47, 235.84001, 283.55002, 235.86002, 283.6, 235.82);
generalPath.curveTo(283.64, 235.78001, 283.64, 235.71, 283.59, 235.66);
generalPath.lineTo(283.38, 235.45);
generalPath.lineTo(283.16, 235.23999);
generalPath.curveTo(283.11002, 235.18999, 283.02, 235.16998, 282.98, 235.20999);
generalPath.curveTo(282.93002, 235.23999, 282.94, 235.31999, 282.99002, 235.37);
generalPath.lineTo(283.2, 235.58);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.05f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.2, 235.58);
generalPath.lineTo(283.42, 235.79001);
generalPath.curveTo(283.47, 235.84001, 283.55002, 235.86002, 283.6, 235.82);
generalPath.curveTo(283.64, 235.78001, 283.64, 235.71, 283.59, 235.66);
generalPath.lineTo(283.38, 235.45);
generalPath.lineTo(283.16, 235.23999);
generalPath.curveTo(283.11002, 235.18999, 283.02, 235.16998, 282.98, 235.20999);
generalPath.curveTo(282.93002, 235.23999, 282.94, 235.31999, 282.99002, 235.37);
generalPath.lineTo(283.2, 235.58);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_1_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(284.15, 236.39);
generalPath.curveTo(284.19998, 236.33, 284.18, 236.24, 284.1, 236.18);
generalPath.curveTo(284.02002, 236.10999, 283.92, 236.10999, 283.87, 236.17);
generalPath.curveTo(283.81998, 236.23001, 283.84, 236.31999, 283.91998, 236.39);
generalPath.curveTo(283.99997, 236.44, 284.09998, 236.45, 284.15, 236.39);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.05f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(284.15, 236.39);
generalPath.curveTo(284.19998, 236.33, 284.18, 236.24, 284.1, 236.18);
generalPath.curveTo(284.02002, 236.10999, 283.92, 236.10999, 283.87, 236.17);
generalPath.curveTo(283.81998, 236.23001, 283.84, 236.31999, 283.91998, 236.39);
generalPath.curveTo(283.99997, 236.44, 284.09998, 236.45, 284.15, 236.39);
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
// _0_2_2_4_7_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(281.4, 230.36);
generalPath.lineTo(280.81, 230.37);
generalPath.lineTo(280.7, 231.23999);
generalPath.lineTo(280.76, 231.37999);
generalPath.lineTo(280.91, 231.37);
generalPath.lineTo(281.67, 230.86);
generalPath.lineTo(281.40002, 230.36);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(281.4, 230.36);
generalPath.lineTo(280.81, 230.37);
generalPath.lineTo(280.7, 231.23999);
generalPath.lineTo(280.76, 231.37999);
generalPath.lineTo(280.91, 231.37);
generalPath.lineTo(281.67, 230.86);
generalPath.lineTo(281.40002, 230.36);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(281.4, 230.36);
generalPath.lineTo(280.81, 230.37);
generalPath.lineTo(280.7, 231.23999);
generalPath.lineTo(280.76, 231.37999);
generalPath.lineTo(280.91, 231.37);
generalPath.lineTo(281.67, 230.86);
generalPath.lineTo(281.40002, 230.36);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(281.4, 230.36);
generalPath.lineTo(280.81, 230.37);
generalPath.lineTo(280.7, 231.23999);
generalPath.lineTo(280.76, 231.37999);
generalPath.lineTo(280.91, 231.37);
generalPath.lineTo(281.67, 230.86);
generalPath.lineTo(281.40002, 230.36);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(279.8, 230.84);
generalPath.lineTo(279.78, 231.37999);
generalPath.lineTo(280.7, 231.49998);
generalPath.lineTo(280.85, 231.42998);
generalPath.lineTo(280.83002, 231.27998);
generalPath.lineTo(280.30002, 230.56998);
generalPath.lineTo(279.80002, 230.83998);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(279.8, 230.84);
generalPath.lineTo(279.78, 231.37999);
generalPath.lineTo(280.7, 231.49998);
generalPath.lineTo(280.85, 231.42998);
generalPath.lineTo(280.83002, 231.27998);
generalPath.lineTo(280.30002, 230.56998);
generalPath.lineTo(279.80002, 230.83998);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(281.7, 231.92);
generalPath.lineTo(281.21002, 232.19);
generalPath.lineTo(280.67, 231.48);
generalPath.lineTo(280.66, 231.33);
generalPath.lineTo(280.80002, 231.27);
generalPath.lineTo(281.73, 231.38);
generalPath.lineTo(281.7, 231.92);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(281.7, 231.92);
generalPath.lineTo(281.21002, 232.19);
generalPath.lineTo(280.67, 231.48);
generalPath.lineTo(280.66, 231.33);
generalPath.lineTo(280.80002, 231.27);
generalPath.lineTo(281.73, 231.38);
generalPath.lineTo(281.7, 231.92);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(280.51, 231.25);
generalPath.curveTo(280.59, 231.12, 280.77002, 231.08, 280.90002, 231.16);
generalPath.curveTo(281.04004, 231.23001, 281.08002, 231.40001, 281.00003, 231.53);
generalPath.curveTo(280.92004, 231.65999, 280.74002, 231.7, 280.61002, 231.62);
generalPath.curveTo(280.47, 231.54, 280.43002, 231.37999, 280.51, 231.25);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(280.51, 231.25);
generalPath.curveTo(280.59, 231.12, 280.77002, 231.08, 280.90002, 231.16);
generalPath.curveTo(281.04004, 231.23001, 281.08002, 231.40001, 281.00003, 231.53);
generalPath.curveTo(280.92004, 231.65999, 280.74002, 231.7, 280.61002, 231.62);
generalPath.curveTo(280.47, 231.54, 280.43002, 231.37999, 280.51, 231.25);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}

}

private void _paint14(Graphics2D g,float origAlpha) {
generalPath.moveTo(278.36, 230.35);
generalPath.curveTo(278.34, 230.36, 278.22998, 229.89, 278.09998, 229.64);
generalPath.curveTo(278.02, 229.45, 277.70996, 229.21, 277.70996, 229.21);
generalPath.curveTo(277.73996, 229.16, 278.12997, 229.02, 278.57996, 229.3);
generalPath.curveTo(278.95996, 229.61, 278.54996, 230.17, 278.54996, 230.17);
generalPath.curveTo(278.54996, 230.17, 278.45996, 230.31, 278.35995, 230.34999);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(278.36, 230.35);
generalPath.curveTo(278.34, 230.36, 278.22998, 229.89, 278.09998, 229.64);
generalPath.curveTo(278.02, 229.45, 277.70996, 229.21, 277.70996, 229.21);
generalPath.curveTo(277.73996, 229.16, 278.12997, 229.02, 278.57996, 229.3);
generalPath.curveTo(278.95996, 229.61, 278.54996, 230.17, 278.54996, 230.17);
generalPath.curveTo(278.54996, 230.17, 278.45996, 230.31, 278.35995, 230.34999);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(279.39, 230.66);
generalPath.lineTo(278.97, 231.03);
generalPath.lineTo(278.29, 230.43);
generalPath.lineTo(278.35, 230.34999);
generalPath.lineTo(278.38, 230.2);
generalPath.lineTo(279.30002, 230.12999);
generalPath.lineTo(279.39, 230.65999);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(279.39, 230.66);
generalPath.lineTo(278.97, 231.03);
generalPath.lineTo(278.29, 230.43);
generalPath.lineTo(278.35, 230.34999);
generalPath.lineTo(278.38, 230.2);
generalPath.lineTo(279.30002, 230.12999);
generalPath.lineTo(279.39, 230.65999);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(278.24, 230.29);
generalPath.curveTo(278.28998, 230.14, 278.41998, 230.06, 278.52, 230.09);
generalPath.curveTo(278.62997, 230.12999, 278.66998, 230.26999, 278.62, 230.42);
generalPath.curveTo(278.57, 230.57, 278.44, 230.65, 278.33, 230.62);
generalPath.curveTo(278.22, 230.58, 278.18, 230.44, 278.24, 230.29);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(278.24, 230.29);
generalPath.curveTo(278.28998, 230.14, 278.41998, 230.06, 278.52, 230.09);
generalPath.curveTo(278.62997, 230.12999, 278.66998, 230.26999, 278.62, 230.42);
generalPath.curveTo(278.57, 230.57, 278.44, 230.65, 278.33, 230.62);
generalPath.curveTo(278.22, 230.58, 278.18, 230.44, 278.24, 230.29);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.67, 231.77);
generalPath.lineTo(283.08002, 231.71);
generalPath.lineTo(282.83002, 232.56001);
generalPath.lineTo(282.88, 232.70001);
generalPath.lineTo(283.03, 232.71);
generalPath.lineTo(283.86, 232.3);
generalPath.lineTo(283.66998, 231.77);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.67, 231.77);
generalPath.lineTo(283.08002, 231.71);
generalPath.lineTo(282.83002, 232.56001);
generalPath.lineTo(282.88, 232.70001);
generalPath.lineTo(283.03, 232.71);
generalPath.lineTo(283.86, 232.3);
generalPath.lineTo(283.66998, 231.77);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(282.01, 232.03);
generalPath.lineTo(281.91, 232.56999);
generalPath.lineTo(282.81, 232.79999);
generalPath.lineTo(282.96, 232.76);
generalPath.lineTo(282.97, 232.62);
generalPath.lineTo(282.54, 231.83);
generalPath.lineTo(282.01, 232.03);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(282.01, 232.03);
generalPath.lineTo(281.91, 232.56999);
generalPath.lineTo(282.81, 232.79999);
generalPath.lineTo(282.96, 232.76);
generalPath.lineTo(282.97, 232.62);
generalPath.lineTo(282.54, 231.83);
generalPath.lineTo(282.01, 232.03);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.73, 233.36);
generalPath.lineTo(283.2, 233.56);
generalPath.lineTo(282.78, 232.78);
generalPath.lineTo(282.79, 232.63);
generalPath.lineTo(282.94, 232.6);
generalPath.lineTo(283.83002, 232.83);
generalPath.lineTo(283.73, 233.36);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.73, 233.36);
generalPath.lineTo(283.2, 233.56);
generalPath.lineTo(282.78, 232.78);
generalPath.lineTo(282.79, 232.63);
generalPath.lineTo(282.94, 232.6);
generalPath.lineTo(283.83002, 232.83);
generalPath.lineTo(283.73, 233.36);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(282.65, 232.54);
generalPath.curveTo(282.75, 232.42, 282.93, 232.40999, 283.05, 232.5);
generalPath.curveTo(283.18, 232.59, 283.19998, 232.76, 283.09998, 232.88);
generalPath.curveTo(282.99997, 233.00002, 282.81998, 233.01001, 282.68997, 232.92);
generalPath.curveTo(282.56998, 232.83, 282.54996, 232.66, 282.64996, 232.54);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(282.65, 232.54);
generalPath.curveTo(282.75, 232.42, 282.93, 232.40999, 283.05, 232.5);
generalPath.curveTo(283.18, 232.59, 283.19998, 232.76, 283.09998, 232.88);
generalPath.curveTo(282.99997, 233.00002, 282.81998, 233.01001, 282.68997, 232.92);
generalPath.curveTo(282.56998, 232.83, 282.54996, 232.66, 282.64996, 232.54);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(285.64, 233.61);
generalPath.lineTo(285.75, 234.16);
generalPath.lineTo(284.88, 234.46);
generalPath.lineTo(284.72, 234.42001);
generalPath.lineTo(284.71, 234.28001);
generalPath.lineTo(285.06998, 233.47002);
generalPath.lineTo(285.63998, 233.61002);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(285.64, 233.61);
generalPath.lineTo(285.75, 234.16);
generalPath.lineTo(284.88, 234.46);
generalPath.lineTo(284.72, 234.42001);
generalPath.lineTo(284.71, 234.28001);
generalPath.lineTo(285.06998, 233.47002);
generalPath.lineTo(285.63998, 233.61002);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(285.49, 235.2);
generalPath.lineTo(284.93, 235.33);
generalPath.lineTo(284.62, 234.5);
generalPath.lineTo(284.66, 234.35);
generalPath.lineTo(284.81, 234.33);
generalPath.lineTo(285.66, 234.68001);
generalPath.lineTo(285.49, 235.20001);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(285.49, 235.2);
generalPath.lineTo(284.93, 235.33);
generalPath.lineTo(284.62, 234.5);
generalPath.lineTo(284.66, 234.35);
generalPath.lineTo(284.81, 234.33);
generalPath.lineTo(285.66, 234.68001);
generalPath.lineTo(285.49, 235.20001);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.97, 233.66);
generalPath.lineTo(283.79, 234.18001);
generalPath.lineTo(284.64, 234.52);
generalPath.lineTo(284.80002, 234.5);
generalPath.lineTo(284.83002, 234.36);
generalPath.lineTo(284.53003, 233.53);
generalPath.lineTo(283.97003, 233.66);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(283.97, 233.66);
generalPath.lineTo(283.79, 234.18001);
generalPath.lineTo(284.64, 234.52);
generalPath.lineTo(284.80002, 234.5);
generalPath.lineTo(284.83002, 234.36);
generalPath.lineTo(284.53003, 233.53);
generalPath.lineTo(283.97003, 233.66);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_17
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(284.91, 234.63);
generalPath.curveTo(285.03, 234.52, 285.03, 234.35, 284.93, 234.24);
generalPath.curveTo(284.82, 234.13, 284.63998, 234.13, 284.52, 234.22);
generalPath.curveTo(284.41, 234.33, 284.4, 234.5, 284.50998, 234.61);
generalPath.curveTo(284.61, 234.72, 284.8, 234.73, 284.90997, 234.63);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(284.91, 234.63);
generalPath.curveTo(285.03, 234.52, 285.03, 234.35, 284.93, 234.24);
generalPath.curveTo(284.82, 234.13, 284.63998, 234.13, 284.52, 234.22);
generalPath.curveTo(284.41, 234.33, 284.4, 234.5, 284.50998, 234.61);
generalPath.curveTo(284.61, 234.72, 284.8, 234.73, 284.90997, 234.63);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(286.29, 236.43);
generalPath.curveTo(286.29, 236.43999, 286.79, 236.45999, 287.08002, 236.51999);
generalPath.curveTo(287.28003, 236.55998, 287.6, 236.79, 287.6, 236.79);
generalPath.curveTo(287.66, 236.75, 287.72, 236.37, 287.32, 236.0);
generalPath.curveTo(286.93, 235.72, 286.44, 236.22, 286.44, 236.22);
generalPath.curveTo(286.44, 236.22, 286.32, 236.34, 286.29, 236.43001);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(286.29, 236.43);
generalPath.curveTo(286.29, 236.43999, 286.79, 236.45999, 287.08002, 236.51999);
generalPath.curveTo(287.28003, 236.55998, 287.6, 236.79, 287.6, 236.79);
generalPath.curveTo(287.66, 236.75, 287.72, 236.37, 287.32, 236.0);
generalPath.curveTo(286.93, 235.72, 286.44, 236.22, 286.44, 236.22);
generalPath.curveTo(286.44, 236.22, 286.32, 236.34, 286.29, 236.43001);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(285.75, 235.54);
generalPath.lineTo(285.46, 236.0);
generalPath.lineTo(286.22, 236.51);
generalPath.lineTo(286.31, 236.43);
generalPath.lineTo(286.44, 236.39);
generalPath.lineTo(286.32, 235.51);
generalPath.lineTo(285.75, 235.54);
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(285.75, 235.54);
generalPath.lineTo(285.46, 236.0);
generalPath.lineTo(286.22, 236.51);
generalPath.lineTo(286.31, 236.43);
generalPath.lineTo(286.44, 236.39);
generalPath.lineTo(286.32, 235.51);
generalPath.lineTo(285.75, 235.54);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_4_7_20
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(286.37, 236.53);
generalPath.curveTo(286.51, 236.45999, 286.58, 236.31, 286.52, 236.22);
generalPath.curveTo(286.46, 236.13, 286.3, 236.12, 286.16, 236.2);
generalPath.curveTo(286.02002, 236.28, 285.96, 236.42, 286.02, 236.51);
generalPath.curveTo(286.06998, 236.59999, 286.22998, 236.61, 286.37, 236.53);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.26f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(286.37, 236.53);
generalPath.curveTo(286.51, 236.45999, 286.58, 236.31, 286.52, 236.22);
generalPath.curveTo(286.46, 236.13, 286.3, 236.12, 286.16, 236.2);
generalPath.curveTo(286.02002, 236.28, 285.96, 236.42, 286.02, 236.51);
generalPath.curveTo(286.06998, 236.59999, 286.22998, 236.61, 286.37, 236.53);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_5_0
shape = new Ellipse2D.Double(234.1699981689453, 262.71002197265625, 32.52000045776367, 36.599998474121094);
paint = new Color(173, 21, 25, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.61f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(234.1699981689453, 262.71002197265625, 32.52000045776367, 36.599998474121094);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_5_1
shape = new Ellipse2D.Double(239.0, 267.54998779296875, 22.8799991607666, 26.84000015258789);
paint = new Color(0, 91, 191, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.61f,0,0,4.0f,null,0.0f);
shape = new Ellipse2D.Double(239.0, 267.54998779296875, 22.8799991607666, 26.84000015258789);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_5_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_5_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(245.03, 271.74);
generalPath.curveTo(245.03, 271.74, 243.68, 273.22, 243.68, 274.59998);
generalPath.curveTo(243.68, 275.99, 244.25, 277.13998, 244.25, 277.13998);
generalPath.curveTo(244.04, 276.59, 243.49, 276.19998, 242.84, 276.19998);
generalPath.curveTo(242.01, 276.19998, 241.34, 276.83, 241.34, 277.62);
generalPath.curveTo(241.34, 277.84, 241.48, 278.19998, 241.58, 278.38998);
generalPath.lineTo(242.07, 279.37997);
generalPath.curveTo(242.23001, 279.00998, 242.61, 278.80997, 243.05, 278.80997);
generalPath.curveTo(243.64, 278.80997, 244.13, 279.25998, 244.13, 279.81998);
generalPath.curveTo(244.13, 279.90997, 244.12001, 279.99, 244.09001, 280.06998);
generalPath.lineTo(242.87001, 280.08);
generalPath.lineTo(242.87001, 281.11);
generalPath.lineTo(243.96, 281.11);
generalPath.lineTo(243.15001, 282.71997);
generalPath.lineTo(244.22002, 282.29996);
generalPath.lineTo(245.03001, 283.20996);
generalPath.lineTo(245.87001, 282.29996);
generalPath.lineTo(246.94002, 282.71997);
generalPath.lineTo(246.14001, 281.11);
generalPath.lineTo(247.22002, 281.11);
generalPath.lineTo(247.22002, 280.08);
generalPath.lineTo(246.00002, 280.06998);
generalPath.curveTo(245.98001, 279.99, 245.98001, 279.90997, 245.98001, 279.81998);
generalPath.curveTo(245.98001, 279.25998, 246.45001, 278.80997, 247.04001, 278.80997);
generalPath.curveTo(247.48001, 278.80997, 247.86002, 279.00998, 248.02, 279.37997);
generalPath.lineTo(248.51001, 278.38998);
generalPath.curveTo(248.61002, 278.19998, 248.75002, 277.84, 248.75002, 277.62);
generalPath.curveTo(248.75002, 276.83, 248.08002, 276.19998, 247.26001, 276.19998);
generalPath.curveTo(246.6, 276.19998, 246.05, 276.59, 245.85, 277.13998);
generalPath.curveTo(245.85, 277.13998, 246.42001, 275.99, 246.42001, 274.59998);
generalPath.curveTo(246.42001, 273.21997, 245.03001, 271.74, 245.03001, 271.74);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.34f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(245.03, 271.74);
generalPath.curveTo(245.03, 271.74, 243.68, 273.22, 243.68, 274.59998);
generalPath.curveTo(243.68, 275.99, 244.25, 277.13998, 244.25, 277.13998);
generalPath.curveTo(244.04, 276.59, 243.49, 276.19998, 242.84, 276.19998);
generalPath.curveTo(242.01, 276.19998, 241.34, 276.83, 241.34, 277.62);
generalPath.curveTo(241.34, 277.84, 241.48, 278.19998, 241.58, 278.38998);
generalPath.lineTo(242.07, 279.37997);
generalPath.curveTo(242.23001, 279.00998, 242.61, 278.80997, 243.05, 278.80997);
generalPath.curveTo(243.64, 278.80997, 244.13, 279.25998, 244.13, 279.81998);
generalPath.curveTo(244.13, 279.90997, 244.12001, 279.99, 244.09001, 280.06998);
generalPath.lineTo(242.87001, 280.08);
generalPath.lineTo(242.87001, 281.11);
generalPath.lineTo(243.96, 281.11);
generalPath.lineTo(243.15001, 282.71997);
generalPath.lineTo(244.22002, 282.29996);
generalPath.lineTo(245.03001, 283.20996);
generalPath.lineTo(245.87001, 282.29996);
generalPath.lineTo(246.94002, 282.71997);
generalPath.lineTo(246.14001, 281.11);
generalPath.lineTo(247.22002, 281.11);
generalPath.lineTo(247.22002, 280.08);
generalPath.lineTo(246.00002, 280.06998);
generalPath.curveTo(245.98001, 279.99, 245.98001, 279.90997, 245.98001, 279.81998);
generalPath.curveTo(245.98001, 279.25998, 246.45001, 278.80997, 247.04001, 278.80997);
generalPath.curveTo(247.48001, 278.80997, 247.86002, 279.00998, 248.02, 279.37997);
generalPath.lineTo(248.51001, 278.38998);
generalPath.curveTo(248.61002, 278.19998, 248.75002, 277.84, 248.75002, 277.62);
generalPath.curveTo(248.75002, 276.83, 248.08002, 276.19998, 247.26001, 276.19998);
generalPath.curveTo(246.6, 276.19998, 246.05, 276.59, 245.85, 277.13998);
generalPath.curveTo(245.85, 277.13998, 246.42001, 275.99, 246.42001, 274.59998);
generalPath.curveTo(246.42001, 273.21997, 245.03001, 271.74, 245.03001, 271.74);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_5_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(242.87, 281.11);
generalPath.lineTo(247.23, 281.11);
generalPath.lineTo(247.23, 280.08);
generalPath.lineTo(242.87, 280.08);
generalPath.lineTo(242.87, 281.11);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.34f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(242.87, 281.11);
generalPath.lineTo(247.23, 281.11);
generalPath.lineTo(247.23, 280.08);
generalPath.lineTo(242.87, 280.08);
generalPath.lineTo(242.87, 281.11);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.630000114440918f, 0.0f));
// _0_2_2_5_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_5_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_5_3_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(245.03, 271.74);
generalPath.curveTo(245.03, 271.74, 243.68, 273.22, 243.68, 274.59998);
generalPath.curveTo(243.68, 275.99, 244.25, 277.13998, 244.25, 277.13998);
generalPath.curveTo(244.04, 276.59, 243.49, 276.19998, 242.84, 276.19998);
generalPath.curveTo(242.01, 276.19998, 241.34, 276.83, 241.34, 277.62);
generalPath.curveTo(241.34, 277.84, 241.48, 278.19998, 241.58, 278.38998);
generalPath.lineTo(242.07, 279.37997);
generalPath.curveTo(242.23001, 279.00998, 242.61, 278.80997, 243.05, 278.80997);
generalPath.curveTo(243.64, 278.80997, 244.13, 279.25998, 244.13, 279.81998);
generalPath.curveTo(244.13, 279.90997, 244.12001, 279.99, 244.09001, 280.06998);
generalPath.lineTo(242.87001, 280.08);
generalPath.lineTo(242.87001, 281.11);
generalPath.lineTo(243.96, 281.11);
generalPath.lineTo(243.15001, 282.71997);
generalPath.lineTo(244.22002, 282.29996);
generalPath.lineTo(245.03001, 283.20996);
generalPath.lineTo(245.87001, 282.29996);
generalPath.lineTo(246.94002, 282.71997);
generalPath.lineTo(246.14001, 281.11);
generalPath.lineTo(247.22002, 281.11);
generalPath.lineTo(247.22002, 280.08);
generalPath.lineTo(246.00002, 280.06998);
generalPath.curveTo(245.98001, 279.99, 245.98001, 279.90997, 245.98001, 279.81998);
generalPath.curveTo(245.98001, 279.25998, 246.45001, 278.80997, 247.04001, 278.80997);
generalPath.curveTo(247.48001, 278.80997, 247.86002, 279.00998, 248.02, 279.37997);
generalPath.lineTo(248.51001, 278.38998);
generalPath.curveTo(248.61002, 278.19998, 248.75002, 277.84, 248.75002, 277.62);
generalPath.curveTo(248.75002, 276.83, 248.08002, 276.19998, 247.26001, 276.19998);
generalPath.curveTo(246.6, 276.19998, 246.05, 276.59, 245.85, 277.13998);
generalPath.curveTo(245.85, 277.13998, 246.42001, 275.99, 246.42001, 274.59998);
generalPath.curveTo(246.42001, 273.21997, 245.03001, 271.74, 245.03001, 271.74);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.34f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(245.03, 271.74);
generalPath.curveTo(245.03, 271.74, 243.68, 273.22, 243.68, 274.59998);
generalPath.curveTo(243.68, 275.99, 244.25, 277.13998, 244.25, 277.13998);
generalPath.curveTo(244.04, 276.59, 243.49, 276.19998, 242.84, 276.19998);
generalPath.curveTo(242.01, 276.19998, 241.34, 276.83, 241.34, 277.62);
generalPath.curveTo(241.34, 277.84, 241.48, 278.19998, 241.58, 278.38998);
generalPath.lineTo(242.07, 279.37997);
generalPath.curveTo(242.23001, 279.00998, 242.61, 278.80997, 243.05, 278.80997);
generalPath.curveTo(243.64, 278.80997, 244.13, 279.25998, 244.13, 279.81998);
generalPath.curveTo(244.13, 279.90997, 244.12001, 279.99, 244.09001, 280.06998);
generalPath.lineTo(242.87001, 280.08);
generalPath.lineTo(242.87001, 281.11);
generalPath.lineTo(243.96, 281.11);
generalPath.lineTo(243.15001, 282.71997);
generalPath.lineTo(244.22002, 282.29996);
generalPath.lineTo(245.03001, 283.20996);
generalPath.lineTo(245.87001, 282.29996);
generalPath.lineTo(246.94002, 282.71997);
generalPath.lineTo(246.14001, 281.11);
generalPath.lineTo(247.22002, 281.11);
generalPath.lineTo(247.22002, 280.08);
generalPath.lineTo(246.00002, 280.06998);
generalPath.curveTo(245.98001, 279.99, 245.98001, 279.90997, 245.98001, 279.81998);
generalPath.curveTo(245.98001, 279.25998, 246.45001, 278.80997, 247.04001, 278.80997);
generalPath.curveTo(247.48001, 278.80997, 247.86002, 279.00998, 248.02, 279.37997);
generalPath.lineTo(248.51001, 278.38998);
generalPath.curveTo(248.61002, 278.19998, 248.75002, 277.84, 248.75002, 277.62);
generalPath.curveTo(248.75002, 276.83, 248.08002, 276.19998, 247.26001, 276.19998);
generalPath.curveTo(246.6, 276.19998, 246.05, 276.59, 245.85, 277.13998);
generalPath.curveTo(245.85, 277.13998, 246.42001, 275.99, 246.42001, 274.59998);
generalPath.curveTo(246.42001, 273.21997, 245.03001, 271.74, 245.03001, 271.74);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_5_3_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(242.87, 281.11);
generalPath.lineTo(247.23, 281.11);
generalPath.lineTo(247.23, 280.08);
generalPath.lineTo(242.87, 280.08);
generalPath.lineTo(242.87, 281.11);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.34f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(242.87, 281.11);
generalPath.lineTo(247.23, 281.11);
generalPath.lineTo(247.23, 280.08);
generalPath.lineTo(242.87, 280.08);
generalPath.lineTo(242.87, 281.11);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 5.309999942779541f, 9.140000343322754f));
// _0_2_2_5_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_5_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_5_4_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(245.03, 271.74);
generalPath.curveTo(245.03, 271.74, 243.68, 273.22, 243.68, 274.59998);
generalPath.curveTo(243.68, 275.99, 244.25, 277.13998, 244.25, 277.13998);
generalPath.curveTo(244.04, 276.59, 243.49, 276.19998, 242.84, 276.19998);
generalPath.curveTo(242.01, 276.19998, 241.34, 276.83, 241.34, 277.62);
generalPath.curveTo(241.34, 277.84, 241.48, 278.19998, 241.58, 278.38998);
generalPath.lineTo(242.07, 279.37997);
generalPath.curveTo(242.23001, 279.00998, 242.61, 278.80997, 243.05, 278.80997);
generalPath.curveTo(243.64, 278.80997, 244.13, 279.25998, 244.13, 279.81998);
generalPath.curveTo(244.13, 279.90997, 244.12001, 279.99, 244.09001, 280.06998);
generalPath.lineTo(242.87001, 280.08);
generalPath.lineTo(242.87001, 281.11);
generalPath.lineTo(243.96, 281.11);
generalPath.lineTo(243.15001, 282.71997);
generalPath.lineTo(244.22002, 282.29996);
generalPath.lineTo(245.03001, 283.20996);
generalPath.lineTo(245.87001, 282.29996);
generalPath.lineTo(246.94002, 282.71997);
generalPath.lineTo(246.14001, 281.11);
generalPath.lineTo(247.22002, 281.11);
generalPath.lineTo(247.22002, 280.08);
generalPath.lineTo(246.00002, 280.06998);
generalPath.curveTo(245.98001, 279.99, 245.98001, 279.90997, 245.98001, 279.81998);
generalPath.curveTo(245.98001, 279.25998, 246.45001, 278.80997, 247.04001, 278.80997);
generalPath.curveTo(247.48001, 278.80997, 247.86002, 279.00998, 248.02, 279.37997);
generalPath.lineTo(248.51001, 278.38998);
generalPath.curveTo(248.61002, 278.19998, 248.75002, 277.84, 248.75002, 277.62);
generalPath.curveTo(248.75002, 276.83, 248.08002, 276.19998, 247.26001, 276.19998);
generalPath.curveTo(246.6, 276.19998, 246.05, 276.59, 245.85, 277.13998);
generalPath.curveTo(245.85, 277.13998, 246.42001, 275.99, 246.42001, 274.59998);
generalPath.curveTo(246.42001, 273.21997, 245.03001, 271.74, 245.03001, 271.74);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.34f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(245.03, 271.74);
generalPath.curveTo(245.03, 271.74, 243.68, 273.22, 243.68, 274.59998);
generalPath.curveTo(243.68, 275.99, 244.25, 277.13998, 244.25, 277.13998);
generalPath.curveTo(244.04, 276.59, 243.49, 276.19998, 242.84, 276.19998);
generalPath.curveTo(242.01, 276.19998, 241.34, 276.83, 241.34, 277.62);
generalPath.curveTo(241.34, 277.84, 241.48, 278.19998, 241.58, 278.38998);
generalPath.lineTo(242.07, 279.37997);
generalPath.curveTo(242.23001, 279.00998, 242.61, 278.80997, 243.05, 278.80997);
generalPath.curveTo(243.64, 278.80997, 244.13, 279.25998, 244.13, 279.81998);
generalPath.curveTo(244.13, 279.90997, 244.12001, 279.99, 244.09001, 280.06998);
generalPath.lineTo(242.87001, 280.08);
generalPath.lineTo(242.87001, 281.11);
generalPath.lineTo(243.96, 281.11);
generalPath.lineTo(243.15001, 282.71997);
generalPath.lineTo(244.22002, 282.29996);
generalPath.lineTo(245.03001, 283.20996);
generalPath.lineTo(245.87001, 282.29996);
generalPath.lineTo(246.94002, 282.71997);
generalPath.lineTo(246.14001, 281.11);
generalPath.lineTo(247.22002, 281.11);
generalPath.lineTo(247.22002, 280.08);
generalPath.lineTo(246.00002, 280.06998);
generalPath.curveTo(245.98001, 279.99, 245.98001, 279.90997, 245.98001, 279.81998);
generalPath.curveTo(245.98001, 279.25998, 246.45001, 278.80997, 247.04001, 278.80997);
generalPath.curveTo(247.48001, 278.80997, 247.86002, 279.00998, 248.02, 279.37997);
generalPath.lineTo(248.51001, 278.38998);
generalPath.curveTo(248.61002, 278.19998, 248.75002, 277.84, 248.75002, 277.62);
generalPath.curveTo(248.75002, 276.83, 248.08002, 276.19998, 247.26001, 276.19998);
generalPath.curveTo(246.6, 276.19998, 246.05, 276.59, 245.85, 277.13998);
generalPath.curveTo(245.85, 277.13998, 246.42001, 275.99, 246.42001, 274.59998);
generalPath.curveTo(246.42001, 273.21997, 245.03001, 271.74, 245.03001, 271.74);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2_5_4_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(242.87, 281.11);
generalPath.lineTo(247.23, 281.11);
generalPath.lineTo(247.23, 280.08);
generalPath.lineTo(242.87, 280.08);
generalPath.lineTo(242.87, 281.11);
generalPath.closePath();
shape = generalPath;
paint = new Color(200, 177, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.34f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(242.87, 281.11);
generalPath.lineTo(247.23, 281.11);
generalPath.lineTo(247.23, 280.08);
generalPath.lineTo(242.87, 280.08);
generalPath.lineTo(242.87, 281.11);
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
_paint2(g, origAlpha);
_paint3(g, origAlpha);
_paint4(g, origAlpha);
_paint5(g, origAlpha);
_paint6(g, origAlpha);
_paint7(g, origAlpha);
_paint8(g, origAlpha);
_paint9(g, origAlpha);
_paint10(g, origAlpha);
_paint11(g, origAlpha);
_paint12(g, origAlpha);
_paint13(g, origAlpha);
_paint14(g, origAlpha);


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
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 750.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 500.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private Flag_of_Spain() {
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
       Flag_of_Spain base = new Flag_of_Spain();
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
       Flag_of_Spain base = new Flag_of_Spain();
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
        return Flag_of_Spain::new;
    }
}

