package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeDropperHalf: ImageVector? = null

val Icons.Bs.EyeDropperHalf: ImageVector
    get() = _EyeDropperHalf ?: UXIcon(name = "EyeDropperHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.9f, 1.1f)
                curveToRelative(-1.42f, -1.42f, -3.89f, -1.42f, -5.3f, 0f)
                lineToRelative(-2.49f, 2.49f)
                curveToRelative(-1.34f, 1.34f, -3.46f, 1.37f, -4.84f, 0.07f)
                lineToRelative(-2.09f, 2.15f)
                lineToRelative(2.17f, 2.17f)
                lineTo(2.17f, 16.17f)
                curveToRelative(-1.19f, 1.19f, -1.47f, 2.93f, -0.85f, 4.39f)
                lineToRelative(-1.32f, 1.32f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.32f, -1.32f)
                curveToRelative(0.49f, 0.21f, 1.02f, 0.32f, 1.56f, 0.32f)
                curveToRelative(1.07f, 0f, 2.07f, -0.42f, 2.83f, -1.17f)
                lineToRelative(8.19f, -8.19f)
                lineToRelative(2.17f, 2.18f)
                lineToRelative(2.15f, -2.09f)
                curveToRelative(-1.3f, -1.38f, -1.27f, -3.5f, 0.07f, -4.84f)
                lineToRelative(2.49f, -2.49f)
                curveToRelative(0.71f, -0.71f, 1.1f, -1.65f, 1.1f, -2.65f)
                reflectiveCurveToRelative(-0.39f, -1.94f, -1.1f, -2.65f)
                close()
                moveTo(10.41f, 15f)
                horizontalLineToRelative(-2.83f)
                lineToRelative(4.9f, -4.9f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.48f, 3.48f)
                close()
                moveTo(20.78f, 4.28f)
                lineToRelative(-2.49f, 2.49f)
                curveToRelative(-0.9f, 0.91f, -1.49f, 2.0f, -1.75f, 3.16f)
                lineToRelative(-2.47f, -2.47f)
                curveToRelative(1.15f, -0.26f, 2.25f, -0.85f, 3.16f, -1.75f)
                lineToRelative(2.49f, -2.49f)
                curveToRelative(0.19f, -0.19f, 0.41f, -0.22f, 0.53f, -0.22f)
                reflectiveCurveToRelative(0.34f, 0.03f, 0.53f, 0.22f)
                curveToRelative(0.19f, 0.19f, 0.22f, 0.41f, 0.22f, 0.53f)
                curveToRelative(0f, 0.12f, -0.03f, 0.34f, -0.22f, 0.53f)
                close()
            }
        }.also { _EyeDropperHalf = it}
