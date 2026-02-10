package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterLadder: ImageVector? = null

val Icons.Rs.WaterLadder: ImageVector
    get() = _WaterLadder ?: UXIcon(name = "WaterLadder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                lineTo(19f, 4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1f)
                lineTo(22f, 0f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2f)
                lineTo(7f, 6f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(17f, 8f)
                verticalLineToRelative(4f)
                lineTo(7f, 12f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                close()
                moveTo(24.01f, 22.63f)
                curveToRelative(-0.76f, 0.87f, -1.86f, 1.37f, -3.01f, 1.37f)
                curveToRelative(-1.19f, 0f, -2.27f, -0.53f, -3f, -1.36f)
                curveToRelative(-0.73f, 0.83f, -1.81f, 1.36f, -3f, 1.36f)
                reflectiveCurveToRelative(-2.27f, -0.53f, -3f, -1.36f)
                curveToRelative(-0.73f, 0.83f, -1.81f, 1.36f, -3f, 1.36f)
                reflectiveCurveToRelative(-2.27f, -0.53f, -3f, -1.36f)
                curveToRelative(-0.73f, 0.83f, -1.81f, 1.36f, -3f, 1.36f)
                curveToRelative(-1.15f, 0f, -2.25f, -0.5f, -3.01f, -1.37f)
                lineToRelative(1.51f, -1.31f)
                curveToRelative(0.38f, 0.43f, 0.93f, 0.68f, 1.5f, 0.68f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0.57f, 0f, 1.12f, -0.25f, 1.5f, -0.68f)
                lineToRelative(1.51f, 1.31f)
                close()
            }
        }.also { _WaterLadder = it}
