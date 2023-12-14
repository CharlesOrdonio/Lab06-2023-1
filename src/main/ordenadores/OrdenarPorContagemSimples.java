package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int max = array[0];
        int x = 0;
        while(x < array.length){
            if(max < array[x + 1]){
                max = array[x + 1];
            }
            x = x + 1;
        }

        int[] lista;
        lista = new int[max];
        for(int i = 0; i < array.length; i++){
            lista[array[i]] = array[i];
        }

        for(int j = 0; j < lista.length; j++){
            if(lista[j] == j){
                System.out.println(j);

            }
        }

        return array;
    }
    
}
