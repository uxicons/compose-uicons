package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoltSlash: ImageVector? = null

val Icons.Ss.BoltSlash: ImageVector
    get() = _BoltSlash ?: UXIcon(name = "BoltSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.08f, 15.67f)
                lineToRelative(2.55f, -3.85f)
                curveToRelative(0.5f, -0.76f, 0.55f, -1.73f, 0.12f, -2.52f)
                curveToRelative(-0.43f, -0.8f, -1.26f, -1.3f, -2.17f, -1.3f)
                horizontalLineToRelative(-3.8f)
                lineTo(15.81f, 0f)
                horizontalLineToRelative(-3.32f)
                lineToRelative(-4.42f, 6.66f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.87f, -6.87f)
                close()
                moveTo(14.83f, 19.07f)
                lineToRelative(-3.27f, 4.93f)
                horizontalLineToRelative(-3.32f)
                lineToRelative(2.02f, -8f)
                horizontalLineToRelative(-3.77f)
                curveToRelative(-0.92f, 0f, -1.76f, -0.5f, -2.19f, -1.31f)
                curveToRelative(-0.43f, -0.8f, -0.39f, -1.76f, 0.11f, -2.51f)
                lineToRelative(1.41f, -2.12f)
                lineToRelative(9.01f, 9.01f)
                close()
            }
        }.also { _BoltSlash = it}
