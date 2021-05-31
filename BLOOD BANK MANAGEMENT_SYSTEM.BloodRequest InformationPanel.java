//====================================================================================================
//The Free Edition of C# to Java Converter limits conversion output to 100 lines per file.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-csharp-to-java.html
//====================================================================================================

package school_management_system;

public class InformationPanel extends Form
{
	public InformationPanel()
	{
		InitializeComponent();
	}

	private void button1_Click(Object sender, tangible.EventArgs e)
	{
		SqlConnection con = new SqlConnection("Data Source=LAPTOP-2BTBP4PF\\SQLEXPRESS;Initial Catalog=BloodBank;Integrated Security=True;Connect Timeout=30");
		con.Open();
		SqlCommand cmd = new SqlCommand("select *from Donor where BloodGroup='" + cb_BG.Text + "'", con);
		SqlCommand cmd1 = new SqlCommand("select *from Patient where PBloodGroup='" + cb_BG.Text + "'", con);
		SqlDataAdapter da = new SqlDataAdapter(cmd);
		SqlDataAdapter da1 = new SqlDataAdapter(cmd1);
		DataTable DT = new DataTable();
		da.Fill(DT);
		dataGridView1.DataSource = DT;
		DataTable DT1 = new DataTable();
		da1.Fill(DT1);
		dataGridView2.DataSource = DT1;
		con.Close();

	}

	private void button2_Click(Object sender, tangible.EventArgs e)
	{
		this.Close();
	}

	private void button3_Click(Object sender, tangible.EventArgs e)
	{
		this.Hide();
		Form ADMIN = new User();
		ADMIN.ShowDialog();
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
		this.dataGridView1 = new System.Windows.Forms.DataGridView();
		this.dataGridView2 = new System.Windows.Forms.DataGridView();
		this.cb_BG = new System.Windows.Forms.ComboBox();
		this.button1 = new System.Windows.Forms.Button();
		this.label1 = new System.Windows.Forms.Label();
		this.label2 = new System.Windows.Forms.Label();
		this.button2 = new System.Windows.Forms.Button();
		this.button3 = new System.Windows.Forms.Button();
		((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
		((System.ComponentModel.ISupportInitialize)(this.dataGridView2)).BeginInit();
		this.SuspendLayout();
		// 
		// dataGridView1
		// 
		this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
		this.dataGridView1.Location = new System.Drawing.Point(12, 90);
		this.dataGridView1.Name = "dataGridView1";
		this.dataGridView1.Size = new System.Drawing.Size(250, 283);
		this.dataGridView1.TabIndex = 0;
		// 
		// dataGridView2
		// 
		this.dataGridView2.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
		this.dataGridView2.Location = new System.Drawing.Point(282, 90);
		this.dataGridView2.Name = "dataGridView2";
		this.dataGridView2.Size = new System.Drawing.Size(250, 283);
		this.dataGridView2.TabIndex = 1;
		// 
		// cb_BG
		// 
		this.cb_BG.BackColor = System.Drawing.SystemColors.Window;
		this.cb_BG.ForeColor = System.Drawing.Color.Maroon;
		this.cb_BG.FormattingEnabled = true;
		this.cb_BG.Items.AddRange(new Object[] {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"});
		this.cb_BG.Location = new System.Drawing.Point(229, 63);
		this.cb_BG.Name = "cb_BG";
		this.cb_BG.Size = new System.Drawing.Size(134, 21);
		this.cb_BG.TabIndex = 116;
		// 
		// button1
		// 
		this.button1.BackColor = System.Drawing.SystemColors.Window;
		this.button1.Location = new System.Drawing.Point(369, 61);
		this.button1.Name = "button1";
		this.button1.Size = new System.Drawing.Size(75, 23);
		this.button1.TabIndex = 117;
		this.button1.Text = "SEARCH";
		this.button1.UseVisualStyleBackColor = false;
//C# TO JAVA CONVERTER TODO TASK: Java has no equivalent to C#-style event wireups:
		this.button1.Click += new System.EventHandler(this.button1_Click);
		// 
		// label1
		// 
		this.label1.AutoSize = true;
		this.label1.Location = new System.Drawing.Point(93, 66);
		this.label1.Name = "label1";
		this.label1.Size = new System.Drawing.Size(130, 13);
		this.label1.TabIndex = 118;
		this.label1.Text = "SELECT BLOOD GROUP";
		// 
		// label2
		// 
		this.label2.AutoSize = true;
		this.label2.Location = new System.Drawing.Point(208, 26);
		this.label2.Name = "label2";
		this.label2.Size = new System.Drawing.Size(120, 13);
		this.label2.TabIndex = 119;
		this.label2.Text = "INFORMATION PANEL";
		// 
		// button2
		// 
		this.button2.BackColor = System.Drawing.SystemColors.Window;
		this.button2.Location = new System.Drawing.Point(137, 379);
		this.button2.Name = "button2";
		this.button2.Size = new System.Drawing.Size(75, 23);
		this.button2.TabIndex = 120;
		this.button2.Text = "CLOSE";
		this.button2.UseVisualStyleBackColor = false;
//C# TO JAVA CONVERTER TODO TASK: Java has no equivalent to C#-style event wireups:
		this.button2.Click += new System.EventHandler(this.button2_Click);
		// 
		// button3
		// 
		this.button3.BackColor = System.Drawing.SystemColors.Window;
		this.button3.Location = new System.Drawing.Point(331, 379);
		this.button3.Name = "button3";
		this.button3.Size = new System.Drawing.Size(75, 23);
		this.button3.TabIndex = 121;
		this.button3.Text = "BACK";
		this.button3.UseVisualStyleBackColor = false;
//C# TO JAVA CONVERTER TODO TASK: Java has no equivalent to C#-style event wireups:
		this.button3.Click += new System.EventHandler(this.button3_Click);
		// 
		// InformationPanel
		// 
		this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
		this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
		this.BackgroundImage = school_management_system.properties.Resources.getKkkk();
		this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
		this.ClientSize = new System.Drawing.Size(544, 414);

//====================================================================================================
//End of the allowed output for the Free Edition of C# to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-csharp-to-java.html
//====================================================================================================
