package test;

public abstract class _ProgrammerLevel {

	public abstract void javaP();
	public abstract void jspP();
	public abstract void springP();
	public abstract void showLevelMessage();
	

	final public void temp(int count) {
		javaP();
		jspP();
		for(int i =0; i < count; i++){
			springP();
		}
		
}

}