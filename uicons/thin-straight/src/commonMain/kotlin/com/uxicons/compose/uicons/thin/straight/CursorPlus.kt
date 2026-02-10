package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorPlus: ImageVector? = null

val Icons.Ts.CursorPlus: ImageVector
    get() = _CursorPlus ?: UXIcon(name = "CursorPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 9f)
                curveToRelative(-4.14f, 0f, -7.5f, 3.36f, -7.5f, 7.5f)
                reflectiveCurveToRelative(3.36f, 7.5f, 7.5f, 7.5f)
                reflectiveCurveToRelative(7.5f, -3.36f, 7.5f, -7.5f)
                reflectiveCurveToRelative(-3.36f, -7.5f, -7.5f, -7.5f)
                close()
                moveTo(16.5f, 23f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                close()
                moveTo(0.05f, 0.05f)
                lineToRelative(4.81f, 14.05f)
                lineToRelative(2.53f, -6.72f)
                lineToRelative(6.72f, -2.53f)
                lineTo(0.05f, 0.05f)
                close()
                moveTo(6.61f, 6.61f)
                lineToRelative(-1.71f, 4.53f)
                lineTo(1.66f, 1.66f)
                lineToRelative(9.49f, 3.25f)
                lineToRelative(-4.53f, 1.71f)
                close()
            }
        }.also { _CursorPlus = it}
