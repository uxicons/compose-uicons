package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H4: ImageVector? = null

val Icons.Ts.H4: ImageVector
    get() = _H4 ?: UXIcon(name = "H4") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7.5f)
                lineTo(1f, 12.5f)
                verticalLineToRelative(7.5f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(23f, 4f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(15f, 4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                lineTo(24f, 4f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _H4 = it}
