package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarRear: ImageVector? = null

val Icons.Ss.CarRear: ImageVector
    get() = _CarRear ?: UXIcon(name = "CarRear") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.75f, 8f)
                lineToRelative(1.83f, -5.03f)
                curveToRelative(0.43f, -1.18f, 1.56f, -1.98f, 2.82f, -1.98f)
                horizontalLineToRelative(11.2f)
                curveToRelative(1.26f, 0f, 2.39f, 0.79f, 2.82f, 1.98f)
                lineToRelative(1.83f, 5.03f)
                lineTo(1.75f, 8f)
                close()
                moveTo(24f, 17.03f)
                verticalLineToRelative(1.97f)
                lineTo(0f, 19f)
                verticalLineToRelative(-1.97f)
                curveToRelative(0f, -1.02f, 0.08f, -2.03f, 0.21f, -3.03f)
                horizontalLineToRelative(3.79f)
                verticalLineToRelative(-2f)
                lineTo(0.56f, 12f)
                curveToRelative(0.15f, -0.67f, 0.32f, -1.34f, 0.52f, -2f)
                horizontalLineToRelative(21.84f)
                curveToRelative(0.2f, 0.66f, 0.37f, 1.33f, 0.52f, 2f)
                horizontalLineToRelative(-3.44f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.79f)
                curveToRelative(0.13f, 1.0f, 0.21f, 2.01f, 0.21f, 3.03f)
                close()
                moveTo(16f, 15f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                lineTo(3f, 21f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _CarRear = it}
