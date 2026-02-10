package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheeseburger: ImageVector? = null

val Icons.Rs.Cheeseburger: ImageVector
    get() = _Cheeseburger ?: UXIcon(name = "Cheeseburger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 11.0f)
                curveTo(22.99f, 4.83f, 18.16f, 0f, 12.0f, 0f)
                curveTo(5.94f, 0f, 1.0f, 4.94f, 1.0f, 11.0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(22.0f)
                lineToRelative(-0.0f, -1.0f)
                close()
                moveTo(3.06f, 10.0f)
                curveTo(3.56f, 5.51f, 7.38f, 2.0f, 12.0f, 2.0f)
                curveToRelative(4.7f, 0f, 8.45f, 3.44f, 8.95f, 8f)
                lineTo(3.06f, 10.0f)
                close()
                moveTo(23.0f, 14.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(1.0f, 16.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(22f)
                close()
                moveTo(19.74f, 18.0f)
                horizontalLineToRelative(3.26f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                horizontalLineToRelative(-0.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10.26f)
                lineToRelative(2f, 2f)
                lineTo(3.0f, 20.0f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(-3.26f)
                lineToRelative(2f, -2f)
                close()
            }
        }.also { _Cheeseburger = it}
