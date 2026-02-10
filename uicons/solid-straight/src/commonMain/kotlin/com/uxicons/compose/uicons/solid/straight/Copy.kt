package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Copy: ImageVector? = null

val Icons.Ss.Copy: ImageVector
    get() = _Copy ?: UXIcon(name = "Copy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 20f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(22f, 4.18f)
                verticalLineToRelative(17.82f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.82f)
                close()
            }
        }.also { _Copy = it}
