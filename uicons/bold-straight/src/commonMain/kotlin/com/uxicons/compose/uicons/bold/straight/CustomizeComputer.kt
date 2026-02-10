package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CustomizeComputer: ImageVector? = null

val Icons.Bs.CustomizeComputer: ImageVector
    get() = _CustomizeComputer ?: UXIcon(name = "CustomizeComputer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 9.24f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(12.76f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineTo(6.5f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(12.54f)
                lineToRelative(-2.68f, 3f)
                lineTo(3.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-6.76f)
                close()
                moveTo(8.5f, 14f)
                horizontalLineToRelative(5f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                curveToRelative(-4f, 0f, -5f, 6f, -5f, 6f)
                close()
                moveTo(18.17f, 9.25f)
                lineToRelative(5.13f, -5.13f)
                curveToRelative(0.94f, -0.94f, 0.94f, -2.47f, 0.0f, -3.41f)
                curveToRelative(-0.94f, -0.94f, -2.47f, -0.94f, -3.41f, -0.0f)
                curveToRelative(-0.03f, 0.03f, -4.95f, 5.53f, -4.95f, 5.53f)
                curveToRelative(1.49f, 0.45f, 2.69f, 1.56f, 3.23f, 3.01f)
                close()
            }
        }.also { _CustomizeComputer = it}
