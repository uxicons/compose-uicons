package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _User: ImageVector? = null

val Icons.Rs.User: ImageVector
    get() = _User ?: UXIcon(name = "User") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                horizontalLineTo(19f)
                verticalLineTo(18.96f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.04f, 16f)
                horizontalLineTo(7.96f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 18.96f)
                verticalLineTo(24f)
                horizontalLineTo(3f)
                verticalLineTo(18.96f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.96f, 14f)
                horizontalLineToRelative(8.09f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 18.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, -6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                close()
                moveTo(12f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
        }.also { _User = it}
