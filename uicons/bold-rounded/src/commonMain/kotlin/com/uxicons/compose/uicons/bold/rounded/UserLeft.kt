package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLeft: ImageVector? = null

val Icons.Br.UserLeft: ImageVector
    get() = _UserLeft ?: UXIcon(name = "UserLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.9f, 22.25f)
            curveToRelative(0.14f, 0.82f, -0.41f, 1.59f, -1.23f, 1.73f)
            curveToRelative(-0.8f, 0.14f, -1.59f, -0.41f, -1.73f, -1.23f)
            curveToRelative(-0.37f, -2.17f, -2.25f, -3.75f, -4.48f, -3.75f)
            reflectiveCurveToRelative(-4.11f, 1.58f, -4.48f, 3.75f)
            curveToRelative(-0.14f, 0.82f, -0.91f, 1.36f, -1.73f, 1.23f)
            curveToRelative(-0.82f, -0.14f, -1.37f, -0.91f, -1.23f, -1.73f)
            curveToRelative(0.61f, -3.62f, 3.74f, -6.25f, 7.44f, -6.25f)
            reflectiveCurveToRelative(6.83f, 2.63f, 7.44f, 6.25f)
            close()
            moveTo(2f, 8.5f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
            reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveToRelative(-5.5f, -2.47f, -5.5f, -5.5f)
            close()
            moveTo(5f, 8.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            close()
            moveTo(22.5f, 3f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-1.56f)
            curveToRelative(0f, -0.86f, -1.04f, -1.29f, -1.65f, -0.69f)
            lineToRelative(-3.06f, 3.06f)
            curveToRelative(-0.38f, 0.38f, -0.38f, 0.99f, 0f, 1.37f)
            lineToRelative(3.06f, 3.06f)
            curveToRelative(0.61f, 0.61f, 1.65f, 0.18f, 1.65f, -0.69f)
            verticalLineToRelative(-1.56f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _UserLeft = it }
