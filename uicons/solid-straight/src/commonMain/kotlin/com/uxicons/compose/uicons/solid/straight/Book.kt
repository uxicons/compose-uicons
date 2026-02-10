package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Book: ImageVector? = null

val Icons.Ss.Book: ImageVector
    get() = _Book ?: UXIcon(name = "Book") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(426.67f, 0f)
                horizontalLineToRelative(-256f)
                verticalLineToRelative(384f)
                horizontalLineToRelative(298.67f)
                verticalLineTo(42.67f)
                curveTo(469.33f, 19.1f, 450.23f, 0f, 426.67f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(106.67f, 0f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                verticalLineToRelative(336.32f)
                curveToRelative(11.72f, -10.53f, 26.92f, -16.34f, 42.67f, -16.32f)
                horizontalLineTo(128f)
                verticalLineTo(0f)
                horizontalLineTo(106.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(469.33f, 512f)
                horizontalLineToRelative(-384f)
                curveToRelative(-23.56f, 0f, -42.67f, -19.1f, -42.67f, -42.67f)
                lineToRelative(0f, 0f)
                curveToRelative(0f, -23.56f, 19.1f, -42.67f, 42.67f, -42.67f)
                horizontalLineToRelative(384f)
                verticalLineTo(512f)
                close()
            }
        }.also { _Book = it}
