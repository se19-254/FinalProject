//====================================================================================================
//The Free Edition of C# to Java Converter limits conversion output to 100 lines per file.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-csharp-to-java.html
//====================================================================================================

package school_management_system;

public class User extends Form
{
	public User()
	{
		Thread t = new Thread()
		{
		void run()
		{
			SplashStart();
		}
		};
		t.start();
		Thread.sleep(1000);

		InitializeComponent();

		t.stop();
	}

	public final void SplashStart()
	{
		Application.Run(new SplashScreen());
	}

	private void Button1_Click(Object sender, tangible.EventArgs e)
	{
		this.Close();
	}

	private void button2_Click(Object sender, tangible.EventArgs e)
	{
		if (comboBox1.Text.equals("Administrator"))
		{

			if (textBox1.Text.equals("Admin") && textBox2.Text.equals("admin"))
			{
				this.Hide();
				Form ADMIN = new InformationPanel();
				ADMIN.ShowDialog();
			}
			else
			{
				MessageBox.Show("Wrong username or password");
			}
		}

		else if (comboBox1.Text.equals("Donor"))
		{
			if (textBox1.Text.equals("") || textBox2.Text.equals(""))
			{
				MessageBox.Show("Enter Username and Password");
			}
			else
			{
				SqlConnection con = new SqlConnection("Data Source=LAPTOP-2BTBP4PF\\SQLEXPRESS;Initial Catalog=BloodBank;Integrated Security=True;Connect Timeout=30");
				con.Open();
				SqlCommand cmd = new SqlCommand("select * from Donor where D_Id ='" + textBox1.Text + "' and Password ='" + textBox2.Text + "'", con);
				SqlDataAdapter da = new SqlDataAdapter(cmd);
				DataTable dt = new DataTable();
				da.Fill(dt);
				this.Hide();
				Form STUDENT = new InformationPanel();
				STUDENT.ShowDialog();
			}

		}

		else if (comboBox1.Text.equals("Patient"))
		{

			Form STUDENT = new BloodRequest();
			STUDENT.ShowDialog();

		}

	}

	private void label1_Click(Object sender, tangible.EventArgs e)
	{

	}

	private void comboBox1_SelectedIndexChanged(Object sender, tangible.EventArgs e)
	{
		// for spreading form           
		int width = 364;
		while (width <= 390)
		{
			this.Size = new Size(width, 390);
			this.Refresh();
			this.SetStyle(ControlStyles.OptimizedDoubleBuffer, true);
			this.SetStyle(ControlStyles.AllPaintingInWmPaint, true);
			this.SetStyle(ControlStyles.UserPaint, true);
			Thread.sleep(10);
			width += 10;
		}

		if (comboBox1.Text.equals("Administrator"))
		{
			panel1.Show();
			label2.Text = "*Please enter ID and Password";
		}
		else if (comboBox1.Text.equals("Donor"))
		{
			panel1.Show();
			label2.Text = "*Please enter ID and Password";
		}

		else
		{
			Form Student = new BloodRequest();
			Student.ShowDialog();
		}
	}

	private void User_Load(Object sender, tangible.EventArgs e)
	{
		this.Size = new Size(272, 231);
		panel1.Hide();
	}

	private void textBox1_TextChanged(Object sender, tangible.EventArgs e)
	{

	}

	private void textBox2_TextChanged(Object sender, tangible.EventArgs e)
	{

	}

	private void panel1_Paint(Object sender, PaintEventArgs e)
	{

	}

	private void button1_Click_1(Object sender, tangible.EventArgs e)
	{
		this.Close();
	}

	private void linkLabel1_LinkClicked(Object sender, LinkLabelLinkClickedEventArgs e)
	{
		Form Student = new DonorRegistration();
		Student.ShowDialog();
	}


	/** 
	 Required designer variable.
	*/
	private System.ComponentModel.IContainer components = null;

	/** 
	 Clean up any resources being used.
	 
	 @param disposing true if managed resources should be disposed; otherwise, false.
	*/
	@Override
	protected void Dispose(boolean disposing)
	{
		if (disposing && (components != null))
		{
			components.Dispose();
		}
		super.Dispose(disposing);
	}

//C# TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#region Windows Form Designer generated code

	/** 
	 Required method for Designer support - do not modify
	 the contents of this method with the code editor.
	*/
	private void InitializeComponent()
	{
		this.button1 = new System.Windows.Forms.Button();
		this.button2 = new System.Windows.Forms.Button();
		this.label1 = new System.Windows.Forms.Label();
		this.comboBox1 = new System.Windows.Forms.ComboBox();
		this.panel1 = new System.Windows.Forms.Panel();
		this.label3 = new System.Windows.Forms.Label();
		this.label4 = new System.Windows.Forms.Label();
		this.label2 = new System.Windows.Forms.Label();
		this.textBox2 = new System.Windows.Forms.TextBox();
		this.textBox1 = new System.Windows.Forms.TextBox();
		this.linkLabel1 = new System.Windows.Forms.LinkLabel();
		this.panel1.SuspendLayout();
		this.SuspendLayout();
		// 
		// button1
		// 
		this.button1.BackColor = System.Drawing.Color.PaleGoldenrod;
		this.button1.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: this.button1.Font = new System.Drawing.Font("Britannic Bold", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
		this.button1.Font = new System.Drawing.Font("Britannic Bold", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
		this.button1.ForeColor = System.Drawing.Color.Black;
		this.button1.Location = new System.Drawing.Point(138, 168);
		this.button1.Name = "button1";
		this.button1.Size = new System.Drawing.Size(65, 29);
		this.button1.TabIndex = 1;
		this.button1.Text = "EXIT";
		this.button1.UseVisualStyleBackColor = false;
//C# TO JAVA CONVERTER TODO TASK: Java has no equivalent to C#-style event wireups:
		this.button1.Click += new System.EventHandler(this.button1_Click_1);
		// 
		// button2
		// 

//====================================================================================================
//End of the allowed output for the Free Edition of C# to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-csharp-to-java.html
//====================================================================================================
