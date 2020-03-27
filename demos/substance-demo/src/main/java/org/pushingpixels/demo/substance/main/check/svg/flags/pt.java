package org.pushingpixels.demo.substance.main.check.svg.flags;

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
public class pt implements ResizableIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.0f, -0.0f));
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
generalPath.moveTo(204.79, 0.0);
generalPath.lineTo(512.05, 0.0);
generalPath.lineTo(512.05, 512.0);
generalPath.lineTo(204.79, 512.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 0, 0, 255);
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
generalPath.moveTo(-0.05, 0.0);
generalPath.lineTo(204.79, 0.0);
generalPath.lineTo(204.79, 512.0);
generalPath.lineTo(-0.05, 512.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 102, 0, 255);
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
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(293.78, 326.588);
generalPath.curveTo(259.41, 325.552, 101.79199, 227.16801, 100.70999, 211.50201);
generalPath.lineTo(109.41499, 196.98701);
generalPath.curveTo(125.048996, 219.70401, 286.18, 315.38403, 302.005, 311.993);
generalPath.lineTo(293.78, 326.583);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(293.78, 326.588);
generalPath.curveTo(259.41, 325.552, 101.79199, 227.16801, 100.70999, 211.50201);
generalPath.lineTo(109.41499, 196.98701);
generalPath.curveTo(125.048996, 219.70401, 286.18, 315.38403, 302.005, 311.993);
generalPath.lineTo(293.78, 326.583);
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
generalPath.moveTo(107.583, 195.015);
generalPath.curveTo(104.5, 203.315, 148.713, 230.648, 201.909, 263.002);
generalPath.curveTo(255.101, 295.35202, 300.969, 315.346, 304.369, 312.479);
generalPath.curveTo(304.576, 312.109, 306.041, 309.587, 305.90598, 309.607);
generalPath.curveTo(305.26898, 310.567, 303.718, 310.871, 301.29797, 310.173);
generalPath.curveTo(286.925, 306.028, 249.44197, 288.823, 203.02197, 260.673);
generalPath.curveTo(156.60197, 232.521, 116.21597, 206.57901, 109.93897, 195.556);
generalPath.curveTo(109.503975, 194.79199, 109.19297, 193.398, 109.255974, 192.316);
generalPath.lineTo(109.10397, 192.312);
generalPath.lineTo(107.766975, 194.649);
generalPath.lineTo(107.58298, 195.015);
generalPath.closePath();
generalPath.moveTo(294.59, 327.043);
generalPath.curveTo(294.00598, 328.1, 292.91998, 328.136, 290.855, 327.909);
generalPath.curveTo(277.99802, 326.485, 238.98502, 307.513, 192.82202, 279.879);
generalPath.curveTo(139.10703, 247.725, 94.74502, 218.427, 99.55802, 210.769);
generalPath.lineTo(100.86802, 208.455);
generalPath.lineTo(101.12502, 208.535);
generalPath.curveTo(96.79802, 221.51201, 188.67502, 274.047, 194.08502, 277.39502);
generalPath.curveTo(247.24503, 310.33102, 292.06503, 329.565, 296.03003, 324.565);
generalPath.lineTo(294.58704, 327.048);
generalPath.lineTo(294.58704, 327.044);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(107.583, 195.015);
generalPath.curveTo(104.5, 203.315, 148.713, 230.648, 201.909, 263.002);
generalPath.curveTo(255.101, 295.35202, 300.969, 315.346, 304.369, 312.479);
generalPath.curveTo(304.576, 312.109, 306.041, 309.587, 305.90598, 309.607);
generalPath.curveTo(305.26898, 310.567, 303.718, 310.871, 301.29797, 310.173);
generalPath.curveTo(286.925, 306.028, 249.44197, 288.823, 203.02197, 260.673);
generalPath.curveTo(156.60197, 232.521, 116.21597, 206.57901, 109.93897, 195.556);
generalPath.curveTo(109.503975, 194.79199, 109.19297, 193.398, 109.255974, 192.316);
generalPath.lineTo(109.10397, 192.312);
generalPath.lineTo(107.766975, 194.649);
generalPath.lineTo(107.58298, 195.015);
generalPath.closePath();
generalPath.moveTo(294.59, 327.043);
generalPath.curveTo(294.00598, 328.1, 292.91998, 328.136, 290.855, 327.909);
generalPath.curveTo(277.99802, 326.485, 238.98502, 307.513, 192.82202, 279.879);
generalPath.curveTo(139.10703, 247.725, 94.74502, 218.427, 99.55802, 210.769);
generalPath.lineTo(100.86802, 208.455);
generalPath.lineTo(101.12502, 208.535);
generalPath.curveTo(96.79802, 221.51201, 188.67502, 274.047, 194.08502, 277.39502);
generalPath.curveTo(247.24503, 310.33102, 292.06503, 329.565, 296.03003, 324.565);
generalPath.lineTo(294.58704, 327.048);
generalPath.lineTo(294.58704, 327.044);
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
generalPath.moveTo(204.954, 220.99);
generalPath.curveTo(239.357, 220.72, 281.811, 216.29001, 306.244, 206.552);
generalPath.lineTo(300.978, 198.0);
generalPath.curveTo(286.536, 205.992, 243.84799, 211.248, 204.66199, 212.034);
generalPath.curveTo(158.31198, 211.608, 125.597984, 207.29199, 109.205986, 196.29399);
generalPath.lineTo(104.235985, 205.4);
generalPath.curveTo(134.36998, 218.15, 165.24799, 220.86, 204.95299, 220.98999);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.954, 220.99);
generalPath.curveTo(239.357, 220.72, 281.811, 216.29001, 306.244, 206.552);
generalPath.lineTo(300.978, 198.0);
generalPath.curveTo(286.536, 205.992, 243.84799, 211.248, 204.66199, 212.034);
generalPath.curveTo(158.31198, 211.608, 125.597984, 207.29199, 109.205986, 196.29399);
generalPath.lineTo(104.235985, 205.4);
generalPath.curveTo(134.36998, 218.15, 165.24799, 220.86, 204.95299, 220.98999);
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
generalPath.moveTo(307.662, 206.746);
generalPath.curveTo(306.822, 208.09, 290.887, 213.586, 267.41498, 217.64);
generalPath.curveTo(251.49998, 220.066, 230.73997, 222.14, 204.83298, 222.166);
generalPath.curveTo(180.21898, 222.189, 160.11298, 220.436, 144.88998, 218.374);
generalPath.curveTo(120.249985, 214.51, 107.53299, 209.13399, 102.831985, 207.234);
generalPath.curveTo(103.28198, 206.34099, 103.57198, 205.71399, 104.00398, 204.879);
generalPath.curveTo(117.53798, 210.267, 130.31398, 213.51599, 145.28198, 215.819);
generalPath.curveTo(160.40398, 217.867, 180.26797, 219.644, 204.75998, 219.621);
generalPath.curveTo(230.54698, 219.595, 251.07797, 217.363, 266.89996, 215.009);
generalPath.curveTo(290.96997, 211.127, 304.11996, 206.131, 305.96497, 203.809);
generalPath.lineTo(307.66498, 206.74501);
generalPath.lineTo(307.66296, 206.74501);
generalPath.closePath();
generalPath.moveTo(303.042, 198.073);
generalPath.curveTo(300.432, 200.168, 287.434, 204.778, 264.56198, 208.43);
generalPath.curveTo(249.29999, 210.618, 229.89198, 212.57599, 205.09698, 212.59999);
generalPath.curveTo(181.54099, 212.62299, 162.29498, 211.03499, 147.65698, 208.90298);
generalPath.curveTo(124.429985, 205.86998, 112.066986, 200.39798, 107.611984, 198.80298);
generalPath.curveTo(108.054985, 198.03598, 108.50698, 197.27498, 108.969986, 196.51097);
generalPath.curveTo(112.43799, 198.25797, 124.36799, 203.10097, 147.91199, 206.43697);
generalPath.curveTo(162.38399, 208.48897, 181.659, 210.01697, 205.09898, 209.99397);
generalPath.curveTo(229.77599, 209.96898, 248.96198, 207.97397, 264.12897, 205.79697);
generalPath.curveTo(287.11896, 202.63397, 299.48895, 196.75497, 301.36597, 195.28296);
generalPath.lineTo(303.04196, 198.07295);
generalPath.closePath();
generalPath.moveTo(91.985, 262.44);
generalPath.curveTo(113.145004, 273.82, 160.143, 279.557, 204.61801, 279.95);
generalPath.curveTo(245.11201, 280.01602, 297.868, 273.69202, 317.596, 263.237);
generalPath.lineTo(317.053, 251.847);
generalPath.curveTo(310.881, 261.491, 254.34601, 270.743, 204.17801, 270.364);
generalPath.curveTo(154.01001, 269.98602, 107.42401, 262.237, 91.89401, 252.20702);
generalPath.lineTo(91.98401, 262.437);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(307.662, 206.746);
generalPath.curveTo(306.822, 208.09, 290.887, 213.586, 267.41498, 217.64);
generalPath.curveTo(251.49998, 220.066, 230.73997, 222.14, 204.83298, 222.166);
generalPath.curveTo(180.21898, 222.189, 160.11298, 220.436, 144.88998, 218.374);
generalPath.curveTo(120.249985, 214.51, 107.53299, 209.13399, 102.831985, 207.234);
generalPath.curveTo(103.28198, 206.34099, 103.57198, 205.71399, 104.00398, 204.879);
generalPath.curveTo(117.53798, 210.267, 130.31398, 213.51599, 145.28198, 215.819);
generalPath.curveTo(160.40398, 217.867, 180.26797, 219.644, 204.75998, 219.621);
generalPath.curveTo(230.54698, 219.595, 251.07797, 217.363, 266.89996, 215.009);
generalPath.curveTo(290.96997, 211.127, 304.11996, 206.131, 305.96497, 203.809);
generalPath.lineTo(307.66498, 206.74501);
generalPath.lineTo(307.66296, 206.74501);
generalPath.closePath();
generalPath.moveTo(303.042, 198.073);
generalPath.curveTo(300.432, 200.168, 287.434, 204.778, 264.56198, 208.43);
generalPath.curveTo(249.29999, 210.618, 229.89198, 212.57599, 205.09698, 212.59999);
generalPath.curveTo(181.54099, 212.62299, 162.29498, 211.03499, 147.65698, 208.90298);
generalPath.curveTo(124.429985, 205.86998, 112.066986, 200.39798, 107.611984, 198.80298);
generalPath.curveTo(108.054985, 198.03598, 108.50698, 197.27498, 108.969986, 196.51097);
generalPath.curveTo(112.43799, 198.25797, 124.36799, 203.10097, 147.91199, 206.43697);
generalPath.curveTo(162.38399, 208.48897, 181.659, 210.01697, 205.09898, 209.99397);
generalPath.curveTo(229.77599, 209.96898, 248.96198, 207.97397, 264.12897, 205.79697);
generalPath.curveTo(287.11896, 202.63397, 299.48895, 196.75497, 301.36597, 195.28296);
generalPath.lineTo(303.04196, 198.07295);
generalPath.closePath();
generalPath.moveTo(91.985, 262.44);
generalPath.curveTo(113.145004, 273.82, 160.143, 279.557, 204.61801, 279.95);
generalPath.curveTo(245.11201, 280.01602, 297.868, 273.69202, 317.596, 263.237);
generalPath.lineTo(317.053, 251.847);
generalPath.curveTo(310.881, 261.491, 254.34601, 270.743, 204.17801, 270.364);
generalPath.curveTo(154.01001, 269.98602, 107.42401, 262.237, 91.89401, 252.20702);
generalPath.lineTo(91.98401, 262.437);
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
generalPath.moveTo(318.675, 260.8);
generalPath.lineTo(318.675, 263.51797);
generalPath.curveTo(315.711, 267.063, 297.12, 272.42096, 273.805, 276.19498);
generalPath.curveTo(256.06198, 278.91498, 232.92899, 280.96698, 204.103, 280.96698);
generalPath.curveTo(176.718, 280.96698, 154.88, 279.01498, 137.943, 276.41498);
generalPath.curveTo(111.17299, 272.51498, 94.048996, 265.68997, 90.61299, 263.65198);
generalPath.lineTo(90.62699, 260.48196);
generalPath.curveTo(100.95199, 267.34796, 128.92699, 272.36996, 138.319, 273.90695);
generalPath.curveTo(155.144, 276.48996, 176.853, 278.42694, 204.101, 278.42694);
generalPath.curveTo(232.791, 278.42694, 255.795, 276.38895, 273.427, 273.68695);
generalPath.curveTo(290.154, 271.27097, 313.982, 264.98694, 318.673, 260.80295);
generalPath.closePath();
generalPath.moveTo(318.68698, 251.13998);
generalPath.lineTo(318.68698, 253.85599);
generalPath.curveTo(315.723, 257.399, 297.13098, 262.75598, 273.817, 266.53);
generalPath.curveTo(256.07397, 269.25, 232.93999, 271.303, 204.11499, 271.303);
generalPath.curveTo(176.72899, 271.303, 154.89099, 269.353, 137.95499, 266.75);
generalPath.curveTo(111.18498, 262.854, 94.06099, 256.027, 90.624985, 253.99);
generalPath.lineTo(90.638985, 250.82);
generalPath.curveTo(100.96298, 257.683, 128.93599, 262.706, 138.32898, 264.24002);
generalPath.curveTo(155.15498, 266.82602, 176.86398, 268.765, 204.11298, 268.765);
generalPath.curveTo(232.80298, 268.765, 255.80698, 266.725, 273.43896, 264.02103);
generalPath.curveTo(290.16498, 261.60602, 313.99396, 255.32103, 318.68497, 251.13803);
generalPath.lineTo(318.68497, 251.14003);
generalPath.closePath();
generalPath.moveTo(204.52197, 324.62997);
generalPath.curveTo(155.85696, 324.33997, 114.15897, 311.36496, 105.351974, 309.21997);
generalPath.lineTo(111.77397, 319.27197);
generalPath.curveTo(127.32797, 325.81497, 168.00797, 335.56497, 204.98897, 334.485);
generalPath.curveTo(241.96896, 333.40698, 274.28897, 330.542, 297.06598, 319.455);
generalPath.lineTo(303.649, 309.037);
generalPath.curveTo(288.129, 316.347, 235.305, 324.55698, 204.521, 324.63098);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(318.675, 260.8);
generalPath.lineTo(318.675, 263.51797);
generalPath.curveTo(315.711, 267.063, 297.12, 272.42096, 273.805, 276.19498);
generalPath.curveTo(256.06198, 278.91498, 232.92899, 280.96698, 204.103, 280.96698);
generalPath.curveTo(176.718, 280.96698, 154.88, 279.01498, 137.943, 276.41498);
generalPath.curveTo(111.17299, 272.51498, 94.048996, 265.68997, 90.61299, 263.65198);
generalPath.lineTo(90.62699, 260.48196);
generalPath.curveTo(100.95199, 267.34796, 128.92699, 272.36996, 138.319, 273.90695);
generalPath.curveTo(155.144, 276.48996, 176.853, 278.42694, 204.101, 278.42694);
generalPath.curveTo(232.791, 278.42694, 255.795, 276.38895, 273.427, 273.68695);
generalPath.curveTo(290.154, 271.27097, 313.982, 264.98694, 318.673, 260.80295);
generalPath.closePath();
generalPath.moveTo(318.68698, 251.13998);
generalPath.lineTo(318.68698, 253.85599);
generalPath.curveTo(315.723, 257.399, 297.13098, 262.75598, 273.817, 266.53);
generalPath.curveTo(256.07397, 269.25, 232.93999, 271.303, 204.11499, 271.303);
generalPath.curveTo(176.72899, 271.303, 154.89099, 269.353, 137.95499, 266.75);
generalPath.curveTo(111.18498, 262.854, 94.06099, 256.027, 90.624985, 253.99);
generalPath.lineTo(90.638985, 250.82);
generalPath.curveTo(100.96298, 257.683, 128.93599, 262.706, 138.32898, 264.24002);
generalPath.curveTo(155.15498, 266.82602, 176.86398, 268.765, 204.11298, 268.765);
generalPath.curveTo(232.80298, 268.765, 255.80698, 266.725, 273.43896, 264.02103);
generalPath.curveTo(290.16498, 261.60602, 313.99396, 255.32103, 318.68497, 251.13803);
generalPath.lineTo(318.68497, 251.14003);
generalPath.closePath();
generalPath.moveTo(204.52197, 324.62997);
generalPath.curveTo(155.85696, 324.33997, 114.15897, 311.36496, 105.351974, 309.21997);
generalPath.lineTo(111.77397, 319.27197);
generalPath.curveTo(127.32797, 325.81497, 168.00797, 335.56497, 204.98897, 334.485);
generalPath.curveTo(241.96896, 333.40698, 274.28897, 330.542, 297.06598, 319.455);
generalPath.lineTo(303.649, 309.037);
generalPath.curveTo(288.129, 316.347, 235.305, 324.55698, 204.521, 324.63098);
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
generalPath.moveTo(299.538, 317.12);
generalPath.curveTo(298.57846, 318.58954, 297.59366, 320.04242, 296.58398, 321.478);
generalPath.curveTo(285.84097, 325.266, 268.91397, 329.243, 261.771, 330.40298);
generalPath.curveTo(247.181, 333.40997, 224.607, 335.62997, 204.571, 335.63998);
generalPath.curveTo(161.461, 335.00998, 126.173, 326.56998, 109.571, 319.37);
generalPath.lineTo(108.231, 317.068);
generalPath.lineTo(108.451004, 316.722);
generalPath.lineTo(110.72301, 317.602);
generalPath.curveTo(140.246, 328.16498, 173.40302, 332.379, 204.815, 333.136);
generalPath.curveTo(224.769, 333.206, 244.745, 330.849, 260.898, 327.96);
generalPath.curveTo(285.668, 322.99698, 295.68402, 319.25598, 298.758, 317.56);
generalPath.lineTo(299.538, 317.122);
generalPath.closePath();
generalPath.moveTo(305.246, 307.706);
generalPath.curveTo(305.271, 307.736, 305.296, 307.763, 305.321, 307.794);
generalPath.curveTo(304.5859, 309.03665, 303.8419, 310.27402, 303.08902, 311.506);
generalPath.curveTo(297.359, 313.55402, 281.80902, 318.104, 259.104, 321.27902);
generalPath.curveTo(244.144, 323.316, 234.84401, 325.28903, 205.084, 325.86902);
generalPath.curveTo(149.314, 324.449, 113.208, 313.544, 104.63, 310.855);
generalPath.lineTo(103.357994, 308.415);
generalPath.curveTo(135.678, 316.853, 168.691, 322.743, 205.08398, 323.345);
generalPath.curveTo(232.31198, 322.765, 243.89598, 320.76, 258.73398, 318.737);
generalPath.curveTo(285.21, 314.62, 298.55, 310.261, 302.554, 309.002);
generalPath.curveTo(302.49887, 308.92398, 302.44016, 308.84854, 302.378, 308.776);
generalPath.lineTo(305.248, 307.703);
generalPath.lineTo(305.248, 307.70502);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.626f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(299.538, 317.12);
generalPath.curveTo(298.57846, 318.58954, 297.59366, 320.04242, 296.58398, 321.478);
generalPath.curveTo(285.84097, 325.266, 268.91397, 329.243, 261.771, 330.40298);
generalPath.curveTo(247.181, 333.40997, 224.607, 335.62997, 204.571, 335.63998);
generalPath.curveTo(161.461, 335.00998, 126.173, 326.56998, 109.571, 319.37);
generalPath.lineTo(108.231, 317.068);
generalPath.lineTo(108.451004, 316.722);
generalPath.lineTo(110.72301, 317.602);
generalPath.curveTo(140.246, 328.16498, 173.40302, 332.379, 204.815, 333.136);
generalPath.curveTo(224.769, 333.206, 244.745, 330.849, 260.898, 327.96);
generalPath.curveTo(285.668, 322.99698, 295.68402, 319.25598, 298.758, 317.56);
generalPath.lineTo(299.538, 317.122);
generalPath.closePath();
generalPath.moveTo(305.246, 307.706);
generalPath.curveTo(305.271, 307.736, 305.296, 307.763, 305.321, 307.794);
generalPath.curveTo(304.5859, 309.03665, 303.8419, 310.27402, 303.08902, 311.506);
generalPath.curveTo(297.359, 313.55402, 281.80902, 318.104, 259.104, 321.27902);
generalPath.curveTo(244.144, 323.316, 234.84401, 325.28903, 205.084, 325.86902);
generalPath.curveTo(149.314, 324.449, 113.208, 313.544, 104.63, 310.855);
generalPath.lineTo(103.357994, 308.415);
generalPath.curveTo(135.678, 316.853, 168.691, 322.743, 205.08398, 323.345);
generalPath.curveTo(232.31198, 322.765, 243.89598, 320.76, 258.73398, 318.737);
generalPath.curveTo(285.21, 314.62, 298.55, 310.261, 302.554, 309.002);
generalPath.curveTo(302.49887, 308.92398, 302.44016, 308.84854, 302.378, 308.776);
generalPath.lineTo(305.248, 307.703);
generalPath.lineTo(305.248, 307.70502);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(305.83, 253.45);
generalPath.curveTo(305.98798, 285.465, 289.60498, 314.193, 276.40997, 326.866);
generalPath.curveTo(257.73996, 344.796, 232.98798, 356.33, 204.08197, 356.862);
generalPath.curveTo(171.80197, 357.455, 141.36697, 336.412, 133.20398, 327.167);
generalPath.curveTo(117.24398, 309.093, 104.24898, 286.142, 103.83198, 255.20999);
generalPath.curveTo(105.808975, 220.26999, 119.52598, 195.93199, 139.40797, 179.24199);
generalPath.curveTo(159.29097, 162.55199, 185.76497, 154.42398, 207.81297, 155.00499);
generalPath.curveTo(233.25098, 155.67499, 262.96597, 168.15498, 283.49896, 192.93);
generalPath.curveTo(296.94897, 209.15999, 302.77496, 226.776, 305.82895, 253.45);
generalPath.closePath();
generalPath.moveTo(204.356, 143.837);
generalPath.curveTo(266.348, 143.837, 317.333, 194.283, 317.333, 256.139);
generalPath.curveTo(317.333, 317.993, 266.34802, 368.44202, 204.35602, 368.44202);
generalPath.curveTo(142.36401, 368.44202, 91.80202, 317.99503, 91.80202, 256.14);
generalPath.curveTo(91.80202, 194.28401, 142.36401, 143.83801, 204.35602, 143.83801);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(305.83, 253.45);
generalPath.curveTo(305.98798, 285.465, 289.60498, 314.193, 276.40997, 326.866);
generalPath.curveTo(257.73996, 344.796, 232.98798, 356.33, 204.08197, 356.862);
generalPath.curveTo(171.80197, 357.455, 141.36697, 336.412, 133.20398, 327.167);
generalPath.curveTo(117.24398, 309.093, 104.24898, 286.142, 103.83198, 255.20999);
generalPath.curveTo(105.808975, 220.26999, 119.52598, 195.93199, 139.40797, 179.24199);
generalPath.curveTo(159.29097, 162.55199, 185.76497, 154.42398, 207.81297, 155.00499);
generalPath.curveTo(233.25098, 155.67499, 262.96597, 168.15498, 283.49896, 192.93);
generalPath.curveTo(296.94897, 209.15999, 302.77496, 226.776, 305.82895, 253.45);
generalPath.closePath();
generalPath.moveTo(204.356, 143.837);
generalPath.curveTo(266.348, 143.837, 317.333, 194.283, 317.333, 256.139);
generalPath.curveTo(317.333, 317.993, 266.34802, 368.44202, 204.35602, 368.44202);
generalPath.curveTo(142.36401, 368.44202, 91.80202, 317.99503, 91.80202, 256.14);
generalPath.curveTo(91.80202, 194.28401, 142.36401, 143.83801, 204.35602, 143.83801);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.66, 143.45);
generalPath.curveTo(266.706, 143.45, 317.31, 194.06299, 317.31, 256.116);
generalPath.curveTo(317.31, 318.168, 266.705, 368.779, 204.66, 368.779);
generalPath.curveTo(142.61, 368.779, 92.006004, 318.169, 92.006004, 256.115);
generalPath.curveTo(92.006004, 194.06198, 142.612, 143.44998, 204.659, 143.44998);
generalPath.closePath();
generalPath.moveTo(94.484, 256.117);
generalPath.curveTo(94.484, 316.717, 144.246, 366.302, 204.658, 366.302);
generalPath.curveTo(265.068, 366.302, 314.831, 316.717, 314.831, 256.118);
generalPath.curveTo(314.831, 195.518, 265.068, 145.932, 204.65698, 145.932);
generalPath.curveTo(144.24399, 145.932, 94.48198, 195.52, 94.48198, 256.118);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.66, 143.45);
generalPath.curveTo(266.706, 143.45, 317.31, 194.06299, 317.31, 256.116);
generalPath.curveTo(317.31, 318.168, 266.705, 368.779, 204.66, 368.779);
generalPath.curveTo(142.61, 368.779, 92.006004, 318.169, 92.006004, 256.115);
generalPath.curveTo(92.006004, 194.06198, 142.612, 143.44998, 204.659, 143.44998);
generalPath.closePath();
generalPath.moveTo(94.484, 256.117);
generalPath.curveTo(94.484, 316.717, 144.246, 366.302, 204.658, 366.302);
generalPath.curveTo(265.068, 366.302, 314.831, 316.717, 314.831, 256.118);
generalPath.curveTo(314.831, 195.518, 265.068, 145.932, 204.65698, 145.932);
generalPath.curveTo(144.24399, 145.932, 94.48198, 195.52, 94.48198, 256.118);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.75, 152.815);
generalPath.curveTo(261.332, 152.815, 307.938, 199.26001, 307.938, 256.015);
generalPath.curveTo(307.938, 312.773, 261.331, 359.21503, 204.74998, 359.21503);
generalPath.curveTo(148.16798, 359.21503, 101.55998, 312.773, 101.55998, 256.015);
generalPath.curveTo(101.55998, 199.26001, 148.16998, 152.81502, 204.74998, 152.81502);
generalPath.closePath();
generalPath.moveTo(104.04, 256.015);
generalPath.curveTo(104.04, 311.40802, 149.526, 356.73502, 204.75, 356.73502);
generalPath.curveTo(259.973, 356.73502, 305.46, 311.40802, 305.46, 256.015);
generalPath.curveTo(305.46, 200.62102, 259.974, 155.29301, 204.75, 155.29301);
generalPath.curveTo(149.526, 155.29301, 104.04, 200.62, 104.04, 256.015);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.75, 152.815);
generalPath.curveTo(261.332, 152.815, 307.938, 199.26001, 307.938, 256.015);
generalPath.curveTo(307.938, 312.773, 261.331, 359.21503, 204.74998, 359.21503);
generalPath.curveTo(148.16798, 359.21503, 101.55998, 312.773, 101.55998, 256.015);
generalPath.curveTo(101.55998, 199.26001, 148.16998, 152.81502, 204.74998, 152.81502);
generalPath.closePath();
generalPath.moveTo(104.04, 256.015);
generalPath.curveTo(104.04, 311.40802, 149.526, 356.73502, 204.75, 356.73502);
generalPath.curveTo(259.973, 356.73502, 305.46, 311.40802, 305.46, 256.015);
generalPath.curveTo(305.46, 200.62102, 259.974, 155.29301, 204.75, 155.29301);
generalPath.curveTo(149.526, 155.29301, 104.04, 200.62, 104.04, 256.015);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(209.29, 142.996);
generalPath.lineTo(199.635, 142.996);
generalPath.lineTo(199.64499, 369.36798);
generalPath.lineTo(209.33499, 369.36798);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(209.29, 142.996);
generalPath.lineTo(199.635, 142.996);
generalPath.lineTo(199.64499, 369.36798);
generalPath.lineTo(209.33499, 369.36798);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(208.322, 141.706);
generalPath.lineTo(210.78, 141.706);
generalPath.lineTo(210.8, 370.68298);
generalPath.lineTo(208.34, 370.68298);
generalPath.lineTo(208.323, 141.70598);
generalPath.closePath();
generalPath.moveTo(198.742, 141.708);
generalPath.lineTo(201.21701, 141.708);
generalPath.lineTo(201.22101, 370.685);
generalPath.lineTo(198.74301, 370.685);
generalPath.lineTo(198.74301, 141.708);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(208.322, 141.706);
generalPath.lineTo(210.78, 141.706);
generalPath.lineTo(210.8, 370.68298);
generalPath.lineTo(208.34, 370.68298);
generalPath.lineTo(208.323, 141.70598);
generalPath.closePath();
generalPath.moveTo(198.742, 141.708);
generalPath.lineTo(201.21701, 141.708);
generalPath.lineTo(201.22101, 370.685);
generalPath.lineTo(198.74301, 370.685);
generalPath.lineTo(198.74301, 141.708);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(317.39, 260.477);
generalPath.lineTo(317.39, 252.107);
generalPath.lineTo(310.574, 245.76);
generalPath.lineTo(271.89, 235.51999);
generalPath.lineTo(216.14001, 229.82999);
generalPath.lineTo(149.01001, 233.24399);
generalPath.lineTo(101.22301, 244.622);
generalPath.lineTo(91.575005, 251.767);
generalPath.lineTo(91.575005, 260.137);
generalPath.lineTo(116.01501, 249.17299);
generalPath.lineTo(174.04102, 240.07098);
generalPath.lineTo(229.79301, 240.07098);
generalPath.lineTo(270.75302, 244.62299);
generalPath.lineTo(299.19803, 251.44998);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(317.39, 260.477);
generalPath.lineTo(317.39, 252.107);
generalPath.lineTo(310.574, 245.76);
generalPath.lineTo(271.89, 235.51999);
generalPath.lineTo(216.14001, 229.82999);
generalPath.lineTo(149.01001, 233.24399);
generalPath.lineTo(101.22301, 244.622);
generalPath.lineTo(91.575005, 251.767);
generalPath.lineTo(91.575005, 260.137);
generalPath.lineTo(116.01501, 249.17299);
generalPath.lineTo(174.04102, 240.07098);
generalPath.lineTo(229.79301, 240.07098);
generalPath.lineTo(270.75302, 244.62299);
generalPath.lineTo(299.19803, 251.44998);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.704, 238.672);
generalPath.curveTo(231.30899, 238.622, 257.122, 241.192, 277.596, 245.179);
generalPath.curveTo(298.72302, 249.40201, 313.592, 254.685, 318.67603, 260.619);
generalPath.lineTo(318.67, 263.55698);
generalPath.curveTo(312.54, 256.17297, 292.532, 250.75897, 277.12003, 247.66397);
generalPath.curveTo(256.80203, 243.71198, 231.16202, 241.15997, 204.70403, 241.20897);
generalPath.curveTo(176.78403, 241.26097, 150.78802, 243.90497, 130.76703, 247.81197);
generalPath.curveTo(114.7, 251.0, 93.277, 257.333, 90.6, 263.58);
generalPath.lineTo(90.6, 260.52);
generalPath.curveTo(92.07, 256.197, 108.024, 249.736, 130.405, 245.25499);
generalPath.curveTo(150.577, 241.32199, 176.622, 238.72299, 204.705, 238.672);
generalPath.closePath();
generalPath.moveTo(204.71599, 229.009);
generalPath.curveTo(231.31999, 228.959, 257.133, 231.531, 277.606, 235.516);
generalPath.curveTo(298.736, 239.74101, 313.603, 245.02301, 318.68597, 250.95601);
generalPath.lineTo(318.68097, 253.89601);
generalPath.curveTo(312.55096, 246.51201, 292.54398, 241.098, 277.13297, 238.00401);
generalPath.curveTo(256.81296, 234.05002, 231.17297, 231.49802, 204.71696, 231.54901);
generalPath.curveTo(176.79697, 231.59901, 150.92697, 234.24501, 130.90295, 238.14902);
generalPath.curveTo(115.399956, 241.08902, 93.09895, 247.67302, 90.61295, 253.91902);
generalPath.lineTo(90.61295, 250.85902);
generalPath.curveTo(92.080956, 246.58102, 108.357956, 239.88902, 130.41696, 235.59203);
generalPath.curveTo(150.58896, 231.65903, 176.63396, 229.06203, 204.71696, 229.00903);
generalPath.closePath();
generalPath.moveTo(204.16998, 179.723);
generalPath.curveTo(246.09499, 179.513, 282.66498, 185.58601, 299.396, 194.156);
generalPath.lineTo(305.499, 204.714);
generalPath.curveTo(290.956, 196.877, 251.50299, 188.728, 204.229, 189.946);
generalPath.curveTo(165.711, 190.183, 124.554, 194.186, 103.90501, 205.204);
generalPath.lineTo(111.19101, 193.019);
generalPath.curveTo(128.13802, 184.229, 168.10501, 179.771, 204.17102, 179.72499);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.704, 238.672);
generalPath.curveTo(231.30899, 238.622, 257.122, 241.192, 277.596, 245.179);
generalPath.curveTo(298.72302, 249.40201, 313.592, 254.685, 318.67603, 260.619);
generalPath.lineTo(318.67, 263.55698);
generalPath.curveTo(312.54, 256.17297, 292.532, 250.75897, 277.12003, 247.66397);
generalPath.curveTo(256.80203, 243.71198, 231.16202, 241.15997, 204.70403, 241.20897);
generalPath.curveTo(176.78403, 241.26097, 150.78802, 243.90497, 130.76703, 247.81197);
generalPath.curveTo(114.7, 251.0, 93.277, 257.333, 90.6, 263.58);
generalPath.lineTo(90.6, 260.52);
generalPath.curveTo(92.07, 256.197, 108.024, 249.736, 130.405, 245.25499);
generalPath.curveTo(150.577, 241.32199, 176.622, 238.72299, 204.705, 238.672);
generalPath.closePath();
generalPath.moveTo(204.71599, 229.009);
generalPath.curveTo(231.31999, 228.959, 257.133, 231.531, 277.606, 235.516);
generalPath.curveTo(298.736, 239.74101, 313.603, 245.02301, 318.68597, 250.95601);
generalPath.lineTo(318.68097, 253.89601);
generalPath.curveTo(312.55096, 246.51201, 292.54398, 241.098, 277.13297, 238.00401);
generalPath.curveTo(256.81296, 234.05002, 231.17297, 231.49802, 204.71696, 231.54901);
generalPath.curveTo(176.79697, 231.59901, 150.92697, 234.24501, 130.90295, 238.14902);
generalPath.curveTo(115.399956, 241.08902, 93.09895, 247.67302, 90.61295, 253.91902);
generalPath.lineTo(90.61295, 250.85902);
generalPath.curveTo(92.080956, 246.58102, 108.357956, 239.88902, 130.41696, 235.59203);
generalPath.curveTo(150.58896, 231.65903, 176.63396, 229.06203, 204.71696, 229.00903);
generalPath.closePath();
generalPath.moveTo(204.16998, 179.723);
generalPath.curveTo(246.09499, 179.513, 282.66498, 185.58601, 299.396, 194.156);
generalPath.lineTo(305.499, 204.714);
generalPath.curveTo(290.956, 196.877, 251.50299, 188.728, 204.229, 189.946);
generalPath.curveTo(165.711, 190.183, 124.554, 194.186, 103.90501, 205.204);
generalPath.lineTo(111.19101, 193.019);
generalPath.curveTo(128.13802, 184.229, 168.10501, 179.771, 204.17102, 179.72499);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.727, 188.44);
generalPath.curveTo(228.64, 188.375, 251.74701, 189.724, 270.122, 193.04001);
generalPath.curveTo(287.23502, 196.225, 303.555, 201.005, 305.889, 203.576);
generalPath.lineTo(307.69702, 206.77301);
generalPath.curveTo(302.02203, 203.06702, 287.89902, 198.94101, 269.765, 195.503);
generalPath.curveTo(251.55502, 192.07901, 228.46301, 190.945, 204.68501, 191.00801);
generalPath.curveTo(177.695, 190.91501, 156.725, 192.34001, 138.72801, 195.47801);
generalPath.curveTo(119.694016, 199.03801, 106.48801, 204.128, 103.23201, 206.544);
generalPath.lineTo(105.00501, 203.164);
generalPath.curveTo(111.335014, 199.934, 121.377014, 196.044, 138.255, 193.004);
generalPath.curveTo(156.865, 189.604, 178.057, 188.584, 204.727, 188.439);
generalPath.lineTo(204.725, 188.439);
generalPath.closePath();
generalPath.moveTo(204.71701, 178.785);
generalPath.curveTo(227.60101, 178.725, 250.197, 180.001, 267.80902, 183.167);
generalPath.curveTo(281.69904, 185.871, 295.43604, 190.093, 300.467, 193.84901);
generalPath.lineTo(303.113, 198.05301);
generalPath.curveTo(298.613, 193.05301, 281.681, 188.313, 266.733, 185.66);
generalPath.curveTo(249.256, 182.647, 227.599, 181.45401, 204.715, 181.263);
generalPath.curveTo(180.69899, 181.33, 158.505, 182.801, 141.282, 185.937);
generalPath.curveTo(124.852, 189.064, 114.248, 192.767, 109.76199, 195.657);
generalPath.lineTo(112.089, 192.145);
generalPath.curveTo(118.279, 188.88501, 128.282, 185.892, 140.879, 183.445);
generalPath.curveTo(158.229, 180.285, 180.55899, 178.85301, 204.716, 178.785);
generalPath.closePath();
generalPath.moveTo(260.683, 302.945);
generalPath.curveTo(239.95502, 299.075, 219.18901, 298.513, 204.68501, 298.685);
generalPath.curveTo(134.81702, 299.503, 112.24701, 313.03, 109.49301, 317.125);
generalPath.lineTo(104.27101, 308.615);
generalPath.curveTo(122.06101, 295.72098, 160.10602, 288.49, 205.06401, 289.22998);
generalPath.curveTo(228.40901, 289.61197, 248.55402, 291.162, 265.502, 294.44498);
generalPath.lineTo(260.682, 302.947);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.727, 188.44);
generalPath.curveTo(228.64, 188.375, 251.74701, 189.724, 270.122, 193.04001);
generalPath.curveTo(287.23502, 196.225, 303.555, 201.005, 305.889, 203.576);
generalPath.lineTo(307.69702, 206.77301);
generalPath.curveTo(302.02203, 203.06702, 287.89902, 198.94101, 269.765, 195.503);
generalPath.curveTo(251.55502, 192.07901, 228.46301, 190.945, 204.68501, 191.00801);
generalPath.curveTo(177.695, 190.91501, 156.725, 192.34001, 138.72801, 195.47801);
generalPath.curveTo(119.694016, 199.03801, 106.48801, 204.128, 103.23201, 206.544);
generalPath.lineTo(105.00501, 203.164);
generalPath.curveTo(111.335014, 199.934, 121.377014, 196.044, 138.255, 193.004);
generalPath.curveTo(156.865, 189.604, 178.057, 188.584, 204.727, 188.439);
generalPath.lineTo(204.725, 188.439);
generalPath.closePath();
generalPath.moveTo(204.71701, 178.785);
generalPath.curveTo(227.60101, 178.725, 250.197, 180.001, 267.80902, 183.167);
generalPath.curveTo(281.69904, 185.871, 295.43604, 190.093, 300.467, 193.84901);
generalPath.lineTo(303.113, 198.05301);
generalPath.curveTo(298.613, 193.05301, 281.681, 188.313, 266.733, 185.66);
generalPath.curveTo(249.256, 182.647, 227.599, 181.45401, 204.715, 181.263);
generalPath.curveTo(180.69899, 181.33, 158.505, 182.801, 141.282, 185.937);
generalPath.curveTo(124.852, 189.064, 114.248, 192.767, 109.76199, 195.657);
generalPath.lineTo(112.089, 192.145);
generalPath.curveTo(118.279, 188.88501, 128.282, 185.892, 140.879, 183.445);
generalPath.curveTo(158.229, 180.285, 180.55899, 178.85301, 204.716, 178.785);
generalPath.closePath();
generalPath.moveTo(260.683, 302.945);
generalPath.curveTo(239.95502, 299.075, 219.18901, 298.513, 204.68501, 298.685);
generalPath.curveTo(134.81702, 299.503, 112.24701, 313.03, 109.49301, 317.125);
generalPath.lineTo(104.27101, 308.615);
generalPath.curveTo(122.06101, 295.72098, 160.10602, 288.49, 205.06401, 289.22998);
generalPath.curveTo(228.40901, 289.61197, 248.55402, 291.162, 265.502, 294.44498);
generalPath.lineTo(260.682, 302.947);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.283, 297.483);
generalPath.curveTo(223.71901, 297.773, 242.796, 298.576, 261.21, 302.01);
generalPath.lineTo(259.87598, 304.364);
generalPath.curveTo(242.77397, 301.207, 224.54198, 299.99902, 204.34897, 300.09702);
generalPath.curveTo(178.56297, 299.897, 152.48297, 302.30402, 129.77698, 308.82);
generalPath.curveTo(122.612976, 310.814, 110.751976, 315.42, 109.54298, 319.226);
generalPath.lineTo(108.21597, 317.039);
generalPath.curveTo(108.598976, 314.789, 115.765976, 310.119, 129.16597, 306.354);
generalPath.curveTo(155.17596, 298.906, 179.50098, 297.651, 204.28197, 297.48);
generalPath.lineTo(204.28197, 297.484);
generalPath.closePath();
generalPath.moveTo(205.16501, 287.703);
generalPath.curveTo(225.302, 288.079, 246.09702, 289.01, 266.30902, 293.013);
generalPath.lineTo(264.919, 295.463);
generalPath.curveTo(246.667, 291.841, 229.229, 290.63303, 205.283, 290.265);
generalPath.curveTo(179.416, 290.312, 151.977, 292.15503, 127.02901, 299.40903);
generalPath.curveTo(118.97401, 301.75403, 105.073006, 306.82703, 104.60901, 310.84302);
generalPath.lineTo(103.28401, 308.493);
generalPath.curveTo(103.58601, 304.845, 115.61901, 300.087, 126.446014, 296.937);
generalPath.curveTo(151.58601, 289.627, 179.09601, 287.74902, 205.16602, 287.70203);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.626f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(204.283, 297.483);
generalPath.curveTo(223.71901, 297.773, 242.796, 298.576, 261.21, 302.01);
generalPath.lineTo(259.87598, 304.364);
generalPath.curveTo(242.77397, 301.207, 224.54198, 299.99902, 204.34897, 300.09702);
generalPath.curveTo(178.56297, 299.897, 152.48297, 302.30402, 129.77698, 308.82);
generalPath.curveTo(122.612976, 310.814, 110.751976, 315.42, 109.54298, 319.226);
generalPath.lineTo(108.21597, 317.039);
generalPath.curveTo(108.598976, 314.789, 115.765976, 310.119, 129.16597, 306.354);
generalPath.curveTo(155.17596, 298.906, 179.50098, 297.651, 204.28197, 297.48);
generalPath.lineTo(204.28197, 297.484);
generalPath.closePath();
generalPath.moveTo(205.16501, 287.703);
generalPath.curveTo(225.302, 288.079, 246.09702, 289.01, 266.30902, 293.013);
generalPath.lineTo(264.919, 295.463);
generalPath.curveTo(246.667, 291.841, 229.229, 290.63303, 205.283, 290.265);
generalPath.curveTo(179.416, 290.312, 151.977, 292.15503, 127.02901, 299.40903);
generalPath.curveTo(118.97401, 301.75403, 105.073006, 306.82703, 104.60901, 310.84302);
generalPath.lineTo(103.28401, 308.493);
generalPath.curveTo(103.58601, 304.845, 115.61901, 300.087, 126.446014, 296.937);
generalPath.curveTo(151.58601, 289.627, 179.09601, 287.74902, 205.16602, 287.70203);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(304.408, 309.908);
generalPath.lineTo(296.012, 322.934);
generalPath.lineTo(271.88998, 301.511);
generalPath.lineTo(209.31198, 259.414);
generalPath.lineTo(138.76999, 220.73001);
generalPath.lineTo(102.14499, 208.20201);

}

private void _paint1(Graphics2D g,float origAlpha) {
generalPath.lineTo(109.94999, 193.729);
generalPath.lineTo(112.59999, 192.283);
generalPath.lineTo(135.357, 197.973);
generalPath.lineTo(210.45, 236.65701);
generalPath.lineTo(253.685, 263.963);
generalPath.lineTo(290.095, 290.13303);
generalPath.lineTo(304.885, 307.19904);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(304.408, 309.908);
generalPath.lineTo(296.012, 322.934);
generalPath.lineTo(271.88998, 301.511);
generalPath.lineTo(209.31198, 259.414);
generalPath.lineTo(138.76999, 220.73001);
generalPath.lineTo(102.14499, 208.20201);
generalPath.lineTo(109.94999, 193.729);
generalPath.lineTo(112.59999, 192.283);
generalPath.lineTo(135.357, 197.973);
generalPath.lineTo(210.45, 236.65701);
generalPath.lineTo(253.685, 263.963);
generalPath.lineTo(290.095, 290.13303);
generalPath.lineTo(304.885, 307.19904);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(100.825, 208.543);
generalPath.curveTo(107.24899, 204.186, 154.459, 225.217, 203.857, 255.00299);
generalPath.curveTo(253.12299, 284.875, 300.2, 318.629, 295.951, 324.94598);
generalPath.lineTo(294.554, 327.14398);
generalPath.lineTo(293.91397, 327.65);
generalPath.curveTo(294.04996, 327.552, 294.75797, 326.686, 293.84396, 324.344);
generalPath.curveTo(291.74396, 317.43698, 258.34998, 290.78998, 202.94196, 257.33398);
generalPath.curveTo(148.92696, 225.124, 103.90896, 205.71198, 99.40796, 211.26099);
generalPath.lineTo(100.82796, 208.54399);
generalPath.lineTo(100.82596, 208.54399);
generalPath.closePath();
generalPath.moveTo(306.125, 309.723);
generalPath.curveTo(310.188, 301.699, 266.399, 268.71298, 212.10901, 236.595);
generalPath.curveTo(156.569, 205.117, 116.54101, 186.589, 109.22901, 192.115);
generalPath.lineTo(107.60501, 195.071);
generalPath.curveTo(107.59101, 195.235, 107.66501, 194.871, 108.00801, 194.605);
generalPath.curveTo(109.33601, 193.44499, 111.54001, 193.525, 112.53401, 193.50499);
generalPath.curveTo(125.12401, 193.69499, 161.08002, 210.241, 211.52802, 239.16199);
generalPath.curveTo(233.63202, 252.03699, 304.906, 297.749, 304.63403, 310.602);
generalPath.curveTo(304.65402, 311.70798, 304.72604, 311.936, 304.31003, 312.482);
generalPath.lineTo(306.12302, 309.725);
generalPath.lineTo(306.12302, 309.723);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.652f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(100.825, 208.543);
generalPath.curveTo(107.24899, 204.186, 154.459, 225.217, 203.857, 255.00299);
generalPath.curveTo(253.12299, 284.875, 300.2, 318.629, 295.951, 324.94598);
generalPath.lineTo(294.554, 327.14398);
generalPath.lineTo(293.91397, 327.65);
generalPath.curveTo(294.04996, 327.552, 294.75797, 326.686, 293.84396, 324.344);
generalPath.curveTo(291.74396, 317.43698, 258.34998, 290.78998, 202.94196, 257.33398);
generalPath.curveTo(148.92696, 225.124, 103.90896, 205.71198, 99.40796, 211.26099);
generalPath.lineTo(100.82796, 208.54399);
generalPath.lineTo(100.82596, 208.54399);
generalPath.closePath();
generalPath.moveTo(306.125, 309.723);
generalPath.curveTo(310.188, 301.699, 266.399, 268.71298, 212.10901, 236.595);
generalPath.curveTo(156.569, 205.117, 116.54101, 186.589, 109.22901, 192.115);
generalPath.lineTo(107.60501, 195.071);
generalPath.curveTo(107.59101, 195.235, 107.66501, 194.871, 108.00801, 194.605);
generalPath.curveTo(109.33601, 193.44499, 111.54001, 193.525, 112.53401, 193.50499);
generalPath.curveTo(125.12401, 193.69499, 161.08002, 210.241, 211.52802, 239.16199);
generalPath.curveTo(233.63202, 252.03699, 304.906, 297.749, 304.63403, 310.602);
generalPath.curveTo(304.65402, 311.70798, 304.72604, 311.936, 304.31003, 312.482);
generalPath.lineTo(306.12302, 309.725);
generalPath.lineTo(306.12302, 309.723);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.137779951095581f, 0.0f, 0.0f, 1.137779951095581f, -68.30599975585938f, 28.444000244140625f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(180.6, 211.01);
generalPath.curveTo(180.6, 227.28, 187.263, 241.997, 198.057, 252.752);
generalPath.curveTo(208.87201, 263.53, 223.569, 270.332, 239.867, 270.332);
generalPath.curveTo(256.247, 270.332, 271.113, 263.678, 281.88202, 252.942);
generalPath.curveTo(292.652, 242.207, 299.325, 227.39, 299.328, 211.062);
generalPath.lineTo(299.326, 211.062);
generalPath.lineTo(299.326, 131.872);
generalPath.lineTo(180.586, 131.732);
generalPath.lineTo(180.59799, 211.01);
generalPath.lineTo(180.59999, 211.01);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.67f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(180.6, 211.01);
generalPath.curveTo(180.6, 227.28, 187.263, 241.997, 198.057, 252.752);
generalPath.curveTo(208.87201, 263.53, 223.569, 270.332, 239.867, 270.332);
generalPath.curveTo(256.247, 270.332, 271.113, 263.678, 281.88202, 252.942);
generalPath.curveTo(292.652, 242.207, 299.325, 227.39, 299.328, 211.062);
generalPath.lineTo(299.326, 211.062);
generalPath.lineTo(299.326, 131.872);
generalPath.lineTo(180.586, 131.732);
generalPath.lineTo(180.59799, 211.01);
generalPath.lineTo(180.59999, 211.01);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(182.82, 211.12);
generalPath.lineTo(182.82, 211.165);
generalPath.curveTo(182.82, 226.722, 189.26001, 240.88899, 199.595, 251.17499);
generalPath.curveTo(209.949, 261.47897, 224.209, 267.88498, 239.809, 267.88498);
generalPath.curveTo(255.48901, 267.88498, 269.719, 261.525, 280.029, 251.25998);
generalPath.curveTo(290.339, 240.99498, 296.727, 226.82698, 296.729, 211.21597);
generalPath.lineTo(296.727, 211.21597);
generalPath.lineTo(296.727, 134.39);
generalPath.lineTo(182.887, 134.37);
generalPath.lineTo(182.81699, 211.12);
generalPath.moveTo(273.839, 157.372);
generalPath.lineTo(273.843, 206.262);
generalPath.lineTo(273.80298, 211.435);
generalPath.curveTo(273.80298, 212.795, 273.72098, 214.347, 273.563, 215.668);
generalPath.curveTo(272.637, 223.398, 269.08298, 230.135, 263.817, 235.376);
generalPath.curveTo(257.65298, 241.51201, 249.14699, 245.31801, 239.76999, 245.31801);
generalPath.curveTo(230.44398, 245.31801, 222.13199, 241.38, 215.94199, 235.218);
generalPath.curveTo(209.59198, 228.898, 205.91199, 220.232, 205.91199, 211.271);
generalPath.lineTo(205.89899, 157.249);
generalPath.lineTo(273.839, 157.37099);
generalPath.lineTo(273.839, 157.37299);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.507f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(182.82, 211.12);
generalPath.lineTo(182.82, 211.165);
generalPath.curveTo(182.82, 226.722, 189.26001, 240.88899, 199.595, 251.17499);
generalPath.curveTo(209.949, 261.47897, 224.209, 267.88498, 239.809, 267.88498);
generalPath.curveTo(255.48901, 267.88498, 269.719, 261.525, 280.029, 251.25998);
generalPath.curveTo(290.339, 240.99498, 296.727, 226.82698, 296.729, 211.21597);
generalPath.lineTo(296.727, 211.21597);
generalPath.lineTo(296.727, 134.39);
generalPath.lineTo(182.887, 134.37);
generalPath.lineTo(182.81699, 211.12);
generalPath.moveTo(273.839, 157.372);
generalPath.lineTo(273.843, 206.262);
generalPath.lineTo(273.80298, 211.435);
generalPath.curveTo(273.80298, 212.795, 273.72098, 214.347, 273.563, 215.668);
generalPath.curveTo(272.637, 223.398, 269.08298, 230.135, 263.817, 235.376);
generalPath.curveTo(257.65298, 241.51201, 249.14699, 245.31801, 239.76999, 245.31801);
generalPath.curveTo(230.44398, 245.31801, 222.13199, 241.38, 215.94199, 235.218);
generalPath.curveTo(209.59198, 228.898, 205.91199, 220.232, 205.91199, 211.271);
generalPath.lineTo(205.89899, 157.249);
generalPath.lineTo(273.839, 157.37099);
generalPath.lineTo(273.839, 157.37299);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.19, 154.43);
generalPath.curveTo(190.325, 148.90999, 194.242, 147.60199, 194.27, 147.583);
generalPath.curveTo(194.3, 147.56299, 198.502, 148.98999, 198.488, 154.48099);
generalPath.lineTo(190.19, 154.43098);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_2_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
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
// _0_3_2_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_2_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
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
// _0_3_2_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9, 140.61);
generalPath.curveTo(193.874, 139.983, 194.777, 139.976, 194.76599, 140.61);
generalPath.lineTo(194.76599, 142.146);
generalPath.lineTo(193.9, 142.146);
generalPath.lineTo(193.9, 140.61);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_2_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 46.31999969482422f));
// _0_3_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.19, 154.43);
generalPath.curveTo(190.325, 148.90999, 194.242, 147.60199, 194.27, 147.583);
generalPath.curveTo(194.3, 147.56299, 198.502, 148.98999, 198.488, 154.48099);
generalPath.lineTo(190.19, 154.43098);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_2_1_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
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
// _0_3_2_1_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}

}

private void _paint2(Graphics2D g,float origAlpha) {
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_2_1_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
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
// _0_3_2_1_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9, 140.61);
generalPath.curveTo(193.874, 139.983, 194.777, 139.976, 194.76599, 140.61);
generalPath.lineTo(194.76599, 142.146);
generalPath.lineTo(193.9, 142.146);
generalPath.lineTo(193.9, 140.61);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_2_1_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_1_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.704609445000542f, -0.7095953283499182f, 0.7095953283499182f, 0.704609445000542f, -35.34187619637483f, 275.10876704308373f));
// _0_3_2_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.19, 154.43);
generalPath.curveTo(190.325, 148.90999, 194.242, 147.60199, 194.27, 147.583);
generalPath.curveTo(194.3, 147.56299, 198.502, 148.98999, 198.488, 154.48099);
generalPath.lineTo(190.19, 154.43098);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_2_2_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
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
// _0_3_2_2_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_2_2_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
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
// _0_3_2_2_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9, 140.61);
generalPath.curveTo(193.874, 139.983, 194.777, 139.976, 194.76599, 140.61);
generalPath.lineTo(194.76599, 142.146);
generalPath.lineTo(193.9, 142.146);
generalPath.lineTo(193.9, 140.61);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_2_2_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2_2_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 45.7140007019043f, 0.0f));
// _0_3_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.19, 154.43);
generalPath.curveTo(190.325, 148.90999, 194.242, 147.60199, 194.27, 147.583);
generalPath.curveTo(194.3, 147.56299, 198.502, 148.98999, 198.488, 154.48099);
generalPath.lineTo(190.19, 154.43098);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_3_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
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
// _0_3_3_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_3_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);

}

private void _paint3(Graphics2D g,float origAlpha) {
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9, 140.61);
generalPath.curveTo(193.874, 139.983, 194.777, 139.976, 194.76599, 140.61);
generalPath.lineTo(194.76599, 142.146);
generalPath.lineTo(193.9, 142.146);
generalPath.lineTo(193.9, 140.61);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_3_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 479.7919921875f, 0.0f));
// _0_3_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.19, 154.43);
generalPath.curveTo(190.325, 148.90999, 194.242, 147.60199, 194.27, 147.583);
generalPath.curveTo(194.3, 147.56299, 198.502, 148.98999, 198.488, 154.48099);
generalPath.lineTo(190.19, 154.43098);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_4_0_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
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
// _0_3_4_0_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_4_0_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
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
// _0_3_4_0_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9, 140.61);
generalPath.curveTo(193.874, 139.983, 194.777, 139.976, 194.76599, 140.61);
generalPath.lineTo(194.76599, 142.146);
generalPath.lineTo(193.9, 142.146);
generalPath.lineTo(193.9, 140.61);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_4_0_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 46.31999969482422f));
// _0_3_4_0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.19, 154.43);
generalPath.curveTo(190.325, 148.90999, 194.242, 147.60199, 194.27, 147.583);
generalPath.curveTo(194.3, 147.56299, 198.502, 148.98999, 198.488, 154.48099);
generalPath.lineTo(190.19, 154.43098);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_4_0_1_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
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
// _0_3_4_0_1_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_4_0_1_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
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
// _0_3_4_0_1_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9, 140.61);
generalPath.curveTo(193.874, 139.983, 194.777, 139.976, 194.76599, 140.61);
generalPath.lineTo(194.76599, 142.146);
generalPath.lineTo(193.9, 142.146);
generalPath.lineTo(193.9, 140.61);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_4_0_1_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_1_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.704609445000542f, -0.7095953283499182f, 0.7095953283499182f, 0.704609445000542f, -35.34187619637483f, 275.10876704308373f));
// _0_3_4_0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}

}

private void _paint4(Graphics2D g,float origAlpha) {
generalPath.moveTo(190.19, 154.43);
generalPath.curveTo(190.325, 148.90999, 194.242, 147.60199, 194.27, 147.583);
generalPath.curveTo(194.3, 147.56299, 198.502, 148.98999, 198.488, 154.48099);
generalPath.lineTo(190.19, 154.43098);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.81, 147.69);
generalPath.lineTo(186.12799, 154.035);
generalPath.lineTo(190.26799, 154.045);
generalPath.curveTo(190.30798, 148.795, 194.243, 147.921, 194.338, 147.941);
generalPath.curveTo(194.428, 147.937, 198.328, 149.101, 198.431, 154.045);
generalPath.lineTo(202.583, 154.045);
generalPath.lineTo(201.833, 147.651);
generalPath.lineTo(186.81099, 147.689);
generalPath.lineTo(186.81099, 147.691);
generalPath.closePath();
generalPath.moveTo(185.84999, 154.06);
generalPath.lineTo(202.79599, 154.06);
generalPath.curveTo(203.15298, 154.06, 203.44598, 154.413, 203.44598, 154.844);
generalPath.curveTo(203.44598, 155.27399, 203.15298, 155.624, 202.79599, 155.624);
generalPath.lineTo(185.85, 155.624);
generalPath.curveTo(185.49301, 155.624, 185.20001, 155.27399, 185.20001, 154.844);
generalPath.curveTo(185.20001, 154.414, 185.49301, 154.06, 185.85, 154.06);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(192.01, 154.03);
generalPath.curveTo(192.028, 150.717, 194.27199, 149.78, 194.284, 149.782);
generalPath.curveTo(194.284, 149.782, 196.62599, 150.748, 196.644, 154.03);
generalPath.lineTo(192.01, 154.03);
generalPath.moveTo(186.20999, 145.05);
generalPath.lineTo(202.45499, 145.05);
generalPath.curveTo(202.79698, 145.05, 203.07799, 145.368, 203.07799, 145.755);
generalPath.curveTo(203.07799, 146.142, 202.79799, 146.459, 202.45499, 146.459);
generalPath.lineTo(186.21, 146.459);
generalPath.curveTo(185.86801, 146.459, 185.587, 146.143, 185.587, 145.754);
generalPath.curveTo(185.587, 145.367, 185.867, 145.049, 186.21, 145.049);
generalPath.closePath();
generalPath.moveTo(186.54999, 146.47);
generalPath.lineTo(202.08798, 146.47);
generalPath.curveTo(202.41498, 146.47, 202.68298, 146.787, 202.68298, 147.174);
generalPath.curveTo(202.68298, 147.562, 202.41498, 147.87799, 202.08798, 147.87799);
generalPath.lineTo(186.55, 147.87799);
generalPath.curveTo(186.223, 147.87799, 185.955, 147.562, 185.955, 147.174);
generalPath.curveTo(185.955, 146.787, 186.223, 146.47, 186.55, 146.47);
generalPath.closePath();
generalPath.moveTo(191.56999, 135.88);
generalPath.lineTo(192.797, 135.882);
generalPath.lineTo(192.797, 136.752);
generalPath.lineTo(193.692, 136.752);
generalPath.lineTo(193.692, 135.862);
generalPath.lineTo(194.949, 135.867);
generalPath.lineTo(194.949, 136.754);
generalPath.lineTo(195.845, 136.754);
generalPath.lineTo(195.845, 135.864);
generalPath.lineTo(197.103, 135.864);
generalPath.lineTo(197.101, 137.874);
generalPath.curveTo(197.101, 138.191, 196.847, 138.394, 196.551, 138.394);
generalPath.lineTo(192.14099, 138.394);
generalPath.curveTo(191.84499, 138.394, 191.57098, 138.158, 191.57098, 137.869);
generalPath.lineTo(191.56699, 135.879);
generalPath.closePath();
generalPath.moveTo(196.18999, 138.57);
generalPath.lineTo(196.46698, 145.02);
generalPath.lineTo(192.16399, 145.005);
generalPath.lineTo(192.44899, 138.55301);
generalPath.lineTo(196.189, 138.57);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_4_0_2_0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(190.94, 141.56);
generalPath.lineTo(191.07, 145.038);
generalPath.lineTo(186.94601, 145.038);
generalPath.lineTo(187.06201, 141.56);
generalPath.lineTo(190.94202, 141.56);
generalPath.lineTo(190.94002, 141.56);
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
// _0_3_4_0_2_0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.609000205993652f, 0.0f));
// _0_3_4_0_2_0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.5f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(186.3, 139.04);
generalPath.lineTo(187.5, 139.043);
generalPath.lineTo(187.5, 139.915);
generalPath.lineTo(188.377, 139.915);
generalPath.lineTo(188.377, 139.023);
generalPath.lineTo(189.607, 139.027);
generalPath.lineTo(189.607, 139.91699);
generalPath.lineTo(190.487, 139.91699);
generalPath.lineTo(190.487, 139.023);
generalPath.lineTo(191.717, 139.025);
generalPath.lineTo(191.71399, 141.03699);
generalPath.curveTo(191.71399, 141.35098, 191.46399, 141.555, 191.178, 141.555);
generalPath.lineTo(186.861, 141.555);
generalPath.curveTo(186.571, 141.555, 186.303, 141.31999, 186.303, 141.03);
generalPath.lineTo(186.29999, 139.04);
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
// _0_3_4_0_2_0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(193.9, 140.61);
generalPath.curveTo(193.874, 139.983, 194.777, 139.976, 194.76599, 140.61);
generalPath.lineTo(194.76599, 142.146);
generalPath.lineTo(193.9, 142.146);
generalPath.lineTo(193.9, 140.61);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 10.640999794006348f, 0.0f));
// _0_3_4_0_2_0_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4_0_2_0_9_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(188.57, 142.84);
generalPath.curveTo(188.567, 142.234, 189.40701, 142.222, 189.39601, 142.84);
generalPath.lineTo(189.39601, 144.027);
generalPath.lineTo(188.57, 144.027);
generalPath.lineTo(188.57, 142.84);
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(232.636, 202.406);
generalPath.lineTo(232.636, 202.41101);
generalPath.curveTo(232.62772, 204.51907, 233.41805, 206.55208, 234.848, 208.10101);
generalPath.curveTo(236.21301, 209.56801, 238.093, 210.47902, 240.15001, 210.47902);
generalPath.curveTo(242.21701, 210.47902, 244.09401, 209.57402, 245.453, 208.11401);
generalPath.curveTo(246.811, 206.654, 247.655, 204.64201, 247.655, 202.42102);
generalPath.lineTo(247.655, 191.65302);
generalPath.lineTo(232.663, 191.64001);
generalPath.lineTo(232.635, 202.40501);
shape = generalPath;
paint = new Color(0, 51, 153, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5_1
shape = new Ellipse2D.Double(234.5880126953125, 194.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5_2
shape = new Ellipse2D.Double(242.906005859375, 194.25601196289062, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5_3
shape = new Ellipse2D.Double(238.739013671875, 198.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5_4
shape = new Ellipse2D.Double(234.5880126953125, 202.4300079345703, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5_5
shape = new Ellipse2D.Double(242.89700317382812, 202.41900634765625, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -26.016000747680664f));
// _0_3_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(232.636, 202.406);
generalPath.lineTo(232.636, 202.41101);
generalPath.curveTo(232.62772, 204.51907, 233.41805, 206.55208, 234.848, 208.10101);
generalPath.curveTo(236.21301, 209.56801, 238.093, 210.47902, 240.15001, 210.47902);
generalPath.curveTo(242.21701, 210.47902, 244.09401, 209.57402, 245.453, 208.11401);
generalPath.curveTo(246.811, 206.654, 247.655, 204.64201, 247.655, 202.42102);
generalPath.lineTo(247.655, 191.65302);
generalPath.lineTo(232.663, 191.64001);
generalPath.lineTo(232.635, 202.40501);
shape = generalPath;
paint = new Color(0, 51, 153, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0_1
shape = new Ellipse2D.Double(234.5880126953125, 194.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0_2
shape = new Ellipse2D.Double(242.906005859375, 194.25601196289062, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0_3
shape = new Ellipse2D.Double(238.739013671875, 198.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0_4
shape = new Ellipse2D.Double(234.5880126953125, 202.4300079345703, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_6_0_5
shape = new Ellipse2D.Double(242.89700317382812, 202.41900634765625, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -20.798999786376953f, 0.0f));
// _0_3_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(232.636, 202.406);
generalPath.lineTo(232.636, 202.41101);
generalPath.curveTo(232.62772, 204.51907, 233.41805, 206.55208, 234.848, 208.10101);
generalPath.curveTo(236.21301, 209.56801, 238.093, 210.47902, 240.15001, 210.47902);
generalPath.curveTo(242.21701, 210.47902, 244.09401, 209.57402, 245.453, 208.11401);
generalPath.curveTo(246.811, 206.654, 247.655, 204.64201, 247.655, 202.42102);
generalPath.lineTo(247.655, 191.65302);
generalPath.lineTo(232.663, 191.64001);
generalPath.lineTo(232.635, 202.40501);
shape = generalPath;
paint = new Color(0, 51, 153, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0_1
shape = new Ellipse2D.Double(234.5880126953125, 194.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0_2
shape = new Ellipse2D.Double(242.906005859375, 194.25601196289062, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0_3
shape = new Ellipse2D.Double(238.739013671875, 198.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0_4
shape = new Ellipse2D.Double(234.5880126953125, 202.4300079345703, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_7_0_5
shape = new Ellipse2D.Double(242.89700317382812, 202.41900634765625, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 20.7450008392334f, 0.0f));
// _0_3_8
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(232.636, 202.406);
generalPath.lineTo(232.636, 202.41101);
generalPath.curveTo(232.62772, 204.51907, 233.41805, 206.55208, 234.848, 208.10101);
generalPath.curveTo(236.21301, 209.56801, 238.093, 210.47902, 240.15001, 210.47902);
generalPath.curveTo(242.21701, 210.47902, 244.09401, 209.57402, 245.453, 208.11401);
generalPath.curveTo(246.811, 206.654, 247.655, 204.64201, 247.655, 202.42102);
generalPath.lineTo(247.655, 191.65302);
generalPath.lineTo(232.663, 191.64001);
generalPath.lineTo(232.635, 202.40501);
shape = generalPath;
paint = new Color(0, 51, 153, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0_1
shape = new Ellipse2D.Double(234.5880126953125, 194.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0_2
shape = new Ellipse2D.Double(242.906005859375, 194.25601196289062, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0_3
shape = new Ellipse2D.Double(238.739013671875, 198.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0_4
shape = new Ellipse2D.Double(234.5880126953125, 202.4300079345703, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_8_0_5
shape = new Ellipse2D.Double(242.89700317382812, 202.41900634765625, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 25.784000396728516f));
// _0_3_9
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(232.636, 202.406);
generalPath.lineTo(232.636, 202.41101);
generalPath.curveTo(232.62772, 204.51907, 233.41805, 206.55208, 234.848, 208.10101);
generalPath.curveTo(236.21301, 209.56801, 238.093, 210.47902, 240.15001, 210.47902);
generalPath.curveTo(242.21701, 210.47902, 244.09401, 209.57402, 245.453, 208.11401);
generalPath.curveTo(246.811, 206.654, 247.655, 204.64201, 247.655, 202.42102);
generalPath.lineTo(247.655, 191.65302);
generalPath.lineTo(232.663, 191.64001);
generalPath.lineTo(232.635, 202.40501);
shape = generalPath;
paint = new Color(0, 51, 153, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0_1
shape = new Ellipse2D.Double(234.5880126953125, 194.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0_2
shape = new Ellipse2D.Double(242.906005859375, 194.25601196289062, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0_3
shape = new Ellipse2D.Double(238.739013671875, 198.24900817871094, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0_4
shape = new Ellipse2D.Double(234.5880126953125, 202.4300079345703, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_9_0_5
shape = new Ellipse2D.Double(242.89700317382812, 202.41900634765625, 2.9719998836517334, 2.9719998836517334);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
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
		return 512.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 512.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private pt() {
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
       pt base = new pt();
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
       pt base = new pt();
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
        return pt::new;
    }
}

