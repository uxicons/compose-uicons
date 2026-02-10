package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flower: ImageVector? = null

val Icons.Ss.Flower: ImageVector
    get() = _Flower ?: UXIcon(name = "Flower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 12f)
                close()
                moveTo(22.91f, 15.76f)
                arcToRelative(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.56f, 3.75f)
                curveToRelative(-0.01f, 5.93f, -8.7f, 5.93f, -8.7f, 0f)
                curveToRelative(-5.16f, 2.83f, -9.32f, -4.65f, -4.27f, -7.57f)
                curveToRelative(-5.05f, -2.92f, -0.9f, -10.38f, 4.25f, -7.58f)
                arcToRelative(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.73f, 0f)
                curveToRelative(5.16f, -2.81f, 9.31f, 4.66f, 4.25f, 7.58f)
                arcTo(4.34f, 4.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.91f, 15.76f)
                close()
                moveTo(16f, 12f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 12f)
                close()
            }
        }.also { _Flower = it}
