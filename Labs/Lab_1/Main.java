public class Main {
 
    public static void main(String[] args) {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите размерность матрицы: ");
            String  n= br.readLine();
            int m=Integer.valueOf(n).intValue();
            System.out.println("Введите границы рандома: ");
            String  Q= br.readLine();
            int q=Integer.valueOf(Q).intValue();
            String  W= br.readLine();
            int w=Integer.valueOf(W).intValue();
 
            System.out.println("Ваша матрица: ");
            //пїЅпїЅпїЅпїЅпїЅпїЅпїЅ
            int[][] A = new int[m][m];
            for (int i=0; i<m; i++)
            {
                for (int j=0; j<m; j++)
                {
                    A[i][j] = q+ (int) (Math.random()*((w-q)+1));
                }
            }
            // пїЅпїЅпїЅпїЅпїЅ
            for (int i=0; i<m; i++)
            {
                for (int j=0; j<m; j++)
                {
                    System.out.print( A[i][j]+" ");
                }
                System.out.print("\n");
            }
 
 
            System.out.println("Выбирайте столбец: ");
            String  E= br.readLine();
            int e=Integer.valueOf(E).intValue();
 
 
            System.out.println("Итог:");
 
            for (int i=0;  i<m; i++)
                for (int k=i+1; k < m; k++) {
                    if (A[i][e] > A[k][e]){
                        for (int j=0; j < m; j++) {
                            int temp = A[i][j];
                            A[i][j]=A[k][j];
                            A[k][j]=temp;
                        }
                    }
                }
 
 
 
            for (int i=0; i<m; i++)
            {
                for (int j=0; j<m; j++)
                {
                    System.out.print(A[i][j]+" ");
                }
                System.out.print("\n");
            }
        } catch (IOException r) {
            System.out.println("ошибка ввода " + r);
        }
        catch (NumberFormatException r) {
            System.out.println("ошибка невозможного преобразования строки в числовой формат " + r);
        }
 
 
 
    }
}