package com.wc.learn.design.chain.service;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    List<Filter> filters = new ArrayList<>();
    private Integer index = 0;


    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public FilterChain addFilters(List<Filter> filters) {
        this.filters.addAll(filters);
        return this;
    }

    public void doFilter(ModelRequest request, FilterChain filterChain) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.excute(request, filterChain);
    }
}
