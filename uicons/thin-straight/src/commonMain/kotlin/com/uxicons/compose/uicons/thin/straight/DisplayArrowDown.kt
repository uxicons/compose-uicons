package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayArrowDown: ImageVector? = null

val Icons.Ts.DisplayArrowDown: ImageVector
    get() = _DisplayArrowDown ?: UXIcon(name = "DisplayArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1f)
                lineTo(7f, 22f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                lineTo(0f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(22f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-11.5f)
                close()
                moveTo(8.35f, 6.56f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.29f, 3.29f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.15f, 3.15f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(9.71f)
                lineToRelative(-3.15f, -3.15f)
                close()
            }
        }.also { _DisplayArrowDown = it}
