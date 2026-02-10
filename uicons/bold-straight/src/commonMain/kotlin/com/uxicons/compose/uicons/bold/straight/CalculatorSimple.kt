package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalculatorSimple: ImageVector? = null

val Icons.Bs.CalculatorSimple: ImageVector
    get() = _CalculatorSimple ?: UXIcon(name = "CalculatorSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 10.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-10.5f)
                lineTo(0f, 13.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10.5f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(16f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(3f)
                close()
                moveTo(16f, 24f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(3f)
                close()
                moveTo(8f, 3f)
                lineTo(0f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(21.5f, 3f)
                lineTo(21.5f, 0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(5.87f, 15.51f)
                lineToRelative(-1.87f, 1.87f)
                lineToRelative(-1.87f, -1.87f)
                lineTo(0.01f, 17.63f)
                lineToRelative(1.87f, 1.87f)
                lineTo(0.01f, 21.37f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.87f, -1.87f)
                lineToRelative(1.87f, 1.87f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.87f, -1.87f)
                lineToRelative(1.87f, -1.87f)
                lineToRelative(-2.12f, -2.12f)
                close()
            }
        }.also { _CalculatorSimple = it}
