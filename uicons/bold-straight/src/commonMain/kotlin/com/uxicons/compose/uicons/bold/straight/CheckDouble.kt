package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckDouble: ImageVector? = null

val Icons.Bs.CheckDouble: ImageVector
    get() = _CheckDouble ?: UXIcon(name = "CheckDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.01f, 11.26f)
                lineTo(1.92f, 7.04f)
                lineToRelative(2.15f, -2.09f)
                lineToRelative(3.71f, 3.83f)
                lineTo(16.04f, 0.54f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-8.61f, 8.61f)
                curveToRelative(-0.47f, 0.47f, -1.1f, 0.73f, -1.77f, 0.73f)
                curveToRelative(-0.67f, -0.0f, -1.3f, -0.26f, -1.77f, -0.74f)
                close()
                moveTo(21.4f, 6.18f)
                lineToRelative(-13.61f, 13.61f)
                lineToRelative(-5.22f, -5.27f)
                lineToRelative(-2.13f, 2.11f)
                lineToRelative(5.57f, 5.62f)
                curveToRelative(0.47f, 0.48f, 1.1f, 0.74f, 1.77f, 0.74f)
                curveToRelative(0.67f, 0f, 1.3f, -0.26f, 1.77f, -0.73f)
                lineToRelative(13.97f, -13.97f)
                lineToRelative(-2.12f, -2.12f)
                close()
            }
        }.also { _CheckDouble = it}
