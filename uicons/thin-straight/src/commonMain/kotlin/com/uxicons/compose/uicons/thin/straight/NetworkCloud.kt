package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NetworkCloud: ImageVector? = null

val Icons.Ts.NetworkCloud: ImageVector
    get() = _NetworkCloud ?: UXIcon(name = "NetworkCloud") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                horizontalLineToRelative(-9.55f)
                curveToRelative(-0.2f, -0.98f, -0.97f, -1.75f, -1.95f, -1.95f)
                verticalLineToRelative(-5.05f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -2.47f, -1.77f, -4.52f, -4.19f, -4.91f)
                curveToRelative(-0.63f, -2.39f, -2.81f, -4.09f, -5.31f, -4.09f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                curveToRelative(0f, 0.21f, 0.01f, 0.42f, 0.04f, 0.63f)
                curveToRelative(-1.76f, 0.43f, -3.04f, 2.01f, -3.04f, 3.87f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(5.05f)
                curveToRelative(-0.98f, 0.2f, -1.75f, 0.97f, -1.95f, 1.95f)
                lineTo(0f, 21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(9.55f)
                curveToRelative(0.23f, 1.14f, 1.24f, 2f, 2.45f, 2f)
                reflectiveCurveToRelative(2.22f, -0.86f, 2.45f, -2f)
                horizontalLineToRelative(9.55f)
                verticalLineToRelative(-1f)
                close()
                moveTo(7f, 13f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -1.52f, 1.15f, -2.79f, 2.67f, -2.96f)
                lineToRelative(0.55f, -0.06f)
                lineToRelative(-0.11f, -0.54f)
                curveToRelative(-0.07f, -0.31f, -0.1f, -0.63f, -0.1f, -0.94f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                curveToRelative(2.15f, 0f, 4.0f, 1.53f, 4.41f, 3.64f)
                lineToRelative(0.07f, 0.37f)
                lineToRelative(0.37f, 0.03f)
                curveToRelative(2.08f, 0.19f, 3.64f, 1.89f, 3.64f, 3.96f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(7f, 13.0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _NetworkCloud = it}
