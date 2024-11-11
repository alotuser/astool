package cn.alotus.core.lang.generator;

import cn.alotus.core.lang.ObjectId;

/**
 * ObjectId生成器
 *
 * @author alotuser
 * @since 5.4.3
 */
public class ObjectIdGenerator implements Generator<String> {
	@Override
	public String next() {
		return ObjectId.next();
	}
}
