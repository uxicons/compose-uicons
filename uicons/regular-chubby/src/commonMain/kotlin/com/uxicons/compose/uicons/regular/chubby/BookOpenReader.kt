package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenReader: ImageVector? = null

val Icons.Rc.BookOpenReader: ImageVector
    get() = _BookOpenReader ?: UXIcon(name = "BookOpenReader") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.0f, 12.0f)
                curveToRelative(-0.02f, -0.34f, -0.21f, -0.65f, -0.51f, -0.82f)
                curveToRelative(-0.08f, -0.05f, -2.09f, -1.16f, -4.32f, -0.64f)
                curveToRelative(-1.29f, 0.3f, -2.48f, 1.04f, -3.18f, 1.54f)
                curveToRelative(-0.7f, -0.5f, -1.89f, -1.23f, -3.18f, -1.54f)
                curveToRelative(-2.22f, -0.52f, -4.23f, 0.59f, -4.32f, 0.64f)
                curveToRelative(-0.3f, 0.17f, -0.49f, 0.48f, -0.51f, 0.82f)
                curveToRelative(-0.2f, 3.93f, -0.17f, 6.23f, 0.07f, 6.82f)
                curveToRelative(0.92f, 2.21f, 6.1f, 3.73f, 7.67f, 4.14f)
                curveToRelative(0.08f, 0.02f, 0.17f, 0.03f, 0.26f, 0.03f)
                reflectiveCurveToRelative(0.17f, -0.01f, 0.26f, -0.03f)
                curveToRelative(1.57f, -0.41f, 6.75f, -1.93f, 7.67f, -4.14f)
                curveToRelative(0.25f, -0.59f, 0.27f, -2.89f, 0.07f, -6.82f)
                close()
                moveTo(5.94f, 18.11f)
                curveToRelative(-0.12f, -0.47f, -0.08f, -3.06f, 0.03f, -5.4f)
                curveToRelative(0.54f, -0.2f, 1.46f, -0.44f, 2.39f, -0.22f)
                curveToRelative(1.08f, 0.25f, 2.12f, 0.95f, 2.64f, 1.34f)
                verticalLineToRelative(6.84f)
                curveToRelative(-2.4f, -0.76f, -4.76f, -1.86f, -5.06f, -2.55f)
                close()
                moveTo(18.08f, 18.05f)
                curveToRelative(-0.31f, 0.74f, -2.67f, 1.85f, -5.08f, 2.61f)
                verticalLineToRelative(-6.84f)
                curveToRelative(0.52f, -0.39f, 1.56f, -1.08f, 2.64f, -1.34f)
                curveToRelative(0.93f, -0.22f, 1.85f, 0.02f, 2.39f, 0.22f)
                curveToRelative(0.1f, 2.35f, 0.14f, 4.92f, 0.05f, 5.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 9.72f)
                curveToRelative(2.74f, 0f, 4.28f, -1.56f, 4.33f, -4.38f)
                curveToRelative(-0.05f, -2.74f, -1.62f, -4.33f, -4.34f, -4.34f)
                curveToRelative(-2.7f, 0.02f, -4.33f, 1.63f, -4.33f, 4.38f)
                curveToRelative(0f, 2.68f, 1.47f, 4.34f, 4.34f, 4.34f)
                close()
                moveTo(11.99f, 3f)
                curveToRelative(1.59f, 0.01f, 2.31f, 0.74f, 2.34f, 2.34f)
                curveToRelative(-0.03f, 1.7f, -0.69f, 2.37f, -2.33f, 2.38f)
                curveToRelative(-1.65f, -0.01f, -2.3f, -0.67f, -2.34f, -2.36f)
                curveToRelative(0.03f, -1.67f, 0.71f, -2.35f, 2.33f, -2.36f)
                close()
            }
        }.also { _BookOpenReader = it}
