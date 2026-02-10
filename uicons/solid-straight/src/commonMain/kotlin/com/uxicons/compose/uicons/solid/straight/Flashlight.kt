package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flashlight: ImageVector? = null

val Icons.Ss.Flashlight: ImageVector
    get() = _Flashlight ?: UXIcon(name = "Flashlight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.41f, 14f)
                horizontalLineToRelative(-5.83f)
                lineToRelative(-4.59f, -4.59f)
                lineTo(10f, 3.59f)
                lineTo(13.5f, 0.09f)
                lineToRelative(10.41f, 10.41f)
                lineToRelative(-3.5f, 3.5f)
                close()
                moveTo(8.78f, 10.86f)
                lineTo(0.63f, 19.02f)
                curveToRelative(-0.83f, 0.83f, -0.83f, 2.19f, 0f, 3.02f)
                lineToRelative(1.34f, 1.34f)
                curveToRelative(0.83f, 0.83f, 2.19f, 0.83f, 3.02f, 0f)
                lineToRelative(8.16f, -8.16f)
                lineToRelative(-4.36f, -4.36f)
                close()
                moveTo(6.74f, 15.84f)
                lineToRelative(2f, -2f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2f, 2f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }.also { _Flashlight = it}
