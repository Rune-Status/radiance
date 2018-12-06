/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.flamingo.api.common.projection;

import org.pushingpixels.flamingo.api.common.model.*;

import javax.swing.*;
import java.util.function.BiFunction;

public abstract class Projection<T extends JComponent, C extends ContentModel,
        P extends PresentationModel> {
    private C contentModel;
    private P presentationModel;

    private ComponentSupplier<T, C, P> componentSupplier;
    private ComponentCustomizer<T> componentCustomizer;

    /**
     * This interface can be used as part of {@link #setComponentSupplier(ComponentSupplier)}
     * to return your own supplier of {@link TC} to be used before the
     * {@link #configureComponent(JComponent)} call.
     */
    public interface ComponentSupplier<TC extends JComponent, CC extends ContentModel,
            PC extends PresentationModel> {
        /**
         * @param projection Information on the projection in case this
         *                   creator has logic that depends on specific field(s) of
         *                   the content model and / or the presentation model.
         * @return A supplier of the target component. It should be a reference to a function that
         * gets two parameters - content model and presentation model, and returns an instance
         * of the matching {@link JComponent} subclass that represents the Swing component to be
         * used to configure the projected component in {@link #configureComponent(JComponent)}
         * call.
         */
        BiFunction<CC, PC, TC> getComponentSupplier(Projection<TC, CC, PC> projection);
    }

    /**
     * This interface can be used as part of
     * {@link #setComponentCustomizer(ComponentCustomizer)} to customize the result of
     * {@link #buildComponent()} with additional functionality not exposed via
     * {@link #getContentModel()} or {@link #getPresentationModel()}.
     */
    public interface ComponentCustomizer<TC extends JComponent> {
        void customizeComponent(TC component);
    }

    protected Projection(C contentModel, P presentationModel,
            ComponentSupplier<T, C, P> componentSupplier) {
        this.contentModel = contentModel;
        this.presentationModel = presentationModel;
        this.componentSupplier = componentSupplier;
    }

    public C getContentModel() {
        return this.contentModel;
    }

    public P getPresentationModel() {
        return this.presentationModel;
    }

    public void setComponentSupplier(ComponentSupplier<T, C, P> componentSupplier) {
        if (componentSupplier == null) {
            throw new IllegalArgumentException("Cannot pass null component creator");
        }
        this.componentSupplier = componentSupplier;
    }

    public void setComponentCustomizer(ComponentCustomizer<T> componentCustomizer) {
        this.componentCustomizer = componentCustomizer;
    }

    public ComponentSupplier<T, C, P> getComponentSupplier() {
        return this.componentSupplier;
    }

    public ComponentCustomizer<T> getComponentCustomizer() {
        return this.componentCustomizer;
    }

    public T buildComponent() {
        T result = this.getComponentSupplier().getComponentSupplier(this).apply(
                this.getContentModel(), this.getPresentationModel());

        this.configureComponent(result);

        if (this.getComponentCustomizer() != null) {
            this.getComponentCustomizer().customizeComponent(result);
        }

        return result;
    }

    protected abstract void configureComponent(T component);
}
