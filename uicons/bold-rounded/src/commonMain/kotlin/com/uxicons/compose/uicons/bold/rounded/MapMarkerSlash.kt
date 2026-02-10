package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSlash: ImageVector? = null

val Icons.Br.MapMarkerSlash: ImageVector
    get() = _MapMarkerSlash ?: UXIcon(name = "MapMarkerSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.32f, 21.28f)
            curveToRelative(0.39f, 0.73f, 0.12f, 1.64f, -0.6f, 2.03f)
            curveToRelative(-0.83f, 0.45f, -1.77f, 0.69f, -2.71f, 0.69f)
            curveToRelative(-1.51f, 0f, -2.93f, -0.58f, -4.0f, -1.64f)
            lineToRelative(-3.73f, -3.47f)
            curveTo(1.85f, 16.47f, 0.7f, 13.19f, 1.06f, 9.84f)
            curveToRelative(0.09f, -0.82f, 0.83f, -1.41f, 1.65f, -1.33f)
            curveToRelative(0.82f, 0.09f, 1.42f, 0.83f, 1.33f, 1.65f)
            curveToRelative(-0.27f, 2.44f, 0.57f, 4.84f, 2.3f, 6.57f)
            lineToRelative(3.72f, 3.46f)
            curveToRelative(0.88f, 0.87f, 2.2f, 1.03f, 3.22f, 0.48f)
            curveToRelative(0.73f, -0.39f, 1.64f, -0.12f, 2.03f, 0.6f)
            close()
            moveTo(23.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            curveTo(1.02f, -0.15f, 1.98f, -0.15f, 2.56f, 0.44f)
            lineToRelative(2.25f, 2.25f)
            curveTo(6.8f, 0.95f, 9.33f, 0f, 12f, 0f)
            curveToRelative(2.94f, 0f, 5.7f, 1.15f, 7.78f, 3.24f)
            curveToRelative(4.08f, 4.1f, 4.28f, 10.66f, 0.57f, 14.99f)
            lineToRelative(3.21f, 3.21f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            close()
            moveTo(6.94f, 4.82f)
            lineToRelative(11.29f, 11.29f)
            curveToRelative(2.54f, -3.16f, 2.35f, -7.81f, -0.57f, -10.75f)
            curveToRelative(-1.51f, -1.52f, -3.52f, -2.35f, -5.65f, -2.35f)
            curveToRelative(-1.87f, 0f, -3.64f, 0.64f, -5.06f, 1.81f)
            close()
        }
    }.also { _MapMarkerSlash = it }
