package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exchange: ImageVector? = null

val Icons.Br.Exchange: ImageVector
    get() = _Exchange ?: UXIcon(name = "Exchange") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 15.5f)
            horizontalLineTo(4.27f)
            lineToRelative(1.61f, -1.64f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.14f, -2.1f)
            lineTo(0.99f, 14.55f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.9f)
            lineToRelative(2.75f, 2.79f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.14f, -2.1f)
            lineTo(4.27f, 18.5f)
            horizontalLineTo(22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 8.5f)
            horizontalLineTo(19.73f)
            lineToRelative(-1.61f, 1.64f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.14f, 2.1f)
            lineToRelative(2.75f, -2.79f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.9f)
            lineTo(20.26f, 1.76f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.14f, 2.1f)
            lineTo(19.73f, 5.5f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            close()
        }
    }.also { _Exchange = it }
