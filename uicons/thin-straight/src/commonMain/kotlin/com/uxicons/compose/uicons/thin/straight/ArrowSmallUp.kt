package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallUp: ImageVector? = null

val Icons.Ts.ArrowSmallUp: ImageVector
    get() = _ArrowSmallUp ?: UXIcon(name = "ArrowSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.82f, 10.18f)
                lineToRelative(-4.72f, -4.72f)
                curveToRelative(-0.61f, -0.61f, -1.6f, -0.61f, -2.21f, 0f)
                lineToRelative(-4.72f, 4.72f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(4.62f, -4.62f)
                verticalLineToRelative(12.73f)
                horizontalLineToRelative(1f)
                verticalLineTo(6.26f)
                lineToRelative(4.62f, 4.62f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _ArrowSmallUp = it}
