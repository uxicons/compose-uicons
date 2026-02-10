package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonCheck: ImageVector? = null

val Icons.Br.OctagonCheck: ImageVector
    get() = _OctagonCheck ?: UXIcon(name = "OctagonCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.39f, 5.42f)
            lineToRelative(-3.81f, -3.81f)
            curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
            horizontalLineToRelative(-5.38f)
            curveToRelative(-1.47f, 0f, -2.85f, 0.57f, -3.89f, 1.61f)
            lineToRelative(-3.81f, 3.81f)
            curveToRelative(-1.04f, 1.04f, -1.61f, 2.42f, -1.61f, 3.89f)
            verticalLineToRelative(5.38f)
            curveToRelative(0f, 1.47f, 0.57f, 2.85f, 1.61f, 3.89f)
            lineToRelative(3.81f, 3.81f)
            curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
            horizontalLineToRelative(5.38f)
            curveToRelative(1.47f, 0f, 2.85f, -0.57f, 3.89f, -1.61f)
            lineToRelative(3.81f, -3.81f)
            curveToRelative(1.04f, -1.04f, 1.61f, -2.42f, 1.61f, -3.89f)
            verticalLineToRelative(-5.38f)
            curveToRelative(0f, -1.47f, -0.57f, -2.85f, -1.61f, -3.89f)
            close()
            moveTo(21f, 14.69f)
            curveToRelative(0f, 0.67f, -0.26f, 1.3f, -0.73f, 1.77f)
            lineToRelative(-3.81f, 3.81f)
            curveToRelative(-0.47f, 0.47f, -1.1f, 0.73f, -1.77f, 0.73f)
            horizontalLineToRelative(-5.38f)
            curveToRelative(-0.67f, 0f, -1.3f, -0.26f, -1.77f, -0.73f)
            lineToRelative(-3.81f, -3.81f)
            curveToRelative(-0.47f, -0.47f, -0.73f, -1.1f, -0.73f, -1.77f)
            verticalLineToRelative(-5.38f)
            curveToRelative(0f, -0.67f, 0.26f, -1.3f, 0.73f, -1.77f)
            lineToRelative(3.81f, -3.81f)
            curveToRelative(0.47f, -0.47f, 1.1f, -0.73f, 1.77f, -0.73f)
            horizontalLineToRelative(5.38f)
            curveToRelative(0.67f, 0f, 1.3f, 0.26f, 1.77f, 0.73f)
            lineToRelative(3.81f, 3.81f)
            curveToRelative(0.47f, 0.47f, 0.73f, 1.1f, 0.73f, 1.77f)
            verticalLineToRelative(5.38f)
            close()
            moveTo(17.59f, 8.47f)
            curveToRelative(0.57f, 0.6f, 0.54f, 1.55f, -0.07f, 2.12f)
            lineToRelative(-4.14f, 3.9f)
            curveToRelative(-0.7f, 0.7f, -1.63f, 1.05f, -2.56f, 1.05f)
            curveToRelative(-0.95f, 0f, -1.9f, -0.36f, -2.62f, -1.08f)
            lineToRelative(-1.79f, -1.94f)
            curveToRelative(-0.56f, -0.61f, -0.53f, -1.56f, 0.08f, -2.12f)
            curveToRelative(0.61f, -0.56f, 1.56f, -0.53f, 2.12f, 0.08f)
            lineToRelative(1.75f, 1.9f)
            curveToRelative(0.23f, 0.23f, 0.67f, 0.23f, 0.94f, -0.04f)
            lineToRelative(4.18f, -3.93f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.54f, 2.12f, 0.07f)
            close()
        }
    }.also { _OctagonCheck = it }
