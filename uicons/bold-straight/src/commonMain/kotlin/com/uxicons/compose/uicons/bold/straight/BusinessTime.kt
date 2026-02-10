package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusinessTime: ImageVector? = null

val Icons.Bs.BusinessTime: ImageVector
    get() = _BusinessTime ?: UXIcon(name = "BusinessTime") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 11f)
                curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(18.78f, 20.9f)
                lineToRelative(-2.78f, -2.78f)
                verticalLineToRelative(-4.12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.88f)
                lineToRelative(1.9f, 1.9f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(6.03f)
                curveToRelative(-0.81f, -0.96f, -1.84f, -1.74f, -3f, -2.27f)
                verticalLineToRelative(-3.76f)
                lineTo(3f, 6f)
                verticalLineToRelative(5f)
                lineTo(12.03f, 11f)
                curveToRelative(-0.96f, 0.81f, -1.74f, 1.84f, -2.27f, 3f)
                lineTo(3f, 14f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6.76f)
                curveToRelative(0.53f, 1.16f, 1.3f, 2.19f, 2.27f, 3f)
                lineTo(0f, 24f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _BusinessTime = it}
