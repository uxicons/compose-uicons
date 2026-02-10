package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exit: ImageVector? = null

val Icons.Sr.Exit: ImageVector
    get() = _Exit ?: UXIcon(name = "Exit", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(487.06f, 195.67f)
                lineToRelative(-82.75f, -82.75f)
                curveToRelative(-8.48f, -8.19f, -21.98f, -7.95f, -30.17f, 0.52f)
                curveToRelative(-7.99f, 8.27f, -7.99f, 21.37f, 0f, 29.64f)
                lineToRelative(82.75f, 82.75f)
                curveToRelative(2.46f, 2.51f, 4.61f, 5.3f, 6.4f, 8.32f)
                curveToRelative(-0.32f, 0f, -0.58f, -0.17f, -0.9f, -0.17f)
                lineToRelative(0f, 0f)
                lineToRelative(-334.59f, 0.68f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                curveToRelative(0f, 11.78f, 9.55f, 21.33f, 21.33f, 21.33f)
                lineToRelative(0f, 0f)
                lineToRelative(334.46f, -0.68f)
                curveToRelative(0.6f, 0f, 1.09f, -0.3f, 1.66f, -0.34f)
                curveToRelative(-1.89f, 3.61f, -4.29f, 6.93f, -7.13f, 9.86f)
                lineToRelative(-82.75f, 82.75f)
                curveToRelative(-8.48f, 8.19f, -8.71f, 21.69f, -0.52f, 30.17f)
                curveToRelative(8.19f, 8.48f, 21.69f, 8.71f, 30.17f, 0.52f)
                curveToRelative(0.18f, -0.17f, 0.35f, -0.35f, 0.52f, -0.52f)
                lineToRelative(82.75f, -82.75f)
                curveToRelative(33.31f, -33.32f, 33.31f, -87.34f, 0f, -120.66f)
                lineTo(487.06f, 195.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(149.37f, 469.33f)
                horizontalLineToRelative(-42.67f)
                curveToRelative(-35.35f, 0f, -64f, -28.65f, -64f, -64f)
                verticalLineTo(106.67f)
                curveToRelative(0f, -35.35f, 28.65f, -64f, 64f, -64f)
                horizontalLineToRelative(42.67f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                reflectiveCurveTo(161.16f, 0f, 149.37f, 0f)
                horizontalLineToRelative(-42.67f)
                curveTo(47.83f, 0.07f, 0.11f, 47.79f, 0.04f, 106.67f)
                verticalLineToRelative(298.67f)
                curveTo(0.11f, 464.21f, 47.83f, 511.93f, 106.71f, 512f)
                horizontalLineToRelative(42.67f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                curveTo(170.71f, 478.89f, 161.16f, 469.33f, 149.37f, 469.33f)
                close()
            }
        }.also { _Exit = it}
