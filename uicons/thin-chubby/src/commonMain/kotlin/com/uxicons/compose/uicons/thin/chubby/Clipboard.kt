package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clipboard: ImageVector? = null

val Icons.Tc.Clipboard: ImageVector
    get() = _Clipboard ?: UXIcon(name = "Clipboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.84f, 4.31f)
                curveToRelative(-0.06f, -0.15f, -0.18f, -0.26f, -0.33f, -0.3f)
                curveToRelative(-0.06f, -0.02f, -1.49f, -0.42f, -3.8f, -0.69f)
                curveToRelative(-0.43f, -1.58f, -1.62f, -2.32f, -3.72f, -2.32f)
                reflectiveCurveToRelative(-3.29f, 0.74f, -3.72f, 2.32f)
                curveToRelative(-2.31f, 0.28f, -3.74f, 0.67f, -3.8f, 0.69f)
                curveToRelative(-0.15f, 0.04f, -0.27f, 0.15f, -0.33f, 0.3f)
                curveToRelative(-0.05f, 0.12f, -1.16f, 2.99f, -1.16f, 8.69f)
                reflectiveCurveToRelative(1.11f, 8.57f, 1.16f, 8.69f)
                curveToRelative(0.05f, 0.13f, 0.16f, 0.23f, 0.29f, 0.28f)
                curveToRelative(0.11f, 0.04f, 2.79f, 1.03f, 7.55f, 1.03f)
                reflectiveCurveToRelative(7.44f, -0.98f, 7.55f, -1.03f)
                curveToRelative(0.13f, -0.05f, 0.24f, -0.15f, 0.29f, -0.28f)
                curveToRelative(0.05f, -0.12f, 1.16f, -2.99f, 1.16f, -8.69f)
                reflectiveCurveToRelative(-1.11f, -8.57f, -1.16f, -8.69f)
                close()
                moveTo(18.99f, 21.11f)
                curveToRelative(-0.71f, 0.22f, -3.17f, 0.89f, -6.99f, 0.89f)
                reflectiveCurveToRelative(-6.28f, -0.67f, -6.99f, -0.89f)
                curveToRelative(-0.24f, -0.75f, -1.01f, -3.46f, -1.01f, -8.11f)
                curveToRelative(0f, -4.59f, 0.75f, -7.31f, 1.0f, -8.09f)
                curveToRelative(0.53f, -0.13f, 1.88f, -0.43f, 3.74f, -0.64f)
                curveToRelative(0.22f, -0.02f, 0.4f, -0.19f, 0.44f, -0.41f)
                curveToRelative(0.21f, -1.12f, 0.77f, -1.87f, 2.82f, -1.87f)
                reflectiveCurveToRelative(2.61f, 0.75f, 2.82f, 1.87f)
                curveToRelative(0.04f, 0.22f, 0.22f, 0.38f, 0.44f, 0.41f)
                curveToRelative(1.86f, 0.2f, 3.21f, 0.51f, 3.74f, 0.64f)
                curveToRelative(0.25f, 0.78f, 1.0f, 3.48f, 1.0f, 8.09f)
                reflectiveCurveToRelative(-0.77f, 7.36f, -1.01f, 8.11f)
                close()
            }
        }.also { _Clipboard = it}
