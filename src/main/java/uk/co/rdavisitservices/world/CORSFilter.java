package uk.co.rdavisitservices.world;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class CORSFilter implements Filter {

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
	  
	  // add CORS support as embedded Tomcat does not provide it
	  // CORS enabled browsers will not allow access without this block
	  HttpServletRequest request = (HttpServletRequest) req;
	  HttpServletResponse response = (HttpServletResponse) res;

	  response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
	  response.setHeader("Access-Control-Allow-Credentials", "true");
	  response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
	  response.setHeader("Access-Control-Max-Age", "3600");
	  response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");
	  // End of CORS
	  
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
