package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Review: ImageVector? = null

val Icons.Sr.Review: ImageVector
    get() = _Review ?: UXIcon(name = "Review") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(14.74f, 24f)
                curveToRelative(-0.21f, 0f, -0.42f, -0.07f, -0.6f, -0.2f)
                curveToRelative(-0.34f, -0.25f, -0.48f, -0.7f, -0.35f, -1.1f)
                lineToRelative(0.94f, -3.02f)
                lineToRelative(-2.38f, -1.93f)
                curveToRelative(-0.32f, -0.27f, -0.44f, -0.71f, -0.29f, -1.11f)
                curveToRelative(0.14f, -0.39f, 0.52f, -0.66f, 0.94f, -0.66f)
                horizontalLineToRelative(3.0f)
                lineToRelative(1.06f, -2.98f)
                curveToRelative(0.15f, -0.39f, 0.52f, -0.65f, 0.94f, -0.65f)
                reflectiveCurveToRelative(0.79f, 0.26f, 0.94f, 0.65f)
                lineToRelative(1.06f, 2.98f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.42f, 0f, 0.8f, 0.26f, 0.94f, 0.66f)
                reflectiveCurveToRelative(0.03f, 0.84f, -0.29f, 1.11f)
                lineToRelative(-2.37f, 1.93f)
                lineToRelative(0.98f, 2.98f)
                curveToRelative(0.13f, 0.4f, -0.0f, 0.85f, -0.34f, 1.11f)
                curveToRelative(-0.34f, 0.26f, -0.8f, 0.28f, -1.16f, 0.05f)
                lineToRelative(-2.75f, -1.79f)
                lineToRelative(-2.71f, 1.81f)
                curveToRelative(-0.17f, 0.11f, -0.36f, 0.17f, -0.56f, 0.17f)
                close()
                moveTo(9.94f, 24f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                horizontalLineToRelative(0.94f)
                curveToRelative(0.35f, 0f, 0.67f, 0.18f, 0.85f, 0.47f)
                curveToRelative(0.18f, 0.29f, 0.2f, 0.66f, 0.04f, 0.97f)
                curveToRelative(-0.55f, 1.11f, -0.83f, 2.31f, -0.83f, 3.56f)
                reflectiveCurveToRelative(0.28f, 2.44f, 0.83f, 3.56f)
                curveToRelative(0.15f, 0.31f, 0.14f, 0.68f, -0.04f, 0.97f)
                curveToRelative(-0.18f, 0.29f, -0.5f, 0.47f, -0.85f, 0.47f)
                close()
            }
        }.also { _Review = it}
