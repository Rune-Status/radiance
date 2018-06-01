/*
 * Copyright (c) 2018 Radiance Kormorant Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of Radiance Kormorant Kirill Grouchnikov nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.kormorant.ribbon

import org.pushingpixels.flamingo.api.ribbon.RibbonTask
import org.pushingpixels.kormorant.FlamingoElementMarker
import org.pushingpixels.kormorant.NullableDelegate

@FlamingoElementMarker
class KRibbonTaskBandContainer {
    val bands = arrayListOf<KRibbonBand>()

    operator fun KRibbonBand.unaryPlus() {
        this@KRibbonTaskBandContainer.bands.add(this)
    }
}

@FlamingoElementMarker
class KRibbonTask {
    private var ribbonTask: RibbonTask? = null

    var title: String? by NullableDelegate(ribbonTask)
    var keyTip: String? by NullableDelegate(null)
    private val bands = KRibbonTaskBandContainer()

    fun bands(init: KRibbonTaskBandContainer.() -> Unit) {
        bands.init()
    }

    fun asRibbonTask(): RibbonTask {
        if (ribbonTask != null) {
            throw IllegalStateException("This method can only be called once")
        }
        val javaBands = bands.bands.map { it -> it.asRibbonBand() }
        ribbonTask = RibbonTask(title, javaBands.asIterable())
        return ribbonTask!!
    }
}

fun ribbonTask(init: KRibbonTask.() -> Unit): KRibbonTask {
    val ribbonTask = KRibbonTask()
    ribbonTask.init()
    return ribbonTask
}
