package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _First: ImageVector? = null

val Icons.Bs.First: ImageVector
    get() = _First ?: UXIcon(name = "First") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.97f, 7.0f)
                lineToRelative(-3f, 0.01f)
                lineToRelative(0.01f, 2.0f)
                horizontalLineToRelative(-1.97f)
                lineToRelative(-0.01f, -2.0f)
                lineToRelative(-3f, 0.01f)
                lineToRelative(0.01f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.01f)
                lineToRelative(0.01f, 2f)
                horizontalLineToRelative(-2.02f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.03f)
                lineToRelative(0.01f, 2.0f)
                lineToRelative(3f, -0.01f)
                lineToRelative(-0.01f, -2.0f)
                horizontalLineToRelative(1.97f)
                lineToRelative(0.01f, 2.0f)
                lineToRelative(3f, -0.01f)
                lineToRelative(-0.01f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.01f)
                lineToRelative(-0.01f, -2f)
                horizontalLineToRelative(2.02f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(-0.01f, -2.0f)
                close()
                moveTo(8.99f, 14f)
                horizontalLineToRelative(-1.97f)
                lineToRelative(-0.01f, -2f)
                horizontalLineToRelative(1.97f)
                lineToRelative(0.01f, 2f)
                close()
                moveTo(22f, 2f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-3f)
                lineTo(19f, 7.07f)
                lineToRelative(-2.01f, 2.06f)
                lineToRelative(-2.15f, -2.09f)
                lineToRelative(4.91f, -5.04f)
                horizontalLineToRelative(2.25f)
                close()
            }
        }.also { _First = it}
