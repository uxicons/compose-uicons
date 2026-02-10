package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChalkboardUser: ImageVector? = null

val Icons.Sc.ChalkboardUser: ImageVector
    get() = _ChalkboardUser ?: UXIcon(name = "ChalkboardUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 15f)
                curveToRelative(-2.69f, 0f, -4f, -1.31f, -4f, -4f)
                reflectiveCurveToRelative(1.31f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.31f, 4f, 4f)
                reflectiveCurveToRelative(-1.31f, 4f, -4f, 4f)
                close()
                moveTo(7f, 16f)
                curveToRelative(-4.15f, 0f, -6f, 1.85f, -6f, 6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -4.15f, -1.85f, -6f, -6f, -6f)
                close()
                moveTo(22.15f, 2.5f)
                curveToRelative(-0.1f, -0.3f, -0.33f, -0.54f, -0.63f, -0.64f)
                curveToRelative(-0.1f, -0.04f, -2.61f, -0.86f, -7.52f, -0.86f)
                reflectiveCurveToRelative(-7.42f, 0.83f, -7.52f, 0.86f)
                curveToRelative(-0.3f, 0.1f, -0.53f, 0.34f, -0.63f, 0.64f)
                curveToRelative(-0.02f, 0.07f, -0.35f, 1.1f, -0.6f, 2.7f)
                curveToRelative(0.54f, -0.12f, 1.11f, -0.2f, 1.75f, -0.2f)
                curveToRelative(3.81f, 0f, 6f, 2.19f, 6f, 6f)
                curveToRelative(0f, 1.71f, -0.45f, 3.09f, -1.28f, 4.1f)
                curveToRelative(0.43f, 0.25f, 0.83f, 0.54f, 1.17f, 0.88f)
                curveToRelative(0.36f, 0.01f, 0.71f, 0.02f, 1.1f, 0.02f)
                curveToRelative(4.91f, 0f, 7.42f, -0.83f, 7.52f, -0.86f)
                curveToRelative(0.3f, -0.1f, 0.53f, -0.34f, 0.63f, -0.64f)
                curveToRelative(0.04f, -0.1f, 0.85f, -2.63f, 0.85f, -6.0f)
                reflectiveCurveToRelative(-0.81f, -5.89f, -0.85f, -6.0f)
                close()
                moveTo(19.13f, 13.75f)
                curveToRelative(-0.6f, 0.09f, -1.27f, 0.18f, -2.02f, 0.25f)
                curveToRelative(-0.55f, 0.05f, -1.05f, -0.34f, -1.1f, -0.89f)
                curveToRelative(-0.05f, -0.54f, 0.36f, -1.03f, 0.91f, -1.08f)
                curveToRelative(0.71f, -0.07f, 1.34f, -0.15f, 1.91f, -0.23f)
                curveToRelative(0.55f, -0.09f, 1.07f, 0.28f, 1.16f, 0.82f)
                curveToRelative(0.08f, 0.54f, -0.29f, 1.04f, -0.85f, 1.13f)
                close()
            }
        }.also { _ChalkboardUser = it}
