package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxAlt: ImageVector? = null

val Icons.Ss.BoxAlt: ImageVector
    get() = _BoxAlt ?: UXIcon(name = "BoxAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 0f)
                horizontalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(14f, 0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-17f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                close()
                moveTo(8f, 5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _BoxAlt = it}
