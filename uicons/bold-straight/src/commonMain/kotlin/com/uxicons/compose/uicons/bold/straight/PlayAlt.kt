package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayAlt: ImageVector? = null

val Icons.Bs.PlayAlt: ImageVector
    get() = _PlayAlt ?: UXIcon(name = "PlayAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-20.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -3.5f)
                horizontalLineToRelative(17f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3.5f)
                close()
                moveTo(3f, 21f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-17.5f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                horizontalLineToRelative(-17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                close()
                moveTo(8f, 7f)
                verticalLineToRelative(10f)
                lineToRelative(9f, -5f)
                close()
            }
        }.also { _PlayAlt = it}
