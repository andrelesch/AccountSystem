package za.ac.nwu.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.domain.dto.Discovery_Account_Dto;
import za.ac.nwu.domain.service.GeneralResponse;

import za.ac.nwu.logic.flow.FetchDiscovery_AccountFlow;
import java.util.List;

@RestController
@RequestMapping("Discovery-Account") //This is a specified URL
public class Discovery_AccountController {

    private final FetchDiscovery_AccountFlow fetchDiscovery_AccountFlow;

    @Autowired
    public Discovery_AccountController(FetchDiscovery_AccountFlow fetchDiscovery_AccountFlow) {
        this.fetchDiscovery_AccountFlow = fetchDiscovery_AccountFlow;
    }
    @GetMapping("/all")
    @ApiOperation(value = "gets all the configured Account types.", notes = "Returns a list of account types")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)
    })

    public ResponseEntity<GeneralResponse<List<Discovery_Account_Dto>>> getAll() {
        List<Discovery_Account_Dto> discovery_Account = fetchDiscovery_AccountFlow.getAllDiscovery_Account();
        GeneralResponse<List<Discovery_Account_Dto>> response = new GeneralResponse<>(true, discovery_Account);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
