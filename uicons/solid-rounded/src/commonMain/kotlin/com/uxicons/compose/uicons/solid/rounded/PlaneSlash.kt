package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneSlash: ImageVector? = null

val Icons.Sr.PlaneSlash: ImageVector
    get() = _PlaneSlash ?: UXIcon(name = "PlaneSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                lineToRelative(-6.55f, -6.55f)
                lineToRelative(0.42f, -0.74f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.88f, 0f, 1.71f, -0.39f, 2.29f, -1.06f)
                reflectiveCurveToRelative(0.82f, -1.56f, 0.67f, -2.44f)
                curveToRelative(-0.23f, -1.43f, -1.55f, -2.5f, -3.07f, -2.5f)
                horizontalLineToRelative(-3.31f)
                lineTo(13.32f, 1.56f)
                curveToRelative(-0.53f, -0.96f, -1.53f, -1.56f, -2.63f, -1.56f)
                curveToRelative(-0.86f, 0f, -1.68f, 0.42f, -2.18f, 1.12f)
                curveToRelative(-0.5f, 0.7f, -0.64f, 1.61f, -0.36f, 2.44f)
                lineToRelative(1.75f, 4.92f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(14.48f, 18.72f)
                curveToRelative(0.37f, 0.37f, 0.44f, 0.94f, 0.18f, 1.39f)
                lineToRelative(-1.34f, 2.35f)
                curveToRelative(-0.52f, 0.95f, -1.52f, 1.55f, -2.62f, 1.55f)
                curveToRelative(-0.86f, 0f, -1.68f, -0.42f, -2.18f, -1.12f)
                curveToRelative(-0.5f, -0.7f, -0.64f, -1.61f, -0.36f, -2.43f)
                lineToRelative(1.94f, -5.45f)
                horizontalLineToRelative(-4.55f)
                lineToRelative(-1.42f, 1.9f)
                curveToRelative(-0.45f, 0.69f, -1.21f, 1.1f, -2.04f, 1.1f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.68f, 0f, -1.31f, -0.33f, -1.7f, -0.89f)
                curveTo(0f, 16.56f, -0.09f, 15.85f, 0.14f, 15.21f)
                lineToRelative(1.87f, -3.21f)
                lineTo(0.14f, 8.79f)
                curveTo(-0.09f, 8.15f, 0f, 7.44f, 0.39f, 6.89f)
                curveToRelative(0.0f, -0.01f, 0.01f, -0.01f, 0.01f, -0.01f)
                curveToRelative(0.49f, -0.69f, 1.54f, -0.7f, 2.14f, -0.1f)
                lineToRelative(11.95f, 11.95f)
                close()
            }
        }.also { _PlaneSlash = it}
