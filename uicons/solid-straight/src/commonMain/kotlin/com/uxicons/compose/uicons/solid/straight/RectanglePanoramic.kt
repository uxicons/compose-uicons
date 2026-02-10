package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectanglePanoramic: ImageVector? = null

val Icons.Ss.RectanglePanoramic: ImageVector
    get() = _RectanglePanoramic ?: UXIcon(name = "RectanglePanoramic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _RectanglePanoramic = it}
