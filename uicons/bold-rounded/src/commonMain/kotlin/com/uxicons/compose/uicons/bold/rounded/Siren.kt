package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Siren: ImageVector? = null

val Icons.Br.Siren: ImageVector
    get() = _Siren ?: UXIcon(name = "Siren") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.76f, 19.03f)
            lineToRelative(-1.41f, -14.07f)
            curveToRelative(-0.28f, -2.82f, -2.63f, -4.95f, -5.47f, -4.95f)
            horizontalLineToRelative(-5.76f)
            curveTo(6.28f, 0f, 3.93f, 2.13f, 3.65f, 4.95f)
            lineToRelative(-1.41f, 14.07f)
            curveToRelative(-1.25f, 0.13f, -2.24f, 1.18f, -2.24f, 2.47f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(19f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            curveToRelative(0f, -1.29f, -0.98f, -2.34f, -2.24f, -2.47f)
            close()
            moveTo(6.63f, 5.25f)
            curveToRelative(0.13f, -1.28f, 1.2f, -2.25f, 2.49f, -2.25f)
            horizontalLineToRelative(5.76f)
            curveToRelative(1.29f, 0f, 2.36f, 0.97f, 2.49f, 2.25f)
            lineToRelative(1.38f, 13.75f)
            lineTo(5.26f, 19f)
            lineToRelative(1.38f, -13.75f)
            close()
            moveTo(8.22f, 8.35f)
            lineToRelative(0.2f, -2f)
            curveToRelative(0.08f, -0.77f, 0.72f, -1.35f, 1.49f, -1.35f)
            horizontalLineToRelative(1.58f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.23f)
            lineToRelative(-0.07f, 0.65f)
            curveToRelative(-0.08f, 0.77f, -0.73f, 1.35f, -1.49f, 1.35f)
            curveToRelative(-0.05f, 0f, -0.1f, -0.0f, -0.15f, -0.01f)
            curveToRelative(-0.82f, -0.08f, -1.43f, -0.82f, -1.34f, -1.64f)
            close()
        }
    }.also { _Siren = it }
