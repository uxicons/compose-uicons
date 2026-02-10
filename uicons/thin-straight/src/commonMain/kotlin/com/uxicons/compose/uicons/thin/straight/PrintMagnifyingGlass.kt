package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintMagnifyingGlass: ImageVector? = null

val Icons.Ts.PrintMagnifyingGlass: ImageVector
    get() = _PrintMagnifyingGlass ?: UXIcon(name = "PrintMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(1.06f, 0f, 2.04f, -0.37f, 2.81f, -0.99f)
                lineToRelative(3.79f, 3.79f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.79f, -3.79f)
                curveToRelative(0.62f, -0.77f, 0.99f, -1.75f, 0.99f, -2.81f)
                close()
                moveTo(16.5f, 20f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(21.5f, 6f)
                horizontalLineToRelative(-2.5f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 6f)
                lineTo(2.5f, 6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                lineTo(5f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-1f)
                lineTo(6f, 23f)
                lineTo(6f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(5f, 14f)
                verticalLineToRelative(6f)
                lineTo(1f, 20f)
                lineTo(1f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(6f, 1f)
                horizontalLineToRelative(12f)
                lineTo(18f, 6f)
                lineTo(6f, 6f)
                lineTo(6f, 1f)
                close()
            }
        }.also { _PrintMagnifyingGlass = it}
