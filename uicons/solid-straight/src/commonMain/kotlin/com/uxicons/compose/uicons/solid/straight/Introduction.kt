package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Introduction: ImageVector? = null

val Icons.Ss.Introduction: ImageVector
    get() = _Introduction ?: UXIcon(name = "Introduction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 13f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(15f, 19f)
                verticalLineToRelative(5f)
                lineTo(4f, 24f)
                verticalLineToRelative(-7f)
                lineTo(0f, 17f)
                lineTo(0f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(9f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(24f, 2f)
                verticalLineToRelative(6f)
                lineToRelative(-5.96f, 0.0f)
                lineToRelative(-2.82f, 2.37f)
                curveToRelative(-0.53f, 0.34f, -1.22f, -0.04f, -1.22f, -0.67f)
                lineToRelative(-0.0f, -7.71f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2.0f, -2f)
                lineTo(22.0f, 0f)
                curveToRelative(1.1f, 0f, 2.0f, 0.9f, 2.0f, 2f)
                close()
            }
        }.also { _Introduction = it}
