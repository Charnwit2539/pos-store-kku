package pos.store.pos;

import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.var;


@RestController
public class EmailController {

    @Autowired
    private JavaMailSender javaMailSender;
    
    @CrossOrigin
    @PostMapping("/sendEmail")
    public ResponseEntity<Map<String,String>> sendEmail(@RequestBody EmailForm from) throws Exception{

        var message = javaMailSender.createMimeMessage();
        message.setFrom(new InternetAddress("charn2539charn@gmail.com", "ร้านคาเฟ่"));
        
        var helper = new MimeMessageHelper(message, true, "UTF-8");
        helper.setTo(from.getSendTo());
        helper.setSubject("ใบเสร็จร้านคาเฟ่"); 
        helper.setText(from.getContent(), true);

        javaMailSender.send(message);

        var map = new HashMap<String,String>();
        map.put("sendTo", from.getSendTo());
        map.put("content",from.getContent());

        return new ResponseEntity<Map<String,String>>(map , HttpStatus.OK);
    }
}


