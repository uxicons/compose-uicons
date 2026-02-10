package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusinessValue: ImageVector? = null

val Icons.Rr.BusinessValue: ImageVector
    get() = _BusinessValue ?: UXIcon(name = "BusinessValue") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 4f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                horizontalLineToRelative(-7.63f)
                curveToRelative(0.41f, -1.16f, 1.51f, -2f, 2.82f, -2f)
                close()
                moveTo(23.65f, 15.88f)
                curveToRelative(0.49f, 0.66f, 0.46f, 1.56f, -0.07f, 2.19f)
                lineToRelative(-5.57f, 5.93f)
                lineToRelative(2.06f, -6f)
                horizontalLineToRelative(-4.12f)
                lineToRelative(2.06f, 6f)
                lineToRelative(-5.57f, -5.93f)
                curveToRelative(-0.53f, -0.62f, -0.56f, -1.53f, -0.07f, -2.19f)
                lineToRelative(1.56f, -2.08f)
                curveToRelative(0.38f, -0.5f, 0.97f, -0.8f, 1.6f, -0.8f)
                horizontalLineToRelative(1.6f)
                lineToRelative(-1.13f, 3f)
                horizontalLineToRelative(4f)
                lineToRelative(-1.13f, -3f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.63f, 0f, 1.22f, 0.3f, 1.6f, 0.8f)
                lineToRelative(1.56f, 2.08f)
                close()
            }
        }.also { _BusinessValue = it}
