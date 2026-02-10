package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golfer: ImageVector? = null

val Icons.Bs.Golfer: ImageVector
    get() = _Golfer ?: UXIcon(name = "Golfer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.91f, 3.47f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(17.51f, 1.15f)
                curveToRelative(-0.43f, -0.96f, -1.58f, -1.41f, -2.54f, -0.99f)
                lineToRelative(-2.32f, 0.99f)
                lineToRelative(1.17f, 2.76f)
                lineToRelative(1.35f, -0.57f)
                lineToRelative(2.31f, 5.67f)
                horizontalLineToRelative(-1.75f)
                lineToRelative(-6.28f, -1.85f)
                curveToRelative(-0.91f, -0.32f, -1.91f, -0.1f, -2.62f, 0.55f)
                reflectiveCurveToRelative(-0.98f, 1.64f, -0.71f, 2.65f)
                lineToRelative(1.66f, 5.05f)
                lineToRelative(-4.77f, 8.61f)
                horizontalLineToRelative(3.49f)
                lineToRelative(4.42f, -8.01f)
                lineToRelative(0.08f, 0.25f)
                verticalLineToRelative(7.76f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8.24f)
                lineToRelative(-1.53f, -4.59f)
                lineToRelative(2.81f, 0.83f)
                horizontalLineToRelative(5.72f)
                verticalLineToRelative(-2.29f)
                close()
            }
        }.also { _Golfer = it}
