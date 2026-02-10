package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileChartPie: ImageVector? = null

val Icons.Bs.FileChartPie: ImageVector
    get() = _FileChartPie ?: UXIcon(name = "FileChartPie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.61f, 12.08f)
                curveToRelative(0.25f, 0.59f, 0.39f, 1.24f, 0.39f, 1.92f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                verticalLineToRelative(5f)
                lineToRelative(4.61f, -1.92f)
                close()
                moveTo(22f, 5.66f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.67f)
                close()
                moveTo(19f, 21.0f)
                lineTo(19f, 8f)
                horizontalLineToRelative(-5f)
                lineTo(14f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 21f)
                horizontalLineToRelative(14f)
                close()
            }
        }.also { _FileChartPie = it}
