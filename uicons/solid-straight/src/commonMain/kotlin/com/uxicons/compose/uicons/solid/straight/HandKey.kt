package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandKey: ImageVector? = null

val Icons.Ss.HandKey: ImageVector
    get() = _HandKey ?: UXIcon(name = "HandKey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 8f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                curveToRelative(0f, 1.9f, 1.18f, 3.51f, 2.83f, 4.17f)
                lineToRelative(1.07f, 1.1f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.4f, 1.4f)
                lineToRelative(2.0f, 2f)
                lineToRelative(2.0f, -2f)
                verticalLineToRelative(-5.49f)
                curveToRelative(1.48f, -0.74f, 2.5f, -2.25f, 2.5f, -4.01f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24.0f, 3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(12.21f, 13f)
                curveToRelative(-1.22f, 0f, -2.21f, -0.99f, -2.21f, -2.21f)
                curveToRelative(0f, -1.09f, 0.82f, -2.04f, 1.9f, -2.19f)
                lineToRelative(4.24f, -0.61f)
                lineToRelative(-0.05f, -0.35f)
                horizontalLineToRelative(0f)
                lineToRelative(-0.23f, -1.63f)
                lineToRelative(-4.24f, 0.61f)
                curveToRelative(-0.99f, 0.14f, -1.85f, 0.63f, -2.49f, 1.33f)
                curveToRelative(-1.18f, -1.2f, -2.81f, -1.95f, -4.63f, -1.95f)
                curveToRelative(-0.72f, 0f, -1.41f, 0.12f, -2.05f, 0.34f)
                lineTo(11.33f, 0f)
                horizontalLineToRelative(9.66f)
                curveTo(22.65f, 0f, 24.0f, 1.34f, 24.0f, 3f)
                close()
            }
        }.also { _HandKey = it}
