package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Explosion: ImageVector? = null

val Icons.Ts.Explosion: ImageVector
    get() = _Explosion ?: UXIcon(name = "Explosion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7.34f)
                lineToRelative(5.44f, -8f)
                horizontalLineToRelative(-4.44f)
                lineTo(21.82f, 3.23f)
                lineToRelative(-8.13f, 7.44f)
                lineTo(9f, 3.96f)
                lineTo(9f, 12.3f)
                lineToRelative(-6.78f, -2.27f)
                lineToRelative(4.3f, 6.97f)
                lineTo(2.34f, 17f)
                lineToRelative(5.55f, 7f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                lineTo(5.83f, 23f)
                lineTo(0.28f, 16f)
                lineTo(4.73f, 16f)
                lineTo(-0.09f, 8.21f)
                lineToRelative(8.09f, 2.7f)
                lineTo(8f, 0.78f)
                lineToRelative(5.85f, 8.39f)
                lineTo(23.94f, -0.07f)
                lineToRelative(-4.91f, 15.07f)
                horizontalLineToRelative(4.95f)
                lineToRelative(-5.44f, 8f)
                horizontalLineToRelative(5.45f)
                close()
                moveTo(14.97f, 18f)
                lineToRelative(0.06f, -6.0f)
                lineToRelative(-3.29f, 4.32f)
                lineToRelative(-2.74f, -2.73f)
                verticalLineToRelative(5.41f)
                horizontalLineToRelative(-2.54f)
                lineToRelative(3.89f, 5f)
                horizontalLineToRelative(1.27f)
                lineToRelative(-3.11f, -4f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4f)
                lineToRelative(1.84f, 1.84f)
                lineToRelative(2.16f, -2.84f)
                lineToRelative(-0.04f, 4f)
                horizontalLineToRelative(2.54f)
                lineToRelative(-3.5f, 5f)
                horizontalLineToRelative(1.22f)
                lineToRelative(4.2f, -6f)
                horizontalLineToRelative(-3.45f)
                close()
            }
        }.also { _Explosion = it}
