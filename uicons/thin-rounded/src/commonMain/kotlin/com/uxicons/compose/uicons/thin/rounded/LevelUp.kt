package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelUp: ImageVector? = null

val Icons.Tr.LevelUp: ImageVector
    get() = _LevelUp ?: UXIcon(name = "LevelUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.97f, 1.38f)
                curveToRelative(-0.2f, -0.2f, -0.5f, -0.47f, -0.82f, -0.76f)
                curveTo(13.69f, 0.21f, 13.1f, 0.0f, 12.51f, 0.0f)
                lineToRelative(-0.01f, -0.0f)
                lineToRelative(-0.01f, 0.0f)
                curveToRelative(-0.59f, 0.0f, -1.18f, 0.21f, -1.65f, 0.63f)
                curveToRelative(-0.32f, 0.28f, -0.62f, 0.56f, -0.81f, 0.75f)
                lineToRelative(-2.88f, 2.83f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.71f, 0.01f)
                lineToRelative(2.88f, -2.83f)
                curveToRelative(0.19f, -0.19f, 0.47f, -0.45f, 0.77f, -0.71f)
                curveToRelative(0.15f, -0.13f, 0.32f, -0.22f, 0.49f, -0.29f)
                verticalLineTo(19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(8.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineTo(1.09f)
                curveToRelative(0.18f, 0.06f, 0.34f, 0.15f, 0.49f, 0.29f)
                curveToRelative(0.3f, 0.27f, 0.59f, 0.53f, 0.78f, 0.72f)
                lineToRelative(2.88f, 2.83f)
                curveToRelative(0.1f, 0.1f, 0.22f, 0.14f, 0.35f, 0.14f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.36f, -0.15f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.01f, -0.71f)
                lineToRelative(-2.88f, -2.83f)
                close()
            }
        }.also { _LevelUp = it}
