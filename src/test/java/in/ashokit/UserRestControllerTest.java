package in.ashokit;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import in.ashokit.rest.UserRestController;

@WebMvcTest(UserRestController.class)
public class UserRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetName_Raju() throws Exception {
        mockMvc.perform(get("/user/{userId}", 100))
                .andExpect(status().isOk())
                .andExpect(content().string("raju"));
    }

    @Test
    public void testGetName_Rani() throws Exception {
        mockMvc.perform(get("/user/{userId}", 101))
                .andExpect(status().isOk())
                .andExpect(content().string("rani"));
    }

    @Test
    public void testGetName_UserNotFound() throws Exception {
        mockMvc.perform(get("/user/{userId}", 102))
                .andExpect(status().isOk())
                .andExpect(content().string("User not found"));
    }
}
