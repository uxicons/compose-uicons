package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InfiniteCycle: ImageVector? = null

val Icons.Bs.InfiniteCycle: ImageVector
    get() = _InfiniteCycle ?: UXIcon(name = "InfiniteCycle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveToRelative(-2.72f, 0f, -5.32f, -0.94f, -7.41f, -2.59f)
                lineToRelative(-2.59f, 2.59f)
                verticalLineToRelative(-5.91f)
                curveToRelative(0f, -0.6f, 0.49f, -1.09f, 1.09f, -1.09f)
                horizontalLineToRelative(5.91f)
                lineToRelative(-2.27f, 2.27f)
                curveToRelative(1.52f, 1.1f, 3.36f, 1.73f, 5.28f, 1.73f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.92f, 0f, 3.76f, 0.62f, 5.28f, 1.73f)
                lineToRelative(-2.27f, 2.27f)
                horizontalLineToRelative(5.91f)
                curveToRelative(0.6f, 0f, 1.09f, -0.49f, 1.09f, -1.09f)
                verticalLineToRelative(-5.91f)
                lineToRelative(-2.59f, 2.59f)
                curveToRelative(-2.09f, -1.65f, -4.69f, -2.59f, -7.41f, -2.59f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                close()
                moveTo(15f, 8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                curveToRelative(-1.24f, 0f, -2.26f, -0.71f, -3f, -1.48f)
                curveToRelative(-0.74f, 0.77f, -1.76f, 1.48f, -3f, 1.48f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                curveToRelative(1.24f, 0f, 2.26f, 0.71f, 3f, 1.48f)
                curveToRelative(0.74f, -0.77f, 1.76f, -1.48f, 3f, -1.48f)
                close()
                moveTo(10.21f, 12f)
                curveToRelative(-0.44f, -0.56f, -0.94f, -1f, -1.21f, -1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(0.27f, 0f, 0.78f, -0.44f, 1.21f, -1f)
                close()
                moveTo(15f, 11f)
                curveToRelative(-0.27f, 0f, -0.78f, 0.44f, -1.21f, 1f)
                curveToRelative(0.44f, 0.56f, 0.94f, 1f, 1.21f, 1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _InfiniteCycle = it}
