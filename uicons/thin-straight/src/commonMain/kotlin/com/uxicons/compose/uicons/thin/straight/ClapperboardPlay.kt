package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperboardPlay: ImageVector? = null

val Icons.Ts.ClapperboardPlay: ImageVector
    get() = _ClapperboardPlay ?: UXIcon(name = "ClapperboardPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 1f)
                lineTo(2.5f, 1f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-6.17f)
                lineToRelative(4.97f, -4.97f)
                curveToRelative(0.68f, 0.14f, 1.2f, 0.75f, 1.2f, 1.47f)
                close()
                moveTo(15.58f, 2f)
                horizontalLineToRelative(4.84f)
                lineToRelative(-4.96f, 4.96f)
                lineToRelative(0.04f, 0.04f)
                horizontalLineToRelative(-4.92f)
                lineToRelative(5f, -5f)
                close()
                moveTo(9.25f, 7f)
                horizontalLineToRelative(-4.92f)
                lineToRelative(5f, -5f)
                horizontalLineToRelative(4.84f)
                lineToRelative(-4.96f, 4.96f)
                lineToRelative(0.04f, 0.04f)
                close()
                moveTo(2.5f, 2f)
                horizontalLineToRelative(5.42f)
                lineTo(2.92f, 7f)
                horizontalLineToRelative(-1.92f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 22f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(14f)
                lineTo(1f, 22f)
                close()
                moveTo(9f, 19.38f)
                lineToRelative(7.3f, -4.38f)
                lineToRelative(-7.3f, -4.38f)
                verticalLineToRelative(8.77f)
                close()
                moveTo(10f, 12.38f)
                lineToRelative(4.36f, 2.62f)
                lineToRelative(-4.36f, 2.62f)
                verticalLineToRelative(-5.23f)
                close()
            }
        }.also { _ClapperboardPlay = it}
