package ie.atu.week3.week3_lab;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class AcknowledgeService {
    public String askMessage(UserDetails user)
    {
        String message = "Thank you" + user.getName() + "your request has been recieved";
                return message;
    }
}
