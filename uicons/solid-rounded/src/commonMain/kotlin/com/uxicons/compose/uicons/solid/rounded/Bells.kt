package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bells: ImageVector? = null

val Icons.Sr.Bells: ImageVector
    get() = _Bells ?: UXIcon(name = "Bells") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.27f, 19f)
                lineTo(9.15f, 19f)
                curveToRelative(-1.35f, 0f, -2.62f, -0.61f, -3.46f, -1.66f)
                curveToRelative(-0.85f, -1.05f, -1.16f, -2.42f, -0.87f, -3.74f)
                lineToRelative(1.37f, -5.2f)
                curveToRelative(0.84f, -3.77f, 4.11f, -6.39f, 7.97f, -6.39f)
                curveToRelative(3.65f, 0f, 6.89f, 2.46f, 7.86f, 5.98f)
                lineToRelative(1.54f, 5.43f)
                curveToRelative(0.37f, 1.31f, 0.09f, 2.73f, -0.75f, 3.84f)
                curveToRelative(-0.85f, 1.12f, -2.14f, 1.76f, -3.54f, 1.76f)
                close()
                moveTo(10.3f, 21.01f)
                curveToRelative(0.45f, 1.72f, 2f, 2.99f, 3.86f, 2.99f)
                reflectiveCurveToRelative(3.41f, -1.27f, 3.86f, -2.99f)
                horizontalLineToRelative(-7.72f)
                close()
                moveTo(2.86f, 13.16f)
                lineToRelative(1.39f, -5.28f)
                curveTo(5.09f, 4.1f, 7.99f, 1.23f, 11.65f, 0.31f)
                curveToRelative(-0.71f, -0.2f, -1.44f, -0.31f, -2.2f, -0.31f)
                curveTo(5.59f, 0f, 2.31f, 2.63f, 1.48f, 6.39f)
                lineTo(0.11f, 11.59f)
                curveToRelative(-0.29f, 1.32f, 0.03f, 2.69f, 0.87f, 3.74f)
                curveToRelative(0.56f, 0.7f, 1.31f, 1.2f, 2.14f, 1.46f)
                curveToRelative(-0.42f, -1.14f, -0.52f, -2.4f, -0.25f, -3.63f)
                close()
            }
        }.also { _Bells = it}
