package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SunSalutationYoga: ImageVector? = null

val Icons.Rs.SunSalutationYoga: ImageVector
    get() = _SunSalutationYoga ?: UXIcon(name = "SunSalutationYoga") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(17f, 7.41f)
                lineToRelative(-1.57f, 2.15f)
                lineToRelative(-2.16f, -2.66f)
                curveToRelative(-0.62f, -0.58f, -1.42f, -0.9f, -2.27f, -0.9f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5.0f)
                curveToRelative(0f, 1.3f, 0.72f, 2.48f, 1.89f, 3.06f)
                lineToRelative(1.11f, 0.55f)
                verticalLineToRelative(6.38f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.84f)
                curveToRelative(0.35f, -0.96f, 0.58f, -2.13f, 0.73f, -3.34f)
                lineToRelative(-1.8f, -2.23f)
                curveToRelative(-0.09f, 1.58f, -0.27f, 2.94f, -0.53f, 3.99f)
                lineToRelative(-0.61f, -0.3f)
                curveToRelative(-0.48f, -0.24f, -0.79f, -0.73f, -0.79f, -1.27f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.32f, 0f, 0.62f, 0.11f, 0.86f, 0.32f)
                lineToRelative(2.97f, 3.68f)
                horizontalLineToRelative(1.29f)
                lineToRelative(2.49f, -3.41f)
                lineToRelative(-1.61f, -1.18f)
                close()
            }
        }.also { _SunSalutationYoga = it}
