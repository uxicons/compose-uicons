package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelmetBattle: ImageVector? = null

val Icons.Ts.HelmetBattle: ImageVector
    get() = _HelmetBattle ?: UXIcon(name = "HelmetBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-0.4f, 0.21f, -10f, 5.5f, -10f, 10.98f)
                verticalLineToRelative(9.33f)
                lineToRelative(9f, 3.71f)
                verticalLineToRelative(-8.86f)
                lineToRelative(-4f, -1.96f)
                verticalLineToRelative(-2.19f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2.19f)
                lineToRelative(-4f, 1.96f)
                verticalLineToRelative(8.86f)
                lineToRelative(9f, -3.71f)
                verticalLineToRelative(-9.33f)
                curveTo(22f, 5.5f, 12.4f, 0.21f, 12f, 0f)
                close()
                moveTo(21f, 19.64f)
                lineToRelative(-7f, 2.88f)
                verticalLineToRelative(-6.75f)
                lineToRelative(4f, -1.96f)
                verticalLineToRelative(-3.81f)
                lineTo(6f, 10.0f)
                verticalLineToRelative(3.81f)
                lineToRelative(4f, 1.96f)
                verticalLineToRelative(6.75f)
                lineToRelative(-7f, -2.88f)
                verticalLineToRelative(-8.66f)
                curveTo(3f, 6.54f, 10.55f, 2.02f, 12f, 1.19f)
                curveToRelative(1.45f, 0.83f, 9f, 5.35f, 9f, 9.79f)
                verticalLineToRelative(8.66f)
                close()
            }
        }.also { _HelmetBattle = it}
