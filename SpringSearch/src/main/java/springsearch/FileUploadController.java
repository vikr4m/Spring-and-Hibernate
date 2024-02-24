package springsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller

public class FileUploadController {
	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}

	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model m) {
		System.out.println("file upload handler");
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		System.out.println(file.getOriginalFilename());
		byte[] data = file.getBytes();

		// saving file to server
		String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator
				+ "image" + File.separator + file.getOriginalFilename();
		System.out.println(path);
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("file uploaded");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Uploading Error");
			m.addAttribute("msg","Uploading Error");
		}
		m.addAttribute("msg","Uploaded Successfully");
		m.addAttribute("filename", file.getOriginalFilename());
		
		return "filesuccess";
	}
}
