package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrinkAlt: ImageVector? = null

val Icons.Ss.DrinkAlt: ImageVector
    get() = _DrinkAlt ?: UXIcon(name = "DrinkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.88f, 2f)
                lineToRelative(-0.25f, 2f)
                lineTo(12.62f, 4f)
                lineToRelative(0.5f, -4f)
                lineTo(20f, 0f)
                lineTo(20f, 2f)
                close()
                moveTo(2.66f, 5.12f)
                arcToRelative(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 2.43f)
                lineTo(2.36f, 10f)
                horizontalLineToRelative(9.5f)
                lineToRelative(0.75f, -6f)
                lineTo(5f, 4f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.66f, 5.12f)
                close()
                moveTo(21.34f, 5.12f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                lineTo(14.63f, 4f)
                lineToRelative(-0.75f, 6f)
                horizontalLineToRelative(7.75f)
                lineToRelative(0.29f, -2.35f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.34f, 5.12f)
                close()
                moveTo(12.63f, 20f)
                lineTo(10.61f, 20f)
                lineToRelative(1f, -8f)
                horizontalLineToRelative(-9f)
                lineToRelative(1.5f, 12f)
                lineTo(19.88f, 24f)
                lineToRelative(1.5f, -12f)
                lineTo(13.63f, 12f)
                close()
            }
        }.also { _DrinkAlt = it}
