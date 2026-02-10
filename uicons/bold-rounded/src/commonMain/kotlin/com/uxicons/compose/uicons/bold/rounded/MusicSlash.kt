package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicSlash: ImageVector? = null

val Icons.Br.MusicSlash: ImageVector
    get() = _MusicSlash ?: UXIcon(name = "MusicSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(5.5f, 12f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
            reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(5.5f, 20f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(24f, 6.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-2.83f, 0f, -5.17f, 2.15f, -5.47f, 4.91f)
            lineTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.02f, -0.15f, 0.44f, 0.44f)
            curveTo(-0.15f, 1.02f, -0.15f, 1.98f, 0.44f, 2.56f)
            lineToRelative(21f, 21f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            lineToRelative(-0.65f, -0.65f)
            curveToRelative(0.7f, -0.94f, 1.09f, -2.08f, 1.09f, -3.29f)
            lineTo(24.0f, 6.5f)
            close()
            moveTo(11f, 6.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(6.1f)
            curveToRelative(-0.75f, -0.39f, -1.6f, -0.6f, -2.5f, -0.6f)
            curveToRelative(-1.21f, 0f, -2.35f, 0.39f, -3.29f, 1.09f)
            lineToRelative(-4.21f, -4.21f)
            verticalLineToRelative(-2.38f)
            close()
            moveTo(17.38f, 15.26f)
            curveToRelative(0.34f, -0.17f, 0.72f, -0.26f, 1.12f, -0.26f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            curveToRelative(0f, 0.39f, -0.09f, 0.78f, -0.26f, 1.12f)
            lineToRelative(-3.35f, -3.35f)
            close()
        }
    }.also { _MusicSlash = it }
