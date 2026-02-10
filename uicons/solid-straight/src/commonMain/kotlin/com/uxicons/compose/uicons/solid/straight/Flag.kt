package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flag: ImageVector? = null

val Icons.Ss.Flag: ImageVector
    get() = _Flag ?: UXIcon(name = "Flag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, -2f)
                horizontalLineToRelative(3.82f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineToRelative(-9f)
                close()
                moveTo(2f, 13f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Flag = it}
