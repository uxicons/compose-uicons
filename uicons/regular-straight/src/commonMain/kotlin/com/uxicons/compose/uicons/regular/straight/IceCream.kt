package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IceCream: ImageVector? = null

val Icons.Rs.IceCream: ImageVector
    get() = _IceCream ?: UXIcon(name = "IceCream") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.9f, 4.02f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.8f, 0f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.76f, 12.25f)
                lineTo(12f, 23.99f)
                lineToRelative(9.24f, -11.74f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.9f, 4.02f)
                close()
                moveTo(20f, 9.5f)
                arcToRelative(3.35f, 3.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.04f, 0.5f)
                horizontalLineTo(13.04f)
                curveTo(12.51f, 5.08f, 19.8f, 4.55f, 20f, 9.5f)
                close()
                moveTo(12f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.89f, 2.25f)
                arcTo(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6.34f)
                arcTo(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.11f, 4.25f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(7.5f, 6f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.46f, 4f)
                horizontalLineTo(4.04f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 6f)
                close()
                moveTo(5.1f, 12f)
                horizontalLineToRelative(13.81f)
                lineTo(12f, 20.76f)
                close()
            }
        }.also { _IceCream = it}
