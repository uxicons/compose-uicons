package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tachometer: ImageVector? = null

val Icons.Sr.Tachometer: ImageVector
    get() = _Tachometer ?: UXIcon(name = "Tachometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.9f, 11.44f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.05f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 17.66f)
                arcTo(4.85f, 4.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.11f, 23f)
                lineTo(16.88f, 23f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.51f, -1.43f)
                arcTo(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.9f, 11.44f)
                close()
                moveTo(17.71f, 8.71f)
                lineTo(13.93f, 12.49f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(3.78f, -3.78f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.71f, 8.71f)
                close()
            }
        }.also { _Tachometer = it}
