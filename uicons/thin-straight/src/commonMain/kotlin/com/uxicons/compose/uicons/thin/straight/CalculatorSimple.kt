package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalculatorSimple: ImageVector? = null

val Icons.Ts.CalculatorSimple: ImageVector
    get() = _CalculatorSimple ?: UXIcon(name = "CalculatorSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 11.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-11.5f)
                lineTo(0f, 12.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(11.5f)
                lineTo(11.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(15f, 17f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(1f)
                close()
                moveTo(15f, 21f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(1f)
                close()
                moveTo(9f, 4f)
                lineTo(0f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                close()
                moveTo(20f, 4f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(8.15f, 15.15f)
                lineToRelative(-3.65f, 3.65f)
                lineToRelative(-3.65f, -3.65f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.65f, 3.65f)
                lineTo(0.15f, 23.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.65f, -3.65f)
                lineToRelative(3.65f, 3.65f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.65f, -3.65f)
                lineToRelative(3.65f, -3.65f)
                lineToRelative(-0.71f, -0.71f)
                close()
            }
        }.also { _CalculatorSimple = it}
