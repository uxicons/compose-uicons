package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeAlt: ImageVector? = null

val Icons.Bs.GlobeAlt: ImageVector
    get() = _GlobeAlt ?: UXIcon(name = "GlobeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 15f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.5f, -7.5f)
                arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 7.5f)
                close()
                moveTo(13.5f, 3f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, -4.5f)
                close()
                moveTo(14.5f, 19.94f)
                verticalLineToRelative(1.06f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1.18f)
                arcToRelative(12.49f, 12.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.08f, -19.71f)
                lineToRelative(2.42f, 1.78f)
                arcToRelative(9.5f, 9.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15.51f, 10.97f)
                lineToRelative(2.48f, 1.7f)
                arcToRelative(12.49f, 12.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.32f, 5.38f)
                close()
            }
        }.also { _GlobeAlt = it}
