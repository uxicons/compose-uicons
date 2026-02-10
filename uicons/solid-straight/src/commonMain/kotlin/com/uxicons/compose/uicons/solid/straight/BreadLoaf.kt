package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadLoaf: ImageVector? = null

val Icons.Ss.BreadLoaf: ImageVector
    get() = _BreadLoaf ?: UXIcon(name = "BreadLoaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 3f)
                lineTo(12.5f, 3f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 1.37f, -0.8f, 2.59f, -2f, 3.16f)
                verticalLineToRelative(11.34f)
                lineTo(2f, 21f)
                lineTo(2f, 9.66f)
                curveToRelative(-1.2f, -0.57f, -2f, -1.79f, -2f, -3.16f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(20.5f, 3f)
                horizontalLineToRelative(-3.76f)
                curveToRelative(0.79f, 0.95f, 1.26f, 2.17f, 1.26f, 3.5f)
                curveToRelative(0f, 1.65f, -0.76f, 3.21f, -2f, 4.24f)
                verticalLineToRelative(10.26f)
                horizontalLineToRelative(6f)
                lineTo(22f, 9.66f)
                curveToRelative(1.2f, -0.57f, 2f, -1.79f, 2f, -3.16f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _BreadLoaf = it}
