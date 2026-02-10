package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseUnlock: ImageVector? = null

val Icons.Sr.HouseUnlock: ImageVector
    get() = _HouseUnlock ?: UXIcon(name = "HouseUnlock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                curveToRelative(0.57f, 0f, 1.11f, 0.24f, 1.49f, 0.67f)
                curveToRelative(0.37f, 0.41f, 1.0f, 0.45f, 1.41f, 0.08f)
                curveToRelative(0.41f, -0.37f, 0.45f, -1f, 0.08f, -1.41f)
                curveToRelative(-0.76f, -0.85f, -1.85f, -1.33f, -2.98f, -1.33f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1.56f)
                curveToRelative(-1.19f, 0.69f, -2f, 1.97f, -2f, 3.44f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(18f, 20.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24f, 9.72f)
                verticalLineToRelative(3.28f)
                curveToRelative(0.03f, -3.29f, -2.77f, -6.03f, -6f, -6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                verticalLineToRelative(0.55f)
                curveToRelative(-1.25f, 1.13f, -2f, 2.75f, -2f, 4.45f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.54f, 0.59f, 2.94f, 1.54f, 4f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-9.28f)
                curveToRelative(0f, -1.67f, 0.82f, -3.21f, 2.2f, -4.14f)
                lineToRelative(7.0f, -4.72f)
                curveToRelative(1.7f, -1.15f, 3.9f, -1.15f, 5.59f, 0f)
                lineToRelative(7f, 4.72f)
                curveToRelative(1.38f, 0.93f, 2.2f, 2.48f, 2.2f, 4.14f)
                close()
            }
        }.also { _HouseUnlock = it}
