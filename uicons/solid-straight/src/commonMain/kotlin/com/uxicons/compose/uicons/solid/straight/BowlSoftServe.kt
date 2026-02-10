package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlSoftServe: ImageVector? = null

val Icons.Ss.BowlSoftServe: ImageVector
    get() = _BowlSoftServe ?: UXIcon(name = "BowlSoftServe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.09f, 16f)
                horizontalLineToRelative(17.8f)
                lineToRelative(-0.4f, 1.01f)
                curveToRelative(-1.63f, 2.73f, -3.93f, 3.01f, -6.41f, 3.01f)
                curveToRelative(-0.32f, 0f, -0.76f, -0.01f, -1.09f, -0.01f)
                verticalLineToRelative(1.99f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(7f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1.99f)
                curveToRelative(-2.85f, 0.04f, -5.65f, 0.08f, -7.5f, -3.0f)
                lineToRelative(-0.41f, -1.01f)
                close()
                moveTo(21.5f, 9f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3.15f)
                curveToRelative(-0.49f, -1.87f, -2.17f, -3f, -3.85f, -3f)
                curveToRelative(0f, 1.5f, -0.25f, 2.25f, -1f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                lineTo(2.5f, 9f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _BowlSoftServe = it}
