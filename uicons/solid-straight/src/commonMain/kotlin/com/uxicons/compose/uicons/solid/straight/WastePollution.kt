package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WastePollution: ImageVector? = null

val Icons.Ss.WastePollution: ImageVector
    get() = _WastePollution ?: UXIcon(name = "WastePollution") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 20f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.35f, -0.21f, 1.02f, -0.5f, 2f, -0.5f)
                reflectiveCurveToRelative(1.65f, 0.29f, 2f, 0.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(17f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-5.41f)
                lineToRelative(-0.29f, -0.29f)
                curveToRelative(-0.13f, -0.13f, -1.36f, -1.29f, -3.71f, -1.29f)
                reflectiveCurveToRelative(-3.58f, 1.16f, -3.71f, 1.29f)
                lineToRelative(-0.29f, 0.29f)
                verticalLineToRelative(5.41f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(4f, 7.59f, 4f, 12f)
                curveToRelative(0f, 2.02f, 0.76f, 3.86f, 2f, 5.27f)
                verticalLineToRelative(-5.27f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(5.27f)
                curveToRelative(1.24f, -1.41f, 2f, -3.25f, 2f, -5.27f)
                close()
                moveTo(18f, 22f)
                curveToRelative(-1.2f, 0f, -2.27f, -0.54f, -3f, -1.38f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.38f, -3f, 1.38f)
                reflectiveCurveToRelative(-2.27f, -0.54f, -3f, -1.38f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.38f, -3f, 1.38f)
                reflectiveCurveToRelative(-2.27f, -0.54f, -3f, -1.38f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.38f, -3f, 1.38f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.2f, 0f, -2.27f, -0.54f, -3f, -1.38f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.38f, -3f, 1.38f)
                close()
            }
        }.also { _WastePollution = it}
