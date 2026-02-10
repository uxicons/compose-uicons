package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clone: ImageVector? = null

val Icons.Ss.Clone: ImageVector
    get() = _Clone ?: UXIcon(name = "Clone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                verticalLineToRelative(13f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(6f, 8f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-6f)
                horizontalLineTo(6f)
                verticalLineToRelative(-10f)
                close()
            }
        }.also { _Clone = it}
