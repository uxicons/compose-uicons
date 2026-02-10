package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bird: ImageVector? = null

val Icons.Ss.Bird: ImageVector
    get() = _Bird ?: UXIcon(name = "Bird") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.5f, 17f)
                horizontalLineToRelative(-1.71f)
                curveToRelative(-1.13f, -1.73f, -1.79f, -3.79f, -1.79f, -6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                curveToRelative(0.73f, 0f, 1.41f, -0.21f, 2f, -0.56f)
                verticalLineToRelative(2.06f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(24f, 6.5f)
                verticalLineToRelative(1.5f)
                lineToRelative(-2f, 0.86f)
                verticalLineToRelative(2.14f)
                curveToRelative(0f, 5.02f, -3.39f, 9.26f, -8f, 10.57f)
                verticalLineToRelative(2.43f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.05f)
                curveToRelative(-0.33f, 0.03f, -0.66f, 0.05f, -1f, 0.05f)
                reflectiveCurveToRelative(-0.67f, -0.02f, -1f, -0.05f)
                verticalLineToRelative(2.05f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.43f)
                curveToRelative(-1.72f, -0.49f, -3.26f, -1.38f, -4.53f, -2.57f)
                horizontalLineToRelative(0.03f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(3.19f, 0f, 5.79f, 2.49f, 5.98f, 5.63f)
                lineToRelative(2.02f, 0.86f)
                close()
                moveTo(16.5f, 4f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _Bird = it}
