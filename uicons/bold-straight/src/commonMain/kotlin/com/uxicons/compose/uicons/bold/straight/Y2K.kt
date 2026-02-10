package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Y2K: ImageVector? = null

val Icons.Bs.Y2K: ImageVector
    get() = _Y2K ?: UXIcon(name = "Y2K") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.12f, 12.04f)
                lineToRelative(1.88f, 5.96f)
                horizontalLineToRelative(-2.62f)
                lineToRelative(-1.45f, -5.0f)
                lineToRelative(-0.43f, 0.0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4.6f)
                horizontalLineToRelative(0.58f)
                lineToRelative(1.31f, -4.6f)
                horizontalLineToRelative(2.62f)
                close()
                moveTo(6.35f, 6f)
                lineTo(4.5f, 9.71f)
                lineTo(2.67f, 6f)
                horizontalLineToRelative(-2.67f)
                lineToRelative(3.25f, 6.66f)
                verticalLineToRelative(5.34f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-5.41f)
                lineToRelative(3.25f, -6.59f)
                horizontalLineToRelative(-2.65f)
                close()
                moveTo(16f, 9.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.64f, 0.36f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.36f, 1f, 1f)
                curveToRelative(0f, 3f, -4.5f, 4.29f, -4.5f, 7f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-3.76f)
                curveToRelative(1.04f, -0.95f, 3.76f, -2.91f, 3.76f, -6f)
                close()
            }
        }.also { _Y2K = it}
