package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RupiahSign: ImageVector? = null

val Icons.Br.RupiahSign: ImageVector
    get() = _RupiahSign ?: UXIcon(name = "RupiahSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 12f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(19.5f, 18f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(10.51f, 15.18f)
            curveToRelative(2.65f, -1.3f, 4.49f, -4.03f, 4.49f, -7.18f)
            curveTo(15f, 3.59f, 11.41f, 0f, 7f, 0f)
            horizontalLineToRelative(-1.5f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            lineTo(0f, 22.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-6.5f)
            lineTo(7f, 16f)
            curveToRelative(0.19f, 0f, 0.37f, -0.02f, 0.56f, -0.03f)
            lineToRelative(3.6f, 7.2f)
            curveToRelative(0.26f, 0.53f, 0.79f, 0.83f, 1.34f, 0.83f)
            curveToRelative(0.23f, 0f, 0.45f, -0.05f, 0.67f, -0.16f)
            curveToRelative(0.74f, -0.37f, 1.04f, -1.27f, 0.67f, -2.01f)
            lineToRelative(-3.33f, -6.65f)
            close()
            moveTo(3f, 13f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
            reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
            lineTo(3f, 13f)
            close()
        }
    }.also { _RupiahSign = it }
