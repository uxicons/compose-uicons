package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClapperboardPlay: ImageVector? = null

val Icons.Sr.ClapperboardPlay: ImageVector
    get() = _ClapperboardPlay ?: UXIcon(name = "ClapperboardPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.91f, 1f)
                horizontalLineToRelative(2.09f)
                curveToRelative(0.62f, 0f, 1.22f, 0.11f, 1.76f, 0.32f)
                lineToRelative(-5.68f, 5.68f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(6f, -6f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.4f, -0.58f, -2.67f, -1.51f, -3.58f)
                lineToRelative(-4.58f, 4.58f)
                horizontalLineToRelative(6.09f)
                close()
                moveTo(10.52f, 1f)
                lineToRelative(-6.08f, 6f)
                horizontalLineToRelative(3.65f)
                lineTo(14.09f, 1f)
                horizontalLineToRelative(-3.56f)
                close()
                moveTo(1.59f, 7f)
                lineTo(7.67f, 1f)
                horizontalLineToRelative(-2.67f)
                curveTo(2.24f, 1f, 0f, 3.24f, 0f, 6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.59f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 23f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(24f)
                close()
                moveTo(15.05f, 15.2f)
                lineToRelative(-4.63f, -2.48f)
                curveToRelative(-0.62f, -0.37f, -1.41f, 0.07f, -1.41f, 0.8f)
                verticalLineToRelative(4.96f)
                curveToRelative(0f, 0.72f, 0.79f, 1.17f, 1.41f, 0.8f)
                lineToRelative(4.63f, -2.48f)
                curveToRelative(0.6f, -0.36f, 0.6f, -1.24f, 0f, -1.6f)
                close()
            }
        }.also { _ClapperboardPlay = it}
