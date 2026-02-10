package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AttentionDetail: ImageVector? = null

val Icons.Br.AttentionDetail: ImageVector
    get() = _AttentionDetail ?: UXIcon(name = "AttentionDetail") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 16f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(23.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-2.4f, -2.4f)
            curveToRelative(-0.89f, 0.53f, -1.93f, 0.84f, -3.04f, 0.84f)
            curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
            reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            curveToRelative(0f, 1.11f, -0.31f, 2.15f, -0.84f, 3.04f)
            lineToRelative(2.4f, 2.4f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(19.74f, 16.83f)
            curveToRelative(0.33f, -0.5f, 0.33f, -1.16f, 0f, -1.66f)
            curveToRelative(-0.63f, -0.95f, -1.82f, -2.17f, -3.74f, -2.17f)
            curveToRelative(-1.97f, 0f, -3.17f, 1.28f, -3.79f, 2.24f)
            curveToRelative(-0.29f, 0.45f, -0.29f, 1.06f, 0f, 1.52f)
            curveToRelative(0.62f, 0.96f, 1.82f, 2.24f, 3.79f, 2.24f)
            curveToRelative(1.92f, 0f, 3.11f, -1.22f, 3.74f, -2.17f)
            close()
            moveTo(9.5f, 21.0f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(-0.01f)
            curveToRelative(0.06f, -0.0f, 0.13f, -0.0f, 0.19f, -0.01f)
            curveToRelative(0.82f, -0.14f, 1.37f, -0.91f, 1.23f, -1.73f)
            curveToRelative(-0.19f, -1.14f, -0.72f, -2.17f, -1.54f, -2.99f)
            lineToRelative(-2.66f, -2.66f)
            curveToRelative(-1.02f, -1.02f, -2.44f, -1.61f, -3.89f, -1.61f)
            horizontalLineToRelative(-6.34f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _AttentionDetail = it }
