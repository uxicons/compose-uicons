package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comments: ImageVector? = null

val Icons.Rs.Comments: ImageVector
    get() = _Comments ?: UXIcon(name = "Comments") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                verticalLineToRelative(8f)
                horizontalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.92f, -4f)
                arcToRelative(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.24f, -0.25f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 22f)
                horizontalLineToRelative(6f)
                verticalLineTo(16f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -4.68f)
                arcTo(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9.08f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16f)
                close()
                moveTo(18f, 9f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9f)
                verticalLineToRelative(9f)
                horizontalLineTo(9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 9f)
                close()
                moveTo(2f, 9f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 7f)
                horizontalLineTo(2f)
                close()
            }
        }.also { _Comments = it}
