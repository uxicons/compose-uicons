package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulerTriangle: ImageVector? = null

val Icons.Bs.RulerTriangle: ImageVector
    get() = _RulerTriangle ?: UXIcon(name = "RulerTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.16f, 19.13f)
                lineTo(4.87f, 0.84f)
                curveTo(4.05f, 0.02f, 2.83f, -0.22f, 1.76f, 0.22f)
                curveTo(0.69f, 0.66f, 0f, 1.7f, 0f, 2.85f)
                lineTo(0f, 24f)
                lineTo(21.14f, 24f)
                curveToRelative(1.16f, 0f, 2.19f, -0.69f, 2.63f, -1.76f)
                curveToRelative(0.44f, -1.07f, 0.2f, -2.29f, -0.62f, -3.11f)
                close()
                moveTo(3f, 21f)
                lineTo(3f, 3.21f)
                lineToRelative(3.94f, 3.94f)
                lineToRelative(-1.39f, 1.39f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.39f, -1.39f)
                lineToRelative(1.77f, 1.77f)
                lineToRelative(-1.39f, 1.39f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.39f, -1.39f)
                lineToRelative(1.77f, 1.77f)
                lineToRelative(-1.39f, 1.39f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.39f, -1.39f)
                lineToRelative(3.94f, 3.94f)
                lineTo(3f, 21.0f)
                close()
                moveTo(6f, 12f)
                lineToRelative(6f, 6f)
                lineTo(6f, 18f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _RulerTriangle = it}
