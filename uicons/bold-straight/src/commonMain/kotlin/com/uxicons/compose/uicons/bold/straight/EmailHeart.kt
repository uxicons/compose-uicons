package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailHeart: ImageVector? = null

val Icons.Bs.EmailHeart: ImageVector
    get() = _EmailHeart ?: UXIcon(name = "EmailHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.13f)
                verticalLineToRelative(15.87f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-17.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(6.53f)
                curveToRelative(-0.01f, 0.11f, -0.03f, 0.21f, -0.03f, 0.33f)
                curveToRelative(0f, 0.91f, 0.26f, 1.81f, 0.67f, 2.67f)
                horizontalLineToRelative(-7.17f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(0.28f)
                lineToRelative(7.36f, 7.54f)
                curveToRelative(0.88f, 0.88f, 2.4f, 0.88f, 3.28f, 0f)
                lineToRelative(2.33f, -2.33f)
                curveToRelative(0.38f, 0.29f, 0.7f, 0.52f, 0.88f, 0.65f)
                lineToRelative(1.54f, 1.17f)
                lineToRelative(-2.64f, 2.64f)
                curveToRelative(-1.0f, 1.0f, -2.34f, 1.56f, -3.76f, 1.56f)
                reflectiveCurveToRelative(-2.76f, -0.55f, -3.76f, -1.56f)
                lineToRelative(-5.24f, -5.39f)
                verticalLineToRelative(9.95f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-9.77f)
                curveToRelative(0.98f, -0.91f, 2.06f, -1.87f, 3f, -3.1f)
                close()
                moveTo(18f, 11f)
                reflectiveCurveToRelative(6f, -4.19f, 6f, -7.67f)
                curveToRelative(0f, -1.84f, -1.34f, -3.33f, -3f, -3.33f)
                reflectiveCurveToRelative(-3f, 1.49f, -3f, 3.33f)
                curveToRelative(0f, -1.84f, -1.34f, -3.33f, -3f, -3.33f)
                reflectiveCurveToRelative(-3f, 1.49f, -3f, 3.33f)
                curveToRelative(0f, 3.48f, 6f, 7.67f, 6f, 7.67f)
                close()
            }
        }.also { _EmailHeart = it}
