package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner4: ImageVector? = null

val Icons.Bs.Banner4: ImageVector
    get() = _Banner4 ?: UXIcon(name = "Banner4") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                lineTo(7f, 8f)
                verticalLineToRelative(-2f)
                lineTo(0f, 6f)
                lineToRelative(3.11f, 4f)
                lineTo(0f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                lineToRelative(-3.11f, -4f)
                lineToRelative(3.11f, -4f)
                close()
                moveTo(17f, 15f)
                lineTo(7f, 15f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Banner4 = it}
