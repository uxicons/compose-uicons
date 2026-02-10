package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelmetBattle: ImageVector? = null

val Icons.Rs.HelmetBattle: ImageVector
    get() = _HelmetBattle ?: UXIcon(name = "HelmetBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.48f, 0.24f)
                lineToRelative(-0.48f, -0.27f)
                lineToRelative(-0.48f, 0.27f)
                curveToRelative(-0.97f, 0.54f, -9.52f, 5.39f, -9.52f, 10.79f)
                verticalLineToRelative(8.81f)
                lineToRelative(10f, 4.12f)
                lineToRelative(10f, -4.12f)
                verticalLineToRelative(-8.81f)
                curveTo(22f, 5.63f, 13.46f, 0.78f, 12.48f, 0.24f)
                close()
                moveTo(12f, 15.06f)
                lineToRelative(-4f, -2.16f)
                verticalLineToRelative(-0.9f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(0.9f)
                lineToRelative(-4f, 2.16f)
                close()
                moveTo(20f, 18.51f)
                lineToRelative(-7f, 2.88f)
                verticalLineToRelative(-4.59f)
                lineToRelative(5f, -2.7f)
                verticalLineToRelative(-4.1f)
                lineTo(6f, 10.0f)
                verticalLineToRelative(4.1f)
                lineToRelative(5f, 2.7f)
                verticalLineToRelative(4.59f)
                lineToRelative(-7f, -2.88f)
                verticalLineToRelative(-7.47f)
                curveToRelative(0f, -3.36f, 5.38f, -7.23f, 8f, -8.77f)
                curveToRelative(2.62f, 1.54f, 8f, 5.4f, 8f, 8.77f)
                verticalLineToRelative(7.47f)
                close()
            }
        }.also { _HelmetBattle = it}
