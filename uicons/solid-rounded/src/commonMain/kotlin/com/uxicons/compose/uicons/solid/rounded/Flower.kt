package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flower: ImageVector? = null

val Icons.Sr.Flower: ImageVector
    get() = _Flower ?: UXIcon(name = "Flower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 12f)
                curveToRelative(4.94f, -2.99f, 0.77f, -10.45f, -4.4f, -7.63f)
                curveToRelative(-0.17f, -5.77f, -8.63f, -5.77f, -8.8f, 0f)
                curveTo(2.47f, 1.55f, -1.76f, 8.99f, 3.2f, 11.94f)
                curveToRelative(-4.95f, 3.04f, -0.8f, 10.21f, 4.4f, 7.69f)
                curveToRelative(0.18f, 5.77f, 8.62f, 5.76f, 8.8f, 0f)
                curveTo(21.56f, 22.15f, 25.77f, 15f, 20.8f, 12f)
                close()
                moveTo(12f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                close()
                moveTo(14f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 12f)
                close()
            }
        }.also { _Flower = it}
