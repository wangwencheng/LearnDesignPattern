package com.wc.learn.design.chain.service;

public interface Filter {
    void excute(ModelRequest request, FilterChain filterChain);
}
