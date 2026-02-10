package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterSlash: ImageVector? = null

val Icons.Rr.FilterSlash: ImageVector
    get() = _FilterSlash ?: UXIcon(name = "FilterSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-7.41f, -7.41f)
                lineToRelative(4.34f, -4.48f)
                curveToRelative(0.9f, -0.93f, 1.4f, -2.15f, 1.4f, -3.45f)
                curveToRelative(0f, -2.73f, -2.22f, -4.95f, -4.95f, -4.95f)
                lineTo(6.95f, 2.0f)
                curveToRelative(-0.97f, 0f, -1.91f, 0.3f, -2.71f, 0.82f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(6.95f, 4f)
                horizontalLineToRelative(10.14f)
                curveToRelative(1.63f, 0f, 2.95f, 1.32f, 2.95f, 2.95f)
                curveToRelative(0f, 0.77f, -0.3f, 1.5f, -0.83f, 2.06f)
                lineToRelative(-4.32f, 4.46f)
                lineTo(5.7f, 4.29f)
                curveToRelative(0.39f, -0.18f, 0.81f, -0.29f, 1.25f, -0.29f)
                close()
                moveTo(15f, 19f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.38f, -0.21f, 0.72f, -0.55f, 0.9f)
                curveToRelative(-0.14f, 0.07f, -0.29f, 0.1f, -0.45f, 0.1f)
                curveToRelative(-0.21f, 0f, -0.42f, -0.07f, -0.6f, -0.2f)
                lineToRelative(-4f, -3f)
                curveToRelative(-0.25f, -0.19f, -0.4f, -0.48f, -0.4f, -0.8f)
                verticalLineToRelative(-3.84f)
                lineTo(3.4f, 10.4f)
                curveToRelative(-0.43f, -0.44f, -0.76f, -0.95f, -1.0f, -1.51f)
                curveToRelative(-0.22f, -0.51f, 0.02f, -1.1f, 0.53f, -1.31f)
                curveToRelative(0.51f, -0.22f, 1.09f, 0.02f, 1.31f, 0.53f)
                curveToRelative(0.14f, 0.34f, 0.34f, 0.64f, 0.6f, 0.9f)
                lineToRelative(5.88f, 6.04f)
                curveToRelative(0.18f, 0.19f, 0.28f, 0.44f, 0.28f, 0.7f)
                verticalLineToRelative(3.75f)
                lineToRelative(2f, 1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _FilterSlash = it}
