package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeFast: ImageVector? = null

val Icons.Tr.TimeFast: ImageVector
    get() = _TimeFast ?: UXIcon(name = "TimeFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(0.5f, 20f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(0.5f, 19f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(0.5f, 16f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(0.5f, 15f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 0.17f, 0.0f, 0.35f, 0.01f, 0.52f)
                curveToRelative(0.01f, 0.28f, 0.25f, 0.49f, 0.52f, 0.48f)
                curveToRelative(0.28f, -0.01f, 0.49f, -0.25f, 0.48f, -0.52f)
                curveToRelative(-0.01f, -0.16f, -0.01f, -0.32f, -0.01f, -0.48f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 5.91f, -4.62f, 10.74f, -10.52f, 10.99f)
                curveToRelative(-0.28f, 0.01f, -0.49f, 0.24f, -0.48f, 0.52f)
                curveToRelative(0.01f, 0.27f, 0.23f, 0.48f, 0.5f, 0.48f)
                curveToRelative(0.01f, 0f, 0.01f, 0f, 0.02f, 0f)
                curveToRelative(6.44f, -0.28f, 11.48f, -5.54f, 11.48f, -11.99f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(12.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.17f, 0.09f, 0.33f, 0.23f, 0.42f)
                lineToRelative(4f, 2.5f)
                curveToRelative(0.08f, 0.05f, 0.17f, 0.08f, 0.27f, 0.08f)
                curveToRelative(0.17f, 0f, 0.33f, -0.08f, 0.42f, -0.23f)
                curveToRelative(0.15f, -0.23f, 0.07f, -0.54f, -0.16f, -0.69f)
                lineToRelative(-3.77f, -2.36f)
                verticalLineToRelative(-5.22f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _TimeFast = it}
