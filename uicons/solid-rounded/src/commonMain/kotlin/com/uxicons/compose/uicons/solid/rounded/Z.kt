package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Z: ImageVector? = null

val Icons.Sr.Z: ImageVector
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
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15.09f)
                curveToRelative(1.73f, 0f, 3.19f, 1.06f, 3.72f, 2.7f)
                curveToRelative(0.54f, 1.64f, -0.02f, 3.36f, -1.41f, 4.38f)
                lineTo(4.78f, 18.54f)
                curveToRelative(-0.83f, 0.61f, -0.9f, 1.5f, -0.69f, 2.14f)
                curveToRelative(0.21f, 0.64f, 0.8f, 1.32f, 1.82f, 1.32f)
                horizontalLineToRelative(15.09f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Z = it}
