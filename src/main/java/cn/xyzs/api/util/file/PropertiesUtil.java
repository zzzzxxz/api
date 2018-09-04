package cn.xyzs.api.util.file;

import java.io.InputStream;
import java.util.Properties;

/**
 * config.properties 配置文件读取
 * @author zhouu
 */
public class PropertiesUtil {
	static Properties ps = null;

	static {
		// 生成文件输入流
		InputStream inpf = null;
		try {
			inpf = PropertiesUtil.class.getClassLoader().getResourceAsStream("config.properties");
			ps = new Properties();
			ps.load(inpf);
			inpf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 通过Key读取值
	 * @param key
	 * @return
	 */
	public static String getSourcingValueBykey(String key){
		String value="";
		try{
			value = ps.getProperty(key);
			if(value == null || value.equals("")){
				System.out.println("The value for key: " +  key + " doesn't exist.");
				System.out.println("Please check the content of the properties file.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
}
