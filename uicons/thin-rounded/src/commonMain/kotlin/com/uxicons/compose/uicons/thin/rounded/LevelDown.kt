package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelDown: ImageVector? = null

val Icons.Tr.LevelDown: ImageVector
    get() = _LevelDown ?: UXIcon(name = "LevelDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.86f, 19.09f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                lineToRelative(-2.88f, 2.83f)
                curveToRelative(-0.19f, 0.19f, -0.47f, 0.45f, -0.77f, 0.71f)
                curveToRelative(-0.15f, 0.13f, -0.32f, 0.22f, -0.49f, 0.28f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineTo(0.5f)
                curveTo(0.22f, 0f, 0f, 0.22f, 0f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(8.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineTo(22.91f)
                curveToRelative(-0.18f, -0.06f, -0.34f, -0.15f, -0.49f, -0.28f)
                curveToRelative(-0.3f, -0.27f, -0.59f, -0.53f, -0.78f, -0.72f)
                lineToRelative(-2.88f, -2.83f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                lineToRelative(2.88f, 2.83f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.47f, 0.82f, 0.76f)
                curveToRelative(0.47f, 0.42f, 1.06f, 0.63f, 1.66f, 0.63f)
                reflectiveCurveToRelative(1.19f, -0.21f, 1.66f, -0.63f)
                curveToRelative(0.32f, -0.28f, 0.62f, -0.56f, 0.81f, -0.75f)
                lineToRelative(2.88f, -2.83f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                close()
            }
        }.also { _LevelDown = it}
