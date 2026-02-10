package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GaugeCircleMinus: ImageVector? = null

val Icons.Tr.GaugeCircleMinus: ImageVector
    get() = _GaugeCircleMinus ?: UXIcon(name = "GaugeCircleMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 17.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(6.85f, 17.3f)
                lineToRelative(-0.54f, 0.47f)
                curveToRelative(-0.82f, 0.71f, -2.11f, 0.63f, -2.82f, -0.18f)
                curveToRelative(-1.92f, -2.18f, -2.78f, -4.99f, -2.41f, -7.9f)
                curveTo(1.64f, 5.34f, 4.9f, 1.91f, 9.19f, 1.16f)
                curveToRelative(2.74f, -0.48f, 5.47f, 0.14f, 7.67f, 1.74f)
                curveToRelative(2.18f, 1.58f, 3.65f, 4.01f, 4.03f, 6.67f)
                curveToRelative(0.04f, 0.27f, 0.3f, 0.46f, 0.57f, 0.42f)
                curveToRelative(0.27f, -0.04f, 0.46f, -0.29f, 0.42f, -0.57f)
                curveToRelative(-0.42f, -2.92f, -2.03f, -5.59f, -4.43f, -7.34f)
                curveTo(15.03f, 0.33f, 12.03f, -0.35f, 9.02f, 0.17f)
                curveTo(4.29f, 1.0f, 0.7f, 4.77f, 0.09f, 9.56f)
                curveToRelative(-0.41f, 3.2f, 0.53f, 6.29f, 2.65f, 8.69f)
                curveToRelative(0.59f, 0.67f, 1.42f, 1.01f, 2.25f, 1.01f)
                curveToRelative(0.7f, 0f, 1.41f, -0.24f, 1.98f, -0.74f)
                lineToRelative(0.54f, -0.47f)
                curveToRelative(0.21f, -0.18f, 0.23f, -0.5f, 0.05f, -0.71f)
                curveToRelative(-0.18f, -0.21f, -0.5f, -0.23f, -0.71f, -0.05f)
                close()
                moveTo(11f, 13f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.93f, 0.64f, -1.71f, 1.5f, -1.93f)
                lineTo(10.5f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5.57f)
                curveToRelative(0.86f, 0.22f, 1.5f, 1f, 1.5f, 1.93f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(11f, 12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
            }
        }.also { _GaugeCircleMinus = it}
