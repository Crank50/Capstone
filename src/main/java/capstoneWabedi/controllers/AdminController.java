package capstoneWabedi.controllers;

import capstoneWabedi.entities.User;
import capstoneWabedi.entities.UserDao;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.apache.tomcat.util.http.fileupload.FileUploadBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Justin on 9/1/16.
 */
@Controller
@RequestMapping(value="/admin")
public class AdminController {

    private final UserDao userDao;

    @Autowired
    public AdminController(UserDao userDao) {
        Assert.notNull(userDao, "UserDao must not be null!");
        this.userDao = userDao;
    }

    @RequestMapping(value = "/")
    public String allUsers(ModelMap modelMap){
        Iterable<User> users = userDao.findAll();
        modelMap.addAttribute("users", users);
        return "Users/adminPage";
    }
    @RequestMapping(value = "/uploadBills")
    public String uploadBills(){
        return "Users/addBills";
    }


    @RequestMapping(value = "/saveUploadedBills")
    public String saveUploadedBills(MultipartFile BillsFile){
        String returnView = "";
        if (!BillsFile.isEmpty()) {
            try {
                Files.write(Paths.get("/Users/Justin/UPLOADS_Bills/"+BillsFile.getOriginalFilename()),BillsFile.getBytes());
                System.out.println("-------- File Upload Successful");
//                addUploadToDatabase("/Users/Justin/UPLOADS_Bills/"+BillsFile.getOriginalFilename());
            } catch (IOException | RuntimeException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("-------- File Is EMPTY!");
        }
        return "Users/adminPage";
    }


}

