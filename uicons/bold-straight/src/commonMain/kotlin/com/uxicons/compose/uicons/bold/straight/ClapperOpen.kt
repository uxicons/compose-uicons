package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperOpen: ImageVector? = null

val Icons.Bs.ClapperOpen: ImageVector
    get() = _ClapperOpen ?: UXIcon(name = "ClapperOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.32f, 11f)
                lineToRelative(16.33f, -3.75f)
                lineToRelative(-1.03f, -4.5f)
                curveToRelative(-0.41f, -1.88f, -2.27f, -3.08f, -4.19f, -2.66f)
                lineTo(2.7f, 3.74f)
                curveTo(0.84f, 4.11f, -0.41f, 6.08f, 0.03f, 7.92f)
                lineToRelative(0.97f, 4.24f)
                verticalLineToRelative(11.84f)
                lineTo(24f, 24f)
                lineTo(24f, 11f)
                lineTo(7.32f, 11f)
                close()
                moveTo(8.71f, 7.6f)
                lineToRelative(1.63f, -2.55f)
                lineToRelative(3.7f, -0.86f)
                lineToRelative(-1.64f, 2.56f)
                lineToRelative(-3.69f, 0.85f)
                close()
                moveTo(19.2f, 3.01f)
                curveToRelative(0.23f, 0f, 0.44f, 0.16f, 0.49f, 0.4f)
                lineToRelative(0.36f, 1.59f)
                lineToRelative(-3.47f, 0.8f)
                lineToRelative(1.65f, -2.58f)
                reflectiveCurveToRelative(0.94f, -0.21f, 0.97f, -0.21f)
                close()
                moveTo(3.03f, 6.89f)
                curveToRelative(0.04f, -0.07f, 0.14f, -0.18f, 0.33f, -0.22f)
                lineToRelative(2.81f, -0.65f)
                lineToRelative(-1.62f, 2.54f)
                lineToRelative(-1.22f, 0.28f)
                lineToRelative(-0.36f, -1.57f)
                curveToRelative(-0.04f, -0.18f, 0.03f, -0.31f, 0.07f, -0.38f)
                close()
                moveTo(21f, 21f)
                lineTo(4f, 21f)
                verticalLineToRelative(-7f)
                lineTo(21f, 14f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _ClapperOpen = it}
