package commons;

import java.lang.reflect.Array;

public class MyArrayUtilsEx extends MyArrayUtils {
	public static int[] add(final int[] array, final int element) {
        final int[] newArray = (int[])copyArrayGrow1(array, Integer.TYPE);
        newArray[newArray.length - 1] = element;
        return newArray;
    }
	
	@SuppressWarnings("unused")
	private static Object copyArrayGrow1(final Object array, final Class<?> newArrayComponentType) {
		System.out.println("add(int[], int)方法执行成功！");
        if (array != null) {
            final int arrayLength = Array.getLength(array);
            final Object newArray = Array.newInstance(array.getClass().getComponentType(), arrayLength + 1);
            System.arraycopy(array, 0, newArray, 0, arrayLength);
            return newArray;
        }
        return Array.newInstance(newArrayComponentType, 1);
    }
}
