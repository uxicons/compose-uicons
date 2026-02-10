package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChalkboardUser: ImageVector? = null

val Icons.Sr.ChalkboardUser: ImageVector
    get() = _ChalkboardUser ?: UXIcon(name = "ChalkboardUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.87f, 3.13f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.13f, 7f, 7f)
                close()
                moveTo(7f, 6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-4.53f)
                curveToRelative(-0.94f, -1.41f, -2.27f, -2.53f, -3.84f, -3.23f)
                curveToRelative(1.44f, -1.1f, 2.37f, -2.83f, 2.37f, -4.77f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                curveToRelative(-1.08f, 0f, -2.1f, 0.29f, -2.98f, 0.79f)
                curveToRelative(0.11f, -2.66f, 2.29f, -4.79f, 4.98f, -4.79f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(20f, 15f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _ChalkboardUser = it}
