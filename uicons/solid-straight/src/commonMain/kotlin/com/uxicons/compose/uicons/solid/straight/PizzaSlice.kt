package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaSlice: ImageVector? = null

val Icons.Ss.PizzaSlice: ImageVector
    get() = _PizzaSlice ?: UXIcon(name = "PizzaSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.9f, 20.96f)
                lineTo(15.68f, 24f)
                lineTo(15f, 24f)
                arcTo(15.02f, 15.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 9f)
                lineTo(0f, 8.32f)
                lineTo(3.04f, 7.1f)
                curveTo(3.45f, 15.46f, 8.54f, 20.55f, 16.9f, 20.96f)
                close()
                moveTo(23.83f, 3.67f)
                lineTo(17.69f, 18.99f)
                curveToRelative(-8.07f, -0.12f, -12.56f, -4.6f, -12.68f, -12.68f)
                lineTo(20.3f, 0.18f)
                arcToRelative(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.54f, 3.49f)
                close()
                moveTo(13f, 11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 11f)
                close()
                moveTo(18.78f, 10.88f)
                lineTo(20.63f, 6.28f)
                arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = true, isPositiveArc = false, 18.78f, 10.88f)
                close()
            }
        }.also { _PizzaSlice = it}
