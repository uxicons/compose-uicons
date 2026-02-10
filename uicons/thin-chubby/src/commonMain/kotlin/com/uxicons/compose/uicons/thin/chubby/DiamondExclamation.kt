package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondExclamation: ImageVector? = null

val Icons.Tc.DiamondExclamation: ImageVector
    get() = _DiamondExclamation ?: UXIcon(name = "DiamondExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 13.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(12f, 16.25f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                close()
                moveTo(22.92f, 12.27f)
                curveToRelative(-0.09f, 0.13f, -2.13f, 3.32f, -4.73f, 5.92f)
                reflectiveCurveToRelative(-5.78f, 4.65f, -5.92f, 4.73f)
                curveToRelative(-0.16f, 0.1f, -0.38f, 0.1f, -0.54f, 0f)
                curveToRelative(-0.13f, -0.09f, -3.32f, -2.13f, -5.92f, -4.73f)
                curveToRelative(-2.6f, -2.6f, -4.65f, -5.78f, -4.74f, -5.92f)
                curveToRelative(-0.1f, -0.16f, -0.1f, -0.38f, 0f, -0.54f)
                curveToRelative(0.09f, -0.13f, 2.13f, -3.32f, 4.73f, -5.92f)
                curveToRelative(2.6f, -2.6f, 5.78f, -4.65f, 5.92f, -4.74f)
                curveToRelative(0.16f, -0.1f, 0.38f, -0.1f, 0.54f, 0f)
                curveToRelative(0.13f, 0.09f, 3.32f, 2.13f, 5.92f, 4.73f)
                reflectiveCurveToRelative(4.65f, 5.78f, 4.73f, 5.92f)
                curveToRelative(0.1f, 0.16f, 0.1f, 0.38f, 0f, 0.54f)
                close()
                moveTo(21.9f, 12f)
                curveToRelative(-0.55f, -0.82f, -2.33f, -3.38f, -4.42f, -5.48f)
                curveToRelative(-2.1f, -2.1f, -4.66f, -3.87f, -5.48f, -4.42f)
                curveToRelative(-0.82f, 0.55f, -3.38f, 2.33f, -5.48f, 4.42f)
                curveToRelative(-2.1f, 2.1f, -3.87f, 4.66f, -4.42f, 5.48f)
                curveToRelative(0.55f, 0.82f, 2.33f, 3.38f, 4.42f, 5.48f)
                curveToRelative(2.1f, 2.1f, 4.66f, 3.87f, 5.48f, 4.42f)
                curveToRelative(0.82f, -0.55f, 3.38f, -2.33f, 5.48f, -4.42f)
                curveToRelative(2.1f, -2.1f, 3.87f, -4.66f, 4.42f, -5.48f)
                close()
            }
        }.also { _DiamondExclamation = it}
