package cn.alotus.core.convert.impl;

import java.nio.charset.Charset;

import cn.alotus.core.convert.AbstractConverter;
import cn.alotus.core.util.CharsetUtil;

/**
 * 编码对象转换器
 * @author alotuser
 *
 */
public class CharsetConverter extends AbstractConverter<Charset>{
	private static final long serialVersionUID = 1L;

	@Override
	protected Charset convertInternal(Object value) {
		return CharsetUtil.charset(convertToStr(value));
	}

}
