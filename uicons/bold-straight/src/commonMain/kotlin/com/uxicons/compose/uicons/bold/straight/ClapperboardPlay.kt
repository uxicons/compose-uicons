package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperboardPlay: ImageVector? = null

val Icons.Bs.ClapperboardPlay: ImageVector
    get() = _ClapperboardPlay ?: UXIcon(name = "ClapperboardPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 1f)
                lineTo(3.5f, 1f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4.38f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(0.88f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(8.62f, 7f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(3.76f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(-3.76f)
                close()
                moveTo(3.5f, 4f)
                horizontalLineToRelative(3.88f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(-1.38f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3f, 20f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(10f)
                lineTo(3f, 20f)
                close()
                moveTo(10f, 11.5f)
                lineToRelative(5.83f, 3.5f)
                lineToRelative(-5.83f, 3.5f)
                verticalLineToRelative(-7f)
                close()
            }
        }.also { _ClapperboardPlay = it}
