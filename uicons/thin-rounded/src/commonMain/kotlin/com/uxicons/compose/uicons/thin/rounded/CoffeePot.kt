package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeePot: ImageVector? = null

val Icons.Tr.CoffeePot: ImageVector
    get() = _CoffeePot ?: UXIcon(name = "CoffeePot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.15f, 2.84f)
                curveToRelative(-0.68f, -1.73f, -2.32f, -2.84f, -4.18f, -2.84f)
                lineTo(2.5f, 0f)
                curveToRelative(-0.17f, 0f, -0.32f, 0.08f, -0.41f, 0.22f)
                curveToRelative(-0.09f, 0.14f, -0.11f, 0.31f, -0.05f, 0.47f)
                lineToRelative(1.91f, 4.78f)
                curveTo(3.33f, 6.55f, 0.74f, 11.56f, 0.02f, 19.05f)
                curveToRelative(-0.12f, 1.27f, 0.3f, 2.53f, 1.15f, 3.47f)
                curveToRelative(0.85f, 0.94f, 2.06f, 1.48f, 3.33f, 1.48f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.26f, 0f, 2.48f, -0.54f, 3.33f, -1.48f)
                curveToRelative(0.85f, -0.94f, 1.27f, -2.21f, 1.15f, -3.47f)
                curveToRelative(-0.75f, -7.74f, -3.49f, -12.83f, -3.98f, -13.69f)
                lineTo(17.0f, 1f)
                horizontalLineToRelative(0.96f)
                curveToRelative(1.45f, 0f, 2.73f, 0.87f, 3.25f, 2.21f)
                curveToRelative(0.81f, 2.07f, 1.78f, 5.36f, 1.78f, 9.29f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -4.09f, -1.01f, -7.51f, -1.85f, -9.66f)
                close()
                moveTo(19.09f, 21.85f)
                curveToRelative(-0.67f, 0.74f, -1.59f, 1.15f, -2.59f, 1.15f)
                lineTo(4.5f, 23.0f)
                curveToRelative(-1.0f, 0f, -1.92f, -0.41f, -2.59f, -1.15f)
                curveToRelative(-0.67f, -0.73f, -0.99f, -1.72f, -0.9f, -2.71f)
                curveToRelative(0.22f, -2.3f, 0.63f, -4.36f, 1.1f, -6.15f)
                lineTo(15.5f, 13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(2.4f, 12f)
                curveToRelative(0.94f, -3.19f, 2.02f, -5.31f, 2.39f, -6f)
                horizontalLineToRelative(11.42f)
                curveToRelative(0.61f, 1.12f, 3.09f, 6.04f, 3.78f, 13.15f)
                curveToRelative(0.1f, 0.99f, -0.23f, 1.97f, -0.9f, 2.71f)
                close()
                moveTo(16f, 5.0f)
                lineTo(4.84f, 5.0f)
                lineTo(3.24f, 1f)
                horizontalLineToRelative(12.76f)
                lineTo(16f, 5f)
                close()
            }
        }.also { _CoffeePot = it}
