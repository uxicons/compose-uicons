package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GaugeCircleMinus: ImageVector? = null

val Icons.Br.GaugeCircleMinus: ImageVector
    get() = _GaugeCircleMinus ?: UXIcon(name = "GaugeCircleMinus") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11.5f, 14f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            curveToRelative(0f, -0.5f, 0.19f, -0.96f, 0.5f, -1.31f)
            verticalLineToRelative(-4.19f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(4.19f)
            curveToRelative(0.31f, 0.35f, 0.5f, 0.81f, 0.5f, 1.31f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
            moveTo(7.58f, 16.31f)
            lineToRelative(-1.55f, 1.2f)
            curveToRelative(-0.17f, 0.14f, -0.41f, 0.12f, -0.57f, -0.05f)
            curveToRelative(-1.85f, -1.87f, -2.72f, -4.45f, -2.38f, -7.08f)
            curveToRelative(0.48f, -3.82f, 3.61f, -6.9f, 7.44f, -7.33f)
            curveToRelative(4.43f, -0.49f, 8.44f, 2.4f, 9.32f, 6.74f)
            curveToRelative(0.17f, 0.81f, 0.96f, 1.33f, 1.77f, 1.17f)
            curveToRelative(0.81f, -0.17f, 1.34f, -0.96f, 1.17f, -1.77f)
            curveTo(21.57f, 3.33f, 16.16f, -0.59f, 10.18f, 0.08f)
            curveTo(4.99f, 0.66f, 0.75f, 4.83f, 0.1f, 10.01f)
            curveToRelative(-0.45f, 3.55f, 0.72f, 7.04f, 3.23f, 9.57f)
            curveToRelative(0.68f, 0.69f, 1.58f, 1.04f, 2.47f, 1.04f)
            curveToRelative(0.75f, 0f, 1.5f, -0.25f, 2.12f, -0.76f)
            lineToRelative(1.51f, -1.17f)
            curveToRelative(0.66f, -0.51f, 0.78f, -1.45f, 0.27f, -2.1f)
            curveToRelative(-0.51f, -0.66f, -1.45f, -0.78f, -2.1f, -0.27f)
            close()
            moveTo(24f, 18f)
            curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
            reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            close()
            moveTo(21.5f, 18f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            close()
        }
    }.also { _GaugeCircleMinus = it }
