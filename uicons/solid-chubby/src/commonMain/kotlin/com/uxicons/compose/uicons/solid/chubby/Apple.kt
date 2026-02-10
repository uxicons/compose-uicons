package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Apple: ImageVector? = null

val Icons.Sc.Apple: ImageVector
    get() = _Apple ?: UXIcon(name = "Apple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.25f, 6.77f)
                reflectiveCurveToRelative(-0.01f, -0.01f, -0.01f, -0.01f)
                curveToRelative(-0.19f, 0.28f, -0.4f, 0.54f, -0.65f, 0.78f)
                curveToRelative(-1.01f, 1.06f, -2.44f, 1.62f, -4.13f, 1.62f)
                curveToRelative(-1.07f, 0f, -2.05f, -0.23f, -2.69f, -0.42f)
                lineToRelative(-1.11f, -0.33f)
                lineToRelative(-0.29f, -1.04f)
                curveToRelative(-0.01f, -1.9f, -0.57f, -3.74f, -1.63f, -5.32f)
                curveToRelative(-0.46f, -0.69f, -1.39f, -0.87f, -2.08f, -0.41f)
                curveToRelative(-0.69f, 0.46f, -0.87f, 1.39f, -0.41f, 2.08f)
                curveToRelative(0.26f, 0.38f, 0.47f, 0.78f, 0.64f, 1.2f)
                curveToRelative(-1.5f, -0.02f, -2.99f, 0.65f, -4.13f, 1.84f)
                curveToRelative(-1.36f, 1.42f, -5.36f, 6.61f, 0.44f, 13.84f)
                curveToRelative(1.69f, 2.1f, 3.81f, 2.39f, 5.69f, 2.39f)
                curveToRelative(0.37f, 0f, 0.73f, -0.01f, 1.08f, -0.02f)
                curveToRelative(0.7f, -0.02f, 1.38f, -0.02f, 2.08f, 0f)
                curveToRelative(2.11f, 0.07f, 4.75f, 0.15f, 6.77f, -2.37f)
                curveToRelative(5.79f, -7.22f, 1.8f, -12.42f, 0.44f, -13.84f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.94f, 6.21f)
                curveToRelative(1.66f, -1.54f, 1.15f, -3.85f, 0.85f, -4.91f)
                curveToRelative(-1.04f, -0.3f, -3.31f, -0.72f, -4.69f, 0.71f)
                curveToRelative(-1.44f, 1.4f, -1.02f, 3.68f, -0.73f, 4.72f)
                curveToRelative(1.04f, 0.31f, 3.14f, 0.81f, 4.57f, -0.52f)
                close()
            }
        }.also { _Apple = it}
