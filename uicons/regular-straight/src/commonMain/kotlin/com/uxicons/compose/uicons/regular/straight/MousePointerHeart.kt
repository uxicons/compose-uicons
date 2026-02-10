package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MousePointerHeart: ImageVector? = null

val Icons.Rs.MousePointerHeart: ImageVector
    get() = _MousePointerHeart ?: UXIcon(name = "MousePointerHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.73f, 17.66f)
                lineToRelative(0.79f, 2.3f)
                lineToRelative(-0.52f, 0.37f)
                curveToRelative(-1.53f, -1.1f, -3.38f, -2.4f, -6.07f, -5.13f)
                curveTo(1.66f, 11.81f, 0f, 8.72f, 0f, 6f)
                curveTo(0f, 2.69f, 2.69f, 0f, 6f, 0f)
                curveToRelative(1.49f, 0f, 3.01f, 0.67f, 4.17f, 1.84f)
                curveToRelative(0.31f, 0.32f, 0.59f, 0.66f, 0.83f, 1.02f)
                curveToRelative(1.12f, -1.67f, 3.03f, -2.86f, 5.0f, -2.86f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 1.87f, -0.81f, 3.77f, -1.97f, 5.55f)
                lineToRelative(-1.95f, -0.67f)
                curveToRelative(1.17f, -1.67f, 1.92f, -3.36f, 1.92f, -4.88f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.99f, 0f, -4.02f, 2.02f, -4.02f, 4f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0.01f, 0f, 0.01f)
                curveToRelative(-0.5f, -0.01f, -1.5f, -0.01f, -2f, -0.01f)
                curveToRelative(0f, -0.0f, 0f, -0.01f, 0f, -0.01f)
                horizontalLineToRelative(0f)
                curveToRelative(0.07f, -1.91f, -2.05f, -4.06f, -3.98f, -3.99f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                curveToRelative(-0.45f, 3.25f, 5.71f, 9.63f, 8.73f, 11.65f)
                close()
                moveTo(18.86f, 17.44f)
                lineToRelative(5.1f, 5.1f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-5.1f, -5.1f)
                lineToRelative(-2.42f, 5.14f)
                lineToRelative(-4.67f, -13.65f)
                lineToRelative(13.65f, 4.67f)
                lineToRelative(-5.14f, 2.42f)
                close()
                moveTo(16.39f, 16.39f)
                lineToRelative(2.29f, -1.08f)
                lineToRelative(-5.12f, -1.75f)
                lineToRelative(1.75f, 5.12f)
                lineToRelative(1.08f, -2.29f)
                close()
            }
        }.also { _MousePointerHeart = it}
