package servlets;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;


public class MyFilter implements Filter{
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       System.out.println("Before Filter");
       //....Pre processing
       //
       chain.doFilter(request, response);
       System.out.println("After servlet");
       //....Post processing
       //
    }

    @Override
    public void destroy() {
    }
    
}
