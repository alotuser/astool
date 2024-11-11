package cn.alotus.core.convert.impl;

import java.util.TimeZone;

import cn.alotus.core.convert.AbstractConverter;

/**
 * TimeZone转换器
 * @author alotuser
 *
 */
public class TimeZoneConverter extends AbstractConverter<TimeZone>{
	private static final long serialVersionUID = 1L;

	@Override
	protected TimeZone convertInternal(Object value) {
		return TimeZone.getTimeZone(convertToStr(value));
	}

}
