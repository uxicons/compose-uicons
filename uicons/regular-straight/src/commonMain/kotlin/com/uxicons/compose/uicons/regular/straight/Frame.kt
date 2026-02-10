package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Frame: ImageVector? = null

val Icons.Rs.Frame: ImageVector
    get() = _Frame ?: UXIcon(name = "Frame") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                lineTo(5f, 3f)
                lineTo(5f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                lineTo(0f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(14f)
                lineTo(0f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 19f)
                lineTo(5f, 19f)
                lineTo(5f, 5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
            }
        }.also { _Frame = it}
