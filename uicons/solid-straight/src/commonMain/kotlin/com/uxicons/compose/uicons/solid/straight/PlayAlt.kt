package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayAlt: ImageVector? = null

val Icons.Ss.PlayAlt: ImageVector
    get() = _PlayAlt ?: UXIcon(name = "PlayAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.98f, 12f)
                lineToRelative(-3.98f, 2.28f)
                verticalLineToRelative(-4.55f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(18.02f, 12f)
                lineTo(8f, 6.28f)
                verticalLineToRelative(11.45f)
                close()
            }
        }.also { _PlayAlt = it}
