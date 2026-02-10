package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picture: ImageVector? = null

val Icons.Tc.Picture: ImageVector
    get() = _Picture ?: UXIcon(name = "Picture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.16f, 5.61f)
                curveToRelative(-1.77f, 0f, -2.63f, 0.86f, -2.63f, 2.64f)
                reflectiveCurveToRelative(0.86f, 2.64f, 2.63f, 2.64f)
                reflectiveCurveToRelative(2.63f, -0.86f, 2.63f, -2.64f)
                reflectiveCurveToRelative(-0.86f, -2.64f, -2.63f, -2.64f)
                close()
                moveTo(16.16f, 9.89f)
                curveToRelative(-1.06f, 0f, -1.63f, -0.26f, -1.63f, -1.64f)
                reflectiveCurveToRelative(0.57f, -1.64f, 1.63f, -1.64f)
                reflectiveCurveToRelative(1.63f, 0.26f, 1.63f, 1.64f)
                reflectiveCurveToRelative(-0.57f, 1.64f, -1.63f, 1.64f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.77f, 2.92f)
                curveToRelative(-0.05f, -0.16f, -0.18f, -0.29f, -0.35f, -0.33f)
                curveToRelative(-0.18f, -0.05f, -4.41f, -1.18f, -9.42f, -1.18f)
                reflectiveCurveTo(2.76f, 2.54f, 2.58f, 2.59f)
                curveToRelative(-0.17f, 0.04f, -0.29f, 0.17f, -0.35f, 0.33f)
                curveToRelative(-0.05f, 0.16f, -1.23f, 3.97f, -1.23f, 9.08f)
                curveToRelative(0f, 5.15f, 1.18f, 8.92f, 1.23f, 9.08f)
                curveToRelative(0.05f, 0.16f, 0.18f, 0.29f, 0.35f, 0.33f)
                curveToRelative(0.18f, 0.05f, 4.41f, 1.18f, 9.42f, 1.18f)
                reflectiveCurveToRelative(9.24f, -1.13f, 9.42f, -1.18f)
                curveToRelative(0.16f, -0.04f, 0.29f, -0.17f, 0.35f, -0.33f)
                curveToRelative(0.05f, -0.16f, 1.23f, -3.97f, 1.23f, -9.08f)
                curveToRelative(0f, -5.15f, -1.18f, -8.92f, -1.23f, -9.08f)
                close()
                moveTo(3.11f, 20.51f)
                curveToRelative(-0.12f, -0.44f, -0.38f, -1.41f, -0.61f, -2.75f)
                curveToRelative(2.55f, -3.66f, 5.88f, -5.46f, 6.62f, -5.83f)
                curveToRelative(0.81f, 0.23f, 4.49f, 1.42f, 8.19f, 5.04f)
                curveToRelative(1.33f, 1.3f, 2.41f, 2.66f, 3.15f, 3.64f)
                curveToRelative(-1.4f, 0.32f, -4.76f, 0.98f, -8.47f, 0.98f)
                curveToRelative(-4.17f, 0f, -7.88f, -0.83f, -8.89f, -1.08f)
                close()
                moveTo(21.08f, 19.77f)
                curveToRelative(-0.75f, -0.98f, -1.79f, -2.27f, -3.07f, -3.51f)
                curveToRelative(-4.39f, -4.29f, -8.65f, -5.3f, -8.83f, -5.34f)
                curveToRelative(-0.1f, -0.02f, -0.21f, -0.01f, -0.31f, 0.03f)
                curveToRelative(-0.16f, 0.07f, -3.65f, 1.65f, -6.58f, 5.42f)
                curveToRelative(-0.17f, -1.27f, -0.29f, -2.75f, -0.29f, -4.37f)
                curveToRelative(0f, -4.2f, 0.85f, -7.57f, 1.11f, -8.51f)
                curveToRelative(1.01f, -0.25f, 4.72f, -1.07f, 8.89f, -1.07f)
                reflectiveCurveToRelative(7.88f, 0.83f, 8.89f, 1.07f)
                curveToRelative(0.26f, 0.94f, 1.11f, 4.28f, 1.11f, 8.51f)
                curveToRelative(0f, 3.44f, -0.57f, 6.32f, -0.92f, 7.77f)
                close()
            }
        }.also { _Picture = it}
