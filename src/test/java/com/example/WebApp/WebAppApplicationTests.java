package com.example.WebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/"))
		.andDo(print()).andExpect(status().isOk())
		.andExpect(content()
				.string(containsString("Hello, World!")));
		
	}
	
	@Test
	public void shouldReturnPersonalMessage() throws Exception {
		this.mockMvc.perform(get("/lana"))
		.andDo(print()).andExpect(status().isOk())
		.andExpect(content()
				.string(containsString("Hello, Lana!")));
		
	}
	
	@Test
	public void shouldReturnNewPage() throws Exception {
		this.mockMvc.perform(get("/new"))
		.andDo(print()).andExpect(status().isOk())
		.andExpect(content()
				.string(containsString("Hello, Welcome to this new page!")));
		
	}
	
	@Test
	public void shouldReturnCopyPage() throws Exception {
		this.mockMvc.perform(get("/copy"))
		.andDo(print()).andExpect(status().isOk())
		.andExpect(content()
				.string(containsString("Hello, this is the change in the copy page")));
		
	}
	
	@Test
	public void shouldReturnOriginalPage() throws Exception {
		this.mockMvc.perform(get("/original"))
		.andDo(print()).andExpect(status().isOk())
		.andExpect(content()
				.string(containsString("Hello, This is the change I made in the original project!")));
		
	}
	
	
	@Test
	public void shouldReturnMain() throws Exception {
		this.mockMvc.perform(get("/main"))
		.andDo(print()).andExpect(status().isOk())
		.andExpect(content()
				.string(containsString("Hello, Main!")));
	}
	
	@Test
	public void shouldReturnGreetingAlana() throws Exception {
		this.mockMvc.perform(get("/alana"))
		.andDo(print()).andExpect(status().isOk())
		.andExpect(content()
				.string(containsString("Hello, Alana!?!?")));
		
	}
	
	@Test
	public void shouldReturnHotfix() throws Exception {
		this.mockMvc.perform(get("/hotfix"))
		.andDo(print()).andExpect(status().isOk())
		.andExpect(content()
				.string(containsString("Hotfix")));
		
	}
	

}
