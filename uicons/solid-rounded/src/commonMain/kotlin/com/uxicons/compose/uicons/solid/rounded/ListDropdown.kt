package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListDropdown: ImageVector? = null

val Icons.Sr.ListDropdown: ImageVector
    get() = _ListDropdown ?: UXIcon(name = "ListDropdown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 10f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 10f)
                lineTo(0f, 10f)
                close()
                moveTo(18f, 20f)
                lineTo(6f, 20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(18f, 16f)
                lineTo(6f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(3f)
                lineTo(24f, 8f)
                close()
                moveTo(14.08f, 3f)
                horizontalLineToRelative(4.87f)
                curveToRelative(0.69f, 0f, 1.03f, 0.83f, 0.54f, 1.31f)
                lineToRelative(-2.44f, 2.23f)
                curveToRelative(-0.3f, 0.3f, -0.79f, 0.3f, -1.09f, 0f)
                lineToRelative(-2.44f, -2.23f)
                curveToRelative(-0.48f, -0.48f, -0.14f, -1.31f, 0.54f, -1.31f)
                close()
            }
        }.also { _ListDropdown = it}
