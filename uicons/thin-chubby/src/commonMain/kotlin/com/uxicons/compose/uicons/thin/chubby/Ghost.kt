package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ghost: ImageVector? = null

val Icons.Tc.Ghost: ImageVector
    get() = _Ghost ?: UXIcon(name = "Ghost") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.75f, 10f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
                moveTo(21f, 10f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, 0.27f, -0.21f, 0.49f, -0.48f, 0.5f)
                curveToRelative(-0.28f, 0.03f, -0.5f, -0.19f, -0.52f, -0.45f)
                curveToRelative(-0.09f, -0.93f, -0.46f, -1.55f, -2.0f, -1.55f)
                curveToRelative(-1.48f, 0f, -2f, 0.52f, -2f, 2f)
                lineToRelative(-0.01f, 0.52f)
                curveToRelative(-0.01f, 0.27f, -0.23f, 0.48f, -0.49f, 0.48f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.26f, 0f, -0.48f, -0.2f, -0.5f, -0.47f)
                curveToRelative(-0.11f, -1.85f, -0.92f, -2.53f, -2.99f, -2.53f)
                reflectiveCurveToRelative(-2.87f, 0.69f, -2.99f, 2.53f)
                curveToRelative(-0.02f, 0.26f, -0.23f, 0.47f, -0.5f, 0.47f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.27f, -0.01f, -0.48f, -0.22f, -0.49f, -0.48f)
                lineToRelative(-0.01f, -0.5f)
                curveToRelative(0f, -1.49f, -0.52f, -2.02f, -2f, -2.02f)
                curveToRelative(-1.54f, 0f, -1.92f, 0.62f, -2.0f, 1.55f)
                curveToRelative(-0.02f, 0.27f, -0.26f, 0.48f, -0.52f, 0.45f)
                curveToRelative(-0.27f, -0.01f, -0.48f, -0.23f, -0.48f, -0.5f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -6.31f, 2.69f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.69f, 9f, 9f)
                close()
                moveTo(20f, 10f)
                curveToRelative(0f, -5.83f, -2.17f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 2.17f, -8f, 8f)
                verticalLineToRelative(9.52f)
                curveToRelative(0.49f, -0.34f, 1.16f, -0.52f, 2f, -0.52f)
                curveToRelative(1.34f, 0f, 2.22f, 0.43f, 2.66f, 1.31f)
                curveToRelative(0.63f, -0.89f, 1.72f, -1.31f, 3.34f, -1.31f)
                reflectiveCurveToRelative(2.71f, 0.41f, 3.34f, 1.3f)
                curveToRelative(0.44f, -0.87f, 1.32f, -1.3f, 2.66f, -1.3f)
                curveToRelative(0.84f, 0f, 1.51f, 0.17f, 2f, 0.52f)
                close()
                moveTo(15f, 9.25f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                close()
            }
        }.also { _Ghost = it}
