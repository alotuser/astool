package cn.alotus.core.convert.impl;

import java.util.Currency;

import cn.alotus.core.convert.AbstractConverter;

/**
 * 货币{@link Currency} 转换器
 *
 * @author alotuser
 * @since 3.0.8
 */
public class CurrencyConverter extends AbstractConverter<Currency> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Currency convertInternal(Object value) {
		return Currency.getInstance(convertToStr(value));
	}

}
