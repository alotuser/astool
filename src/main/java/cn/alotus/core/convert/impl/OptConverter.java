package cn.alotus.core.convert.impl;

import cn.alotus.core.convert.AbstractConverter;
import cn.alotus.core.lang.Opt;

/**
 *
 * {@link Opt}对象转换器
 *
 * @author alotuser
 * @since 5.7.16
 */
public class OptConverter extends AbstractConverter<Opt<?>> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Opt<?> convertInternal(Object value) {
		return Opt.ofNullable(value);
	}

}
