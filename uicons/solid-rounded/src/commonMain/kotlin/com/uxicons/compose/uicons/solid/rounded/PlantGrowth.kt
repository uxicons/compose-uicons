package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlantGrowth: ImageVector? = null

val Icons.Sr.PlantGrowth: ImageVector
    get() = _PlantGrowth ?: UXIcon(name = "PlantGrowth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.32f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.09f, 3.27f, -1.16f, 5.87f, -3.18f, 7.72f)
                curveToRelative(-2.61f, 2.39f, -6.08f, 2.86f, -7.81f, 2.94f)
                verticalLineToRelative(2.01f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.01f)
                curveToRelative(-1.73f, -0.08f, -5.2f, -0.55f, -7.81f, -2.94f)
                curveTo(1.18f, 16.19f, 0.11f, 13.59f, 0.02f, 10.32f)
                curveToRelative(-0.02f, -0.65f, 0.25f, -1.28f, 0.74f, -1.72f)
                curveToRelative(0.49f, -0.45f, 1.15f, -0.66f, 1.8f, -0.59f)
                curveToRelative(5.66f, 0.65f, 8.26f, 4.43f, 9.45f, 7.57f)
                curveToRelative(1.19f, -3.13f, 3.79f, -6.92f, 9.45f, -7.57f)
                curveToRelative(0.65f, -0.07f, 1.31f, 0.14f, 1.8f, 0.58f)
                curveToRelative(0.49f, 0.45f, 0.76f, 1.07f, 0.74f, 1.72f)
                close()
                moveTo(9.2f, 4.72f)
                lineToRelative(1.8f, -1.74f)
                verticalLineToRelative(6.02f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(2.97f)
                lineToRelative(1.8f, 1.75f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.28f, 0.7f, 0.28f)
                curveToRelative(0.26f, 0f, 0.52f, -0.1f, 0.72f, -0.3f)
                curveToRelative(0.39f, -0.4f, 0.38f, -1.03f, -0.02f, -1.41f)
                lineTo(13.41f, 0.59f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.82f, -0.01f)
                lineToRelative(-2.79f, 2.71f)
                curveToRelative(-0.4f, 0.39f, -0.41f, 1.02f, -0.02f, 1.41f)
                curveToRelative(0.39f, 0.4f, 1.02f, 0.41f, 1.41f, 0.02f)
                close()
            }
        }.also { _PlantGrowth = it}
