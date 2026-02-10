package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtTankTop: ImageVector? = null

val Icons.Sc.ShirtTankTop: ImageVector
    get() = _ShirtTankTop ?: UXIcon(name = "ShirtTankTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 12.08f)
                curveToRelative(0f, 6.18f, -0.75f, 9.26f, -0.78f, 9.39f)
                curveToRelative(-0.08f, 0.34f, -0.34f, 0.6f, -0.67f, 0.71f)
                curveToRelative(-0.1f, 0.03f, -2.58f, 0.81f, -6.56f, 0.81f)
                reflectiveCurveToRelative(-6.45f, -0.78f, -6.56f, -0.81f)
                curveToRelative(-0.33f, -0.11f, -0.58f, -0.38f, -0.67f, -0.71f)
                curveToRelative(-0.03f, -0.13f, -0.78f, -3.22f, -0.78f, -9.39f)
                curveToRelative(0f, -0.92f, 0.02f, -1.35f, 0.05f, -2.12f)
                curveToRelative(0.02f, -0.49f, 0.39f, -0.9f, 0.87f, -0.96f)
                curveToRelative(0.52f, -0.07f, 2.08f, -0.27f, 2.08f, -3.51f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.39f)
                curveToRelative(0.06f, 0.63f, 0.41f, 1.11f, 2f, 1.11f)
                reflectiveCurveToRelative(1.94f, -0.48f, 2f, -1.11f)
                verticalLineToRelative(-2.39f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 3.24f, 1.57f, 3.44f, 2.08f, 3.51f)
                curveToRelative(0.48f, 0.06f, 0.85f, 0.47f, 0.87f, 0.96f)
                curveToRelative(0.03f, 0.77f, 0.05f, 1.2f, 0.05f, 2.12f)
                close()
            }
        }.also { _ShirtTankTop = it}
