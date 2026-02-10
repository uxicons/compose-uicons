package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintMagnifyingGlass: ImageVector? = null

val Icons.Bs.PrintMagnifyingGlass: ImageVector
    get() = _PrintMagnifyingGlass ?: UXIcon(name = "PrintMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(0.83f, 0f, 1.62f, -0.21f, 2.31f, -0.57f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.47f, -2.47f)
                curveToRelative(0.36f, -0.69f, 0.57f, -1.48f, 0.57f, -2.31f)
                close()
                moveTo(17f, 19f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(20.5f, 6f)
                horizontalLineToRelative(-1.5f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 6f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11.5f)
                lineTo(5f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                lineTo(5f, 13f)
                verticalLineToRelative(5f)
                lineTo(3f, 18f)
                lineTo(3f, 9.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(8f, 3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(8f, 6f)
                lineTo(8f, 3f)
                close()
            }
        }.also { _PrintMagnifyingGlass = it}
