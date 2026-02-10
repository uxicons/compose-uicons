package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Devianart: ImageVector? = null

val Icons.Brand.Devianart: ImageVector
    get() = _Devianart ?: UXIcon(name = "Devianart") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.97f, 11.23f)
            lineToRelative(-0.36f, -0.43f)
            lineToRelative(-4.04f, 0f)
            lineToRelative(0f, -5.99f)
            lineToRelative(7.35f, 0f)
            lineToRelative(0.65f, -0.44f)
            lineToRelative(2.06f, -3.92f)
            lineToRelative(0.44f, -0.44f)
            lineToRelative(4.36f, 0f)
            lineToRelative(0.0f, 0f)
            lineToRelative(0f, 4.36f)
            lineToRelative(-4.4f, 8.4f)
            lineToRelative(0.36f, 0.44f)
            lineToRelative(4.04f, 0f)
            lineToRelative(0f, 5.99f)
            lineToRelative(-7.35f, 0f)
            lineToRelative(-0.65f, 0.44f)
            lineToRelative(-2.06f, 3.92f)
            lineToRelative(-0.44f, 0.44f)
            lineToRelative(-4.36f, 0f)
            lineToRelative(-0.0f, 0f)
            lineToRelative(0f, -4.36f)
            close()
        }
    }.also { _Devianart = it }
