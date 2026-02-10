package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEmpty: ImageVector? = null

val Icons.Br.PlateEmpty: ImageVector
    get() = _PlateEmpty ?: UXIcon(name = "PlateEmpty") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.7f, 19f)
            horizontalLineToRelative(-3.41f)
            curveToRelative(-2.32f, 0f, -4.49f, -0.79f, -6.12f, -2.23f)
            curveTo(2.23f, 15.05f, 0.83f, 12.8f, 0.15f, 10.28f)
            curveToRelative(-0.34f, -1.25f, -0.08f, -2.55f, 0.71f, -3.59f)
            curveToRelative(0.81f, -1.06f, 2.08f, -1.69f, 3.41f, -1.69f)
            horizontalLineToRelative(15.47f)
            curveToRelative(1.33f, 0f, 2.6f, 0.63f, 3.41f, 1.69f)
            curveToRelative(0.79f, 1.04f, 1.05f, 2.35f, 0.71f, 3.59f)
            curveToRelative(-0.69f, 2.52f, -2.08f, 4.77f, -4.03f, 6.49f)
            curveToRelative(-1.63f, 1.44f, -3.8f, 2.23f, -6.12f, 2.23f)
            close()
            moveTo(4.26f, 8f)
            curveToRelative(-0.4f, 0f, -0.78f, 0.18f, -1.02f, 0.51f)
            curveToRelative(-0.13f, 0.17f, -0.33f, 0.52f, -0.2f, 0.98f)
            curveToRelative(0.54f, 1.96f, 1.62f, 3.7f, 3.12f, 5.03f)
            curveToRelative(1.08f, 0.95f, 2.54f, 1.48f, 4.13f, 1.48f)
            horizontalLineToRelative(3.41f)
            curveToRelative(1.59f, 0f, 3.05f, -0.52f, 4.13f, -1.48f)
            curveToRelative(1.51f, -1.33f, 2.59f, -3.08f, 3.12f, -5.03f)
            curveToRelative(0.12f, -0.46f, -0.07f, -0.81f, -0.2f, -0.98f)
            curveToRelative(-0.25f, -0.32f, -0.62f, -0.51f, -1.02f, -0.51f)
            horizontalLineTo(4.26f)
            close()
        }
    }.also { _PlateEmpty = it }
