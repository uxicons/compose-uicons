package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square5: ImageVector? = null

val Icons.Br.Square5: ImageVector
    get() = _Square5 ?: UXIcon(name = "Square5") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 19f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.42f, 0f, 0.8f, -0.17f, 1.09f, -0.47f)
            curveToRelative(0.29f, -0.3f, 0.43f, -0.7f, 0.41f, -1.11f)
            curveToRelative(-0.04f, -0.78f, -0.79f, -1.42f, -1.67f, -1.42f)
            horizontalLineToRelative(-3.83f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(7f, 7.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2.33f)
            curveToRelative(2.49f, 0f, 4.54f, 1.87f, 4.66f, 4.26f)
            curveToRelative(0.07f, 1.25f, -0.37f, 2.43f, -1.23f, 3.34f)
            curveToRelative(-0.85f, 0.89f, -2.04f, 1.4f, -3.27f, 1.4f)
            close()
            moveTo(24f, 18.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            close()
            moveTo(18.5f, 3f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            close()
        }
    }.also { _Square5 = it }
