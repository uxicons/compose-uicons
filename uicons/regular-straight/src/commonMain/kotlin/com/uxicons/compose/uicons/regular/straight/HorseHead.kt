package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorseHead: ImageVector? = null

val Icons.Rs.HorseHead: ImageVector
    get() = _HorseHead ?: UXIcon(name = "HorseHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23.98f, 17.18f)
                curveToRelative(-0.1f, -1.13f, -0.68f, -2.19f, -1.59f, -2.91f)
                curveToRelative(-2.75f, -2.16f, -3.85f, -4.38f, -4.92f, -6.53f)
                curveToRelative(-0.71f, -1.43f, -1.38f, -2.78f, -2.46f, -3.97f)
                lineTo(15f, 0f)
                curveToRelative(-1.91f, 0f, -3.5f, 1.33f, -3.9f, 3.12f)
                curveTo(4.2f, 3.92f, 0f, 8.89f, 0f, 16.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -7.31f, 4.06f, -11.5f, 11.13f, -11.5f)
                horizontalLineToRelative(0.28f)
                curveToRelative(0.96f, 1.01f, 1.54f, 2.18f, 2.27f, 3.64f)
                curveToRelative(1.11f, 2.24f, 2.38f, 4.77f, 5.48f, 7.21f)
                curveToRelative(0.48f, 0.38f, 0.79f, 0.93f, 0.84f, 1.51f)
                curveToRelative(0.05f, 0.58f, -0.14f, 1.16f, -0.53f, 1.6f)
                curveToRelative(-0.43f, 0.48f, -0.76f, 0.86f, -1.0f, 1.13f)
                lineToRelative(-10.17f, -5.06f)
                lineToRelative(0.76f, 2.28f)
                curveToRelative(0.04f, 0.1f, 0.74f, 2.21f, 2.02f, 4.68f)
                lineToRelative(0.98f, 2f)
                horizontalLineToRelative(2.45f)
                lineToRelative(-0.88f, -1.5f)
                curveToRelative(-0.71f, -1.21f, -1.29f, -2.44f, -1.73f, -3.44f)
                lineToRelative(7.07f, 3.52f)
                lineToRelative(0.51f, -0.58f)
                reflectiveCurveToRelative(0.48f, -0.55f, 1.5f, -1.7f)
                curveToRelative(0.75f, -0.84f, 1.12f, -1.98f, 1.02f, -3.1f)
                close()
            }
        }.also { _HorseHead = it}
