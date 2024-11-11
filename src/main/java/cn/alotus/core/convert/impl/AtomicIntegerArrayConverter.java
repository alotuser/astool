package cn.alotus.core.convert.impl;

import java.util.concurrent.atomic.AtomicIntegerArray;

import cn.alotus.core.convert.AbstractConverter;
import cn.alotus.core.convert.Convert;

/**
 * {@link AtomicIntegerArray}转换器
 *
 * @author alotuser
 * @since 5.4.5
 */
public class AtomicIntegerArrayConverter extends AbstractConverter<AtomicIntegerArray> {
	private static final long serialVersionUID = 1L;

	@Override
	protected AtomicIntegerArray convertInternal(Object value) {
		return new AtomicIntegerArray(Convert.convert(int[].class, value));
	}

}
