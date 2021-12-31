package com.example.mytoggles.togglz;

import static com.example.mytoggles.togglz.Features.FEE;
import static com.example.mytoggles.togglz.Features.FOO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.togglz.core.manager.FeatureManager;

@Controller
@Slf4j
@RequiredArgsConstructor
public class TogglzController {

    private final FeatureManager featureManager;

    @RequestMapping("/togglz-test")
    public ResponseEntity<?> index() {
        if (featureManager.isActive(FOO)) {
            log.info("FOO is enabled!");
        }
        if (featureManager.isActive(FEE)) {
            log.info("FEE is enabled!");
        }
        return null;
    }
}
