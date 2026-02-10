package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Journey: ImageVector? = null

val Icons.Sr.Journey: ImageVector
    get() = _Journey ?: UXIcon(name = "Journey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 16.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(6.78f, 23.63f)
                curveToRelative(0.19f, -0.23f, 0.27f, -0.54f, 0.2f, -0.83f)
                curveToRelative(-0.34f, -1.62f, -1.8f, -2.8f, -3.48f, -2.8f)
                reflectiveCurveTo(0.36f, 21.18f, 0.02f, 22.8f)
                curveToRelative(-0.06f, 0.29f, 0.01f, 0.6f, 0.2f, 0.83f)
                reflectiveCurveToRelative(0.47f, 0.37f, 0.78f, 0.37f)
                horizontalLineToRelative(5f)
                curveToRelative(0.3f, 0f, 0.58f, -0.14f, 0.78f, -0.37f)
                close()
                moveTo(3.5f, 22f)
                horizontalLineToRelative(0.01f)
                horizontalLineToRelative(-0.01f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                close()
                moveTo(15.5f, 7.39f)
                lineToRelative(-0.86f, 2.77f)
                curveToRelative(-0.12f, 0.37f, 0.01f, 0.78f, 0.33f, 1.01f)
                curveToRelative(0.16f, 0.12f, 0.36f, 0.18f, 0.55f, 0.18f)
                curveToRelative(0.18f, 0f, 0.35f, -0.05f, 0.51f, -0.15f)
                lineToRelative(2.48f, -1.66f)
                lineToRelative(2.52f, 1.64f)
                curveToRelative(0.33f, 0.21f, 0.75f, 0.2f, 1.06f, -0.04f)
                curveToRelative(0.31f, -0.24f, 0.43f, -0.65f, 0.31f, -1.01f)
                lineToRelative(-0.9f, -2.73f)
                lineToRelative(2.17f, -1.77f)
                curveToRelative(0.29f, -0.25f, 0.4f, -0.65f, 0.27f, -1.02f)
                curveToRelative(-0.13f, -0.36f, -0.48f, -0.6f, -0.86f, -0.6f)
                horizontalLineToRelative(-2.75f)
                lineToRelative(-0.97f, -2.73f)
                curveToRelative(-0.13f, -0.36f, -0.48f, -0.6f, -0.86f, -0.6f)
                reflectiveCurveToRelative(-0.73f, 0.24f, -0.86f, 0.6f)
                lineToRelative(-0.97f, 2.73f)
                horizontalLineToRelative(-2.75f)
                curveToRelative(-0.38f, 0f, -0.73f, 0.24f, -0.86f, 0.6f)
                curveToRelative(-0.13f, 0.36f, -0.03f, 0.77f, 0.27f, 1.01f)
                lineToRelative(2.18f, 1.77f)
                close()
            }
        }.also { _Journey = it}
