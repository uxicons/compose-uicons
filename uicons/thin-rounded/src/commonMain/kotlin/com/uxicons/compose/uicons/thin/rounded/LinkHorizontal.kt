package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkHorizontal: ImageVector? = null

val Icons.Tr.LinkHorizontal: ImageVector
    get() = _LinkHorizontal ?: UXIcon(name = "LinkHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(5f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                curveToRelative(0f, -1.96f, -1.05f, -3.78f, -2.75f, -4.76f)
                curveToRelative(-0.24f, -0.14f, -0.32f, -0.44f, -0.18f, -0.68f)
                curveToRelative(0.14f, -0.24f, 0.44f, -0.32f, 0.68f, -0.18f)
                curveToRelative(2.0f, 1.16f, 3.25f, 3.32f, 3.25f, 5.63f)
                close()
                moveTo(3.75f, 13.27f)
                curveToRelative(-1.7f, -0.98f, -2.75f, -2.81f, -2.75f, -4.76f)
                curveTo(1f, 5.47f, 3.47f, 3f, 6.5f, 3f)
                horizontalLineToRelative(5f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                horizontalLineTo(6.5f)
                curveTo(2.92f, 2f, 0f, 4.92f, 0f, 8.5f)
                curveToRelative(0f, 2.31f, 1.25f, 4.47f, 3.25f, 5.63f)
                curveToRelative(0.24f, 0.14f, 0.55f, 0.06f, 0.68f, -0.18f)
                curveToRelative(0.14f, -0.24f, 0.06f, -0.55f, -0.18f, -0.68f)
                close()
            }
        }.also { _LinkHorizontal = it}
