package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayArrowDown: ImageVector? = null

val Icons.Rs.DisplayArrowDown: ImageVector
    get() = _DisplayArrowDown ?: UXIcon(name = "DisplayArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.02f, 6f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(7.02f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(0.02f, 19f)
                lineTo(0.02f, 6f)
                curveTo(0.02f, 4.35f, 1.37f, 3f, 3.02f, 3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                lineTo(3.02f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(20f)
                lineTo(22.02f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(8.73f, 6.71f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.29f, 3.29f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.2f, 1.41f, -0.58f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.29f, 2.29f)
                lineTo(13.02f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                lineToRelative(-2.29f, -2.29f)
                close()
            }
        }.also { _DisplayArrowDown = it}
