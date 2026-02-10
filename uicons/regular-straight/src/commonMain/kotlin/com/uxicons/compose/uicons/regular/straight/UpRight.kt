package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpRight: ImageVector? = null

val Icons.Rs.UpRight: ImageVector
    get() = _UpRight ?: UXIcon(name = "UpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.84f, 23.23f)
                lineTo(0.77f, 16.16f)
                lineTo(10.96f, 5.97f)
                lineTo(6.02f, 0.99f)
                horizontalLineToRelative(13.98f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0.8f, 0f, 1.55f, 0.31f, 2.12f, 0.88f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.13f)
                verticalLineToRelative(13.96f)
                reflectiveCurveToRelative(-4.97f, -4.92f, -4.97f, -4.92f)
                lineTo(7.84f, 23.23f)
                close()
                moveTo(3.6f, 16.16f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(10.19f, -10.19f)
                lineToRelative(2.98f, 2.95f)
                lineTo(21.01f, 4f)
                curveToRelative(0f, -0.27f, -0.11f, -0.52f, -0.3f, -0.71f)
                curveToRelative(-0.19f, -0.19f, -0.44f, -0.29f, -0.71f, -0.29f)
                lineTo(10.83f, 3f)
                reflectiveCurveToRelative(2.96f, 2.98f, 2.96f, 2.98f)
                lineTo(3.6f, 16.16f)
                close()
            }
        }.also { _UpRight = it}
