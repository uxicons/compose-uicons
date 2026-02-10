package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalculatorBill: ImageVector? = null

val Icons.Ss.CalculatorBill: ImageVector
    get() = _CalculatorBill ?: UXIcon(name = "CalculatorBill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 10f)
                lineTo(2.5f, 10f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(4f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 14f)
                lineTo(2f, 14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-11.76f)
                curveToRelative(0.48f, 0.72f, 0.76f, 1.58f, 0.76f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(8f, 2.5f)
                curveTo(8f, 1.03f, 6.74f, -0.14f, 5.24f, 0.01f)
                curveToRelative(-1.3f, 0.13f, -2.24f, 1.32f, -2.24f, 2.63f)
                verticalLineToRelative(5.36f)
                horizontalLineToRelative(5f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(5f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(21f, 6f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }.also { _CalculatorBill = it}
