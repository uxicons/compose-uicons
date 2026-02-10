package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TintSlash: ImageVector? = null

val Icons.Br.TintSlash: ImageVector
    get() = _TintSlash ?: UXIcon(name = "TintSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.95f, 21.77f)
            curveToRelative(0.22f, 0.8f, -0.25f, 1.62f, -1.05f, 1.84f)
            curveToRelative(-0.94f, 0.26f, -1.92f, 0.39f, -2.9f, 0.39f)
            curveToRelative(-2.94f, 0f, -5.7f, -1.15f, -7.78f, -3.24f)
            curveTo(1.46f, 17.99f, 0.37f, 13.91f, 1.37f, 10.12f)
            curveToRelative(0.21f, -0.8f, 1.03f, -1.28f, 1.83f, -1.07f)
            curveToRelative(0.8f, 0.21f, 1.28f, 1.03f, 1.07f, 1.83f)
            curveToRelative(-0.73f, 2.77f, 0.07f, 5.74f, 2.08f, 7.76f)
            curveToRelative(1.51f, 1.52f, 3.52f, 2.35f, 5.65f, 2.35f)
            curveToRelative(0.71f, 0f, 1.42f, -0.1f, 2.1f, -0.28f)
            curveToRelative(0.8f, -0.22f, 1.62f, 0.25f, 1.84f, 1.05f)
            close()
            moveTo(23.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            reflectiveCurveTo(1.98f, -0.15f, 2.56f, 0.44f)
            lineToRelative(3.24f, 3.24f)
            lineToRelative(2.23f, -2.07f)
            curveToRelative(1.04f, -1.03f, 2.47f, -1.61f, 3.97f, -1.61f)
            reflectiveCurveToRelative(2.93f, 0.58f, 4.0f, 1.64f)
            lineToRelative(3.73f, 3.47f)
            curveToRelative(3.76f, 3.77f, 4.3f, 9.62f, 1.44f, 13.95f)
            lineToRelative(2.39f, 2.39f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(7.92f, 5.8f)
            lineToRelative(11.07f, 11.07f)
            curveToRelative(1.72f, -3.09f, 1.22f, -7.03f, -1.34f, -9.61f)
            lineToRelative(-3.72f, -3.45f)
            curveToRelative(-1.08f, -1.06f, -2.81f, -1.04f, -3.83f, -0.03f)
            lineToRelative(-2.18f, 2.02f)
            close()
        }
    }.also { _TintSlash = it }
