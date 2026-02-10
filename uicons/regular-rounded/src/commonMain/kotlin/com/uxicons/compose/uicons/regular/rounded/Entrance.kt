package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Entrance: ImageVector? = null

val Icons.Rr.Entrance: ImageVector
    get() = _Entrance ?: UXIcon(name = "Entrance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.41f, 15.41f)
                lineToRelative(-2.7f, 2.73f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.4f, -1.41f, 0.01f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                lineToRelative(1.72f, -1.73f)
                horizontalLineToRelative(-6.01f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-1.72f, -1.73f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.01f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.01f)
                lineToRelative(2.71f, 2.73f)
                curveToRelative(0.38f, 0.37f, 0.58f, 0.88f, 0.58f, 1.41f)
                reflectiveCurveToRelative(-0.21f, 1.04f, -0.59f, 1.42f)
                close()
                moveTo(17.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24f, 5.62f)
                verticalLineToRelative(15.38f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-18.0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(0.56f)
                curveToRelative(0.24f, -0.41f, 0.53f, -0.79f, 0.9f, -1.09f)
                curveToRelative(0.93f, -0.76f, 2.14f, -1.07f, 3.32f, -0.83f)
                lineToRelative(3.2f, 0.64f)
                curveToRelative(2.33f, 0.47f, 4.02f, 2.53f, 4.02f, 4.9f)
                close()
                moveTo(22f, 5.62f)
                curveToRelative(0f, -1.43f, -1.01f, -2.66f, -2.41f, -2.94f)
                lineToRelative(-3.2f, -0.64f)
                curveToRelative(-0.59f, -0.12f, -1.2f, 0.03f, -1.66f, 0.41f)
                curveToRelative(-0.47f, 0.38f, -0.73f, 0.94f, -0.73f, 1.55f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-15.38f)
                close()
            }
        }.also { _Entrance = it}
