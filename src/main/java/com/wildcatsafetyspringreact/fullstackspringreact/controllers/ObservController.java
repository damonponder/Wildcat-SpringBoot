package com.wildcatsafetyspringreact.fullstackspringreact.controllers;

import com.wildcatsafetyspringreact.fullstackspringreact.models.ERole;
import com.wildcatsafetyspringreact.fullstackspringreact.models.Observable;
import com.wildcatsafetyspringreact.fullstackspringreact.models.Role;
import com.wildcatsafetyspringreact.fullstackspringreact.models.User;
import com.wildcatsafetyspringreact.fullstackspringreact.payload.request.LoginRequest;
import com.wildcatsafetyspringreact.fullstackspringreact.payload.request.ObservableRequest;
import com.wildcatsafetyspringreact.fullstackspringreact.payload.request.SignupRequest;
import com.wildcatsafetyspringreact.fullstackspringreact.payload.response.JwtResponse;
import com.wildcatsafetyspringreact.fullstackspringreact.payload.response.MessageResponse;
import com.wildcatsafetyspringreact.fullstackspringreact.repository.ObservableRepository;
import com.wildcatsafetyspringreact.fullstackspringreact.repository.RoleRepository;
import com.wildcatsafetyspringreact.fullstackspringreact.repository.UserRepository;
import com.wildcatsafetyspringreact.fullstackspringreact.security.jwt.JwtUtils;
import com.wildcatsafetyspringreact.fullstackspringreact.security.services.UserDetailsImpl;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class ObservController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    ObservableRepository observableRepository;

    @Autowired
    RoleRepository roleRepository;


    // 1. array -> new String[] --nixed
    // 2. ArrayList -> new ArrayList() --good, but not exactly what we're using
    // 3. List -> List<String>
    // @TODO - put back @Valid for bean validation
    @PostMapping("/observables")
    public ResponseEntity<?> observableInfo(@RequestBody ObservableRequest observableRequest) {
        Observable observable = new Observable(
                observableRequest.getSubmittedBy(),
                observableRequest.getLocationOrArea(),
                observableRequest.getObservationDate(),
                observableRequest.getDepartment(),
                observableRequest.getResponsibleSupervisor(),
                observableRequest.getCategoryType(),
                observableRequest.getBodyPositionCategories(),
                observableRequest.getEnvironmentalConditions(),
                observableRequest.getHealthCategories(),
                observableRequest.getToolsAndEquipmentCategories(),
                observableRequest.getProcedureAndStandardsCategories(),
                observableRequest.getQualityRelatedCategories(),
                observableRequest.getUseofPPECategories(),
                observableRequest.getWorkingConditionsCategories()
        );

        observableRepository.save(observable);

        return ResponseEntity.ok(new MessageResponse("User form submitted successfully!"));
    }
}
