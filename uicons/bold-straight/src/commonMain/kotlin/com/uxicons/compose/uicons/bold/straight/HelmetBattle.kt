package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelmetBattle: ImageVector? = null

val Icons.Bs.HelmetBattle: ImageVector
    get() = _HelmetBattle ?: UXIcon(name = "HelmetBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.72f, 0.42f)
                lineToRelative(-0.72f, -0.4f)
                lineToRelative(-0.72f, 0.4f)
                curveToRelative(-0.95f, 0.52f, -9.28f, 5.26f, -9.28f, 10.68f)
                verticalLineToRelative(8.79f)
                lineToRelative(10f, 4.12f)
                lineToRelative(10f, -4.12f)
                verticalLineToRelative(-8.79f)
                curveTo(22f, 5.67f, 13.67f, 0.94f, 12.72f, 0.42f)
                close()
                moveTo(19f, 17.88f)
                lineToRelative(-5.5f, 2.27f)
                verticalLineToRelative(-5.39f)
                lineToRelative(3.5f, -1.75f)
                verticalLineToRelative(-3f)
                lineTo(7f, 10.0f)
                verticalLineToRelative(3f)
                lineToRelative(3.5f, 1.75f)
                verticalLineToRelative(5.39f)
                lineToRelative(-5.5f, -2.27f)
                verticalLineToRelative(-6.78f)
                curveToRelative(0f, -2.55f, 4.03f, -5.85f, 7f, -7.63f)
                curveToRelative(2.97f, 1.79f, 7f, 5.08f, 7f, 7.63f)
                verticalLineToRelative(6.78f)
                close()
            }
        }.also { _HelmetBattle = it}
