package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CopyAlt: ImageVector? = null

val Icons.Bs.CopyAlt: ImageVector
    get() = _CopyAlt ?: UXIcon(name = "CopyAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 4.88f)
                lineToRelative(-4.88f, -4.88f)
                horizontalLineToRelative(-7.12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(15f)
                close()
                moveTo(5f, 16f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(9f)
                close()
                moveTo(22f, 9.88f)
                verticalLineToRelative(14.12f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-14.12f)
                close()
            }
        }.also { _CopyAlt = it}
