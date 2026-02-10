package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireBurner: ImageVector? = null

val Icons.Ss.FireBurner: ImageVector
    get() = _FireBurner ?: UXIcon(name = "FireBurner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(0.76f)
                curveToRelative(0.65f, 0.81f, 1.45f, 1.49f, 2.37f, 2f)
                horizontalLineToRelative(-3.13f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.13f)
                curveToRelative(0.92f, -0.51f, 1.72f, -1.19f, 2.37f, -2f)
                horizontalLineToRelative(0.76f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 8f)
                curveToRelative(0f, -1.73f, 1f, -3.06f, 2.0f, -4.09f)
                curveToRelative(0f, 0f, 0.68f, 2.09f, 1.29f, 2.09f)
                curveToRelative(1.26f, 0f, 0.9f, -3.9f, 2.72f, -6f)
                curveToRelative(1.9f, 1.9f, 6f, 4.53f, 6f, 8f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(10.59f, 11.41f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                reflectiveCurveToRelative(0.78f, -2.05f, 0f, -2.83f)
                horizontalLineToRelative(0f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(-1.42f, 1.42f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                close()
            }
        }.also { _FireBurner = it}
