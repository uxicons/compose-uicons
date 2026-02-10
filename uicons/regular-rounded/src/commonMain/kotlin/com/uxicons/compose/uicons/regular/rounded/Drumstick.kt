package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drumstick: ImageVector? = null

val Icons.Rr.Drumstick: ImageVector
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
                moveTo(20.09f, 13.16f)
                curveToRelative(-1.39f, 1.39f, -5.03f, 2.44f, -9.74f, 2.83f)
                arcToRelative(2.16f, 2.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.33f, -2.33f)
                curveTo(8.39f, 8.94f, 9.45f, 5.3f, 10.84f, 3.92f)
                arcToRelative(6.54f, 6.54f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.25f, 9.25f)
                close()
            }
        }.also { _Drumstick = it}
