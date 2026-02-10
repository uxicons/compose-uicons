package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleXmark: ImageVector? = null

val Icons.Rc.RectangleXmark: ImageVector
    get() = _RectangleXmark ?: UXIcon(name = "RectangleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 3.71f)
                curveToRelative(-0.11f, -0.32f, -0.37f, -0.56f, -0.7f, -0.65f)
                curveToRelative(-0.17f, -0.04f, -4.26f, -1.07f, -9.1f, -1.07f)
                reflectiveCurveTo(3.08f, 3.02f, 2.9f, 3.07f)
                curveToRelative(-0.33f, 0.08f, -0.59f, 0.33f, -0.7f, 0.65f)
                curveToRelative(-0.05f, 0.15f, -1.2f, 3.63f, -1.2f, 8.28f)
                curveToRelative(0f, 4.69f, 1.15f, 8.14f, 1.2f, 8.29f)
                curveToRelative(0.11f, 0.32f, 0.37f, 0.56f, 0.7f, 0.65f)
                curveToRelative(0.17f, 0.04f, 4.26f, 1.07f, 9.1f, 1.07f)
                reflectiveCurveToRelative(8.92f, -1.02f, 9.1f, -1.07f)
                curveToRelative(0.33f, -0.08f, 0.59f, -0.33f, 0.7f, -0.65f)
                curveToRelative(0.05f, -0.15f, 1.2f, -3.63f, 1.2f, -8.28f)
                curveToRelative(0f, -4.69f, -1.15f, -8.14f, -1.2f, -8.29f)
                close()
                moveTo(20.06f, 19.12f)
                curveToRelative(-1.25f, 0.27f, -4.47f, 0.88f, -8.06f, 0.88f)
                reflectiveCurveToRelative(-6.81f, -0.61f, -8.06f, -0.88f)
                curveToRelative(-0.3f, -1.09f, -0.94f, -3.79f, -0.94f, -7.12f)
                curveToRelative(0f, -3.3f, 0.64f, -6.02f, 0.94f, -7.12f)
                curveToRelative(1.25f, -0.27f, 4.47f, -0.88f, 8.06f, -0.88f)
                reflectiveCurveToRelative(6.81f, 0.61f, 8.06f, 0.88f)
                curveToRelative(0.3f, 1.09f, 0.94f, 3.79f, 0.94f, 7.12f)
                curveToRelative(0f, 3.3f, -0.64f, 6.02f, -0.94f, 7.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.4f, 12f)
                lineToRelative(1.91f, -1.94f)
                curveToRelative(0.39f, -0.39f, 0.38f, -1.03f, -0.01f, -1.41f)
                curveToRelative(-0.4f, -0.39f, -1.03f, -0.38f, -1.41f, 0.01f)
                lineToRelative(-1.88f, 1.92f)
                lineToRelative(-1.88f, -1.92f)
                curveToRelative(-0.39f, -0.4f, -1.02f, -0.4f, -1.41f, -0.01f)
                curveToRelative(-0.39f, 0.39f, -0.4f, 1.02f, -0.01f, 1.41f)
                lineToRelative(1.91f, 1.94f)
                lineToRelative(-1.91f, 1.94f)
                curveToRelative(-0.39f, 0.39f, -0.4f, 1.05f, 0.01f, 1.41f)
                curveToRelative(0.6f, 0.53f, 1.22f, 0.19f, 1.41f, -0.01f)
                lineToRelative(1.88f, -1.92f)
                lineToRelative(1.88f, 1.92f)
                curveToRelative(0.2f, 0.2f, 0.8f, 0.58f, 1.41f, 0.01f)
                curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.01f, -1.41f)
                lineToRelative(-1.91f, -1.94f)
                close()
            }
        }.also { _RectangleXmark = it}
