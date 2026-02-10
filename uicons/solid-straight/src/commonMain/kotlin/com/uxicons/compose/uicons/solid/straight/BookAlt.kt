package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAlt: ImageVector? = null

val Icons.Ss.BookAlt: ImageVector
    get() = _BookAlt ?: UXIcon(name = "BookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.92f, 1.7f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.52f, -0.64f)
                lineToRelative(-4.12f, 1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.28f, 3.94f)
                verticalLineToRelative(14.8f)
                lineToRelative(-1f, 0.18f)
                lineToRelative(-1f, -0.18f)
                verticalLineToRelative(-14.8f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.23f, -3.92f)
                lineToRelative(-4.24f, -1.03f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 2.95f)
                verticalLineToRelative(16.83f)
                lineToRelative(12f, 2.18f)
                lineToRelative(12f, -2.18f)
                verticalLineToRelative(-16.83f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.08f, -2.3f)
                close()
            }
        }.also { _BookAlt = it}
