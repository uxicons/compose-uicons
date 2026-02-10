package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Algorithm: ImageVector? = null

val Icons.Sr.Algorithm: ImageVector
    get() = _Algorithm ?: UXIcon(name = "Algorithm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 11f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.73f, 14.32f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.05f)
                curveToRelative(-0.4f, 0.38f, -0.42f, 1.01f, -0.05f, 1.41f)
                lineToRelative(2.16f, 2.32f)
                horizontalLineTo(6.96f)
                curveToRelative(-0.22f, -1.53f, -1.43f, -2.74f, -2.96f, -2.96f)
                verticalLineTo(6.96f)
                curveToRelative(1.53f, -0.22f, 2.74f, -1.43f, 2.96f, -2.96f)
                horizontalLineToRelative(10.07f)
                curveToRelative(0.24f, 1.69f, 1.7f, 3f, 3.46f, 3f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.39f, 0f, -2.6f, 0.82f, -3.16f, 2f)
                horizontalLineTo(6.66f)
                curveToRelative(-0.56f, -1.18f, -1.77f, -2f, -3.16f, -2f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                curveToRelative(0f, 1.39f, 0.82f, 2.6f, 2f, 3.16f)
                verticalLineToRelative(8.68f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.39f, 0f, 2.6f, -0.82f, 3.16f, -2f)
                horizontalLineToRelative(14.77f)
                lineToRelative(-2.16f, 2.32f)
                curveToRelative(-0.38f, 0.4f, -0.35f, 1.04f, 0.05f, 1.41f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0f, 0.53f, -0.11f, 0.73f, -0.32f)
                lineToRelative(2.39f, -2.56f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.85f, -2.1f)
                lineToRelative(-2.41f, -2.59f)
                close()
            }
        }.also { _Algorithm = it}
