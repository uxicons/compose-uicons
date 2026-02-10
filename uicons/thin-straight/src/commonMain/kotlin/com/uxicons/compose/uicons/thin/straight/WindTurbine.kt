package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindTurbine: ImageVector? = null

val Icons.Ts.WindTurbine: ImageVector
    get() = _WindTurbine ?: UXIcon(name = "WindTurbine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.49f, 14.71f)
                curveToRelative(-0.04f, -0.04f, -4.16f, -3.42f, -7.28f, -5.4f)
                curveToRelative(-0.39f, -3.68f, -1.58f, -8.87f, -1.59f, -8.92f)
                lineToRelative(-0.09f, -0.39f)
                horizontalLineToRelative(-3.07f)
                lineToRelative(-0.09f, 0.39f)
                curveToRelative(-0.01f, 0.05f, -1.2f, 5.24f, -1.59f, 8.92f)
                curveToRelative(-3.12f, 1.99f, -7.23f, 5.37f, -7.28f, 5.4f)
                lineToRelative(-0.31f, 0.25f)
                lineToRelative(1.37f, 2.75f)
                lineToRelative(0.39f, -0.09f)
                curveToRelative(0.22f, -0.05f, 5.1f, -1.23f, 8.55f, -2.5f)
                lineToRelative(-0.03f, 7.88f)
                horizontalLineToRelative(-4.53f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10.04f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.52f)
                lineToRelative(0.03f, -7.88f)
                curveToRelative(3.45f, 1.27f, 8.31f, 2.44f, 8.53f, 2.5f)
                lineToRelative(0.39f, 0.09f)
                lineToRelative(1.37f, -2.75f)
                lineToRelative(-0.31f, -0.25f)
                close()
                moveTo(20.89f, 16.55f)
                curveToRelative(-1.29f, -0.32f, -5.51f, -1.4f, -8.38f, -2.49f)
                lineToRelative(-0.51f, -0.2f)
                reflectiveCurveToRelative(-0.3f, 0.12f, -0.36f, 0.14f)
                curveToRelative(0f, 0f, -7.24f, 2.23f, -8.53f, 2.55f)
                lineToRelative(-0.66f, -1.32f)
                curveToRelative(1.04f, -0.84f, 4.47f, -3.58f, 7.07f, -5.21f)
                lineToRelative(0.21f, -0.13f)
                lineToRelative(0.02f, -0.24f)
                curveToRelative(0.3f, -3.06f, 1.22f, -7.35f, 1.51f, -8.65f)
                horizontalLineToRelative(1.47f)
                curveToRelative(0.29f, 1.3f, 1.21f, 5.59f, 1.51f, 8.65f)
                lineToRelative(0.02f, 0.24f)
                lineToRelative(0.21f, 0.13f)
                curveToRelative(2.6f, 1.63f, 6.03f, 4.37f, 7.07f, 5.21f)
                lineToRelative(-0.66f, 1.32f)
                close()
                moveTo(13f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _WindTurbine = it}
