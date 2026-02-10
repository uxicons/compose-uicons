package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancySlash: ImageVector? = null

val Icons.Bs.PenFancySlash: ImageVector
    get() = _PenFancySlash ?: UXIcon(name = "PenFancySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.4f, 15.32f)
                lineToRelative(2.55f, 2.55f)
                lineToRelative(-0.68f, 3.39f)
                lineTo(0.01f, 23.99f)
                lineToRelative(2.72f, -12.23f)
                lineToRelative(3.35f, -0.74f)
                lineToRelative(2.51f, 2.51f)
                lineToRelative(-3.35f, 0.74f)
                lineToRelative(-0.89f, 3.98f)
                lineToRelative(2.51f, -2.51f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.47f, 2.47f)
                lineToRelative(3.89f, -0.86f)
                lineToRelative(0.69f, -3.44f)
                close()
                moveTo(24.0f, 21.88f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.0f, 2.12f)
                lineTo(2.12f, 0.0f)
                lineToRelative(8.03f, 8.03f)
                lineToRelative(6.86f, -6.83f)
                curveToRelative(1.59f, -1.59f, 4.18f, -1.59f, 5.78f, 0.0f)
                curveToRelative(1.59f, 1.59f, 1.59f, 4.19f, 0f, 5.78f)
                lineToRelative(-6.86f, 6.83f)
                lineToRelative(8.06f, 8.06f)
                close()
                moveTo(12.28f, 10.16f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(6.86f, -6.83f)
                curveToRelative(0.42f, -0.42f, 0.42f, -1.11f, -0.0f, -1.53f)
                curveToRelative(-0.42f, -0.42f, -1.11f, -0.42f, -1.54f, 0f)
                lineToRelative(-6.86f, 6.83f)
                close()
            }
        }.also { _PenFancySlash = it}
