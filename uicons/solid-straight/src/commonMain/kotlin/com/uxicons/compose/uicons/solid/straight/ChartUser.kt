package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartUser: ImageVector? = null

val Icons.Ss.ChartUser: ImageVector
    get() = _ChartUser ?: UXIcon(name = "ChartUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 14f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(14f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(11f, 16f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5f)
                close()
                moveTo(21f, 0f)
                lineTo(8f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1.35f)
                curveToRelative(0.63f, -0.22f, 1.3f, -0.35f, 2f, -0.35f)
                curveToRelative(2.74f, 0f, 5.05f, 1.84f, 5.77f, 4.35f)
                lineToRelative(2.23f, 2.23f)
                lineToRelative(3.59f, -3.59f)
                horizontalLineToRelative(-2.59f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.59f)
                lineToRelative(-5f, 5f)
                lineToRelative(-2.15f, -2.15f)
                curveToRelative(-0.23f, 1.06f, -0.74f, 2.01f, -1.44f, 2.78f)
                curveToRelative(2.23f, 0.18f, 4.05f, 1.81f, 4.49f, 3.96f)
                horizontalLineToRelative(8.1f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _ChartUser = it}
