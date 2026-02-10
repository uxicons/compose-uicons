package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Badminton: ImageVector? = null

val Icons.Ss.Badminton: ImageVector
    get() = _Badminton ?: UXIcon(name = "Badminton") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.93f, 2.07f)
                curveTo(20.43f, 0.56f, 18.33f, -0.17f, 16.04f, 0.03f)
                curveToRelative(-2.23f, 0.19f, -4.39f, 1.22f, -6.09f, 2.92f)
                reflectiveCurveToRelative(-2.73f, 3.86f, -2.92f, 6.09f)
                curveToRelative(-0.16f, 1.93f, 0.33f, 3.72f, 1.38f, 5.13f)
                lineToRelative(-2.92f, 2.92f)
                curveToRelative(-0.73f, -0.23f, -1.57f, -0.05f, -2.15f, 0.53f)
                lineToRelative(-2.72f, 2.72f)
                curveToRelative(-0.84f, 0.84f, -0.84f, 2.19f, 0f, 3.03f)
                curveToRelative(0.84f, 0.84f, 2.19f, 0.84f, 3.03f, 0f)
                lineToRelative(2.72f, -2.72f)
                curveToRelative(0.58f, -0.58f, 0.76f, -1.41f, 0.53f, -2.15f)
                lineToRelative(2.92f, -2.92f)
                curveToRelative(1.24f, 0.92f, 2.76f, 1.41f, 4.42f, 1.41f)
                curveToRelative(0.24f, 0f, 0.48f, -0.01f, 0.72f, -0.03f)
                curveToRelative(2.23f, -0.19f, 4.39f, -1.22f, 6.09f, -2.92f)
                curveToRelative(1.7f, -1.7f, 2.73f, -3.86f, 2.92f, -6.09f)
                curveToRelative(0.19f, -2.29f, -0.53f, -4.39f, -2.04f, -5.89f)
                close()
                moveTo(22f, 20.5f)
                lineToRelative(1.5f, 3.5f)
                horizontalLineToRelative(-6f)
                lineToRelative(1.5f, -3.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Badminton = it}
