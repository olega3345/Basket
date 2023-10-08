package com.skypro.spring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@SessionScope
public class Basket {

    public Map<Integer, Integer> countById = new HashMap<>();

    public List<Integer> add(List<Integer> ids) {
        for (Integer i : ids) {
            if (countById.containsKey(i)) {
                countById.put(i, countById.get(i) + 1);
            } else {
                countById.put(i, 1);
            }
        }
        return ids;
    }

    public Map<Integer, Integer> get() {
        return countById;
    }
}