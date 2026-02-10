package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonExclamation: ImageVector? = null

val Icons.Br.OctagonExclamation: ImageVector
    get() = _OctagonExclamation ?: UXIcon(name = "OctagonExclamation") {
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
            curveToRelative(0f, 0.67f, -0.26f, 1.29f, -0.73f, 1.77f)
            lineToRelative(-3.81f, 3.81f)
            curveToRelative(-0.47f, 0.47f, -1.11f, 0.73f, -1.77f, 0.73f)
            horizontalLineToRelative(-5.38f)
            curveToRelative(-0.66f, 0f, -1.3f, -0.27f, -1.77f, -0.73f)
            lineToRelative(-3.81f, -3.81f)
            curveToRelative(-0.47f, -0.47f, -0.73f, -1.1f, -0.73f, -1.77f)
            verticalLineToRelative(-5.38f)
            curveToRelative(0f, -0.67f, 0.26f, -1.29f, 0.73f, -1.77f)
            lineToRelative(3.81f, -3.81f)
            curveToRelative(0.47f, -0.47f, 1.11f, -0.73f, 1.77f, -0.73f)
            horizontalLineToRelative(5.38f)
            curveToRelative(0.66f, 0f, 1.3f, 0.27f, 1.77f, 0.73f)
            lineToRelative(3.81f, 3.81f)
            curveToRelative(0.47f, 0.47f, 0.73f, 1.1f, 0.73f, 1.77f)
            verticalLineToRelative(5.38f)
            close()
            moveTo(13.5f, 7.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(13.5f, 16.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _OctagonExclamation = it }
