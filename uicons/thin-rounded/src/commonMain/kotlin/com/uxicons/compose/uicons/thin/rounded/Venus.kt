package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Venus: ImageVector? = null

val Icons.Tr.Venus: ImageVector
    get() = _Venus ?: UXIcon(name = "Venus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8f)
                curveTo(20f, 3.59f, 16.41f, 0f, 12f, 0f)
                reflectiveCurveTo(4f, 3.59f, 4f, 8f)
                curveToRelative(0f, 4.24f, 3.32f, 7.72f, 7.5f, 7.98f)
                verticalLineToRelative(4.02f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.02f)
                curveToRelative(4.18f, -0.26f, 7.5f, -3.74f, 7.5f, -7.98f)
                close()
                moveTo(5f, 8f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                close()
            }
        }.also { _Venus = it}
