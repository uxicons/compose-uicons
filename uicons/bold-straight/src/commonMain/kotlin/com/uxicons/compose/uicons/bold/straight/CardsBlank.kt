package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardsBlank: ImageVector? = null

val Icons.Bs.CardsBlank: ImageVector
    get() = _CardsBlank ?: UXIcon(name = "CardsBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.59f, 4.41f)
                curveToRelative(-0.43f, -0.79f, -1.15f, -1.36f, -1.99f, -1.61f)
                lineTo(12.78f, 0.14f)
                curveToRelative(-0.86f, -0.25f, -1.77f, -0.15f, -2.56f, 0.28f)
                curveToRelative(-0.79f, 0.43f, -1.36f, 1.15f, -1.61f, 2.0f)
                lineToRelative(-0.48f, 1.59f)
                lineTo(3.5f, 4f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(0f, 24f)
                lineTo(16f, 24f)
                verticalLineToRelative(-2.33f)
                lineToRelative(3.23f, 1.2f)
                lineToRelative(4.63f, -15.9f)
                curveToRelative(0.25f, -0.86f, 0.15f, -1.77f, -0.28f, -2.56f)
                close()
                moveTo(13f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 7.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(12.5f, 7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(20.98f, 6.13f)
                lineToRelative(-3.73f, 12.8f)
                lineToRelative(-1.26f, -0.47f)
                lineTo(16.0f, 7.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.23f)
                lineToRelative(0.22f, -0.74f)
                curveToRelative(0.04f, -0.12f, 0.11f, -0.18f, 0.17f, -0.22f)
                curveToRelative(0.06f, -0.03f, 0.16f, -0.07f, 0.26f, -0.04f)
                lineToRelative(8.81f, 2.67f)
                curveToRelative(0.12f, 0.04f, 0.18f, 0.12f, 0.22f, 0.17f)
                curveToRelative(0.03f, 0.06f, 0.07f, 0.16f, 0.03f, 0.28f)
                close()
            }
        }.also { _CardsBlank = it}
