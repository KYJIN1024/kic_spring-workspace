package controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class ConfigController {
	
	@RequestMapping( "/form.do" )
	public String form(HttpServletRequest request, HttpServletResponse resoponse, Model model) {
		
		return "form";
	}
	@RequestMapping( "/form_ok.do" )
	public String write(@RequestParam("upload") MultipartFile multipartFile ) {
		String uploadPath = "D:/JAVA/kic_spring workspace/upload02/src/main/webapp";
		
		System.out.println("파일명 :" + multipartFile.getName());
		System.out.println("파일명 :" + multipartFile.getOriginalFilename());
		System.out.println("사이즈 :" + multipartFile.getSize());
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream( uploadPath + "/" + multipartFile.getOriginalFilename() );
			fos.write(multipartFile.getBytes() );
		} catch (FileNotFoundException e) {
			System.out.println("[에러]" + e.getMessage());
			
		} catch (IOException e) {
			System.out.println("[에러]" + e.getMessage());
			
		} finally {
			if( fos != null) try { fos.close(); } catch( IOException e ) {}
		}
		
		
		return "form_ok";
	}
	
	@RequestMapping( "/form_ok2.do" )
	public String write( MultipartFile upload ) {
		
		String uploadPath = "D:/JAVA/kic_spring workspace/upload02/src/main/webapp/upload";
		
		System.out.println("파일명 :" + multipartFile.getName());
		System.out.println("파일명 :" + multipartFile.getOriginalFilename());
		System.out.println("사이즈 :" + multipartFile.getSize());
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream( uploadPath + "/" + multipartFile.getOriginalFilename() );
			fos.write(multipartFile.getBytes() );
		} catch (FileNotFoundException e) {
			System.out.println("[에러]" + e.getMessage());
			
		} catch (IOException e) {
			System.out.println("[에러]" + e.getMessage());
			
		} finally {
			if( fos != null) try { fos.close(); } catch( IOException e ) {}
		}
		
		
		return "form_ok";
	}
}