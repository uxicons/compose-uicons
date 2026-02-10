package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Analyse: ImageVector? = null

val Icons.Ts.Analyse: ImageVector
    get() = _Analyse ?: UXIcon(name = "Analyse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.27f, 23.98f)
                lineToRelative(-6.57f, -6.57f)
                curveToRelative(-1.77f, 1.61f, -4.12f, 2.6f, -6.7f, 2.6f)
                curveTo(4.49f, 20f, 0f, 15.51f, 0f, 10f)
                reflectiveCurveTo(4.49f, 0f, 10f, 0f)
                curveToRelative(2.49f, 0f, 4.76f, 0.92f, 6.51f, 2.42f)
                lineToRelative(-0.66f, 0.75f)
                curveToRelative(-1.58f, -1.35f, -3.62f, -2.18f, -5.85f, -2.18f)
                curveTo(5.04f, 1f, 1f, 5.04f, 1f, 10f)
                curveToRelative(0f, 1.63f, 0.45f, 3.16f, 1.21f, 4.49f)
                lineToRelative(5.76f, -6.73f)
                lineToRelative(3.5f, 3.5f)
                lineTo(21.12f, 0.17f)
                lineToRelative(0.75f, 0.66f)
                lineToRelative(-10.36f, 11.9f)
                lineToRelative(-3.5f, -3.5f)
                lineToRelative(-5.24f, 6.12f)
                curveToRelative(1.64f, 2.21f, 4.26f, 3.65f, 7.22f, 3.65f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -0.84f, -0.12f, -1.65f, -0.34f, -2.43f)
                lineToRelative(0.77f, -0.88f)
                curveToRelative(0.37f, 1.04f, 0.57f, 2.15f, 0.57f, 3.31f)
                curveToRelative(0f, 2.58f, -0.99f, 4.92f, -2.6f, 6.7f)
                lineToRelative(6.57f, 6.57f)
                lineToRelative(-0.71f, 0.71f)
                close()
            }
        }.also { _Analyse = it}
