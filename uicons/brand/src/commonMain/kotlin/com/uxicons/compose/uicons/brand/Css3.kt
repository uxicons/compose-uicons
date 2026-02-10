package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Css3: ImageVector? = null

val Icons.Brand.Css3: ImageVector
    get() = _Css3 ?: UXIcon(name = "Css3") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.97f, 14.94f)
            lineToRelative(0.3f, 3.38f)
            lineToRelative(4.72f, 1.27f)
            lineToRelative(0.0f, -0.0f)
            lineToRelative(0f, 0f)
            lineToRelative(4.73f, -1.28f)
            lineToRelative(0.49f, -5.5f)
            lineToRelative(-14.69f, 0f)
            lineToRelative(-0.38f, -4.24f)
            lineToRelative(15.44f, 0f)
            lineToRelative(0.39f, -4.34f)
            lineToRelative(-16.2f, 0f)
            lineToRelative(-0.39f, -4.24f)
            lineToRelative(21.23f, 0f)
            lineToRelative(-1.93f, 21.59f)
            lineToRelative(-8.67f, 2.4f)
            lineToRelative(0f, 0.0f)
            lineToRelative(-0.02f, 0.01f)
            lineToRelative(-8.68f, -2.41f)
            lineToRelative(-0.59f, -6.66f)
            close()
        }
    }.also { _Css3 = it }
