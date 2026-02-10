package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walking: ImageVector? = null

val Icons.Sc.Walking: ImageVector
    get() = _Walking ?: UXIcon(name = "Walking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 3.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.05f, 11.0f)
                curveToRelative(-0.01f, -0.0f, -1.52f, -0.19f, -3.15f, -3.45f)
                curveToRelative(-0.03f, -0.06f, -0.13f, -0.2f, -0.15f, -0.22f)
                curveToRelative(-0.19f, -0.21f, -0.46f, -0.34f, -0.75f, -0.34f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.03f, 0f, -0.17f, 0.01f, -0.22f, 0.02f)
                curveToRelative(-0.5f, 0.11f, -3.03f, 0.72f, -4.02f, 1.8f)
                curveToRelative(-0.11f, 0.12f, -0.18f, 0.25f, -0.23f, 0.4f)
                lineToRelative(-1f, 3.5f)
                curveToRelative(-0.15f, 0.53f, 0.16f, 1.08f, 0.69f, 1.24f)
                curveToRelative(0.09f, 0.03f, 0.18f, 0.04f, 0.28f, 0.04f)
                curveToRelative(0.43f, 0f, 0.83f, -0.29f, 0.96f, -0.73f)
                lineToRelative(0.92f, -3.23f)
                curveToRelative(0.22f, -0.17f, 0.59f, -0.34f, 1.01f, -0.51f)
                curveToRelative(-0.42f, 1.55f, -0.55f, 3.2f, -0.39f, 5.04f)
                curveToRelative(0.03f, 0.39f, 0.29f, 0.72f, 0.65f, 0.85f)
                curveToRelative(0.02f, 0.01f, 1.7f, 0.64f, 3.22f, 1.84f)
                curveToRelative(1.2f, 0.95f, 2.62f, 2.54f, 2.62f, 4.72f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.19f, -1.02f, -4.22f, -2.94f, -5.91f)
                lineToRelative(0.61f, -5.19f)
                curveToRelative(1.67f, 2.02f, 3.13f, 2.1f, 3.33f, 2.1f)
                curveToRelative(0.55f, 0f, 1.02f, -0.45f, 1.02f, -1.0f)
                reflectiveCurveToRelative(-0.42f, -1f, -0.98f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.69f, 17.92f)
                lineToRelative(-2.5f, 3.5f)
                curveToRelative(-0.32f, 0.45f, -0.22f, 1.07f, 0.23f, 1.4f)
                curveToRelative(0.18f, 0.12f, 0.38f, 0.19f, 0.58f, 0.19f)
                curveToRelative(0.31f, 0f, 0.62f, -0.15f, 0.81f, -0.42f)
                lineToRelative(2.5f, -3.5f)
                curveToRelative(0.32f, -0.45f, 0.22f, -1.07f, -0.23f, -1.4f)
                curveToRelative(-0.45f, -0.32f, -1.07f, -0.22f, -1.4f, 0.23f)
                close()
            }
        }.also { _Walking = it}
