package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _K: ImageVector? = null

val Icons.Br.K: ImageVector
    get() = _K ?: UXIcon(name = "K") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.85f, 12.92f)
            lineTo(21.76f, 2.32f)
            curveToRelative(0.45f, -0.69f, 0.26f, -1.62f, -0.44f, -2.08f)
            curveToRelative(-0.69f, -0.45f, -1.62f, -0.26f, -2.08f, 0.44f)
            lineToRelative(-6.73f, 10.32f)
            horizontalLineTo(5f)
            verticalLineTo(1.5f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            verticalLineTo(22.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineTo(14f)
            horizontalLineToRelative(6.88f)
            lineToRelative(7.45f, 9.43f)
            curveToRelative(0.52f, 0.65f, 1.46f, 0.76f, 2.11f, 0.25f)
            curveToRelative(0.65f, -0.51f, 0.76f, -1.46f, 0.25f, -2.11f)
            lineToRelative(-6.83f, -8.65f)
            close()
        }
    }.also { _K = it }
