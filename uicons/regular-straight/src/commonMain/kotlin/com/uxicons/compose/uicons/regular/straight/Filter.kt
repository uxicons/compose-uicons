package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Filter: ImageVector? = null

val Icons.Rs.Filter: ImageVector
    get() = _Filter ?: UXIcon(name = "Filter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 24f)
                lineToRelative(-6f, -4.5f)
                verticalLineToRelative(-5.12f)
                lineToRelative(-8f, -9f)
                verticalLineToRelative(-2.38f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(2.38f)
                lineToRelative(-8f, 9f)
                close()
                moveTo(11f, 18.5f)
                lineTo(13f, 20f)
                verticalLineToRelative(-6.38f)
                lineToRelative(8f, -9f)
                verticalLineToRelative(-1.62f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(1.62f)
                lineToRelative(8f, 9f)
                close()
            }
        }.also { _Filter = it}
