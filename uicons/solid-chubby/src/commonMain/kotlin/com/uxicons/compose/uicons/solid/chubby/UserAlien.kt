package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAlien: ImageVector? = null

val Icons.Sc.UserAlien: ImageVector
    get() = _UserAlien ?: UXIcon(name = "UserAlien") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.53f, 0f, -8f, 2.47f, -8f, 8f)
                curveToRelative(0f, 5.45f, 7.12f, 10.6f, 7.42f, 10.81f)
                curveToRelative(0.17f, 0.12f, 0.38f, 0.19f, 0.58f, 0.19f)
                reflectiveCurveToRelative(0.41f, -0.06f, 0.58f, -0.19f)
                curveToRelative(0.3f, -0.22f, 7.42f, -5.36f, 7.42f, -10.81f)
                curveToRelative(0f, -5.53f, -2.47f, -8f, -8f, -8f)
                close()
                moveTo(10.13f, 11.0f)
                curveToRelative(-0.72f, -0.04f, -1.74f, -0.21f, -2.33f, -0.8f)
                reflectiveCurveToRelative(-0.76f, -1.61f, -0.8f, -2.33f)
                curveToRelative(-0.03f, -0.48f, 0.37f, -0.88f, 0.85f, -0.85f)
                curveToRelative(0.72f, 0.04f, 1.74f, 0.21f, 2.33f, 0.8f)
                reflectiveCurveToRelative(0.76f, 1.61f, 0.8f, 2.33f)
                curveToRelative(0.03f, 0.48f, -0.37f, 0.88f, -0.85f, 0.85f)
                close()
                moveTo(16.2f, 10.2f)
                curveToRelative(-0.59f, 0.59f, -1.61f, 0.76f, -2.34f, 0.8f)
                curveToRelative(-0.48f, 0.03f, -0.88f, -0.37f, -0.86f, -0.86f)
                curveToRelative(0.04f, -0.73f, 0.21f, -1.74f, 0.8f, -2.34f)
                reflectiveCurveToRelative(1.61f, -0.76f, 2.34f, -0.8f)
                curveToRelative(0.48f, -0.03f, 0.88f, 0.37f, 0.86f, 0.86f)
                curveToRelative(-0.04f, 0.73f, -0.21f, 1.74f, -0.8f, 2.34f)
                close()
                moveTo(19.43f, 15.82f)
                curveToRelative(1.06f, 1.44f, 1.57f, 3.47f, 1.57f, 6.18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.71f, 0.51f, -4.74f, 1.57f, -6.18f)
                curveToRelative(2.23f, 3.08f, 5.17f, 5.25f, 5.69f, 5.62f)
                curveToRelative(0.51f, 0.36f, 1.11f, 0.56f, 1.74f, 0.56f)
                reflectiveCurveToRelative(1.23f, -0.19f, 1.74f, -0.56f)
                curveToRelative(0.52f, -0.37f, 3.46f, -2.54f, 5.69f, -5.62f)
                close()
            }
        }.also { _UserAlien = it}
