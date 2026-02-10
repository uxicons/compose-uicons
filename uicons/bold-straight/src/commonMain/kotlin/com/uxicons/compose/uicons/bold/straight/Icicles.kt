package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Icicles: ImageVector? = null

val Icons.Bs.Icicles: ImageVector
    get() = _Icicles ?: UXIcon(name = "Icicles") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 0f)
                verticalLineToRelative(2f)
                lineToRelative(2.87f, 16.62f)
                lineToRelative(2.36f, -5.31f)
                lineToRelative(3.16f, 10.55f)
                lineToRelative(3.79f, -10.83f)
                lineToRelative(2.38f, 5.23f)
                lineToRelative(2.28f, -5.48f)
                lineToRelative(3.67f, 10.99f)
                lineToRelative(3.47f, -21.53f)
                lineToRelative(0.02f, -2.24f)
                lineTo(0f, 0f)
                close()
                moveTo(19.49f, 11.23f)
                lineToRelative(-2.33f, -7.01f)
                lineToRelative(-2.72f, 6.52f)
                lineToRelative(-2.62f, -5.77f)
                lineToRelative(-3.21f, 9.17f)
                lineToRelative(-2.84f, -9.45f)
                lineToRelative(-1.64f, 3.69f)
                lineToRelative(-0.94f, -5.38f)
                horizontalLineToRelative(17.62f)
                lineToRelative(-1.33f, 8.23f)
                close()
            }
        }.also { _Icicles = it}
