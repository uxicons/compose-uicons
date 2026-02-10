package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSlash: ImageVector? = null

val Icons.Sr.ShieldSlash: ImageVector
    get() = _ShieldSlash ?: UXIcon(name = "ShieldSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                lineToRelative(-3.82f, -3.82f)
                curveToRelative(1.4f, -1.92f, 2.11f, -4.08f, 2.11f, -6.43f)
                verticalLineToRelative(-5.17f)
                curveToRelative(0f, -2.16f, -1.38f, -4.07f, -3.43f, -4.75f)
                lineTo(12.31f, 0.05f)
                curveToRelative(-0.2f, -0.07f, -0.42f, -0.07f, -0.63f, 0f)
                lineToRelative(-6.26f, 2.08f)
                curveToRelative(-0.45f, 0.15f, -0.87f, 0.36f, -1.26f, 0.63f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(3.71f, 7.92f)
                curveToRelative(-0.29f, -0.29f, -0.72f, -0.37f, -1.09f, -0.22f)
                curveToRelative(-0.37f, 0.15f, -0.62f, 0.52f, -0.62f, 0.92f)
                verticalLineToRelative(3.42f)
                curveToRelative(0f, 6.56f, 7.0f, 10.58f, 9.15f, 11.65f)
                curveToRelative(0f, 0f, 0.51f, 0.31f, 0.85f, 0.31f)
                reflectiveCurveToRelative(0.79f, -0.24f, 0.79f, -0.24f)
                curveToRelative(0.64f, -0.26f, 1.93f, -0.83f, 3.31f, -1.75f)
                curveToRelative(0.25f, -0.17f, 0.41f, -0.43f, 0.44f, -0.73f)
                reflectiveCurveToRelative(-0.08f, -0.59f, -0.29f, -0.81f)
                lineTo(3.71f, 7.92f)
                close()
            }
        }.also { _ShieldSlash = it}
