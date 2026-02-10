package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walking: ImageVector? = null

val Icons.Rc.Walking: ImageVector
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
                curveToRelative(-0.0f, -0.01f, -0.09f, -0.15f, -0.15f, -0.22f)
                curveToRelative(-0.19f, -0.21f, -0.46f, -0.34f, -0.75f, -0.34f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.33f, 0f, -3.25f, 0.75f, -4.24f, 1.82f)
                curveToRelative(-0.11f, 0.12f, -0.18f, 0.25f, -0.23f, 0.4f)
                lineToRelative(-1f, 3.5f)
                curveToRelative(-0.15f, 0.53f, 0.16f, 1.08f, 0.69f, 1.24f)
                reflectiveCurveToRelative(1.08f, -0.16f, 1.24f, -0.69f)
                lineToRelative(0.92f, -3.23f)
                curveToRelative(0.22f, -0.17f, 0.58f, -0.34f, 1.01f, -0.51f)
                curveToRelative(-0.42f, 1.55f, -0.54f, 3.2f, -0.39f, 5.04f)
                curveToRelative(0.03f, 0.38f, 0.28f, 0.71f, 0.64f, 0.85f)
                curveToRelative(0.06f, 0.02f, 5.86f, 2.3f, 5.86f, 6.57f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.54f, -1.39f, -4.48f, -2.95f, -5.86f)
                lineToRelative(0.62f, -5.24f)
                curveToRelative(1.67f, 2.02f, 3.13f, 2.1f, 3.33f, 2.1f)
                curveToRelative(0.55f, 0f, 1.02f, -0.45f, 1.02f, -1.0f)
                reflectiveCurveToRelative(-0.42f, -1f, -0.98f, -1f)
                close()
                moveTo(10.46f, 13.82f)
                curveToRelative(-0.09f, -1.79f, 0.14f, -3.35f, 0.71f, -4.83f)
                horizontalLineToRelative(1.71f)
                lineToRelative(-0.68f, 5.77f)
                curveToRelative(-0.69f, -0.43f, -1.31f, -0.75f, -1.74f, -0.95f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.08f, 17.69f)
                curveToRelative(-0.45f, -0.32f, -1.07f, -0.22f, -1.4f, 0.23f)
                lineToRelative(-2.5f, 3.5f)
                curveToRelative(-0.32f, 0.45f, -0.22f, 1.07f, 0.23f, 1.4f)
                curveToRelative(0.18f, 0.12f, 0.38f, 0.19f, 0.58f, 0.19f)
                curveToRelative(0.31f, 0f, 0.62f, -0.15f, 0.81f, -0.42f)
                lineToRelative(2.5f, -3.5f)
                curveToRelative(0.32f, -0.45f, 0.22f, -1.07f, -0.23f, -1.4f)
                close()
            }
        }.also { _Walking = it}
