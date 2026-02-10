package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSlash: ImageVector? = null

val Icons.Tr.ShieldSlash: ImageVector
    get() = _ShieldSlash ?: UXIcon(name = "ShieldSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.9f, 20.75f)
                curveToRelative(0.17f, 0.22f, 0.12f, 0.53f, -0.1f, 0.7f)
                curveToRelative(-1.68f, 1.25f, -3.33f, 2.0f, -4.17f, 2.33f)
                curveToRelative(0f, 0f, -0.39f, 0.21f, -0.63f, 0.21f)
                reflectiveCurveToRelative(-0.65f, -0.27f, -0.65f, -0.27f)
                curveToRelative(-2.19f, -1.1f, -9.35f, -5.19f, -9.35f, -11.8f)
                verticalLineToRelative(-5.43f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5.43f)
                curveToRelative(0f, 6.04f, 6.74f, 9.87f, 8.8f, 10.9f)
                lineToRelative(0.22f, 0.11f)
                lineToRelative(0.23f, -0.09f)
                curveToRelative(0.79f, -0.32f, 2.35f, -1.03f, 3.94f, -2.21f)
                curveToRelative(0.22f, -0.17f, 0.54f, -0.12f, 0.7f, 0.1f)
                close()
                moveTo(23.85f, 23.85f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(0.15f, 0.85f)
                curveTo(-0.05f, 0.66f, -0.05f, 0.34f, 0.15f, 0.15f)
                reflectiveCurveTo(0.66f, -0.05f, 0.85f, 0.15f)
                lineToRelative(2.89f, 2.89f)
                curveToRelative(0.45f, -0.36f, 0.95f, -0.64f, 1.49f, -0.82f)
                lineTo(11.84f, 0.03f)
                curveToRelative(0.1f, -0.03f, 0.21f, -0.03f, 0.31f, 0f)
                lineToRelative(6.61f, 2.19f)
                curveToRelative(1.94f, 0.64f, 3.24f, 2.44f, 3.24f, 4.48f)
                verticalLineToRelative(5.24f)
                curveToRelative(0f, 2.54f, -0.83f, 4.86f, -2.46f, 6.9f)
                lineToRelative(4.31f, 4.31f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(4.45f, 3.75f)
                lineToRelative(14.38f, 14.38f)
                curveToRelative(1.44f, -1.84f, 2.17f, -3.92f, 2.17f, -6.19f)
                verticalLineToRelative(-5.24f)
                curveToRelative(0f, -1.61f, -1.02f, -3.03f, -2.55f, -3.53f)
                lineToRelative(-6.45f, -2.14f)
                lineToRelative(-6.45f, 2.14f)
                curveToRelative(-0.4f, 0.13f, -0.77f, 0.33f, -1.1f, 0.58f)
                close()
            }
        }.also { _ShieldSlash = it}
