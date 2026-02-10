package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartRadar: ImageVector? = null

val Icons.Sr.ChartRadar: ImageVector
    get() = _ChartRadar ?: UXIcon(name = "ChartRadar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.27f, 14f)
                horizontalLineToRelative(-4.54f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                lineToRelative(2.27f, -3.98f)
                lineToRelative(2.27f, 3.98f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                close()
                moveTo(23.3f, 14.51f)
                lineToRelative(-3.48f, 6f)
                curveToRelative(-0.89f, 1.54f, -2.55f, 2.49f, -4.32f, 2.49f)
                horizontalLineToRelative(-7.01f)
                curveToRelative(-1.78f, 0f, -3.43f, -0.95f, -4.32f, -2.49f)
                lineTo(0.68f, 14.51f)
                curveToRelative(-0.9f, -1.55f, -0.9f, -3.47f, 0f, -5.02f)
                lineTo(4.16f, 3.49f)
                curveToRelative(0.89f, -1.54f, 2.55f, -2.49f, 4.32f, -2.49f)
                horizontalLineToRelative(7.01f)
                curveToRelative(1.78f, 0f, 3.43f, 0.95f, 4.32f, 2.49f)
                lineToRelative(3.48f, 6f)
                curveToRelative(0.9f, 1.55f, 0.9f, 3.47f, 0f, 5.02f)
                close()
                moveTo(18f, 15f)
                curveToRelative(0f, -1.1f, -0.89f, -1.99f, -1.99f, -2f)
                lineToRelative(-2.28f, -3.99f)
                curveToRelative(0.17f, -0.3f, 0.27f, -0.64f, 0.27f, -1.01f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.37f, 0.1f, 0.71f, 0.27f, 1.01f)
                lineToRelative(-2.28f, 3.99f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.74f, 0f, 1.39f, -0.4f, 1.73f, -1f)
                horizontalLineToRelative(4.54f)
                curveToRelative(0.35f, 0.6f, 0.99f, 1f, 1.73f, 1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _ChartRadar = it}
