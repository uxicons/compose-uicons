package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneGuide: ImageVector? = null

val Icons.Br.PhoneGuide: ImageVector
    get() = _PhoneGuide ?: UXIcon(name = "PhoneGuide") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11.5f, 21f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            lineTo(9f, 3f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(22f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            lineToRelative(0.03f, 14f)
            curveToRelative(0f, 2.5f, 2.09f, 4.5f, 4.47f, 4.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.53f, 0f, -1.03f, 0.11f, -1.5f, 0.28f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(23.66f, 22.59f)
            lineToRelative(-0.52f, 0.6f)
            curveToRelative(-0.55f, 0.55f, -1.28f, 0.81f, -2f, 0.81f)
            curveToRelative(-3.71f, 0f, -9.14f, -5.14f, -9.14f, -9.14f)
            curveToRelative(0f, -0.72f, 0.26f, -1.45f, 0.81f, -2f)
            lineToRelative(0.6f, -0.52f)
            curveToRelative(0.45f, -0.45f, 1.17f, -0.45f, 1.62f, 0f)
            lineToRelative(1.21f, 1.3f)
            curveToRelative(0.45f, 0.45f, 0.45f, 1.17f, 0f, 1.62f)
            lineToRelative(-1.02f, 1.04f)
            curveToRelative(0.9f, 2.24f, 2.43f, 3.71f, 4.5f, 4.5f)
            lineToRelative(1.04f, -1.02f)
            curveToRelative(0.45f, -0.45f, 1.17f, -0.45f, 1.62f, 0f)
            lineToRelative(1.3f, 1.21f)
            curveToRelative(0.45f, 0.45f, 0.45f, 1.17f, 0f, 1.62f)
            close()
        }
    }.also { _PhoneGuide = it }
