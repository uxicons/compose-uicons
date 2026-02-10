package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RadioAlt: ImageVector? = null

val Icons.Br.RadioAlt: ImageVector
    get() = _RadioAlt ?: UXIcon(name = "RadioAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 6f)
            horizontalLineToRelative(-5.67f)
            lineToRelative(8.27f, -3.18f)
            curveToRelative(0.77f, -0.3f, 1.16f, -1.17f, 0.86f, -1.94f)
            curveToRelative(-0.3f, -0.77f, -1.17f, -1.16f, -1.94f, -0.86f)
            lineTo(3.59f, 6.34f)
            curveToRelative(-2.1f, 0.78f, -3.59f, 2.8f, -3.59f, 5.16f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(18.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(11f, 16.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(19f, 16.5f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
        }
    }.also { _RadioAlt = it }
