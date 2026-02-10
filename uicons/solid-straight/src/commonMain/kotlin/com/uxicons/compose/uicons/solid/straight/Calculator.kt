package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Calculator: ImageVector? = null

val Icons.Ss.Calculator: ImageVector
    get() = _Calculator ?: UXIcon(name = "Calculator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                horizontalLineToRelative(-16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
                moveTo(7f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(13f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 10f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(14f)
                close()
                moveTo(17f, 8f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                close()
            }
        }.also { _Calculator = it}
