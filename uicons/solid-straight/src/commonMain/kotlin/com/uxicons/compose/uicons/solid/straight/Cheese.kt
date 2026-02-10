package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheese: ImageVector? = null

val Icons.Ss.Cheese: ImageVector
    get() = _Cheese ?: UXIcon(name = "Cheese") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.14f, 8.04f)
                arcTo(20.21f, 20.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.04f, 0.96f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.75f, 0.85f)
                lineTo(23.33f, 8f)
                lineTo(2.67f, 8f)
                arcTo(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.14f, 8.04f)
                close()
                moveTo(24f, 10f)
                lineTo(24f, 24f)
                lineTo(15f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                lineTo(4.83f, 24f)
                curveTo(-0.53f, 23.92f, -0.65f, 14.84f, 0.88f, 11.13f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.67f, 10f)
                close()
                moveTo(9f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 15f)
                close()
                moveTo(20f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 18f)
                close()
            }
        }.also { _Cheese = it}
