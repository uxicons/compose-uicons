package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseBlank: ImageVector? = null

val Icons.Br.HouseBlank: ImageVector
    get() = _HouseBlank ?: UXIcon(name = "HouseBlank") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 24f)
            horizontalLineTo(5.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineTo(9.89f)
            curveToRelative(0f, -1.83f, 0.91f, -3.53f, 2.42f, -4.56f)
            lineTo(8.92f, 0.94f)
            curveToRelative(1.87f, -1.26f, 4.28f, -1.26f, 6.15f, 0f)
            lineToRelative(6.5f, 4.39f)
            curveToRelative(1.52f, 1.02f, 2.42f, 2.73f, 2.42f, 4.56f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            close()
            moveTo(12f, 3.0f)
            curveToRelative(-0.49f, 0f, -0.97f, 0.14f, -1.4f, 0.43f)
            lineTo(4.1f, 7.81f)
            curveToRelative(-0.69f, 0.47f, -1.1f, 1.24f, -1.1f, 2.07f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(9.89f)
            curveToRelative(0f, -0.83f, -0.41f, -1.61f, -1.1f, -2.07f)
            lineTo(13.4f, 3.43f)
            curveToRelative(-0.42f, -0.29f, -0.91f, -0.43f, -1.4f, -0.43f)
            close()
        }
    }.also { _HouseBlank = it }
