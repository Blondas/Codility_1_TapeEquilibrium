class Solution {
    private int miejsceCiecia;
    private long najmniejszaRoznica;
    private long lewaStrona = 0;
    private long prawaStrona = 0;
    private long suma = 0;

    public int solution(int[] A) {
        // initial sum:
        int i;
        for (i = 0; i < A.length; i++) {
            suma += A[i];
        }

        // szukanie najmniejszej roznicy:
        najmniejszaRoznica = suma;
        for (i = 0; i < A.length -1; i++) {
            lewaStrona += A[i];
            prawaStrona = suma - lewaStrona;

            long roznica = lewaStrona - prawaStrona;
            if (roznica < 0) {
                roznica = 0 - roznica;
            }

            if (i == 0 || roznica < najmniejszaRoznica) {
                najmniejszaRoznica = roznica;
                miejsceCiecia = i;
            }

            if (najmniejszaRoznica == 0) {
                return 0;
            }
        }

        return (int) najmniejszaRoznica;
    }
}
