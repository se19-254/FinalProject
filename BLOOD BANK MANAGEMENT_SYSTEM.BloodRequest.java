//====================================================================================================
//The Free Edition of C# to Java Converter limits conversion output to 100 lines per file.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-csharp-to-java.html
//====================================================================================================

package school_management_system;

public class BloodRequest extends Form
{
	public BloodRequest()
	{
		InitializeComponent();
	}

	private void sev_Click(Object sender, tangible.EventArgs e)
	{
		if (!tb_pid.Text.equals("") && !tb_mr.Text.equals("") && !tb_pn.Text.equals("") && !cb_gender.Text.equals("") && !DoB.Text.equals("") && !cb_BG.Text.equals("") && !tb_an.Text.equals("") && !tb_mobile.Text.equals("") && !tb_CNIC.Text.equals("") && !Date.Text.equals("") && !tb_Qty.Text.equals("") && !tb_loc.Text.equals(""))
		{
			SqlConnection con = new SqlConnection("Data Source=LAPTOP-2BTBP4PF\\SQLEXPRESS;Initial Catalog=BloodBank;Integrated Security=True;Connect Timeout=30");
			con.Open();
			SqlCommand cmd = new SqlCommand("insert into Patient(P_Id, PMR#, PName, PGender, PDoB, PBloodGroup , AName, AContact, ACNIC, Date, Quantity, Location) " + "values('" + tb_pid.Text + "', '" + tb_mr.Text + "', '" + tb_pn.Text + "', '" + cb_gender.Text + "', '" + DoB.Text + "', '" + cb_BG.Text + "', '" + tb_an.Text + "', '" + tb_mobile.Text + "', '" + tb_CNIC.Text + "', '" + Date.Text + "' , '" + tb_Qty.Text + "' , '" + tb_loc.Text + "')", con);
			SqlDataAdapter da = new SqlDataAdapter(cmd);
			DataSet ds = new DataSet();
			da.Fill(ds);
			MessageBox.Show("DATA INSERTED SUCESSFULY");
			tb_pid.Text = "";
			tb_pn.Text = "";
			tb_mr.Text = "";
			cb_gender.Text = "";
			DoB.Text = "";
			cb_BG.Text = "";
			tb_an.Text = "";
			tb_mobile.Text = "";
			tb_CNIC.Text = "";
			Date.Text = "";
			tb_Qty.Text = "";
			tb_loc.Text = "";
		}
		else
		{
			MessageBox.Show("DATA INSERTION FAILED");
		}
	}

	private void button1_Click(Object sender, tangible.EventArgs e)
	{
		this.Close();
		Form ADMIN = new User();
		ADMIN.ShowDialog();

	}

	private void clr_Click(Object sender, tangible.EventArgs e)
	{
		tb_pn.Text = "";
		tb_mr.Text = "";
		cb_gender.Text = "";
		DoB.Text = "";
		cb_BG.Text = "";
		tb_an.Text = "";
		tb_mobile.Text = "";
		tb_CNIC.Text = "";
		Date.Text = "";
		tb_Qty.Text = "";
		tb_loc.Text = "";
	}

	private void button2_Click(Object sender, tangible.EventArgs e)
	{
		this.Hide();
		Form ADMIN = new InformationPanel();
		ADMIN.ShowDialog();
	}

	private String NId = "PId#";
	private void GC()
	{
		SqlConnection con = new SqlConnection("Data Source=LAPTOP-2BTBP4PF\\SQLEXPRESS;Initial Catalog=BloodBank;Integrated Security=True;Connect Timeout=30");
		con.Open();
		SqlCommand cmd = new SqlCommand("select count(P_Id) from Patient", con);
		int i = (Integer)cmd.ExecuteScalar();
		con.Close();
		i++;
		tb_pid.Text = NId + String.valueOf(i);
	}

	private void BloodRequest_Load(Object sender, tangible.EventArgs e)
	{
		GC();
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
		System.Windows.Forms.Label label3;
		System.Windows.Forms.Label label2;
		System.Windows.Forms.Label label1;
		System.Windows.Forms.Label label;
		System.Windows.Forms.Label fisrtnameLabel;
		System.Windows.Forms.Label lastnameLabel;
		System.Windows.Forms.Label genderLabel;
		System.Windows.Forms.Label dateofbithLabel;
		System.Windows.Forms.Label lab;
		System.Windows.Forms.Label l_address;
		System.Windows.Forms.Label mobileLabel;
		System.Windows.Forms.Label fathernameLabel;
		System.Windows.Forms.Label dateLabel;
		System.Windows.Forms.Label label4;
		System.Windows.Forms.Label label5;
		this.tb_loc = new System.Windows.Forms.TextBox();
		this.cb_gender = new System.Windows.Forms.ComboBox();
		this.cb_BG = new System.Windows.Forms.ComboBox();
		this.tb_Qty = new System.Windows.Forms.TextBox();
		this.button1 = new System.Windows.Forms.Button();
		this.tb_pid = new System.Windows.Forms.TextBox();
		this.tb_mr = new System.Windows.Forms.TextBox();
		this.tb_pn = new System.Windows.Forms.TextBox();
		this.DoB = new System.Windows.Forms.DateTimePicker();
		this.tb_an = new System.Windows.Forms.TextBox();
		this.tb_mobile = new System.Windows.Forms.TextBox();
		this.tb_CNIC = new System.Windows.Forms.TextBox();
		this.Date = new System.Windows.Forms.DateTimePicker();
		this.clr = new System.Windows.Forms.Button();
		this.sev = new System.Windows.Forms.Button();
		this.button2 = new System.Windows.Forms.Button();
		label3 = new System.Windows.Forms.Label();
		label2 = new System.Windows.Forms.Label();
		label1 = new System.Windows.Forms.Label();
		label = new System.Windows.Forms.Label();
		fisrtnameLabel = new System.Windows.Forms.Label();

//====================================================================================================
//End of the allowed output for the Free Edition of C# to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-csharp-to-java.html
//====================================================================================================
