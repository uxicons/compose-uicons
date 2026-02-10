package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FingerNail: ImageVector? = null

val Icons.Rs.FingerNail: ImageVector
    get() = _FingerNail ?: UXIcon(name = "FingerNail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8.4f)
                curveToRelative(1.27f, 1.37f, 2f, 3.17f, 2f, 5.1f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -3.1f, -1.49f, -5.94f, -4f, -7.72f)
                verticalLineToRelative(-1.78f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1.78f)
                curveToRelative(-2.51f, 1.78f, -4f, 4.62f, -4f, 7.72f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(2f)
                lineTo(4f, 13.5f)
                curveToRelative(0f, -1.93f, 0.73f, -3.73f, 2f, -5.1f)
                verticalLineToRelative(4.6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4.6f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, 0.89f, -0.4f, 1.68f, -1.02f, 2.23f)
                curveToRelative(-0.79f, -0.71f, -1.83f, -1.15f, -2.98f, -1.15f)
                reflectiveCurveToRelative(-2.19f, 0.44f, -2.98f, 1.15f)
                curveToRelative(-0.62f, -0.55f, -1.02f, -1.34f, -1.02f, -2.23f)
                lineTo(8f, 4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                lineTo(16f, 13f)
                close()
                moveTo(24f, 21f)
                lineToRelative(-2f, 1f)
                lineToRelative(-1f, 2f)
                lineToRelative(-1f, -2f)
                lineToRelative(-2f, -1f)
                lineToRelative(2f, -1f)
                lineToRelative(1f, -2f)
                lineToRelative(1f, 2f)
                lineToRelative(2f, 1f)
                close()
                moveTo(2.5f, 5f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(1.67f, -0.83f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(-1.67f, 0.83f)
                lineToRelative(-0.83f, 1.67f)
                close()
            }
        }.also { _FingerNail = it}
