package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxAlt: ImageVector? = null

val Icons.Rs.BoxAlt: ImageVector
    get() = _BoxAlt ?: UXIcon(name = "BoxAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
                moveTo(22f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(3f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
                moveTo(2f, 22f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _BoxAlt = it}
