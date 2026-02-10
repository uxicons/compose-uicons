package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner3: ImageVector? = null

val Icons.Ss.Banner3: ImageVector
    get() = _Banner3 ?: UXIcon(name = "Banner3") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.48f, 20.61f)
                lineToRelative(4.52f, 3.39f)
                lineToRelative(-8f, -2f)
                verticalLineToRelative(-4f)
                lineToRelative(1.69f, -2.53f)
                lineToRelative(5.96f, 3.48f)
                lineToRelative(-4.17f, 1.67f)
                close()
                moveTo(1.07f, 1.23f)
                lineTo(0.02f, 9.88f)
                lineToRelative(23.98f, 1.12f)
                lineTo(24f, 0.02f)
                lineTo(1.07f, 1.23f)
                close()
                moveTo(12f, 18f)
                verticalLineToRelative(-5.56f)
                lineToRelative(-10.37f, -0.49f)
                lineToRelative(10.37f, 6.05f)
                close()
            }
        }.also { _Banner3 = it}
