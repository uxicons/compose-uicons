package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Squircle: ImageVector? = null

val Icons.Rr.Squircle: ImageVector
    get() = _Squircle ?: UXIcon(name = "Squircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-0.77f, 0f, -1.81f, -0.06f, -3.18f, -0.18f)
                curveTo(4.23f, 23.4f, 0.6f, 19.77f, 0.18f, 15.18f)
                curveToRelative(-0.12f, -1.34f, -0.18f, -2.41f, -0.18f, -3.18f)
                reflectiveCurveToRelative(0.06f, -1.83f, 0.18f, -3.18f)
                curveTo(0.6f, 4.23f, 4.23f, 0.6f, 8.82f, 0.18f)
                curveToRelative(1.37f, -0.12f, 2.41f, -0.18f, 3.18f, -0.18f)
                reflectiveCurveToRelative(1.81f, 0.06f, 3.18f, 0.18f)
                curveToRelative(4.59f, 0.42f, 8.23f, 4.05f, 8.64f, 8.64f)
                curveToRelative(0.12f, 1.34f, 0.18f, 2.41f, 0.18f, 3.18f)
                reflectiveCurveToRelative(-0.06f, 1.83f, -0.18f, 3.18f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.42f, 4.59f, -4.05f, 8.22f, -8.64f, 8.64f)
                curveToRelative(-1.37f, 0.12f, -2.41f, 0.18f, -3.18f, 0.18f)
                close()
                moveTo(12f, 2f)
                curveToRelative(-0.7f, 0f, -1.7f, 0.06f, -3f, 0.17f)
                curveToRelative(-3.63f, 0.33f, -6.5f, 3.2f, -6.83f, 6.83f)
                curveToRelative(-0.12f, 1.29f, -0.18f, 2.29f, -0.18f, 3f)
                reflectiveCurveToRelative(0.06f, 1.71f, 0.18f, 3f)
                curveToRelative(0.33f, 3.63f, 3.2f, 6.5f, 6.83f, 6.83f)
                curveToRelative(1.29f, 0.12f, 2.3f, 0.17f, 3f, 0.17f)
                reflectiveCurveToRelative(1.7f, -0.06f, 3f, -0.17f)
                curveToRelative(3.63f, -0.33f, 6.5f, -3.2f, 6.83f, -6.83f)
                curveToRelative(0.12f, -1.29f, 0.18f, -2.29f, 0.18f, -3f)
                reflectiveCurveToRelative(-0.06f, -1.71f, -0.18f, -3f)
                curveToRelative(-0.33f, -3.63f, -3.2f, -6.5f, -6.83f, -6.83f)
                curveToRelative(-1.29f, -0.12f, -2.3f, -0.17f, -3f, -0.17f)
                close()
                moveTo(22.82f, 15.09f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _Squircle = it}
