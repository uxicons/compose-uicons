package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserWriter: ImageVector? = null

val Icons.Sr.UserWriter: ImageVector
    get() = _UserWriter ?: UXIcon(name = "UserWriter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(12.31f, 0f, 9f, 0f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(23.97f, 13.1f)
                curveToRelative(-0.39f, 1.53f, -1.61f, 4.45f, -4.12f, 6.47f)
                curveToRelative(-1.13f, 0.91f, -2.29f, 1.47f, -3.36f, 1.81f)
                curveToRelative(0f, 0f, 1f, -3.38f, 4.07f, -6.94f)
                curveToRelative(-3.1f, 1.72f, -5.31f, 4.83f, -6.28f, 7.41f)
                curveToRelative(-0.18f, 0.46f, -0.33f, 0.94f, -0.46f, 1.41f)
                curveToRelative(-0.12f, 0.45f, -0.54f, 0.75f, -1.0f, 0.75f)
                curveToRelative(-0.68f, 0f, -1.19f, -0.65f, -1.0f, -1.31f)
                curveToRelative(0.14f, -0.5f, 0.3f, -1f, 0.5f, -1.5f)
                curveToRelative(0.17f, -1.36f, 0.99f, -4.67f, 3.75f, -6.91f)
                curveToRelative(2.46f, -1.99f, 5.5f, -2.29f, 7.02f, -2.29f)
                curveToRelative(0.58f, 0f, 1.01f, 0.53f, 0.87f, 1.09f)
                close()
                moveTo(9.91f, 22.14f)
                curveToRelative(-0.18f, 0.62f, -0.13f, 1.26f, 0.08f, 1.85f)
                lineTo(1f, 24.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                curveToRelative(1.36f, 0f, 2.65f, 0.31f, 3.81f, 0.86f)
                curveToRelative(-1.74f, 2.35f, -2.28f, 4.87f, -2.42f, 5.83f)
                curveToRelative(-0.17f, 0.45f, -0.33f, 0.93f, -0.48f, 1.46f)
                close()
            }
        }.also { _UserWriter = it}
