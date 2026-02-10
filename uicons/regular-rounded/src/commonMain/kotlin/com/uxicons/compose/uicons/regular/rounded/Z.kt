package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Z: ImageVector? = null

val Icons.Rr.Z: ImageVector
    get() = _Z ?: UXIcon(name = "Z") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                horizontalLineTo(5.91f)
                curveToRelative(-1.73f, 0f, -3.19f, -1.06f, -3.72f, -2.7f)
                curveToRelative(-0.54f, -1.64f, 0.02f, -3.36f, 1.41f, -4.38f)
                lineTo(19.22f, 5.46f)
                curveToRelative(0.83f, -0.61f, 0.9f, -1.5f, 0.69f, -2.14f)
                curveToRelative(-0.21f, -0.64f, -0.8f, -1.32f, -1.82f, -1.32f)
                horizontalLineTo(3f)
                curveTo(1.69f, 1.99f, 1.69f, 0.01f, 3f, 0f)
                horizontalLineToRelative(15.09f)
                curveToRelative(1.73f, 0f, 3.19f, 1.06f, 3.72f, 2.7f)
                curveToRelative(0.54f, 1.64f, -0.02f, 3.36f, -1.41f, 4.38f)
                lineTo(4.78f, 18.54f)
                curveToRelative(-0.83f, 0.61f, -0.9f, 1.5f, -0.69f, 2.14f)
                curveToRelative(0.21f, 0.64f, 0.8f, 1.32f, 1.82f, 1.32f)
                horizontalLineToRelative(15.09f)
                curveToRelative(1.31f, 0.01f, 1.31f, 2.0f, 0f, 2f)
                close()
            }
        }.also { _Z = it}
