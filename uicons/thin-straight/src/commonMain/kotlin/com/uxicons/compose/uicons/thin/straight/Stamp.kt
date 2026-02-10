package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stamp: ImageVector? = null

val Icons.Ts.Stamp: ImageVector
    get() = _Stamp ?: UXIcon(name = "Stamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                lineTo(2f, 24f)
                verticalLineToRelative(-1f)
                lineTo(22f, 23f)
                verticalLineToRelative(1f)
                close()
                moveTo(24f, 16.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.44f, 0f, -0.84f, -0.18f, -1.13f, -0.52f)
                curveToRelative(-0.29f, -0.34f, -0.42f, -0.79f, -0.35f, -1.23f)
                curveToRelative(0.65f, -4.29f, 0.98f, -7.07f, 0.98f, -8.25f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.83f, 0.21f, 2.35f, 0.47f, 4.27f)
                curveToRelative(0.16f, 1.2f, 0.35f, 2.55f, 0.51f, 3.96f)
                curveToRelative(0.06f, 0.47f, -0.09f, 0.94f, -0.39f, 1.28f)
                curveToRelative(-0.28f, 0.31f, -0.66f, 0.48f, -1.08f, 0.48f)
                lineTo(2.5f, 14f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                lineTo(24f, 21f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(1f, 16.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(7.5f, 15f)
                curveToRelative(0.71f, 0f, 1.36f, -0.29f, 1.83f, -0.82f)
                curveToRelative(0.49f, -0.55f, 0.72f, -1.31f, 0.64f, -2.06f)
                curveToRelative(-0.16f, -1.42f, -0.35f, -2.77f, -0.51f, -3.98f)
                curveToRelative(-0.26f, -1.88f, -0.46f, -3.37f, -0.46f, -4.14f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.12f, -0.33f, 3.92f, -0.97f, 8.1f)
                curveToRelative(-0.11f, 0.73f, 0.1f, 1.48f, 0.58f, 2.04f)
                curveToRelative(0.47f, 0.55f, 1.16f, 0.86f, 1.89f, 0.86f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(1f, 20f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }.also { _Stamp = it}
