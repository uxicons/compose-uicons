package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Launch: ImageVector? = null

val Icons.Bs.Launch: ImageVector
    get() = _Launch ?: UXIcon(name = "Launch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.88f, 12.74f)
                horizontalLineToRelative(0.62f)
                verticalLineToRelative(2.26f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.26f)
                horizontalLineToRelative(0.62f)
                lineToRelative(1.76f, 1.38f)
                lineToRelative(1.12f, -1.12f)
                curveToRelative(0f, -2f, -0.42f, -3.42f, -1.73f, -4.73f)
                curveToRelative(-0.15f, -2.98f, -1.14f, -5.53f, -2.07f, -7.51f)
                curveToRelative(-0.13f, -0.28f, -0.36f, -0.5f, -0.64f, -0.64f)
                curveToRelative(-0.66f, -0.31f, -1.45f, -0.03f, -1.76f, 0.64f)
                curveToRelative(-0.93f, 1.97f, -1.92f, 4.46f, -2.06f, 7.47f)
                curveToRelative(-1.33f, 1.33f, -1.73f, 2.77f, -1.73f, 4.77f)
                lineToRelative(1.12f, 1.12f)
                close()
                moveTo(12f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24f, 19f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(4.98f)
                curveToRelative(-0.08f, 0.46f, -0.15f, 0.93f, -0.19f, 1.41f)
                curveToRelative(-0.39f, 0.49f, -0.7f, 1.02f, -0.95f, 1.59f)
                horizontalLineToRelative(-0.84f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3.31f)
                lineToRelative(0.92f, 1f)
                horizontalLineToRelative(5.54f)
                lineToRelative(0.92f, -1f)
                horizontalLineToRelative(3.31f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-0.86f)
                curveToRelative(-0.24f, -0.55f, -0.55f, -1.07f, -0.93f, -1.55f)
                curveToRelative(-0.05f, -0.5f, -0.12f, -0.98f, -0.2f, -1.45f)
                horizontalLineToRelative(4.98f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _Launch = it}
