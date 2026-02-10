package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golfer: ImageVector? = null

val Icons.Rs.Golfer: ImageVector
    get() = _Golfer ?: UXIcon(name = "Golfer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(21f, 9.29f)
                verticalLineToRelative(1.71f)
                lineToRelative(-6.28f, -0.04f)
                lineToRelative(-2.6f, -0.76f)
                lineToRelative(1.88f, 5.64f)
                verticalLineToRelative(8.16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2.68f)
                lineToRelative(-3.88f, 7f)
                horizontalLineToRelative(-2.35f)
                lineToRelative(4.71f, -8.46f)
                lineToRelative(-1.75f, -5.88f)
                curveToRelative(-0.21f, -0.78f, 0.02f, -1.57f, 0.59f, -2.1f)
                curveToRelative(0.57f, -0.53f, 1.38f, -0.7f, 2.11f, -0.44f)
                lineToRelative(6.4f, 1.88f)
                horizontalLineToRelative(3.55f)
                lineToRelative(-2.98f, -6.83f)
                lineToRelative(-1.83f, 0.78f)
                lineToRelative(-0.78f, -1.84f)
                lineToRelative(2.33f, -0.99f)
                curveToRelative(0.72f, -0.3f, 1.57f, 0.03f, 1.89f, 0.74f)
                close()
                moveTo(9.78f, 9.51f)
                lineTo(8.13f, 9.02f)
                lineTo(7.99f, 9.03f)
                lineTo(9.73f, 15.0f)
                horizontalLineToRelative(1.88f)
                lineToRelative(-1.83f, -5.49f)
                close()
            }
        }.also { _Golfer = it}
