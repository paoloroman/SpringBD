package PracticaWebinarsDao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.ResourceUtils;

import PracticaWebinars.Pelicula;

public class LectorFicheroPeliculas {

	public static List<Pelicula> lector(final String path, String separador, final String listSeparador) {

		List<Pelicula> resultado = new ArrayList<>();
		try {
			resultado = Files.lines(Paths.get(ResourceUtils.getFile(path).toURI())).skip(1)
					.map(line -> {
						// TODO Lo que hacemos es hacer un split que es separar con el separador que indicamos
						//y en Arrays.asList hacemos lo mismo separamos con un split y lo indicamos en el metodo 
						String[] values = line.split(separador);
						return new Pelicula(Long.parseLong(values[0]), values[1], values[2],
							Arrays.asList(values[3].split(listSeparador)));

			}).collect(Collectors.toList());
		} catch (IOException e) {
			System.err.println("Error de lectura del fichero de datos");
			
			e.printStackTrace();
		}

		return resultado;

	}
}
