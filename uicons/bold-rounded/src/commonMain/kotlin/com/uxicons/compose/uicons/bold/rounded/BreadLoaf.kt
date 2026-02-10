package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadLoaf: ImageVector? = null

val Icons.Br.BreadLoaf: ImageVector
    get() = _BreadLoaf ?: UXIcon(name = "BreadLoaf") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.94f, 5.3f)
            curveToRelative(-0.33f, -1.91f, -2.03f, -3.3f, -4.04f, -3.3f)
            horizontalLineTo(4.1f)
            curveToRelative(-2.01f, 0f, -3.71f, 1.39f, -4.04f, 3.3f)
            curveToRelative(-0.29f, 1.71f, 0.52f, 3.35f, 1.94f, 4.16f)
            lineToRelative(-0.03f, 8.03f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(11.04f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineTo(9.47f)
            curveToRelative(1.42f, -0.81f, 2.23f, -2.45f, 1.94f, -4.17f)
            close()
            moveTo(4.96f, 17.51f)
            lineToRelative(0.04f, -9.05f)
            curveToRelative(0f, -0.72f, -0.5f, -1.33f, -1.2f, -1.48f)
            curveToRelative(-0.47f, -0.1f, -0.89f, -0.56f, -0.78f, -1.17f)
            curveToRelative(0.08f, -0.45f, 0.55f, -0.81f, 1.08f, -0.81f)
            horizontalLineTo(13.03f)
            curveToRelative(0.54f, 0.02f, 0.97f, 0.46f, 0.97f, 1f)
            curveToRelative(0f, 0.47f, -0.34f, 0.89f, -0.8f, 0.98f)
            curveToRelative(-0.7f, 0.14f, -1.2f, 0.76f, -1.2f, 1.47f)
            verticalLineToRelative(9.05f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(6.46f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.49f)
            close()
            moveTo(20.2f, 6.98f)
            curveToRelative(-0.7f, 0.14f, -1.2f, 0.76f, -1.2f, 1.47f)
            verticalLineToRelative(9.05f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.76f)
            curveToRelative(0.17f, -0.47f, 0.26f, -0.97f, 0.26f, -1.5f)
            verticalLineTo(9.46f)
            curveToRelative(1.21f, -0.7f, 2f, -2.01f, 2f, -3.46f)
            curveToRelative(0f, -0.35f, -0.04f, -0.68f, -0.13f, -1f)
            horizontalLineToRelative(3.03f)
            curveToRelative(0.53f, 0f, 1f, 0.36f, 1.08f, 0.81f)
            curveToRelative(0.1f, 0.61f, -0.31f, 1.07f, -0.78f, 1.17f)
            close()
        }
    }.also { _BreadLoaf = it }
