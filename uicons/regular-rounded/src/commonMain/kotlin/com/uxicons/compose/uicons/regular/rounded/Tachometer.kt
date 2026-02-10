package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tachometer: ImageVector? = null

val Icons.Rr.Tachometer: ImageVector
    get() = _Tachometer ?: UXIcon(name = "Tachometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.9f, 11.44f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.05f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 17.66f)
                arcTo(4.85f, 4.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.11f, 23f)
                horizontalLineTo(16.88f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.51f, -1.43f)
                arcTo(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.9f, 11.44f)
                close()
                moveTo(18.99f, 20.14f)
                arcTo(3.0f, 3.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.88f, 21f)
                horizontalLineTo(7.11f)
                arcToRelative(2.86f, 2.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.98f, -0.74f)
                arcTo(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.34f, 5.54f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.65f, 14.6f)
                close()
                moveTo(17.71f, 7.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.41f)
                lineToRelative(-3.77f, 3.77f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(3.77f, -3.77f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.71f, 7.29f)
                close()
            }
        }.also { _Tachometer = it}
