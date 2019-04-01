public void sortColors(int[] nums) {
	if (nums == null || nums.length == 0) {
		return;
	}

	int countZero = 0;
	int countOne = 0;
	int countTwo = 0;

	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == 0) {
			countZero++;
		} else if (nums[i] == 1) {
			countOne++;
		} else {
			countTwo++;
		}
	}

	int index = 0;

	while (countZero > 0) {
		nums[index++] = 0;
		countZero--;
	}

	while (countOne > 0) {
		nums[index++] = 1;
		countOne--;
	}

	while (countTwo > 0) {
		nums[index++] = 2;
		countTwo--;
	}
}
