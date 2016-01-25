/*
Variable Sized Arrays
Mon 25 Januaray 2016

Made with <3 by Pierre Plantié
*/

int N, Q = 0;

cin >> N >> Q;
int **array;
array = (int**) malloc(N * sizeof(array));

for (int i=0; i < N; i++) {
    int size = 0;
    cin >> size;
    array[i] = (int*) malloc(size * sizeof(array));
    for (int j=0; j < size; j++) {
        cin >> array[i][j];
    }
}
for (int i=0; i < Q; i++) {
    int row, col = 0;
    cin >> row >> col;
    cout << array[row][col] << endl;
    }
return 0;
}
