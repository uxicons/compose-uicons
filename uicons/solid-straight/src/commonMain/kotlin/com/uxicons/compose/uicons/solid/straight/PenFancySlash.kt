package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancySlash: ImageVector? = null

val Icons.Ss.PenFancySlash: ImageVector
    get() = _PenFancySlash ?: UXIcon(name = "PenFancySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.03f, 12.25f)
                lineToRelative(3.84f, 3.84f)
                lineToRelative(-1.2f, 5.42f)
                lineToRelative(-9.13f, 2.5f)
                lineToRelative(6.01f, -6.01f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(0.11f, 22.59f)
                lineToRelative(2.5f, -9.13f)
                lineToRelative(5.42f, -1.2f)
                close()
                moveTo(23.26f, 4.38f)
                curveToRelative(0.48f, -0.48f, 0.74f, -1.12f, 0.74f, -1.79f)
                reflectiveCurveToRelative(-0.26f, -1.32f, -0.74f, -1.79f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0f)
                lineToRelative(-8.73f, 8.73f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-9.43f, -9.43f)
                lineToRelative(8.73f, -8.73f)
                close()
            }
        }.also { _PenFancySlash = it}
