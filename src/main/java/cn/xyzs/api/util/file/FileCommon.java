package cn.xyzs.api.util.file;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
/**
 * 通用文件上传下载
 * @author zhouu
 *
 */
public class FileCommon {

	/**
	 * 单文件上传
	 * @param request
	 * @param fileInfo 文件相对路径+名称
	 * @return Map<"名称","路径">
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public static Map<String,Object> uploadFile(HttpServletRequest request,String fileInfo) throws IllegalStateException, IOException {
		Map<String, Object> map = new HashMap<String, Object>();
		fileInfo = fileInfo.trim();
		//解析获取文件名和文件路径
		String fileName = fileInfo.substring(fileInfo.lastIndexOf("/")+1);
		String filePath = fileInfo.substring(0,fileInfo.lastIndexOf("/"));
 		//将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）  
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(  
				request.getSession().getServletContext()); 
		//检查form中是否有enctype="multipart/form-data"  
		if(multipartResolver.isMultipart(request)) {  
			//将request变成多部分request  
			MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;  
			//获取multiRequest 中所有的文件名  
			Iterator iter=multiRequest.getFileNames();  
			while(iter.hasNext()) {  
				//一次遍历所有文件  
				MultipartFile file=multiRequest.getFile(iter.next().toString());  
				if(file!=null) {
					File newFile = new File(PropertiesUtil.getSourcingValueBykey("fileUpdate").trim(),filePath);
					if(!newFile.exists()) {
						newFile.mkdirs();
					}
					newFile = new File(newFile, fileName);
					//上传  
					file.transferTo(newFile); 
					map.put(newFile.getName(), PropertiesUtil.getSourcingValueBykey("fileServer").trim()+fileInfo);
				}  
			} 
		}  
		return map;  
	}
}
