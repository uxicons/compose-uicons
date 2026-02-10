package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Octagon: ImageVector? = null

val Icons.Br.Octagon: ImageVector
    get() = _Octagon ?: UXIcon(name = "Octagon") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.74f, 24f)
            horizontalLineToRelative(-5.38f)
            curveToRelative(-1.47f, 0f, -2.85f, -0.57f, -3.89f, -1.61f)
            lineToRelative(-3.81f, -3.81f)
            curveTo(0.62f, 17.54f, 0.05f, 16.16f, 0.05f, 14.69f)
            verticalLineToRelative(-5.38f)
            curveTo(0.05f, 7.84f, 0.62f, 6.46f, 1.66f, 5.42f)
            lineTo(5.47f, 1.61f)
            curveToRelative(1.04f, -1.04f, 2.42f, -1.61f, 3.89f, -1.61f)
            horizontalLineToRelative(5.38f)
            curveToRelative(1.47f, 0f, 2.85f, 0.57f, 3.89f, 1.61f)
            lineToRelative(3.81f, 3.81f)
            curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
            verticalLineToRelative(5.38f)
            curveToRelative(0f, 1.47f, -0.57f, 2.85f, -1.61f, 3.89f)
            lineToRelative(-3.81f, 3.81f)
            curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
            close()
            moveTo(9.36f, 3f)
            curveToRelative(-0.67f, 0f, -1.3f, 0.26f, -1.77f, 0.73f)
            lineToRelative(-3.81f, 3.81f)
            curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
            verticalLineToRelative(5.38f)
            curveToRelative(0f, 0.67f, 0.26f, 1.3f, 0.73f, 1.77f)
            lineToRelative(3.81f, 3.81f)
            curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
            horizontalLineToRelative(5.38f)
            curveToRelative(0.67f, 0f, 1.3f, -0.26f, 1.77f, -0.73f)
            lineToRelative(3.81f, -3.81f)
            curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
            verticalLineToRelative(-5.38f)
            curveToRelative(0f, -0.67f, -0.26f, -1.3f, -0.73f, -1.77f)
            lineToRelative(-3.81f, -3.81f)
            curveToRelative(-0.47f, -0.47f, -1.1f, -0.73f, -1.77f, -0.73f)
            horizontalLineToRelative(-5.38f)
            close()
        }
    }.also { _Octagon = it }
