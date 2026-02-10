package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sailboat: ImageVector? = null

val Icons.Rs.Sailboat: ImageVector
    get() = _Sailboat ?: UXIcon(name = "Sailboat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(-0.0f, 15f)
                lineToRelative(0.15f, 1.13f)
                curveToRelative(0.01f, 0.08f, 1.13f, 7.87f, 10.07f, 7.87f)
                horizontalLineToRelative(3.53f)
                curveToRelative(8.94f, 0f, 10.11f, -7.79f, 10.12f, -7.86f)
                lineToRelative(0.16f, -1.14f)
                lineTo(-0.0f, 15f)
                close()
                moveTo(13.74f, 22f)
                horizontalLineToRelative(-3.53f)
                curveToRelative(-5.3f, 0f, -7.17f, -3.23f, -7.79f, -5f)
                horizontalLineToRelative(19.16f)
                curveToRelative(-0.64f, 1.78f, -2.54f, 5f, -7.83f, 5f)
                close()
                moveTo(12.01f, 0.02f)
                lineToRelative(-0.01f, 12.98f)
                horizontalLineToRelative(11.97f)
                lineTo(12.01f, 0.02f)
                close()
                moveTo(14.01f, 5.14f)
                lineToRelative(5.41f, 5.86f)
                horizontalLineToRelative(-5.41f)
                lineToRelative(0.0f, -5.86f)
                close()
                moveTo(10f, 1.86f)
                lineTo(0.13f, 13f)
                horizontalLineToRelative(9.87f)
                lineTo(10f, 1.86f)
                close()
                moveTo(8f, 11f)
                horizontalLineToRelative(-3.43f)
                lineToRelative(3.43f, -3.87f)
                verticalLineToRelative(3.87f)
                close()
            }
        }.also { _Sailboat = it}
