package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Introduction: ImageVector? = null

val Icons.Rs.Introduction: ImageVector
    get() = _Introduction ?: UXIcon(name = "Introduction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(4f, 9f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(6f, 9f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(11f, 15f)
                lineTo(2f, 15f)
                lineTo(2f, 5f)
                lineTo(0f, 5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(11f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(6.5f)
                lineToRelative(-5.57f, 0.01f)
                lineToRelative(-1.67f, 1.71f)
                curveToRelative(-0.29f, 0.19f, -0.63f, 0.28f, -0.96f, 0.28f)
                curveToRelative(-0.29f, 0f, -0.59f, -0.07f, -0.86f, -0.22f)
                curveToRelative(-0.57f, -0.31f, -0.93f, -0.92f, -0.93f, -1.57f)
                lineTo(14.0f, 2.5f)
                curveTo(14.0f, 1.13f, 15.12f, 0.0f, 16.5f, 0.0f)
                lineToRelative(5.0f, -0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.67f, 0f, 1.29f, 0.26f, 1.76f, 0.73f)
                curveToRelative(0.47f, 0.47f, 0.73f, 1.1f, 0.73f, 1.77f)
                close()
                moveTo(22f, 2.5f)
                curveToRelative(0f, -0.18f, -0.09f, -0.3f, -0.15f, -0.35f)
                reflectiveCurveToRelative(-0.17f, -0.15f, -0.35f, -0.15f)
                horizontalLineToRelative(0f)
                lineToRelative(-5.0f, 0.0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(6.15f)
                reflectiveCurveToRelative(1.57f, -1.65f, 1.57f, -1.65f)
                lineToRelative(4.43f, -0.0f)
                lineTo(22.0f, 2.5f)
                close()
            }
        }.also { _Introduction = it}
