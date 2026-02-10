package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectanglePanoramic: ImageVector? = null

val Icons.Rs.RectanglePanoramic: ImageVector
    get() = _RectanglePanoramic ?: UXIcon(name = "RectanglePanoramic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(24f)
                close()
                moveTo(2f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                close()
            }
        }.also { _RectanglePanoramic = it}
