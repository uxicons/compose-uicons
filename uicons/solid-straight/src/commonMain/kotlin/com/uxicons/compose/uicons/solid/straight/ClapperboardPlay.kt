package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperboardPlay: ImageVector? = null

val Icons.Ss.ClapperboardPlay: ImageVector
    get() = _ClapperboardPlay ?: UXIcon(name = "ClapperboardPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.73f, 7f)
                lineTo(13.73f, 1f)
                horizontalLineToRelative(3.42f)
                lineToRelative(-6f, 6f)
                horizontalLineToRelative(-3.42f)
                close()
                moveTo(17.4f, 7f)
                lineToRelative(5.4f, -5.4f)
                curveToRelative(-0.5f, -0.38f, -1.12f, -0.6f, -1.8f, -0.6f)
                horizontalLineToRelative(-1.02f)
                lineToRelative(-6f, 6f)
                horizontalLineToRelative(3.42f)
                close()
                moveTo(23.92f, 3.31f)
                lineToRelative(-3.69f, 3.69f)
                horizontalLineToRelative(3.77f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.24f, -0.03f, -0.47f, -0.08f, -0.69f)
                close()
                moveTo(4.9f, 7f)
                lineTo(10.9f, 1f)
                horizontalLineToRelative(-3.4f)
                lineTo(1.5f, 7f)
                horizontalLineToRelative(3.4f)
                close()
                moveTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(1.67f)
                lineTo(4.67f, 1f)
                horizontalLineToRelative(-1.67f)
                close()
                moveTo(0f, 9f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(14f)
                lineTo(0f, 23f)
                verticalLineToRelative(-14f)
                close()
                moveTo(10f, 19.5f)
                lineToRelative(5.83f, -3.5f)
                lineToRelative(-5.83f, -3.5f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _ClapperboardPlay = it}
