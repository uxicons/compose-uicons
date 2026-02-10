package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spoon: ImageVector? = null

val Icons.Rr.Spoon: ImageVector
    get() = _Spoon ?: UXIcon(name = "Spoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.92f, 1.08f)
                curveToRelative(-2.58f, -2.58f, -8.74f, -0.04f, -11.1f, 2.32f)
                arcToRelative(6.2f, 6.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, 8f)
                lineTo(0.29f, 22.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineTo(12.6f, 12.82f)
                arcToRelative(6.18f, 6.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -0.64f)
                curveTo(22.96f, 9.82f, 25.5f, 3.66f, 22.92f, 1.08f)
                close()
                moveTo(19.19f, 10.77f)
                curveTo(15.16f, 14.59f, 9.41f, 8.84f, 13.23f, 4.81f)
                curveTo(14.91f, 3.28f, 19.28f, 0.96f, 21.5f, 2.5f)
                curveTo(22.95f, 3.94f, 21.04f, 8.91f, 19.19f, 10.77f)
                close()
            }
        }.also { _Spoon = it}
