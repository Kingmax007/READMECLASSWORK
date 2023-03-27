package classwork.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

public class NameController {

        @GetMapping("/homework2")
        public Map<String, String> getName(@RequestBody Map<String, String> request) {
            String firstName = request.get("firstName").trim();
            String lastName = request.get("lastName").trim();

            String fullName = firstName + " " + lastName;

            Map<String, String> response = new HashMap<>();
            response.put("fullName", fullName);
            return response;
        }
    }





