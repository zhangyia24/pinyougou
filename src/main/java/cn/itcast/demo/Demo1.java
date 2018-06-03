package cn.itcast.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class Demo1 {
	public static void main(String[] args) {
		try {
			// 1配置文件
			ClientGlobal.init("E:/demoo/worespace2018-pinyougou/fastDFSdemo/src/main/resources/fdfs_client.conf");

			// 2tranker客户端
			TrackerClient client = new TrackerClient();
			// 3 服务端
			TrackerServer connection = client.getConnection();
			// 4创建存储服务端为null
			StorageServer storageServer = null;
			// 5获取连接的客户端
			StorageClient storageClient = new StorageClient(connection, storageServer);
			// 6上传对象
			String[] strings = storageClient.upload_file("E:/MM.jpg", "jpg",null);
			
				
			
			
			// 7返回数组
			for (String string : strings) {
				System.out.println(string);
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
