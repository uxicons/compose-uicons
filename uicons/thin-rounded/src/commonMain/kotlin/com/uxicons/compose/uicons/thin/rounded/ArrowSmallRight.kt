package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallRight: ImageVector? = null

val Icons.Tr.ArrowSmallRight: ImageVector
    get() = _ArrowSmallRight ?: UXIcon(name = "ArrowSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 12f)
                curveToRelative(0.0f, 0.66f, -0.26f, 1.29f, -0.72f, 1.77f)
                lineToRelative(-3.92f, 4.08f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.36f, 0.15f)
                curveToRelative(-0.12f, 0f, -0.25f, -0.05f, -0.35f, -0.14f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.01f, -0.71f)
                lineToRelative(3.92f, -4.09f)
                curveToRelative(0.16f, -0.17f, 0.28f, -0.36f, 0.35f, -0.57f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12.41f)
                curveToRelative(-0.07f, -0.21f, -0.2f, -0.4f, -0.36f, -0.56f)
                lineToRelative(-3.95f, -4.05f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.01f, -0.71f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.19f, 0.71f, 0.01f)
                lineToRelative(3.95f, 4.04f)
                curveToRelative(0.47f, 0.46f, 0.73f, 1.1f, 0.74f, 1.76f)
                close()
            }
        }.also { _ArrowSmallRight = it}
