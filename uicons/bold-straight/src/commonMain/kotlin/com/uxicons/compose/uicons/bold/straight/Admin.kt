package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Admin: ImageVector? = null

val Icons.Bs.Admin: ImageVector
    get() = _Admin ?: UXIcon(name = "Admin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 11f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(19f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(4f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(20.25f, 14.58f)
                lineToRelative(1.78f, 1.16f)
                lineToRelative(-1.64f, 2.52f)
                reflectiveCurveToRelative(-2.93f, -2.49f, -4.27f, -2.92f)
                curveToRelative(1.15f, -1.09f, 1.86f, -2.63f, 1.86f, -4.34f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 1.71f, 0.72f, 3.24f, 1.86f, 4.34f)
                lineToRelative(-4.27f, 2.92f)
                lineToRelative(-1.64f, -2.52f)
                lineToRelative(1.79f, -1.16f)
                curveToRelative(-0.48f, -1.1f, -0.75f, -2.31f, -0.75f, -3.58f)
                reflectiveCurveToRelative(0.27f, -2.48f, 0.75f, -3.58f)
                lineToRelative(-1.79f, -1.16f)
                lineToRelative(1.64f, -2.52f)
                lineToRelative(1.79f, 1.17f)
                curveToRelative(1.32f, -1.43f, 3.1f, -2.44f, 5.11f, -2.77f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.13f)
                curveToRelative(2.01f, 0.34f, 3.78f, 1.34f, 5.11f, 2.77f)
                lineToRelative(1.79f, -1.17f)
                lineToRelative(1.64f, 2.52f)
                lineToRelative(-1.78f, 1.16f)
                curveToRelative(0.48f, 1.1f, 0.75f, 2.31f, 0.75f, 3.58f)
                reflectiveCurveToRelative(-0.27f, 2.48f, -0.75f, 3.58f)
                close()
            }
        }.also { _Admin = it}
