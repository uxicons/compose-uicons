package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Adobe: ImageVector? = null

val Icons.Brand.Adobe: ImageVector
    get() = _Adobe ?: UXIcon(name = "Adobe") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.13f, 1.38f)
            lineToRelative(8.87f, 0f)
            lineToRelative(0f, 21.24f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.88f, 1.38f)
            lineToRelative(-8.88f, 0f)
            lineToRelative(0f, 21.24f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.0f, 9.21f)
            lineToRelative(5.65f, 13.41f)
            lineToRelative(-3.71f, 0f)
            lineToRelative(-1.69f, -4.27f)
            lineToRelative(-4.14f, 0f)
            close()
        }
    }.also { _Adobe = it }
