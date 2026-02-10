package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaSlice: ImageVector? = null

val Icons.Sr.PizzaSlice: ImageVector
    get() = _PizzaSlice ?: UXIcon(name = "PizzaSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.42f, 21.97f)
                arcToRelative(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.18f, 1.87f)
                horizontalLineToRelative(0f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, 12.75f)
                arcTo(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.03f, 7.58f)
                arcTo(14.43f, 14.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.42f, 21.97f)
                close()
                moveTo(23.83f, 3.67f)
                lineTo(17.4f, 20f)
                lineTo(17f, 20f)
                arcTo(12.57f, 12.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 7f)
                lineTo(4f, 6.6f)
                lineTo(20.3f, 0.18f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.83f, 3.67f)
                close()
                moveTo(12f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
                moveTo(18.12f, 12.72f)
                lineTo(20.68f, 6.23f)
                curveTo(16.42f, 4.74f, 14.06f, 10.91f, 18.12f, 12.72f)
                close()
            }
        }.also { _PizzaSlice = it}
