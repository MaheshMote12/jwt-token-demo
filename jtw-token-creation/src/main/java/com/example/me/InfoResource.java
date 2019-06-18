package com.example.me;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoResource {

	@GetMapping("/api/hello")
	public ResponseEntity<Resource> getUserName(HttpServletRequest request) {
		
		Resource resurc = new Resource();
		resurc.setName(request.getAttribute("name").toString());
		resurc.setSchema(request.getAttribute("schema").toString());
		return ResponseEntity.ok(resurc);
	}
	
	public class Resource{
		private String name;
		private String schema;
		public String getName() { 
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSchema() {
			return schema;
		}
		public void setSchema(String schema) {
			this.schema = schema;
		}
		
		
	}
}
