package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimePast: ImageVector? = null

val Icons.Tr.TimePast: ImageVector
    get() = _TimePast ?: UXIcon(name = "TimePast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(7.96f, 0f, 4.21f, 2.07f, 2f, 5.41f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(5.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(7.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(2.81f)
                curveTo(4.83f, 2.91f, 8.28f, 1f, 12f, 1f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                curveToRelative(-5.91f, 0f, -10.74f, -4.62f, -10.99f, -10.52f)
                curveToRelative(-0.01f, -0.28f, -0.21f, -0.5f, -0.52f, -0.48f)
                curveToRelative(-0.28f, 0.01f, -0.49f, 0.24f, -0.48f, 0.52f)
                curveToRelative(0.28f, 6.44f, 5.54f, 11.48f, 11.99f, 11.48f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.13f, 0.05f, 0.26f, 0.15f, 0.35f)
                lineToRelative(3f, 3f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-2.85f, -2.85f)
                verticalLineTo(6.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _TimePast = it}
