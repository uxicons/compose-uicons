package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Forward: ImageVector? = null

val Icons.Rs.Forward: ImageVector
    get() = _Forward ?: UXIcon(name = "Forward") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.74f, 9.25f)
                lineTo(9f, 0.14f)
                lineTo(9f, 6.49f)
                lineTo(0f, 0.06f)
                lineTo(0f, 23.94f)
                lineToRelative(9f, -6.43f)
                verticalLineToRelative(6.43f)
                lineToRelative(13.74f, -9.81f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.88f)
                close()
                moveTo(21.58f, 12.51f)
                lineTo(11f, 20.06f)
                lineTo(11f, 13.63f)
                lineTo(2f, 20.06f)
                lineTo(2f, 3.94f)
                lineToRelative(9f, 6.43f)
                lineTo(11f, 3.86f)
                lineToRelative(10.59f, 7.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 1.62f)
                close()
            }
        }.also { _Forward = it}
