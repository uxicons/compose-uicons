package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eyes: ImageVector? = null

val Icons.Bs.Eyes: ImageVector
    get() = _Eyes ?: UXIcon(name = "Eyes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.25f, 0f)
                curveToRelative(-2.17f, 0f, -4.03f, 1.64f, -5.25f, 4.28f)
                curveTo(10.78f, 1.64f, 8.92f, 0f, 6.75f, 0f)
                curveTo(2.9f, 0f, 0f, 5.16f, 0f, 12f)
                reflectiveCurveToRelative(2.9f, 12f, 6.75f, 12f)
                curveToRelative(2.17f, 0f, 4.03f, -1.64f, 5.25f, -4.28f)
                curveToRelative(1.22f, 2.65f, 3.08f, 4.28f, 5.25f, 4.28f)
                curveToRelative(3.85f, 0f, 6.75f, -5.16f, 6.75f, -12f)
                reflectiveCurveTo(21.1f, 0f, 17.25f, 0f)
                close()
                moveTo(6.75f, 21f)
                curveToRelative(-1.04f, 0f, -2.35f, -1.51f, -3.12f, -4.15f)
                curveToRelative(0.27f, 0.1f, 0.56f, 0.15f, 0.87f, 0.15f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.56f, 0f, -1.08f, 0.18f, -1.49f, 0.49f)
                curveToRelative(-0.0f, -0.16f, -0.01f, -0.33f, -0.01f, -0.49f)
                curveToRelative(0f, -5.58f, 2.18f, -9f, 3.75f, -9f)
                reflectiveCurveToRelative(3.75f, 3.42f, 3.75f, 9f)
                reflectiveCurveToRelative(-2.18f, 9f, -3.75f, 9f)
                close()
                moveTo(17.25f, 21f)
                curveToRelative(-1.08f, 0f, -2.45f, -1.63f, -3.2f, -4.46f)
                curveToRelative(0.41f, 0.29f, 0.91f, 0.47f, 1.45f, 0.47f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.81f, 0f, -1.52f, 0.38f, -1.98f, 0.97f)
                curveToRelative(-0.01f, -0.32f, -0.02f, -0.64f, -0.02f, -0.97f)
                curveToRelative(0f, -5.58f, 2.18f, -9f, 3.75f, -9f)
                reflectiveCurveToRelative(3.75f, 3.42f, 3.75f, 9f)
                reflectiveCurveToRelative(-2.18f, 9f, -3.75f, 9f)
                close()
            }
        }.also { _Eyes = it}
