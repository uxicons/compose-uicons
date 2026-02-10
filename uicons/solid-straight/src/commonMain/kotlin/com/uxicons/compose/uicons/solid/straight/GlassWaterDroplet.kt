package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWaterDroplet: ImageVector? = null

val Icons.Ss.GlassWaterDroplet: ImageVector
    get() = _GlassWaterDroplet ?: UXIcon(name = "GlassWaterDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.45f, 16.02f)
                lineToRelative(-0.46f, 5.24f)
                curveToRelative(-0.14f, 1.56f, -1.42f, 2.74f, -2.99f, 2.74f)
                lineTo(5.82f, 24.0f)
                curveToRelative(-1.55f, 0f, -2.86f, -1.21f, -2.99f, -2.75f)
                lineToRelative(-0.46f, -5.56f)
                curveToRelative(0.64f, 1.36f, 2.02f, 2.31f, 3.63f, 2.31f)
                curveToRelative(1.19f, 0f, 2.27f, -0.53f, 3f, -1.36f)
                curveToRelative(0.73f, 0.83f, 1.81f, 1.36f, 3f, 1.36f)
                reflectiveCurveToRelative(2.27f, -0.53f, 3f, -1.36f)
                curveToRelative(0.73f, 0.83f, 1.81f, 1.36f, 3f, 1.36f)
                curveToRelative(1.47f, 0f, 2.75f, -0.79f, 3.45f, -1.98f)
                close()
                moveTo(12f, 10f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.64f, -0.75f, -1.72f, -1.5f, -2.56f)
                curveToRelative(-0.75f, 0.84f, -1.5f, 1.93f, -1.5f, 2.56f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(2.23f, 14f)
                lineTo(1.08f, 0f)
                horizontalLineToRelative(21.77f)
                lineToRelative(-1.23f, 14f)
                horizontalLineToRelative(-1.63f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-1.76f)
                close()
                moveTo(8.5f, 8.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -2f, -2.35f, -4.29f, -2.82f, -4.73f)
                lineToRelative(-0.68f, -0.64f)
                lineToRelative(-0.68f, 0.64f)
                curveToRelative(-0.47f, 0.44f, -2.82f, 2.73f, -2.82f, 4.73f)
                close()
            }
        }.also { _GlassWaterDroplet = it}
