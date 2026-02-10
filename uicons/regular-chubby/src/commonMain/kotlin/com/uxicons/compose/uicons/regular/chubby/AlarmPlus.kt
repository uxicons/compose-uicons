package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmPlus: ImageVector? = null

val Icons.Rc.AlarmPlus: ImageVector
    get() = _AlarmPlus ?: UXIcon(name = "AlarmPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.57f, 18.63f)
                curveToRelative(1.05f, -1.48f, 1.61f, -3.45f, 1.66f, -5.88f)
                curveToRelative(-0.1f, -5.5f, -3f, -8.69f, -8.22f, -9.07f)
                verticalLineToRelative(-1.67f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.67f)
                curveToRelative(-5.28f, 0.37f, -8.22f, 3.65f, -8.22f, 9.11f)
                curveToRelative(0f, 2.3f, 0.6f, 4.38f, 1.65f, 5.85f)
                curveToRelative(-1.19f, 0.53f, -1.79f, 1.66f, -1.79f, 3.37f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.35f, 0.39f, -1.68f, 1.45f, -1.72f)
                curveToRelative(1.49f, 1.05f, 3.47f, 1.6f, 5.92f, 1.61f)
                curveToRelative(2.44f, -0.01f, 4.42f, -0.56f, 5.91f, -1.61f)
                curveToRelative(1.06f, 0.04f, 1.45f, 0.37f, 1.45f, 1.72f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.71f, -0.6f, -2.84f, -1.8f, -3.37f)
                close()
                moveTo(12.01f, 19.89f)
                curveToRelative(-4.83f, -0.03f, -7.13f, -2.29f, -7.23f, -7.13f)
                curveToRelative(0.09f, -4.77f, 2.46f, -7.1f, 7.21f, -7.13f)
                curveToRelative(4.71f, 0.03f, 7.14f, 2.44f, 7.23f, 7.11f)
                curveToRelative(-0.09f, 4.85f, -2.39f, 7.12f, -7.21f, 7.15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.29f, 5.84f)
                curveToRelative(0.79f, -1.39f, 2.01f, -2.36f, 3.62f, -2.88f)
                curveToRelative(0.53f, -0.17f, 0.81f, -0.73f, 0.65f, -1.26f)
                curveToRelative(-0.17f, -0.53f, -0.73f, -0.81f, -1.26f, -0.65f)
                curveToRelative(-2.08f, 0.67f, -3.72f, 1.99f, -4.75f, 3.8f)
                curveToRelative(-0.27f, 0.48f, -0.1f, 1.09f, 0.38f, 1.36f)
                curveToRelative(0.62f, 0.35f, 1.18f, -0.05f, 1.36f, -0.38f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.45f, 4.85f)
                curveToRelative(-1.03f, -1.82f, -2.67f, -3.13f, -4.75f, -3.8f)
                curveToRelative(-0.53f, -0.17f, -1.09f, 0.12f, -1.26f, 0.65f)
                curveToRelative(-0.17f, 0.53f, 0.12f, 1.09f, 0.65f, 1.26f)
                curveToRelative(1.62f, 0.52f, 2.83f, 1.49f, 3.62f, 2.88f)
                curveToRelative(0.18f, 0.33f, 0.75f, 0.73f, 1.36f, 0.38f)
                curveToRelative(0.48f, -0.27f, 0.65f, -0.88f, 0.38f, -1.36f)
                close()
            }
        }.also { _AlarmPlus = it}
