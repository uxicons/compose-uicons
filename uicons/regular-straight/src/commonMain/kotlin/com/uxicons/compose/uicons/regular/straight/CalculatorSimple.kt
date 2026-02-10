package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalculatorSimple: ImageVector? = null

val Icons.Rs.CalculatorSimple: ImageVector
    get() = _CalculatorSimple ?: UXIcon(name = "CalculatorSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 11f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-11f)
                lineTo(0f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(11f)
                close()
                moveTo(16f, 18f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 22f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 4f)
                lineTo(0f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 4f)
                lineTo(21f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(7.06f, 15.52f)
                lineToRelative(-2.56f, 2.56f)
                lineToRelative(-2.56f, -2.56f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.56f, 2.56f)
                lineToRelative(-2.56f, 2.56f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.56f, -2.56f)
                lineToRelative(2.56f, 2.56f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.56f, -2.56f)
                lineToRelative(2.56f, -2.56f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }.also { _CalculatorSimple = it}
