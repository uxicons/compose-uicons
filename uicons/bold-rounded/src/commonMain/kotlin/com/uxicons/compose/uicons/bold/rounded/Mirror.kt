package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mirror: ImageVector? = null

val Icons.Br.Mirror: ImageVector
    get() = _Mirror ?: UXIcon(name = "Mirror") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.56f, 18.85f)
            lineToRelative(0.49f, 2.69f)
            curveToRelative(0.23f, 1.28f, -0.75f, 2.46f, -2.05f, 2.46f)
            reflectiveCurveToRelative(-2.29f, -1.18f, -2.05f, -2.46f)
            lineToRelative(0.49f, -2.7f)
            curveToRelative(-2.6f, -0.49f, -4.92f, -2.16f, -6.25f, -4.62f)
            curveToRelative(-0.4f, -0.73f, -0.12f, -1.64f, 0.6f, -2.03f)
            curveToRelative(0.72f, -0.39f, 1.64f, -0.13f, 2.03f, 0.6f)
            curveToRelative(1.07f, 1.98f, 3.06f, 3.21f, 5.18f, 3.21f)
            curveToRelative(3.31f, 0f, 6f, -2.92f, 6f, -6.5f)
            reflectiveCurveToRelative(-2.69f, -6.5f, -6f, -6.5f)
            curveToRelative(-1.0f, 0f, -2.0f, 0.27f, -2.87f, 0.79f)
            curveToRelative(-0.71f, 0.42f, -1.63f, 0.19f, -2.06f, -0.53f)
            curveToRelative(-0.42f, -0.71f, -0.19f, -1.63f, 0.53f, -2.06f)
            curveToRelative(1.33f, -0.79f, 2.86f, -1.21f, 4.4f, -1.21f)
            curveToRelative(4.96f, 0f, 9f, 4.26f, 9f, 9.5f)
            curveToRelative(0f, 4.67f, -3.22f, 8.56f, -7.44f, 9.35f)
            close()
            moveTo(3.08f, 4.61f)
            lineToRelative(0.44f, -1.09f)
            lineToRelative(1.09f, -0.44f)
            curveToRelative(0.52f, -0.19f, 0.52f, -0.97f, 0f, -1.16f)
            lineToRelative(-1.09f, -0.44f)
            lineToRelative(-0.44f, -1.09f)
            curveTo(2.89f, -0.12f, 2.11f, -0.12f, 1.92f, 0.39f)
            lineToRelative(-0.43f, 1.08f)
            lineTo(0.4f, 1.89f)
            curveToRelative(-0.52f, 0.18f, -0.53f, 0.96f, -0.02f, 1.16f)
            lineToRelative(1.1f, 0.46f)
            lineToRelative(0.44f, 1.1f)
            curveToRelative(0.19f, 0.52f, 0.97f, 0.52f, 1.16f, 0f)
            close()
            moveTo(4.8f, 10.03f)
            curveToRelative(0.22f, 0.62f, 1.17f, 0.62f, 1.39f, 0f)
            lineToRelative(0.52f, -1.31f)
            lineToRelative(1.31f, -0.52f)
            curveToRelative(0.62f, -0.22f, 0.62f, -1.17f, 0f, -1.39f)
            lineToRelative(-1.31f, -0.52f)
            lineToRelative(-0.52f, -1.31f)
            curveToRelative(-0.22f, -0.62f, -1.17f, -0.62f, -1.39f, 0f)
            lineToRelative(-0.52f, 1.3f)
            lineToRelative(-1.3f, 0.49f)
            curveToRelative(-0.62f, 0.21f, -0.64f, 1.16f, -0.03f, 1.39f)
            lineToRelative(1.32f, 0.56f)
            lineToRelative(0.53f, 1.32f)
            close()
        }
    }.also { _Mirror = it }
