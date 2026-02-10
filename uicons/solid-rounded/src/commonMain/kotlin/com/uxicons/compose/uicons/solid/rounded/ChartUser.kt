package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartUser: ImageVector? = null

val Icons.Sr.ChartUser: ImageVector
    get() = _ChartUser ?: UXIcon(name = "ChartUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 23f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(0f, 23f)
                curveToRelative(0f, -3.87f, 3.13f, -7f, 7f, -7f)
                horizontalLineToRelative(0f)
                curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                close()
                moveTo(11f, 10f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(19f, 0f)
                lineTo(9f, 0f)
                curveToRelative(-2.69f, 0f, -4.87f, 2.14f, -4.98f, 4.8f)
                curveToRelative(0.88f, -0.51f, 1.89f, -0.8f, 2.98f, -0.8f)
                curveToRelative(2.74f, 0f, 5.04f, 1.84f, 5.76f, 4.35f)
                lineToRelative(2.24f, 2.24f)
                lineToRelative(3.59f, -3.59f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.59f)
                lineToRelative(-3.59f, 3.59f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                lineToRelative(-0.72f, -0.72f)
                reflectiveCurveToRelative(0f, 0.01f, 0f, 0.02f)
                curveToRelative(-0.31f, 1.41f, -1.12f, 2.63f, -2.23f, 3.47f)
                curveToRelative(1.57f, 0.69f, 2.9f, 1.82f, 3.85f, 3.23f)
                horizontalLineToRelative(4.53f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24.01f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _ChartUser = it}
