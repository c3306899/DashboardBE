package uni.castleone.service;

import org.springframework.stereotype.Component;
import uni.castleone.dto.PrimesTrackingMessage;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrimesService {

    List<PrimesTrackingMessage> primesAnswers = new ArrayList<>();

    public List<PrimesTrackingMessage> findAll() {
        return primesAnswers;
    }

    public Integer saveMessage(PrimesTrackingMessage primesTrackingMessage) {
        primesAnswers.add(primesTrackingMessage);
        return primesAnswers.size();
    }
}
