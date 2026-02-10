package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadLoaf: ImageVector? = null

val Icons.Bs.BreadLoaf: ImageVector
    get() = _BreadLoaf ?: UXIcon(name = "BreadLoaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                lineTo(4f, 2f)
                curveTo(1.79f, 2f, 0f, 3.79f, 0f, 6f)
                curveToRelative(0f, 1.45f, 0.79f, 2.76f, 2f, 3.46f)
                verticalLineToRelative(12.54f)
                lineTo(22f, 22f)
                lineTo(22f, 9.46f)
                curveToRelative(1.21f, -0.7f, 2f, -2.01f, 2f, -3.46f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(3.8f, 6.98f)
                curveToRelative(-0.46f, -0.09f, -0.8f, -0.51f, -0.8f, -0.98f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(13f, 5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.47f, -0.34f, 0.89f, -0.8f, 0.98f)
                lineToRelative(-1.2f, 0.24f)
                verticalLineToRelative(11.78f)
                lineTo(5f, 19f)
                lineTo(5f, 7.22f)
                lineToRelative(-1.2f, -0.24f)
                close()
                moveTo(20.2f, 6.98f)
                lineToRelative(-1.2f, 0.24f)
                verticalLineToRelative(11.78f)
                horizontalLineToRelative(-4f)
                lineTo(15f, 9.46f)
                curveToRelative(1.21f, -0.7f, 2f, -2.01f, 2f, -3.46f)
                curveToRelative(0f, -0.35f, -0.04f, -0.68f, -0.13f, -1f)
                horizontalLineToRelative(3.13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.47f, -0.34f, 0.89f, -0.8f, 0.98f)
                close()
            }
        }.also { _BreadLoaf = it}
