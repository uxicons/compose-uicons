package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelmetBattle: ImageVector? = null

val Icons.Ss.HelmetBattle: ImageVector
    get() = _HelmetBattle ?: UXIcon(name = "HelmetBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 12.9f)
                lineToRelative(-4f, 2.16f)
                lineToRelative(-4f, -2.16f)
                verticalLineToRelative(-0.9f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(0.9f)
                close()
                moveTo(12.48f, 0.24f)
                lineToRelative(-0.48f, -0.27f)
                lineToRelative(-0.48f, 0.27f)
                curveToRelative(-0.97f, 0.54f, -9.52f, 5.39f, -9.52f, 10.79f)
                verticalLineToRelative(8.81f)
                lineToRelative(9f, 3.71f)
                verticalLineToRelative(-6.76f)
                lineToRelative(-5f, -2.7f)
                verticalLineToRelative(-4.1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(4.1f)
                lineToRelative(-5f, 2.7f)
                verticalLineToRelative(6.76f)
                lineToRelative(9f, -3.71f)
                verticalLineToRelative(-8.81f)
                curveTo(22f, 5.63f, 13.46f, 0.78f, 12.48f, 0.24f)
                close()
            }
        }.also { _HelmetBattle = it}
