package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExpandArrows: ImageVector? = null

val Icons.Tr.ExpandArrows: ImageVector
    get() = _ExpandArrows ?: UXIcon(name = "ExpandArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.23f, 0f, 0.45f, 0.06f, 0.64f, 0.15f)
                lineTo(12f, 11.29f)
                lineTo(1.86f, 1.15f)
                curveToRelative(0.2f, -0.09f, 0.41f, -0.15f, 0.64f, -0.15f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.23f, 0.06f, -0.45f, 0.15f, -0.64f)
                lineTo(11.29f, 12f)
                lineTo(1.15f, 22.14f)
                curveToRelative(-0.09f, -0.2f, -0.15f, -0.41f, -0.15f, -0.64f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.23f, 0f, -0.45f, -0.06f, -0.64f, -0.15f)
                lineTo(12f, 12.71f)
                lineToRelative(10.14f, 10.14f)
                curveToRelative(-0.2f, 0.09f, -0.41f, 0.15f, -0.64f, 0.15f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.23f, -0.06f, 0.45f, -0.15f, 0.64f)
                lineTo(12.71f, 12f)
                lineTo(22.85f, 1.86f)
                curveToRelative(0.09f, 0.2f, 0.15f, 0.41f, 0.15f, 0.64f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _ExpandArrows = it}
