// 예제 5-16 스칼라의 Either 클래스

type Error = String
type Success = String
def call(url:String):Either[Error,Success]={
  val response = WS.url(url).get.value.get
  if (valid(response))
    Right(response.body)
  else Left("Invalid response")
}
