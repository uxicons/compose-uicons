package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dinner: ImageVector? = null

val Icons.Tc.Dinner: ImageVector
    get() = _Dinner ?: UXIcon(name = "Dinner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.13f, -0.05f, 0.26f, -0.15f, 0.35f)
                lineToRelative(-2.5f, 2.5f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(2.35f, -2.35f)
                verticalLineToRelative(-4.29f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(19f, 11.97f)
                verticalLineToRelative(10.53f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-10.53f)
                curveToRelative(-2.78f, -0.15f, -4f, -1.5f, -4f, -4.47f)
                curveToRelative(0f, -3.23f, 1.39f, -6.5f, 4.5f, -6.5f)
                reflectiveCurveToRelative(4.5f, 3.27f, 4.5f, 6.5f)
                curveToRelative(0f, 2.98f, -1.22f, 4.33f, -4f, 4.47f)
                close()
                moveTo(22f, 7.5f)
                curveToRelative(0f, -2.04f, -0.74f, -5.5f, -3.5f, -5.5f)
                reflectiveCurveToRelative(-3.5f, 3.46f, -3.5f, 5.5f)
                curveToRelative(0f, 2.58f, 0.92f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -0.92f, 3.5f, -3.5f)
                close()
                moveTo(15.3f, 19.72f)
                curveToRelative(-1.22f, 0.52f, -2.79f, 0.78f, -4.8f, 0.78f)
                curveToRelative(-6.12f, 0f, -8.5f, -2.38f, -8.5f, -8.5f)
                reflectiveCurveToRelative(2.38f, -8.5f, 8.5f, -8.5f)
                curveToRelative(0.7f, 0f, 1.35f, 0.03f, 1.95f, 0.09f)
                curveToRelative(0.28f, 0.03f, 0.52f, -0.17f, 0.55f, -0.45f)
                curveToRelative(0.03f, -0.28f, -0.17f, -0.52f, -0.45f, -0.55f)
                curveToRelative(-0.63f, -0.07f, -1.32f, -0.1f, -2.05f, -0.1f)
                curveToRelative(-6.75f, 0f, -9.5f, 2.75f, -9.5f, 9.5f)
                reflectiveCurveToRelative(2.75f, 9.5f, 9.5f, 9.5f)
                curveToRelative(2.15f, 0f, 3.85f, -0.28f, 5.2f, -0.86f)
                curveToRelative(0.25f, -0.11f, 0.37f, -0.4f, 0.26f, -0.66f)
                curveToRelative(-0.11f, -0.25f, -0.4f, -0.37f, -0.66f, -0.26f)
                close()
            }
        }.also { _Dinner = it}
