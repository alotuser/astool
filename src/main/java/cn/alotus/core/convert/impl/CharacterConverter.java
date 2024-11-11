package cn.alotus.core.convert.impl;

import cn.alotus.core.convert.AbstractConverter;
import cn.alotus.core.util.BooleanUtil;
import cn.alotus.core.util.StrUtil;

/**
 * 字符转换器
 *
 * @author alotuser
 *
 */
public class CharacterConverter extends AbstractConverter<Character> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Character convertInternal(Object value) {
		if (value instanceof Boolean) {
			return BooleanUtil.toCharacter((Boolean) value);
		} else {
			final String valueStr = convertToStr(value);
			if (StrUtil.isNotBlank(valueStr)) {
				return valueStr.charAt(0);
			}
		}
		return null;
	}

}
