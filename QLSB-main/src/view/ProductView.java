// package view;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionListener;
// import model.Product;

// public class ProductView extends JPanel {
//     private JTextField nameField;
//     private JTextField categoryField;
//     private JTextField sellPriceField;
//     private JTextField currentStockField;
//     private JTextField minStockLevelField;
//     private JTextField unitField;
//     private JTextArea descriptionField;
//     private JButton saveButton, cancelButton;

//     public ProductView() {
//         setLayout(new BorderLayout());
//         initUI();
//     }

//     private void initUI() {
//     setLayout(new BorderLayout(10, 10));

//     // Tiêu đề
//     JLabel titleLabel = new JLabel("Thêm Sản phẩm", SwingConstants.CENTER);
//     titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
//     titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
//     add(titleLabel, BorderLayout.NORTH);

//     // Form Panel với GridBagLayout để căn chỉnh tốt hơn
//     JPanel formPanel = new JPanel(new GridBagLayout());
//     formPanel.setBorder(BorderFactory.createTitledBorder("Thông tin sản phẩm"));
//     formPanel.setBackground(Color.WHITE);
//     GridBagConstraints gbc = new GridBagConstraints();
//     gbc.insets = new Insets(8, 10, 8, 10); // padding giữa các field
//     gbc.fill = GridBagConstraints.HORIZONTAL;
//     gbc.gridx = 0;
//     gbc.gridy = 0;
//     Font fieldFont = new Font("Segoe UI", Font.PLAIN, 16);

//     // Tên
//     formPanel.add(new JLabel("Tên:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     nameField = new JTextField(20);
//     nameField.setFont(fieldFont);
//     formPanel.add(nameField, gbc);

//     // Danh mục
//     gbc.gridx = 0;
//     gbc.gridy++;
//     formPanel.add(new JLabel("Danh mục:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     categoryField = new JTextField(20);
//     categoryField.setFont(fieldFont);
//     formPanel.add(categoryField, gbc);

//     // Giá bán
//     gbc.gridx = 0;
//     gbc.gridy++;
//     formPanel.add(new JLabel("Giá bán:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     sellPriceField = new JTextField(20);
//     sellPriceField.setFont(fieldFont);
//     formPanel.add(sellPriceField, gbc);

//     // Tồn kho
//     gbc.gridx = 0;
//     gbc.gridy++;
//     formPanel.add(new JLabel("Tồn kho:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     currentStockField = new JTextField(20);
//     currentStockField.setFont(fieldFont);
//     formPanel.add(currentStockField, gbc);

//     // Tối thiểu tồn kho
//     gbc.gridx = 0;
//     gbc.gridy++;
//     formPanel.add(new JLabel("Tối thiểu tồn kho:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     minStockLevelField = new JTextField(20);
//     minStockLevelField.setFont(fieldFont);
//     formPanel.add(minStockLevelField, gbc);

//     // Đơn vị
//     gbc.gridx = 0;
//     gbc.gridy++;
//     formPanel.add(new JLabel("Đơn vị:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     unitField = new JTextField(20);
//     unitField.setFont(fieldFont);
//     formPanel.add(unitField, gbc);

//     // Mô tả
//     gbc.gridx = 0;
//     gbc.gridy++;
//     gbc.anchor = GridBagConstraints.NORTH;
//     formPanel.add(new JLabel("Mô tả:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     descriptionField = new JTextArea(3, 20);
//     descriptionField.setFont(fieldFont);
//     JScrollPane scrollPane = new JScrollPane(descriptionField);
//     scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//     formPanel.add(scrollPane, gbc);

//     add(formPanel, BorderLayout.CENTER);

//     // Nút Lưu và Hủy
//     JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
//     saveButton = new JButton("Lưu");
//     saveButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
//     cancelButton = new JButton("Hủy");
//     cancelButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
//     buttonPanel.add(saveButton);
//     buttonPanel.add(cancelButton);
//     add(buttonPanel, BorderLayout.SOUTH);
//     }

//     public void setSaveAction(ActionListener actionListener) {
//         saveButton.addActionListener(actionListener);
//     }
//     public void setCancelAction(ActionListener actionListener) {
//         cancelButton.addActionListener(actionListener);
//     }

//     public String getName(){
//         return nameField.getText();
//     }
//     public void setName(String name){
//         nameField.setText(name);
//     }
//     public String getCategory(){
//         return categoryField.getText();
//     }
//     public void setCategory(String category){
//         categoryField.setText(category);
//     }
//     public String getSellPrice(){
//         return sellPriceField.getText();
//     }
//     public void setSellPrice(String sellPrice){
//         sellPriceField.setText(sellPrice);
//     }
//     public String getCurrentStock(){
//         return currentStockField.getText();
//     }
//     public void setCurrentStock(String currentStock){
//         currentStockField.setText(currentStock);
//     }
//     public String getMinStockLevel(){
//         return minStockLevelField.getText();
//     }
//     public void setMinStockLevel(String minStockLevel){
//         minStockLevelField.setText(minStockLevel);
//     }
//     public String getUnit(){
//         return unitField.getText();
//     }
//     public void setUnit(String unit){
//         unitField.setText(unit);
//     }
//     public String getDescription(){
//         return descriptionField.getText();
//     }
//     public void setDescription(String description){
//         descriptionField.setText(description);
//     }

//     public Product getProductData() {
//         Product product = new Product();
//         product.setName(nameField.getText());
//         product.setCategory(categoryField.getText());
//         product.setSellPrice(sellPriceField.getText().isEmpty() ? 0.0f : Float.parseFloat(sellPriceField.getText()));
//         product.setCurrentStock(currentStockField.getText().isEmpty() ? 0 : Integer.parseInt(currentStockField.getText()));
//         product.setMinStockLevel(minStockLevelField.getText().isEmpty() ? 0 : Integer.parseInt(minStockLevelField.getText()));
//         product.setUnit(unitField.getText());
//         product.setDescription(descriptionField.getText());

//         System.out.println("Name: " + nameField.getText());
//         System.out.println("Category: " + categoryField.getText());
//         System.out.println("Sell_price: " + sellPriceField.getText());
//         System.out.println("CurrentStock: " + currentStockField.getText());
//         System.out.println("MinStockLevel: " + minStockLevelField.getText());
//         System.out.println("Unit: " + unitField.getText());
//         System.out.println("Description: " + descriptionField.getText());
//         System.out.println("Product data: " + product.toString());
//         System.out.println("Product data: " + product.toString());
//         return product;
//     }

//     public void displayProductCreationSuccess(Product product) {
//         JOptionPane.showMessageDialog(this, "Sản Phẩm " + product.getName() + " đã được tạo thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
//     }
//       public void displayError(String message) {
//         JOptionPane.showMessageDialog(this, message, "Lỗi", JOptionPane.ERROR_MESSAGE);
//     }
//     public void clear() {
//         nameField.setText("");
//         categoryField.setText("");
//         sellPriceField.setText("");
//         currentStockField.setText("");
//         minStockLevelField.setText("");
//         unitField.setText("");
//         descriptionField.setText("");
//     }

//     public static void main(String[] args){
//         JFrame frame = new JFrame("Thêm Sản phẩm");
//         ProductView productView = new ProductView();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.add(productView);
//         frame.setSize(500, 500);
//         frame.setLocationRelativeTo(null);
//         frame.setVisible(true);
//     }
// }

// package view;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionListener;
// import model.Product;

// public class ProductView extends JPanel {
//     private JTextField nameField;
//     private JTextField categoryField;
//     private JTextField sellPriceField;
//     private JTextField currentStockField;
//     private JTextField minStockLevelField;
//     private JTextField unitField;
//     private JTextArea descriptionField;
//     private JButton saveButton, cancelButton;

//     public ProductView() {
//         setLayout(new BorderLayout());
//         initUI();
//     }

//     private void initUI() {
//     setLayout(new BorderLayout(10, 10));

//     // Tiêu đề
//     JLabel titleLabel = new JLabel("Thêm Sản phẩm", SwingConstants.CENTER);
//     titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
//     titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
//     add(titleLabel, BorderLayout.NORTH);

//     // Form Panel với GridBagLayout để căn chỉnh tốt hơn
//     JPanel formPanel = new JPanel(new GridBagLayout());
//     formPanel.setBorder(BorderFactory.createTitledBorder("Thông tin sản phẩm"));
//     formPanel.setBackground(Color.WHITE);
//     GridBagConstraints gbc = new GridBagConstraints();
//     gbc.insets = new Insets(8, 10, 8, 10); // padding giữa các field
//     gbc.fill = GridBagConstraints.HORIZONTAL;
//     gbc.gridx = 0;
//     gbc.gridy = 0;
//     Font fieldFont = new Font("Segoe UI", Font.PLAIN, 16);

//     // Tên
//     formPanel.add(new JLabel("Tên:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     nameField = new JTextField(20);
//     nameField.setFont(fieldFont);
//     formPanel.add(nameField, gbc);

//     // Danh mục
//     gbc.gridx = 0;
//     gbc.gridy++;
//     formPanel.add(new JLabel("Danh mục:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     categoryField = new JTextField(20);
//     categoryField.setFont(fieldFont);
//     formPanel.add(categoryField, gbc);

//     // Giá bán
//     gbc.gridx = 0;
//     gbc.gridy++;
//     formPanel.add(new JLabel("Giá bán:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     sellPriceField = new JTextField(20);
//     sellPriceField.setFont(fieldFont);
//     formPanel.add(sellPriceField, gbc);

//     // Tồn kho
//     gbc.gridx = 0;
//     gbc.gridy++;
//     formPanel.add(new JLabel("Tồn kho:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     currentStockField = new JTextField(20);
//     currentStockField.setFont(fieldFont);
//     formPanel.add(currentStockField, gbc);

//     // Tối thiểu tồn kho
//     gbc.gridx = 0;
//     gbc.gridy++;
//     formPanel.add(new JLabel("Tối thiểu tồn kho:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     minStockLevelField = new JTextField(20);
//     minStockLevelField.setFont(fieldFont);
//     formPanel.add(minStockLevelField, gbc);

//     // Đơn vị
//     gbc.gridx = 0;
//     gbc.gridy++;
//     formPanel.add(new JLabel("Đơn vị:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     unitField = new JTextField(20);
//     unitField.setFont(fieldFont);
//     formPanel.add(unitField, gbc);

//     // Mô tả
//     gbc.gridx = 0;
//     gbc.gridy++;
//     gbc.anchor = GridBagConstraints.NORTH;
//     formPanel.add(new JLabel("Mô tả:", SwingConstants.RIGHT), gbc);
//     gbc.gridx = 1;
//     descriptionField = new JTextArea(3, 20);
//     descriptionField.setFont(fieldFont);
//     JScrollPane scrollPane = new JScrollPane(descriptionField);
//     scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//     formPanel.add(scrollPane, gbc);

//     add(formPanel, BorderLayout.CENTER);

//     // Nút Lưu và Hủy
//     JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
//     saveButton = new JButton("Lưu");
//     saveButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
//     cancelButton = new JButton("Hủy");
//     cancelButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
//     buttonPanel.add(saveButton);
//     buttonPanel.add(cancelButton);
//     add(buttonPanel, BorderLayout.SOUTH);
//     }

//     public void setSaveAction(ActionListener actionListener) {
//         saveButton.addActionListener(actionListener);
//     }
//     public void setCancelAction(ActionListener actionListener) {
//         cancelButton.addActionListener(actionListener);
//     }

//     public String getName(){
//         return nameField.getText();
//     }
//     public void setName(String name){
//         nameField.setText(name);
//     }
//     public String getCategory(){
//         return categoryField.getText();
//     }
//     public void setCategory(String category){
//         categoryField.setText(category);
//     }
//     public String getSellPrice(){
//         return sellPriceField.getText();
//     }
//     public void setSellPrice(String sellPrice){
//         sellPriceField.setText(sellPrice);
//     }
//     public String getCurrentStock(){
//         return currentStockField.getText();
//     }
//     public void setCurrentStock(String currentStock){
//         currentStockField.setText(currentStock);
//     }
//     public String getMinStockLevel(){
//         return minStockLevelField.getText();
//     }
//     public void setMinStockLevel(String minStockLevel){
//         minStockLevelField.setText(minStockLevel);
//     }
//     public String getUnit(){
//         return unitField.getText();
//     }
//     public void setUnit(String unit){
//         unitField.setText(unit);
//     }
//     public String getDescription(){
//         return descriptionField.getText();
//     }
//     public void setDescription(String description){
//         descriptionField.setText(description);
//     }

//     public Product getProductData() {
//         Product product = new Product();
//         product.setName(nameField.getText());
//         product.setCategory(categoryField.getText());
//         product.setSellPrice(sellPriceField.getText().isEmpty() ? 0.0f : Float.parseFloat(sellPriceField.getText()));
//         product.setCurrentStock(currentStockField.getText().isEmpty() ? 0 : Integer.parseInt(currentStockField.getText()));
//         product.setMinStockLevel(minStockLevelField.getText().isEmpty() ? 0 : Integer.parseInt(minStockLevelField.getText()));
//         product.setUnit(unitField.getText());
//         product.setDescription(descriptionField.getText());

//         System.out.println("Name: " + nameField.getText());
//         System.out.println("Category: " + categoryField.getText());
//         System.out.println("Sell_price: " + sellPriceField.getText());
//         System.out.println("CurrentStock: " + currentStockField.getText());
//         System.out.println("MinStockLevel: " + minStockLevelField.getText());
//         System.out.println("Unit: " + unitField.getText());
//         System.out.println("Description: " + descriptionField.getText());
//         System.out.println("Product data: " + product.toString());
//         System.out.println("Product data: " + product.toString());
//         return product;
//     }

//     public void displayProductCreationSuccess(Product product) {
//         JOptionPane.showMessageDialog(this, "Sản Phẩm " + product.getName() + " đã được tạo thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
//     }
//       public void displayError(String message) {
//         JOptionPane.showMessageDialog(this, message, "Lỗi", JOptionPane.ERROR_MESSAGE);
//     }
//     public void clear() {
//         nameField.setText("");
//         categoryField.setText("");
//         sellPriceField.setText("");
//         currentStockField.setText("");
//         minStockLevelField.setText("");
//         unitField.setText("");
//         descriptionField.setText("");
//     }

//     public static void main(String[] args){
//         JFrame frame = new JFrame("Thêm Sản phẩm");
//         ProductView productView = new ProductView();
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.add(productView);
//         frame.setSize(500, 500);
//         frame.setLocationRelativeTo(null);
//         frame.setVisible(true);
//     }
// }



package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import model.Product;

public class ProductView extends JPanel {
    private JTextField nameField;
    private JComboBox<String> categoryComboBox;
    private JTextField sellPriceField;
    private JTextField currentStockField;
    private JTextField minStockLevelField;
    private JTextField unitField;
    private JTextArea descriptionField;
    private JButton saveButton, cancelButton;

    public ProductView() {
        setLayout(new BorderLayout());
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout(10, 10));

        // Tiêu đề
        JLabel titleLabel = new JLabel("Thêm Sản phẩm", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
        add(titleLabel, BorderLayout.NORTH);

        // Form Panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createTitledBorder("Thông tin sản phẩm"));
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 10, 8, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        Font fieldFont = new Font("Segoe UI", Font.PLAIN, 16);

        // Tên
        formPanel.add(new JLabel("Tên:", SwingConstants.RIGHT), gbc);
        gbc.gridx = 1;
        nameField = new JTextField(20);
        nameField.setFont(fieldFont);
        formPanel.add(nameField, gbc);

        // Danh mục
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(new JLabel("Danh mục:", SwingConstants.RIGHT), gbc);
        gbc.gridx = 1;
        categoryComboBox = new JComboBox<>(new String[]{"Dụng cụ", "Trang phục", "Nước uống"});
        categoryComboBox.setFont(fieldFont);
        formPanel.add(categoryComboBox, gbc);

        // Giá bán
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(new JLabel("Giá bán:", SwingConstants.RIGHT), gbc);
        gbc.gridx = 1;
        sellPriceField = new JTextField(20);
        sellPriceField.setFont(fieldFont);
        formPanel.add(sellPriceField, gbc);

        // Tồn kho
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(new JLabel("Tồn kho:", SwingConstants.RIGHT), gbc);
        gbc.gridx = 1;
        currentStockField = new JTextField(20);
        currentStockField.setFont(fieldFont);
        formPanel.add(currentStockField, gbc);

        // Tối thiểu tồn kho
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(new JLabel("Tối thiểu tồn kho:", SwingConstants.RIGHT), gbc);
        gbc.gridx = 1;
        minStockLevelField = new JTextField(20);
        minStockLevelField.setFont(fieldFont);
        formPanel.add(minStockLevelField, gbc);

        // Đơn vị
        gbc.gridx = 0;
        gbc.gridy++;
        formPanel.add(new JLabel("Đơn vị:", SwingConstants.RIGHT), gbc);
        gbc.gridx = 1;
        unitField = new JTextField(20);
        unitField.setFont(fieldFont);
        formPanel.add(unitField, gbc);

        // Mô tả
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.NORTH;
        formPanel.add(new JLabel("Mô tả:", SwingConstants.RIGHT), gbc);
        gbc.gridx = 1;
        descriptionField = new JTextArea(3, 20);
        descriptionField.setFont(fieldFont);
        JScrollPane scrollPane = new JScrollPane(descriptionField);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        formPanel.add(scrollPane, gbc);

        add(formPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        saveButton = new JButton("Lưu");
        saveButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        cancelButton = new JButton("Hủy");
        cancelButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void setSaveAction(ActionListener actionListener) {
        saveButton.addActionListener(actionListener);
    }

    public void setCancelAction(ActionListener actionListener) {
        cancelButton.addActionListener(actionListener);
    }

    /**
     * Lấy dữ liệu từ form, validate, nếu hợp lệ trả về Product, nếu lỗi trả về null và hiện lỗi.
     */
    public Product getProductData() {
        try {
            String name = nameField.getText().trim();
            String category = (String) categoryComboBox.getSelectedItem();
            String sellPriceStr = sellPriceField.getText().trim();
            String currentStockStr = currentStockField.getText().trim();
            String minStockLevelStr = minStockLevelField.getText().trim();
            String unit = unitField.getText().trim();
            String description = descriptionField.getText().trim();

            // Kiểm tra dữ liệu bắt buộc
            if (name.isEmpty() || sellPriceStr.isEmpty() || currentStockStr.isEmpty()
                    || minStockLevelStr.isEmpty() || unit.isEmpty()) {
                displayError("Vui lòng điền đầy đủ thông tin!");
                return null;
                
            }

            float sellPrice = Float.parseFloat(sellPriceStr);
            int currentStock = Integer.parseInt(currentStockStr);
            int minStockLevel = Integer.parseInt(minStockLevelStr);

            if (sellPrice <= 0 || sellPrice > 100000000) {
                displayError("Giá bán phải lớn hơn 0 và không vượt quá 100 triệu!");
                return null;
            }

            if (currentStock < 0 || currentStock > 1000) {
                displayError("Tồn kho phải từ 0 đến 1000!");
                return null;
            }

            if (minStockLevel < 0 || minStockLevel > 1000) {
                displayError("Tồn kho tối thiểu phải từ 0 đến 1000!");
                return null;
            }

            Product product = new Product();
            product.setName(name);
            product.setCategory(category);
            product.setSellPrice(sellPrice);
            product.setCurrentStock(currentStock);
            product.setMinStockLevel(minStockLevel);
            product.setUnit(unit);
            product.setDescription(description);

            return product;

        } catch (NumberFormatException e) {
            displayError("Giá bán, tồn kho và tồn kho tối thiểu phải là số hợp lệ!");
            return null;
        }
    }

    public void displayProductCreationSuccess(Product product) {
        JOptionPane.showMessageDialog(this, "Sản phẩm '" + product.getName() + "' đã được tạo thành công!",
                "Thành công", JOptionPane.INFORMATION_MESSAGE);
    }

    public void displayError(String message) {
        JOptionPane.showMessageDialog(this, message, "Lỗi", JOptionPane.ERROR_MESSAGE);
    }

    public void clear() {
        nameField.setText("");
        categoryComboBox.setSelectedIndex(0);
        sellPriceField.setText("");
        currentStockField.setText("");
        minStockLevelField.setText("");
        unitField.setText("");
        descriptionField.setText("");
    }

    // Nếu bạn muốn test riêng class này:
    public static void main(String[] args) {
        JFrame frame = new JFrame("Thêm Sản phẩm");
        ProductView productView = new ProductView();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(productView);
        frame.setSize(500, 550);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
