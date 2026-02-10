package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner3: ImageVector? = null

val Icons.Ts.Banner3: ImageVector
    get() = _Banner3 ?: UXIcon(name = "Banner3") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.03f, 1.26f)
                lineTo(0.07f, 10.61f)
                lineToRelative(4.69f, 3.14f)
                lineToRelative(-2.75f, 4.45f)
                verticalLineToRelative(3.81f)
                lineToRelative(7.63f, 1.91f)
                lineToRelative(-4.02f, -3.43f)
                lineToRelative(5.39f, -2.95f)
                verticalLineToRelative(-6.17f)
                lineToRelative(13f, 0.66f)
                lineTo(24.0f, -0.03f)
                lineTo(1.03f, 1.26f)
                close()
                moveTo(4.79f, 19.8f)
                lineToRelative(-1.7f, -1.45f)
                lineToRelative(2.5f, -4.03f)
                lineToRelative(4.15f, 2.78f)
                lineToRelative(-4.94f, 2.71f)
                close()
                moveTo(10.0f, 16.06f)
                lineToRelative(-7.66f, -5.13f)
                lineToRelative(7.66f, 0.39f)
                verticalLineToRelative(4.74f)
                close()
                moveTo(23.0f, 10.97f)
                lineTo(1.15f, 9.87f)
                lineToRelative(0.79f, -7.66f)
                lineToRelative(21.06f, -1.18f)
                verticalLineToRelative(9.95f)
                close()
            }
        }.also { _Banner3 = it}
