package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dewpoint: ImageVector? = null

val Icons.Ts.Dewpoint: ImageVector
    get() = _Dewpoint ?: UXIcon(name = "Dewpoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 24f)
                curveToRelative(-2.67f, 0f, -5.18f, -1.04f, -7.07f, -2.93f)
                curveTo(-0.98f, 17.16f, -0.98f, 10.3f, 2.93f, 6.39f)
                lineTo(10f, 0.04f)
                lineToRelative(7.05f, 6.34f)
                curveToRelative(3.93f, 3.93f, 3.93f, 10.79f, 0.02f, 14.7f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.89f, 1.89f, -4.4f, 2.93f, -7.07f, 2.93f)
                close()
                moveTo(10f, 1.39f)
                lineTo(3.62f, 7.12f)
                curveToRelative(-3.51f, 3.51f, -3.51f, 9.71f, 0.02f, 13.24f)
                curveToRelative(1.7f, 1.7f, 3.96f, 2.64f, 6.36f, 2.64f)
                reflectiveCurveToRelative(4.66f, -0.94f, 6.36f, -2.64f)
                curveToRelative(3.53f, -3.53f, 3.53f, -9.73f, 0f, -13.26f)
                lineTo(10f, 1.39f)
                close()
                moveTo(21.5f, 5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(21.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _Dewpoint = it}
