package github.cdtft;

import java.util.StringJoiner;

/**
 * @author : wangcheng
 * @date : 2020年04月02日 14:13
 */
public class MyTestBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", MyTestBean.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.toString();
	}
}
