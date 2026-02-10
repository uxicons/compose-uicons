package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Squircle: ImageVector? = null

val Icons.Tr.Squircle: ImageVector
    get() = _Squircle ?: UXIcon(name = "Squircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-0.78f, 0f, -1.88f, -0.06f, -3.27f, -0.19f)
                curveTo(4.19f, 23.4f, 0.6f, 19.81f, 0.19f, 15.27f)
                curveToRelative(-0.13f, -1.39f, -0.19f, -2.49f, -0.19f, -3.27f)
                reflectiveCurveToRelative(0.06f, -1.88f, 0.19f, -3.27f)
                curveTo(0.6f, 4.19f, 4.19f, 0.6f, 8.73f, 0.19f)
                curveToRelative(1.39f, -0.13f, 2.49f, -0.19f, 3.27f, -0.19f)
                reflectiveCurveToRelative(1.88f, 0.06f, 3.27f, 0.19f)
                curveToRelative(4.54f, 0.41f, 8.13f, 4f, 8.54f, 8.54f)
                curveToRelative(0.13f, 1.39f, 0.19f, 2.49f, 0.19f, 3.27f)
                reflectiveCurveToRelative(-0.06f, 1.88f, -0.19f, 3.27f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.41f, 4.54f, -4f, 8.13f, -8.54f, 8.54f)
                curveToRelative(-1.39f, 0.13f, -2.49f, 0.19f, -3.27f, 0.19f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-0.75f, 0f, -1.82f, 0.06f, -3.18f, 0.19f)
                curveTo(4.76f, 1.55f, 1.55f, 4.76f, 1.19f, 8.82f)
                curveToRelative(-0.12f, 1.36f, -0.19f, 2.43f, -0.19f, 3.18f)
                reflectiveCurveToRelative(0.06f, 1.82f, 0.19f, 3.18f)
                curveToRelative(0.37f, 4.06f, 3.58f, 7.27f, 7.63f, 7.63f)
                curveToRelative(1.36f, 0.12f, 2.43f, 0.19f, 3.18f, 0.19f)
                reflectiveCurveToRelative(1.82f, -0.06f, 3.18f, -0.19f)
                curveToRelative(4.06f, -0.37f, 7.27f, -3.58f, 7.63f, -7.63f)
                horizontalLineToRelative(0f)
                curveToRelative(0.12f, -1.36f, 0.19f, -2.43f, 0.19f, -3.18f)
                reflectiveCurveToRelative(-0.06f, -1.82f, -0.19f, -3.18f)
                curveToRelative(-0.37f, -4.06f, -3.58f, -7.27f, -7.63f, -7.63f)
                curveToRelative(-1.36f, -0.12f, -2.43f, -0.19f, -3.18f, -0.19f)
                close()
            }
        }.also { _Squircle = it}
