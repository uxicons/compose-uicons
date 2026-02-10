package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Token: ImageVector? = null

val Icons.Sr.Token: ImageVector
    get() = _Token ?: UXIcon(name = "Token") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(15.95f, 11.26f)
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
                reflectiveCurveToRelative(0.01f, 0.59f, -0.21f, 0.78f)
                close()
            }
        }.also { _Token = it}
