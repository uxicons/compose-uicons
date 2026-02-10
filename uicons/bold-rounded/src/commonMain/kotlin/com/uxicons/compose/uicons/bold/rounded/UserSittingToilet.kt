package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSittingToilet: ImageVector? = null

val Icons.Br.UserSittingToilet: ImageVector
    get() = _UserSittingToilet ?: UXIcon(name = "UserSittingToilet") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 18f)
            curveToRelative(0f, 1.61f, -2.06f, 4f, -5f, 4f)
            curveToRelative(-0.77f, 0f, -1.45f, 0.44f, -1.78f, 1.08f)
            curveToRelative(-0.28f, 0.54f, -0.78f, 0.92f, -1.38f, 0.92f)
            horizontalLineToRelative(-3.34f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(9.0f)
            curveToRelative(1f, 0f, 1f, 1f, 1f, 1f)
            close()
            moveTo(16.5f, 5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveTo(19.66f, 13.51f)
            curveToRelative(-0.51f, -0.36f, -1.14f, -0.51f, -1.77f, -0.51f)
            horizontalLineToRelative(-3.73f)
            reflectiveCurveToRelative(1.26f, -3.23f, 1.26f, -3.23f)
            lineToRelative(2.57f, 2.34f)
            curveToRelative(0.61f, 0.56f, 1.56f, 0.52f, 2.12f, -0.1f)
            curveToRelative(0.56f, -0.61f, 0.52f, -1.56f, -0.1f, -2.12f)
            lineToRelative(-4.64f, -4.23f)
            reflectiveCurveToRelative(-0.01f, -0.01f, -0.02f, -0.01f)
            curveToRelative(-0.51f, -0.47f, -1.23f, -0.74f, -2.04f, -0.62f)
            curveToRelative(-0.88f, 0.13f, -1.61f, 0.78f, -1.93f, 1.61f)
            lineToRelative(-2.12f, 5.46f)
            curveToRelative(-0.45f, 0.98f, -0.3f, 2.12f, 0.42f, 2.96f)
            curveToRelative(0.55f, 0.64f, 1.39f, 0.94f, 2.22f, 0.94f)
            curveToRelative(0.14f, -0.0f, 6.1f, 0f, 6.1f, 0f)
            lineToRelative(-1.28f, 6.12f)
            curveToRelative(-0.23f, 0.94f, 0.5f, 1.91f, 1.46f, 1.88f)
            curveToRelative(0.69f, 0f, 1.32f, -0.48f, 1.47f, -1.19f)
            lineToRelative(1.3f, -6.15f)
            curveToRelative(0.25f, -1.19f, -0.22f, -2.42f, -1.27f, -3.15f)
            close()
        }
    }.also { _UserSittingToilet = it }
