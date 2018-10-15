package test1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class GUI extends JFrame {

	protected static final int CENTER = 0;
	private static final String Dialog = null;

	public GUI() {

		super("完整性检测界面");

		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		CardLayout card = new CardLayout(20, 20);

		JPanel panel = new JPanel(card);

		JPanel p = new JPanel();

		JButton button_1 = new JButton("直接下载 ");
		JButton button_2 = new JButton("抽样检测");
		JButton button_3 = new JButton("经济模型");

		p.add(button_1);
		p.add(button_2);
		p.add(button_3);

		// 创建两个面板 Scheme1 , Scheme2
		JPanel Scheme1 = new JPanel();
		Scheme1.setBackground(new Color(249, 205, 173));

		JPanel Scheme2 = new JPanel();
		Scheme2.setBackground(new Color(200, 200, 169));

		JPanel Model = new JPanel();
		Model.setBackground(new Color(229, 187, 129));

		// 在面板 Scheme1 中 添加组件

		// accessKeyId
		// String accessKeyId = "51yHNPUqtgxSDqMl";

		// accessKeySecret
		// String accessKeySecret = "q7rqWdGyowtGfe6r990f5RBZxaUzL8";

		// 以深圳为例，通过外网访问
		// String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";

		// 设置标题
		JLabel ShowSchemeLabel = new JLabel(
				"             直接下载检测方案图形化操作界面               ", CENTER);
		ShowSchemeLabel.setFont(new Font(Dialog, 1, 20));
		ShowSchemeLabel.setForeground(Color.black);
		Scheme1.add(ShowSchemeLabel);

		// 创建"accessKeyId文本框”

		JLabel accessKeyIdjLabel = new JLabel(
				"请输入accessKeyId                  ", CENTER);
		accessKeyIdjLabel.setFont(new Font(Dialog, 1, 14));
		accessKeyIdjLabel.setForeground(Color.gray);
		Scheme1.add(accessKeyIdjLabel);

		JTextField accessKeyIdText = new JTextField(40);
		Scheme1.add(accessKeyIdText);
		accessKeyIdText.setText("51yHNPUqtgxSDqMl");

		// 创建"accessKeySecret文本框”

		JLabel accessKeySecretjLabel = new JLabel(
				"请输入accessKeySecret          ", CENTER);
		accessKeySecretjLabel.setFont(new Font(Dialog, 1, 14));
		accessKeySecretjLabel.setForeground(Color.gray);

		Scheme1.add(accessKeySecretjLabel);

		JTextField accessKeySecretText = new JTextField(40);
		Scheme1.add(accessKeySecretText);
		accessKeySecretText.setText("q7rqWdGyowtGfe6r990f5RBZxaUzL8");

		// 创建"endpoint"按钮，及其 “数值输出文本框”

		JLabel endpointjLabel = new JLabel(
				"请输入endpoint                        ", CENTER);
		endpointjLabel.setFont(new Font(Dialog, 1, 14));
		endpointjLabel.setForeground(Color.gray);

		Scheme1.add(endpointjLabel);

		JTextField endpointText = new JTextField(40);
		Scheme1.add(endpointText);
		endpointText.setText("http://oss-cn-shenzhen.aliyuncs.com");

		// 创建"选择Bucket"按钮，及其 “对应文本框”

		// JLabel InputButtonNamejLabel=new
		// JLabel("请输入上传或下载文件所在的Bucket的名字 ",CENTER);
		JLabel InputButtonNamejLabel = new JLabel("请输入文件所在的Bucket名字 ", CENTER);
		InputButtonNamejLabel.setFont(new Font(Dialog, 1, 14));
		InputButtonNamejLabel.setForeground(Color.gray);

		Scheme1.add(InputButtonNamejLabel);

		JTextField SeleteBucketText = new JTextField(40);
		Scheme1.add(SeleteBucketText);

		// 创建"输入云端下载文件"按钮，及其 “对应文本框”

		JLabel InputDownloadFileNamejLabel = new JLabel("请输入云端要下载文件的名字  ",
				CENTER);
		InputDownloadFileNamejLabel.setFont(new Font(Dialog, 1, 14));
		InputDownloadFileNamejLabel.setForeground(Color.gray);

		Scheme1.add(InputDownloadFileNamejLabel);

		JTextField DownloadFileNameSetText = new JTextField(40);
		Scheme1.add(DownloadFileNameSetText);

		// 创建 “HMD5密钥参数” 按钮，及其 “对应文本框”

		JLabel Input_SK_ParameterjLabel = new JLabel(
				"请输入HMD5密钥参数              ", CENTER);
		Input_SK_ParameterjLabel.setFont(new Font(Dialog, 1, 14));
		Input_SK_ParameterjLabel.setForeground(Color.gray);

		Scheme1.add(Input_SK_ParameterjLabel);

		JTextField HMD5_SK_Parameter_Text = new JTextField(40);
		Scheme1.add(HMD5_SK_Parameter_Text);

		// 创建 “HMD5比较文本框”

		JLabel Input_HMD5_ValuejLabel = new JLabel("请输入要比较的HMD5值          ",
				CENTER);
		Input_HMD5_ValuejLabel.setFont(new Font(Dialog, 1, 14));
		Input_HMD5_ValuejLabel.setForeground(Color.gray);

		Scheme1.add(Input_HMD5_ValuejLabel);

		JTextField HMD5_CompareValue_Text = new JTextField(40);

		Scheme1.add(HMD5_CompareValue_Text);
		
		// 创建 “MD5比较文本框”

				JLabel Input_MD5_ValuejLabel = new JLabel("请输入要比较的MD5值             ",
						CENTER);
				Input_MD5_ValuejLabel.setFont(new Font(Dialog, 1, 14));
				Input_MD5_ValuejLabel.setForeground(Color.gray);

				Scheme1.add(Input_MD5_ValuejLabel);

				JTextField MD5_CompareValue_Text = new JTextField(40);

				Scheme1.add(MD5_CompareValue_Text);


		// 创建"选择文件"按钮，及其 “数值输出文本框”

		JButton ChooseFileButton = new JButton("         文件选择           ");
		Scheme1.add(ChooseFileButton);

		JTextField ChooseFileShowText = new JTextField(40);
		Scheme1.add(ChooseFileShowText);

		// 为"上传文件选择" 按钮 "ChooseFileButton" 添加 监听
		ChooseFileButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int returnVal = chooser.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					// System.out.println("You chose to open this file: " +
					// chooser.getSelectedFile().getName());

					ChooseFileShowText.setText(chooser.getSelectedFile()
							.getPath());
					// String string=text1.getText();
					// System.out.println(string);
				}

			}
		});

		// 创建 “HMD5” 按钮，及其 “对应出文本框”

		JButton HMD5_Button = new JButton("       HMD5 值计算          ");
		Scheme1.add(HMD5_Button);

		JTextField HMD5_Text = new JTextField(40);
		Scheme1.add(HMD5_Text);

		// 为"HMD5"按钮 "HMD5_Button" 添加 监听

		HMD5_Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ChooseFileShowText.getText().equals("")
						|| HMD5_SK_Parameter_Text.getText().equals("")) {

					System.out.println("请选择要计算HMD5值的文件，并输入HMD5的密钥生成参数");

					JFrame frame1 = new JFrame("警告！");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("请选择要计算HMD5值的文件，并输入HMD5的密钥生成参数",
							CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}

				else {

					String s1;
					new Hmac_Compute();
					try {

						s1 = Hmac_Compute.HmacCompute(
								ChooseFileShowText.getText(),
								HMD5_SK_Parameter_Text.getText());
						HMD5_Text.setText(s1);

					} catch (InvalidKeyException | NoSuchAlgorithmException
							| IOException e1) {

						e1.printStackTrace();
					}
				}

			}
		});
		
		
		// 创建 “MD5” 按钮，及其 “对应出文本框”

				JButton MD5_Button = new JButton("        MD5 值计算          ");
				Scheme1.add(MD5_Button);

				JTextField MD5_Text = new JTextField(40);
				Scheme1.add(MD5_Text);

		// 为"MD5"按钮 "MD5_Button" 添加 监听

				MD5_Button.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						if (ChooseFileShowText.getText().equals("")) {

							System.out.println("请选择要计算MD5值的文件");

							JFrame frame1 = new JFrame("警告！");
							// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							JLabel j = new JLabel("请选择要计算MD5值的文件",CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 250, 120);
							frame1.setVisible(true);

						}

						else {

							String s1;
							new MD5_Compute();
							try {
                               
								File file=new File(ChooseFileShowText.getText());
								
								s1 = MD5_Compute.getFileMD5(file);
								MD5_Text.setText(s1);

							} catch (NoSuchAlgorithmException
									| IOException e1) {

								e1.printStackTrace();
							}
						}

					}
				});

		
		
		
		
		
		
		
		
		// 创建"创建Bucket"按钮，及其 “数值输入文本框”

		JButton CreateBucketButton = new JButton("   输入Bucket名字,并创建    ");
		Scheme1.add(CreateBucketButton);

		JTextField CreateBucketText = new JTextField(40);
		Scheme1.add(CreateBucketText);

		// 为"创建Bucket"按钮 "CreateBucketButton" 添加 监听

		CreateBucketButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (CreateBucketText.getText().equals("")
						|| endpointText.getText().equals("")
						|| accessKeyIdText.getText().equals("")
						|| accessKeySecretText.getText().equals("")) {

					System.out
							.println("请按要求输入要创建的Bucket的名字：Bucket 命名规范：1)只能包括小写字母，数字和短横线（-）；2)必须以小写字母或者数字开头；3)长度必须在 3-63 字节之间");

					JFrame frame1 = new JFrame("警告！");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("请按要求输入要创建的Bucket的名字", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);
				} else {

					new CreateBucket().create_bucket(
							CreateBucketText.getText(), endpointText.getText(),
							accessKeyIdText.getText(),
							accessKeySecretText.getText());

					JFrame frame1 = new JFrame("创建Bucket成功");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("创建Bucket成功", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}

			}
		});

		// 创建"下载文件路径选择"按钮，及其 “对应文本框”

		JButton DownloadFileDirectoryButton = new JButton(
				"       文件下载路径选择     ");
		Scheme1.add(DownloadFileDirectoryButton);

		JTextField DownloadFileDirectoryText = new JTextField(40);
		Scheme1.add(DownloadFileDirectoryText);

		DownloadFileDirectoryButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int returnVal = chooser.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {

					DownloadFileDirectoryText.setText(chooser.getSelectedFile()
							.getPath());
				}

			}
		});

		// 创建"上传文件"按钮，及其 “对应文本框”

		// JTextField UploadFileText=new JTextField(40);
		// Scheme1.add(UploadFileText);

		JButton UploadFileButton = new JButton(" 上传文件   ");
		Scheme1.add(UploadFileButton);

		// 为"上传文件"按钮 "UploadFileButton" 添加 监听

		UploadFileButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					if (SeleteBucketText.getText().equals("")
							|| ChooseFileShowText.getText().equals("")
							|| endpointText.getText().equals("")
							|| accessKeyIdText.getText().equals("")
							|| accessKeySecretText.getText().equals("")) {

						System.out.println("请选择要上传的文件，和 上传文件所在的Bucket的名字");

						JFrame frame1 = new JFrame("警告！");
						// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						JLabel j = new JLabel("请选择要上传的文件，和 上传文件所在的Bucket的名字",
								CENTER);
						frame1.add(j);
						frame1.setBounds(580, 280, 250, 120);
						frame1.setVisible(true);
					}

					else {

						// JOptionPane.showMessageDialog(null,"正在上传中..");

						OSS_Upload_File.putObject(SeleteBucketText.getText(),
								"", ChooseFileShowText.getText(),
								endpointText.getText(),
								accessKeyIdText.getText(),
								accessKeySecretText.getText());

						// JOptionPane.showMessageDialog(null,"上传文件成功！");

					}

				} catch (FileNotFoundException e1) {

					e1.printStackTrace();
				}

			}
		});

		// 创建"下载文件"按钮，及其 “对应文本框”

		// JTextField DownloadFileText=new JTextField(40);
		// Scheme1.add(DownloadFileText);

		JButton DownloadFileButton = new JButton(" 下载文件   ");
		Scheme1.add(DownloadFileButton);

		DownloadFileButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (SeleteBucketText.getText().equals("")
						|| DownloadFileNameSetText.getText().equals("")
						|| DownloadFileDirectoryText.getText().equals("")
						|| endpointText.getText().equals("")
						|| accessKeyIdText.getText().equals("")
						|| accessKeySecretText.getText().equals("")) {

					System.out
							.println("请输入要下载的文件所在的Bucket名字，要下载的文件的名字，文件下载到本地所在的路径 ");

					JFrame frame1 = new JFrame("警告！");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel(
							"请输入要下载的文件所在的Bucket名字，要下载的文件的名字，文件下载到本地所在的路径",
							CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}

				else {

					new OSS_Download_File();
					try {

						OSS_Download_File.getObjectRequest(
								SeleteBucketText.getText(),
								DownloadFileNameSetText.getText(),
								DownloadFileDirectoryText.getText(),
								endpointText.getText(),
								accessKeyIdText.getText(),
								accessKeySecretText.getText());

					} catch (IOException e1) {

						e1.printStackTrace();
					}

				}

			}
		});

		// 创建 “HMD5比较按钮”

		// JTextField HMD5_Compare_Text=new JTextField(40);
		// Scheme1.add(HMD5_Compare_Text);

		JButton HMD5_Compare_Button = new JButton("比较HMD5值  ");
		Scheme1.add(HMD5_Compare_Button);

		HMD5_Compare_Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (HMD5_CompareValue_Text.getText()
						.equals(HMD5_Text.getText())) {

					System.out.println("二者HMD5值一样，数据完整");

					JFrame frame1 = new JFrame("比较结果");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("二者HMD5值一样，数据完整", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);
				}

				else {

					System.out.println("二者HMD5值不一致，数据完整性被破环");
					JFrame frame1 = new JFrame("比较结果");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("二者HMD5值不一致，数据完整性被破环", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}
			}
		});
		
		
		// 创建 “MD5比较按钮”

				JButton MD5_Compare_Button = new JButton(" 比较MD5值  ");
				Scheme1.add(MD5_Compare_Button);

				MD5_Compare_Button.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						if (MD5_CompareValue_Text.getText()
								.equals(MD5_Text.getText())) {

							System.out.println("二者MD5值一样，数据完整");

							JFrame frame1 = new JFrame("比较结果");
							// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							JLabel j = new JLabel("二者MD5值一样，数据完整", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 250, 120);
							frame1.setVisible(true);
						}

						else {

							System.out.println("二者MD5值不一致，数据完整性被破环");
							JFrame frame1 = new JFrame("比较结果");
							// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							JLabel j = new JLabel("二者MD5值不一致，数据完整性被破环", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 250, 120);
							frame1.setVisible(true);

						}
					}
				});


		// 设置清空按钮

		JButton Text_Clear_Button = new JButton("      清空      ");
		Scheme1.add(Text_Clear_Button);
		Text_Clear_Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				endpointText.setText("");
				accessKeyIdText.setText("");
				accessKeySecretText.setText("");
				ChooseFileShowText.setText("");
				HMD5_SK_Parameter_Text.setText("");
				HMD5_CompareValue_Text.setText("");
				MD5_CompareValue_Text.setText("");
				HMD5_Text.setText("");
				MD5_Text.setText("");
				CreateBucketText.setText("");
				SeleteBucketText.setText("");
				DownloadFileNameSetText.setText("");
				DownloadFileDirectoryText.setText("");

			}
		});

		// 设置退出按钮

		JButton Exit_Button = new JButton("      退出      ");
		Scheme1.add(Exit_Button);
		Exit_Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});

		// 在面板 Scheme2 中添加组件

		// 在面板中添加滚动条

		// JTextArea text=new JTextArea();

		// 设置标题
		JLabel ShowSchemeLabel2 = new JLabel(
				"            抽样检测方案图形化操作界面               ", CENTER);
		ShowSchemeLabel2.setFont(new Font(Dialog, 1, 20));
		ShowSchemeLabel2.setForeground(Color.black);
		Scheme2.add(ShowSchemeLabel2);

		// 创建"accessKeyId2文本框”

		JLabel accessKeyIdjLabel2 = new JLabel(
				"请输入accessKeyId                                 ", CENTER);
		accessKeyIdjLabel2.setFont(new Font(Dialog, 1, 14));
		accessKeyIdjLabel2.setForeground(Color.gray);

		Scheme2.add(accessKeyIdjLabel2);

		JTextField accessKeyIdText2 = new JTextField(40);
		Scheme2.add(accessKeyIdText2);

		accessKeyIdText2.setText("51yHNPUqtgxSDqMl");

		// 创建"accessKeySecret2文本框”

		JLabel accessKeySecretjLabel2 = new JLabel(
				"请输入accessKeySecret                         ", CENTER);
		accessKeySecretjLabel2.setFont(new Font(Dialog, 1, 14));
		accessKeySecretjLabel2.setForeground(Color.gray);

		Scheme2.add(accessKeySecretjLabel2);

		JTextField accessKeySecretText2 = new JTextField(40);
		Scheme2.add(accessKeySecretText2);

		accessKeySecretText2.setText("q7rqWdGyowtGfe6r990f5RBZxaUzL8");

		// 创建"endpoint2"按钮，及其 “数值输出文本框”

		JLabel endpointjLabel2 = new JLabel(
				"请输入endpoint                                        ", CENTER);
		endpointjLabel2.setFont(new Font(Dialog, 1, 14));
		endpointjLabel2.setForeground(Color.gray);

		Scheme2.add(endpointjLabel2);

		JTextField endpointText2 = new JTextField(40);
		Scheme2.add(endpointText2);
		endpointText2.setText("http://oss-cn-shenzhen.aliyuncs.com");

		// 创建"选择Bucket2文本框”

		// JLabel InputButtonNamejLabel2=new
		// JLabel("请输入上传或下载文件夹所在的Bucket的名字 ",CENTER);
		JLabel InputButtonNamejLabel2 = new JLabel(
				"请输入文件夹所在的Bucket名字             ", CENTER);
		InputButtonNamejLabel2.setFont(new Font(Dialog, 1, 14));
		InputButtonNamejLabel2.setForeground(Color.gray);

		Scheme2.add(InputButtonNamejLabel2);

		JTextField SeleteBucketText2 = new JTextField(40);
		Scheme2.add(SeleteBucketText2);

		// 创建"输入云端下载文件夹文本框”

		JLabel InputDownloadFolderNamejLabel2 = new JLabel(
				"请输入云端要下载文件夹的名字              ", CENTER);
		InputDownloadFolderNamejLabel2.setFont(new Font(Dialog, 1, 14));
		InputDownloadFolderNamejLabel2.setForeground(Color.gray);

		Scheme2.add(InputDownloadFolderNamejLabel2);

		JTextField DownloadFolderNameSetText2 = new JTextField(40);
		Scheme2.add(DownloadFolderNameSetText2);

		// 创建"输入云端下载文件夹对应的标签文件的文本框”

		JLabel InputDownloadFolderTagNamejLabel2 = new JLabel(
				"请输入云端验证标签文件夹名字              ", CENTER);
		InputDownloadFolderTagNamejLabel2.setFont(new Font(Dialog, 1, 14));
		InputDownloadFolderTagNamejLabel2.setForeground(Color.gray);

		Scheme2.add(InputDownloadFolderTagNamejLabel2);

		JTextField DownloadFolderTagNameSetText2 = new JTextField(40);
		Scheme2.add(DownloadFolderTagNameSetText2);

		// 创建 “HMD5密钥参数文本框”

		JLabel Input_SK_ParameterjLabel2 = new JLabel(
				"请输入HMD5密钥参数                              ", CENTER);
		Input_SK_ParameterjLabel2.setFont(new Font(Dialog, 1, 14));
		Input_SK_ParameterjLabel2.setForeground(Color.gray);

		Scheme2.add(Input_SK_ParameterjLabel2);

		JTextField HMD5_SK_Parameter_Text2 = new JTextField(40);
		Scheme2.add(HMD5_SK_Parameter_Text2);

		// 创建 “文件分块大小文本框”

		JLabel FileBlockSizeLable = new JLabel(
				"请输入文件分块大小（B）                      ", CENTER);
		FileBlockSizeLable.setFont(new Font(Dialog, 1, 14));
		FileBlockSizeLable.setForeground(Color.gray);

		Scheme2.add(FileBlockSizeLable);

		JTextField FileBlockSizeText = new JTextField(40);
		Scheme2.add(FileBlockSizeText);

		// 创建 “输入合并文件名字文本框”

		JLabel CombineFileNameLable = new JLabel(
				"请输入文件分块合并后的名字                 ", CENTER);
		CombineFileNameLable.setFont(new Font(Dialog, 1, 14));
		CombineFileNameLable.setForeground(Color.gray);

		Scheme2.add(CombineFileNameLable);

		JTextField CombineFileNameText = new JTextField(40);
		Scheme2.add(CombineFileNameText);

		// 创建 “输入合并文件名字文本框”

		JLabel SampleFileNumberLable = new JLabel(
				"请输入抽样文件个数                                ", CENTER);
		SampleFileNumberLable.setFont(new Font(Dialog, 1, 14));
		SampleFileNumberLable.setForeground(Color.gray);

		Scheme2.add(SampleFileNumberLable);

		JTextField SampleFileNumberText = new JTextField(40);
		Scheme2.add(SampleFileNumberText);

		// 创建"选择文件"按钮，及其 “数值输出文本框”

		JButton ChooseFileButton2 = new JButton(
				"           文件或文件夹选择           ");
		Scheme2.add(ChooseFileButton2);

		JTextField ChooseFileShowText2 = new JTextField(40);
		Scheme2.add(ChooseFileShowText2);

		// 为"选择文件或者文件夹 " 按钮 "ChooseFileButton2" 添加 监听
		ChooseFileButton2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				int returnVal = chooser.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {

					ChooseFileShowText2.setText(chooser.getSelectedFile()
							.getPath());
				}

			}
		});

		// 设置 "文件分块存放目录" 文本框

		JButton FileSegButton = new JButton("   文件分块存放目录选择，并进行切分   ");
		Scheme2.add(FileSegButton);

		JTextField FileSegDirectoryText = new JTextField(40);
		Scheme2.add(FileSegDirectoryText);

		// 为"文件分块存放目录"按钮 “FileSegButton” 添加 监听
		FileSegButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();

				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

				int returnVal = chooser.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {

					FileSegDirectoryText.setText(chooser.getSelectedFile()
							.getPath());

				}

				if (ChooseFileShowText2.getText().equals("")
						|| FileSegDirectoryText.getText().equals("")
						|| FileBlockSizeText.getText().equals("")) {

					JFrame frame1 = new JFrame("警告！");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("请按要求进行正确输入！", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);
				}

				else {

					// 对选定的的文件进行切分，并输出到指定的文件夹
					File file = new File(ChooseFileShowText2.getText());
					new FileSeg();
					try {

						FileSeg.fileseg(
								ChooseFileShowText2.getText(),
								FileSegDirectoryText.getText() + "\\"
										+ file.getName(),
								Integer.parseInt(FileBlockSizeText.getText()));

					} catch (NumberFormatException | IOException e1) {

						e1.printStackTrace();
					}

					JFrame frame1 = new JFrame("切分完成！");
					JLabel j = new JLabel("文件切分完成，并已输出到您指定的目录！", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}

			}
		});

		// 设置 "文件分块合并存放目录" 文本框

		JButton FileCombineButton = new JButton(" 文件分块合并存放目录选择，并进行合并 ");
		Scheme2.add(FileCombineButton);

		JTextField FileCombineDirectory = new JTextField(40);
		Scheme2.add(FileCombineDirectory);

		// 为"文件分块合并存放目录"按钮 “FileCombineButton” 添加 监听
		FileCombineButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();

				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

				int returnVal = chooser.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {

					FileCombineDirectory.setText(chooser.getSelectedFile()
							.getPath());

				}

				if (ChooseFileShowText2.getText().equals("")
						|| FileCombineDirectory.getText().equals("")
						|| CombineFileNameText.getText().equals("")) {

					JFrame frame1 = new JFrame("警告！");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("请按要求进行正确输入！", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				} else {

					// 合并文件分块；注意顺序：
					// 1:应该先输入合并后文件的名字:CombineFileNameText.getText()
					// 2：选择文件分块所在的文件夹:ChooseFileShowText2.getText()
					// 3：最后点击:FileCombineButton
					File file = new File(CombineFileNameText.getText());

					new FileCombine();
					try {

						FileCombine.filecombine(
								ChooseFileShowText2.getText(),
								FileCombineDirectory.getText() + "\\"
										+ file.getName());

					} catch (IOException e1) {

						e1.printStackTrace();
					}

					JFrame frame1 = new JFrame("合并完成！");
					JLabel j = new JLabel("文件合并完成，并已输出到您指定的目录！", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}
			}
		});

		// 设置 "文件分块 Hmd5值计算输出 目录" 文本框

		JButton FileBlock_Hmd5_Compute_Button = new JButton(
				"  文件分块HMD5值存放目录选择，并计算  ");
		Scheme2.add(FileBlock_Hmd5_Compute_Button);

		JTextField FileBlock_Hmd5_Compute_Text = new JTextField(40);
		Scheme2.add(FileBlock_Hmd5_Compute_Text);

		// 为"文件分块   HMAC-md5值  目录"按钮 “fileBlock_HMACmd5_ValueButton” 添加 监听
		FileBlock_Hmd5_Compute_Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();

				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

				int returnVal = chooser.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {

					FileBlock_Hmd5_Compute_Text.setText(chooser
							.getSelectedFile().getPath());
				} else {
				}

				if (ChooseFileShowText2.getText().equals("")
						|| FileBlock_Hmd5_Compute_Text.getText().equals("")
						|| HMD5_SK_Parameter_Text2.getText().equals("")) {

					JFrame frame1 = new JFrame("警告！");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("请按要求进行正确输入！", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				} else {

					// 小文件分块所在文件夹的路径
					String str1 = ChooseFileShowText2.getText();
					File file = new File(str1);
					System.out.println("这是一个文件夹，文件夹名为：" + file.getName());
					String[] list = file.list();

					// 每个小文件的 Hmac—MD5值的输出路径
					String str2 = FileBlock_Hmd5_Compute_Text.getText() + "\\";

					for (int i = 0; i < list.length; i++) {

						String s = String.format("%s%08d", str2, i);
						String str3 = str1 + "\\" + list[i];

						new FileBlock_Hmd5_Compute();
						try {
							FileBlock_Hmd5_Compute.hmacmd5(str3, s,
									HMD5_SK_Parameter_Text2.getText());
						} catch (InvalidKeyException | NoSuchAlgorithmException
								| IOException e1) {

							e1.printStackTrace();
						}

					}

					JFrame frame1 = new JFrame("计算完成！");
					JLabel j = new JLabel("HMD5值计算完成，并已输出到您指定的目录！", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}
			}
		});

		
		// 设置 "文件分块 MD5值计算输出 目录" 文本框

				JButton FileBlock_md5_Compute_Button = new JButton(
						"  文件分块MD5值存放目录选择 ，并计算  ");
				Scheme2.add(FileBlock_md5_Compute_Button);

				JTextField FileBlock_md5_Compute_Text = new JTextField(40);
				Scheme2.add(FileBlock_md5_Compute_Text);

				// 为"文件分块   HMAC-md5值  目录"按钮 “fileBlock_HMACmd5_ValueButton” 添加 监听
				FileBlock_md5_Compute_Button.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						JFileChooser chooser = new JFileChooser();

						chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

						int returnVal = chooser.showOpenDialog(null);

						if (returnVal == JFileChooser.APPROVE_OPTION) {

							FileBlock_md5_Compute_Text.setText(chooser
									.getSelectedFile().getPath());
						} else {
						}

						if (ChooseFileShowText2.getText().equals("")
								|| FileBlock_md5_Compute_Text.getText().equals("")) {

							JFrame frame1 = new JFrame("警告！");
							// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							JLabel j = new JLabel("请按要求进行正确输入！", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 250, 120);
							frame1.setVisible(true);

						} else {

							// 小文件分块所在文件夹的路径
							String str1 = ChooseFileShowText2.getText();
							File file = new File(str1);
							System.out.println("这是一个文件夹，文件夹名为：" + file.getName());
							String[] list = file.list();

							// 每个小文件的 MD5值的输出路径
							String str2 = FileBlock_md5_Compute_Text.getText() + "\\";

							for (int i = 0; i < list.length; i++) {

								String s = String.format("%s%08d", str2, i);
								String str3 = str1 + "\\" + list[i];
								
								File f=new File(str3);
								
								try {
									new FileBlock_Md5_Compute();
									FileBlock_Md5_Compute.getFileMD5(f, s);
								
								} catch (NoSuchAlgorithmException
										| IOException e1) {

									e1.printStackTrace();
								}

							}

							JFrame frame1 = new JFrame("计算完成！");
							JLabel j = new JLabel("MD5值计算完成，并已输出到您指定的目录！", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 250, 120);
							frame1.setVisible(true);

						}
					}
				});

		
		
		
		
		
		
		// 设置 "抽样下载文件存放目录1" 文本框

		JButton FileSampleSaveDirectory1Button = new JButton(
				"         抽样文件保存目录             ");
		Scheme2.add(FileSampleSaveDirectory1Button);

		JTextField FileSampleSaveDirectory1 = new JTextField(40);
		Scheme2.add(FileSampleSaveDirectory1);

		// 为"云端下载的文件分块保存目录1"按钮 “FileSampleSaveDirectory1Button” 添加 监听
		FileSampleSaveDirectory1Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();

				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

				int returnVal = chooser.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {

					FileSampleSaveDirectory1.setText(chooser.getSelectedFile()
							.getPath());
				}
			}
		});

		// 设置 "抽样下载标签文件存放目录2" 文本框

		JButton FileSampleSaveDirectory2Button = new JButton(
				"         抽样标签文件保存目录         ");
		Scheme2.add(FileSampleSaveDirectory2Button);

		JTextField FileSampleSaveDirectory2 = new JTextField(40);
		Scheme2.add(FileSampleSaveDirectory2);

		// 为"云端下载的文件分块标签保存目录2"按钮 “FileSampleSaveDirectory2Button” 添加 监听
		FileSampleSaveDirectory2Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();

				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

				int returnVal = chooser.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {

					FileSampleSaveDirectory2.setText(chooser.getSelectedFile()
							.getPath());
				}
			}
		});

		// 设置 "抽样下载文件合并后存放路径" 文本框

		JButton SampleCombineButton = new JButton("    云端下载标签合并生成文件 1 选择   ");
		Scheme2.add(SampleCombineButton);

		JTextField SampleCombineText = new JTextField(40);
		Scheme2.add(SampleCombineText);

		// 为"抽样文件合并按钮 “SampleCombineButton” 添加 监听
		SampleCombineButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();

				chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

				int returnVal = chooser.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {

					SampleCombineText.setText(chooser.getSelectedFile()
							.getPath());
				}
			}
		});

		// 设置 "抽样下载标签文件合并后存放路径" 文本框

		JButton SampleTagCombineButton = new JButton("    重新计算标签合并生成文件 2 选择   ");
		Scheme2.add(SampleTagCombineButton);

		JTextField SampleTagCombineText = new JTextField(40);
		Scheme2.add(SampleTagCombineText);

		// 为"抽样文件合并按钮 “SampleCombineButton” 添加 监听
		SampleTagCombineButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();

				chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

				int returnVal = chooser.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {

					SampleTagCombineText.setText(chooser.getSelectedFile()
							.getPath());
				}
			}
		});

		// 创建上传文件夹按钮

		JButton uploadFolderButton = new JButton("    上传文件夹    ");

		Scheme2.add(uploadFolderButton);

		uploadFolderButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ChooseFileShowText2.getText().equals("")
						|| SeleteBucketText2.getText().equals("")
						|| endpointText2.getText().equals("")
						|| accessKeyIdText2.getText().equals("")
						|| accessKeySecretText2.getText().equals("")) {

					JFrame frame1 = new JFrame("警告！");
					JLabel j = new JLabel("请按要求进行正确输入！", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}

				else {

					String filepath = ChooseFileShowText2.getText();
					File f = new File(filepath);
					System.out.println("这是一个文件夹，文件夹名为：" + f.getName());
					// bucket下的文件夹名字要求已“/”结尾
					String foldername = f.getName() + "/";

					new FolderUpload();

					try {
						FolderUpload.createfolder(SeleteBucketText2.getText(),
								foldername, endpointText2.getText(),
								accessKeyIdText2.getText(),
								accessKeySecretText2.getText());
					} catch (IOException e2) {

						e2.printStackTrace();
					}

					new FolderUpload();
					try {
						FolderUpload.putObject(SeleteBucketText2.getText(), "",
								foldername, filepath, endpointText2.getText(),
								accessKeyIdText2.getText(),
								accessKeySecretText2.getText());
					} catch (FileNotFoundException e1) {

						e1.printStackTrace();
					}

					JFrame frame1 = new JFrame("文件夹上传完成！");
					JLabel j = new JLabel("文件夹上传完成！", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);
				}

			}

		});

		// 创建hmd5抽样下载按钮

		JButton sampleDownloadButton = new JButton("    HMD5抽样下载     ");
		Scheme2.add(sampleDownloadButton);
		sampleDownloadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (SeleteBucketText2.getText().equals("")
						|| DownloadFolderNameSetText2.getText().equals("")
						|| FileSampleSaveDirectory1.getText().equals("")
						|| DownloadFolderTagNameSetText2.getText().equals("")
						|| FileSampleSaveDirectory2.getText().equals("")
						|| endpointText2.getText().equals("")
						|| accessKeyIdText2.getText().equals("")
						|| SampleFileNumberText.getText().equals("")) {

					JFrame frame1 = new JFrame("警告！");

					JLabel j = new JLabel("请按要求进行正确输入！", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				} else {

					new Sample_Download();
					Sample_Download.sample_getObjects(
							SeleteBucketText2.getText(),
							DownloadFolderNameSetText2.getText(),
							FileSampleSaveDirectory1.getText(),
							DownloadFolderTagNameSetText2.getText(),
							FileSampleSaveDirectory2.getText(),
							endpointText2.getText(),
							accessKeyIdText2.getText(),
							accessKeySecretText2.getText(),
							Integer.parseInt(SampleFileNumberText.getText()));

				}

				
				JFrame frame1 = new JFrame("MD5抽样下载完成！");
				JLabel j = new JLabel("MD5抽样下载完成！", CENTER);
				frame1.add(j);
				frame1.setBounds(580, 280, 250, 120);
				frame1.setVisible(true);
				
				
			}
		});
		
		// 创建md5抽样下载按钮

				JButton MD5_sampleDownloadButton = new JButton("    MD5抽样下载     ");
				Scheme2.add(MD5_sampleDownloadButton);
				MD5_sampleDownloadButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if (SeleteBucketText2.getText().equals("")
								|| DownloadFolderNameSetText2.getText().equals("")
								|| FileSampleSaveDirectory1.getText().equals("")
							//	|| DownloadFolderTagNameSetText2.getText().equals("")
							//	|| FileSampleSaveDirectory2.getText().equals("")
								|| endpointText2.getText().equals("")
								|| accessKeyIdText2.getText().equals("")
								||accessKeySecretText2.getText().equals("")
								|| SampleFileNumberText.getText().equals("")) {

							JFrame frame1 = new JFrame("警告！");

							JLabel j = new JLabel("请按要求进行正确输入！", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 250, 120);
							frame1.setVisible(true);

						} else {

							new MD5_Sample_Download();
							MD5_Sample_Download.md5sample_download(
									SeleteBucketText2.getText(),
									DownloadFolderNameSetText2.getText(),
									FileSampleSaveDirectory1.getText(),
									//DownloadFolderTagNameSetText2.getText(),
									//FileSampleSaveDirectory2.getText(),
									endpointText2.getText(),
									accessKeyIdText2.getText(),
									accessKeySecretText2.getText(),
									Integer.parseInt(SampleFileNumberText.getText()));

						}

						JFrame frame1 = new JFrame("MD5抽样下载完成！");
						JLabel j = new JLabel("MD5抽样下载完成！", CENTER);
						frame1.add(j);
						frame1.setBounds(580, 280, 250, 120);
						frame1.setVisible(true);
						
						
						
					}
				});
		
		
		
		
		
		
		
		
		

		// 创建结果比较按钮

		JButton ResultCompareButton = new JButton("   结果比较    ");
		Scheme2.add(ResultCompareButton);
		ResultCompareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (ChooseFileShowText2.getText().equals("")
						|| FileSampleSaveDirectory2.getText().equals("")
						|| SampleCombineText.getText().equals("")
						|| SampleTagCombineText.getText().equals("")) {

					JFrame frame1 = new JFrame("警告！");
					JLabel j = new JLabel("请按要求进行正确输入！", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}

				else {
					new Result_Compare_Show();

					String str;

					try {
						str = Result_Compare_Show.compare(
								ChooseFileShowText2.getText(),
								FileSampleSaveDirectory2.getText(),
								SampleCombineText.getText(),
								SampleTagCombineText.getText());

						if (str.equals("1")) {
							JFrame frame1 = new JFrame("比较结果显示");
							// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							JLabel j = new JLabel("结果一致，文件完整", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 200, 120);
							frame1.setVisible(true);

						} else {

							JFrame frame1 = new JFrame("比较结果显示");
							// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							JLabel j = new JLabel("结果不一致，文件不完整", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 200, 120);
							frame1.setVisible(true);
						}

					} catch (IOException e1) {

						e1.printStackTrace();
					}

				}
			}

		});

		// 设置清空按钮

		JButton Text_Clear_Button2 = new JButton("     清空     ");
		Scheme2.add(Text_Clear_Button2);
		Text_Clear_Button2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				 endpointText2.setText("");
				 accessKeyIdText2.setText("");
				accessKeySecretText2.setText("");
				SeleteBucketText2.setText("");
				DownloadFolderNameSetText2.setText("");
				DownloadFolderTagNameSetText2.setText("");
				HMD5_SK_Parameter_Text2.setText("");
				FileBlockSizeText.setText("");
				SampleFileNumberText.setText("");
				CombineFileNameText.setText("");
				ChooseFileShowText2.setText("");
				FileSegDirectoryText.setText("");
				FileCombineDirectory.setText("");
				FileBlock_Hmd5_Compute_Text.setText("");
				FileBlock_md5_Compute_Text.setText("");
				FileSampleSaveDirectory1.setText("");
				FileSampleSaveDirectory2.setText("");
				SampleCombineText.setText("");
				SampleTagCombineText.setText("");

			}
		});

		// 设置退出按钮

		JButton Exit_Button2 = new JButton("     退出     ");
		Scheme2.add(Exit_Button2);
		Exit_Button2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});

		// 经济模型面板
		// 设置标题
		JLabel ShowModelLabel = new JLabel(
				"                 经济模型参数计算界面                       ", CENTER);
		ShowModelLabel.setFont(new Font(Dialog, 1, 20));
		ShowModelLabel.setForeground(Color.black);
		Model.add(ShowModelLabel);

		// p1值输入
		JLabel p1_jLabel = new JLabel("请输入p1的值             ", CENTER);
		p1_jLabel.setFont(new Font(Dialog, 1, 14));
		p1_jLabel.setForeground(Color.gray);
		Model.add(p1_jLabel);

		JTextField p1_Text = new JTextField(50);
		Model.add(p1_Text);

		// p2值输入
		JLabel p2_jLabel = new JLabel("请输入p2的值             ", CENTER);
		p2_jLabel.setFont(new Font(Dialog, 1, 14));
		p2_jLabel.setForeground(Color.gray);
		Model.add(p2_jLabel);

		JTextField p2_Text = new JTextField(50);
		Model.add(p2_Text);

		// p3值输入
		JLabel p3_jLabel = new JLabel("请输入p3的值             ", CENTER);
		p3_jLabel.setFont(new Font(Dialog, 1, 14));
		p3_jLabel.setForeground(Color.gray);
		Model.add(p3_jLabel);

		JTextField p3_Text = new JTextField(50);
		Model.add(p3_Text);

		// sf 值输入
		JLabel sf_jLabel = new JLabel("请输入s  的值             ", CENTER);
		sf_jLabel.setFont(new Font(Dialog, 1, 14));
		sf_jLabel.setForeground(Color.gray);
		Model.add(sf_jLabel);

		JTextField sf_Text = new JTextField(50);
		Model.add(sf_Text);

		// st值输入
		JLabel st_jLabel = new JLabel("请输入s' 的值             ", CENTER);
		st_jLabel.setFont(new Font(Dialog, 1, 14));
		st_jLabel.setForeground(Color.gray);
		Model.add(st_jLabel);

		JTextField st_Text = new JTextField(50);
		Model.add(st_Text);

		// c值输入
		JLabel c_jLabel = new JLabel("请输入c  的值             ", CENTER);
		c_jLabel.setFont(new Font(Dialog, 1, 14));
		c_jLabel.setForeground(Color.gray);
		Model.add(c_jLabel);

		JTextField c_Text = new JTextField(50);
		Model.add(c_Text);

		// i值输入
		JLabel i_jLabel = new JLabel("请输入 i  的值             ", CENTER);
		i_jLabel.setFont(new Font(Dialog, 1, 14));
		i_jLabel.setForeground(Color.gray);
		Model.add(i_jLabel);

		JTextField i_Text = new JTextField(50);
		Model.add(i_Text);

		// j值输入
		JLabel j_jLabel = new JLabel("请输入 j  的值             ", CENTER);
		j_jLabel.setFont(new Font(Dialog, 1, 14));
		j_jLabel.setForeground(Color.gray);
		Model.add(j_jLabel);

		JTextField j_Text = new JTextField(50);
		Model.add(j_Text);

		// g值输入
		JLabel g_jLabel = new JLabel("请输入 g 的值             ", CENTER);
		g_jLabel.setFont(new Font(Dialog, 1, 14));
		g_jLabel.setForeground(Color.gray);
		Model.add(g_jLabel);

		JTextField g_Text = new JTextField(50);
		Model.add(g_Text);

		//理论 n 值输出
		JLabel n_jLabel = new JLabel("计算理论 n 值为         ", CENTER);
		n_jLabel.setFont(new Font(Dialog, 1, 14));
		n_jLabel.setForeground(Color.gray);
		Model.add(n_jLabel);

		JTextField n_Text = new JTextField(50);
		Model.add(n_Text);

		//理论 M 值输出
		JLabel M_jLabel = new JLabel("计算理论 M 值为        ", CENTER);
		M_jLabel.setFont(new Font(Dialog, 1, 14));
		M_jLabel.setForeground(Color.gray);
		Model.add(M_jLabel);

		JTextField M_Text = new JTextField(50);
		Model.add(M_Text);
		

		//实际 n 值输出
		JLabel n_jLabel1 = new JLabel("计算实际 n 值为         ", CENTER);
		n_jLabel1.setFont(new Font(Dialog, 1, 14));
		n_jLabel1.setForeground(Color.gray);
		Model.add(n_jLabel1);

		JTextField n_Text1 = new JTextField(50);
		Model.add(n_Text1);
		
		
		//实际 M 值输出
				JLabel M_jLabel1 = new JLabel("计算实际 M 值为        ", CENTER);
				M_jLabel1.setFont(new Font(Dialog, 1, 14));
				M_jLabel1.setForeground(Color.gray);
				Model.add(M_jLabel1);

				JTextField M_Text1 = new JTextField(50);
				Model.add(M_Text1);
		

		// 创建理论M、n 值计算按钮

		JButton CalculateButton = new JButton(" M、n 理论值计算   ");

		Model.add(CalculateButton);

		CalculateButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (p1_Text.getText().equals("")
						|| p2_Text.getText().equals("")
						|| p3_Text.getText().equals("")
						|| sf_Text.getText().equals("")
						|| st_Text.getText().equals("")
						|| c_Text.getText().equals("")
						|| i_Text.getText().equals("")
						|| j_Text.getText().equals("")
						|| g_Text.getText().equals("")) {

					JFrame frame1 = new JFrame("警告！");

					JLabel j = new JLabel("请输入相关参数值！", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				} else {

					double n1 = Calculate_n_value.Calculate_n(
							Double.parseDouble(p1_Text.getText()),
							Double.parseDouble(p2_Text.getText()),
							Double.parseDouble(p3_Text.getText()),
							Long.parseLong(sf_Text.getText()),
							Integer.parseInt(st_Text.getText()),
							Integer.parseInt(c_Text.getText()),
							Integer.parseInt(i_Text.getText()),
							Integer.parseInt(j_Text.getText()),
							Integer.parseInt(g_Text.getText()));

					double M1 = Calculate_M_value.Calculate_M(
							Double.parseDouble(p1_Text.getText()),
							Double.parseDouble(p2_Text.getText()),
							Double.parseDouble(p3_Text.getText()),
							Long.parseLong(sf_Text.getText()),
							Integer.parseInt(st_Text.getText()),
							Integer.parseInt(c_Text.getText()),
							Integer.parseInt(i_Text.getText()),
							Integer.parseInt(j_Text.getText()),
							Integer.parseInt(g_Text.getText()));

					n_Text.setText(String.valueOf(n1));

					M_Text.setText(String.valueOf(M1));
				}
			}
		});

		
		
		
		// 创建实际M、n 值计算按钮

				JButton CalculateButton1 = new JButton(" M、n 实际值计算   ");

				Model.add(CalculateButton1);

				CalculateButton1.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						if (p1_Text.getText().equals("")
								|| p2_Text.getText().equals("")
								|| p3_Text.getText().equals("")
								|| sf_Text.getText().equals("")
								|| st_Text.getText().equals("")
								|| c_Text.getText().equals("")
								|| i_Text.getText().equals("")
								|| j_Text.getText().equals("")
								|| g_Text.getText().equals("")
								||  n_Text.getText().equals("")  ) {

							JFrame frame1 = new JFrame("警告！");

							JLabel j = new JLabel("请输入相关参数值！", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 250, 120);
							frame1.setVisible(true);

						} else {

							long n2 = Article_n_value.Article_n(
									
									Long.parseLong(sf_Text.getText()),
									Double.parseDouble(n_Text.getText()));

							double M2 = Article_M_value.Article_M(
									Double.parseDouble(n_Text.getText()),
									Double.parseDouble(p1_Text.getText()),
									Double.parseDouble(p2_Text.getText()),
									Double.parseDouble(p3_Text.getText()),
									Long.parseLong(sf_Text.getText()),
									Integer.parseInt(st_Text.getText()),
									Integer.parseInt(c_Text.getText()),
									Integer.parseInt(i_Text.getText()),
									Integer.parseInt(j_Text.getText()),
									Integer.parseInt(g_Text.getText()							 
											));

							n_Text1.setText(String.valueOf(n2));

							M_Text1.setText(String.valueOf(M2));
						}
					}
				});

				
		
		
		
		
		
		
		// 创建清空按钮

		JButton ClearButton = new JButton("     清空       ");

		Model.add(ClearButton);

		ClearButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				p1_Text.setText("");
				p2_Text.setText("");
				p3_Text.setText("");
				sf_Text.setText("");
				st_Text.setText("");
				c_Text.setText("");
				i_Text.setText("");
				j_Text.setText("");
				g_Text.setText("");
				n_Text.setText("");
				M_Text.setText("");
				n_Text1.setText("");
				M_Text1.setText("");
			}
		});

		panel.add(Scheme1, "Scheme1");
		panel.add(Scheme2, "Scheme2");
		panel.add(Model, "Model");

		// 翻转卡片布局动作
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				card.show(panel, "Scheme1");
			}
		});

		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				card.show(panel, "Scheme2");

			}
		});

		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				card.show(panel, "Model");

			}
		});

		this.getContentPane().add(panel);
		this.getContentPane().add(p, BorderLayout.SOUTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(400, 100, 600, 730);
		this.setResizable(false);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		new GUI();
	}

}
