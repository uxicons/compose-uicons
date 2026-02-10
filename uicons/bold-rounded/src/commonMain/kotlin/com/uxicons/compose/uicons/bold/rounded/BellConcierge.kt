package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellConcierge: ImageVector? = null

val Icons.Br.BellConcierge: ImageVector
    get() = _BellConcierge ?: UXIcon(name = "BellConcierge") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 20f)
            horizontalLineToRelative(-9f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(7.35f)
            curveToRelative(1.74f, 0f, 3.15f, -1.41f, 3.15f, -3.15f)
            curveToRelative(0f, -6.21f, -4.58f, -11.51f, -10.5f, -12.26f)
            verticalLineToRelative(-1.09f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.09f)
            curveToRelative(-2.45f, 0.3f, -4.74f, 1.35f, -6.61f, 3.06f)
            curveTo(1.42f, 7.92f, 0f, 11.15f, 0f, 14.5f)
            verticalLineToRelative(0.47f)
            curveToRelative(0f, 1.67f, 1.36f, 3.03f, 3.03f, 3.03f)
            horizontalLineToRelative(7.47f)
            verticalLineToRelative(2f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(3f, 15f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -2.52f, 1.06f, -4.93f, 2.92f, -6.64f)
            curveToRelative(1.68f, -1.54f, 3.81f, -2.36f, 6.07f, -2.37f)
            curveToRelative(0.01f, 0f, 0.01f, 0f, 0.02f, 0f)
            curveToRelative(0.0f, 0f, 0.01f, 0f, 0.01f, 0f)
            curveToRelative(0.26f, 0f, 0.53f, 0.01f, 0.8f, 0.04f)
            curveToRelative(4.59f, 0.4f, 8.19f, 4.49f, 8.19f, 9.31f)
            curveToRelative(0f, 0.08f, -0.07f, 0.15f, -0.15f, 0.15f)
            horizontalLineTo(3f)
            close()
        }
    }.also { _BellConcierge = it }
