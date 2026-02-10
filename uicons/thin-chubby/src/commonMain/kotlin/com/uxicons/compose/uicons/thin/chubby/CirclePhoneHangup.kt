package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneHangup: ImageVector? = null

val Icons.Tc.CirclePhoneHangup: ImageVector
    get() = _CirclePhoneHangup ?: UXIcon(name = "CirclePhoneHangup") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                curveToRelative(0f, 9.75f, 5.88f, 11f, 11f, 11f)
                curveToRelative(7.71f, 0f, 11f, -3.29f, 11f, -11f)
                curveToRelative(0f, -9.75f, -5.88f, -11f, -11f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.1f, 0f, -10f, -2.9f, -10f, -10f)
                reflectiveCurveToRelative(2.9f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.9f, 10f, 10f)
                reflectiveCurveToRelative(-2.9f, 10f, -10f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.48f, 9.97f)
                curveToRelative(-1.54f, -1.07f, -3.88f, -1.56f, -5.49f, -1.59f)
                curveToRelative(-1.63f, 0.02f, -3.95f, 0.5f, -5.49f, 1.53f)
                curveToRelative(-1.67f, 1.15f, -1.51f, 3.07f, -1.5f, 3.15f)
                curveToRelative(-0.01f, 0.91f, 0.52f, 1.79f, 1.37f, 2.23f)
                curveToRelative(0.74f, 0.38f, 1.63f, 0.38f, 2.38f, -0.01f)
                curveToRelative(0.85f, -0.45f, 1.39f, -1.32f, 1.4f, -2.29f)
                verticalLineToRelative(-0.16f)
                curveToRelative(0.48f, -0.23f, 1.31f, -0.39f, 1.86f, -0.4f)
                curveToRelative(0.55f, 0.01f, 1.38f, 0.18f, 1.86f, 0.42f)
                lineToRelative(0.0f, 0.17f)
                curveToRelative(0.02f, 0.96f, 0.56f, 1.84f, 1.41f, 2.29f)
                curveToRelative(0.75f, 0.4f, 1.64f, 0.41f, 2.38f, 0.04f)
                curveToRelative(0.85f, -0.43f, 1.37f, -1.29f, 1.36f, -2.25f)
                curveToRelative(0.01f, -0.23f, 0.08f, -2.0f, -1.53f, -3.13f)
                close()
                moveTo(18.01f, 13.09f)
                curveToRelative(-0.03f, 1.6f, -1.64f, 1.73f, -2.26f, 1.33f)
                curveToRelative(-0.51f, -0.32f, -0.87f, -0.83f, -0.88f, -1.42f)
                lineToRelative(-0.01f, -0.44f)
                curveToRelative(-0.0f, -0.16f, -0.08f, -0.31f, -0.21f, -0.4f)
                curveToRelative(-0.69f, -0.5f, -1.99f, -0.71f, -2.65f, -0.73f)
                curveToRelative(-0.67f, 0.01f, -1.97f, 0.2f, -2.66f, 0.7f)
                curveToRelative(-0.13f, 0.09f, -0.21f, 0.24f, -0.21f, 0.4f)
                lineToRelative(-0.0f, 0.44f)
                curveToRelative(-0.0f, 0.59f, -0.32f, 1.17f, -0.86f, 1.41f)
                curveToRelative(-1.59f, 0.7f, -2.34f, -0.81f, -2.29f, -1.37f)
                curveToRelative(-0.01f, -0.11f, -0.11f, -1.47f, 1.07f, -2.28f)
                curveToRelative(1.36f, -0.91f, 3.51f, -1.34f, 4.93f, -1.36f)
                curveToRelative(1.4f, 0.03f, 3.56f, 0.49f, 4.93f, 1.42f)
                curveToRelative(1.2f, 0.83f, 1.09f, 2.28f, 1.09f, 2.3f)
                close()
            }
        }.also { _CirclePhoneHangup = it}
