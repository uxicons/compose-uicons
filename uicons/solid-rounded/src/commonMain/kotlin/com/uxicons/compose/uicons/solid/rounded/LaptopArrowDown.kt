package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopArrowDown: ImageVector? = null

val Icons.Sr.LaptopArrowDown: ImageVector
    get() = _LaptopArrowDown ?: UXIcon(name = "LaptopArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.04f, 18.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(2.54f, 21f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.65f)
                curveToRelative(0.59f, 0f, 1.15f, 0.26f, 1.53f, 0.71f)
                lineToRelative(0.25f, 0.29f)
                horizontalLineToRelative(4.15f)
                lineToRelative(0.25f, -0.29f)
                curveToRelative(0.38f, -0.45f, 0.94f, -0.71f, 1.53f, -0.71f)
                horizontalLineToRelative(5.65f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(8.19f, 14f)
                curveToRelative(0.98f, 0f, 1.92f, 0.36f, 2.65f, 1f)
                horizontalLineToRelative(2.4f)
                curveToRelative(0.73f, -0.64f, 1.66f, -1f, 2.65f, -1f)
                horizontalLineToRelative(5.15f)
                curveToRelative(0.34f, 0f, 0.68f, 0.04f, 1f, 0.11f)
                verticalLineToRelative(-6.11f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-4.04f)
                verticalLineToRelative(6.42f)
                lineToRelative(2.32f, -2.15f)
                curveToRelative(0.4f, -0.38f, 1.04f, -0.35f, 1.41f, 0.05f)
                curveToRelative(0.38f, 0.41f, 0.35f, 1.04f, -0.05f, 1.41f)
                lineToRelative(-2.61f, 2.43f)
                curveToRelative(-0.56f, 0.56f, -1.31f, 0.84f, -2.06f, 0.84f)
                curveToRelative(-0.76f, 0f, -1.52f, -0.29f, -2.1f, -0.87f)
                lineToRelative(-2.59f, -2.4f)
                curveToRelative(-0.41f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                curveToRelative(0.38f, -0.41f, 1.01f, -0.43f, 1.41f, -0.05f)
                lineToRelative(2.32f, 2.15f)
                lineTo(11.0f, 3f)
                horizontalLineToRelative(-3.96f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6.11f)
                curveToRelative(0.32f, -0.07f, 0.66f, -0.11f, 1f, -0.11f)
                horizontalLineToRelative(5.15f)
                close()
            }
        }.also { _LaptopArrowDown = it}
