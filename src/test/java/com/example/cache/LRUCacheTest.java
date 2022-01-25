package com.example.cache;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class LRUCacheTest {

    @Test
    void remove() {
        // given
        Map<Integer, Integer> lru = new LRUCache<>(2);

        // when
        lru.put(1, 1);
        lru.put(2, 2);
        lru.put(3, 3);

        // then
        assertAll(
                () -> assertThat(lru.size()).isEqualTo(2),
                () -> assertThat(lru.containsKey(1)).isFalse(),
                () ->assertThat(lru.get(1)).isNull()
        );
    }
}
