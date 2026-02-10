package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModularHome: ImageVector? = null

val Icons.Sr.ModularHome: ImageVector
    get() = _ModularHome ?: UXIcon(name = "ModularHome") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(15f, 16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-0.0f, -3f)
                close()
                moveTo(24f, 14.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(7.72f)
                curveToRelative(-1.74f, -0.62f, -3f, -2.27f, -3f, -4.22f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(0.23f)
                lineToRelative(5.88f, -3.36f)
                curveToRelative(-0.95f, -0.5f, -1.61f, -1.49f, -1.61f, -2.64f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.37f, -0.2f, -0.71f, -0.53f, -0.88f)
                curveToRelative(-0.58f, -0.31f, -1.47f, -0.79f, -1.47f, -2.12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.09f, 0.01f, 0.12f, 0.01f, 0.12f)
                curveToRelative(0.04f, 0.04f, 0.31f, 0.18f, 0.41f, 0.23f)
                curveToRelative(0.98f, 0.53f, 1.58f, 1.54f, 1.58f, 2.64f)
                curveToRelative(0f, 1.15f, -0.66f, 2.14f, -1.61f, 2.64f)
                lineToRelative(5.88f, 3.36f)
                horizontalLineToRelative(0.23f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(15.23f, 10f)
                lineTo(12f, 8.15f)
                lineTo(8.77f, 10f)
                close()
                moveTo(21f, 16f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _ModularHome = it}
