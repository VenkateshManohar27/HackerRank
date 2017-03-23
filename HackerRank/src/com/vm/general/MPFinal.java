package com.vm.general;

import java.util.Scanner;

public class MPFinal {

	private static char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

	private static char[] consonants = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't',
			'v', 'w', 'x', 'z' };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < consonants.length; i++) {
			if (n == 1) {
				System.out.println(""+consonants[i]);
			} else {
				for (int j = 0; j < vowels.length; j++) {
					if (n == 2) {
						System.out.println(""+consonants[i] + vowels[j]);
					} else {
						for (int k = 0; k < consonants.length; k++) {
							if (n == 3) {
								System.out.println(""+consonants[i] + vowels[j] + consonants[k]);
							} else {
								for (int l = 0; l < vowels.length; l++) {
									if (n == 4) {
										System.out.println(
												""+consonants[i] + vowels[j] + consonants[k] + vowels[l]);
									} else {
										for (int m = 0; m < consonants.length; m++) {
											if (n == 5) {
												System.out.println(""+consonants[i] + vowels[j]
														+ consonants[k] + vowels[l] + consonants[m]);
											} else {
												for (int o = 0; o < vowels.length; o++) {
													if (n == 6) {
														System.out.println(""+consonants[i] + vowels[j]
																+ consonants[k] + vowels[l] + consonants[m]
																+ vowels[o]);
													}

												}
											}

										}
									}

								}
							}
						}
					}
				}

			}
		}

		for (int i = 0; i < vowels.length; i++) {
			if (n == 1) {
				System.out.println(""+vowels[i]);
			} else {
				for (int j = 0; j < consonants.length; j++) {
					if (n == 2) {
						System.out.println(""+vowels[i] + consonants[j]);
					} else {
						for (int k = 0; k < vowels.length; k++) {
							if (n == 3) {
								System.out.println(""+vowels[i] + consonants[j] + vowels[k]);
							} else {
								for (int l = 0; l < consonants.length; l++) {
									if (n == 4) {
										System.out.println(
												""+vowels[i] + consonants[j] + vowels[k] + consonants[l]);
									} else {
										for (int m = 0; m < vowels.length; m++) {
											if (n == 5) {
												System.out.println(""+vowels[i] + consonants[j] + vowels[k]
														+ consonants[l] + vowels[m]);
											} else {
												for (int o = 0; o < consonants.length; o++) {
													if (n == 6) {
														System.out.println(
																""+vowels[i] + consonants[j] + vowels[k]
																		+ consonants[l] + vowels[m] + consonants[o]);
													}

												}
											}

										}
									}

								}
							}
						}
					}
				}

			}
		}

		in.close();
	}
}
