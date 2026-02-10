package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Toilet: ImageVector? = null

val Icons.Bs.Toilet: ImageVector
    get() = _Toilet ?: UXIcon(name = "Toilet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(-0.24f, -1.69f, -1.7f, -3f, -3.46f, -3f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.28f)
                curveToRelative(-1.31f, 0.87f, -2f, 2.17f, -2f, 3.22f)
                curveToRelative(0f, 0.5f, 0.12f, 1.05f, 0.3f, 1.43f)
                curveToRelative(0.75f, 1.95f, 2.93f, 4.35f, 6.84f, 4.93f)
                curveToRelative(-0.79f, 2.06f, -3.33f, 2.1f, -3.33f, 4.63f)
                horizontalLineToRelative(10.38f)
                curveToRelative(0f, -2.54f, -2.55f, -2.57f, -3.33f, -4.63f)
                curveToRelative(3.91f, -0.59f, 6.1f, -2.98f, 6.84f, -4.93f)
                curveToRelative(0.18f, -0.38f, 0.3f, -0.93f, 0.3f, -1.43f)
                curveToRelative(0f, -1.05f, -0.69f, -2.35f, -2f, -3.22f)
                verticalLineToRelative(-3.78f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 3.5f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-5.1f, 0f, -5.99f, -0.5f, -6f, -0.99f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, -0.01f)
                curveToRelative(0.06f, -0.2f, 0.44f, -0.72f, 1.23f, -1f)
                horizontalLineToRelative(9.54f)
                curveToRelative(0.79f, 0.28f, 1.16f, 0.82f, 1.23f, 1.03f)
                curveToRelative(0f, 0.47f, -0.53f, 0.97f, -6.0f, 0.97f)
                close()
            }
        }.also { _Toilet = it}
