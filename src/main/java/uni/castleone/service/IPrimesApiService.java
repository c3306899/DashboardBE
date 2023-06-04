package uni.castleone.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import uni.castleone.dto.PrimesTrackingMessage;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
public interface IPrimesApiService {

    @GetMapping("/findAll")
    List<PrimesTrackingMessage> findAll();

    @PostMapping("/save")
    Integer save(@RequestBody PrimesTrackingMessage primesTrackingMessage);
}
