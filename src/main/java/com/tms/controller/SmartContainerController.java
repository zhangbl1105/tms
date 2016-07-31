/**
 * 
 */
package com.tms.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The definition of SmartContainer REST API
 * 
 * @author zhangbl1105@163.com
 * 
 */
@RestController
@RequestMapping("/container")
public class SmartContainerController {

	private static final String template = "Bind %s to %s";
    private final AtomicLong counter = new AtomicLong();
	/**
	 * Constructor 
	 */
	public SmartContainerController() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Add a new SmartContainer into the system.
	 * 
	 * POST /container { JSON payload }
	 *      
	 * @param scInfo The payload information
	 * 
	 * @return Success/Failed
	 */
	@PostMapping(value= "/", consumes = "application/json")
    public String Add(@RequestBody SmartContainer scInfo) {

        return "Add new SmartContainer into System";
    }

	/**
	 * Remove the SmartContainer from the system
	 *      
	 * DELETE /container/{containerId}
	 * 
	 * @return Success/Failed
	 */
	@DeleteMapping(value= "/{containerId}")
    public String Remove(@PathVariable("containerId") String containerId) {
		
        return "remove the SmartContainer from system";
    }
	
	/**
	 * Query the basic information from system
	 *      
	 * GET /container?cid=xxxx
	 * GET /container?uid=xxxx
	 * GET /container?ugid=xxxx
	 * 
	 * @return { JSON payload }
	 */
	@GetMapping(value= "/")
    public ResponseEntity<String> Get() {
        // return "Get the information of one device";
        
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("MyResponseHeader", "MyValue");
        return new ResponseEntity<String>("Get", responseHeaders, HttpStatus.RESET_CONTENT);
    }

	/**
	 * Bind the SmartContainer with user/group
	 * 
	 * POST  /container/bind?cid=xxxx
	 *       /container/bind?cid=xxxx&&ugid=xxxx
	 *      
	 * @param containerId The Id of the Smart Container
	 * @param userGroupId The user group id which need to be bind to.
	 * 
	 * @return Success/Failed
	 */
	@RequestMapping(value= "/bind", method=RequestMethod.POST)
    public Greeting Bind(@RequestParam(value="cid", defaultValue="") String containerId,
    				     @RequestParam(value="ugid", defaultValue="") String userGroupId) {

        return new Greeting(counter.incrementAndGet(),
                            String.format(template, containerId, userGroupId));
    }

	/**
	 * Unbind the SmartContainer from user/group
	 *      
	 * DELETE    /container/bind?cid=xxxx
	 *           /container/bind?cid=xxxx&&gid=xxxx
	 * 
	 * @return Success/Failed
	 */
	@RequestMapping(value= "/unbind", method=RequestMethod.DELETE)
    public String UnBind(@RequestParam(value="cid", defaultValue="") String containerId,
		                  @RequestParam(value="ugid", defaultValue="") String userGroupId) {
        return "Unbind " + containerId + " from " + "userGroupId";
    }
	
}
