package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Insert: ImageVector? = null

val Icons.Ts.Insert: ImageVector
    get() = _Insert ?: UXIcon(name = "Insert") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.94f, 19.56f)
                lineToRelative(-4.79f, -4.7f)
                lineToRelative(0.7f, -0.71f)
                lineToRelative(4.65f, 4.57f)
                lineTo(11.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(18.71f)
                lineToRelative(4.65f, -4.57f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-4.79f, 4.71f)
                curveToRelative(-0.29f, 0.29f, -0.67f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                close()
                moveTo(20f, 17f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                lineTo(0f, 17f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Insert = it}
