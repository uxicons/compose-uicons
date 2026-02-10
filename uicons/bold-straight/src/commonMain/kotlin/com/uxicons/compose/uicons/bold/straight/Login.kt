package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Login: ImageVector? = null

val Icons.Bs.Login: ImageVector
    get() = _Login ?: UXIcon(name = "Login") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.55f, 16.0f)
                lineToRelative(1.07f, 2.93f)
                curveToRelative(-0.37f, 0.04f, -0.74f, 0.07f, -1.12f, 0.07f)
                curveToRelative(-5.24f, 0f, -9.5f, -4.26f, -9.5f, -9.5f)
                reflectiveCurveToRelative(4.26f, -9.5f, 9.5f, -9.5f)
                reflectiveCurveToRelative(9.5f, 4.26f, 9.5f, 9.5f)
                curveToRelative(0f, 0.44f, -0.04f, 0.88f, -0.1f, 1.3f)
                lineToRelative(-2.92f, -1.06f)
                curveToRelative(0.0f, -0.08f, 0.02f, -0.16f, 0.02f, -0.24f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveToRelative(-6.5f, 2.92f, -6.5f, 6.5f)
                curveToRelative(0f, 1.84f, 0.77f, 3.5f, 2f, 4.68f)
                verticalLineToRelative(-0.18f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(1.58f)
                curveToRelative(-0.58f, 0.89f, -0.82f, 1.95f, -0.66f, 3f)
                horizontalLineToRelative(-0.43f)
                reflectiveCurveToRelative(-0.5f, 0f, -0.5f, 0.5f)
                verticalLineToRelative(1.32f)
                curveToRelative(0.48f, 0.12f, 0.98f, 0.18f, 1.5f, 0.18f)
                curveToRelative(0.02f, 0f, 0.04f, -0.0f, 0.05f, -0.0f)
                close()
                moveTo(20.27f, 18.3f)
                lineTo(23.56f, 21.59f)
                lineTo(21.44f, 23.71f)
                lineTo(18.15f, 20.42f)
                lineTo(14.59f, 23.98f)
                lineTo(11.02f, 14.17f)
                curveToRelative(-0.32f, -0.87f, -0.11f, -1.81f, 0.55f, -2.46f)
                curveToRelative(0.64f, -0.64f, 1.6f, -0.86f, 2.46f, -0.55f)
                lineToRelative(9.82f, 3.57f)
                lineToRelative(-3.57f, 3.57f)
                close()
                moveTo(15.79f, 18.53f)
                lineTo(18.39f, 15.94f)
                lineTo(14.31f, 14.46f)
                close()
                moveTo(7f, 7.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
            }
        }.also { _Login = it}
