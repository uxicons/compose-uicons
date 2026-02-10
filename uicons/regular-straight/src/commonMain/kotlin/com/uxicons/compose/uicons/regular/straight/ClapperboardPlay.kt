package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperboardPlay: ImageVector? = null

val Icons.Rs.ClapperboardPlay: ImageVector
    get() = _ClapperboardPlay ?: UXIcon(name = "ClapperboardPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(5.61f, 7f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(3.42f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(-3.42f)
                close()
                moveTo(15.86f, 3f)
                horizontalLineToRelative(3.42f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(-3.42f)
                lineToRelative(4f, -4f)
                close()
                moveTo(21.76f, 3.35f)
                curveToRelative(0.15f, 0.17f, 0.24f, 0.4f, 0.24f, 0.65f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.89f)
                lineToRelative(3.65f, -3.65f)
                close()
                moveTo(3.0f, 3f)
                horizontalLineToRelative(3.78f)
                lineTo(2.78f, 7f)
                horizontalLineToRelative(-0.78f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2.0f, 21f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(12f)
                lineTo(2f, 21f)
                close()
                moveTo(10.0f, 11.5f)
                lineToRelative(5.83f, 3.5f)
                lineToRelative(-5.83f, 3.5f)
                verticalLineToRelative(-7f)
                close()
            }
        }.also { _ClapperboardPlay = it}
