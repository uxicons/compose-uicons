package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeAlt: ImageVector? = null

val Icons.Rr.GlobeAlt: ImageVector
    get() = _GlobeAlt ?: UXIcon(name = "GlobeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8f, -8f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                close()
                moveTo(13f, 2f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 6f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, -6f)
                close()
                moveTo(22.91f, 14.77f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.91f, 5.17f)
                verticalLineToRelative(2.06f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2.05f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.26f, -19.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.54f, 1.27f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15.97f, 12.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.65f, 1.13f)
                close()
            }
        }.also { _GlobeAlt = it}
