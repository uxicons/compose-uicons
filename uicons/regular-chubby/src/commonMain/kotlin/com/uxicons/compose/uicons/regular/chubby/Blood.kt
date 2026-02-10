package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blood: ImageVector? = null

val Icons.Rc.Blood: ImageVector
    get() = _Blood ?: UXIcon(name = "Blood") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.62f, 6.21f)
                curveToRelative(-0.36f, -0.28f, -0.87f, -0.28f, -1.24f, 0f)
                curveToRelative(-0.45f, 0.35f, -4.38f, 3.54f, -4.38f, 6.79f)
                curveToRelative(0f, 3.41f, 1.59f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -1.59f, 5f, -5f)
                curveToRelative(0f, -3.25f, -3.93f, -6.43f, -4.38f, -6.79f)
                close()
                moveTo(18f, 16f)
                curveToRelative(-2.3f, 0f, -3f, -0.7f, -3f, -3f)
                curveToRelative(0f, -1.61f, 1.81f, -3.61f, 3f, -4.69f)
                curveToRelative(1.19f, 1.08f, 3f, 3.07f, 3f, 4.69f)
                curveToRelative(0f, 2.3f, -0.7f, 3f, -3f, 3f)
                close()
                moveTo(10.5f, 9f)
                curveToRelative(2.32f, 0f, 3.5f, -1.18f, 3.5f, -3.5f)
                curveToRelative(0f, -1.86f, -2.39f, -3.89f, -2.87f, -4.28f)
                curveToRelative(-0.37f, -0.3f, -0.89f, -0.3f, -1.26f, 0f)
                curveToRelative(-0.48f, 0.39f, -2.87f, 2.42f, -2.87f, 4.28f)
                curveToRelative(0f, 2.32f, 1.18f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(10.5f, 3.34f)
                curveToRelative(0.79f, 0.77f, 1.5f, 1.7f, 1.5f, 2.16f)
                curveToRelative(0f, 1.23f, -0.27f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.27f, -1.5f, -1.5f)
                curveToRelative(0f, -0.47f, 0.7f, -1.39f, 1.5f, -2.16f)
                close()
                moveTo(7.12f, 9.96f)
                curveToRelative(-0.36f, -0.28f, -0.87f, -0.28f, -1.24f, 0f)
                curveToRelative(-0.5f, 0.39f, -4.88f, 3.94f, -4.88f, 7.54f)
                curveToRelative(0f, 3.75f, 1.75f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -1.75f, 5.5f, -5.5f)
                curveToRelative(0f, -3.6f, -4.38f, -7.14f, -4.88f, -7.54f)
                close()
                moveTo(6.5f, 21.0f)
                curveToRelative(-2.65f, 0f, -3.5f, -0.85f, -3.5f, -3.5f)
                curveToRelative(0f, -1.9f, 2.15f, -4.23f, 3.5f, -5.44f)
                curveToRelative(1.35f, 1.21f, 3.5f, 3.54f, 3.5f, 5.44f)
                curveToRelative(0f, 2.65f, -0.85f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Blood = it}
