package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Icicles: ImageVector? = null

val Icons.Rs.Icicles: ImageVector
    get() = _Icicles ?: UXIcon(name = "Icicles") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.28f, 24.08f)
                lineToRelative(-3.24f, -12.08f)
                lineToRelative(-2.32f, 6.23f)
                lineTo(0f, 1.51f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                lineToRelative(-0.01f, 1.66f)
                lineToRelative(-3.29f, 21.83f)
                lineToRelative(-3.56f, -12.1f)
                lineToRelative(-2.48f, 6.79f)
                lineToRelative(-2.61f, -6.64f)
                lineToRelative(-3.77f, 12.52f)
                close()
                moveTo(5.34f, 5.43f)
                lineToRelative(3.04f, 11.34f)
                lineToRelative(3.4f, -11.32f)
                lineToRelative(2.79f, 7.11f)
                lineToRelative(2.76f, -7.55f)
                lineToRelative(2.73f, 9.26f)
                lineToRelative(1.85f, -12.27f)
                horizontalLineTo(2.09f)
                lineToRelative(1.38f, 8.46f)
                lineToRelative(1.87f, -5.03f)
                close()
            }
        }.also { _Icicles = it}
