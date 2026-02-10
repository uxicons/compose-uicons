package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Refresh: ImageVector? = null

val Icons.Rs.Refresh: ImageVector
    get() = _Refresh ?: UXIcon(name = "Refresh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcToRelative(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.12f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineToRelative(5.14f)
                arcTo(1.86f, 1.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 5.14f)
                verticalLineTo(0f)
                horizontalLineTo(20f)
                verticalLineTo(3.08f)
                arcTo(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                horizontalLineTo(2f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.88f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(3.86f)
                arcTo(1.86f, 1.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 18.86f)
                verticalLineTo(24f)
                horizontalLineTo(4f)
                verticalLineTo(20.92f)
                arcTo(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
            }
        }.also { _Refresh = it}
