package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MousePointerHeart: ImageVector? = null

val Icons.Ts.MousePointerHeart: ImageVector
    get() = _MousePointerHeart ?: UXIcon(name = "MousePointerHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.69f, 18.29f)
                lineToRelative(0.27f, 0.78f)
                curveToRelative(-0.12f, 0.09f, -0.34f, 0.24f, -0.46f, 0.33f)
                curveToRelative(-1.25f, -0.9f, -3.37f, -2.44f, -5.86f, -5.02f)
                curveTo(1.69f, 11.29f, 0f, 8.05f, 0f, 5.5f)
                curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
                curveToRelative(2.18f, 0f, 4.12f, 1.78f, 5f, 3.8f)
                curveToRelative(0.88f, -2.02f, 2.82f, -3.8f, 5f, -3.8f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                curveToRelative(0f, 0f, 0f, 0.0f, 0f, 0.0f)
                curveToRelative(0f, 1.77f, -0.77f, 3.77f, -1.89f, 5.47f)
                lineToRelative(-0.98f, -0.34f)
                curveToRelative(1.14f, -1.69f, 1.86f, -3.58f, 1.86f, -5.14f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-2.38f, 0f, -4.5f, 2.8f, -4.5f, 5f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -2.2f, -2.12f, -5f, -4.5f, -5f)
                curveTo(3.02f, 1f, 1f, 3.02f, 1f, 5.5f)
                curveToRelative(0f, 2.3f, 1.59f, 5.28f, 4.36f, 8.19f)
                curveToRelative(1.99f, 2.08f, 4.09f, 3.72f, 5.14f, 4.48f)
                curveToRelative(0.07f, 0.05f, 0.13f, 0.08f, 0.19f, 0.12f)
                close()
                moveTo(19.03f, 16.63f)
                lineToRelative(4.96f, 4.96f)
                lineToRelative(-2.4f, 2.4f)
                lineToRelative(-4.96f, -4.96f)
                lineToRelative(-1.87f, 4.97f)
                lineToRelative(-4.81f, -14.05f)
                lineToRelative(14.05f, 4.81f)
                lineToRelative(-4.97f, 1.87f)
                close()
                moveTo(17.22f, 16.24f)
                lineToRelative(3.82f, -1.44f)
                lineToRelative(-9.49f, -3.25f)
                lineToRelative(3.25f, 9.49f)
                lineToRelative(1.44f, -3.82f)
                lineToRelative(5.35f, 5.35f)
                lineToRelative(0.99f, -0.99f)
                lineToRelative(-5.35f, -5.35f)
                close()
            }
        }.also { _MousePointerHeart = it}
