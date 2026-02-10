package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeAdd: ImageVector? = null

val Icons.Ss.TimeAdd: ImageVector
    get() = _TimeAdd ?: UXIcon(name = "TimeAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.02f, 0f)
                curveToRelative(-6.62f, -0.02f, -12.0f, 5.34f, -12.02f, 11.96f)
                reflectiveCurveToRelative(5.33f, 12.02f, 11.94f, 12.04f)
                curveToRelative(1.1f, 0.0f, 2.19f, -0.14f, 3.25f, -0.44f)
                curveToRelative(-1.97f, -2.66f, -1.41f, -6.41f, 1.24f, -8.38f)
                curveToRelative(2.12f, -1.57f, 5.01f, -1.57f, 7.12f, 0f)
                curveToRelative(1.77f, -6.37f, -1.95f, -12.97f, -8.3f, -14.74f)
                curveToRelative(-1.05f, -0.29f, -2.14f, -0.44f, -3.24f, -0.44f)
                close()
                moveTo(13.02f, 11.41f)
                lineTo(9.72f, 14.71f)
                lineTo(8.31f, 13.29f)
                lineTo(11.02f, 10.59f)
                verticalLineToRelative(-4.59f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _TimeAdd = it}
