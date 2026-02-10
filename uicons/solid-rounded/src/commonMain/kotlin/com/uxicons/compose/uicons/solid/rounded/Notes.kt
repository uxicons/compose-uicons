package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notes: ImageVector? = null

val Icons.Sr.Notes: ImageVector
    get() = _Notes ?: UXIcon(name = "Notes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 15f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4.99f)
                curveToRelative(0.01f, -0.13f, 0.01f, -0.26f, 0.01f, -0.38f)
                verticalLineToRelative(-6.62f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-10f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-5f)
                close()
                moveTo(19f, 14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.48f)
                curveToRelative(0.31f, -0.18f, 0.6f, -0.4f, 0.86f, -0.66f)
                lineToRelative(3.68f, -3.68f)
                curveToRelative(0.35f, -0.35f, 0.64f, -0.73f, 0.86f, -1.15f)
                horizontalLineToRelative(-4.4f)
                close()
                moveTo(15f, 24f)
                horizontalLineToRelative(-6f)
                curveTo(4.04f, 24f, 0f, 19.96f, 0f, 15f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Notes = it}
