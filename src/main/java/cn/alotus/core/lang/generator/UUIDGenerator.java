package cn.alotus.core.lang.generator;

import cn.alotus.core.util.IdUtil;

/**
 * UUID生成器
 *
 * @author alotuser
 * @since 5.4.3
 */
public class UUIDGenerator implements Generator<String> {
	@Override
	public String next() {
		return IdUtil.fastUUID();
	}
}
