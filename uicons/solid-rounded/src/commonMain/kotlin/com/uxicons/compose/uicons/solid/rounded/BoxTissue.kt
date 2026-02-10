package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxTissue: ImageVector? = null

val Icons.Sr.BoxTissue: ImageVector
    get() = _BoxTissue ?: UXIcon(name = "BoxTissue") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 24f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                horizontalLineTo(0f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 1.63f)
                curveToRelative(0f, 0.14f, -0.29f, 2.07f, -1.67f, 8.77f)
                curveToRelative(-0.19f, 0.93f, -1.01f, 1.6f, -1.96f, 1.6f)
                horizontalLineToRelative(-1.37f)
                lineToRelative(0.33f, -3.92f)
                curveToRelative(0.05f, -0.55f, -0.36f, -1.03f, -0.91f, -1.08f)
                curveToRelative(-0.56f, -0.06f, -1.03f, 0.36f, -1.08f, 0.91f)
                lineToRelative(-0.34f, 4.08f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.5f, -6.08f)
                curveToRelative(-0.04f, -0.55f, -0.52f, -0.97f, -1.08f, -0.91f)
                curveToRelative(-0.55f, 0.05f, -0.96f, 0.53f, -0.91f, 1.08f)
                lineToRelative(0.49f, 5.92f)
                horizontalLineToRelative(-1.36f)
                curveToRelative(-0.95f, 0f, -1.77f, -0.68f, -1.96f, -1.61f)
                curveTo(4.35f, 3.82f, 4f, 1.77f, 4f, 1.63f)
                curveTo(4f, 0.74f, 4.64f, 0.04f, 5.46f, 0.02f)
                curveToRelative(0.67f, 0f, 1.38f, 0.43f, 2.15f, 1.34f)
                curveToRelative(0.34f, 0.4f, 0.68f, 0.65f, 0.9f, 0.65f)
                curveToRelative(0.23f, -0.0f, 0.81f, -0.52f, 1.1f, -0.78f)
                curveToRelative(0.58f, -0.52f, 1.36f, -1.23f, 2.42f, -1.22f)
                curveToRelative(1.0f, 0f, 1.78f, 0.7f, 2.35f, 1.22f)
                curveToRelative(0.29f, 0.27f, 0.87f, 0.78f, 1.12f, 0.78f)
                curveToRelative(0.2f, -0.0f, 0.54f, -0.24f, 0.88f, -0.65f)
                curveTo(17.18f, 0.42f, 17.85f, -0.0f, 18.54f, 0.02f)
                curveToRelative(0.82f, 0.02f, 1.46f, 0.73f, 1.46f, 1.61f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.79f, 8.34f)
                curveToRelative(-0.19f, 0.95f, -0.37f, 1.82f, -0.5f, 2.47f)
                curveToRelative(-0.38f, 1.85f, -2.03f, 3.2f, -3.92f, 3.2f)
                horizontalLineTo(7.64f)
                curveToRelative(-1.9f, 0f, -3.55f, -1.35f, -3.92f, -3.22f)
                curveToRelative(-0.18f, -0.91f, -0.34f, -1.72f, -0.49f, -2.45f)
                curveToRelative(-1.88f, 0.72f, -3.22f, 2.54f, -3.22f, 4.67f)
                verticalLineToRelative(4f)
                horizontalLineTo(24f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.12f, -1.33f, -3.94f, -3.21f, -4.66f)
                close()
            }
        }.also { _BoxTissue = it}
