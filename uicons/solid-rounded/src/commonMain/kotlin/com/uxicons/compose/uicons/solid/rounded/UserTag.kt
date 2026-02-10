package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTag: ImageVector? = null

val Icons.Sr.UserTag: ImageVector
    get() = _UserTag ?: UXIcon(name = "UserTag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.17f, 16.11f)
                lineToRelative(-3.7f, -3.71f)
                curveToRelative(-0.66f, -0.66f, -1.6f, -0.98f, -2.52f, -0.86f)
                lineToRelative(-3.07f, 0.41f)
                curveToRelative(-1.1f, 0.15f, -1.96f, 1.05f, -2.05f, 2.16f)
                lineToRelative(-0.24f, 2.98f)
                curveToRelative(-0.07f, 0.88f, 0.25f, 1.73f, 0.86f, 2.35f)
                lineToRelative(3.71f, 3.72f)
                curveToRelative(0.54f, 0.53f, 1.24f, 0.82f, 2.0f, 0.82f)
                curveToRelative(0.0f, 0f, 0.01f, 0f, 0.01f, 0f)
                curveToRelative(0.76f, -0.0f, 1.47f, -0.3f, 2.0f, -0.84f)
                lineToRelative(3.0f, -3.04f)
                curveToRelative(1.09f, -1.1f, 1.08f, -2.9f, -0.01f, -3.99f)
                close()
                moveTo(16f, 17.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(14.17f, 24f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                curveToRelative(0.28f, 0f, 0.56f, 0.02f, 0.83f, 0.04f)
                lineToRelative(-0.23f, 2.89f)
                curveToRelative(-0.12f, 1.46f, 0.41f, 2.89f, 1.44f, 3.92f)
                lineToRelative(3.13f, 3.15f)
                close()
                moveTo(8f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _UserTag = it}
