import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("HISTROGRAM");
        setContentPane(createPanel());
        pack();
    }

    public void execute() {
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart(
                "JFreeChart Histogram",
                "Dominio de e-mail",
                "Nº de e-mails",
                dataSet,
                PlotOrientation.VERTICAL,
                false,
                rootPaneCheckingEnabled,
                rootPaneCheckingEnabled);
        return chart;
    }

    private DefaultCategoryDataset createDataSet() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(15, "", "gmail.com");
        dataSet.addValue(10, "", "hotmail.com");
        dataSet.addValue(15, "", "outlook.es");
        dataSet.addValue(20, "", "ulpgc.es");
        return dataSet;
    }
}
