package uk.co.rdavisitservices.world;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

@Component
public class MyFilter implements Filter {

  @Override
  public void doFilter(ServletRequest req, ServletResponse res,
		  FilterChain chain) throws IOException, ServletException {
	  // mimic for network latency
	  // add a delay parameter to your request in seconds
	  // does not pull the parameter from the map though
	  String delayStr = req.getParameter("delay");
	  if (delayStr != null){
		  delaySeconds(Integer.parseInt(delayStr));
	  }
	  chain.doFilter(req, res);
  }

  private void delaySeconds(int secs){
	  try{
		  Thread.sleep(secs * 1000);
		}catch(InterruptedException ex){
		  //do nothing
		}
	  
  }
  @Override
  public void destroy() {}

  @Override
  public void init(FilterConfig arg0) throws ServletException {}

}
