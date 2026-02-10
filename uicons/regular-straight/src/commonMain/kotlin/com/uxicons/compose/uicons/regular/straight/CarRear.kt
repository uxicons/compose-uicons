package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarRear: ImageVector? = null

val Icons.Rs.CarRear: ImageVector
    get() = _CarRear ?: UXIcon(name = "CarRear") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17.03f)
                curveToRelative(0f, -2.79f, -0.48f, -5.54f, -1.44f, -8.16f)
                lineToRelative(-2.14f, -5.89f)
                curveToRelative(-0.43f, -1.18f, -1.56f, -1.98f, -2.82f, -1.98f)
                lineTo(6.4f, 1.0f)
                curveToRelative(-1.26f, 0f, -2.39f, 0.79f, -2.82f, 1.98f)
                lineToRelative(-2.14f, 5.89f)
                curveToRelative(-0.95f, 2.62f, -1.44f, 5.37f, -1.44f, 8.16f)
                verticalLineToRelative(1.97f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.97f)
                close()
                moveTo(5.46f, 3.66f)
                curveToRelative(0.14f, -0.39f, 0.52f, -0.66f, 0.94f, -0.66f)
                horizontalLineToRelative(11.2f)
                curveToRelative(0.42f, 0f, 0.8f, 0.27f, 0.94f, 0.66f)
                lineToRelative(1.58f, 4.34f)
                lineTo(3.88f, 8f)
                lineToRelative(1.58f, -4.34f)
                close()
                moveTo(6f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                lineTo(2f, 17f)
                curveToRelative(0.0f, -1.01f, 0.09f, -2.01f, 0.23f, -3f)
                horizontalLineToRelative(2.77f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.4f)
                curveToRelative(0.16f, -0.67f, 0.35f, -1.34f, 0.57f, -2f)
                horizontalLineToRelative(17.65f)
                curveToRelative(0.22f, 0.66f, 0.41f, 1.33f, 0.57f, 2f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.77f)
                curveToRelative(0.14f, 0.99f, 0.23f, 1.99f, 0.23f, 3f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _CarRear = it}
