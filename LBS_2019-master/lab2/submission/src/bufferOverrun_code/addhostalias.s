	.section	__TEXT,__text,regular,pure_instructions
	.build_version macos, 10, 14	sdk_version 10, 14
	.globl	_add_alias              ## -- Begin function add_alias
	.p2align	4, 0x90
_add_alias:                             ## @add_alias
	.cfi_startproc
## %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	subq	$352, %rsp              ## imm = 0x160
	xorl	%eax, %eax
	movl	$256, %ecx              ## imm = 0x100
	movl	%ecx, %r8d
	leaq	-272(%rbp), %r9
	movq	___stack_chk_guard@GOTPCREL(%rip), %r10
	movq	(%r10), %r10
	movq	%r10, -8(%rbp)
	movq	%rdi, -280(%rbp)
	movq	%rsi, -288(%rbp)
	movq	%rdx, -296(%rbp)
	movq	-280(%rbp), %rdx
	movq	-288(%rbp), %rsi
	movq	-296(%rbp), %rdi
	movq	%rdi, -312(%rbp)        ## 8-byte Spill
	movq	%r9, %rdi
	movq	%rsi, -320(%rbp)        ## 8-byte Spill
	movl	%eax, %esi
	movq	%rdx, -328(%rbp)        ## 8-byte Spill
	movq	%r8, %rdx
	leaq	L_.str(%rip), %rcx
	movq	-328(%rbp), %r8         ## 8-byte Reload
	movq	-320(%rbp), %r9         ## 8-byte Reload
	movq	-312(%rbp), %r10        ## 8-byte Reload
	movq	%r10, (%rsp)
	movb	$0, %al
	callq	___sprintf_chk
	leaq	L_.str.1(%rip), %rdi
	leaq	L_.str.2(%rip), %rsi
	movl	%eax, -332(%rbp)        ## 4-byte Spill
	callq	_fopen
	movq	%rax, -304(%rbp)
	cmpq	$0, -304(%rbp)
	jne	LBB0_2
## %bb.1:
	leaq	L_.str.3(%rip), %rdi
	callq	_perror
	movl	$1, %edi
	callq	_exit
LBB0_2:
	leaq	-272(%rbp), %rsi
	movq	-304(%rbp), %rdi
	movb	$0, %al
	callq	_fprintf
	movq	-304(%rbp), %rdi
	movl	%eax, -336(%rbp)        ## 4-byte Spill
	callq	_fclose
	cmpl	$0, %eax
	je	LBB0_4
## %bb.3:
	leaq	L_.str.4(%rip), %rdi
	callq	_perror
	movl	$1, %edi
	callq	_exit
LBB0_4:
	movq	___stack_chk_guard@GOTPCREL(%rip), %rax
	movq	(%rax), %rax
	movq	-8(%rbp), %rcx
	cmpq	%rcx, %rax
	jne	LBB0_6
## %bb.5:
	addq	$352, %rsp              ## imm = 0x160
	popq	%rbp
	retq
LBB0_6:
	callq	___stack_chk_fail
	ud2
	.cfi_endproc
                                        ## -- End function
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
	subq	$32, %rsp
	movl	$0, -4(%rbp)
	movl	%edi, -8(%rbp)
	movq	%rsi, -16(%rbp)
	cmpl	$4, -8(%rbp)
	je	LBB1_2
## %bb.1:
	movq	-16(%rbp), %rax
	movq	(%rax), %rsi
	leaq	L_.str.5(%rip), %rdi
	xorl	%ecx, %ecx
	movb	%cl, %dl
	movb	%dl, %al
	callq	_printf
	movl	$1, %edi
	movl	%eax, -20(%rbp)         ## 4-byte Spill
	callq	_exit
LBB1_2:
	movq	-16(%rbp), %rax
	movq	8(%rax), %rdi
	movq	-16(%rbp), %rax
	movq	16(%rax), %rsi
	movq	-16(%rbp), %rax
	movq	24(%rax), %rdx
	callq	_add_alias
	xorl	%eax, %eax
	addq	$32, %rsp
	popq	%rbp
	retq
	.cfi_endproc
                                        ## -- End function
	.section	__TEXT,__cstring,cstring_literals
L_.str:                                 ## @.str
	.asciz	"%s\t%s\t%s\n"

L_.str.1:                               ## @.str.1
	.asciz	"/home/r00t/hosts"

L_.str.2:                               ## @.str.2
	.asciz	"a"

L_.str.3:                               ## @.str.3
	.asciz	"fopen"

L_.str.4:                               ## @.str.4
	.asciz	"close"

L_.str.5:                               ## @.str.5
	.asciz	"Usage: %s ipaddress hostname alias \n"


.subsections_via_symbols
