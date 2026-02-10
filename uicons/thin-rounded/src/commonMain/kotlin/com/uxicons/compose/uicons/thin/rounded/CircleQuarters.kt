package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuarters: ImageVector? = null

val Icons.Tr.CircleQuarters: ImageVector
    get() = _CircleQuarters ?: UXIcon(name = "CircleQuarters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 13f)
                horizontalLineTo(2.73f)
                curveToRelative(-0.83f, 0f, -1.61f, -0.37f, -2.13f, -1.03f)
                curveTo(0.07f, 11.31f, -0.12f, 10.46f, 0.07f, 9.64f)
                curveTo(1.15f, 4.91f, 4.91f, 1.15f, 9.64f, 0.07f)
                curveToRelative(0.82f, -0.19f, 1.67f, 0f, 2.33f, 0.53f)
                curveToRelative(0.65f, 0.52f, 1.03f, 1.3f, 1.03f, 2.13f)
                verticalLineTo(12.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(10.26f, 1f)
                curveToRelative(-0.13f, 0f, -0.27f, 0.02f, -0.4f, 0.05f)
                curveTo(5.51f, 2.04f, 2.04f, 5.51f, 1.05f, 9.86f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.12f, 0.52f, 0f, 1.07f, 0.34f, 1.49f)
                curveToRelative(0.33f, 0.41f, 0.82f, 0.65f, 1.35f, 0.65f)
                horizontalLineTo(12f)
                verticalLineTo(2.73f)
                curveToRelative(0f, -0.53f, -0.24f, -1.02f, -0.65f, -1.35f)
                curveToRelative(-0.31f, -0.25f, -0.7f, -0.38f, -1.09f, -0.38f)
                close()
                moveTo(0.56f, 9.75f)
                horizontalLineTo(0.56f)
                close()
            }
        }.also { _CircleQuarters = it}
