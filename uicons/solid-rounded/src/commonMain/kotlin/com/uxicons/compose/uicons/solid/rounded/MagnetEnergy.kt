package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnetEnergy: ImageVector? = null

val Icons.Sr.MagnetEnergy: ImageVector
    get() = _MagnetEnergy ?: UXIcon(name = "MagnetEnergy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 7f)
                verticalLineToRelative(4.79f)
                curveToRelative(0f, 2.16f, -1.58f, 4.0f, -3.6f, 4.2f)
                curveToRelative(-1.15f, 0.11f, -2.24f, -0.25f, -3.09f, -1.02f)
                curveToRelative(-0.83f, -0.76f, -1.31f, -1.84f, -1.31f, -2.96f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(4.64f)
                curveToRelative(-0.01f, 6.78f, 5.21f, 12.36f, 12.0f, 12.36f)
                curveToRelative(3.17f, 0f, 6.14f, -1.21f, 8.4f, -3.44f)
                curveToRelative(2.32f, -2.27f, 3.59f, -5.32f, 3.59f, -8.56f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(15.0f, 3.44f)
                curveToRelative(0.27f, -0.4f, -0.07f, -0.94f, -0.56f, -0.94f)
                horizontalLineToRelative(-2f)
                lineToRelative(0.68f, -1.7f)
                curveToRelative(0.15f, -0.38f, -0.13f, -0.8f, -0.54f, -0.8f)
                horizontalLineToRelative(-1.62f)
                curveToRelative(-0.32f, 0f, -0.6f, 0.2f, -0.7f, 0.49f)
                lineToRelative(-1.33f, 3.73f)
                curveToRelative(-0.12f, 0.4f, 0.18f, 0.78f, 0.59f, 0.78f)
                horizontalLineToRelative(2.06f)
                lineToRelative(-0.79f, 2.55f)
                curveToRelative(-0.07f, 0.22f, 0.1f, 0.45f, 0.33f, 0.45f)
                curveToRelative(0.1f, 0f, 0.2f, -0.05f, 0.27f, -0.13f)
                lineToRelative(3.61f, -4.43f)
                close()
            }
        }.also { _MagnetEnergy = it}
