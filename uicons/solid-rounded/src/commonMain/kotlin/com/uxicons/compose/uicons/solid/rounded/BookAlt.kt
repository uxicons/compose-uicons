package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAlt: ImageVector? = null

val Icons.Sr.BookAlt: ImageVector
    get() = _BookAlt ?: UXIcon(name = "BookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.2f, 2.16f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.16f, -1.07f)
                lineToRelative(-1.76f, 0.43f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.28f, 3.94f)
                verticalLineToRelative(15.47f)
                arcToRelative(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-15.47f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.23f, -3.92f)
                lineToRelative(-1.87f, -0.46f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.9f, 4.92f)
                verticalLineToRelative(10.79f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.11f, 4.92f)
                lineToRelative(6.29f, 1.14f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.22f, 0f)
                lineToRelative(6.29f, -1.14f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.1f, -4.92f)
                verticalLineToRelative(-10.79f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.8f, -3.84f)
                close()
            }
        }.also { _BookAlt = it}
