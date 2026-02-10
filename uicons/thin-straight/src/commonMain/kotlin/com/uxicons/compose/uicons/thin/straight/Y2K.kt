package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Y2K: ImageVector? = null

val Icons.Ts.Y2K: ImageVector
    get() = _Y2K ?: UXIcon(name = "Y2K") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.13f, 17f)
                horizontalLineToRelative(5.93f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.72f, 1.48f, -2.8f, 2.92f, -3.85f)
                curveToRelative(1.52f, -1.11f, 3.08f, -2.25f, 3.08f, -4.15f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 2.41f, -1.85f, 3.76f, -3.49f, 4.96f)
                curveToRelative(-1.15f, 0.84f, -2.17f, 1.58f, -2.44f, 2.54f)
                close()
                moveTo(9.07f, 6f)
                horizontalLineToRelative(-1.11f)
                lineToRelative(-3.34f, 6.92f)
                lineToRelative(-3.42f, -6.92f)
                horizontalLineToRelative(-1.12f)
                lineToRelative(4f, 8.05f)
                verticalLineToRelative(3.94f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3.76f)
                lineToRelative(4f, -8.24f)
                close()
                moveTo(23.94f, 6f)
                horizontalLineToRelative(-1.07f)
                lineToRelative(-2.14f, 5.5f)
                horizontalLineToRelative(-2.16f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(2.16f)
                lineToRelative(2.14f, 5.5f)
                horizontalLineToRelative(1.07f)
                lineToRelative(-2.33f, -6f)
                close()
            }
        }.also { _Y2K = it}
