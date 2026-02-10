package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileChartPie: ImageVector? = null

val Icons.Br.FileChartPie: ImageVector
    get() = _FileChartPie ?: UXIcon(name = "FileChartPie") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.39f, 4.27f)
            lineToRelative(-2.66f, -2.66f)
            curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
            lineTo(7.5f, 0f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(22f, 8.16f)
            curveToRelative(0f, -1.47f, -0.57f, -2.85f, -1.61f, -3.89f)
            close()
            moveTo(16.5f, 21f)
            lineTo(7.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5.5f)
            lineTo(13f, 7f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(16.61f, 12.08f)
            curveToRelative(1.4f, 3.18f, -1.12f, 7f, -4.61f, 6.92f)
            curveToRelative(-2.7f, 0f, -5.0f, -2.3f, -5f, -5f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.71f, 0.73f, 1.2f, 1.39f, 0.92f)
            lineToRelative(3.23f, -1.35f)
            close()
        }
    }.also { _FileChartPie = it }
