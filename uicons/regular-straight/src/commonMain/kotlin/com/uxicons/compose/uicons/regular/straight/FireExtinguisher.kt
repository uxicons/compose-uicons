package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireExtinguisher: ImageVector? = null

val Icons.Rs.FireExtinguisher: ImageVector
    get() = _FireExtinguisher ?: UXIcon(name = "FireExtinguisher") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.05f)
                curveToRelative(-1.8f, 0.16f, -3.53f, 0.76f, -5.05f, 1.76f)
                lineToRelative(1.1f, 1.67f)
                curveToRelative(1.19f, -0.79f, 2.54f, -1.25f, 3.95f, -1.41f)
                verticalLineToRelative(2.02f)
                curveToRelative(-2.83f, 0.48f, -5f, 2.94f, -5f, 5.91f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.97f, -2.17f, -5.43f, -5f, -5.91f)
                verticalLineToRelative(-2.09f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                lineTo(7.0f, 1f)
                close()
                moveTo(10f, 13f)
                verticalLineToRelative(9f)
                lineTo(2f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                lineTo(2f, 18f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(15f, 2.73f)
                verticalLineToRelative(2.54f)
                lineToRelative(9f, 2.7f)
                lineTo(24f, 0.03f)
                lineToRelative(-9f, 2.7f)
                close()
                moveTo(22f, 5.28f)
                lineToRelative(-4.27f, -1.28f)
                lineToRelative(4.27f, -1.28f)
                verticalLineToRelative(2.57f)
                close()
            }
        }.also { _FireExtinguisher = it}
