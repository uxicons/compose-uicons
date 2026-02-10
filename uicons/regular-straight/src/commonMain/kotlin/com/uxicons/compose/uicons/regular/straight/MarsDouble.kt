package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsDouble: ImageVector? = null

val Icons.Rs.MarsDouble: ImageVector
    get() = _MarsDouble ?: UXIcon(name = "MarsDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineToRelative(2.59f)
                lineToRelative(-3.4f, 3.4f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.25f, -1.33f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.6f, 6.82f)
                lineToRelative(3.4f, -3.4f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                horizontalLineToRelative(2.59f)
                lineToRelative(-3.4f, 3.4f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.07f, 17.93f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 18.6f, 12.82f)
                lineToRelative(3.4f, -3.4f)
                verticalLineTo(12f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 6f)
                close()
                moveTo(2f, 11f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 11f)
                close()
                moveTo(13f, 22f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.91f, -4.09f)
                arcToRelative(7.0f, 7.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.81f, -5.81f)
                arcTo(5.0f, 5.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 22f)
                close()
            }
        }.also { _MarsDouble = it}
