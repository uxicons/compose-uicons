package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HammerCrash: ImageVector? = null

val Icons.Ts.HammerCrash: ImageVector
    get() = _HammerCrash ?: UXIcon(name = "HammerCrash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.54f, 13.11f)
                lineToRelative(0.79f, -0.62f)
                lineToRelative(1.85f, 2.36f)
                lineToRelative(-0.79f, 0.62f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.1f, 10.44f)
                lineToRelative(0.49f, -0.87f)
                lineToRelative(2.61f, 1.47f)
                lineToRelative(-0.49f, 0.87f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.91f, 7.37f)
                curveToRelative(0.36f, -0.74f, 0.05f, -1.64f, -0.69f, -2.0f)
                lineTo(8.32f, 0.55f)
                curveTo(5.6f, -0.77f, 2.3f, 0.37f, 0.97f, 3.1f)
                lineToRelative(-0.22f, 0.45f)
                lineToRelative(6.57f, 3.19f)
                lineTo(0f, 21.82f)
                lineToRelative(4.5f, 2.19f)
                lineToRelative(7.33f, -15.07f)
                lineToRelative(3.77f, 1.83f)
                curveToRelative(0.21f, 0.1f, 0.43f, 0.15f, 0.65f, 0.15f)
                curveToRelative(0.17f, 0f, 0.33f, -0.03f, 0.49f, -0.08f)
                curveToRelative(0.38f, -0.13f, 0.68f, -0.4f, 0.86f, -0.76f)
                lineToRelative(1.31f, -2.7f)
                close()
                moveTo(4.04f, 22.66f)
                lineToRelative(-2.7f, -1.31f)
                lineTo(8.23f, 7.18f)
                lineToRelative(2.7f, 1.31f)
                lineToRelative(-6.89f, 14.18f)
                close()
                moveTo(16.7f, 9.63f)
                curveToRelative(-0.06f, 0.12f, -0.16f, 0.21f, -0.28f, 0.25f)
                curveToRelative(-0.12f, 0.04f, -0.26f, 0.04f, -0.38f, -0.02f)
                lineTo(2.12f, 3.1f)
                curveTo(3.33f, 1.19f, 5.81f, 0.44f, 7.89f, 1.45f)
                lineToRelative(9.89f, 4.81f)
                curveToRelative(0.25f, 0.12f, 0.35f, 0.42f, 0.23f, 0.67f)
                lineToRelative(-1.31f, 2.7f)
                close()
            }
        }.also { _HammerCrash = it}
