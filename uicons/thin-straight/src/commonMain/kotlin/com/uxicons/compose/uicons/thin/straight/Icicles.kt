package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Icicles: ImageVector? = null

val Icons.Ts.Icicles: ImageVector
    get() = _Icicles ?: UXIcon(name = "Icicles") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.14f, 24.06f)
                lineToRelative(-3.34f, -14.17f)
                lineToRelative(-2.28f, 6.77f)
                lineTo(0.01f, 1.12f)
                lineToRelative(-0.01f, -1.12f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(1.04f)
                lineToRelative(-3.09f, 21.83f)
                lineToRelative(-3.55f, -13.26f)
                lineToRelative(-2.61f, 7.56f)
                lineToRelative(-2.76f, -7.65f)
                lineToRelative(-3.85f, 14.54f)
                close()
                moveTo(4.97f, 6.25f)
                lineToRelative(3.23f, 13.69f)
                lineToRelative(3.64f, -13.77f)
                lineToRelative(2.89f, 8.0f)
                lineToRelative(2.76f, -7.97f)
                lineToRelative(3.13f, 11.68f)
                lineTo(23.0f, 1f)
                lineToRelative(-22.0f, 0.04f)
                lineToRelative(1.86f, 11.47f)
                lineToRelative(2.1f, -6.26f)
                close()
            }
        }.also { _Icicles = it}
