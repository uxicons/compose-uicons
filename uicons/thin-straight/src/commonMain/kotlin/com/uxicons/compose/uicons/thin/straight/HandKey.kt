package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandKey: ImageVector? = null

val Icons.Ts.HandKey: ImageVector
    get() = _HandKey ?: UXIcon(name = "HandKey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.86f)
                curveToRelative(-1.46f, 0f, -2.64f, -1.19f, -2.64f, -2.64f)
                curveToRelative(0f, -1.31f, 0.97f, -2.43f, 2.27f, -2.62f)
                lineToRelative(5.67f, -0.74f)
                lineToRelative(0.13f, 0.99f)
                lineToRelative(-5.66f, 0.74f)
                curveToRelative(-0.8f, 0.11f, -1.4f, 0.81f, -1.4f, 1.62f)
                curveToRelative(0f, 0.91f, 0.74f, 1.64f, 1.64f, 1.64f)
                horizontalLineToRelative(7.86f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(23.0f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(11.86f, 1f)
                lineToRelative(-5.05f, 3.24f)
                curveToRelative(-0.42f, -0.11f, -0.85f, -0.19f, -1.3f, -0.22f)
                lineTo(11.5f, 0f)
                horizontalLineToRelative(10f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(5f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(10f, 11f)
                curveToRelative(0f, 1.79f, -0.95f, 3.42f, -2.5f, 4.31f)
                verticalLineToRelative(6.2f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-2.48f, -2.47f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-1.41f, -1.42f)
                lineToRelative(1.05f, -1.05f)
                lineToRelative(-1.08f, -1.02f)
                verticalLineToRelative(-1.33f)
                curveToRelative(-1.55f, -0.9f, -2.5f, -2.52f, -2.5f, -4.31f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                close()
                moveTo(9f, 11f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(1f, 8.79f, 1f, 11f)
                curveToRelative(-0.01f, 1.62f, 1.0f, 3.06f, 2.5f, 3.7f)
                verticalLineToRelative(1.51f)
                lineToRelative(1.51f, 1.43f)
                lineToRelative(-1.07f, 1.07f)
                lineToRelative(1.41f, 1.42f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(1.5f, -1.5f)
                verticalLineToRelative(-6.4f)
                curveToRelative(1.5f, -0.64f, 2.51f, -2.08f, 2.5f, -3.7f)
                close()
            }
        }.also { _HandKey = it}
