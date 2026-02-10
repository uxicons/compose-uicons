package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaSlice: ImageVector? = null

val Icons.Rs.PizzaSlice: ImageVector
    get() = _PizzaSlice ?: UXIcon(name = "PizzaSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.2f, 0.8f)
                arcTo(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.3f, 0.18f)
                lineTo(0f, 8.32f)
                verticalLineTo(9f)
                arcTo(15.02f, 15.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 24f)
                horizontalLineToRelative(0.68f)
                lineTo(23.83f, 3.67f)
                arcTo(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.2f, 0.8f)
                close()
                moveTo(21.01f, 2.04f)
                arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.77f, 0.17f)
                arcToRelative(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.18f, 0.74f)
                lineTo(21.29f, 4.64f)
                curveToRelative(-5.71f, -1.96f, -8.91f, 6.13f, -3.47f, 8.64f)
                lineTo(15.93f, 18f)
                curveTo(9.55f, 17.97f, 6.03f, 14.45f, 6f, 8.07f)
                close()
                moveTo(17f, 9f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.54f, -2.5f)
                lineToRelative(-1.97f, 4.92f)
                arcTo(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 9f)
                close()
                moveTo(14.33f, 21.98f)
                arcTo(13.02f, 13.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.02f, 9.67f)
                lineToRelative(2.02f, -0.81f)
                curveToRelative(0.32f, 6.71f, 4.4f, 10.79f, 11.11f, 11.11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 13f)
                close()
            }
        }.also { _PizzaSlice = it}
