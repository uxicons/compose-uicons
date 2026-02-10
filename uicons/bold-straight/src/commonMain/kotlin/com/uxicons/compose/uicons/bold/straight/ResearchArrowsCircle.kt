package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResearchArrowsCircle: ImageVector? = null

val Icons.Bs.ResearchArrowsCircle: ImageVector
    get() = _ResearchArrowsCircle ?: UXIcon(name = "ResearchArrowsCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 17.09f)
                verticalLineToRelative(5.91f)
                lineToRelative(-2.53f, -2.53f)
                curveToRelative(-2.23f, 2.23f, -5.27f, 3.53f, -8.47f, 3.53f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                lineTo(3f, 12f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                curveToRelative(2.4f, 0f, 4.68f, -0.98f, 6.35f, -2.65f)
                lineToRelative(-2.35f, -2.35f)
                horizontalLineToRelative(5.91f)
                curveToRelative(0.6f, 0f, 1.09f, 0.49f, 1.09f, 1.09f)
                close()
                moveTo(2.09f, 8f)
                horizontalLineToRelative(5.91f)
                lineToRelative(-2.35f, -2.35f)
                curveToRelative(1.68f, -1.67f, 3.95f, -2.65f, 6.35f, -2.65f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                horizontalLineToRelative(3f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                curveTo(8.8f, 0f, 5.76f, 1.3f, 3.53f, 3.53f)
                lineTo(1f, 1f)
                lineTo(1f, 6.91f)
                curveToRelative(0f, 0.6f, 0.49f, 1.09f, 1.09f, 1.09f)
                close()
                moveTo(12.83f, 19.19f)
                lineToRelative(2.87f, -5.51f)
                curveToRelative(0.38f, -0.63f, 0.4f, -1.42f, 0.04f, -2.07f)
                curveToRelative(-0.37f, -0.68f, -1.08f, -1.11f, -1.85f, -1.11f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(2.24f, -4.31f)
                lineToRelative(-2.66f, -1.39f)
                lineToRelative(-3.08f, 5.97f)
                curveToRelative(-0.19f, 0.64f, -0.07f, 1.34f, 0.33f, 1.87f)
                curveToRelative(0.4f, 0.54f, 1.03f, 0.85f, 1.7f, 0.85f)
                horizontalLineToRelative(2.3f)
                lineToRelative(-2.24f, 4.31f)
                lineToRelative(2.66f, 1.39f)
                close()
            }
        }.also { _ResearchArrowsCircle = it}
