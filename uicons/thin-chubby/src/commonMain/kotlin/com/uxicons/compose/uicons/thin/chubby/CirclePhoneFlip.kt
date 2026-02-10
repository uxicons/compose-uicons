package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneFlip: ImageVector? = null

val Icons.Tc.CirclePhoneFlip: ImageVector
    get() = _CirclePhoneFlip ?: UXIcon(name = "CirclePhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 12f)
                curveToRelative(0f, 9.75f, 5.88f, 11f, 11f, 11f)
                curveToRelative(7.71f, 0f, 11f, -3.29f, 11f, -11f)
                curveToRelative(0f, -9.75f, -5.88f, -11f, -11f, -11f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -7.1f, 2.9f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.9f, 10f, 10f)
                reflectiveCurveToRelative(-2.9f, 10f, -10f, 10f)
                reflectiveCurveToRelative(-10f, -2.9f, -10f, -10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.16f, 14.16f)
                curveToRelative(-0.29f, 0.9f, -0.05f, 1.88f, 0.63f, 2.55f)
                curveToRelative(0.15f, 0.17f, 1.36f, 1.47f, 3.29f, 1.13f)
                curveToRelative(1.85f, -0.33f, 3.84f, -1.64f, 5.01f, -2.76f)
                curveToRelative(1.14f, -1.17f, 2.44f, -3.15f, 2.8f, -4.97f)
                curveToRelative(0.37f, -2.0f, -1.1f, -3.24f, -1.16f, -3.29f)
                curveToRelative(-0.64f, -0.65f, -1.63f, -0.9f, -2.55f, -0.6f)
                curveToRelative(-0.8f, 0.25f, -1.42f, 0.89f, -1.67f, 1.69f)
                curveToRelative(-0.29f, 0.92f, -0.04f, 1.92f, 0.63f, 2.6f)
                lineToRelative(0.11f, 0.11f)
                curveToRelative(-0.18f, 0.5f, -0.65f, 1.2f, -1.04f, 1.6f)
                curveToRelative(-0.4f, 0.38f, -1.1f, 0.85f, -1.61f, 1.02f)
                lineToRelative(-0.12f, -0.12f)
                curveToRelative(-0.69f, -0.67f, -1.7f, -0.9f, -2.62f, -0.62f)
                curveToRelative(-0.81f, 0.25f, -1.45f, 0.86f, -1.71f, 1.65f)
                close()
                moveTo(7.12f, 14.47f)
                curveToRelative(0.16f, -0.48f, 0.55f, -0.85f, 1.05f, -1.01f)
                curveToRelative(0.58f, -0.18f, 1.2f, -0.03f, 1.63f, 0.38f)
                lineToRelative(0.32f, 0.31f)
                curveToRelative(0.11f, 0.11f, 0.28f, 0.16f, 0.42f, 0.13f)
                curveToRelative(0.85f, -0.13f, 1.91f, -0.9f, 2.39f, -1.36f)
                curveToRelative(0.47f, -0.48f, 1.25f, -1.54f, 1.39f, -2.38f)
                curveToRelative(0.03f, -0.16f, -0.03f, -0.32f, -0.14f, -0.43f)
                lineToRelative(-0.31f, -0.32f)
                curveToRelative(-0.41f, -0.42f, -0.56f, -1.03f, -0.39f, -1.6f)
                curveToRelative(0.15f, -0.49f, 0.63f, -1.09f, 1.49f, -1.11f)
                curveToRelative(0.41f, -0.01f, 0.8f, 0.16f, 1.1f, 0.46f)
                curveToRelative(0.08f, 0.07f, 1.12f, 0.96f, 0.85f, 2.37f)
                curveToRelative(-0.32f, 1.6f, -1.53f, 3.43f, -2.52f, 4.45f)
                curveToRelative(-1.02f, 0.97f, -2.87f, 2.17f, -4.49f, 2.48f)
                curveToRelative(-1.44f, 0.26f, -2.39f, -0.84f, -2.4f, -0.85f)
                curveToRelative(-0.42f, -0.4f, -0.57f, -0.99f, -0.39f, -1.54f)
                close()
            }
        }.also { _CirclePhoneFlip = it}
