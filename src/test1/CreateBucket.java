package test1;

import com.aliyun.oss.OSSClient;

public class CreateBucket {

	// ����bucket
	public void create_bucket(String bucketName, String endpoint,
			String accessKeyId, String accessKeySecret) {

		// ��ʼ��һ��OSSClient
		OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		// �½�һ��Bucket
		client.createBucket(bucketName);
	}

}
