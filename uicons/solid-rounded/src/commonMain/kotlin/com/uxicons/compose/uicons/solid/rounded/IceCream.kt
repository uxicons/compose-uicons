package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IceCream: ImageVector? = null

val Icons.Sr.IceCream: ImageVector
    get() = _IceCream ?: UXIcon(name = "IceCream") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.39f, 3.07f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.22f, 0f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6.05f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.39f, 3.07f)
                close()
                moveTo(11f, 9.5f)
                curveToRelative(-0.25f, -6.29f, -9.47f, -5.74f, -8.96f, 0.52f)
                arcToRelative(53.99f, 53.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.71f, 0.94f)
                arcTo(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9.5f)
                close()
                moveTo(17.5f, 5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 5.96f)
                arcToRelative(52.56f, 52.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.71f, -0.93f)
                arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 5f)
                close()
                moveTo(2.74f, 12.19f)
                curveToRelative(0.01f, 0.03f, 6.28f, 10.14f, 6.28f, 10.14f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.96f, 0f)
                reflectiveCurveTo(21.25f, 12.22f, 21.26f, 12.2f)
                arcTo(54.99f, 54.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13f)
                arcTo(55.47f, 55.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.74f, 12.19f)
                close()
            }
        }.also { _IceCream = it}
