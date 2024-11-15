package cn.alotus.core.convert.impl;

import java.util.concurrent.atomic.AtomicBoolean;

import cn.alotus.core.convert.AbstractConverter;
import cn.alotus.core.util.BooleanUtil;

/**
 * {@link AtomicBoolean}转换器
 *
 * @author alotuser
 * @since 3.0.8
 */
public class AtomicBooleanConverter extends AbstractConverter<AtomicBoolean> {
	private static final long serialVersionUID = 1L;

	@Override
	protected AtomicBoolean convertInternal(Object value) {
		if (value instanceof Boolean) {
			return new AtomicBoolean((Boolean) value);
		}
		final String valueStr = convertToStr(value);
		return new AtomicBoolean(BooleanUtil.toBoolean(valueStr));
	}

}
