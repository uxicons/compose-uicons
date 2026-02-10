package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rocks: ImageVector? = null

val Icons.Ss.Rocks: ImageVector
    get() = _Rocks ?: UXIcon(name = "Rocks") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.11f, 14.84f)
                lineToRelative(2.56f, 3.71f)
                lineToRelative(-3.0f, 3.6f)
                lineToRelative(-3.67f, -1.8f)
                verticalLineToRelative(-3.7f)
                lineToRelative(4.11f, -1.81f)
                close()
                moveTo(20.61f, 9f)
                lineToRelative(3.26f, -3.22f)
                lineToRelative(-1.89f, -5.78f)
                horizontalLineToRelative(-5.54f)
                lineToRelative(-3.31f, 4.14f)
                lineToRelative(3.69f, 4.86f)
                horizontalLineToRelative(3.79f)
                close()
                moveTo(11f, 4.18f)
                lineTo(5.27f, 0.15f)
                lineTo(0f, 3.44f)
                verticalLineToRelative(6.72f)
                lineToRelative(7.02f, 2.56f)
                lineToRelative(3.98f, -3.31f)
                lineTo(11f, 4.18f)
                close()
                moveTo(23.98f, 18.6f)
                lineToRelative(-3.01f, 5.4f)
                lineTo(12.78f, 24f)
                lineToRelative(-3.78f, -4.11f)
                verticalLineToRelative(-4.3f)
                lineToRelative(4.48f, -4.59f)
                lineToRelative(7.59f, 0.01f)
                lineToRelative(2.91f, 7.59f)
                close()
                moveTo(17f, 20f)
                horizontalLineToRelative(-2.12f)
                lineToRelative(-2.16f, -2.35f)
                lineToRelative(-1.47f, 1.35f)
                lineToRelative(2.76f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Rocks = it}
