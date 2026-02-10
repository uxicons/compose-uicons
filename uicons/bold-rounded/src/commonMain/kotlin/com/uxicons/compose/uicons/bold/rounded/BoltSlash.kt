package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoltSlash: ImageVector? = null

val Icons.Br.BoltSlash: ImageVector
    get() = _BoltSlash ?: UXIcon(name = "BoltSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 21.44f)
            lineToRelative(-5.68f, -5.68f)
            lineToRelative(1.53f, -2.44f)
            curveToRelative(0.71f, -1.05f, 0.78f, -2.39f, 0.19f, -3.51f)
            curveToRelative(-0.59f, -1.12f, -1.75f, -1.81f, -3.01f, -1.81f)
            lineToRelative(-2.71f, -0.0f)
            lineToRelative(1.06f, -4.59f)
            curveToRelative(0.38f, -1.32f, -0.18f, -2.66f, -1.34f, -3.19f)
            curveToRelative(-1.09f, -0.51f, -2.36f, -0.11f, -3.1f, 1.01f)
            lineToRelative(-2.76f, 4.4f)
            lineTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.02f, -0.15f, 0.44f, 0.44f)
            reflectiveCurveTo(-0.15f, 1.98f, 0.44f, 2.56f)
            lineToRelative(21f, 21f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            close()
            moveTo(16.59f, 11f)
            curveToRelative(0.2f, 0f, 0.31f, 0.12f, 0.36f, 0.22f)
            curveToRelative(0.05f, 0.1f, 0.09f, 0.25f, -0.05f, 0.47f)
            lineToRelative(-1.19f, 1.9f)
            lineToRelative(-2.59f, -2.59f)
            lineToRelative(3.47f, 0.0f)
            close()
            moveTo(14.4f, 19.35f)
            curveToRelative(0.44f, 0.44f, 0.52f, 1.14f, 0.19f, 1.67f)
            lineToRelative(-1.1f, 1.75f)
            curveToRelative(-0.53f, 0.79f, -1.32f, 1.22f, -2.13f, 1.22f)
            curveToRelative(-0.33f, 0f, -0.66f, -0.07f, -0.97f, -0.22f)
            curveToRelative(-1.15f, -0.53f, -1.71f, -1.87f, -1.34f, -3.19f)
            lineToRelative(1.06f, -4.59f)
            horizontalLineToRelative(-2.56f)
            curveToRelative(-1f, 0f, -2.0f, -0.36f, -2.66f, -1.11f)
            curveToRelative(-1.09f, -1.21f, -1.17f, -2.94f, -0.3f, -4.21f)
            curveToRelative(0f, 0f, 0.41f, -0.73f, 1.09f, -0.05f)
            lineToRelative(8.72f, 8.72f)
            close()
        }
    }.also { _BoltSlash = it }
