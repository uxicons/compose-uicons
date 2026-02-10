package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SunSalutationYoga: ImageVector? = null

val Icons.Rr.SunSalutationYoga: ImageVector
    get() = _SunSalutationYoga ?: UXIcon(name = "SunSalutationYoga") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18.08f, 7.59f)
                curveToRelative(-0.46f, -0.31f, -1.08f, -0.18f, -1.39f, 0.28f)
                lineToRelative(-1.29f, 1.94f)
                reflectiveCurveToRelative(-2.09f, -2.86f, -2.13f, -2.91f)
                curveToRelative(-0.62f, -0.58f, -1.42f, -0.9f, -2.27f, -0.9f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4.65f)
                curveToRelative(0f, 1.52f, 0.85f, 2.9f, 2.21f, 3.58f)
                lineToRelative(0.79f, 0.4f)
                verticalLineToRelative(5.38f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6.3f)
                curveToRelative(0.2f, -0.48f, 0.65f, -1.68f, 0.69f, -2.82f)
                curveToRelative(0.02f, -0.55f, -0.41f, -1.02f, -0.96f, -1.04f)
                curveToRelative(-0.51f, -0.01f, -1.02f, 0.41f, -1.04f, 0.96f)
                curveToRelative(-0.03f, 0.6f, -0.23f, 1.27f, -0.39f, 1.73f)
                lineToRelative(-0.2f, -0.1f)
                curveToRelative(-0.68f, -0.34f, -1.1f, -1.03f, -1.1f, -1.79f)
                verticalLineToRelative(-4.65f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.31f, 0f, 0.6f, 0.11f, 0.84f, 0.3f)
                lineToRelative(2.25f, 3.09f)
                curveToRelative(0.33f, 0.39f, 0.9f, 0.6f, 1.41f, 0.6f)
                curveToRelative(0.53f, -0.01f, 0.97f, -0.26f, 1.33f, -0.73f)
                lineToRelative(1.53f, -2.29f)
                curveToRelative(0.31f, -0.46f, 0.18f, -1.08f, -0.28f, -1.39f)
                close()
            }
        }.also { _SunSalutationYoga = it}
