package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleWarning: ImageVector? = null

val Icons.Tc.TriangleWarning: ImageVector
    get() = _TriangleWarning ?: UXIcon(name = "TriangleWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.99f, 20.25f)
                curveToRelative(-0.03f, -0.15f, -0.81f, -3.71f, -4.32f, -9.67f)
                curveToRelative(-3.38f, -5.74f, -6.04f, -8.19f, -6.34f, -8.45f)
                curveToRelative(-0.19f, -0.17f, -0.48f, -0.17f, -0.67f, 0f)
                curveToRelative(-0.29f, 0.26f, -2.96f, 2.71f, -6.34f, 8.45f)
                curveToRelative(-3.52f, 5.96f, -4.29f, 9.52f, -4.32f, 9.67f)
                curveToRelative(-0.05f, 0.25f, 0.09f, 0.5f, 0.33f, 0.58f)
                curveToRelative(0.15f, 0.05f, 3.66f, 1.17f, 10.66f, 1.17f)
                reflectiveCurveToRelative(10.51f, -1.13f, 10.66f, -1.17f)
                curveToRelative(0.24f, -0.08f, 0.39f, -0.33f, 0.33f, -0.58f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.43f, 0f, -8.75f, -0.7f, -9.89f, -1.0f)
                curveToRelative(0.32f, -1.13f, 1.37f, -4.3f, 4.08f, -8.92f)
                curveToRelative(2.72f, -4.61f, 4.98f, -7.07f, 5.81f, -7.89f)
                curveToRelative(0.83f, 0.82f, 3.09f, 3.28f, 5.81f, 7.89f)
                curveToRelative(2.72f, 4.61f, 3.77f, 7.79f, 4.08f, 8.92f)
                curveToRelative(-1.15f, 0.29f, -4.47f, 1.0f, -9.89f, 1.0f)
                close()
                moveTo(11.5f, 15.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(12.75f, 18.0f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
            }
        }.also { _TriangleWarning = it}
