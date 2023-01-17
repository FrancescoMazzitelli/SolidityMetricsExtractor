package extractor.metrics;

import java.util.StringTokenizer;

public class LOCMetricExtractor {

	private String separator;
	private int cloc;
	private int start;
	private int end;
	
	public LOCMetricExtractor(String separator, int start, int end) {
		this.separator = separator;
		cloc = 0;
		this.start = start;
		this.end = end;
	}
	
	public void calculateLOCMetrics(String code) {
		int skip = 0;
		StringTokenizer st = new StringTokenizer(code, separator);
		while (st.hasMoreTokens()) {
			String x = st.nextToken();
			if (skip<start) {
				skip++;
				continue;
			}
			if (!x.trim().isEmpty()) {
				if (!x.trim().startsWith("/*") && !x.trim().startsWith("*") && !x.trim().startsWith("//") && !x.trim().endsWith("*/")) {
					if (x.trim().contains("//")) {
						cloc++;
					}
				} else {
					cloc++;
				}
			}
			skip++;
			if (skip>end) {
				break;
			}
		}
	}
	
	/**
	 * Metodo che restituisce la metrica CLOC
	 * @return
	 */
	public int getCLOC() {
		return cloc;
	}
}
