package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duplicate: ImageVector? = null

val Icons.Rs.Duplicate: ImageVector
    get() = _Duplicate ?: UXIcon(name = "Duplicate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4.14f)
                lineTo(17.99f, 0f)
                horizontalLineTo(10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                verticalLineTo(24f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineToRelative(4f)
                close()
                moveTo(16f, 22f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineToRelative(9f)
                close()
                moveTo(9f, 17f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineTo(6f)
                horizontalLineToRelative(4f)
                verticalLineTo(17f)
                close()
            }
        }.also { _Duplicate = it}
