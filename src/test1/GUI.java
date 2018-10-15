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

		super("�����Լ�����");

		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		CardLayout card = new CardLayout(20, 20);

		JPanel panel = new JPanel(card);

		JPanel p = new JPanel();

		JButton button_1 = new JButton("ֱ������ ");
		JButton button_2 = new JButton("�������");
		JButton button_3 = new JButton("����ģ��");

		p.add(button_1);
		p.add(button_2);
		p.add(button_3);

		// ����������� Scheme1 , Scheme2
		JPanel Scheme1 = new JPanel();
		Scheme1.setBackground(new Color(249, 205, 173));

		JPanel Scheme2 = new JPanel();
		Scheme2.setBackground(new Color(200, 200, 169));

		JPanel Model = new JPanel();
		Model.setBackground(new Color(229, 187, 129));

		// ����� Scheme1 �� ������

		// accessKeyId
		// String accessKeyId = "51yHNPUqtgxSDqMl";

		// accessKeySecret
		// String accessKeySecret = "q7rqWdGyowtGfe6r990f5RBZxaUzL8";

		// ������Ϊ����ͨ����������
		// String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";

		// ���ñ���
		JLabel ShowSchemeLabel = new JLabel(
				"             ֱ�����ؼ�ⷽ��ͼ�λ���������               ", CENTER);
		ShowSchemeLabel.setFont(new Font(Dialog, 1, 20));
		ShowSchemeLabel.setForeground(Color.black);
		Scheme1.add(ShowSchemeLabel);

		// ����"accessKeyId�ı���

		JLabel accessKeyIdjLabel = new JLabel(
				"������accessKeyId                  ", CENTER);
		accessKeyIdjLabel.setFont(new Font(Dialog, 1, 14));
		accessKeyIdjLabel.setForeground(Color.gray);
		Scheme1.add(accessKeyIdjLabel);

		JTextField accessKeyIdText = new JTextField(40);
		Scheme1.add(accessKeyIdText);
		accessKeyIdText.setText("51yHNPUqtgxSDqMl");

		// ����"accessKeySecret�ı���

		JLabel accessKeySecretjLabel = new JLabel(
				"������accessKeySecret          ", CENTER);
		accessKeySecretjLabel.setFont(new Font(Dialog, 1, 14));
		accessKeySecretjLabel.setForeground(Color.gray);

		Scheme1.add(accessKeySecretjLabel);

		JTextField accessKeySecretText = new JTextField(40);
		Scheme1.add(accessKeySecretText);
		accessKeySecretText.setText("q7rqWdGyowtGfe6r990f5RBZxaUzL8");

		// ����"endpoint"��ť������ ����ֵ����ı���

		JLabel endpointjLabel = new JLabel(
				"������endpoint                        ", CENTER);
		endpointjLabel.setFont(new Font(Dialog, 1, 14));
		endpointjLabel.setForeground(Color.gray);

		Scheme1.add(endpointjLabel);

		JTextField endpointText = new JTextField(40);
		Scheme1.add(endpointText);
		endpointText.setText("http://oss-cn-shenzhen.aliyuncs.com");

		// ����"ѡ��Bucket"��ť������ ����Ӧ�ı���

		// JLabel InputButtonNamejLabel=new
		// JLabel("�������ϴ��������ļ����ڵ�Bucket������ ",CENTER);
		JLabel InputButtonNamejLabel = new JLabel("�������ļ����ڵ�Bucket���� ", CENTER);
		InputButtonNamejLabel.setFont(new Font(Dialog, 1, 14));
		InputButtonNamejLabel.setForeground(Color.gray);

		Scheme1.add(InputButtonNamejLabel);

		JTextField SeleteBucketText = new JTextField(40);
		Scheme1.add(SeleteBucketText);

		// ����"�����ƶ������ļ�"��ť������ ����Ӧ�ı���

		JLabel InputDownloadFileNamejLabel = new JLabel("�������ƶ�Ҫ�����ļ�������  ",
				CENTER);
		InputDownloadFileNamejLabel.setFont(new Font(Dialog, 1, 14));
		InputDownloadFileNamejLabel.setForeground(Color.gray);

		Scheme1.add(InputDownloadFileNamejLabel);

		JTextField DownloadFileNameSetText = new JTextField(40);
		Scheme1.add(DownloadFileNameSetText);

		// ���� ��HMD5��Կ������ ��ť������ ����Ӧ�ı���

		JLabel Input_SK_ParameterjLabel = new JLabel(
				"������HMD5��Կ����              ", CENTER);
		Input_SK_ParameterjLabel.setFont(new Font(Dialog, 1, 14));
		Input_SK_ParameterjLabel.setForeground(Color.gray);

		Scheme1.add(Input_SK_ParameterjLabel);

		JTextField HMD5_SK_Parameter_Text = new JTextField(40);
		Scheme1.add(HMD5_SK_Parameter_Text);

		// ���� ��HMD5�Ƚ��ı���

		JLabel Input_HMD5_ValuejLabel = new JLabel("������Ҫ�Ƚϵ�HMD5ֵ          ",
				CENTER);
		Input_HMD5_ValuejLabel.setFont(new Font(Dialog, 1, 14));
		Input_HMD5_ValuejLabel.setForeground(Color.gray);

		Scheme1.add(Input_HMD5_ValuejLabel);

		JTextField HMD5_CompareValue_Text = new JTextField(40);

		Scheme1.add(HMD5_CompareValue_Text);
		
		// ���� ��MD5�Ƚ��ı���

				JLabel Input_MD5_ValuejLabel = new JLabel("������Ҫ�Ƚϵ�MD5ֵ             ",
						CENTER);
				Input_MD5_ValuejLabel.setFont(new Font(Dialog, 1, 14));
				Input_MD5_ValuejLabel.setForeground(Color.gray);

				Scheme1.add(Input_MD5_ValuejLabel);

				JTextField MD5_CompareValue_Text = new JTextField(40);

				Scheme1.add(MD5_CompareValue_Text);


		// ����"ѡ���ļ�"��ť������ ����ֵ����ı���

		JButton ChooseFileButton = new JButton("         �ļ�ѡ��           ");
		Scheme1.add(ChooseFileButton);

		JTextField ChooseFileShowText = new JTextField(40);
		Scheme1.add(ChooseFileShowText);

		// Ϊ"�ϴ��ļ�ѡ��" ��ť "ChooseFileButton" ��� ����
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

		// ���� ��HMD5�� ��ť������ ����Ӧ���ı���

		JButton HMD5_Button = new JButton("       HMD5 ֵ����          ");
		Scheme1.add(HMD5_Button);

		JTextField HMD5_Text = new JTextField(40);
		Scheme1.add(HMD5_Text);

		// Ϊ"HMD5"��ť "HMD5_Button" ��� ����

		HMD5_Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ChooseFileShowText.getText().equals("")
						|| HMD5_SK_Parameter_Text.getText().equals("")) {

					System.out.println("��ѡ��Ҫ����HMD5ֵ���ļ���������HMD5����Կ���ɲ���");

					JFrame frame1 = new JFrame("���棡");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("��ѡ��Ҫ����HMD5ֵ���ļ���������HMD5����Կ���ɲ���",
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
		
		
		// ���� ��MD5�� ��ť������ ����Ӧ���ı���

				JButton MD5_Button = new JButton("        MD5 ֵ����          ");
				Scheme1.add(MD5_Button);

				JTextField MD5_Text = new JTextField(40);
				Scheme1.add(MD5_Text);

		// Ϊ"MD5"��ť "MD5_Button" ��� ����

				MD5_Button.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						if (ChooseFileShowText.getText().equals("")) {

							System.out.println("��ѡ��Ҫ����MD5ֵ���ļ�");

							JFrame frame1 = new JFrame("���棡");
							// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							JLabel j = new JLabel("��ѡ��Ҫ����MD5ֵ���ļ�",CENTER);
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

		
		
		
		
		
		
		
		
		// ����"����Bucket"��ť������ ����ֵ�����ı���

		JButton CreateBucketButton = new JButton("   ����Bucket����,������    ");
		Scheme1.add(CreateBucketButton);

		JTextField CreateBucketText = new JTextField(40);
		Scheme1.add(CreateBucketText);

		// Ϊ"����Bucket"��ť "CreateBucketButton" ��� ����

		CreateBucketButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (CreateBucketText.getText().equals("")
						|| endpointText.getText().equals("")
						|| accessKeyIdText.getText().equals("")
						|| accessKeySecretText.getText().equals("")) {

					System.out
							.println("�밴Ҫ������Ҫ������Bucket�����֣�Bucket �����淶��1)ֻ�ܰ���Сд��ĸ�����ֺͶ̺��ߣ�-����2)������Сд��ĸ�������ֿ�ͷ��3)���ȱ����� 3-63 �ֽ�֮��");

					JFrame frame1 = new JFrame("���棡");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("�밴Ҫ������Ҫ������Bucket������", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);
				} else {

					new CreateBucket().create_bucket(
							CreateBucketText.getText(), endpointText.getText(),
							accessKeyIdText.getText(),
							accessKeySecretText.getText());

					JFrame frame1 = new JFrame("����Bucket�ɹ�");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("����Bucket�ɹ�", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}

			}
		});

		// ����"�����ļ�·��ѡ��"��ť������ ����Ӧ�ı���

		JButton DownloadFileDirectoryButton = new JButton(
				"       �ļ�����·��ѡ��     ");
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

		// ����"�ϴ��ļ�"��ť������ ����Ӧ�ı���

		// JTextField UploadFileText=new JTextField(40);
		// Scheme1.add(UploadFileText);

		JButton UploadFileButton = new JButton(" �ϴ��ļ�   ");
		Scheme1.add(UploadFileButton);

		// Ϊ"�ϴ��ļ�"��ť "UploadFileButton" ��� ����

		UploadFileButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					if (SeleteBucketText.getText().equals("")
							|| ChooseFileShowText.getText().equals("")
							|| endpointText.getText().equals("")
							|| accessKeyIdText.getText().equals("")
							|| accessKeySecretText.getText().equals("")) {

						System.out.println("��ѡ��Ҫ�ϴ����ļ����� �ϴ��ļ����ڵ�Bucket������");

						JFrame frame1 = new JFrame("���棡");
						// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						JLabel j = new JLabel("��ѡ��Ҫ�ϴ����ļ����� �ϴ��ļ����ڵ�Bucket������",
								CENTER);
						frame1.add(j);
						frame1.setBounds(580, 280, 250, 120);
						frame1.setVisible(true);
					}

					else {

						// JOptionPane.showMessageDialog(null,"�����ϴ���..");

						OSS_Upload_File.putObject(SeleteBucketText.getText(),
								"", ChooseFileShowText.getText(),
								endpointText.getText(),
								accessKeyIdText.getText(),
								accessKeySecretText.getText());

						// JOptionPane.showMessageDialog(null,"�ϴ��ļ��ɹ���");

					}

				} catch (FileNotFoundException e1) {

					e1.printStackTrace();
				}

			}
		});

		// ����"�����ļ�"��ť������ ����Ӧ�ı���

		// JTextField DownloadFileText=new JTextField(40);
		// Scheme1.add(DownloadFileText);

		JButton DownloadFileButton = new JButton(" �����ļ�   ");
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
							.println("������Ҫ���ص��ļ����ڵ�Bucket���֣�Ҫ���ص��ļ������֣��ļ����ص��������ڵ�·�� ");

					JFrame frame1 = new JFrame("���棡");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel(
							"������Ҫ���ص��ļ����ڵ�Bucket���֣�Ҫ���ص��ļ������֣��ļ����ص��������ڵ�·��",
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

		// ���� ��HMD5�Ƚϰ�ť��

		// JTextField HMD5_Compare_Text=new JTextField(40);
		// Scheme1.add(HMD5_Compare_Text);

		JButton HMD5_Compare_Button = new JButton("�Ƚ�HMD5ֵ  ");
		Scheme1.add(HMD5_Compare_Button);

		HMD5_Compare_Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (HMD5_CompareValue_Text.getText()
						.equals(HMD5_Text.getText())) {

					System.out.println("����HMD5ֵһ������������");

					JFrame frame1 = new JFrame("�ȽϽ��");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("����HMD5ֵһ������������", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);
				}

				else {

					System.out.println("����HMD5ֵ��һ�£����������Ա��ƻ�");
					JFrame frame1 = new JFrame("�ȽϽ��");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("����HMD5ֵ��һ�£����������Ա��ƻ�", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}
			}
		});
		
		
		// ���� ��MD5�Ƚϰ�ť��

				JButton MD5_Compare_Button = new JButton(" �Ƚ�MD5ֵ  ");
				Scheme1.add(MD5_Compare_Button);

				MD5_Compare_Button.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						if (MD5_CompareValue_Text.getText()
								.equals(MD5_Text.getText())) {

							System.out.println("����MD5ֵһ������������");

							JFrame frame1 = new JFrame("�ȽϽ��");
							// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							JLabel j = new JLabel("����MD5ֵһ������������", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 250, 120);
							frame1.setVisible(true);
						}

						else {

							System.out.println("����MD5ֵ��һ�£����������Ա��ƻ�");
							JFrame frame1 = new JFrame("�ȽϽ��");
							// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							JLabel j = new JLabel("����MD5ֵ��һ�£����������Ա��ƻ�", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 250, 120);
							frame1.setVisible(true);

						}
					}
				});


		// ������հ�ť

		JButton Text_Clear_Button = new JButton("      ���      ");
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

		// �����˳���ť

		JButton Exit_Button = new JButton("      �˳�      ");
		Scheme1.add(Exit_Button);
		Exit_Button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});

		// ����� Scheme2 ��������

		// ���������ӹ�����

		// JTextArea text=new JTextArea();

		// ���ñ���
		JLabel ShowSchemeLabel2 = new JLabel(
				"            ������ⷽ��ͼ�λ���������               ", CENTER);
		ShowSchemeLabel2.setFont(new Font(Dialog, 1, 20));
		ShowSchemeLabel2.setForeground(Color.black);
		Scheme2.add(ShowSchemeLabel2);

		// ����"accessKeyId2�ı���

		JLabel accessKeyIdjLabel2 = new JLabel(
				"������accessKeyId                                 ", CENTER);
		accessKeyIdjLabel2.setFont(new Font(Dialog, 1, 14));
		accessKeyIdjLabel2.setForeground(Color.gray);

		Scheme2.add(accessKeyIdjLabel2);

		JTextField accessKeyIdText2 = new JTextField(40);
		Scheme2.add(accessKeyIdText2);

		accessKeyIdText2.setText("51yHNPUqtgxSDqMl");

		// ����"accessKeySecret2�ı���

		JLabel accessKeySecretjLabel2 = new JLabel(
				"������accessKeySecret                         ", CENTER);
		accessKeySecretjLabel2.setFont(new Font(Dialog, 1, 14));
		accessKeySecretjLabel2.setForeground(Color.gray);

		Scheme2.add(accessKeySecretjLabel2);

		JTextField accessKeySecretText2 = new JTextField(40);
		Scheme2.add(accessKeySecretText2);

		accessKeySecretText2.setText("q7rqWdGyowtGfe6r990f5RBZxaUzL8");

		// ����"endpoint2"��ť������ ����ֵ����ı���

		JLabel endpointjLabel2 = new JLabel(
				"������endpoint                                        ", CENTER);
		endpointjLabel2.setFont(new Font(Dialog, 1, 14));
		endpointjLabel2.setForeground(Color.gray);

		Scheme2.add(endpointjLabel2);

		JTextField endpointText2 = new JTextField(40);
		Scheme2.add(endpointText2);
		endpointText2.setText("http://oss-cn-shenzhen.aliyuncs.com");

		// ����"ѡ��Bucket2�ı���

		// JLabel InputButtonNamejLabel2=new
		// JLabel("�������ϴ��������ļ������ڵ�Bucket������ ",CENTER);
		JLabel InputButtonNamejLabel2 = new JLabel(
				"�������ļ������ڵ�Bucket����             ", CENTER);
		InputButtonNamejLabel2.setFont(new Font(Dialog, 1, 14));
		InputButtonNamejLabel2.setForeground(Color.gray);

		Scheme2.add(InputButtonNamejLabel2);

		JTextField SeleteBucketText2 = new JTextField(40);
		Scheme2.add(SeleteBucketText2);

		// ����"�����ƶ������ļ����ı���

		JLabel InputDownloadFolderNamejLabel2 = new JLabel(
				"�������ƶ�Ҫ�����ļ��е�����              ", CENTER);
		InputDownloadFolderNamejLabel2.setFont(new Font(Dialog, 1, 14));
		InputDownloadFolderNamejLabel2.setForeground(Color.gray);

		Scheme2.add(InputDownloadFolderNamejLabel2);

		JTextField DownloadFolderNameSetText2 = new JTextField(40);
		Scheme2.add(DownloadFolderNameSetText2);

		// ����"�����ƶ������ļ��ж�Ӧ�ı�ǩ�ļ����ı���

		JLabel InputDownloadFolderTagNamejLabel2 = new JLabel(
				"�������ƶ���֤��ǩ�ļ�������              ", CENTER);
		InputDownloadFolderTagNamejLabel2.setFont(new Font(Dialog, 1, 14));
		InputDownloadFolderTagNamejLabel2.setForeground(Color.gray);

		Scheme2.add(InputDownloadFolderTagNamejLabel2);

		JTextField DownloadFolderTagNameSetText2 = new JTextField(40);
		Scheme2.add(DownloadFolderTagNameSetText2);

		// ���� ��HMD5��Կ�����ı���

		JLabel Input_SK_ParameterjLabel2 = new JLabel(
				"������HMD5��Կ����                              ", CENTER);
		Input_SK_ParameterjLabel2.setFont(new Font(Dialog, 1, 14));
		Input_SK_ParameterjLabel2.setForeground(Color.gray);

		Scheme2.add(Input_SK_ParameterjLabel2);

		JTextField HMD5_SK_Parameter_Text2 = new JTextField(40);
		Scheme2.add(HMD5_SK_Parameter_Text2);

		// ���� ���ļ��ֿ��С�ı���

		JLabel FileBlockSizeLable = new JLabel(
				"�������ļ��ֿ��С��B��                      ", CENTER);
		FileBlockSizeLable.setFont(new Font(Dialog, 1, 14));
		FileBlockSizeLable.setForeground(Color.gray);

		Scheme2.add(FileBlockSizeLable);

		JTextField FileBlockSizeText = new JTextField(40);
		Scheme2.add(FileBlockSizeText);

		// ���� ������ϲ��ļ������ı���

		JLabel CombineFileNameLable = new JLabel(
				"�������ļ��ֿ�ϲ��������                 ", CENTER);
		CombineFileNameLable.setFont(new Font(Dialog, 1, 14));
		CombineFileNameLable.setForeground(Color.gray);

		Scheme2.add(CombineFileNameLable);

		JTextField CombineFileNameText = new JTextField(40);
		Scheme2.add(CombineFileNameText);

		// ���� ������ϲ��ļ������ı���

		JLabel SampleFileNumberLable = new JLabel(
				"����������ļ�����                                ", CENTER);
		SampleFileNumberLable.setFont(new Font(Dialog, 1, 14));
		SampleFileNumberLable.setForeground(Color.gray);

		Scheme2.add(SampleFileNumberLable);

		JTextField SampleFileNumberText = new JTextField(40);
		Scheme2.add(SampleFileNumberText);

		// ����"ѡ���ļ�"��ť������ ����ֵ����ı���

		JButton ChooseFileButton2 = new JButton(
				"           �ļ����ļ���ѡ��           ");
		Scheme2.add(ChooseFileButton2);

		JTextField ChooseFileShowText2 = new JTextField(40);
		Scheme2.add(ChooseFileShowText2);

		// Ϊ"ѡ���ļ������ļ��� " ��ť "ChooseFileButton2" ��� ����
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

		// ���� "�ļ��ֿ���Ŀ¼" �ı���

		JButton FileSegButton = new JButton("   �ļ��ֿ���Ŀ¼ѡ�񣬲������з�   ");
		Scheme2.add(FileSegButton);

		JTextField FileSegDirectoryText = new JTextField(40);
		Scheme2.add(FileSegDirectoryText);

		// Ϊ"�ļ��ֿ���Ŀ¼"��ť ��FileSegButton�� ��� ����
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

					JFrame frame1 = new JFrame("���棡");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("�밴Ҫ�������ȷ���룡", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);
				}

				else {

					// ��ѡ���ĵ��ļ������з֣��������ָ�����ļ���
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

					JFrame frame1 = new JFrame("�з���ɣ�");
					JLabel j = new JLabel("�ļ��з���ɣ������������ָ����Ŀ¼��", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}

			}
		});

		// ���� "�ļ��ֿ�ϲ����Ŀ¼" �ı���

		JButton FileCombineButton = new JButton(" �ļ��ֿ�ϲ����Ŀ¼ѡ�񣬲����кϲ� ");
		Scheme2.add(FileCombineButton);

		JTextField FileCombineDirectory = new JTextField(40);
		Scheme2.add(FileCombineDirectory);

		// Ϊ"�ļ��ֿ�ϲ����Ŀ¼"��ť ��FileCombineButton�� ��� ����
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

					JFrame frame1 = new JFrame("���棡");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("�밴Ҫ�������ȷ���룡", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				} else {

					// �ϲ��ļ��ֿ飻ע��˳��
					// 1:Ӧ��������ϲ����ļ�������:CombineFileNameText.getText()
					// 2��ѡ���ļ��ֿ����ڵ��ļ���:ChooseFileShowText2.getText()
					// 3�������:FileCombineButton
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

					JFrame frame1 = new JFrame("�ϲ���ɣ�");
					JLabel j = new JLabel("�ļ��ϲ���ɣ������������ָ����Ŀ¼��", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}
			}
		});

		// ���� "�ļ��ֿ� Hmd5ֵ������� Ŀ¼" �ı���

		JButton FileBlock_Hmd5_Compute_Button = new JButton(
				"  �ļ��ֿ�HMD5ֵ���Ŀ¼ѡ�񣬲�����  ");
		Scheme2.add(FileBlock_Hmd5_Compute_Button);

		JTextField FileBlock_Hmd5_Compute_Text = new JTextField(40);
		Scheme2.add(FileBlock_Hmd5_Compute_Text);

		// Ϊ"�ļ��ֿ�   HMAC-md5ֵ  Ŀ¼"��ť ��fileBlock_HMACmd5_ValueButton�� ��� ����
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

					JFrame frame1 = new JFrame("���棡");
					// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JLabel j = new JLabel("�밴Ҫ�������ȷ���룡", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				} else {

					// С�ļ��ֿ������ļ��е�·��
					String str1 = ChooseFileShowText2.getText();
					File file = new File(str1);
					System.out.println("����һ���ļ��У��ļ�����Ϊ��" + file.getName());
					String[] list = file.list();

					// ÿ��С�ļ��� Hmac��MD5ֵ�����·��
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

					JFrame frame1 = new JFrame("������ɣ�");
					JLabel j = new JLabel("HMD5ֵ������ɣ������������ָ����Ŀ¼��", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}
			}
		});

		
		// ���� "�ļ��ֿ� MD5ֵ������� Ŀ¼" �ı���

				JButton FileBlock_md5_Compute_Button = new JButton(
						"  �ļ��ֿ�MD5ֵ���Ŀ¼ѡ�� ��������  ");
				Scheme2.add(FileBlock_md5_Compute_Button);

				JTextField FileBlock_md5_Compute_Text = new JTextField(40);
				Scheme2.add(FileBlock_md5_Compute_Text);

				// Ϊ"�ļ��ֿ�   HMAC-md5ֵ  Ŀ¼"��ť ��fileBlock_HMACmd5_ValueButton�� ��� ����
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

							JFrame frame1 = new JFrame("���棡");
							// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							JLabel j = new JLabel("�밴Ҫ�������ȷ���룡", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 250, 120);
							frame1.setVisible(true);

						} else {

							// С�ļ��ֿ������ļ��е�·��
							String str1 = ChooseFileShowText2.getText();
							File file = new File(str1);
							System.out.println("����һ���ļ��У��ļ�����Ϊ��" + file.getName());
							String[] list = file.list();

							// ÿ��С�ļ��� MD5ֵ�����·��
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

							JFrame frame1 = new JFrame("������ɣ�");
							JLabel j = new JLabel("MD5ֵ������ɣ������������ָ����Ŀ¼��", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 250, 120);
							frame1.setVisible(true);

						}
					}
				});

		
		
		
		
		
		
		// ���� "���������ļ����Ŀ¼1" �ı���

		JButton FileSampleSaveDirectory1Button = new JButton(
				"         �����ļ�����Ŀ¼             ");
		Scheme2.add(FileSampleSaveDirectory1Button);

		JTextField FileSampleSaveDirectory1 = new JTextField(40);
		Scheme2.add(FileSampleSaveDirectory1);

		// Ϊ"�ƶ����ص��ļ��ֿ鱣��Ŀ¼1"��ť ��FileSampleSaveDirectory1Button�� ��� ����
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

		// ���� "�������ر�ǩ�ļ����Ŀ¼2" �ı���

		JButton FileSampleSaveDirectory2Button = new JButton(
				"         ������ǩ�ļ�����Ŀ¼         ");
		Scheme2.add(FileSampleSaveDirectory2Button);

		JTextField FileSampleSaveDirectory2 = new JTextField(40);
		Scheme2.add(FileSampleSaveDirectory2);

		// Ϊ"�ƶ����ص��ļ��ֿ��ǩ����Ŀ¼2"��ť ��FileSampleSaveDirectory2Button�� ��� ����
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

		// ���� "���������ļ��ϲ�����·��" �ı���

		JButton SampleCombineButton = new JButton("    �ƶ����ر�ǩ�ϲ������ļ� 1 ѡ��   ");
		Scheme2.add(SampleCombineButton);

		JTextField SampleCombineText = new JTextField(40);
		Scheme2.add(SampleCombineText);

		// Ϊ"�����ļ��ϲ���ť ��SampleCombineButton�� ��� ����
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

		// ���� "�������ر�ǩ�ļ��ϲ�����·��" �ı���

		JButton SampleTagCombineButton = new JButton("    ���¼����ǩ�ϲ������ļ� 2 ѡ��   ");
		Scheme2.add(SampleTagCombineButton);

		JTextField SampleTagCombineText = new JTextField(40);
		Scheme2.add(SampleTagCombineText);

		// Ϊ"�����ļ��ϲ���ť ��SampleCombineButton�� ��� ����
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

		// �����ϴ��ļ��а�ť

		JButton uploadFolderButton = new JButton("    �ϴ��ļ���    ");

		Scheme2.add(uploadFolderButton);

		uploadFolderButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ChooseFileShowText2.getText().equals("")
						|| SeleteBucketText2.getText().equals("")
						|| endpointText2.getText().equals("")
						|| accessKeyIdText2.getText().equals("")
						|| accessKeySecretText2.getText().equals("")) {

					JFrame frame1 = new JFrame("���棡");
					JLabel j = new JLabel("�밴Ҫ�������ȷ���룡", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);

				}

				else {

					String filepath = ChooseFileShowText2.getText();
					File f = new File(filepath);
					System.out.println("����һ���ļ��У��ļ�����Ϊ��" + f.getName());
					// bucket�µ��ļ�������Ҫ���ѡ�/����β
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

					JFrame frame1 = new JFrame("�ļ����ϴ���ɣ�");
					JLabel j = new JLabel("�ļ����ϴ���ɣ�", CENTER);
					frame1.add(j);
					frame1.setBounds(580, 280, 250, 120);
					frame1.setVisible(true);
				}

			}

		});

		// ����hmd5�������ذ�ť

		JButton sampleDownloadButton = new JButton("    HMD5��������     ");
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

					JFrame frame1 = new JFrame("���棡");

					JLabel j = new JLabel("�밴Ҫ�������ȷ���룡", CENTER);
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

				
				JFrame frame1 = new JFrame("MD5����������ɣ�");
				JLabel j = new JLabel("MD5����������ɣ�", CENTER);
				frame1.add(j);
				frame1.setBounds(580, 280, 250, 120);
				frame1.setVisible(true);
				
				
			}
		});
		
		// ����md5�������ذ�ť

				JButton MD5_sampleDownloadButton = new JButton("    MD5��������     ");
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

							JFrame frame1 = new JFrame("���棡");

							JLabel j = new JLabel("�밴Ҫ�������ȷ���룡", CENTER);
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

						JFrame frame1 = new JFrame("MD5����������ɣ�");
						JLabel j = new JLabel("MD5����������ɣ�", CENTER);
						frame1.add(j);
						frame1.setBounds(580, 280, 250, 120);
						frame1.setVisible(true);
						
						
						
					}
				});
		
		
		
		
		
		
		
		
		

		// ��������Ƚϰ�ť

		JButton ResultCompareButton = new JButton("   ����Ƚ�    ");
		Scheme2.add(ResultCompareButton);
		ResultCompareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (ChooseFileShowText2.getText().equals("")
						|| FileSampleSaveDirectory2.getText().equals("")
						|| SampleCombineText.getText().equals("")
						|| SampleTagCombineText.getText().equals("")) {

					JFrame frame1 = new JFrame("���棡");
					JLabel j = new JLabel("�밴Ҫ�������ȷ���룡", CENTER);
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
							JFrame frame1 = new JFrame("�ȽϽ����ʾ");
							// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							JLabel j = new JLabel("���һ�£��ļ�����", CENTER);
							frame1.add(j);
							frame1.setBounds(580, 280, 200, 120);
							frame1.setVisible(true);

						} else {

							JFrame frame1 = new JFrame("�ȽϽ����ʾ");
							// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							JLabel j = new JLabel("�����һ�£��ļ�������", CENTER);
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

		// ������հ�ť

		JButton Text_Clear_Button2 = new JButton("     ���     ");
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

		// �����˳���ť

		JButton Exit_Button2 = new JButton("     �˳�     ");
		Scheme2.add(Exit_Button2);
		Exit_Button2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});

		// ����ģ�����
		// ���ñ���
		JLabel ShowModelLabel = new JLabel(
				"                 ����ģ�Ͳ����������                       ", CENTER);
		ShowModelLabel.setFont(new Font(Dialog, 1, 20));
		ShowModelLabel.setForeground(Color.black);
		Model.add(ShowModelLabel);

		// p1ֵ����
		JLabel p1_jLabel = new JLabel("������p1��ֵ             ", CENTER);
		p1_jLabel.setFont(new Font(Dialog, 1, 14));
		p1_jLabel.setForeground(Color.gray);
		Model.add(p1_jLabel);

		JTextField p1_Text = new JTextField(50);
		Model.add(p1_Text);

		// p2ֵ����
		JLabel p2_jLabel = new JLabel("������p2��ֵ             ", CENTER);
		p2_jLabel.setFont(new Font(Dialog, 1, 14));
		p2_jLabel.setForeground(Color.gray);
		Model.add(p2_jLabel);

		JTextField p2_Text = new JTextField(50);
		Model.add(p2_Text);

		// p3ֵ����
		JLabel p3_jLabel = new JLabel("������p3��ֵ             ", CENTER);
		p3_jLabel.setFont(new Font(Dialog, 1, 14));
		p3_jLabel.setForeground(Color.gray);
		Model.add(p3_jLabel);

		JTextField p3_Text = new JTextField(50);
		Model.add(p3_Text);

		// sf ֵ����
		JLabel sf_jLabel = new JLabel("������s  ��ֵ             ", CENTER);
		sf_jLabel.setFont(new Font(Dialog, 1, 14));
		sf_jLabel.setForeground(Color.gray);
		Model.add(sf_jLabel);

		JTextField sf_Text = new JTextField(50);
		Model.add(sf_Text);

		// stֵ����
		JLabel st_jLabel = new JLabel("������s' ��ֵ             ", CENTER);
		st_jLabel.setFont(new Font(Dialog, 1, 14));
		st_jLabel.setForeground(Color.gray);
		Model.add(st_jLabel);

		JTextField st_Text = new JTextField(50);
		Model.add(st_Text);

		// cֵ����
		JLabel c_jLabel = new JLabel("������c  ��ֵ             ", CENTER);
		c_jLabel.setFont(new Font(Dialog, 1, 14));
		c_jLabel.setForeground(Color.gray);
		Model.add(c_jLabel);

		JTextField c_Text = new JTextField(50);
		Model.add(c_Text);

		// iֵ����
		JLabel i_jLabel = new JLabel("������ i  ��ֵ             ", CENTER);
		i_jLabel.setFont(new Font(Dialog, 1, 14));
		i_jLabel.setForeground(Color.gray);
		Model.add(i_jLabel);

		JTextField i_Text = new JTextField(50);
		Model.add(i_Text);

		// jֵ����
		JLabel j_jLabel = new JLabel("������ j  ��ֵ             ", CENTER);
		j_jLabel.setFont(new Font(Dialog, 1, 14));
		j_jLabel.setForeground(Color.gray);
		Model.add(j_jLabel);

		JTextField j_Text = new JTextField(50);
		Model.add(j_Text);

		// gֵ����
		JLabel g_jLabel = new JLabel("������ g ��ֵ             ", CENTER);
		g_jLabel.setFont(new Font(Dialog, 1, 14));
		g_jLabel.setForeground(Color.gray);
		Model.add(g_jLabel);

		JTextField g_Text = new JTextField(50);
		Model.add(g_Text);

		//���� n ֵ���
		JLabel n_jLabel = new JLabel("�������� n ֵΪ         ", CENTER);
		n_jLabel.setFont(new Font(Dialog, 1, 14));
		n_jLabel.setForeground(Color.gray);
		Model.add(n_jLabel);

		JTextField n_Text = new JTextField(50);
		Model.add(n_Text);

		//���� M ֵ���
		JLabel M_jLabel = new JLabel("�������� M ֵΪ        ", CENTER);
		M_jLabel.setFont(new Font(Dialog, 1, 14));
		M_jLabel.setForeground(Color.gray);
		Model.add(M_jLabel);

		JTextField M_Text = new JTextField(50);
		Model.add(M_Text);
		

		//ʵ�� n ֵ���
		JLabel n_jLabel1 = new JLabel("����ʵ�� n ֵΪ         ", CENTER);
		n_jLabel1.setFont(new Font(Dialog, 1, 14));
		n_jLabel1.setForeground(Color.gray);
		Model.add(n_jLabel1);

		JTextField n_Text1 = new JTextField(50);
		Model.add(n_Text1);
		
		
		//ʵ�� M ֵ���
				JLabel M_jLabel1 = new JLabel("����ʵ�� M ֵΪ        ", CENTER);
				M_jLabel1.setFont(new Font(Dialog, 1, 14));
				M_jLabel1.setForeground(Color.gray);
				Model.add(M_jLabel1);

				JTextField M_Text1 = new JTextField(50);
				Model.add(M_Text1);
		

		// ��������M��n ֵ���㰴ť

		JButton CalculateButton = new JButton(" M��n ����ֵ����   ");

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

					JFrame frame1 = new JFrame("���棡");

					JLabel j = new JLabel("��������ز���ֵ��", CENTER);
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

		
		
		
		// ����ʵ��M��n ֵ���㰴ť

				JButton CalculateButton1 = new JButton(" M��n ʵ��ֵ����   ");

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

							JFrame frame1 = new JFrame("���棡");

							JLabel j = new JLabel("��������ز���ֵ��", CENTER);
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

				
		
		
		
		
		
		
		// ������հ�ť

		JButton ClearButton = new JButton("     ���       ");

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

		// ��ת��Ƭ���ֶ���
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
