package com.example.mytoggles.togglz;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.togglz.core.manager.FeatureManager;

@Controller
@RequiredArgsConstructor
public class TogglzController {

    private final FeatureManager manager;

    @RequestMapping("/")
    public ResponseEntity<?> index() {
        if (manager.isActive(HELLO_WORLD)) {

        }
    }
}
