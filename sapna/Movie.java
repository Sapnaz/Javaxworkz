class Movie
{
public static String movieName(String movieName)
	{
		System.out.println("Running movieName in Movie");
		if(movieName=="threeIdiots")
		{
		return "Vidhu Vinod Chopra";
		}
		else if(movieName=="bahubali")
		{
		return "Prasad Devineni & Shobu Yarlagadda";
		}
		else if(movieName=="highWay")
		{
		return "Sajid Nadiadwala";
		}
		else if(movieName=="jabWeMet")
		{
		return "Dhilin Mehta";
		}
		else if(movieName=="sitaRamam")
		{
		return "C.Aswini Dutt";
		}
		else
		{
		return "invalid";
		}
	}
}