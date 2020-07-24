object C{
	fun main(){
		for(s in 1..400){
			val url=URL(spec:"TypeURLhere");
			run(url)
		}
	}
	private fun run(url:URL){
		Thread{
			url.openStream()
			println(OK)
			run(url);
		}.start()
	}
}
fun main()=C.main();
