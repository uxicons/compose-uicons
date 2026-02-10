package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TintSlash: ImageVector? = null

val Icons.Sr.TintSlash: ImageVector
    get() = _TintSlash ?: UXIcon(name = "TintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(3.9f, 3.9f)
                curveToRelative(1.17f, -1.25f, 2.35f, -2.31f, 3.18f, -3.02f)
                curveToRelative(1.86f, -1.58f, 4.57f, -1.58f, 6.43f, 0f)
                curveToRelative(2.91f, 2.47f, 7.79f, 7.29f, 7.79f, 11.82f)
                curveToRelative(0f, 2.34f, -0.74f, 4.61f, -2.11f, 6.48f)
                lineToRelative(2.82f, 2.82f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(4.08f, 8.17f)
                curveToRelative(-0.22f, -0.22f, -0.53f, -0.33f, -0.84f, -0.28f)
                reflectiveCurveToRelative(-0.58f, 0.23f, -0.73f, 0.5f)
                curveToRelative(-1.01f, 1.82f, -1.5f, 3.32f, -1.5f, 4.61f)
                curveToRelative(0f, 2.94f, 1.14f, 5.7f, 3.22f, 7.78f)
                curveToRelative(2.08f, 2.08f, 4.84f, 3.22f, 7.78f, 3.22f)
                curveToRelative(1.72f, 0f, 3.43f, -0.41f, 4.95f, -1.18f)
                curveToRelative(0.29f, -0.14f, 0.49f, -0.42f, 0.54f, -0.73f)
                curveToRelative(0.05f, -0.32f, -0.06f, -0.64f, -0.28f, -0.87f)
                lineTo(4.08f, 8.17f)
                close()
            }
        }.also { _TintSlash = it}
