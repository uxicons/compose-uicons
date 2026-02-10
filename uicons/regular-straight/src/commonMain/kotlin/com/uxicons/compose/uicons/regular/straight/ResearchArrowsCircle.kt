package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResearchArrowsCircle: ImageVector? = null

val Icons.Rs.ResearchArrowsCircle: ImageVector
    get() = _ResearchArrowsCircle ?: UXIcon(name = "ResearchArrowsCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.93f, 18.46f)
                lineToRelative(2.81f, -5.46f)
                horizontalLineToRelative(-4.13f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.24f, -1.3f, -0.65f)
                curveToRelative(-0.3f, -0.41f, -0.4f, -0.94f, -0.25f, -1.43f)
                lineToRelative(3.31f, -6.38f)
                lineToRelative(1.77f, 0.92f)
                lineToRelative(-2.89f, 5.54f)
                horizontalLineToRelative(4.13f)
                curveToRelative(0.59f, 0f, 1.13f, 0.32f, 1.41f, 0.84f)
                curveToRelative(0.27f, 0.5f, 0.25f, 1.1f, -0.04f, 1.59f)
                lineToRelative(-3.06f, 5.94f)
                lineToRelative(-1.78f, -0.91f)
                close()
                moveTo(3f, 8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.99f)
                curveToRelative(1.88f, -2.49f, 4.84f, -4f, 7.99f, -4f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                horizontalLineToRelative(2f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                curveTo(8.52f, 0f, 5.26f, 1.54f, 3f, 4.1f)
                lineTo(3f, 1f)
                lineTo(1f, 1f)
                lineTo(1f, 6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(21f, 16f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.99f)
                curveToRelative(-1.88f, 2.49f, -4.84f, 4f, -7.99f, 4f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                lineTo(0f, 12f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                curveToRelative(3.48f, 0f, 6.74f, -1.54f, 9f, -4.1f)
                verticalLineToRelative(3.1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _ResearchArrowsCircle = it}
