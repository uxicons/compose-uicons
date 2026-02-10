package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFuturePast: ImageVector? = null

val Icons.Tr.ClockFuturePast: ImageVector
    get() = _ClockFuturePast ?: UXIcon(name = "ClockFuturePast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3.5f)
                lineTo(24f, 7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.74f)
                curveToRelative(-1.64f, -4.19f, -5.73f, -7f, -10.24f, -7f)
                curveTo(6.09f, 1f, 1.26f, 5.62f, 1.01f, 11.52f)
                curveToRelative(-0.01f, 0.27f, -0.23f, 0.48f, -0.5f, 0.48f)
                curveToRelative(-0.01f, 0f, -0.01f, 0f, -0.02f, 0f)
                curveToRelative(-0.28f, -0.01f, -0.49f, -0.24f, -0.48f, -0.52f)
                curveTo(0.29f, 5.04f, 5.55f, 0f, 12f, 0f)
                curveToRelative(4.77f, 0f, 9.11f, 2.88f, 11f, 7.22f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(23.51f, 12f)
                curveToRelative(-0.32f, -0.02f, -0.51f, 0.2f, -0.52f, 0.48f)
                curveToRelative(-0.25f, 5.9f, -5.08f, 10.52f, -10.99f, 10.52f)
                curveToRelative(-4.51f, 0f, -8.61f, -2.81f, -10.24f, -7f)
                horizontalLineToRelative(3.74f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(1.5f, 15.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.72f)
                curveToRelative(1.89f, 4.34f, 6.23f, 7.22f, 11f, 7.22f)
                curveToRelative(6.45f, 0f, 11.71f, -5.04f, 11.99f, -11.48f)
                curveToRelative(0.01f, -0.28f, -0.2f, -0.51f, -0.48f, -0.52f)
                close()
                moveTo(11.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.17f, 0.08f, 0.32f, 0.22f, 0.42f)
                lineToRelative(4.5f, 3f)
                curveToRelative(0.09f, 0.06f, 0.18f, 0.08f, 0.28f, 0.08f)
                curveToRelative(0.16f, 0f, 0.32f, -0.08f, 0.42f, -0.22f)
                curveToRelative(0.15f, -0.23f, 0.09f, -0.54f, -0.14f, -0.69f)
                lineToRelative(-4.28f, -2.85f)
                lineTo(12f, 5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _ClockFuturePast = it}
