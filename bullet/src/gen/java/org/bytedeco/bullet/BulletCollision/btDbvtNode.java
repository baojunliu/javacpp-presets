// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/* btDbvtNode				*/
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btDbvtNode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btDbvtNode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDbvtNode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDbvtNode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btDbvtNode position(long position) {
        return (btDbvtNode)super.position(position);
    }
    @Override public btDbvtNode getPointer(long i) {
        return new btDbvtNode((Pointer)this).offsetAddress(i);
    }

	public native @ByRef @Cast("btDbvtVolume*") btDbvtAabbMm volume(); public native btDbvtNode volume(btDbvtAabbMm setter);
	public native btDbvtNode parent(); public native btDbvtNode parent(btDbvtNode setter);
	public native @Cast("bool") boolean isleaf();
	public native @Cast("bool") boolean isinternal();
		public native btDbvtNode childs(int i); public native btDbvtNode childs(int i, btDbvtNode setter);
		@MemberGetter public native @Cast("btDbvtNode**") PointerPointer childs();
		public native Pointer data(); public native btDbvtNode data(Pointer setter);
		public native int dataAsInt(); public native btDbvtNode dataAsInt(int setter);
}
