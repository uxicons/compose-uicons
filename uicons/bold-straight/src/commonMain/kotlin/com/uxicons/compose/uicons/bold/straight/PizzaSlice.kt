package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaSlice: ImageVector? = null

val Icons.Bs.PizzaSlice: ImageVector
    get() = _PizzaSlice ?: UXIcon(name = "PizzaSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.07f, 0.93f)
                arcTo(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.72f, 0.21f)
                lineTo(0f, 8.12f)
                verticalLineTo(9.14f)
                arcTo(14.88f, 14.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.86f, 24f)
                horizontalLineToRelative(1.01f)
                lineTo(23.81f, 4.24f)
                arcTo(3.13f, 3.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.07f, 0.93f)
                close()
                moveTo(19.44f, 7.06f)
                arcToRelative(3.79f, 3.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, 6.86f)
                lineToRelative(-2.41f, 6.01f)
                arcTo(11.34f, 11.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.06f, 9.72f)
                lineTo(20.79f, 3.01f)
                arcToRelative(0.13f, 0.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, 0.04f)
                arcTo(0.15f, 0.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 3.17f)
                verticalLineToRelative(0f)
                close()
                moveTo(12f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                close()
            }
        }.also { _PizzaSlice = it}
