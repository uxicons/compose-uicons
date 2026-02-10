package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonChalkboard: ImageVector? = null

val Icons.Sr.PersonChalkboard: ImageVector
    get() = _PersonChalkboard ?: UXIcon(name = "PersonChalkboard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2.5f)
                curveTo(2f, 1.12f, 3.12f, 0f, 4.5f, 0f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(8f, 8f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6.56f)
                curveToRelative(-1.19f, -0.69f, -2f, -1.97f, -2f, -3.44f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                lineTo(14f, 6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(19.5f, 0f)
                lineTo(8.24f, 0f)
                curveToRelative(0.48f, 0.72f, 0.76f, 1.57f, 0.76f, 2.5f)
                curveToRelative(0f, 0.53f, -0.11f, 1.03f, -0.28f, 1.5f)
                horizontalLineToRelative(5.28f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(9.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }.also { _PersonChalkboard = it}
