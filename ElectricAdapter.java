package 设计模式;

public class ElectricAdapter implements DirectCurrent {
	AlternateCurrent out;

	ElectricAdapter(AlternateCurrent out) {
		this.out = out;
	}

	public String giveDirectCurrent() {
		String m = out.giveAlternateCurrent();
		StringBuffer str = new StringBuffer(m);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				str.setCharAt(i, '1');
			}
		}
		m = new String(str);
		return m;
	}
}
