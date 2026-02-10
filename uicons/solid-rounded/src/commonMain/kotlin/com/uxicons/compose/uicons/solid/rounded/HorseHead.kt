package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorseHead: ImageVector? = null

val Icons.Sr.HorseHead: ImageVector
    get() = _HorseHead ?: UXIcon(name = "HorseHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.39f, 14.28f)
                curveToRelative(-2.75f, -2.16f, -3.85f, -4.38f, -4.92f, -6.53f)
                curveToRelative(-0.71f, -1.43f, -1.38f, -2.78f, -2.46f, -3.97f)
                lineTo(15.0f, 0.87f)
                curveToRelative(0f, -0.58f, -0.56f, -0.99f, -1.11f, -0.83f)
                curveToRelative(-1.39f, 0.4f, -2.47f, 1.66f, -2.79f, 3.08f)
                curveTo(4.2f, 3.92f, 0f, 8.89f, 0f, 16.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10.2f)
                curveToRelative(1.34f, 0f, 2.22f, -1.39f, 1.65f, -2.6f)
                curveToRelative(-0.51f, -1.08f, -0.99f, -2.1f, -1.0f, -2.15f)
                lineToRelative(-0.84f, -2.25f)
                lineToRelative(8.33f, 3.85f)
                curveToRelative(0.9f, 0.41f, 1.96f, 0.19f, 2.61f, -0.55f)
                lineToRelative(0.01f, -0.02f)
                curveToRelative(0.75f, -0.84f, 1.12f, -1.98f, 1.02f, -3.1f)
                curveToRelative(-0.1f, -1.13f, -0.68f, -2.19f, -1.59f, -2.91f)
                close()
                moveTo(14.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _HorseHead = it}
