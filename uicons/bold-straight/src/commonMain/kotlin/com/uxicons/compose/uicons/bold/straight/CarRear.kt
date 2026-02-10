package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarRear: ImageVector? = null

val Icons.Bs.CarRear: ImageVector
    get() = _CarRear ?: UXIcon(name = "CarRear") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17.03f)
                curveToRelative(0f, -0.34f, -0.03f, -0.69f, -0.04f, -1.03f)
                horizontalLineToRelative(-2.96f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.66f)
                curveToRelative(-0.25f, -1.47f, -0.62f, -2.92f, -1.14f, -4.34f)
                lineToRelative(-2.13f, -5.35f)
                curveToRelative(-0.5f, -1.38f, -1.82f, -2.3f, -3.29f, -2.3f)
                lineTo(6.9f, 1f)
                curveToRelative(-1.47f, 0f, -2.79f, 0.93f, -3.27f, 2.26f)
                lineToRelative(-2.16f, 5.44f)
                curveToRelative(-0.51f, 1.4f, -0.88f, 2.84f, -1.13f, 4.3f)
                horizontalLineToRelative(2.66f)
                verticalLineToRelative(3f)
                lineTo(0.04f, 16.0f)
                curveToRelative(-0.01f, 0.34f, -0.04f, 0.69f, -0.04f, 1.03f)
                verticalLineToRelative(2.97f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.97f)
                close()
                moveTo(4.27f, 9.77f)
                lineToRelative(2.16f, -5.44f)
                curveToRelative(0.07f, -0.2f, 0.26f, -0.33f, 0.47f, -0.33f)
                horizontalLineToRelative(10.2f)
                curveToRelative(0.21f, 0f, 0.4f, 0.13f, 0.48f, 0.37f)
                lineToRelative(2.13f, 5.35f)
                curveToRelative(0.15f, 0.42f, 0.28f, 0.85f, 0.41f, 1.28f)
                lineTo(3.88f, 11f)
                curveToRelative(0.12f, -0.42f, 0.25f, -0.83f, 0.39f, -1.24f)
                close()
                moveTo(16f, 17f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _CarRear = it}
