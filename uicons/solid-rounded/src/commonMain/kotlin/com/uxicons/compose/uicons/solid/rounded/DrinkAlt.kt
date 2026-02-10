package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrinkAlt: ImageVector? = null

val Icons.Sr.DrinkAlt: ImageVector
    get() = _DrinkAlt ?: UXIcon(name = "DrinkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 10f)
                lineTo(2.36f, 10f)
                lineTo(2.06f, 7.56f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 4f)
                horizontalLineToRelative(7.66f)
                close()
                moveTo(12.99f, 19.11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.99f, -0.22f)
                lineTo(11.77f, 12f)
                lineTo(2.61f, 12f)
                lineToRelative(0.95f, 7.62f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, 24f)
                lineTo(15.47f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.96f, -4.38f)
                lineTo(21.38f, 12f)
                horizontalLineToRelative(-7.6f)
                close()
                moveTo(21.63f, 10f)
                lineToRelative(0.29f, -2.35f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                lineTo(14.67f, 4f)
                lineToRelative(-0.67f, 6f)
                close()
                moveTo(14.8f, 2.89f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.79f, 2f)
                lineTo(20f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(15.79f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.98f, 2.67f)
                lineTo(12.66f, 4f)
                horizontalLineToRelative(2.01f)
                close()
            }
        }.also { _DrinkAlt = it}
