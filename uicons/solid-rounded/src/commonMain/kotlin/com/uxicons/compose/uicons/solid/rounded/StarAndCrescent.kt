package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarAndCrescent: ImageVector? = null

val Icons.Sr.StarAndCrescent: ImageVector
    get() = _StarAndCrescent ?: UXIcon(name = "StarAndCrescent") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.76f, 22.16f)
                curveToRelative(0.87f, 0.5f, 0.57f, 1.71f, -0.45f, 1.79f)
                curveToRelative(-0.45f, 0.04f, -0.9f, 0.05f, -1.38f, 0.05f)
                curveTo(4.77f, 24.0f, -1.64f, 16.97f, 0.37f, 9.08f)
                curveTo(1.86f, 3.24f, 7.8f, -0.46f, 14.25f, 0.05f)
                curveToRelative(0.04f, 0.0f, 0.07f, 0.01f, 0.11f, 0.01f)
                curveToRelative(0.99f, 0.09f, 1.25f, 1.3f, 0.4f, 1.79f)
                curveToRelative(-3.67f, 2.11f, -6.76f, 5.85f, -6.76f, 10.15f)
                reflectiveCurveToRelative(3.08f, 8.05f, 6.76f, 10.16f)
                close()
                moveTo(16.75f, 16.56f)
                lineToRelative(2.26f, -1.51f)
                lineToRelative(2.29f, 1.5f)
                curveToRelative(0.3f, 0.19f, 0.68f, 0.18f, 0.96f, -0.04f)
                curveToRelative(0.28f, -0.22f, 0.39f, -0.59f, 0.28f, -0.92f)
                lineToRelative(-0.81f, -2.48f)
                lineToRelative(1.97f, -1.61f)
                curveToRelative(0.27f, -0.23f, 0.37f, -0.59f, 0.25f, -0.92f)
                reflectiveCurveToRelative(-0.43f, -0.55f, -0.78f, -0.55f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-0.89f, -2.48f)
                curveToRelative(-0.12f, -0.33f, -0.43f, -0.54f, -0.78f, -0.54f)
                reflectiveCurveToRelative(-0.66f, 0.22f, -0.78f, 0.54f)
                lineToRelative(-0.89f, 2.48f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.35f, 0f, -0.66f, 0.22f, -0.78f, 0.55f)
                curveToRelative(-0.12f, 0.33f, -0.02f, 0.7f, 0.24f, 0.92f)
                lineToRelative(1.98f, 1.61f)
                lineToRelative(-0.78f, 2.51f)
                curveToRelative(-0.11f, 0.34f, 0.01f, 0.7f, 0.29f, 0.92f)
                curveToRelative(0.15f, 0.11f, 0.32f, 0.17f, 0.5f, 0.17f)
                curveToRelative(0.16f, 0f, 0.32f, -0.05f, 0.46f, -0.14f)
                close()
            }
        }.also { _StarAndCrescent = it}
