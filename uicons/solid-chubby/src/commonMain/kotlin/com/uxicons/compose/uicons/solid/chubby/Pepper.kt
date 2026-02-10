package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pepper: ImageVector? = null

val Icons.Sc.Pepper: ImageVector
    get() = _Pepper ?: UXIcon(name = "Pepper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.7f, 7.86f)
                curveToRelative(-0.54f, -1.48f, -1.65f, -2.64f, -3.05f, -3.19f)
                curveToRelative(0.2f, -1.15f, -0.1f, -2.41f, -0.91f, -3.23f)
                curveToRelative(-0.58f, -0.58f, -1.5f, -0.58f, -2.09f, -0.0f)
                reflectiveCurveToRelative(-0.59f, 1.52f, -0.03f, 2.12f)
                curveToRelative(0.14f, 0.14f, 0.14f, 0.67f, 0f, 0.81f)
                curveToRelative(-0.02f, 0.02f, -0.04f, 0.04f, -0.06f, 0.06f)
                curveToRelative(-1.81f, 0.4f, -3.27f, 1.73f, -3.88f, 3.45f)
                curveToRelative(1.35f, 1.3f, 3.12f, 2.01f, 5.0f, 2.01f)
                curveToRelative(1.89f, 0f, 3.67f, -0.72f, 5.02f, -2.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.07f, 10.15f)
                curveToRelative(-1.56f, 1.13f, -3.43f, 1.74f, -5.39f, 1.74f)
                curveToRelative(-1.92f, 0f, -3.75f, -0.58f, -5.29f, -1.67f)
                curveToRelative(0.0f, 0.11f, 0.0f, 0.22f, 0.0f, 0.33f)
                curveToRelative(0.02f, 1.62f, 0.05f, 3.45f, -0.74f, 3.65f)
                curveToRelative(-0.94f, 0.25f, -2.47f, -1.03f, -3.59f, -1.96f)
                curveToRelative(-1.25f, -1.04f, -2.25f, -1.87f, -3.29f, -1.7f)
                curveToRelative(-1.06f, 0.17f, -2.09f, 1.15f, -1.8f, 3.42f)
                curveToRelative(0.49f, 3.85f, 4.29f, 9.03f, 10.01f, 9.03f)
                curveToRelative(0.31f, 0f, 0.62f, -0.01f, 0.93f, -0.04f)
                curveToRelative(5.99f, -0.58f, 9.38f, -5.35f, 9.16f, -12.8f)
                close()
            }
        }.also { _Pepper = it}
