package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Algorithm: ImageVector? = null

val Icons.Ss.Algorithm: ImageVector
    get() = _Algorithm ?: UXIcon(name = "Algorithm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 7.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(23.5f, 17.59f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.29f, 2.29f)
                lineTo(6.95f, 18f)
                curveToRelative(-0.22f, -1.53f, -1.42f, -2.73f, -2.95f, -2.95f)
                lineTo(4f, 6.95f)
                curveToRelative(1.53f, -0.22f, 2.73f, -1.42f, 2.95f, -2.95f)
                horizontalLineToRelative(10.1f)
                curveToRelative(0.24f, 1.69f, 1.69f, 3f, 3.45f, 3f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.39f, 0f, -2.58f, 0.82f, -3.15f, 2f)
                lineTo(6.65f, 2f)
                curveToRelative(-0.56f, -1.18f, -1.76f, -2f, -3.15f, -2f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                curveToRelative(0f, 1.39f, 0.82f, 2.58f, 2f, 3.15f)
                verticalLineToRelative(8.7f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.76f, -2f, 3.15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.39f, 0f, 2.58f, -0.82f, 3.15f, -2f)
                horizontalLineToRelative(14.44f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.29f, -3.29f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                close()
            }
        }.also { _Algorithm = it}
