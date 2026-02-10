package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBattery: ImageVector? = null

val Icons.Rs.PersonBattery: ImageVector
    get() = _PersonBattery ?: UXIcon(name = "PersonBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.28f, 11.14f)
                curveToRelative(-1.18f, -2.71f, -2.29f, -5.26f, -3.48f, -6.72f)
                curveTo(17.36f, 1.16f, 13.49f, -0.45f, 9.45f, 0.11f)
                curveTo(4.46f, 0.79f, 0.5f, 4.95f, 0.05f, 9.98f)
                curveToRelative(-0.27f, 2.94f, 0.62f, 5.79f, 2.5f, 8.04f)
                curveToRelative(0.29f, 0.35f, 0.46f, 0.8f, 0.46f, 1.26f)
                verticalLineToRelative(4.71f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.5f, 0f, 2.78f, -1.12f, 2.97f, -2.61f)
                lineToRelative(0.45f, -3.39f)
                horizontalLineToRelative(2.33f)
                verticalLineToRelative(-2.21f)
                lineToRelative(-0.72f, -1.65f)
                close()
                moveTo(19.92f, 13f)
                lineToRelative(-0.68f, 5.13f)
                curveToRelative(-0.07f, 0.49f, -0.49f, 0.87f, -0.99f, 0.87f)
                horizontalLineToRelative(-4.25f)
                verticalLineToRelative(3f)
                lineTo(5f, 22f)
                verticalLineToRelative(-2.71f)
                curveToRelative(0f, -0.93f, -0.33f, -1.83f, -0.92f, -2.54f)
                curveToRelative(-1.53f, -1.84f, -2.26f, -4.18f, -2.04f, -6.58f)
                curveToRelative(0.37f, -4.12f, 3.6f, -7.51f, 7.69f, -8.07f)
                curveToRelative(3.31f, -0.45f, 6.48f, 0.86f, 8.5f, 3.56f)
                curveToRelative(1.03f, 1.28f, 2.15f, 3.83f, 3.22f, 6.29f)
                lineToRelative(0.47f, 1.06f)
                horizontalLineToRelative(-1.99f)
                close()
                moveTo(16.0f, 8.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(6.0f, 7f)
                verticalLineToRelative(6f)
                lineTo(14.51f, 13f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(14.01f, 11f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _PersonBattery = it}
