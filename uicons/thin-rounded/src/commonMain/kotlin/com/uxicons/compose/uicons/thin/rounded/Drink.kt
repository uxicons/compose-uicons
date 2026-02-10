package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drink: ImageVector? = null

val Icons.Tr.Drink: ImageVector
    get() = _Drink ?: UXIcon(name = "Drink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.81f, 1.77f)
                curveToRelative(-0.42f, -1.07f, -1.43f, -1.77f, -2.56f, -1.77f)
                lineTo(2.75f, 0f)
                curveTo(1.62f, 0f, 0.61f, 0.69f, 0.19f, 1.77f)
                curveTo(-0.21f, 2.8f, 0.03f, 3.9f, 0.87f, 4.67f)
                lineToRelative(8.5f, 7.31f)
                curveToRelative(0.62f, 0.56f, 1.36f, 0.89f, 2.13f, 0.99f)
                verticalLineToRelative(10.03f)
                lineTo(6.5f, 23f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                lineTo(12.5f, 12.97f)
                curveToRelative(0.77f, -0.1f, 1.51f, -0.42f, 2.12f, -0.98f)
                lineToRelative(8.56f, -7.36f)
                curveToRelative(0.8f, -0.74f, 1.04f, -1.83f, 0.64f, -2.86f)
                close()
                moveTo(22.48f, 3.92f)
                lineToRelative(-8.52f, 7.33f)
                curveToRelative(-0.55f, 0.5f, -1.27f, 0.75f, -1.95f, 0.76f)
                curveToRelative(-0.69f, -0.01f, -1.41f, -0.26f, -1.96f, -0.76f)
                lineTo(2.79f, 5f)
                horizontalLineToRelative(14.71f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(1.62f, 4f)
                lineToRelative(-0.12f, -0.1f)
                curveToRelative(-0.49f, -0.46f, -0.64f, -1.12f, -0.38f, -1.76f)
                curveToRelative(0.27f, -0.69f, 0.91f, -1.13f, 1.63f, -1.13f)
                lineTo(21.25f, 1f)
                curveToRelative(0.72f, 0f, 1.36f, 0.45f, 1.63f, 1.13f)
                curveToRelative(0.25f, 0.65f, 0.11f, 1.31f, -0.4f, 1.78f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-0.01f, 0f, 0.01f, 0f, 0f, 0f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _Drink = it}
