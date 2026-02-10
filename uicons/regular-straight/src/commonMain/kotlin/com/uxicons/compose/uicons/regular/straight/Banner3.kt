package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner3: ImageVector? = null

val Icons.Rs.Banner3: ImageVector
    get() = _Banner3 ?: UXIcon(name = "Banner3") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0.02f)
                lineTo(1.07f, 1.23f)
                lineTo(0f, 11f)
                lineToRelative(4.78f, 2.79f)
                lineToRelative(-2.79f, 4.24f)
                verticalLineToRelative(3.96f)
                lineToRelative(8f, 2f)
                lineToRelative(-4.59f, -3.4f)
                lineToRelative(6.59f, -2.69f)
                verticalLineToRelative(-6.42f)
                lineToRelative(12f, 0.56f)
                lineTo(24.0f, 0.02f)
                close()
                moveTo(4f, 19.01f)
                verticalLineToRelative(-0.38f)
                lineToRelative(2.52f, -3.83f)
                lineToRelative(3.21f, 1.87f)
                lineToRelative(-5.72f, 2.34f)
                close()
                moveTo(10f, 14.52f)
                lineToRelative(-5.83f, -3.4f)
                lineToRelative(5.83f, 0.27f)
                verticalLineToRelative(3.13f)
                close()
                moveTo(22f, 9.95f)
                lineToRelative(-19.76f, -0.93f)
                lineToRelative(0.64f, -5.88f)
                lineToRelative(19.12f, -1.01f)
                verticalLineToRelative(7.82f)
                close()
            }
        }.also { _Banner3 = it}
