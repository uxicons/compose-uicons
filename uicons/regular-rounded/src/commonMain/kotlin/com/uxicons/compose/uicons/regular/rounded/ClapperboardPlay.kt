package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperboardPlay: ImageVector? = null

val Icons.Rr.ClapperboardPlay: ImageVector
    get() = _ClapperboardPlay ?: UXIcon(name = "ClapperboardPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 1f)
                lineTo(5f, 1f)
                curveTo(2.24f, 1f, 0f, 3.24f, 0f, 6f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 7f)
                horizontalLineToRelative(-3.89f)
                lineToRelative(3.07f, -3.07f)
                curveToRelative(0.51f, 0.54f, 0.83f, 1.27f, 0.83f, 2.07f)
                verticalLineToRelative(1f)
                close()
                moveTo(19.27f, 3.01f)
                lineToRelative(-3.97f, 3.97f)
                reflectiveCurveToRelative(-0.01f, 0.01f, -0.01f, 0.01f)
                horizontalLineToRelative(-3.42f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(3.14f)
                curveToRelative(0.09f, 0f, 0.18f, 0.01f, 0.27f, 0.01f)
                close()
                moveTo(13.03f, 3f)
                lineToRelative(-3.76f, 3.76f)
                curveToRelative(-0.07f, 0.07f, -0.13f, 0.15f, -0.17f, 0.24f)
                horizontalLineToRelative(-3.48f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(3.42f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(1.78f)
                lineTo(2.78f, 7f)
                horizontalLineToRelative(-0.78f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(19f, 21f)
                lineTo(5f, 21f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(15.05f, 15.8f)
                lineToRelative(-4.63f, 2.48f)
                curveToRelative(-0.62f, 0.37f, -1.41f, -0.07f, -1.41f, -0.8f)
                verticalLineToRelative(-4.96f)
                curveToRelative(0f, -0.72f, 0.79f, -1.17f, 1.41f, -0.8f)
                lineToRelative(4.63f, 2.48f)
                curveToRelative(0.6f, 0.36f, 0.6f, 1.24f, 0f, 1.6f)
                close()
            }
        }.also { _ClapperboardPlay = it}
