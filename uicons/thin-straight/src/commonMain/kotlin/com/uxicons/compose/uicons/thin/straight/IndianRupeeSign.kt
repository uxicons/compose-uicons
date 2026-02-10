package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndianRupeeSign: ImageVector? = null

val Icons.Ts.IndianRupeeSign: ImageVector
    get() = _IndianRupeeSign ?: UXIcon(name = "IndianRupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 1f)
                horizontalLineToRelative(-7.4f)
                curveToRelative(1.76f, 1.06f, 3.02f, 2.88f, 3.33f, 5f)
                horizontalLineToRelative(4.07f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                horizontalLineTo(4.32f)
                lineToRelative(11.94f, 10f)
                horizontalLineToRelative(-1.57f)
                lineTo(3f, 14.27f)
                verticalLineToRelative(-1.27f)
                horizontalLineToRelative(7f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                horizontalLineTo(3f)
                verticalLineToRelative(-1f)
                horizontalLineTo(15.92f)
                curveToRelative(-0.48f, -2.83f, -2.95f, -5f, -5.92f, -5f)
                horizontalLineTo(3f)
                verticalLineTo(0f)
                horizontalLineTo(21f)
                verticalLineTo(1f)
                close()
            }
        }.also { _IndianRupeeSign = it}
