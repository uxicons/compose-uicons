package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drumstick: ImageVector? = null

val Icons.Sr.Drumstick: ImageVector
    get() = _Drumstick ?: UXIcon(name = "Drumstick") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2.5f)
                arcToRelative(8.58f, 8.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.07f, 0f)
                curveToRelative(-2.38f, 2.38f, -3.16f, 7.91f, -3.41f, 11f)
                arcTo(4.16f, 4.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.6f, 15.98f)
                lineToRelative(-3.8f, 3.8f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.65f, 2.06f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.06f, -0.65f)
                lineToRelative(3.8f, -3.8f)
                arcToRelative(4.14f, 4.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.48f, 0.59f)
                curveToRelative(3.09f, -0.25f, 8.62f, -1.03f, 11f, -3.41f)
                arcTo(8.58f, 8.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 2.5f)
                close()
            }
        }.also { _Drumstick = it}
