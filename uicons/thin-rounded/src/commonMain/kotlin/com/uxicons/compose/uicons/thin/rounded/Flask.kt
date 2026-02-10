package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flask: ImageVector? = null

val Icons.Tr.Flask: ImageVector
    get() = _Flask ?: UXIcon(name = "Flask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.03f, 10.13f)
                curveToRelative(-0.66f, -0.66f, -1.03f, -1.53f, -1.03f, -2.48f)
                lineTo(17f, 1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(5.5f, 0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6.66f)
                curveToRelative(0f, 0.94f, -0.36f, 1.82f, -1.03f, 2.48f)
                curveTo(3.74f, 12.33f, 0f, 16.57f, 0f, 20.21f)
                curveToRelative(0f, 0.79f, 0.21f, 1.51f, 0.63f, 2.14f)
                curveToRelative(0.68f, 1.03f, 1.88f, 1.65f, 3.21f, 1.65f)
                horizontalLineToRelative(16.33f)
                curveToRelative(1.33f, 0f, 2.53f, -0.61f, 3.21f, -1.65f)
                curveToRelative(0.41f, -0.63f, 0.63f, -1.35f, 0.63f, -2.14f)
                curveToRelative(0f, -3.65f, -3.74f, -7.88f, -5.97f, -10.08f)
                close()
                moveTo(22.54f, 21.8f)
                curveToRelative(-0.49f, 0.75f, -1.38f, 1.2f, -2.38f, 1.2f)
                lineTo(3.84f, 23.0f)
                curveToRelative(-0.99f, 0f, -1.88f, -0.45f, -2.38f, -1.2f)
                curveToRelative(-0.31f, -0.46f, -0.46f, -1.0f, -0.46f, -1.59f)
                curveToRelative(0f, -1.34f, 0.61f, -2.82f, 1.46f, -4.22f)
                curveToRelative(0.01f, 0f, 0.02f, 0.0f, 0.04f, 0.0f)
                horizontalLineToRelative(16f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.12f, 15.0f)
                curveToRelative(1.22f, -1.75f, 2.69f, -3.29f, 3.56f, -4.15f)
                curveToRelative(0.86f, -0.84f, 1.33f, -1.98f, 1.33f, -3.19f)
                lineTo(8f, 1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6.66f)
                curveToRelative(0f, 1.21f, 0.47f, 2.35f, 1.33f, 3.19f)
                curveToRelative(1.71f, 1.68f, 5.67f, 5.96f, 5.67f, 9.37f)
                curveToRelative(0f, 0.59f, -0.15f, 1.13f, -0.46f, 1.59f)
                close()
            }
        }.also { _Flask = it}
