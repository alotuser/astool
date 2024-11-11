package cn.alotus.core.lang.intern;

import java.lang.ref.WeakReference;

import cn.alotus.core.map.WeakConcurrentMap;

/**
 * 使用WeakHashMap(线程安全)存储对象的规范化对象，注意此对象需单例使用！<br>
 *
 * @author alotuser
 * @since 5.4.3
 */
public class WeakInterner<T> implements Interner<T>{

	private final WeakConcurrentMap<T, WeakReference<T>> cache = new WeakConcurrentMap<>();

	public T intern(T sample) {
		if (sample == null) {
			return null;
		}
		T val;
		do {
			val = this.cache.computeIfAbsent(sample, WeakReference::new).get();
		} while (val == null);
		return val;
	}
}
