package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheese: ImageVector? = null

val Icons.Sr.Cheese: ImageVector
    get() = _Cheese ?: UXIcon(name = "Cheese") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.51f)
                arcTo(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.8f, 10f)
                lineTo(2.67f, 10f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.88f, 11.13f)
                curveTo(-0.65f, 14.84f, -0.53f, 23.92f, 4.83f, 24f)
                horizontalLineToRelative(2.93f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.01f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.65f, 0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.24f, 24f)
                lineTo(18.8f, 24f)
                arcTo(5.05f, 5.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                close()
                moveTo(7f, 17f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 17f)
                close()
                moveTo(18f, 19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 19f)
                close()
                moveTo(22.85f, 8f)
                lineTo(2.67f, 8f)
                arcToRelative(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.53f, 0.04f)
                arcTo(20.21f, 20.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.04f, 0.96f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.75f, 0.85f)
                lineToRelative(4.2f, 3.13f)
                lineTo(21.59f, 6.7f)
                arcTo(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.85f, 8f)
                close()
            }
        }.also { _Cheese = it}
