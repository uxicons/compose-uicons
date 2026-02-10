package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWitch: ImageVector? = null

val Icons.Bs.HatWitch: ImageVector
    get() = _HatWitch ?: UXIcon(name = "HatWitch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.24f, 21f)
                lineToRelative(-5.04f, -14.66f)
                lineToRelative(2.38f, -2.68f)
                lineToRelative(1.65f, 2.63f)
                lineToRelative(2.54f, -1.59f)
                lineToRelative(-2.94f, -4.71f)
                horizontalLineToRelative(-7.25f)
                curveToRelative(-2.78f, 0f, -5.25f, 1.77f, -6.15f, 4.4f)
                lineTo(1.76f, 21f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.76f)
                close()
                moveTo(10.26f, 5.37f)
                curveToRelative(0.48f, -1.42f, 1.81f, -2.37f, 3.31f, -2.37f)
                horizontalLineToRelative(2.58f)
                lineToRelative(-2.36f, 2.66f)
                lineToRelative(5.27f, 15.34f)
                horizontalLineToRelative(-4.07f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.07f)
                lineToRelative(5.34f, -15.63f)
                close()
            }
        }.also { _HatWitch = it}
