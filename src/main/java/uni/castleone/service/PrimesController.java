package uni.castleone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uni.castleone.dto.PrimesTrackingMessage;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
class PrimesController implements IPrimesApiService {

    @Autowired
    private PrimesService service;

    @Override
    public List<PrimesTrackingMessage> findAll() {
        return service.findAll();
    }

    @Override
    public Integer save(@RequestBody PrimesTrackingMessage primesTrackingMessage) {
        return service.saveMessage(primesTrackingMessage);
    }

}