package com.wc.learn.design.chain.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wc.learn.design.chain.service.Filter;
import com.wc.learn.design.chain.service.FilterChain;
import com.wc.learn.design.chain.service.ModelRequest;

public class Rule1 implements Filter {
    @Override
    public void excute(ModelRequest request, FilterChain filterChain) {
        request.setName("规则1");
        System.out.println(request);
        filterChain.doFilter(request, filterChain);
    }
}
