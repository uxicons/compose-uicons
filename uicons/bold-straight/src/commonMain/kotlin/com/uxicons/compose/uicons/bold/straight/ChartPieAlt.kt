package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPieAlt: ImageVector? = null

val Icons.Bs.ChartPieAlt: ImageVector
    get() = _ChartPieAlt ?: UXIcon(name = "ChartPieAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.51f, 3.5f)
                lineTo(12.5f, 2f)
                lineTo(11f, 2f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.9f, 23.8f)
                arcToRelative(11.1f, 11.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.08f, 0.2f)
                arcTo(11.04f, 11.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13f)
                lineTo(22f, 11.5f)
                lineTo(12.5f, 11.5f)
                close()
                moveTo(18.86f, 14.5f)
                arcTo(7.99f, 7.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.51f, 5.14f)
                lineTo(9.5f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 0.01f)
                verticalLineTo(9.5f)
                horizontalLineTo(24f)
                arcTo(9.54f, 9.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 0.01f)
                close()
            }
        }.also { _ChartPieAlt = it}
