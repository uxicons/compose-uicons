package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCrackAlt: ImageVector? = null

val Icons.Sr.HouseCrackAlt: ImageVector
    get() = _HouseCrackAlt ?: UXIcon(name = "HouseCrackAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 5.74f)
                lineTo(14.8f, 0.85f)
                curveToRelative(-1.7f, -1.15f, -3.9f, -1.15f, -5.59f, 0f)
                lineTo(2.2f, 5.58f)
                curveToRelative(-1.38f, 0.93f, -2.2f, 2.48f, -2.2f, 4.14f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8.66f)
                lineToRelative(-4.99f, -4.99f)
                curveToRelative(-0.83f, -0.83f, -0.83f, -2.19f, 0f, -3.03f)
                lineToRelative(3.33f, -3.61f)
                curveToRelative(0.06f, -0.06f, 0.07f, -0.1f, 0.07f, -0.13f)
                reflectiveCurveToRelative(-0.01f, -0.07f, -0.04f, -0.1f)
                lineToRelative(-2.63f, -2.41f)
                curveToRelative(-0.41f, -0.37f, -0.43f, -1.01f, -0.06f, -1.41f)
                curveToRelative(0.37f, -0.41f, 1.01f, -0.43f, 1.41f, -0.06f)
                lineToRelative(2.67f, 2.44f)
                curveToRelative(0.44f, 0.43f, 0.66f, 0.97f, 0.66f, 1.54f)
                reflectiveCurveToRelative(-0.22f, 1.11f, -0.63f, 1.51f)
                lineToRelative(-3.33f, 3.61f)
                curveToRelative(-0.08f, 0.08f, -0.08f, 0.17f, -0.03f, 0.23f)
                lineToRelative(6.4f, 6.4f)
                horizontalLineToRelative(2.51f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-9.28f)
                curveToRelative(0f, -1.58f, -0.75f, -3.05f, -2f, -3.99f)
                close()
            }
        }.also { _HouseCrackAlt = it}
