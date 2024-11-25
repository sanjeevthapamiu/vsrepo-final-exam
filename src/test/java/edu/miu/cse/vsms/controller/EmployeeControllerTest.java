package edu.miu.cse.vsms.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.miu.cse.vsms.dto.request.EmployeeRequestDto;
import edu.miu.cse.vsms.dto.response.EmployeeResponseDto;
import edu.miu.cse.vsms.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

//     @MockBean // Deprecated
    @MockitoBean
    private EmployeeService employeeService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void addEmployee() throws Exception {
        EmployeeRequestDto employeeRequestDto = new EmployeeRequestDto("John Doe", "john.doe@example.com", "1234567890", LocalDate.of(2024, 1, 10));
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto(1L, "John Doe", "john.doe@example.com", "1234567890", LocalDate.of(2024, 1, 10), List.of());

        Mockito.when(employeeService.addEmployee(employeeRequestDto)).thenReturn(employeeResponseDto);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(employeeResponseDto))
        )
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(employeeResponseDto)))
                .andDo(MockMvcResultHandlers.print());
    }
}