package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CopyAlt: ImageVector? = null

val Icons.Rs.CopyAlt: ImageVector
    get() = _CopyAlt ?: UXIcon(name = "CopyAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 5.09f)
                lineToRelative(-5.09f, -5.09f)
                horizontalLineToRelative(-7.91f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(16f)
                close()
                moveTo(4f, 18f)
                verticalLineToRelative(-15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(12f)
                close()
                moveTo(22f, 9f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-15f)
                close()
            }
        }.also { _CopyAlt = it}
