package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Enter: ImageVector? = null

val Icons.Sr.Enter: ImageVector
    get() = _Enter ?: UXIcon(name = "Enter", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(149.33f, 469.33f)
                horizontalLineToRelative(-42.67f)
                curveToRelative(-35.35f, 0f, -64f, -28.65f, -64f, -64f)
                verticalLineTo(106.67f)
                curveToRelative(0f, -35.35f, 28.65f, -64f, 64f, -64f)
                horizontalLineToRelative(42.67f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                reflectiveCurveTo(161.12f, 0f, 149.33f, 0f)
                horizontalLineToRelative(-42.67f)
                curveTo(47.79f, 0.07f, 0.07f, 47.79f, 0f, 106.67f)
                verticalLineToRelative(298.67f)
                curveTo(0.07f, 464.21f, 47.79f, 511.93f, 106.67f, 512f)
                horizontalLineToRelative(42.67f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                curveTo(170.67f, 478.89f, 161.12f, 469.33f, 149.33f, 469.33f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(490.67f, 234.67f)
                lineTo(490.67f, 234.67f)
                lineToRelative(-336.58f, 0.68f)
                curveToRelative(1.87f, -3.47f, 4.21f, -6.68f, 6.95f, -9.52f)
                lineToRelative(82.75f, -82.75f)
                curveToRelative(8.48f, -8.19f, 8.71f, -21.69f, 0.52f, -30.17f)
                curveToRelative(-8.19f, -8.48f, -21.69f, -8.71f, -30.17f, -0.52f)
                curveToRelative(-0.18f, 0.17f, -0.35f, 0.35f, -0.52f, 0.52f)
                lineToRelative(-82.79f, 82.75f)
                curveToRelative(-33.31f, 33.32f, -33.31f, 87.34f, 0f, 120.66f)
                lineToRelative(82.75f, 82.75f)
                curveToRelative(8.19f, 8.48f, 21.69f, 8.71f, 30.17f, 0.52f)
                curveToRelative(8.48f, -8.19f, 8.71f, -21.69f, 0.52f, -30.17f)
                curveToRelative(-0.17f, -0.18f, -0.35f, -0.35f, -0.52f, -0.52f)
                lineToRelative(-82.75f, -82.75f)
                curveToRelative(-2.39f, -2.46f, -4.47f, -5.2f, -6.21f, -8.15f)
                lineToRelative(335.87f, -0.68f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                curveTo(512f, 244.22f, 502.45f, 234.67f, 490.67f, 234.67f)
                close()
            }
        }.also { _Enter = it}
