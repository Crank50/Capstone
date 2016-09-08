package capstoneWabedi.controllers;

import capstoneWabedi.entities.User;
import capstoneWabedi.entities.UserDao;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Justin on 9/1/16.
 */
@Controller
@RequestMapping(value="/user")
public class UserController {

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        Assert.notNull(userDao, "UserDao must not be null!");
        this.userDao = userDao;
    }

    @RequestMapping(value ="/createAccount")
    public String crtAcnnt(ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        return "/Users/createAccount";}




    @RequestMapping(value="/saveNewUser")
    public String saveNewUser( User user) {
        userDao.save(user);

//        if (!NewUserFile.isEmpty()) {
//            try {
//                Files.write(Paths.get("/Users/Justin/UPLOADS_Capstone_Users/"+NewUserFile.getOriginalFilename()),NewUserFile.getBytes());
//                System.out.println("-------- File Upload Successful");
//                addUploadToDatabase("/Users/Justin/UPLOADS_Capstone_Users/"+NewUserFile.getOriginalFilename());
//            } catch (IOException | RuntimeException e) {
//                e.printStackTrace();
//            }
//        } else {
//            System.out.println("-------- File Is EMPTY!");
//        }
        return "/Users/userCreation";
    }
//    private void addUploadToDatabase(String filePath) {
//        try {
//            Path newUserUploadedFilePath = Paths.get(filePath);
//            ObjectMapper mapper = new ObjectMapper();
//            List<User> uploadedNewUsers = mapper.readValue(Files.newInputStream(newUserUploadedFilePath), new TypeReference<List<User>>(){});
//            for(User uploadedUsers : uploadedNewUsers) {
//                User user = new User();
//                user.setName(uploadedUsers.getName());
//                user.setCity(uploadedUsers.getCity());
//                user.setStates(uploadedUsers.getStates());
//                user.setZip(uploadedUsers.getZip());
//                user.setEmail(uploadedUsers.getEmail());
//                user.setPhone(uploadedUsers.getPhone());
//                user.setSsn(uploadedUsers.getSsn());
//                user.setAdmin(uploadedUsers.getAdmin());
//                userDao.save(user);
//            }
//        } catch (IOException ioe) {
//            System.out.println("Issue reading List from JSON file");
//            ioe.printStackTrace();
//        }
//    }
}
