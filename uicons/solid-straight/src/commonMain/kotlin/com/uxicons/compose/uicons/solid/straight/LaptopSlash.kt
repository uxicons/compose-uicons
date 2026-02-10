package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopSlash: ImageVector? = null

val Icons.Ss.LaptopSlash: ImageVector
    get() = _LaptopSlash ?: UXIcon(name = "LaptopSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.08f, 15f)
                lineTo(2f, 15f)
                lineTo(2f, 6.38f)
                lineToRelative(9.62f, 9.62f)
                horizontalLineToRelative(-1.69f)
                lineToRelative(-0.85f, -1f)
                close()
                moveTo(8.99f, 18f)
                lineToRelative(-0.85f, -1f)
                lineTo(0f, 17f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(13.62f)
                lineToRelative(-3f, -3f)
                horizontalLineToRelative(-4.63f)
                close()
                moveTo(24.0f, 18f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.59f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(5.59f)
                lineTo(22.0f, 3f)
                lineTo(4.41f, 3f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.78f, -1.78f)
                curveToRelative(1.07f, -0.46f, 1.82f, -1.52f, 1.82f, -2.76f)
                close()
            }
        }.also { _LaptopSlash = it}
