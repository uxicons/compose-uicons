package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUp: ImageVector? = null

val Icons.Tr.ArrowUp: ImageVector
    get() = _ArrowUp ?: UXIcon(name = "ArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.81f, 5.39f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.36f, 0.15f)
                curveToRelative(-0.13f, 0f, -0.25f, -0.05f, -0.35f, -0.14f)
                lineToRelative(-4.04f, -3.95f)
                curveToRelative(-0.17f, -0.17f, -0.36f, -0.29f, -0.56f, -0.36f)
                verticalLineToRelative(22.41f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(1.08f)
                curveToRelative(-0.2f, 0.07f, -0.4f, 0.19f, -0.56f, 0.35f)
                lineToRelative(-4.09f, 3.93f)
                curveToRelative(-0.2f, 0.19f, -0.52f, 0.19f, -0.71f, -0.01f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.52f, 0.01f, -0.71f)
                lineTo(10.24f, 0.72f)
                curveToRelative(0.47f, -0.47f, 1.12f, -0.72f, 1.76f, -0.72f)
                curveToRelative(0.62f, 0.02f, 1.3f, 0.27f, 1.77f, 0.74f)
                lineToRelative(4.04f, 3.94f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.01f, 0.71f)
                close()
            }
        }.also { _ArrowUp = it}
