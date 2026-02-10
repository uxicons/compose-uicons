package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Login: ImageVector? = null

val Icons.Rs.Login: ImageVector
    get() = _Login ?: UXIcon(name = "Login") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 22.59f)
                lineToRelative(-4.3f, -4.32f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(-9.74f, -3.54f)
                curveToRelative(-0.7f, -0.25f, -1.49f, -0.08f, -2.01f, 0.45f)
                curveToRelative(-0.53f, 0.53f, -0.7f, 1.3f, -0.45f, 2.01f)
                lineToRelative(3.54f, 9.74f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(4.3f, 4.32f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(13.0f, 13.02f)
                lineTo(19.68f, 15.45f)
                lineTo(15.46f, 19.67f)
                close()
                moveTo(6.5f, 7.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(11.5f, 7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(10.59f, 17.96f)
                lineTo(11.3f, 19.91f)
                curveToRelative(-0.43f, 0.06f, -0.86f, 0.09f, -1.3f, 0.09f)
                curveToRelative(-5.51f, 0f, -10.0f, -4.49f, -10.0f, -10f)
                reflectiveCurveToRelative(4.49f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 0.43f, -0.04f, 0.86f, -0.09f, 1.27f)
                lineToRelative(-1.94f, -0.7f)
                curveToRelative(0.01f, -0.19f, 0.03f, -0.38f, 0.03f, -0.57f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 3.59f, -8f, 8f)
                curveToRelative(0f, 2.02f, 0.76f, 3.86f, 2f, 5.27f)
                verticalLineToRelative(-0.27f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2.11f)
                curveToRelative(-0.15f, 0.65f, -0.14f, 1.33f, 0.06f, 2f)
                horizontalLineToRelative(-2.17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.92f)
                curveToRelative(1.18f, 0.68f, 2.54f, 1.08f, 4f, 1.08f)
                curveToRelative(0.2f, 0f, 0.4f, -0.03f, 0.59f, -0.04f)
                close()
            }
        }.also { _Login = it}
