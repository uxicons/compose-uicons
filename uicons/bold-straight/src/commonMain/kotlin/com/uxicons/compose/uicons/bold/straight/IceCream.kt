package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IceCream: ImageVector? = null

val Icons.Bs.IceCream: ImageVector
    get() = _IceCream ?: UXIcon(name = "IceCream") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.31f, 4.09f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.62f, 0f)
                arcToRelative(5.54f, 5.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.9f, 8.31f)
                lineTo(12f, 24.11f)
                lineToRelative(9.21f, -11.7f)
                arcTo(5.54f, 5.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.31f, 4.09f)
                close()
                moveTo(19f, 9.5f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.07f, 0.5f)
                lineTo(13.52f, 10f)
                curveTo(13.18f, 6.43f, 18.76f, 5.83f, 19f, 9.5f)
                close()
                moveTo(12f, 3f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.22f, 1.38f)
                arcTo(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5.88f)
                arcToRelative(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.22f, -1.5f)
                arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                close()
                moveTo(7.75f, 7f)
                arcToRelative(2.74f, 2.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.73f, 3f)
                lineTo(5.07f, 10f)
                arcTo(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.75f, 7f)
                close()
                moveTo(7.06f, 13f)
                horizontalLineToRelative(9.88f)
                lineTo(12f, 19.27f)
                close()
            }
        }.also { _IceCream = it}
