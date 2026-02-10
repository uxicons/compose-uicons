package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner4: ImageVector? = null

val Icons.Rs.Banner4: ImageVector
    get() = _Banner4 ?: UXIcon(name = "Banner4") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                lineTo(7f, 9f)
                verticalLineToRelative(-3f)
                lineTo(0f, 6f)
                verticalLineToRelative(0.07f)
                lineToRelative(3.11f, 3.93f)
                lineToRelative(-3.11f, 3.93f)
                verticalLineToRelative(0.07f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-0.07f)
                lineToRelative(-3.11f, -3.93f)
                lineToRelative(3.11f, -3.93f)
                verticalLineToRelative(-0.07f)
                close()
                moveTo(18f, 17f)
                lineTo(6f, 17f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _Banner4 = it}
