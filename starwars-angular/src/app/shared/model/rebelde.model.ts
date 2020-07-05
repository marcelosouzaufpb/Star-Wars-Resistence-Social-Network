import { Localizacao } from "./localizacao.model";
import { Inventario } from "./inventario.model";


export class Rebelde {
    nome: string;
    idade: number;
    genero: string;
    eTraidor: boolean;
    localizacao: Localizacao;
    inventario: Inventario[];
}