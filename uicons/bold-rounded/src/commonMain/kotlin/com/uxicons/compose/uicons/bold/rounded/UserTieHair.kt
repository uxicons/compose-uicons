package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTieHair: ImageVector? = null

val Icons.Br.UserTieHair: ImageVector
    get() = _UserTieHair ?: UXIcon(name = "UserTieHair") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(12f, 9f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            curveToRelative(0f, -0.02f, 0.01f, -0.03f, 0.01f, -0.05f)
            curveToRelative(0.16f, 0.01f, 0.31f, 0.05f, 0.47f, 0.05f)
            curveToRelative(1.82f, 0f, 3.39f, -0.98f, 4.26f, -2.43f)
            curveToRelative(0.76f, 0.55f, 1.26f, 1.43f, 1.26f, 2.43f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            close()
            moveTo(20.97f, 22.4f)
            curveToRelative(0.06f, 0.86f, -0.64f, 1.6f, -1.5f, 1.6f)
            curveToRelative(-0.78f, 0f, -1.44f, -0.61f, -1.5f, -1.4f)
            curveToRelative(-0.17f, -2.51f, -1.88f, -4.58f, -4.16f, -5.31f)
            lineToRelative(-0.94f, 1.42f)
            lineToRelative(1.09f, 3.99f)
            curveToRelative(0.18f, 0.67f, -0.41f, 1.3f, -1.2f, 1.3f)
            horizontalLineToRelative(-1.53f)
            curveToRelative(-0.8f, 0f, -1.38f, -0.64f, -1.2f, -1.3f)
            lineToRelative(1.09f, -3.99f)
            lineToRelative(-0.94f, -1.42f)
            curveToRelative(-2.28f, 0.73f, -3.99f, 2.8f, -4.16f, 5.31f)
            curveToRelative(-0.06f, 0.83f, -0.77f, 1.46f, -1.6f, 1.4f)
            curveToRelative(-0.83f, -0.06f, -1.45f, -0.77f, -1.4f, -1.6f)
            curveToRelative(0.31f, -4.71f, 4.25f, -8.4f, 8.97f, -8.4f)
            reflectiveCurveToRelative(8.66f, 3.69f, 8.97f, 8.4f)
            close()
        }
    }.also { _UserTieHair = it }
