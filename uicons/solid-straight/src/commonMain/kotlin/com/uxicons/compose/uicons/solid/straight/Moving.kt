package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moving: ImageVector? = null

val Icons.Ss.Moving: ImageVector
    get() = _Moving ?: UXIcon(name = "Moving") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 10f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 6f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(4.38f, 1f, 3f, 1f)
                reflectiveCurveTo(0.5f, 2.12f, 0.5f, 3.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(5.86f, 9.1f)
                curveToRelative(-0.23f, -0.52f, -0.92f, -2.1f, -2.86f, -2.1f)
                curveToRelative(-1.65f, 0f, -3f, 1.34f, -3f, 2.98f)
                verticalLineToRelative(8.02f)
                lineTo(2f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                lineToRelative(1.81f, 4f)
                horizontalLineToRelative(4.19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.85f)
                lineToRelative(-1.29f, -2.9f)
                close()
                moveTo(24f, 9.98f)
                curveToRelative(0f, -1.65f, -1.35f, -2.98f, -3f, -2.98f)
                curveToRelative(-1.93f, 0f, -2.63f, 1.58f, -2.86f, 2.1f)
                lineToRelative(-1.29f, 2.9f)
                horizontalLineToRelative(-2.85f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.19f)
                lineToRelative(1.81f, -4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                lineTo(24f, 9.98f)
                close()
                moveTo(21f, 6.0f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _Moving = it}
