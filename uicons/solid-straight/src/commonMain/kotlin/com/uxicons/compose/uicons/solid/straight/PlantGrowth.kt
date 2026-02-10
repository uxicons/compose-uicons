package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlantGrowth: ImageVector? = null

val Icons.Ss.PlantGrowth: ImageVector
    get() = _PlantGrowth ?: UXIcon(name = "PlantGrowth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.97f, 8.94f)
                lineToRelative(-0.06f, -0.96f)
                lineToRelative(-0.96f, 0.01f)
                curveToRelative(-6.71f, 0.1f, -9.66f, 4.23f, -10.96f, 7.61f)
                curveToRelative(-1.29f, -3.38f, -4.25f, -7.5f, -10.96f, -7.61f)
                lineToRelative(-0.96f, -0.01f)
                lineToRelative(-0.06f, 0.96f)
                curveToRelative(-0.22f, 3.8f, 0.75f, 6.79f, 2.87f, 8.89f)
                curveToRelative(2.63f, 2.61f, 6.3f, 3.08f, 8.1f, 3.15f)
                verticalLineToRelative(3.02f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.02f)
                curveToRelative(1.79f, -0.07f, 5.46f, -0.55f, 8.1f, -3.15f)
                curveToRelative(2.12f, -2.1f, 3.09f, -5.09f, 2.87f, -8.89f)
                close()
                moveTo(8.5f, 5.5f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(10.59f, 0.59f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.5f, -2.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 3f)
                lineToRelative(-2.5f, 2.5f)
                close()
            }
        }.also { _PlantGrowth = it}
