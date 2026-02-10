package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaSlice: ImageVector? = null

val Icons.Br.PizzaSlice: ImageVector
    get() = _PizzaSlice ?: UXIcon(name = "PizzaSlice") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.07f, 0.93f)
            arcTo(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.73f, 0.21f)
            lineTo(3.35f, 6.65f)
            arcToRelative(5.3f, 5.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.19f, 6.2f)
            arcTo(15.69f, 15.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.14f, 23.84f)
            horizontalLineToRelative(0f)
            arcToRelative(5.3f, 5.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.21f, -3.2f)
            lineToRelative(6.46f, -16.4f)
            arcTo(3.13f, 3.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.07f, 0.93f)
            close()
            moveTo(19.36f, 7.34f)
            arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.18f, 5.53f)
            lineToRelative(-2.62f, 6.65f)
            arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 0.46f)
            curveToRelative(-5.08f, -0.13f, -10.17f, -5.22f, -10.3f, -10.3f)
            arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.45f, -0.25f)
            lineTo(20.79f, 3.01f)
            arcToRelative(0.13f, 0.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, 0.04f)
            arcToRelative(0.14f, 0.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.05f, 0.13f)
            horizontalLineToRelative(0f)
            close()
            moveTo(12f, 12f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
            close()
        }
    }.also { _PizzaSlice = it }
