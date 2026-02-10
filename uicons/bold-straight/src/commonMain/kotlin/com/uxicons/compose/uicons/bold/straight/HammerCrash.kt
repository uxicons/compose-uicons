package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HammerCrash: ImageVector? = null

val Icons.Bs.HammerCrash: ImageVector
    get() = _HammerCrash ?: UXIcon(name = "HammerCrash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15.85f)
                lineToRelative(2.36f, -1.85f)
                lineToRelative(1.85f, 2.36f)
                lineToRelative(-2.36f, 1.85f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.0f, 12.53f)
                lineToRelative(1.47f, -2.61f)
                lineToRelative(2.61f, 1.47f)
                lineToRelative(-1.47f, 2.61f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.88f, 11.73f)
                lineToRelative(2.44f, -4.46f)
                curveToRelative(0.32f, -0.58f, 0.39f, -1.24f, 0.2f, -1.87f)
                reflectiveCurveToRelative(-0.6f, -1.15f, -1.18f, -1.47f)
                lineTo(12.01f, 1.01f)
                curveTo(10.09f, -0.04f, 7.87f, -0.28f, 5.76f, 0.33f)
                curveTo(3.66f, 0.95f, 1.92f, 2.35f, 0.86f, 4.27f)
                lineToRelative(-0.86f, 1.57f)
                lineToRelative(6.67f, 3.66f)
                lineTo(0f, 22.13f)
                lineToRelative(3.54f, 1.87f)
                lineToRelative(6.64f, -12.59f)
                lineToRelative(2.35f, 1.29f)
                curveToRelative(0.37f, 0.2f, 0.77f, 0.3f, 1.18f, 0.3f)
                curveToRelative(0.23f, 0f, 0.46f, -0.03f, 0.69f, -0.1f)
                curveToRelative(0.63f, -0.18f, 1.15f, -0.6f, 1.47f, -1.18f)
                close()
                moveTo(13.5f, 9.81f)
                lineTo(4.2f, 4.71f)
                curveToRelative(0.64f, -0.71f, 1.46f, -1.23f, 2.4f, -1.5f)
                curveToRelative(1.34f, -0.39f, 2.75f, -0.24f, 3.96f, 0.43f)
                lineToRelative(4.86f, 2.66f)
                lineToRelative(-1.92f, 3.51f)
                close()
            }
        }.also { _HammerCrash = it}
