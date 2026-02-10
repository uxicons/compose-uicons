package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenPlay: ImageVector? = null

val Icons.Bs.ScreenPlay: ImageVector
    get() = _ScreenPlay ?: UXIcon(name = "ScreenPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(13.5f)
                lineTo(24f, 17f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 14f)
                lineTo(3f, 14f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21f, 14f)
                close()
                moveTo(10.5f, 21.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(12.09f, 20f)
                horizontalLineToRelative(11.91f)
                verticalLineToRelative(3f)
                lineTo(12.09f, 23f)
                curveToRelative(0.17f, -0.47f, 0.28f, -0.97f, 0.28f, -1.5f)
                reflectiveCurveToRelative(-0.11f, -1.03f, -0.28f, -1.5f)
                close()
                moveTo(3.91f, 20f)
                curveToRelative(-0.17f, 0.47f, -0.28f, 0.97f, -0.28f, 1.5f)
                reflectiveCurveToRelative(0.11f, 1.03f, 0.28f, 1.5f)
                lineTo(0f, 23f)
                verticalLineToRelative(-3f)
                lineTo(3.91f, 20f)
                close()
                moveTo(9f, 5.17f)
                lineToRelative(6f, 3.33f)
                lineToRelative(-6f, 3.33f)
                lineTo(9f, 5.17f)
                close()
            }
        }.also { _ScreenPlay = it}
