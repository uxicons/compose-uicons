package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartRadar: ImageVector? = null

val Icons.Bs.ChartRadar: ImageVector
    get() = _ChartRadar ?: UXIcon(name = "ChartRadar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.05f, 1f)
                lineTo(5.97f, 1f)
                lineTo(0f, 12f)
                lineToRelative(5.96f, 11f)
                horizontalLineToRelative(12.08f)
                lineToRelative(5.96f, -11f)
                lineTo(18.05f, 1f)
                close()
                moveTo(16.26f, 20f)
                lineTo(7.75f, 20f)
                lineTo(3.42f, 12f)
                lineTo(7.75f, 4f)
                horizontalLineToRelative(8.51f)
                lineToRelative(4.34f, 8f)
                lineToRelative(-4.34f, 8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.65f, 12.62f)
                lineToRelative(-2.69f, -4.71f)
                curveToRelative(0.03f, -0.13f, 0.04f, -0.27f, 0.04f, -0.4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.14f, 0.01f, 0.27f, 0.04f, 0.4f)
                lineToRelative(-2.69f, 4.71f)
                curveToRelative(-0.78f, 0.27f, -1.35f, 1.01f, -1.35f, 1.88f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0.5f, 0f, 0.96f, -0.19f, 1.31f, -0.5f)
                horizontalLineToRelative(5.38f)
                curveToRelative(0.35f, 0.31f, 0.81f, 0.5f, 1.31f, 0.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.88f, -0.57f, -1.61f, -1.35f, -1.88f)
                close()
                moveTo(13.41f, 13f)
                horizontalLineToRelative(-2.83f)
                lineToRelative(1.42f, -2.48f)
                lineToRelative(1.42f, 2.48f)
                close()
            }
        }.also { _ChartRadar = it}
