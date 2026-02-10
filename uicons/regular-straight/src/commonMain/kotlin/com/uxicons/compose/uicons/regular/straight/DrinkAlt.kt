package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrinkAlt: ImageVector? = null

val Icons.Rs.DrinkAlt: ImageVector
    get() = _DrinkAlt ?: UXIcon(name = "DrinkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.36f, 14f)
                horizontalLineToRelative(2.02f)
                lineToRelative(-0.75f, 6f)
                horizontalLineTo(10.61f)
                close()
                moveTo(21.93f, 7.65f)
                lineTo(19.88f, 24f)
                horizontalLineTo(4.12f)
                lineTo(2.06f, 7.56f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 4f)
                horizontalLineToRelative(7.62f)
                lineToRelative(0.5f, -4f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                horizontalLineTo(14.88f)
                lineToRelative(-0.25f, 2f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.93f, 3.65f)
                close()
                moveTo(14.38f, 6f)
                lineToRelative(-0.5f, 4f)
                horizontalLineToRelative(5.74f)
                lineToRelative(0.34f, -2.69f)
                arcToRelative(1.07f, 1.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.18f, -0.94f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6f)
                close()
                moveTo(4.02f, 7.22f)
                lineTo(4.37f, 10f)
                horizontalLineToRelative(7.49f)
                lineToRelative(0.5f, -4f)
                horizontalLineTo(5f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.02f, 7.22f)
                close()
                moveTo(18.12f, 22f)
                lineToRelative(1.25f, -10f)
                horizontalLineTo(4.62f)
                lineTo(5.88f, 22f)
                close()
            }
        }.also { _DrinkAlt = it}
