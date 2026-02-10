package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenReader: ImageVector? = null

val Icons.Sc.BookOpenReader: ImageVector
    get() = _BookOpenReader ?: UXIcon(name = "BookOpenReader") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.0f, 12.0f)
                curveToRelative(-0.02f, -0.34f, -0.21f, -0.65f, -0.51f, -0.82f)
                curveToRelative(-0.08f, -0.05f, -2.09f, -1.16f, -4.32f, -0.64f)
                curveToRelative(-0.79f, 0.19f, -1.55f, 0.54f, -2.18f, 0.9f)
                verticalLineToRelative(9.14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(11.44f)
                curveToRelative(-0.63f, -0.36f, -1.38f, -0.71f, -2.18f, -0.9f)
                curveToRelative(-2.22f, -0.52f, -4.23f, 0.59f, -4.32f, 0.64f)
                curveToRelative(-0.3f, 0.17f, -0.49f, 0.48f, -0.51f, 0.82f)
                curveToRelative(-0.2f, 3.93f, -0.17f, 6.23f, 0.07f, 6.82f)
                curveToRelative(0.92f, 2.21f, 6.1f, 3.73f, 7.67f, 4.14f)
                curveToRelative(0.08f, 0.02f, 0.17f, 0.03f, 0.26f, 0.03f)
                reflectiveCurveToRelative(0.17f, -0.01f, 0.26f, -0.03f)
                curveToRelative(1.57f, -0.41f, 6.75f, -1.93f, 7.67f, -4.14f)
                curveToRelative(0.25f, -0.59f, 0.27f, -2.89f, 0.07f, -6.82f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 9.72f)
                curveToRelative(2.74f, 0f, 4.28f, -1.56f, 4.33f, -4.38f)
                curveToRelative(-0.05f, -2.74f, -1.62f, -4.33f, -4.34f, -4.34f)
                curveToRelative(-2.7f, 0.02f, -4.33f, 1.67f, -4.33f, 4.38f)
                curveToRelative(0f, 2.69f, 1.55f, 4.34f, 4.34f, 4.34f)
                close()
            }
        }.also { _BookOpenReader = it}
