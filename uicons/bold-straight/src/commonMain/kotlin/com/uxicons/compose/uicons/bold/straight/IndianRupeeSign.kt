package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndianRupeeSign: ImageVector? = null

val Icons.Bs.IndianRupeeSign: ImageVector
    get() = _IndianRupeeSign ?: UXIcon(name = "IndianRupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.74f, 3f)
                curveToRelative(0.48f, 0.6f, 0.88f, 1.27f, 1.18f, 2f)
                horizontalLineToRelative(4.08f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                horizontalLineToRelative(-0.83f)
                lineToRelative(9.57f, 8f)
                horizontalLineToRelative(-4.69f)
                lineTo(3f, 15.23f)
                verticalLineToRelative(-2.23f)
                horizontalLineToRelative(6.5f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                horizontalLineTo(3f)
                verticalLineToRelative(-3f)
                horizontalLineTo(13.5f)
                curveToRelative(-0.91f, -1.21f, -2.37f, -2f, -4f, -2f)
                horizontalLineTo(3f)
                verticalLineTo(0f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineToRelative(-5.26f)
                close()
            }
        }.also { _IndianRupeeSign = it}
