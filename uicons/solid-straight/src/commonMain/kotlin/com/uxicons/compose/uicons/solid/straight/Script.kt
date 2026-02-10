package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Script: ImageVector? = null

val Icons.Ss.Script: ImageVector
    get() = _Script ?: UXIcon(name = "Script") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(0f, 5f)
                lineTo(0f, 1.5f)
                curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(12f, 19f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.92f, -0.28f, 1.78f, -0.76f, 2.5f)
                horizontalLineToRelative(9.26f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(24f, 2.54f)
                curveToRelative(0f, 0.68f, -0.26f, 1.32f, -0.74f, 1.79f)
                lineToRelative(-6.67f, 6.67f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                lineTo(19.67f, 0.74f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0f)
                curveToRelative(0.48f, 0.48f, 0.74f, 1.12f, 0.74f, 1.79f)
                close()
                moveTo(17.42f, 13.0f)
                horizontalLineToRelative(-6.42f)
                verticalLineToRelative(-6.42f)
                lineTo(17.34f, 0.24f)
                curveToRelative(-0.42f, -0.15f, -0.86f, -0.24f, -1.33f, -0.24f)
                lineTo(4.66f, 0f)
                curveToRelative(0.22f, 0.46f, 0.34f, 0.96f, 0.34f, 1.5f)
                verticalLineToRelative(19.86f)
                curveToRelative(0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f)
                curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-6.58f)
                lineToRelative(-2.58f, 2.58f)
                close()
            }
        }.also { _Script = it}
