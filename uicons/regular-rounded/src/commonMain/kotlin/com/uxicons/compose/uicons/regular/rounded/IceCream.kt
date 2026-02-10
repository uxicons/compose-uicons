package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IceCream: ImageVector? = null

val Icons.Rr.IceCream: ImageVector
    get() = _IceCream ?: UXIcon(name = "IceCream") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.9f, 4.02f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.8f, 0f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.33f, 8.26f)
                lineTo(9.02f, 22.33f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.96f, 0f)
                lineTo(21.24f, 12.25f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.9f, 4.02f)
                close()
                moveTo(20f, 9.5f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.06f, 0.57f)
                arcToRelative(34.66f, 34.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.62f, 0.88f)
                curveTo(11.33f, 5.65f, 19.59f, 3.84f, 20f, 9.5f)
                close()
                moveTo(12f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.89f, 2.25f)
                arcTo(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6.34f)
                arcTo(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.11f, 4.25f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(7.5f, 6f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.18f, 4.96f)
                arcToRelative(35.97f, 35.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.62f, -0.88f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 6f)
                close()
                moveTo(13.28f, 21.29f)
                arcToRelative(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.56f, 0f)
                lineTo(5.17f, 12.35f)
                arcToRelative(37.94f, 37.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 0f)
                close()
            }
        }.also { _IceCream = it}
