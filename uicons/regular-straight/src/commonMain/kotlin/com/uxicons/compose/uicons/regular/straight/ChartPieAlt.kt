package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPieAlt: ImageVector? = null

val Icons.Rs.ChartPieAlt: ImageVector
    get() = _ChartPieAlt ?: UXIcon(name = "ChartPieAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 23.97f)
                arcTo(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 2.03f)
                horizontalLineToRelative(1f)
                lineToRelative(0.01f, 1f)
                lineTo(12f, 12f)
                horizontalLineTo(21.97f)
                verticalLineToRelative(1f)
                arcTo(10.98f, 10.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 23.97f)
                close()
                moveTo(10.01f, 4.08f)
                arcTo(8.97f, 8.97f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19.91f, 14f)
                horizontalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.02f, 2.29f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.73f, 8f)
                horizontalLineTo(16.02f)
                verticalLineTo(2.29f)
                moveToRelative(-2f, -2.25f)
                verticalLineTo(10f)
                horizontalLineToRelative(9.97f)
                arcTo(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.02f, 0.03f)
                close()
            }
        }.also { _ChartPieAlt = it}
