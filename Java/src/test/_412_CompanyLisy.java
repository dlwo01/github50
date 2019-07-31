package test;

import java.util.ArrayList;
import java.util.List;

public class _412_CompanyLisy {

	public List<_412_Company> arrList;
	// ArrayList 상위클래스가 List 다형성적용

	public _412_CompanyLisy() {
		arrList = new ArrayList<_412_Company>();
	}
	public void insertcom(_412_Company comp){
		arrList.add(comp);
	}
	public boolean deleteCompany(int companyId){
		for(int i = 0; i < arrList.size(); i++) {
			_412_Company cp = arrList.get(i);
			int tempId = cp.getCompanyId();
			if(tempId == companyId) {
				arrList.remove(i);
				return true;
		}
		}
		System.out.println(companyId + "존재하지 않습니다.");
		return false;
		}
		
	public void showComanyInfo() {
		for(_412_Company com : arrList) {
			System.out.println(com);
		}
		System.out.println();
	}
}
