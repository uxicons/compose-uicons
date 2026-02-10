package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlantGrowth: ImageVector? = null

val Icons.Ts.PlantGrowth: ImageVector
    get() = _PlantGrowth ?: UXIcon(name = "PlantGrowth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.94f, 8.47f)
                lineToRelative(-0.03f, -0.48f)
                lineToRelative(-0.48f, 0.01f)
                curveToRelative(-7.78f, 0.13f, -10.51f, 5.89f, -11.46f, 9.53f)
                curveToRelative(-0.95f, -3.65f, -3.69f, -9.41f, -11.46f, -9.53f)
                lineToRelative(-0.48f, -0.01f)
                lineToRelative(-0.03f, 0.48f)
                curveToRelative(-0.22f, 4.06f, 0.78f, 7.22f, 2.99f, 9.39f)
                curveToRelative(2.9f, 2.86f, 6.99f, 3.14f, 8.46f, 3.14f)
                curveToRelative(0.02f, 0f, 0.03f, 0f, 0.04f, 0f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3.01f)
                curveToRelative(1.49f, -0.0f, 5.55f, -0.29f, 8.45f, -3.13f)
                curveToRelative(2.21f, -2.17f, 3.21f, -5.33f, 2.99f, -9.39f)
                close()
                moveTo(3.69f, 17.15f)
                curveTo(1.79f, 15.28f, 0.87f, 12.54f, 0.98f, 9.02f)
                curveToRelative(8.8f, 0.44f, 10.23f, 8.79f, 10.45f, 10.98f)
                curveToRelative(-1.35f, -0.01f, -5.13f, -0.28f, -7.74f, -2.85f)
                close()
                moveTo(12.51f, 20.0f)
                curveToRelative(0.22f, -2.19f, 1.65f, -10.54f, 10.45f, -10.98f)
                curveToRelative(0.1f, 3.52f, -0.81f, 6.25f, -2.71f, 8.13f)
                curveToRelative(-2.6f, 2.56f, -6.39f, 2.84f, -7.74f, 2.85f)
                close()
                moveTo(8.15f, 4.65f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(10.94f, 0.44f)
                curveToRelative(0.58f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.35f, -3.35f)
                lineTo(12.5f, 10f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 1.29f)
                lineToRelative(-3.35f, 3.35f)
                close()
            }
        }.also { _PlantGrowth = it}
