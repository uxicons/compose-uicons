package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sailboat: ImageVector? = null

val Icons.Bs.Sailboat: ImageVector
    get() = _Sailboat ?: UXIcon(name = "Sailboat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.01f, 15f)
                lineToRelative(0.22f, 1.69f)
                curveToRelative(0.33f, 2.53f, 2.69f, 7.31f, 9.27f, 7.31f)
                horizontalLineToRelative(5f)
                curveToRelative(6.57f, 0f, 8.96f, -4.77f, 9.31f, -7.29f)
                lineToRelative(0.23f, -1.71f)
                lineTo(0.01f, 15f)
                close()
                moveTo(14.5f, 21f)
                horizontalLineToRelative(-5f)
                curveToRelative(-3.41f, 0f, -4.99f, -1.65f, -5.71f, -3f)
                horizontalLineToRelative(16.45f)
                curveToRelative(-0.74f, 1.35f, -2.33f, 3f, -5.74f, 3f)
                close()
                moveTo(23f, 13f)
                horizontalLineToRelative(-11f)
                lineToRelative(0.01f, -13f)
                lineToRelative(10.99f, 13f)
                close()
                moveTo(10f, 13f)
                lineTo(1f, 13f)
                lineTo(10f, 3f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _Sailboat = it}
