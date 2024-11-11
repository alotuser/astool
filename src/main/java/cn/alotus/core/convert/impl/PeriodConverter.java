package cn.alotus.core.convert.impl;

import java.time.Period;
import java.time.temporal.TemporalAmount;

import cn.alotus.core.convert.AbstractConverter;

/**
 *
 * {@link Period}对象转换器
 *
 * @author alotuser
 * @since 5.0.0
 */
public class PeriodConverter extends AbstractConverter<Period> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Period convertInternal(Object value) {
		if(value instanceof TemporalAmount){
			return Period.from((TemporalAmount) value);
		}else if(value instanceof Integer){
			return Period.ofDays((Integer) value);
		} else {
			return Period.parse(convertToStr(value));
		}
	}

}
