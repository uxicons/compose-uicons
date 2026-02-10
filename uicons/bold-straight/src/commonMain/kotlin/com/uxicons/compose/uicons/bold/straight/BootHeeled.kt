package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BootHeeled: ImageVector? = null

val Icons.Bs.BootHeeled: ImageVector
    get() = _BootHeeled ?: UXIcon(name = "BootHeeled") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.41f, 14.78f)
                lineToRelative(-6.13f, -3.06f)
                curveToRelative(-0.17f, -0.09f, -0.28f, -0.26f, -0.28f, -0.45f)
                lineTo(14f, 3.5f)
                curveToRelative(0f, -1.09f, -0.45f, -2.06f, -1.27f, -2.72f)
                curveToRelative(-0.84f, -0.67f, -1.96f, -0.94f, -3.0f, -0.7f)
                lineTo(0f, 2.19f)
                verticalLineToRelative(21.81f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2.32f)
                lineToRelative(3.48f, 1.74f)
                curveToRelative(0.76f, 0.38f, 1.61f, 0.58f, 2.46f, 0.58f)
                horizontalLineToRelative(9.06f)
                verticalLineToRelative(-3.41f)
                curveToRelative(0f, -2.48f, -1.38f, -4.71f, -3.59f, -5.81f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-6.06f)
                curveToRelative(-0.39f, 0f, -0.77f, -0.09f, -1.12f, -0.26f)
                lineToRelative(-4.31f, -2.15f)
                curveToRelative(-0.76f, -0.38f, -1.61f, -0.58f, -2.46f, -0.58f)
                lineTo(3f, 18f)
                lineTo(3f, 4.61f)
                lineToRelative(2f, -0.43f)
                verticalLineToRelative(7.82f)
                horizontalLineToRelative(3f)
                lineTo(8f, 3.52f)
                lineToRelative(2.37f, -0.52f)
                curveToRelative(0.15f, -0.03f, 0.35f, 0.01f, 0.48f, 0.11f)
                curveToRelative(0.07f, 0.06f, 0.15f, 0.15f, 0.15f, 0.38f)
                verticalLineToRelative(7.76f)
                curveToRelative(0f, 1.33f, 0.74f, 2.53f, 1.94f, 3.13f)
                lineToRelative(6.13f, 3.06f)
                curveToRelative(1.19f, 0.6f, 1.94f, 1.8f, 1.94f, 3.13f)
                verticalLineToRelative(0.41f)
                close()
            }
        }.also { _BootHeeled = it}
