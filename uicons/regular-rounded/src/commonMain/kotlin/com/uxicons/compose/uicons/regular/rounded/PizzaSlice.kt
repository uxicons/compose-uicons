package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaSlice: ImageVector? = null

val Icons.Rr.PizzaSlice: ImageVector
    get() = _PizzaSlice ?: UXIcon(name = "PizzaSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.2f, 0.8f)
                arcTo(2.72f, 2.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.3f, 0.18f)
                lineTo(3.15f, 6.93f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 5.82f)
                arcToRelative(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.09f, 11.1f)
                horizontalLineToRelative(0f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.83f, -3.01f)
                lineTo(23.83f, 3.67f)
                arcTo(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.2f, 0.8f)
                close()
                moveTo(11.75f, 21.91f)
                arcTo(13.8f, 13.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.09f, 12.25f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.26f, -3.18f)
                arcTo(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.92f, 20.65f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.75f, 21.91f)
                close()
                moveTo(15.77f, 18.68f)
                curveToRelative(-6.19f, -0.1f, -10.36f, -4.26f, -10.46f, -10.46f)
                lineTo(21.01f, 2.05f)
                arcToRelative(0.72f, 0.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.77f, 0.17f)
                arcToRelative(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.18f, 0.75f)
                lineTo(21.3f, 4.64f)
                curveToRelative(-5.76f, -1.98f, -8.94f, 6.21f, -3.41f, 8.67f)
                close()
                moveTo(18.62f, 11.45f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.94f, -4.93f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9f)
                close()
            }
        }.also { _PizzaSlice = it}
