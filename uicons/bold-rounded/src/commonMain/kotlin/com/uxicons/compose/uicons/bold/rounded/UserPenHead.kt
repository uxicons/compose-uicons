package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPenHead: ImageVector? = null

val Icons.Br.UserPenHead: ImageVector
    get() = _UserPenHead ?: UXIcon(name = "UserPenHead") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 14.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(14.5f, 13f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(21f, 10.13f)
            verticalLineToRelative(-0.63f)
            curveToRelative(0f, -1.62f, -1.29f, -2.5f, -2.5f, -2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.65f, 0.42f, 1.21f, 1f, 1.42f)
            verticalLineToRelative(1.58f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.53f)
            curveToRelative(0.54f, 0.02f, 0.97f, 0.46f, 0.97f, 1f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-0.75f)
            curveToRelative(-0.71f, 0f, -1.32f, 0.49f, -1.47f, 1.19f)
            curveToRelative(-0.64f, 2.97f, -3.5f, 4.81f, -5.78f, 4.81f)
            reflectiveCurveToRelative(-5.15f, -1.84f, -5.79f, -4.81f)
            curveToRelative(-0.15f, -0.69f, -0.76f, -1.19f, -1.47f, -1.19f)
            horizontalLineToRelative(-0.75f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            curveToRelative(0f, -0.54f, 0.42f, -0.98f, 0.91f, -1f)
            horizontalLineToRelative(0.59f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.58f)
            curveToRelative(0.54f, -0.19f, 0.95f, -0.69f, 1.0f, -1.3f)
            curveToRelative(0.06f, -0.83f, -0.55f, -1.55f, -1.38f, -1.61f)
            curveToRelative(-0.52f, -0.05f, -1.29f, 0.1f, -1.86f, 0.64f)
            curveToRelative(-0.34f, 0.32f, -0.75f, 0.89f, -0.75f, 1.82f)
            verticalLineToRelative(0.66f)
            curveToRelative(-1.74f, 0.44f, -3f, 2.01f, -3f, 3.88f)
            curveToRelative(0f, 2.08f, 1.59f, 3.79f, 3.62f, 3.98f)
            curveToRelative(1.28f, 3.46f, 4.75f, 6.02f, 8.38f, 6.02f)
            reflectiveCurveToRelative(7.09f, -2.56f, 8.38f, -6.02f)
            curveToRelative(2.03f, -0.19f, 3.62f, -1.9f, 3.62f, -3.98f)
            curveToRelative(0f, -1.86f, -1.25f, -3.41f, -3f, -3.87f)
            close()
            moveTo(9.45f, 9.08f)
            curveToRelative(0.34f, 0.57f, 0.95f, 0.92f, 1.62f, 0.92f)
            horizontalLineToRelative(1.86f)
            curveToRelative(0.66f, 0f, 1.28f, -0.35f, 1.62f, -0.92f)
            lineToRelative(1.07f, -1.8f)
            curveToRelative(0.49f, -0.79f, 0.51f, -1.78f, 0.04f, -2.59f)
            lineTo(13f, 0.0f)
            verticalLineToRelative(4.0f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            lineTo(11f, 0f)
            reflectiveCurveToRelative(-2.66f, 4.69f, -2.66f, 4.69f)
            curveToRelative(-0.47f, 0.8f, -0.45f, 1.8f, 0.04f, 2.59f)
            lineToRelative(1.07f, 1.8f)
            close()
        }
    }.also { _UserPenHead = it }
