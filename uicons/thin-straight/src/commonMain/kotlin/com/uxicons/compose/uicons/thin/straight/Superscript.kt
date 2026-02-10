package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Superscript: ImageVector? = null

val Icons.Ts.Superscript: ImageVector
    get() = _Superscript ?: UXIcon(name = "Superscript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.72f, 6f)
                lineToRelative(-6.56f, 9f)
                lineToRelative(6.56f, 9f)
                horizontalLineToRelative(-1.24f)
                lineToRelative(-5.94f, -8.15f)
                lineTo(1.5f, 24f)
                horizontalLineTo(0.26f)
                lineToRelative(6.66f, -9f)
                lineTo(0.26f, 6f)
                horizontalLineToRelative(1.24f)
                lineToRelative(6.04f, 8.15f)
                lineToRelative(5.94f, -8.15f)
                horizontalLineToRelative(1.24f)
                close()
                moveTo(23.2f, 0f)
                lineToRelative(-2.84f, 2.93f)
                lineToRelative(0.72f, 0.69f)
                lineToRelative(1.92f, -1.98f)
                verticalLineToRelative(9.35f)
                horizontalLineToRelative(1f)
                verticalLineTo(0f)
                horizontalLineToRelative(-0.8f)
                close()
            }
        }.also { _Superscript = it}
