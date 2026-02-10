package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Y2K: ImageVector? = null

val Icons.Ss.Y2K: ImageVector
    get() = _Y2K ?: UXIcon(name = "Y2K") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.97f, 12.04f)
                lineToRelative(2.03f, 5.96f)
                horizontalLineToRelative(-2f)
                lineToRelative(-1.67f, -5f)
                horizontalLineToRelative(-1.33f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1.33f)
                lineToRelative(1.67f, -5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 6f)
                horizontalLineToRelative(-2.27f)
                lineToRelative(-2.23f, 4.61f)
                lineToRelative(-2.23f, -4.61f)
                horizontalLineToRelative(-2.26f)
                lineToRelative(3.5f, 6.96f)
                verticalLineToRelative(5.04f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.89f)
                lineToRelative(3.5f, -7.11f)
                close()
                moveTo(12.9f, 14.53f)
                curveToRelative(1.38f, -1.16f, 3.1f, -2.61f, 3.1f, -5.03f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 1.49f, -1.16f, 2.47f, -2.38f, 3.5f)
                curveToRelative(-1.23f, 1.03f, -2.62f, 2.2f, -2.62f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.62f)
                curveToRelative(0.35f, -0.48f, 0.91f, -0.95f, 1.52f, -1.47f)
                close()
            }
        }.also { _Y2K = it}
