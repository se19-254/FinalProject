//====================================================================================================
//The Free Edition of C# to Java Converter limits conversion output to 100 lines per file.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-csharp-to-java.html
//====================================================================================================

package school_management_system;

import java.util.*;

public class DonorRegistration extends Form
{
	public DonorRegistration()
	{
		InitializeComponent();
	}

	private void sev_Click(Object sender, tangible.EventArgs e)
	{
		if (!tb_Id.Text.equals("") && !tb_fn.Text.equals("") && !tb_ln.Text.equals("") && !cb_gender.Text.equals("") && !DoB.Text.equals("") && !cb_BG.Text.equals("") && !tb_address.Text.equals("") && !tb_mobile.Text.equals("") && !tb_CNIC.Text.equals("") && !Date.Text.equals("") && !tb_Qty.Text.equals("") && !tb_pw.Text.equals(""))
		{
			SqlConnection con = new SqlConnection("Data Source=LAPTOP-2BTBP4PF\\SQLEXPRESS;Initial Catalog=BloodBank;Integrated Security=True;Connect Timeout=30");
			con.Open();
			SqlCommand cmd = new SqlCommand("insert into Donor(D_ID, FirstName, LastName, Gender, DoB, BloodGroup , Address, Contact, CNIC, Date, Quantity, Password) " + "values('" + tb_Id.Text + "', '" + tb_fn.Text + "', '" + tb_ln.Text + "', '" + cb_gender.Text + "', '" + DoB.Text + "', '" + cb_BG.Text + "', '" + tb_address.Text + "', '" + tb_mobile.Text + "', '" + tb_CNIC.Text + "', '" + Date.Text + "' , '" + tb_Qty.Text + "' , '" + tb_pw.Text + "')", con);
			SqlDataAdapter da = new SqlDataAdapter(cmd);
			DataSet ds = new DataSet();
			da.Fill(ds);
			MessageBox.Show("DATA INSERTED SUCESSFULY");
			tb_Id.Text = "";
			tb_fn.Text = "";
			tb_ln.Text = "";
			cb_gender.Text = "";
			DoB.Text = "";
			cb_BG.Text = "";
			tb_address.Text = "";
			tb_mobile.Text = "";
			tb_CNIC.Text = "";
			Date.Text = "";
			tb_Qty.Text = "";
			tb_pw.Text = "";
		}
		else
		{
			MessageBox.Show("DATA INSERTION FAILED");
		}
	}

	private void clr_Click(Object sender, tangible.EventArgs e)
	{

	}

	private String NId = "DId#";
	private void GC()
	{
		SqlConnection con = new SqlConnection("Data Source=LAPTOP-2BTBP4PF\\SQLEXPRESS;Initial Catalog=BloodBank;Integrated Security=True;Connect Timeout=30");
		con.Open();
		SqlCommand cmd = new SqlCommand("select count(*) from Donor", con);
		int i = (Integer)cmd.ExecuteScalar();
		con.Close();
		i++;
		tb_Id.Text = NId + String.valueOf(i);
	}

	private void GC1()
	{
		Random r = new Random();
//C# TO JAVA CONVERTER TODO TASK: There is no two-argument version of 'nextInt' in Java:
		int random = r.nextInt(100000, 9900000);
		tb_pw.Text = String.valueOf(random);
	}

	private void StudentRegistration_Load(Object sender, tangible.EventArgs e)
	{
		GC();
		GC1();
	}

	private void button1_Click(Object sender, tangible.EventArgs e)
	{
		this.Hide();
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
		System.Windows.Forms.Label label1;
		System.Windows.Forms.Label label2;
		System.Windows.Forms.Label label3;
		this.tb_Id = new System.Windows.Forms.TextBox();
		this.tb_fn = new System.Windows.Forms.TextBox();
		this.tb_ln = new System.Windows.Forms.TextBox();
		this.DoB = new System.Windows.Forms.DateTimePicker();
		this.tb_address = new System.Windows.Forms.TextBox();
		this.tb_mobile = new System.Windows.Forms.TextBox();
		this.tb_CNIC = new System.Windows.Forms.TextBox();
		this.Date = new System.Windows.Forms.DateTimePicker();
		this.clr = new System.Windows.Forms.Button();
		this.sev = new System.Windows.Forms.Button();
		this.button1 = new System.Windows.Forms.Button();
		this.cb_BG = new System.Windows.Forms.ComboBox();
		this.cb_gender = new System.Windows.Forms.ComboBox();
		this.tb_Qty = new System.Windows.Forms.TextBox();
		this.tb_pw = new System.Windows.Forms.TextBox();
		label = new System.Windows.Forms.Label();
		fisrtnameLabel = new System.Windows.Forms.Label();
		lastnameLabel = new System.Windows.Forms.Label();
		genderLabel = new System.Windows.Forms.Label();
		dateofbithLabel = new System.Windows.Forms.Label();
		lab = new System.Windows.Forms.Label();
		l_address = new System.Windows.Forms.Label();
		mobileLabel = new System.Windows.Forms.Label();
		fathernameLabel = new System.Windows.Forms.Label();
		dateLabel = new System.Windows.Forms.Label();
		label1 = new System.Windows.Forms.Label();
		label2 = new System.Windows.Forms.Label();
		label3 = new System.Windows.Forms.Label();
		this.SuspendLayout();
		// 
		// label
		// 
		label.AutoSize = true;
		label.BackColor = System.Drawing.Color.Maroon;
		label.Font = new System.Drawing.Font("Tahoma", 10.25F, System.Drawing.FontStyle.Bold);
		label.ForeColor = System.Drawing.Color.White;
		label.Location = new System.Drawing.Point(37, 105);

//====================================================================================================
//End of the allowed output for the Free Edition of C# to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-csharp-to-java.html
//====================================================================================================
