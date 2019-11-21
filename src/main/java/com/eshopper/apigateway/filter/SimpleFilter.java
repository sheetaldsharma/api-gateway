package com.eshopper.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class SimpleFilter extends ZuulFilter {


    @Override
    public String filterType() {
        System.out.println("-----------------> in filterType");
        return "Pre";
    }

    @Override
    public int filterOrder() {
        System.out.println("-----------------> in filterOrder");
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("-----------------> in shouldFilter");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("-----------------> in run");
        return null;
    }
}
