package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Token: ImageVector? = null

val Icons.Rr.Token: ImageVector
    get() = _Token ?: UXIcon(name = "Token") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(12f, 4f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(16.15f, 10.48f)
                curveToRelative(0.1f, 0.28f, 0.01f, 0.59f, -0.21f, 0.78f)
                lineToRelative(-1.66f, 1.35f)
                lineToRelative(0.69f, 2.08f)
                curveToRelative(0.09f, 0.28f, 0f, 0.59f, -0.24f, 0.77f)
                curveToRelative(-0.24f, 0.18f, -0.56f, 0.19f, -0.81f, 0.03f)
                lineToRelative(-1.92f, -1.25f)
                lineToRelative(-1.89f, 1.27f)
                curveToRelative(-0.11f, 0.08f, -0.25f, 0.11f, -0.39f, 0.11f)
                verticalLineToRelative(-0.01f)
                curveToRelative(-0.14f, 0f, -0.3f, -0.05f, -0.42f, -0.14f)
                curveToRelative(-0.24f, -0.17f, -0.34f, -0.49f, -0.24f, -0.77f)
                lineToRelative(0.66f, -2.11f)
                lineToRelative(-1.66f, -1.35f)
                curveToRelative(-0.22f, -0.19f, -0.3f, -0.5f, -0.21f, -0.77f)
                reflectiveCurveToRelative(0.37f, -0.46f, 0.66f, -0.46f)
                horizontalLineToRelative(2.1f)
                lineToRelative(0.74f, -1.99f)
                curveToRelative(0.1f, -0.28f, 0.37f, -0.46f, 0.66f, -0.46f)
                reflectiveCurveToRelative(0.56f, 0.18f, 0.66f, 0.46f)
                lineToRelative(0.74f, 1.99f)
                horizontalLineToRelative(2.1f)
                curveToRelative(0.29f, 0f, 0.56f, 0.18f, 0.66f, 0.46f)
                close()
            }
        }.also { _Token = it}
