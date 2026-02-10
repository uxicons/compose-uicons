package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeAlt: ImageVector? = null

val Icons.Ss.GlobeAlt: ImageVector
    get() = _GlobeAlt ?: UXIcon(name = "GlobeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 8f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                close()
                moveTo(22.91f, 14.77f)
                lineTo(21.26f, 13.64f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -15.67f, -12.35f)
                lineToRelative(-1.49f, -1.34f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.9f, 20f)
                verticalLineToRelative(2.05f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.06f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.91f, -5.17f)
                close()
            }
        }.also { _GlobeAlt = it}
