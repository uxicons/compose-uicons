package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SessionTimeout: ImageVector? = null

val Icons.Sr.SessionTimeout: ImageVector
    get() = _SessionTimeout ?: UXIcon(name = "SessionTimeout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 0f)
                curveToRelative(-6.08f, 0f, -11f, 4.92f, -11f, 11f)
                curveToRelative(0f, 5.45f, 3.96f, 9.96f, 9.16f, 10.83f)
                curveToRelative(0.07f, -0.45f, 0.22f, -0.88f, 0.46f, -1.29f)
                lineToRelative(4.81f, -8.24f)
                curveToRelative(0.66f, -1.13f, 1.83f, -1.8f, 3.13f, -1.8f)
                reflectiveCurveToRelative(2.48f, 0.67f, 3.13f, 1.8f)
                lineToRelative(0.91f, 1.57f)
                curveToRelative(0.25f, -0.92f, 0.39f, -1.87f, 0.39f, -2.87f)
                curveToRelative(-0.0f, -6.08f, -4.93f, -11.0f, -11.0f, -11.0f)
                close()
                moveTo(12f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(16.15f, 13.31f)
                lineTo(11.35f, 21.55f)
                curveToRelative(-0.63f, 1.09f, 0.15f, 2.45f, 1.41f, 2.45f)
                horizontalLineToRelative(9.62f)
                curveToRelative(1.26f, 0f, 2.04f, -1.36f, 1.41f, -2.45f)
                lineToRelative(-4.81f, -8.24f)
                curveToRelative(-0.63f, -1.08f, -2.19f, -1.08f, -2.81f, 0f)
                close()
                moveTo(17.56f, 23f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(16.56f, 19f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _SessionTimeout = it}
