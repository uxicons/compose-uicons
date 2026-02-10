package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointRight: ImageVector? = null

val Icons.Bs.HandBackPointRight: ImageVector
    get() = _HandBackPointRight ?: UXIcon(name = "HandBackPointRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineToRelative(-5.94f)
                lineToRelative(-3.98f, -3.98f)
                curveToRelative(-1.36f, -1.36f, -3.58f, -1.36f, -4.97f, 0.02f)
                lineTo(-0.01f, 7.4f)
                lineTo(0.0f, 22f)
                lineTo(14.17f, 22f)
                lineToRelative(2f, -8f)
                horizontalLineToRelative(3.83f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(20f, 11f)
                horizontalLineToRelative(-6.17f)
                lineToRelative(-2f, 8f)
                lineTo(3.0f, 19f)
                lineToRelative(-0.01f, -10.4f)
                lineTo(7.26f, 4.15f)
                curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0f)
                lineToRelative(1.85f, 1.85f)
                horizontalLineToRelative(-1.82f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _HandBackPointRight = it}
