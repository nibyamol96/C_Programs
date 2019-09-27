#include<stdio.h>
void display_the_matrix(int row, int col, int matrix[row][col]);
void addition_of_2_matrices(int row, int col, int matrix1[row][col], int matrix2[row][col], int sum[row][col]);

int main()
{
  int row;
  int column;
  scanf("%d", &row);
  scanf("%d", &column);
  int matrix1[row][column];
  for(int i = 0; i < row; i++){
   for(int j = 0; j < column; j++)
   {
    scanf("%d", &matrix1[i][j]);
   }
  }
  int matrix2[row][column];
  for(int i = 0; i < row; i++){
   for(int j = 0; j < column; j++)
   {
    scanf("%d", &matrix2[i][j]);
   }
  }
  int sum[row][column];
  addition_of_2_matrices(row, column, matrix1, matrix2, sum);
  display_the_matrix(row, column, sum);
}

void addition_of_2_matrices(int row, int col, int matrix1[row][col], int matrix2[row][col], int sum[row][col])
{
  for(int i = 0; i <= row; i++)
  {
   for(int j = 0; j <= col - 1; j++)
   {
    sum[i][j] = matrix1[i][j] - matrix2[i][j];
   }
  }
}

void display_the_matrix(int row, int col, int matrix[row][col])
{
  for(int i = 0; i <= row - 1; i++)
  {
   for(int j = 0; j <= col - 1; j++)
   {
    printf("%d ",matrix[i][j]);
   }
   printf("\n");
  }
}