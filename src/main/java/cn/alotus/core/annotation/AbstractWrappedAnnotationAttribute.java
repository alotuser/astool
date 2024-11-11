package cn.alotus.core.annotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cn.alotus.core.lang.Assert;
import cn.alotus.core.util.ObjectUtil;

/**
 * {@link WrappedAnnotationAttribute}的基本实现
 *
 * @author alotuser
 * @see ForceAliasedAnnotationAttribute
 * @see AliasedAnnotationAttribute
 * @see MirroredAnnotationAttribute
 */
public abstract class AbstractWrappedAnnotationAttribute implements WrappedAnnotationAttribute {

	protected final AnnotationAttribute original;
	protected final AnnotationAttribute linked;

	protected AbstractWrappedAnnotationAttribute(AnnotationAttribute original, AnnotationAttribute linked) {
		Assert.notNull(original, "target must not null");
		Assert.notNull(linked, "linked must not null");
		this.original = original;
		this.linked = linked;
	}

	@Override
	public AnnotationAttribute getOriginal() {
		return original;
	}

	@Override
	public AnnotationAttribute getLinked() {
		return linked;
	}

	@Override
	public AnnotationAttribute getNonWrappedOriginal() {
		AnnotationAttribute curr = null;
		AnnotationAttribute next = original;
		while (next != null) {
			curr = next;
			next = next.isWrapped() ? ((WrappedAnnotationAttribute)curr).getOriginal() : null;
		}
		return curr;
	}

	@Override
	public Collection<AnnotationAttribute> getAllLinkedNonWrappedAttributes() {
		List<AnnotationAttribute> leafAttributes = new ArrayList<>();
		collectLeafAttribute(this, leafAttributes);
		return leafAttributes;
	}

	private void collectLeafAttribute(AnnotationAttribute curr, List<AnnotationAttribute> leafAttributes) {
		if (ObjectUtil.isNull(curr)) {
			return;
		}
		if (!curr.isWrapped()) {
			leafAttributes.add(curr);
			return;
		}
		WrappedAnnotationAttribute wrappedAttribute = (WrappedAnnotationAttribute)curr;
		collectLeafAttribute(wrappedAttribute.getOriginal(), leafAttributes);
		collectLeafAttribute(wrappedAttribute.getLinked(), leafAttributes);
	}

}
