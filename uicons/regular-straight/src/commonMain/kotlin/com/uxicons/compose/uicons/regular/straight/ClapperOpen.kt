package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperOpen: ImageVector? = null

val Icons.Rs.ClapperOpen: ImageVector
    get() = _ClapperOpen ?: UXIcon(name = "ClapperOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.43f, 11f)
                lineTo(23.27f, 6.34f)
                lineToRelative(-0.91f, -3.98f)
                curveToRelative(-0.35f, -1.61f, -1.95f, -2.64f, -3.62f, -2.27f)
                lineTo(2.35f, 4.52f)
                curveTo(0.74f, 4.88f, -0.28f, 6.48f, 0.07f, 8.11f)
                lineToRelative(0.93f, 4.05f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0f, 11.84f, 0f, 11.84f)
                lineTo(24f, 24f)
                lineTo(24f, 11f)
                lineTo(5.43f, 11f)
                close()
                moveTo(8.77f, 8.06f)
                lineToRelative(-2.69f, 0.7f)
                lineToRelative(2.46f, -3.85f)
                lineToRelative(2.7f, -0.73f)
                lineToRelative(-2.47f, 3.88f)
                close()
                moveTo(14.11f, 3.41f)
                lineToRelative(2.97f, -0.81f)
                lineToRelative(-2.45f, 3.93f)
                lineToRelative(-3.01f, 0.79f)
                lineToRelative(2.49f, -3.91f)
                close()
                moveTo(20.89f, 4.89f)
                lineToRelative(-3.45f, 0.9f)
                lineToRelative(2.33f, -3.73f)
                curveToRelative(0.31f, 0.11f, 0.56f, 0.38f, 0.64f, 0.73f)
                lineToRelative(0.48f, 2.1f)
                close()
                moveTo(2.83f, 6.46f)
                lineToRelative(2.83f, -0.77f)
                lineToRelative(-2.44f, 3.81f)
                lineToRelative(-0.74f, 0.19f)
                lineToRelative(-0.47f, -2.03f)
                curveToRelative(-0.12f, -0.54f, 0.22f, -1.07f, 0.81f, -1.2f)
                close()
                moveTo(22f, 22f)
                lineTo(3f, 22f)
                lineTo(3f, 13f)
                lineTo(22f, 13f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _ClapperOpen = it}
