package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectanglePanoramic: ImageVector? = null

val Icons.Ts.RectanglePanoramic: ImageVector
    get() = _RectanglePanoramic ?: UXIcon(name = "RectanglePanoramic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                lineTo(0f, 19f)
                lineTo(0f, 5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(14f)
                close()
                moveTo(1f, 18f)
                horizontalLineToRelative(22f)
                lineTo(23f, 6f)
                lineTo(1f, 6f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _RectanglePanoramic = it}
