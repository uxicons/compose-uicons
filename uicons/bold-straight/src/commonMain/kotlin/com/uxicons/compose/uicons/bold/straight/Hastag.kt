package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hastag: ImageVector? = null

val Icons.Bs.Hastag: ImageVector
    get() = _Hastag ?: UXIcon(name = "Hastag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.32f, 9f)
                horizontalLineToRelative(5.33f)
                lineTo(24f, 6f)
                horizontalLineTo(18.68f)
                lineTo(19.4f, 0f)
                horizontalLineTo(16.38f)
                lineToRelative(-0.72f, 6f)
                horizontalLineTo(9.78f)
                lineToRelative(0.72f, -6f)
                horizontalLineTo(7.49f)
                lineTo(6.76f, 6f)
                horizontalLineTo(0.35f)
                lineTo(0f, 9f)
                horizontalLineTo(6.4f)
                lineToRelative(-0.72f, 6f)
                horizontalLineTo(0.35f)
                lineTo(0f, 18f)
                horizontalLineTo(5.32f)
                lineTo(4.6f, 24f)
                horizontalLineTo(7.62f)
                lineToRelative(0.72f, -6f)
                horizontalLineToRelative(5.88f)
                lineToRelative(-0.72f, 6f)
                horizontalLineToRelative(3.02f)
                lineToRelative(0.72f, -6f)
                horizontalLineToRelative(6.41f)
                lineTo(24f, 15f)
                horizontalLineTo(17.6f)
                close()
                moveTo(8.7f, 15f)
                lineToRelative(0.72f, -6f)
                horizontalLineTo(15.3f)
                lineToRelative(-0.72f, 6f)
                close()
            }
        }.also { _Hastag = it}
