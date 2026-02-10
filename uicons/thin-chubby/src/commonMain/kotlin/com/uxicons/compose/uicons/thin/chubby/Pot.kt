package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pot: ImageVector? = null

val Icons.Tc.Pot: ImageVector
    get() = _Pot ?: UXIcon(name = "Pot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.6f, 5.74f)
                curveToRelative(-0.05f, -0.01f, -4.68f, -0.96f, -10.1f, -1.02f)
                verticalLineToRelative(-1.99f)
                horizontalLineToRelative(2.11f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.22f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.11f)
                verticalLineToRelative(1.99f)
                curveToRelative(-5.42f, 0.06f, -10.05f, 1.01f, -10.1f, 1.02f)
                curveToRelative(-0.27f, 0.06f, -0.44f, 0.32f, -0.39f, 0.59f)
                curveToRelative(0.05f, 0.23f, 0.26f, 0.4f, 0.49f, 0.4f)
                curveToRelative(0.03f, 0f, 0.07f, -0.0f, 0.1f, -0.01f)
                curveToRelative(0.01f, -0.0f, 0.26f, -0.05f, 0.69f, -0.13f)
                lineToRelative(-0.1f, 14.01f)
                curveToRelative(-0.0f, 0.23f, 0.15f, 0.43f, 0.37f, 0.49f)
                curveToRelative(0.18f, 0.05f, 4.47f, 1.18f, 9.44f, 1.18f)
                reflectiveCurveToRelative(9.26f, -1.14f, 9.44f, -1.18f)
                curveToRelative(0.22f, -0.06f, 0.37f, -0.26f, 0.37f, -0.49f)
                lineToRelative(-0.1f, -14.01f)
                curveToRelative(0.44f, 0.08f, 0.68f, 0.13f, 0.69f, 0.13f)
                curveToRelative(0.28f, 0.06f, 0.54f, -0.12f, 0.59f, -0.39f)
                curveToRelative(0.06f, -0.27f, -0.12f, -0.54f, -0.39f, -0.59f)
                close()
                moveTo(20.8f, 20.21f)
                curveToRelative(-1.15f, 0.27f, -4.79f, 1.06f, -8.8f, 1.06f)
                reflectiveCurveToRelative(-7.65f, -0.78f, -8.8f, -1.06f)
                lineToRelative(0.1f, -13.79f)
                curveToRelative(1.89f, -0.3f, 5.15f, -0.71f, 8.7f, -0.71f)
                reflectiveCurveToRelative(6.81f, 0.41f, 8.7f, 0.71f)
                lineToRelative(0.1f, 13.79f)
                close()
            }
        }.also { _Pot = it}
