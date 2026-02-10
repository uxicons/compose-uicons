package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenPlay: ImageVector? = null

val Icons.Ts.ScreenPlay: ImageVector
    get() = _ScreenPlay ?: UXIcon(name = "ScreenPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(15.5f)
                lineTo(24f, 18f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 17f)
                lineTo(1f, 17f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                close()
                moveTo(8f, 13.94f)
                lineToRelative(8.63f, -4.93f)
                lineTo(8f, 4.07f)
                lineTo(8f, 13.94f)
                close()
                moveTo(9f, 5.79f)
                lineToRelative(5.62f, 3.21f)
                lineToRelative(-5.62f, 3.21f)
                lineTo(9f, 5.79f)
                close()
                moveTo(8f, 20f)
                curveToRelative(-0.93f, 0f, -1.71f, 0.64f, -1.93f, 1.5f)
                lineTo(0f, 21.5f)
                verticalLineToRelative(1f)
                lineTo(6.07f, 22.5f)
                curveToRelative(0.22f, 0.86f, 1f, 1.5f, 1.93f, 1.5f)
                reflectiveCurveToRelative(1.71f, -0.64f, 1.93f, -1.5f)
                horizontalLineToRelative(14.07f)
                verticalLineToRelative(-1f)
                lineTo(9.93f, 21.5f)
                curveToRelative(-0.22f, -0.86f, -1f, -1.5f, -1.93f, -1.5f)
                close()
                moveTo(8f, 23f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _ScreenPlay = it}
