package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Amd: ImageVector? = null

val Icons.Brand.Amd: ImageVector
    get() = _Amd ?: UXIcon(name = "Amd") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.46f, 6.54f)
            lineToRelative(-10.72f, 0f)
            lineToRelative(-6.54f, -6.54f)
            lineToRelative(23.8f, 0f)
            lineToRelative(0f, 23.8f)
            lineToRelative(-6.54f, -6.54f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.73f, 17.27f)
            lineToRelative(0f, -9.42f)
            lineToRelative(-6.73f, 6.73f)
            lineToRelative(0f, 9.42f)
            lineToRelative(9.42f, 0f)
            lineToRelative(6.73f, -6.73f)
            close()
        }
    }.also { _Amd = it }
