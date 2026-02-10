package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swap: ImageVector? = null

val Icons.Ts.Swap: ImageVector
    get() = _Swap ?: UXIcon(name = "Swap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 19.86f)
                lineToRelative(-3.31f, 3.61f)
                curveToRelative(-0.3f, 0.34f, -0.74f, 0.53f, -1.2f, 0.53f)
                reflectiveCurveToRelative(-0.9f, -0.2f, -1.2f, -0.54f)
                lineToRelative(-3.32f, -3.62f)
                lineToRelative(0.74f, -0.68f)
                lineToRelative(3.29f, 3.59f)
                verticalLineTo(7.26f)
                curveToRelative(0f, -1.79f, -1.46f, -3.25f, -3.25f, -3.25f)
                reflectiveCurveToRelative(-3.25f, 1.46f, -3.25f, 3.25f)
                verticalLineToRelative(9.49f)
                curveToRelative(0f, 2.34f, -1.91f, 4.25f, -4.25f, 4.25f)
                reflectiveCurveToRelative(-4.25f, -1.91f, -4.25f, -4.25f)
                verticalLineTo(1.25f)
                lineTo(0.73f, 4.81f)
                lineTo(-0.0f, 4.14f)
                lineTo(3.3f, 0.53f)
                curveToRelative(0.6f, -0.68f, 1.79f, -0.68f, 2.4f, 0.0f)
                lineToRelative(3.3f, 3.6f)
                lineToRelative(-0.74f, 0.68f)
                lineToRelative(-3.26f, -3.56f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 1.79f, 1.46f, 3.25f, 3.25f, 3.25f)
                reflectiveCurveToRelative(3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineTo(7.26f)
                curveToRelative(0f, -2.34f, 1.91f, -4.25f, 4.25f, -4.25f)
                reflectiveCurveToRelative(4.25f, 1.91f, 4.25f, 4.25f)
                verticalLineToRelative(15.49f)
                lineToRelative(3.27f, -3.56f)
                lineToRelative(0.74f, 0.68f)
                close()
            }
        }.also { _Swap = it}
