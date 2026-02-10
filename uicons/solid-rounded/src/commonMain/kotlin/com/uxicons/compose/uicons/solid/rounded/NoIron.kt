package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoIron: ImageVector? = null

val Icons.Sr.NoIron: ImageVector
    get() = _NoIron ?: UXIcon(name = "NoIron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.21f, 20.79f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineTo(10.42f, 9.0f)
                curveToRelative(0.01f, 0f, 0.03f, -0.0f, 0.04f, -0.0f)
                horizontalLineToRelative(11.46f)
                curveToRelative(-0.48f, -2.83f, -2.95f, -5f, -5.92f, -5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.53f, -0.7f, 2.88f, -1.79f, 3.79f)
                close()
                moveTo(0.08f, 17.88f)
                curveToRelative(-0.08f, 0.45f, -0.31f, 1.82f, 0.62f, 2.92f)
                curveToRelative(0.68f, 0.8f, 1.77f, 1.21f, 3.26f, 1.21f)
                horizontalLineToRelative(13.82f)
                lineTo(5.84f, 10.06f)
                curveTo(2.85f, 11.52f, 0.64f, 14.36f, 0.08f, 17.88f)
                close()
            }
        }.also { _NoIron = it}
