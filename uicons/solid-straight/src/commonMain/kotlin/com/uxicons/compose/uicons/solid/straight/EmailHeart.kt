package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailHeart: ImageVector? = null

val Icons.Ss.EmailHeart: ImageVector
    get() = _EmailHeart ?: UXIcon(name = "EmailHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.33f)
                curveToRelative(0f, 3.48f, -6f, 7.67f, -6f, 7.67f)
                reflectiveCurveToRelative(-6f, -4.19f, -6f, -7.67f)
                curveToRelative(0f, -1.84f, 1.34f, -3.33f, 3f, -3.33f)
                reflectiveCurveToRelative(3f, 1.49f, 3f, 3.33f)
                curveToRelative(0f, -1.84f, 1.34f, -3.33f, 3f, -3.33f)
                reflectiveCurveToRelative(3f, 1.49f, 3f, 3.33f)
                close()
                moveTo(19.14f, 12.64f)
                lineTo(16.99f, 14.09f)
                lineTo(15.54f, 15.54f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.59f, -0.52f, -3.54f, -1.46f)
                lineToRelative(-8.46f, -8.46f)
                verticalLineToRelative(16.93f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15.88f)
                curveToRelative(-1.76f, 2.27f, -4.16f, 4.03f, -4.86f, 4.52f)
                close()
                moveTo(14.12f, 14.12f)
                lineTo(16.13f, 12.11f)
                curveToRelative(-1.91f, -1.45f, -6.13f, -5.07f, -6.13f, -8.78f)
                curveToRelative(0f, -0.11f, 0.03f, -0.22f, 0.03f, -0.33f)
                horizontalLineToRelative(-7.03f)
                curveToRelative(-1.15f, 0f, -2.13f, 0.66f, -2.64f, 1.6f)
                lineToRelative(9.52f, 9.52f)
                curveToRelative(1.13f, 1.13f, 3.11f, 1.13f, 4.24f, 0f)
                close()
            }
        }.also { _EmailHeart = it}
