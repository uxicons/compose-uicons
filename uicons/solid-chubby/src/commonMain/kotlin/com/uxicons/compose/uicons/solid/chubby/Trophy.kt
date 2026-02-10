package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trophy: ImageVector? = null

val Icons.Sc.Trophy: ImageVector
    get() = _Trophy ?: UXIcon(name = "Trophy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.78f, 7.82f)
                horizontalLineToRelative(-0.41f)
                lineTo(19.36f, 2.92f)
                curveToRelative(0f, -0.44f, -0.29f, -0.82f, -0.71f, -0.94f)
                curveTo(14.05f, 0.67f, 9.95f, 0.67f, 5.34f, 1.98f)
                curveToRelative(-0.42f, 0.12f, -0.71f, 0.5f, -0.71f, 0.94f)
                lineTo(4.64f, 7.82f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(-1.43f, 0f, -2.59f, 1.17f, -2.59f, 2.6f)
                verticalLineToRelative(0.84f)
                curveToRelative(0f, 2.34f, 1.9f, 4.24f, 4.23f, 4.24f)
                horizontalLineToRelative(1.81f)
                curveToRelative(0.31f, 0.21f, 0.64f, 0.4f, 0.98f, 0.55f)
                curveToRelative(0.52f, 0.24f, 0.79f, 0.82f, 0.64f, 1.4f)
                lineToRelative(-0.67f, 2.56f)
                horizontalLineToRelative(-1.72f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(10.19f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.72f)
                lineToRelative(-0.67f, -2.56f)
                curveToRelative(-0.15f, -0.57f, 0.12f, -1.16f, 0.64f, -1.4f)
                curveToRelative(0.35f, -0.16f, 0.68f, -0.34f, 0.98f, -0.55f)
                horizontalLineToRelative(1.81f)
                curveToRelative(2.33f, 0f, 4.23f, -1.9f, 4.23f, -4.24f)
                verticalLineToRelative(-0.84f)
                curveToRelative(0f, -1.43f, -1.16f, -2.6f, -2.59f, -2.6f)
                close()
                moveTo(3.63f, 11.26f)
                verticalLineToRelative(-0.84f)
                curveToRelative(0f, -0.33f, 0.27f, -0.6f, 0.59f, -0.6f)
                horizontalLineToRelative(0.41f)
                curveToRelative(0.01f, 1.33f, 0.4f, 2.6f, 1.09f, 3.67f)
                curveToRelative(-1.17f, -0.07f, -2.09f, -1.05f, -2.09f, -2.24f)
                close()
                moveTo(20.37f, 11.26f)
                curveToRelative(0f, 1.19f, -0.93f, 2.17f, -2.09f, 2.24f)
                curveToRelative(0.69f, -1.08f, 1.08f, -2.35f, 1.09f, -3.67f)
                horizontalLineToRelative(0.41f)
                curveToRelative(0.33f, 0f, 0.59f, 0.27f, 0.59f, 0.6f)
                verticalLineToRelative(0.84f)
                close()
            }
        }.also { _Trophy = it}
