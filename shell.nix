{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  name = "libcorbac";
  nativeBuildInputs = with pkgs;
  [
    act
  ];
}
