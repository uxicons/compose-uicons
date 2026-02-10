package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlantGrowth: ImageVector? = null

val Icons.Bs.PlantGrowth: ImageVector
    get() = _PlantGrowth ?: UXIcon(name = "PlantGrowth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.97f, 8.92f)
                lineToRelative(-0.08f, -1.44f)
                lineToRelative(-1.44f, 0.02f)
                curveToRelative(-5.63f, 0.09f, -8.81f, 3.17f, -10.45f, 6.48f)
                curveToRelative(-1.64f, -3.31f, -4.82f, -6.39f, -10.45f, -6.48f)
                lineToRelative(-1.44f, -0.02f)
                lineToRelative(-0.08f, 1.44f)
                curveToRelative(-0.22f, 3.92f, 0.78f, 7.01f, 2.98f, 9.17f)
                curveToRelative(2.39f, 2.36f, 5.59f, 2.98f, 7.49f, 3.13f)
                verticalLineToRelative(2.8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.8f)
                curveToRelative(1.9f, -0.15f, 5.09f, -0.77f, 7.49f, -3.13f)
                curveToRelative(2.2f, -2.17f, 3.2f, -5.25f, 2.98f, -9.17f)
                close()
                moveTo(5.1f, 15.94f)
                curveToRelative(-1.27f, -1.26f, -1.97f, -3.05f, -2.09f, -5.31f)
                curveToRelative(5.12f, 0.79f, 6.74f, 5.13f, 7.25f, 7.55f)
                curveToRelative(-1.46f, -0.17f, -3.61f, -0.69f, -5.17f, -2.24f)
                close()
                moveTo(18.89f, 15.94f)
                curveToRelative(-1.56f, 1.54f, -3.71f, 2.07f, -5.17f, 2.24f)
                curveToRelative(0.51f, -2.43f, 2.14f, -6.76f, 7.25f, -7.55f)
                curveToRelative(-0.11f, 2.27f, -0.81f, 4.05f, -2.09f, 5.31f)
                close()
                moveTo(10.5f, 5f)
                horizontalLineToRelative(-3.63f)
                lineTo(11.1f, 0.37f)
                curveToRelative(0.44f, -0.49f, 1.22f, -0.49f, 1.66f, 0f)
                lineToRelative(4.24f, 4.63f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 5f)
                close()
            }
        }.also { _PlantGrowth = it}
