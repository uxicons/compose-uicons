package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tuesday: ImageVector? = null

val Icons.Bs.Tuesday: ImageVector
    get() = _Tuesday ?: UXIcon(name = "Tuesday") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                lineTo(3f, 10f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                lineTo(15f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(8.76f, 17.57f)
                horizontalLineToRelative(1.65f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(20.5f, 23.97f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.55f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.65f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8f)
                close()
                moveTo(17.74f, 21.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-5.73f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(5.73f)
                curveToRelative(0f, 1.27f, 1.03f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-5.73f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(5.73f)
                close()
            }
        }.also { _Tuesday = it}
