package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndianRupeeSign: ImageVector? = null

val Icons.Ss.IndianRupeeSign: ImageVector
    get() = _IndianRupeeSign ?: UXIcon(name = "IndianRupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.59f, 2f)
                curveToRelative(1.13f, 1.05f, 1.93f, 2.44f, 2.25f, 4f)
                horizontalLineToRelative(4.15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.03f)
                curveToRelative(-0.26f, 3.9f, -3.51f, 7f, -7.47f, 7f)
                horizontalLineToRelative(-3.3f)
                lineToRelative(10.76f, 9f)
                horizontalLineToRelative(-3.13f)
                lineTo(3f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.5f)
                curveToRelative(2.86f, 0f, 5.22f, -2.2f, 5.47f, -5f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                horizontalLineTo(14.79f)
                curveToRelative(-0.66f, -2.3f, -2.77f, -4f, -5.29f, -4f)
                horizontalLineTo(3f)
                verticalLineTo(0f)
                horizontalLineTo(21f)
                verticalLineTo(2f)
                horizontalLineToRelative(-6.41f)
                close()
            }
        }.also { _IndianRupeeSign = it}
