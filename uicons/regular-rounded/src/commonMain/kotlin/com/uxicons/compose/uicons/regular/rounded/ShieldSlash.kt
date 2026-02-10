package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSlash: ImageVector? = null

val Icons.Rr.ShieldSlash: ImageVector
    get() = _ShieldSlash ?: UXIcon(name = "ShieldSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.27f, 20.71f)
                curveToRelative(0.3f, 0.46f, 0.17f, 1.08f, -0.29f, 1.38f)
                curveToRelative(-1.26f, 0.82f, -2.43f, 1.36f, -3.18f, 1.66f)
                curveToRelative(0f, 0f, -0.43f, 0.24f, -0.79f, 0.24f)
                reflectiveCurveToRelative(-0.85f, -0.31f, -0.85f, -0.31f)
                curveToRelative(-2.15f, -1.07f, -9.15f, -5.09f, -9.15f, -11.65f)
                verticalLineToRelative(-3.55f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.55f)
                curveToRelative(0f, 5.42f, 6.16f, 8.92f, 8.05f, 9.86f)
                curveToRelative(0.55f, -0.22f, 1.65f, -0.71f, 2.84f, -1.48f)
                curveToRelative(0.46f, -0.3f, 1.08f, -0.17f, 1.38f, 0.29f)
                close()
                moveTo(23.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(2.46f, 2.46f)
                curveToRelative(0.39f, -0.27f, 0.81f, -0.48f, 1.26f, -0.63f)
                lineTo(11.69f, 0.05f)
                curveToRelative(0.2f, -0.07f, 0.42f, -0.07f, 0.63f, 0f)
                lineToRelative(6.26f, 2.08f)
                curveToRelative(2.05f, 0.68f, 3.43f, 2.59f, 3.43f, 4.75f)
                verticalLineToRelative(5.17f)
                curveToRelative(0f, 2.35f, -0.71f, 4.51f, -2.11f, 6.43f)
                lineToRelative(3.82f, 3.82f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(5.62f, 4.21f)
                lineToRelative(12.83f, 12.83f)
                curveToRelative(1.03f, -1.51f, 1.55f, -3.19f, 1.55f, -5.0f)
                verticalLineToRelative(-5.17f)
                curveToRelative(0f, -1.29f, -0.83f, -2.44f, -2.06f, -2.85f)
                lineToRelative(-5.94f, -1.97f)
                lineToRelative(-5.94f, 1.97f)
                curveToRelative(-0.15f, 0.05f, -0.3f, 0.11f, -0.43f, 0.18f)
                close()
            }
        }.also { _ShieldSlash = it}
