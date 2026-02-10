package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Explosion: ImageVector? = null

val Icons.Bs.Explosion: ImageVector
    get() = _Explosion ?: UXIcon(name = "Explosion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.12f, 15f)
                lineTo(24.03f, -0.07f)
                lineTo(13.93f, 9.17f)
                lineTo(8f, 0.78f)
                lineTo(8f, 10.91f)
                lineTo(-0.0f, 8.21f)
                lineToRelative(4.81f, 7.79f)
                lineTo(0.28f, 16f)
                lineToRelative(6.71f, 8f)
                horizontalLineToRelative(10.9f)
                lineToRelative(6.19f, -9f)
                horizontalLineToRelative(-4.97f)
                close()
                moveTo(16.31f, 21f)
                horizontalLineToRelative(-7.92f)
                lineToRelative(-1.68f, -2f)
                horizontalLineToRelative(3.47f)
                lineToRelative(-3.27f, -5.29f)
                lineToRelative(4.08f, 1.38f)
                verticalLineToRelative(-4.87f)
                lineToRelative(2.45f, 3.46f)
                lineToRelative(4.19f, -3.84f)
                lineToRelative(-2.66f, 8.16f)
                horizontalLineToRelative(3.39f)
                lineToRelative(-2.06f, 3f)
                close()
                moveTo(22.38f, 21f)
                horizontalLineToRelative(1.62f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.68f)
                lineToRelative(2.06f, -3f)
                close()
                moveTo(1.87f, 21f)
                lineToRelative(2.52f, 3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                lineTo(1.87f, 21f)
                close()
            }
        }.also { _Explosion = it}
