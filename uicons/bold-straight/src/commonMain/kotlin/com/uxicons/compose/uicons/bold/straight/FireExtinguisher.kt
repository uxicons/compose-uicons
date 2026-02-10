package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireExtinguisher: ImageVector? = null

val Icons.Bs.FireExtinguisher: ImageVector
    get() = _FireExtinguisher ?: UXIcon(name = "FireExtinguisher") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.1f)
                curveToRelative(-1.72f, 0.23f, -3.37f, 0.83f, -4.83f, 1.79f)
                lineToRelative(1.65f, 2.5f)
                curveToRelative(0.97f, -0.64f, 2.05f, -1.05f, 3.17f, -1.25f)
                verticalLineToRelative(2.03f)
                curveToRelative(-2.86f, 0.68f, -5f, 3.25f, -5f, 6.32f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -3.07f, -2.14f, -5.64f, -5f, -6.32f)
                verticalLineToRelative(-2.18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                lineTo(8.0f, 0f)
                close()
                moveTo(10f, 13.5f)
                verticalLineToRelative(7.5f)
                lineTo(3f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                lineTo(3f, 16f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(24f, 0f)
                verticalLineToRelative(7f)
                lineToRelative(-8f, -2f)
                verticalLineToRelative(-3f)
                lineTo(24f, 0f)
                close()
            }
        }.also { _FireExtinguisher = it}
