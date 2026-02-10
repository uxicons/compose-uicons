package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalfStroke: ImageVector? = null

val Icons.Tr.HeartHalfStroke: ImageVector
    get() = _HeartHalfStroke ?: UXIcon(name = "HeartHalfStroke") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.19f, 3.82f)
                curveToRelative(-1.15f, -1.19f, -2.69f, -1.82f, -4.46f, -1.82f)
                curveToRelative(-2.18f, 0.05f, -4.19f, 1.26f, -5.24f, 3.16f)
                curveToRelative(-0.02f, 0.04f, -0.23f, 0.4f, -0.47f, 0.95f)
                curveToRelative(-0.24f, -0.61f, -0.48f, -0.95f, -0.48f, -0.95f)
                curveToRelative(-1.06f, -1.91f, -3.07f, -3.12f, -5.26f, -3.17f)
                curveToRelative(-1.77f, 0f, -3.31f, 0.63f, -4.46f, 1.83f)
                curveTo(0.59f, 5.09f, -0.07f, 6.9f, 0f, 8.78f)
                curveToRelative(0f, 4.84f, 5.7f, 10.33f, 9.1f, 13.16f)
                curveToRelative(0.84f, 0.7f, 1.87f, 1.05f, 2.91f, 1.05f)
                reflectiveCurveToRelative(2.06f, -0.35f, 2.9f, -1.05f)
                curveToRelative(2.73f, -2.28f, 9.08f, -8.11f, 9.08f, -13.11f)
                curveToRelative(0.07f, -1.92f, -0.59f, -3.75f, -1.81f, -5.02f)
                close()
                moveTo(14.28f, 21.18f)
                curveToRelative(-0.66f, 0.55f, -1.47f, 0.82f, -2.27f, 0.82f)
                lineTo(12.01f, 10f)
                curveToRelative(0f, -1.93f, 1.34f, -4.32f, 1.35f, -4.34f)
                curveToRelative(0.88f, -1.6f, 2.57f, -2.61f, 4.38f, -2.65f)
                curveToRelative(1.49f, 0f, 2.78f, 0.52f, 3.73f, 1.52f)
                curveToRelative(1.03f, 1.07f, 1.59f, 2.63f, 1.53f, 4.3f)
                curveToRelative(0f, 4.72f, -6.67f, 10.65f, -8.72f, 12.36f)
                close()
            }
        }.also { _HeartHalfStroke = it}
