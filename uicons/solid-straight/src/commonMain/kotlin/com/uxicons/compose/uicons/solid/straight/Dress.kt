package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dress: ImageVector? = null

val Icons.Ss.Dress: ImageVector
    get() = _Dress ?: UXIcon(name = "Dress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.62f, 16.01f)
                curveToRelative(-1.85f, 4.8f, -6.46f, 8.08f, -11.62f, 8.06f)
                curveToRelative(-5.16f, 0.02f, -9.77f, -3.25f, -11.62f, -8.06f)
                lineToRelative(7.62f, -5.01f)
                horizontalLineToRelative(8f)
                lineToRelative(7.62f, 5.01f)
                close()
                moveTo(8f, 9f)
                horizontalLineToRelative(8f)
                lineToRelative(0.74f, -2.21f)
                curveToRelative(0.17f, -0.78f, 0.26f, -1.58f, 0.26f, -2.39f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2.1f)
                curveToRelative(-1.33f, 0.25f, -2.35f, 0.94f, -3f, 1.51f)
                curveToRelative(-0.65f, -0.58f, -1.67f, -1.26f, -3f, -1.51f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4.4f)
                curveToRelative(0f, 0.8f, 0.09f, 1.6f, 0.26f, 2.39f)
                lineToRelative(0.74f, 2.21f)
                close()
            }
        }.also { _Dress = it}
