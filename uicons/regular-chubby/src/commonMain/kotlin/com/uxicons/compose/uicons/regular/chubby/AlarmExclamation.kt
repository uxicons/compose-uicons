package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmExclamation: ImageVector? = null

val Icons.Rc.AlarmExclamation: ImageVector
    get() = _AlarmExclamation ?: UXIcon(name = "AlarmExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.51f, 18.63f)
                curveToRelative(1.04f, -1.48f, 1.6f, -3.45f, 1.64f, -5.88f)
                curveToRelative(-0.1f, -5.49f, -2.98f, -8.68f, -8.15f, -9.07f)
                verticalLineToRelative(-1.67f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.67f)
                curveToRelative(-5.24f, 0.37f, -8.05f, 3.49f, -8.15f, 9.08f)
                curveToRelative(0f, 0f, -0.14f, 3.36f, 1.64f, 5.89f)
                curveToRelative(-1.18f, 0.53f, -1.78f, 1.66f, -1.78f, 3.37f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.35f, 0.38f, -1.68f, 1.42f, -1.72f)
                curveToRelative(1.48f, 1.05f, 3.44f, 1.6f, 5.88f, 1.61f)
                curveToRelative(2.42f, -0.01f, 4.38f, -0.56f, 5.86f, -1.61f)
                curveToRelative(1.04f, 0.04f, 1.42f, 0.37f, 1.42f, 1.72f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.71f, -0.6f, -2.84f, -1.78f, -3.37f)
                close()
                moveTo(12.01f, 19.89f)
                curveToRelative(-4.79f, -0.03f, -7.06f, -2.29f, -7.16f, -7.13f)
                curveToRelative(0.09f, -4.83f, 2.37f, -7.1f, 7.15f, -7.13f)
                curveToRelative(4.67f, 0.03f, 7.08f, 2.44f, 7.16f, 7.11f)
                curveToRelative(-0.09f, 4.85f, -2.36f, 7.12f, -7.15f, 7.15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.37f, 5.83f)
                curveToRelative(0.78f, -1.39f, 1.99f, -2.36f, 3.59f, -2.88f)
                curveToRelative(0.53f, -0.17f, 0.81f, -0.73f, 0.64f, -1.26f)
                curveToRelative(-0.17f, -0.52f, -0.73f, -0.81f, -1.26f, -0.64f)
                curveToRelative(-2.06f, 0.67f, -3.69f, 1.99f, -4.71f, 3.8f)
                curveToRelative(-0.27f, 0.48f, -0.11f, 1.11f, 0.38f, 1.36f)
                curveToRelative(0.7f, 0.35f, 1.18f, -0.06f, 1.36f, -0.38f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.37f, 4.85f)
                curveToRelative(-1.02f, -1.82f, -2.65f, -3.13f, -4.71f, -3.8f)
                curveToRelative(-0.53f, -0.17f, -1.09f, 0.12f, -1.26f, 0.64f)
                curveToRelative(-0.17f, 0.53f, 0.12f, 1.09f, 0.64f, 1.26f)
                curveToRelative(1.6f, 0.52f, 2.81f, 1.49f, 3.59f, 2.88f)
                curveToRelative(0.18f, 0.33f, 0.66f, 0.73f, 1.36f, 0.38f)
                curveToRelative(0.49f, -0.25f, 0.65f, -0.88f, 0.38f, -1.36f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17.0f)
                moveToRelative(-1.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.99f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.99f, 0f)
            }
        }.also { _AlarmExclamation = it}
