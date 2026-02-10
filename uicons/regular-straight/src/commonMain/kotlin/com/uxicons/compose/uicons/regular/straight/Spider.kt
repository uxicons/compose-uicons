package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spider: ImageVector? = null

val Icons.Rs.Spider: ImageVector
    get() = _Spider ?: UXIcon(name = "Spider") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12.42f)
                lineToRelative(-7.98f, -3.5f)
                lineToRelative(5.98f, -2.79f)
                lineTo(22f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.86f)
                lineToRelative(-4.53f, 2.12f)
                curveToRelative(0.02f, -0.16f, 0.03f, -0.32f, 0.03f, -0.48f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.16f, 0.01f, 0.32f, 0.03f, 0.48f)
                lineToRelative(-4.53f, -2.12f)
                lineTo(4f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.14f)
                lineToRelative(5.98f, 2.79f)
                lineTo(0f, 12.42f)
                verticalLineToRelative(2.23f)
                lineToRelative(5.16f, -2.37f)
                lineTo(0f, 19.17f)
                verticalLineToRelative(4.83f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.17f)
                lineToRelative(3.04f, -4.06f)
                curveToRelative(0.39f, 3.5f, 3.36f, 6.22f, 6.96f, 6.22f)
                reflectiveCurveToRelative(6.57f, -2.73f, 6.96f, -6.22f)
                lineToRelative(3.04f, 4.06f)
                verticalLineToRelative(4.17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.83f)
                lineToRelative(-5.16f, -6.88f)
                lineToRelative(5.16f, 2.37f)
                verticalLineToRelative(-2.23f)
                close()
                moveTo(12f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _Spider = it}
