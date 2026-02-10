package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrinkAlt: ImageVector? = null

val Icons.Bs.DrinkAlt: ImageVector
    get() = _DrinkAlt ?: UXIcon(name = "DrinkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.25f, 6.27f)
                arcTo(3.37f, 3.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.61f, 5f)
                lineTo(15.06f, 5f)
                lineToRelative(0.26f, -2f)
                lineTo(20f, 3f)
                lineTo(20f, 0f)
                lineTo(12.68f, 0f)
                lineToRelative(-0.64f, 5f)
                lineTo(5.39f, 5f)
                arcTo(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.06f, 9.05f)
                lineTo(4.08f, 24f)
                lineTo(19.92f, 24f)
                lineTo(21.93f, 9.06f)
                arcTo(3.37f, 3.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.25f, 6.27f)
                close()
                moveTo(18.61f, 8f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.38f, 0.47f)
                lineTo(18.78f, 10f)
                lineTo(14.42f, 10f)
                lineToRelative(0.26f, -2f)
                close()
                moveTo(5.09f, 8.15f)
                arcTo(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.39f, 8f)
                horizontalLineToRelative(6.26f)
                lineTo(11.4f, 10f)
                lineTo(5.22f, 10f)
                lineTo(5.01f, 8.47f)
                arcTo(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.09f, 8.15f)
                close()
                moveTo(6.7f, 21f)
                lineTo(5.62f, 13f)
                lineTo(18.38f, 13f)
                lineTo(17.3f, 21f)
                close()
                moveTo(10.76f, 15f)
                horizontalLineToRelative(3.02f)
                lineToRelative(-0.51f, 4f)
                lineTo(10.24f, 19f)
                close()
            }
        }.also { _DrinkAlt = it}
