package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Forest: ImageVector? = null

val Icons.Rr.Forest: ImageVector
    get() = _Forest ?: UXIcon(name = "Forest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                curveToRelative(0f, -2.37f, -0.89f, -4.23f, -2.29f, -5.43f)
                curveTo(20.68f, 3.12f, 16.85f, 0f, 12f, 0f)
                curveToRelative(-3.21f, 0f, -5.97f, 1.36f, -7.78f, 3.57f)
                curveTo(1.83f, 4.6f, 0f, 7.11f, 0f, 11.5f)
                curveToRelative(0f, 5.13f, 2.14f, 7.5f, 5f, 8.08f)
                verticalLineToRelative(3.42f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.3f)
                curveToRelative(0.5f, -0.03f, 0.99f, -0.11f, 1.45f, -0.24f)
                curveToRelative(0.8f, 0.26f, 1.65f, 0.43f, 2.55f, 0.5f)
                verticalLineToRelative(3.04f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.04f)
                curveToRelative(0.78f, -0.06f, 1.52f, -0.19f, 2.21f, -0.39f)
                curveToRelative(0.56f, 0.21f, 1.16f, 0.35f, 1.79f, 0.4f)
                verticalLineToRelative(3.04f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.17f)
                curveToRelative(2.86f, -0.65f, 5f, -3.14f, 5f, -6.83f)
                close()
                moveTo(13f, 13.41f)
                lineToRelative(3.21f, -3.21f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-1.79f, 1.79f)
                verticalLineToRelative(-2.59f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.59f)
                lineToRelative(-1.79f, -1.79f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(3.21f, 3.21f)
                verticalLineToRelative(4.54f)
                curveToRelative(-4.28f, -0.41f, -7f, -3.43f, -7f, -7.95f)
                curveTo(4f, 5.44f, 7.44f, 2f, 12f, 2f)
                reflectiveCurveToRelative(8f, 3.44f, 8f, 8f)
                curveToRelative(0f, 4.52f, -2.72f, 7.54f, -7f, 7.95f)
                verticalLineToRelative(-4.54f)
                close()
            }
        }.also { _Forest = it}
