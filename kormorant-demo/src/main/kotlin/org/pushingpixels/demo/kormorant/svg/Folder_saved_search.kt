package org.pushingpixels.demo.kormorant.svg

import java.awt.*
import java.awt.geom.*
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.IsHiDpiAware
import org.pushingpixels.neon.icon.NeonIcon
import org.pushingpixels.neon.icon.NeonIconUIResource
import org.pushingpixels.neon.icon.ResizableIcon

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Ibis SVG transcoder</a>.
 */
class Folder_saved_search(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
	private fun innerPaint(g : Graphics2D) {
        @Suppress("UNUSED_VARIABLE") var shape: Shape?
        @Suppress("UNUSED_VARIABLE") var paint: Paint?
        @Suppress("UNUSED_VARIABLE") var stroke: Stroke?
         
        var origAlpha = 1.0f
        val origComposite = g.composite
        if (origComposite is AlphaComposite) {
            if (origComposite.rule == AlphaComposite.SRC_OVER) {
                origAlpha = origComposite.alpha
            }
        }
        
	    val defaultTransform_ = g.transform
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(0.022623829543590546f, 0.0f, 0.0f, 0.02086758054792881f, 43.38343048095703f, 36.36962127685547f))
// _0_0_0
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
val defaultTransform__0_0_0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_0
paint = LinearGradientPaint(Point2D.Double(302.8571472167969, 366.64788818359375), Point2D.Double(302.8571472167969, 609.5050659179688), floatArrayOf(0.0f,0.5f,1.0f), arrayOf(Color(0, 0, 0, 0),Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f))
shape = Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375)
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0_0
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
val defaultTransform__0_0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_1
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f))
shape = GeneralPath()
shape.moveTo(-219.61876, -150.68037)
shape.curveTo(-219.61876, -150.68037, -219.61876, 327.65042, -219.61876, 327.65042)
shape.curveTo(-76.74459, 328.55087, 125.78146, 220.48074, 125.78138, 88.45424)
shape.curveTo(125.78138, -43.572304, -33.655437, -150.68036, -219.61876, -150.68037)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0_1
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
val defaultTransform__0_0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_0_2
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f))
shape = GeneralPath()
shape.moveTo(-1559.2523, -150.68037)
shape.curveTo(-1559.2523, -150.68037, -1559.2523, 327.65042, -1559.2523, 327.65042)
shape.curveTo(-1702.1265, 328.55087, -1904.6525, 220.48074, -1904.6525, 88.45424)
shape.curveTo(-1904.6525, -43.572304, -1745.2157, -150.68036, -1559.2523, -150.68037)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0_2
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.001039981842041f, 0.0f, 0.0f, 1.0020760297775269f, -0.053901348263025284f, -0.10208400338888168f))
// _0_0_1
paint = RadialGradientPaint(Point2D.Double(20.706016540527344, 37.51798629760742), 30.905205f, Point2D.Double(20.706016540527344, 37.51798629760742), floatArrayOf(0.0f,1.0f), arrayOf(Color(32, 32, 32, 255),Color(185, 185, 185, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.056007981300354f, 0.015133569948375225f, 0.14261800050735474f, 1.2515989542007446f, -2.2762789726257324f, -10.281060218811035f))
shape = GeneralPath()
shape.moveTo(4.5217805, 38.687416)
shape.curveTo(4.5435767, 39.10372, 4.981685, 39.520027, 5.39799, 39.520027)
shape.lineTo(36.72501, 39.520027)
shape.curveTo(37.14131, 39.520027, 37.535824, 39.10372, 37.514027, 38.687416)
shape.lineTo(36.577583, 11.460682)
shape.curveTo(36.555786, 11.044379, 36.117687, 10.628066, 35.70138, 10.628066)
shape.lineTo(22.43051, 10.628066)
shape.curveTo(21.945454, 10.628066, 21.196037, 10.312477, 21.028866, 9.521434)
shape.lineTo(20.417475, 6.6283627)
shape.curveTo(20.262007, 5.8926897, 19.535261, 5.5904765, 19.118958, 5.5904765)
shape.lineTo(4.3400974, 5.5904765)
shape.curveTo(3.9237847, 5.5904765, 3.5292766, 6.0067806, 3.5510726, 6.4230847)
shape.lineTo(4.5217805, 38.687416)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = LinearGradientPaint(Point2D.Double(18.112709045410156, 31.36775016784668), Point2D.Double(15.514888763427734, 6.18025016784668), floatArrayOf(0.0f,1.0f), arrayOf(Color(66, 66, 66, 255),Color(119, 119, 119, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
stroke = BasicStroke(0.99844444f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.5217805, 38.687416)
shape.curveTo(4.5435767, 39.10372, 4.981685, 39.520027, 5.39799, 39.520027)
shape.lineTo(36.72501, 39.520027)
shape.curveTo(37.14131, 39.520027, 37.535824, 39.10372, 37.514027, 38.687416)
shape.lineTo(36.577583, 11.460682)
shape.curveTo(36.555786, 11.044379, 36.117687, 10.628066, 35.70138, 10.628066)
shape.lineTo(22.43051, 10.628066)
shape.curveTo(21.945454, 10.628066, 21.196037, 10.312477, 21.028866, 9.521434)
shape.lineTo(20.417475, 6.6283627)
shape.curveTo(20.262007, 5.8926897, 19.535261, 5.5904765, 19.118958, 5.5904765)
shape.lineTo(4.3400974, 5.5904765)
shape.curveTo(3.9237847, 5.5904765, 3.5292766, 6.0067806, 3.5510726, 6.4230847)
shape.lineTo(4.5217805, 38.687416)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_0
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.0421734, 18.5625)
shape.lineTo(35.489105, 18.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.0421734, 18.5625)
shape.lineTo(35.489105, 18.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_0
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_1
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(4.9806967, 12.5625)
shape.lineTo(35.488056, 12.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.9806967, 12.5625)
shape.lineTo(35.488056, 12.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_1
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_2
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.2265925, 22.5625)
shape.lineTo(35.492172, 22.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.2265925, 22.5625)
shape.lineTo(35.492172, 22.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_2
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_3
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.3861575, 32.5625)
shape.lineTo(35.49488, 32.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.3861575, 32.5625)
shape.lineTo(35.49488, 32.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_3
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_4
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.50914, 34.5625)
shape.lineTo(35.496895, 34.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.50914, 34.5625)
shape.lineTo(35.496895, 34.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_4
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_5
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.0421734, 16.5625)
shape.lineTo(35.489105, 16.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.0421734, 16.5625)
shape.lineTo(35.489105, 16.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_5
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_6
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.1958537, 20.5625)
shape.lineTo(35.49165, 20.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000001f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.1958537, 20.5625)
shape.lineTo(35.49165, 20.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_6
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_7
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.0114346, 14.5625)
shape.lineTo(35.48858, 14.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.0114346, 14.5625)
shape.lineTo(35.48858, 14.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_8 = g.transform
g.transform(AffineTransform(1.0407639741897583f, 0.0f, 0.0544925183057785f, 1.0407639741897583f, -8.539401054382324f, 2.452526092529297f))
// _0_0_2_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_2_8_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_8_0
paint = Color(255, 255, 255, 130)
shape = GeneralPath()
shape.moveTo(42.417183, 8.515178)
shape.curveTo(42.422268, 8.418064, 42.28902, 8.268189, 42.182068, 8.268171)
shape.lineTo(29.150665, 8.266053)
shape.curveTo(29.150665, 8.266053, 30.06238, 8.854008, 31.352476, 8.862296)
shape.lineTo(42.405975, 8.933317)
shape.curveTo(42.41706, 8.721589, 42.408695, 8.677284, 42.417183, 8.515178)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2_8_0
g.transform = defaultTransform__0_0_2_8
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_9 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_9
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.2265925, 24.5625)
shape.lineTo(35.492172, 24.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.2265925, 24.5625)
shape.lineTo(35.492172, 24.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_9
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_10
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.3246665, 30.5625)
shape.lineTo(35.493877, 30.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.3246665, 30.5625)
shape.lineTo(35.493877, 30.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_10
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_11
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.3246665, 28.5625)
shape.lineTo(35.493877, 28.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.3246665, 28.5625)
shape.lineTo(35.493877, 28.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_11
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_12
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.50914, 36.5625)
shape.lineTo(35.496895, 36.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.50914, 36.5625)
shape.lineTo(35.496895, 36.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_12
g.composite = AlphaComposite.getInstance(3, 0.4514286f * origAlpha)
val defaultTransform__0_0_2_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_13
paint = LinearGradientPaint(Point2D.Double(6.229796409606934, 13.773065567016602), Point2D.Double(9.898089408874512, 66.83405303955078), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 223),Color(255, 255, 254, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.5168440341949463f, 0.0f, 0.0f, 0.708977997303009f, -0.8795729875564575f, -1.3181660175323486f))
shape = GeneralPath()
shape.moveTo(6.068343, 38.86402)
shape.curveTo(6.084686, 39.17625, 5.8874316, 39.384403, 5.5697584, 39.280327)
shape.lineTo(5.5697584, 39.280327)
shape.curveTo(5.2520766, 39.17625, 5.033027, 38.968098, 5.0166755, 38.65587)
shape.lineTo(4.068956, 6.591384)
shape.curveTo(4.0526133, 6.2791557, 4.234142, 6.0906134, 4.54637, 6.0906134)
shape.lineTo(18.96842, 6.0429196)
shape.curveTo(19.280647, 6.0429196, 19.900364, 6.3433924, 20.101357, 7.3651013)
shape.lineTo(20.674845, 10.180636)
shape.curveTo(20.247791, 9.715379, 20.255651, 9.701017, 20.037287, 9.02393)
shape.lineTo(19.631191, 7.764748)
shape.curveTo(19.412142, 7.037101, 18.932991, 6.932848, 18.620764, 6.932848)
shape.lineTo(5.732989, 6.932848)
shape.curveTo(5.420761, 6.932848, 5.2235074, 7.141, 5.239858, 7.4532366)
shape.lineTo(6.1778636, 38.968098)
shape.lineTo(6.068343, 38.86402)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_2_13
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_14 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_14
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(5.288064, 26.5625)
shape.lineTo(35.493183, 26.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(5.288064, 26.5625)
shape.lineTo(35.493183, 26.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_14
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_15 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_15
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(4.8737535, 8.5625)
shape.lineTo(19.657488, 8.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(0.9999998f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.8737535, 8.5625)
shape.lineTo(19.657488, 8.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_15
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
val defaultTransform__0_0_2_16 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2_16
paint = Color(114, 159, 207, 255)
shape = GeneralPath()
shape.moveTo(4.9220967, 10.5625)
shape.lineTo(20.202911, 10.5625)
g.paint = paint
g.fill(shape)
paint = Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(4.9220967, 10.5625)
shape.lineTo(20.202911, 10.5625)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2_16
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(0.9930909872055054f, 0.0f, 0.0f, 0.9978960156440735f, 0.2977159917354584f, 0.0698358565568924f))
// _0_0_3
paint = LinearGradientPaint(Point2D.Double(28.238475799560547, 40.0133056640625), Point2D.Double(28.752830505371094, 17.488000869750977), floatArrayOf(0.0f,0.18421052f,1.0f), arrayOf(Color(254, 207, 140, 255),Color(252, 186, 88, 255),Color(253, 197, 114, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(39.78353, 39.51062)
shape.curveTo(40.927425, 39.466557, 41.74661, 38.41432, 41.830566, 37.189613)
shape.curveTo(42.622353, 25.640928, 43.489925, 15.957666, 43.489925, 15.957666)
shape.curveTo(43.56208, 15.710182, 43.322018, 15.462699, 43.00979, 15.462699)
shape.lineTo(8.638631, 15.462699)
shape.curveTo(8.638631, 15.462699, 6.7883115, 37.32959, 6.7883115, 37.32959)
shape.curveTo(6.673756, 38.311657, 6.322304, 39.134308, 5.2384753, 39.513306)
shape.lineTo(39.78353, 39.51062)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(206, 92, 0, 255)
stroke = BasicStroke(1.0045297f,0,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(39.78353, 39.51062)
shape.curveTo(40.927425, 39.466557, 41.74661, 38.41432, 41.830566, 37.189613)
shape.curveTo(42.622353, 25.640928, 43.489925, 15.957666, 43.489925, 15.957666)
shape.curveTo(43.56208, 15.710182, 43.322018, 15.462699, 43.00979, 15.462699)
shape.lineTo(8.638631, 15.462699)
shape.curveTo(8.638631, 15.462699, 6.7883115, 37.32959, 6.7883115, 37.32959)
shape.curveTo(6.673756, 38.311657, 6.322304, 39.134308, 5.2384753, 39.513306)
shape.lineTo(39.78353, 39.51062)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 0.46590912f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(0.9930909872055054f, 0.0f, 0.0f, 0.9978960156440735f, 0.2977159917354584f, 0.0698358565568924f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(13.035696029663086, 32.56718444824219), Point2D.Double(12.853771209716797, 46.68931198120117), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.3174890279769897f, 0.0f, 0.0f, 0.8162559866905212f, -0.8795729875564575f, -1.3181660175323486f))
stroke = BasicStroke(1.0045295f,1,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(9.620244, 16.46392)
shape.lineTo(42.411343, 16.528734)
shape.lineTo(40.837296, 36.530712)
shape.curveTo(40.752975, 37.602226, 40.38662, 37.958927, 38.96464, 37.958927)
shape.curveTo(37.09314, 37.958927, 10.286673, 37.92652, 7.569899, 37.92652)
shape.curveTo(7.8034973, 37.605713, 7.9036546, 36.9379, 7.9049954, 36.92191)
shape.lineTo(9.620244, 16.46392)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(0.9930909872055054f, 0.0f, 0.0f, 0.9978960156440735f, 0.2977159917354584f, 0.0698358565568924f))
// _0_0_5
paint = Color(255, 255, 255, 23)
shape = GeneralPath()
shape.moveTo(9.620248, 16.223183)
shape.lineTo(8.453602, 31.866453)
shape.curveTo(8.453602, 31.866453, 16.749756, 27.718374, 27.11995, 27.718374)
shape.curveTo(37.490143, 27.718374, 42.67524, 16.223183, 42.67524, 16.223183)
shape.lineTo(9.620248, 16.223183)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 0.41477272f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.0407639741897583f, 0.0f, 0.0544925183057785f, 1.3656419515609741f, -8.358528137207031f, 0.9217879772186279f))
// _0_0_6
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0016820430755615f, 0.0f, 0.0f, 0.9640309810638428f, -0.06592009961605072f, 1.2589360475540161f))
// _0_0_7
paint = LinearGradientPaint(Point2D.Double(20.13309669494629, 33.64693832397461), Point2D.Double(20.796142578125, 50.77069091796875), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2078720331192017f, 0.0f, -0.0403112918138504f, 0.8279020190238953f, -29.59564971923828f, -0.11754699796438217f))
shape = GeneralPath()
shape.moveTo(23.216295, 20.483131)
shape.curveTo(19.939735, 20.73441, 17.206654, 23.494648, 17.044767, 26.819387)
shape.curveTo(16.874922, 30.30764, 19.609264, 33.18194, 23.097519, 33.18194)
shape.curveTo(24.80758, 33.18194, 26.401075, 32.506996, 27.601545, 31.394114)
shape.curveTo(27.663282, 31.574078, 27.771542, 31.746853, 27.89272, 31.893652)
shape.curveTo(28.003195, 32.022076, 28.14461, 32.14614, 28.296741, 32.235443)
shape.lineTo(32.38049, 34.759426)
shape.curveTo(33.15578, 35.2386, 34.20425, 34.979637, 34.72231, 34.181015)
shape.curveTo(35.240368, 33.382393, 35.03184, 32.346535, 34.25655, 31.867361)
shape.lineTo(30.1728, 29.343374)
shape.curveTo(29.896967, 29.16637, 29.571732, 29.069204, 29.239107, 29.08046)
shape.curveTo(29.541227, 28.380236, 29.705093, 27.609695, 29.743574, 26.819387)
shape.curveTo(29.91342, 23.331137, 27.204088, 20.483131, 23.715836, 20.483131)
shape.curveTo(23.552322, 20.483131, 23.377438, 20.470774, 23.216295, 20.483131)
shape.closePath()
shape.moveTo(23.43519, 23.007116)
shape.curveTo(23.484535, 23.005278, 23.543192, 23.007116, 23.59294, 23.007116)
shape.curveTo(25.715557, 23.007118, 27.32294, 24.69677, 27.219587, 26.819387)
shape.curveTo(27.116236, 28.942007, 25.34431, 30.631659, 23.221695, 30.631659)
shape.curveTo(21.099075, 30.631659, 19.491693, 28.942007, 19.595045, 26.819387)
shape.curveTo(19.695974, 24.74652, 21.379108, 23.083765, 23.43519, 23.007116)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_7
g.transform = defaultTransform__0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.transform = defaultTransform__0_1
g.transform = defaultTransform__0
g.transform = defaultTransform_

	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 0.2928977608680725
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 4.999739646911621
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 45.93619155883789
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 38.2259407043457
        }

        /**
         * Returns an instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Folder_saved_search(width, height))
        }

        /**
         * Returns a [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Folder_saved_search(width, height))
        }
    }

    override fun getIconHeight(): Int {
        return width
    }

    override fun getIconWidth(): Int {
        return height
    }

    override fun setDimension(newDimension: Dimension) {
        width = newDimension.width
        height = newDimension.height
    }

    override fun isHiDpiAware(): Boolean {
        return true
    }

    override fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)
        g2d.translate(x, y)

        val coef1 = this.width.toDouble() / getOrigWidth()
        val coef2 = this.height.toDouble() / getOrigHeight()
        val coef = Math.min(coef1, coef2)
        g2d.clipRect(0, 0, this.width, this.height)
        g2d.scale(coef, coef)
        g2d.translate(-getOrigX(), -getOrigY())
        if (coef1 != coef2) {
            if (coef1 < coef2) {
                val extraDy = ((getOrigWidth() - getOrigHeight()) / 2.0).toInt()
                g2d.translate(0, extraDy)
            } else {
                val extraDx = ((getOrigHeight() - getOrigWidth()) / 2.0).toInt()
                g2d.translate(extraDx, 0)
            }
        }
        val g2ForInner = g2d.create() as Graphics2D
        innerPaint(g2ForInner)
        g2ForInner.dispose()
        g2d.dispose()

    }
}

