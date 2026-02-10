package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sun: ImageVector? = null

val Icons.Tc.Sun: ImageVector
    get() = _Sun ?: UXIcon(name = "Sun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.47f, 11.5f)
                horizontalLineToRelative(-2.9f)
                curveToRelative(-0.07f, -2.28f, -0.63f, -3.84f, -1.49f, -4.9f)
                lineToRelative(1.67f, -1.67f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0f)
                lineToRelative(-1.66f, 1.66f)
                curveToRelative(-1.35f, -1.14f, -3.16f, -1.44f, -4.89f, -1.48f)
                lineTo(12.5f, 1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.9f)
                curveToRelative(-1.73f, 0.04f, -3.54f, 0.35f, -4.89f, 1.48f)
                lineToRelative(-1.66f, -1.66f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(1.67f, 1.67f)
                curveToRelative(-0.85f, 1.06f, -1.42f, 2.62f, -1.49f, 4.9f)
                lineTo(1.53f, 11.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.9f)
                curveToRelative(0.07f, 2.28f, 0.63f, 3.84f, 1.49f, 4.9f)
                lineToRelative(-1.67f, 1.67f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(1.66f, -1.66f)
                curveToRelative(1.35f, 1.14f, 3.16f, 1.44f, 4.89f, 1.48f)
                verticalLineToRelative(2.9f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.9f)
                curveToRelative(1.73f, -0.04f, 3.54f, -0.35f, 4.89f, -1.48f)
                lineToRelative(1.66f, 1.66f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-1.67f, -1.67f)
                curveToRelative(0.85f, -1.06f, 1.42f, -2.62f, 1.49f, -4.9f)
                horizontalLineToRelative(2.9f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(12f, 18.6f)
                curveToRelative(-4.68f, 0f, -6.59f, -1.91f, -6.59f, -6.6f)
                reflectiveCurveToRelative(1.91f, -6.6f, 6.59f, -6.6f)
                reflectiveCurveToRelative(6.59f, 1.91f, 6.59f, 6.6f)
                reflectiveCurveToRelative(-1.91f, 6.6f, -6.59f, 6.6f)
                close()
            }
        }.also { _Sun = it}
