package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner3: ImageVector? = null

val Icons.Bs.Banner3: ImageVector
    get() = _Banner3 ?: UXIcon(name = "Banner3") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, -0.08f)
                lineTo(1.15f, 1.06f)
                lineTo(0.02f, 10.98f)
                lineToRelative(-0.02f, 0.02f)
                lineToRelative(12f, 7f)
                verticalLineToRelative(-6.46f)
                lineToRelative(12f, 0.53f)
                lineTo(24f, -0.08f)
                close()
                moveTo(21f, 8.93f)
                lineToRelative(-17.64f, -0.78f)
                lineToRelative(0.48f, -4.21f)
                lineToRelative(17.15f, -0.86f)
                verticalLineToRelative(5.86f)
                close()
                moveTo(5.48f, 20.61f)
                lineToRelative(4.52f, 3.39f)
                lineToRelative(-8f, -2f)
                verticalLineToRelative(-4f)
                lineToRelative(1.69f, -2.53f)
                lineToRelative(5.96f, 3.48f)
                lineToRelative(-4.17f, 1.67f)
                close()
            }
        }.also { _Banner3 = it}
