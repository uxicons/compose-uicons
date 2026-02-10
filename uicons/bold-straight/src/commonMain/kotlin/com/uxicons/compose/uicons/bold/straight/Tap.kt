package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tap: ImageVector? = null

val Icons.Bs.Tap: ImageVector
    get() = _Tap ?: UXIcon(name = "Tap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 15.84f)
                verticalLineToRelative(8.2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.88f)
                lineToRelative(-9f, -2.35f)
                verticalLineToRelative(8.23f)
                horizontalLineToRelative(-3f)
                lineToRelative(-5.27f, -4.39f)
                curveToRelative(-0.87f, -0.72f, -0.98f, -2.01f, -0.26f, -2.87f)
                curveToRelative(0.72f, -0.87f, 2.01f, -0.98f, 2.87f, -0.26f)
                lineToRelative(2.64f, 2.22f)
                lineTo(6.99f, 6.5f)
                curveToRelative(0f, -0.91f, 0.8f, -1.63f, 1.74f, -1.48f)
                curveToRelative(0.74f, 0.12f, 1.27f, 0.81f, 1.27f, 1.56f)
                verticalLineToRelative(6.13f)
                lineToRelative(12f, 3.13f)
                close()
                moveTo(5f, 11.93f)
                verticalLineToRelative(-5.47f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.47f)
                curveToRelative(1.8f, -1.16f, 3f, -3.17f, 3f, -5.47f)
                curveTo(15f, 2.88f, 12.08f, -0.04f, 8.5f, -0.04f)
                reflectiveCurveTo(2f, 2.88f, 2f, 6.46f)
                curveToRelative(0f, 2.29f, 1.2f, 4.31f, 3f, 5.47f)
                close()
            }
        }.also { _Tap = it}
