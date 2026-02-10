package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subscript: ImageVector? = null

val Icons.Ts.Subscript: ImageVector
    get() = _Subscript ?: UXIcon(name = "Subscript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-9.35f)
                lineToRelative(-1.92f, 1.98f)
                lineToRelative(-0.72f, -0.69f)
                lineToRelative(2.84f, -2.93f)
                horizontalLineToRelative(0.8f)
                close()
                moveTo(13.45f, 0f)
                lineToRelative(-5.94f, 8.15f)
                lineTo(1.47f, 0f)
                horizontalLineTo(0.23f)
                lineToRelative(6.66f, 9f)
                lineTo(0.23f, 18f)
                horizontalLineToRelative(1.24f)
                lineToRelative(6.04f, -8.15f)
                lineToRelative(5.94f, 8.15f)
                horizontalLineToRelative(1.24f)
                lineToRelative(-6.56f, -9f)
                lineTo(14.69f, 0f)
                horizontalLineToRelative(-1.24f)
                close()
            }
        }.also { _Subscript = it}
