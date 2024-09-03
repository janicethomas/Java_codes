class ones_flip
{

	static int flipBit(int a)
	{
		if (~a == 0)
		{
			return 8 * sizeof();
		}

		int currLen = 0, prevLen = 0, maxLen = 0;
		while (a != 0)
		{
			if ((a & 1) == 1)
			{
				currLen++;
			}
			else if ((a & 1) == 0)
			{
				prevLen = (a & 2) == 0 ? 0 : currLen;
				currLen = 0;
			}

			maxLen = Math.max(prevLen + currLen, maxLen);

			a >>= 1;
		}
		return maxLen + 1;
	}

	static byte sizeof()
	{
		byte sizeOfInteger = 8;
		return sizeOfInteger;
	}

	public static void main(String[] args)
	{
		// input 1
		System.out.println(flipBit(2));

	// 	// input 2
	// 	System.out.println(flipBit(1775));

	// 	// input 3
	// 	System.out.println(flipBit(15));
	}
}