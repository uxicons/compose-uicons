package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Donate: ImageVector? = null

val Icons.Sr.Donate: ImageVector
    get() = _Donate ?: UXIcon(name = "Donate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 20.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 24f)
                curveToRelative(-3.95f, -0.01f, -4.8f, -5.61f, -1.08f, -6.81f)
                curveToRelative(4.52f, 6.35f, 14.65f, 6.35f, 19.17f, 0f)
                curveToRelative(1.4f, 0.46f, 2.42f, 1.76f, 2.42f, 3.31f)
                close()
                moveTo(22f, 10f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                curveTo(-1.25f, 19.5f, -1.24f, 0.5f, 12f, 0f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                close()
                moveTo(16f, 12f)
                curveToRelative(0f, -1.36f, -0.97f, -2.51f, -2.31f, -2.73f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-1.09f, -0.21f, -0.64f, -1.83f, 0.36f, -1.76f)
                horizontalLineToRelative(2.27f)
                curveToRelative(0.36f, 0f, 0.69f, 0.19f, 0.87f, 0.5f)
                curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.36f)
                curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.36f, -1.37f)
                curveToRelative(-0.54f, -0.93f, -1.53f, -1.5f, -2.6f, -1.5f)
                horizontalLineToRelative(-0.27f)
                verticalLineToRelative(-1f)
                curveToRelative(-0.01f, -1.31f, -2.0f, -1.31f, -2f, 0f)
                verticalLineToRelative(1f)
                curveToRelative(-3.44f, -0.02f, -4.18f, 5.08f, -0.69f, 5.73f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(1.09f, 0.21f, 0.64f, 1.83f, -0.36f, 1.76f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(-0.36f, 0f, -0.69f, -0.19f, -0.87f, -0.5f)
                curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.36f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.36f, 1.37f)
                curveToRelative(0.54f, 0.93f, 1.53f, 1.5f, 2.6f, 1.5f)
                horizontalLineToRelative(0.27f)
                verticalLineToRelative(1f)
                curveToRelative(0.01f, 1.31f, 2.0f, 1.31f, 2f, 0f)
                verticalLineToRelative(-1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _Donate = it}
