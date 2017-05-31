package path.to;

import java.util.Map;
//public interface IMultKeyCache<K1, K2, V> extends ICache<K1, V>
public interface IMultKeyCache<K1, K2, V> extends Map<K1, V>
{
    V remove(K1 key1, K2 key2);
}
