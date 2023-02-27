using System.Diagnostics.CodeAnalysis;

namespace Milestone_2
{
    
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        // Add items that are inputed by the user to the items list
        private void addButton_Click(object sender, EventArgs e) 
        {
            try
            {
                InventoryItem clothingItem = new InventoryItem();

                clothingItem.itemType = colorTextBox.Text;
                clothingItem.itemCost = double.Parse(costTextBox.Text);
                clothingItem.itemID = int.Parse(idTextBox.Text);

                inventoryListBox.Items.Add("ID: " + clothingItem.itemID + " " + clothingItem.itemType + " ($"  + clothingItem.itemCost + ")"); 
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            
        }

        
    }
}