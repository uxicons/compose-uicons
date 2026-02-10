package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paste: ImageVector? = null

val Icons.Sr.Paste: ImageVector
    get() = _Paste ?: UXIcon(name = "Paste") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(20f, 9f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(20f, 19f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(16f, 7f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.42f, -1.73f, -4.42f, -4.01f, -4.88f)
                curveToRelative(-0.07f, 2.15f, -1.82f, 3.88f, -3.99f, 3.88f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.17f, 0f, -3.94f, -1.74f, -3.99f, -3.9f)
                curveTo(1.73f, 2.56f, 0f, 4.58f, 0f, 7f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6.53f)
                curveToRelative(-0.95f, -1.06f, -1.53f, -2.46f, -1.53f, -4f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                close()
            }
        }.also { _Paste = it}
