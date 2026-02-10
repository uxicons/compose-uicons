package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H4: ImageVector? = null

val Icons.Bs.H4: ImageVector
    get() = _H4 ?: UXIcon(name = "H4") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                lineTo(3f, 13f)
                verticalLineToRelative(7f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(21f, 4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                lineTo(24f, 4f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _H4 = it}
