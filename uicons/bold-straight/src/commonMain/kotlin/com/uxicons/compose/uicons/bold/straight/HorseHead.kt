package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorseHead: ImageVector? = null

val Icons.Bs.HorseHead: ImageVector
    get() = _HorseHead ?: UXIcon(name = "HorseHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23.98f, 17.18f)
                curveToRelative(-0.1f, -1.13f, -0.67f, -2.18f, -1.59f, -2.91f)
                curveToRelative(-2.75f, -2.16f, -3.85f, -4.38f, -4.92f, -6.53f)
                curveToRelative(-0.71f, -1.43f, -1.38f, -2.78f, -2.46f, -3.97f)
                lineTo(15f, 0f)
                curveToRelative(-1.91f, 0f, -3.5f, 1.33f, -3.9f, 3.12f)
                curveTo(4.2f, 3.92f, 0f, 8.89f, 0f, 16.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -3.14f, 0.98f, -10.41f, 9.96f, -10.5f)
                curveToRelative(0.71f, 0.85f, 1.23f, 1.9f, 1.82f, 3.08f)
                curveToRelative(1.1f, 2.22f, 2.48f, 4.97f, 5.78f, 7.57f)
                curveToRelative(0.25f, 0.2f, 0.41f, 0.48f, 0.43f, 0.8f)
                curveToRelative(0.03f, 0.31f, -0.07f, 0.61f, -0.28f, 0.84f)
                curveToRelative(-0.28f, 0.31f, -0.54f, 0.61f, -0.76f, 0.86f)
                lineToRelative(-9.79f, -4.7f)
                lineToRelative(0.34f, 2.73f)
                curveToRelative(0.32f, 2.58f, 1.27f, 4.85f, 2.5f, 6.81f)
                horizontalLineToRelative(3.69f)
                curveToRelative(-0.99f, -1.25f, -1.88f, -2.68f, -2.48f, -4.27f)
                lineToRelative(6.49f, 3.12f)
                lineToRelative(0.75f, -0.85f)
                reflectiveCurveToRelative(0.67f, -0.77f, 1.5f, -1.71f)
                curveToRelative(0.75f, -0.84f, 1.12f, -1.98f, 1.02f, -3.1f)
                close()
            }
        }.also { _HorseHead = it}
