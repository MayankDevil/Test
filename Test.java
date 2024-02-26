class Test extends javax.swing.JFrame implements java.awt.event.ActionListener
{
	javax.swing.JLabel title, subtitle;

	javax.swing.JButton button;

	javax.swing.JPanel footer;

	Test()
	{
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		
		this.setBounds(100,100,500,500);

		this.setLayout(new java.awt.GridLayout(3,1));

			// title ------
		
			title = new javax.swing.JLabel("Welcome");

			title.setFont(new java.awt.Font("arial",java.awt.Font.BOLD,50));

			title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

			title.setForeground(java.awt.Color.decode("#2bcbcc"));

			title.setBackground(java.awt.Color.decode("#2c3e50"));

			title.setOpaque(true);

			// subtitle ------

			subtitle = new javax.swing.JLabel("The Ruler of Hell is Back");

			subtitle.setFont(new java.awt.Font("arial",java.awt.Font.PLAIN,30));

			subtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

			subtitle.setForeground(java.awt.Color.decode("#c7ecee"));

			subtitle.setBackground(java.awt.Color.decode("#2c3e50"));

			subtitle.setOpaque(true);

			// Footer -------

			footer = new javax.swing.JPanel();

			//	footer.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

				// button ------

				button = new javax.swing.JButton("Welcome");

				button.setSize(200,50);

				button.setFont(new java.awt.Font("arial",java.awt.Font.BOLD,20));

				button.setFocusable(false);

				button.setForeground(java.awt.Color.decode("#c7ecee"));

				button.setBackground(java.awt.Color.decode("#2c3e50"));

				button.addActionListener(this);

			footer.add(button);


		this.add(title);

		this.add(subtitle);

		this.add(footer);

		this.setVisible(true);
	}


	public void actionPerformed(java.awt.event.ActionEvent event)
	{
		if (event.getSource() == button)
		{
			System.out.println("[ ACTIVE ]");

			title.setText("Mayank The Devil");
		}
		else
		{
			System.exit(0);
		}
	}

	public static void main(String args[])
	{
		new Test();
	}
}