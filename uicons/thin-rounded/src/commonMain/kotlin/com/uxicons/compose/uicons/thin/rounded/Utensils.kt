package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Utensils: ImageVector? = null

val Icons.Tr.Utensils: ImageVector
    get() = _Utensils ?: UXIcon(name = "Utensils") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.31f, -1.75f, 4.22f, -4f, 4.47f)
                verticalLineToRelative(11.53f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-11.53f)
                curveToRelative(-2.25f, -0.25f, -4f, -2.16f, -4f, -4.47f)
                lineTo(3f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.76f, 1.31f, 3.22f, 3f, 3.46f)
                lineTo(7f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(10.46f)
                curveToRelative(1.69f, -0.24f, 3f, -1.7f, 3f, -3.46f)
                lineTo(11f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(21f, 8.77f)
                curveToRelative(0f, 5.35f, -4.08f, 9.38f, -5f, 10.22f)
                verticalLineToRelative(4.51f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(15f, 1.87f)
                curveToRelative(0f, -0.84f, 0.52f, -1.54f, 1.33f, -1.79f)
                curveToRelative(0.8f, -0.24f, 1.61f, 0.05f, 2.08f, 0.74f)
                curveToRelative(1.29f, 1.93f, 2.59f, 5.28f, 2.59f, 7.94f)
                close()
                moveTo(20f, 8.77f)
                curveToRelative(0f, -2.44f, -1.25f, -5.63f, -2.42f, -7.39f)
                curveToRelative(-0.18f, -0.28f, -0.45f, -0.38f, -0.69f, -0.38f)
                curveToRelative(-0.09f, 0f, -0.18f, 0.01f, -0.27f, 0.04f)
                curveToRelative(-0.3f, 0.09f, -0.62f, 0.36f, -0.62f, 0.83f)
                verticalLineToRelative(15.7f)
                curveToRelative(1.38f, -1.47f, 4f, -4.79f, 4f, -8.81f)
                close()
            }
        }.also { _Utensils = it}
