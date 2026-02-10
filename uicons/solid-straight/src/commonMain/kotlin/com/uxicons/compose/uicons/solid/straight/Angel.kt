package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angel: ImageVector? = null

val Icons.Ss.Angel: ImageVector
    get() = _Angel ?: UXIcon(name = "Angel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 5.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(4.04f, 24f)
                horizontalLineToRelative(15.93f)
                lineToRelative(-6.31f, -14.3f)
                curveToRelative(-0.01f, 0.01f, -0.01f, 0.02f, -0.02f, 0.02f)
                curveToRelative(-1.05f, 0.37f, -2.2f, 0.37f, -3.26f, 0.01f)
                lineToRelative(-6.34f, 14.27f)
                close()
                moveTo(20.5f, 6f)
                curveToRelative(-2.17f, 0f, -4.04f, 1.15f, -5.32f, 2.2f)
                lineToRelative(4.76f, 10.8f)
                horizontalLineToRelative(2.05f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.01f, -0.34f, -10f, -3.5f, -10f)
                close()
                moveTo(3.5f, 6f)
                curveTo(0.34f, 6f, 0f, 12.99f, 0f, 16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.07f)
                lineToRelative(4.78f, -10.77f)
                curveToRelative(-1.27f, -1.07f, -3.17f, -2.23f, -5.35f, -2.23f)
                close()
                moveTo(12f, 0f)
                curveToRelative(-2.85f, 0f, -5f, 1.29f, -5f, 3f)
                curveToRelative(0f, 0.72f, 0.4f, 1.36f, 1.06f, 1.87f)
                curveToRelative(0.12f, -0.7f, 0.41f, -1.34f, 0.84f, -1.87f)
                curveToRelative(0f, 0f, 0.6f, -1f, 3.1f, -1f)
                reflectiveCurveToRelative(3.1f, 1f, 3.1f, 1f)
                curveToRelative(0.43f, 0.53f, 0.73f, 1.17f, 0.84f, 1.87f)
                curveToRelative(0.66f, -0.51f, 1.06f, -1.15f, 1.06f, -1.87f)
                curveToRelative(0f, -1.71f, -2.15f, -3f, -5f, -3f)
                close()
            }
        }.also { _Angel = it}
