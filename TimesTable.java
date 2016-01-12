public class TimesTable {
   public static void main (String [] args) {
	   int NUM_ROWS = 13;
	   int NUM_COLS = 13;
	   int[][]timesTable = new int[NUM_ROWS][NUM_COLS];
	   for(int i = 1; i < NUM_ROWS; ++i){
         for(int j = 1; j < NUM_COLS; ++j){
			timesTable[i][j] = i * j;
			}
	   }
      for(int i = 1; i < NUM_ROWS; ++i){
         for(int j = 1; j < NUM_COLS; ++j){
         System.out.print(timesTable[i][j] + " ");
         }
         System.out.println();
      }

	}
}
