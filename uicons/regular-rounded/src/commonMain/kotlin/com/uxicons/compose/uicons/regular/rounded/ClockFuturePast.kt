package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockFuturePast: ImageVector? = null

val Icons.Rr.ClockFuturePast: ImageVector
    get() = _ClockFuturePast ?: UXIcon(name = "ClockFuturePast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 7f)
                verticalLineToRelative(4.4f)
                lineToRelative(3.52f, 2.13f)
                curveToRelative(0.47f, 0.29f, 0.62f, 0.9f, 0.34f, 1.37f)
                curveToRelative(-0.19f, 0.31f, -0.52f, 0.48f, -0.86f, 0.48f)
                curveToRelative(-0.18f, 0f, -0.35f, -0.05f, -0.52f, -0.14f)
                lineToRelative(-4f, -2.42f)
                curveToRelative(-0.3f, -0.18f, -0.48f, -0.51f, -0.48f, -0.85f)
                lineTo(11.0f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(23f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.36f)
                curveTo(19.81f, 2.04f, 16.11f, 0f, 12f, 0f)
                curveTo(5.75f, 0f, 0.61f, 4.69f, 0.05f, 10.91f)
                curveToRelative(-0.05f, 0.55f, 0.36f, 1.04f, 0.91f, 1.09f)
                curveToRelative(0.03f, 0.0f, 0.06f, 0.0f, 0.09f, 0.0f)
                curveToRelative(0.51f, 0f, 0.95f, -0.39f, 0.99f, -0.91f)
                curveTo(2.51f, 5.91f, 6.79f, 2f, 12f, 2f)
                curveToRelative(3.64f, 0f, 6.9f, 1.92f, 8.66f, 5f)
                horizontalLineToRelative(-2.67f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(24f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(23.05f, 12.0f)
                curveToRelative(-0.54f, -0.04f, -1.04f, 0.36f, -1.09f, 0.91f)
                curveToRelative(-0.47f, 5.18f, -4.75f, 9.09f, -9.96f, 9.09f)
                curveToRelative(-3.64f, 0f, -6.9f, -1.92f, -8.66f, -5f)
                horizontalLineToRelative(2.67f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(2f, 15f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.36f)
                curveToRelative(2.19f, 3.32f, 5.89f, 5.36f, 10f, 5.36f)
                curveToRelative(6.25f, 0f, 11.39f, -4.69f, 11.95f, -10.91f)
                curveToRelative(0.05f, -0.55f, -0.36f, -1.04f, -0.91f, -1.09f)
                close()
            }
        }.also { _ClockFuturePast = it}
