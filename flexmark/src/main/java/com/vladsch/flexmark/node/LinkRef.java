package com.vladsch.flexmark.node;

import com.vladsch.flexmark.internal.util.sequence.BasedSequence;

public class LinkRef extends RefNode {
    public LinkRef() {
    }

    public LinkRef(BasedSequence chars) {
        super(chars);
    }

    public LinkRef(BasedSequence textOpenMarker, BasedSequence text, BasedSequence textCloseMarker, BasedSequence referenceOpenMarker, BasedSequence reference, BasedSequence referenceCloseMarker) {
        super(textOpenMarker, text, textCloseMarker, referenceOpenMarker, reference, referenceCloseMarker);
    }

    public LinkRef(BasedSequence chars, BasedSequence textOpenMarker, BasedSequence text, BasedSequence textCloseMarker, BasedSequence referenceOpenMarker, BasedSequence reference, BasedSequence referenceCloseMarker) {
        super(chars, textOpenMarker, text, textCloseMarker, referenceOpenMarker, reference, referenceCloseMarker);
    }

    public LinkRef(BasedSequence textOpenMarker, BasedSequence text, BasedSequence textCloseMarker) {
        super(textOpenMarker, text, textCloseMarker);
    }

    public LinkRef(BasedSequence chars, BasedSequence textOpenMarker, BasedSequence text, BasedSequence textCloseMarker) {
        super(chars, textOpenMarker, text, textCloseMarker);
    }

    public LinkRef(BasedSequence textOpenMarker, BasedSequence text, BasedSequence textCloseMarker, BasedSequence referenceOpenMarker, BasedSequence referenceCloseMarker) {
        super(textOpenMarker, text, textCloseMarker, referenceOpenMarker, referenceCloseMarker);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}