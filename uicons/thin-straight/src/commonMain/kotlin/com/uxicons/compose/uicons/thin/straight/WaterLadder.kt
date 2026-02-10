package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterLadder: ImageVector? = null

val Icons.Ts.WaterLadder: ImageVector
    get() = _WaterLadder ?: UXIcon(name = "WaterLadder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 13f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                lineTo(19f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.5f)
                lineTo(23f, 0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                lineTo(6f, 6f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.5f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5f)
                close()
                moveTo(18f, 7f)
                verticalLineToRelative(5f)
                lineTo(6f, 12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(12f)
                close()
                moveTo(23.98f, 23.72f)
                curveToRelative(-0.47f, 0.19f, -0.97f, 0.28f, -1.48f, 0.28f)
                curveToRelative(-1.5f, 0f, -2.82f, -0.83f, -3.5f, -2.06f)
                curveToRelative(-0.68f, 1.23f, -2.0f, 2.06f, -3.5f, 2.06f)
                reflectiveCurveToRelative(-2.82f, -0.83f, -3.5f, -2.06f)
                curveToRelative(-0.68f, 1.23f, -2.0f, 2.06f, -3.5f, 2.06f)
                reflectiveCurveToRelative(-2.82f, -0.83f, -3.5f, -2.06f)
                curveToRelative(-0.68f, 1.23f, -2.0f, 2.06f, -3.5f, 2.06f)
                curveToRelative(-0.51f, 0f, -1.01f, -0.1f, -1.48f, -0.28f)
                lineToRelative(0.37f, -0.93f)
                curveToRelative(0.35f, 0.14f, 0.72f, 0.21f, 1.11f, 0.21f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(0.38f, 0f, 0.76f, -0.07f, 1.11f, -0.21f)
                lineToRelative(0.37f, 0.93f)
                close()
            }
        }.also { _WaterLadder = it}
