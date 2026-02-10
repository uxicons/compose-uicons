package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneFlip: ImageVector? = null

val Icons.Ss.PhoneFlip: ImageVector
    get() = _PhoneFlip ?: UXIcon(name = "PhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 24f)
                curveToRelative(-1.61f, 0f, -3.1f, -0.61f, -4.21f, -1.72f)
                lineTo(0.12f, 19.11f)
                lineToRelative(6.26f, -6.27f)
                lineToRelative(3.41f, 3.41f)
                curveToRelative(2.96f, -1.28f, 5.08f, -3.41f, 6.45f, -6.47f)
                lineToRelative(-3.41f, -3.41f)
                lineTo(19.11f, 0.12f)
                lineToRelative(3.17f, 3.17f)
                curveToRelative(1.11f, 1.1f, 1.72f, 2.6f, 1.72f, 4.21f)
                curveToRelative(0f, 7.25f, -9.25f, 16.5f, -16.5f, 16.5f)
                close()
            }
        }.also { _PhoneFlip = it}
