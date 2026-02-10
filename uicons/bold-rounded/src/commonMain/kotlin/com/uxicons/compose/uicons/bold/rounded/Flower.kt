package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flower: ImageVector? = null

val Icons.Br.Flower: ImageVector
    get() = _Flower ?: UXIcon(name = "Flower") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 12f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
            close()
            moveTo(16.95f, 20.57f)
            curveToRelative(4.68f, 0.67f, 7.91f, -4.96f, 4.86f, -8.59f)
            arcToRelative(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.89f, -8.63f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.85f, 0f)
            arcToRelative(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.89f, 8.63f)
            curveToRelative(-3.06f, 3.64f, 0.18f, 9.26f, 4.86f, 8.59f)
            arcToRelative(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.91f, 0f)
            close()
            moveTo(7.44f, 17.39f)
            curveToRelative(-2.65f, 1.25f, -4.94f, -2.5f, -2.22f, -4.07f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.63f)
            curveTo(2.57f, 9.15f, 4.7f, 5.11f, 7.44f, 6.62f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.7f, 5.32f)
            arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.6f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.26f, 1.29f)
            curveTo(19.3f, 5.11f, 21.43f, 9.15f, 18.78f, 10.68f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.63f)
            curveToRelative(2.73f, 1.58f, 0.43f, 5.32f, -2.22f, 4.07f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.3f, 18.68f)
            arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.6f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.26f, -1.29f)
            close()
        }
    }.also { _Flower = it }
