package test1;

import com.aliyun.oss.OSSClient;

public class CreateBucket {

	// 创建bucket
	public void create_bucket(String bucketName, String endpoint,
			String accessKeyId, String accessKeySecret) {

		// 初始化一个OSSClient
		OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		// 新建一个Bucket
		client.createBucket(bucketName);
	}

}
