package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VanFront: ImageVector? = null

val Icons.Rs.VanFront: ImageVector
    get() = _VanFront ?: UXIcon(name = "VanFront") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.74f, 11f)
                lineToRelative(-0.64f, -7.35f)
                curveToRelative(-0.1f, -1.2f, -0.92f, -2.22f, -2.06f, -2.6f)
                curveToRelative(-1.46f, -0.48f, -3.87f, -1.05f, -7.04f, -1.05f)
                reflectiveCurveToRelative(-5.58f, 0.57f, -7.04f, 1.05f)
                curveToRelative(-1.15f, 0.38f, -1.96f, 1.4f, -2.06f, 2.6f)
                lineToRelative(-0.64f, 7.35f)
                horizontalLineToRelative(-2.26f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4f)
                lineToRelative(-0.0f, -5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.26f)
                close()
                moveTo(5.59f, 2.96f)
                curveToRelative(1.32f, -0.44f, 3.51f, -0.95f, 6.41f, -0.95f)
                reflectiveCurveToRelative(5.09f, 0.52f, 6.41f, 0.95f)
                curveToRelative(0.39f, 0.13f, 0.66f, 0.47f, 0.7f, 0.87f)
                lineToRelative(0.8f, 9.18f)
                horizontalLineToRelative(-15.82f)
                lineToRelative(0.8f, -9.18f)
                curveToRelative(0.03f, -0.4f, 0.31f, -0.74f, 0.7f, -0.87f)
                close()
                moveTo(4.0f, 20f)
                lineTo(4.0f, 15f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _VanFront = it}
