package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsRepeat: ImageVector? = null

val Icons.Br.ArrowsRepeat: ImageVector
    get() = _ArrowsRepeat ?: UXIcon(name = "ArrowsRepeat") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0f, 11.5f)
            curveTo(0f, 6.81f, 3.81f, 3f, 8.5f, 3f)
            horizontalLineToRelative(10.5f)
            lineTo(19f, 1.34f)
            curveTo(19f, 0.45f, 20.08f, 0f, 20.71f, 0.63f)
            lineToRelative(3f, 3.16f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
            lineToRelative(-3f, 3.16f)
            curveToRelative(-0.63f, 0.63f, -1.71f, 0.18f, -1.71f, -0.71f)
            verticalLineToRelative(-1.66f)
            lineTo(8.5f, 6f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(22.5f, 11f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5f, 18f)
            verticalLineToRelative(-1.66f)
            curveToRelative(0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
            lineTo(0.29f, 18.79f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
            lineToRelative(3f, 3.16f)
            curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f)
            verticalLineToRelative(-1.66f)
            lineTo(15.5f, 21f)
            curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _ArrowsRepeat = it }
