package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paste: ImageVector? = null

val Icons.Br.Paste: ImageVector
    get() = _Paste ?: UXIcon(name = "Paste") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 7.5f)
            curveTo(0f, 4.47f, 2.47f, 2f, 5.5f, 2f)
            horizontalLineToRelative(0.35f)
            curveToRelative(0.56f, -1.18f, 1.76f, -2f, 3.15f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.39f, 0f, 2.59f, 0.82f, 3.15f, 2f)
            horizontalLineToRelative(0.35f)
            curveToRelative(1.96f, 0f, 3.78f, 1.05f, 4.76f, 2.75f)
            curveToRelative(0.42f, 0.72f, 0.17f, 1.63f, -0.55f, 2.05f)
            curveToRelative(-0.24f, 0.14f, -0.49f, 0.2f, -0.75f, 0.2f)
            curveToRelative(-0.52f, 0f, -1.02f, -0.27f, -1.3f, -0.75f)
            curveToRelative(-0.45f, -0.77f, -1.28f, -1.25f, -2.17f, -1.25f)
            horizontalLineToRelative(-0.35f)
            curveToRelative(-0.56f, 1.18f, -1.76f, 2f, -3.15f, 2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.39f, 0f, -2.59f, -0.82f, -3.15f, -2f)
            horizontalLineToRelative(-0.35f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            close()
            moveTo(17.5f, 14f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(24f, 13.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            horizontalLineToRelative(5f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            close()
            moveTo(21f, 13.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            close()
        }
    }.also { _Paste = it }
