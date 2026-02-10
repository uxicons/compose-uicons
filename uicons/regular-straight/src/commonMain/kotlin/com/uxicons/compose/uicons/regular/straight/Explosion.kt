package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Explosion: ImageVector? = null

val Icons.Rs.Explosion: ImageVector
    get() = _Explosion ?: UXIcon(name = "Explosion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.18f, 22f)
                horizontalLineToRelative(4.82f)
                verticalLineToRelative(2f)
                lineTo(15.38f, 24f)
                lineToRelative(4.82f, -7f)
                horizontalLineToRelative(-3.92f)
                lineToRelative(3.41f, -10.46f)
                lineToRelative(-6.17f, 5.65f)
                lineToRelative(-3.52f, -5.04f)
                verticalLineToRelative(6.54f)
                lineToRelative(-5.48f, -1.83f)
                lineToRelative(3.79f, 6.14f)
                horizontalLineToRelative(-3.83f)
                lineToRelative(5.03f, 6f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                lineTo(5.23f, 22f)
                lineTo(0.2f, 16f)
                lineTo(4.73f, 16f)
                lineTo(-0.09f, 8.21f)
                lineToRelative(8.09f, 2.7f)
                lineTo(8f, 0.78f)
                lineToRelative(5.85f, 8.38f)
                lineTo(23.94f, -0.07f)
                lineToRelative(-4.91f, 15.07f)
                horizontalLineToRelative(4.97f)
                lineToRelative(-4.82f, 7f)
                close()
                moveTo(13.96f, 19f)
                lineToRelative(0.04f, -4f)
                lineToRelative(-2.16f, 2.84f)
                lineToRelative(-1.84f, -1.84f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(3.11f, 4f)
                horizontalLineToRelative(1.39f)
                lineToRelative(3.5f, -5f)
                horizontalLineToRelative(-2.54f)
                close()
            }
        }.also { _Explosion = it}
