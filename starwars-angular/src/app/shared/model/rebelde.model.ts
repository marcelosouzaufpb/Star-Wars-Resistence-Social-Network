import { Localizacao } from "./localizacao.model";
import { Inventario } from "./inventario.model";


export class Rebelde {
    nome: string;
    idade: number;
    genero: string;
    localizacao: Localizacao;
    inventario: Inventario[];
}