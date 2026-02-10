package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAlien: ImageVector? = null

val Icons.Rc.UserAlien: ImageVector
    get() = _UserAlien ?: UXIcon(name = "UserAlien") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.0f, 8.64f)
                curveToRelative(-0.03f, 0.55f, -0.16f, 1.31f, -0.6f, 1.75f)
                reflectiveCurveToRelative(-1.21f, 0.57f, -1.75f, 0.6f)
                curveToRelative(-0.36f, 0.02f, -0.66f, -0.28f, -0.64f, -0.64f)
                curveToRelative(0.03f, -0.55f, 0.16f, -1.31f, 0.6f, -1.75f)
                reflectiveCurveToRelative(1.21f, -0.57f, 1.75f, -0.6f)
                curveToRelative(0.36f, -0.02f, 0.66f, 0.28f, 0.64f, 0.64f)
                close()
                moveTo(8.64f, 8.01f)
                curveToRelative(-0.36f, -0.02f, -0.66f, 0.28f, -0.64f, 0.64f)
                curveToRelative(0.03f, 0.54f, 0.16f, 1.3f, 0.6f, 1.75f)
                reflectiveCurveToRelative(1.2f, 0.57f, 1.75f, 0.6f)
                curveToRelative(0.36f, 0.02f, 0.66f, -0.28f, 0.64f, -0.64f)
                curveToRelative(-0.03f, -0.54f, -0.16f, -1.3f, -0.6f, -1.75f)
                reflectiveCurveToRelative(-1.2f, -0.57f, -1.75f, -0.6f)
                close()
                moveTo(21.0f, 22.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.15f, -0.69f, -4.99f, -2.28f, -5.99f)
                curveToRelative(-1.91f, 2.19f, -3.98f, 3.69f, -4.14f, 3.81f)
                curveToRelative(-0.17f, 0.12f, -0.38f, 0.19f, -0.58f, 0.19f)
                reflectiveCurveToRelative(-0.41f, -0.06f, -0.58f, -0.19f)
                curveToRelative(-0.16f, -0.11f, -2.23f, -1.62f, -4.14f, -3.81f)
                curveToRelative(-1.59f, 1f, -2.28f, 2.84f, -2.28f, 5.99f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.74f, 0.98f, -6.18f, 3.04f, -7.57f)
                curveToRelative(-1.15f, -1.64f, -2.04f, -3.51f, -2.04f, -5.43f)
                curveToRelative(0.0f, -5.53f, 2.47f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8f, 2.47f, 8f, 8f)
                curveToRelative(0f, 1.92f, -0.89f, 3.79f, -2.04f, 5.43f)
                curveToRelative(2.06f, 1.39f, 3.04f, 3.83f, 3.04f, 7.57f)
                close()
                moveTo(18.0f, 9.0f)
                curveToRelative(0f, -4.43f, -1.57f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 1.57f, -6f, 6f)
                curveToRelative(0f, 3.63f, 4.39f, 7.46f, 6f, 8.74f)
                curveToRelative(1.61f, -1.28f, 6f, -5.11f, 6f, -8.74f)
                close()
            }
        }.also { _UserAlien = it}
