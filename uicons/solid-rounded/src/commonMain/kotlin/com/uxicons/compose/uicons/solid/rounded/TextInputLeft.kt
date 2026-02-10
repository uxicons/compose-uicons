package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextInputLeft: ImageVector? = null

val Icons.Sr.TextInputLeft: ImageVector
    get() = _TextInputLeft ?: UXIcon(name = "TextInputLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineToRelative(2f)
                lineTo(7f, 21f)
                horizontalLineToRelative(-2f)
                curveTo(2.24f, 21f, 0f, 18.76f, 0f, 16f)
                lineTo(0f, 8f)
                curveTo(0f, 5.24f, 2.24f, 3f, 5f, 3f)
                close()
                moveTo(19f, 3f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(9f, 21f)
                lineTo(9f, 3f)
                horizontalLineToRelative(10f)
                close()
                moveTo(14f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(9f, 21f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                curveToRelative(0.77f, 0f, 1.47f, -0.29f, 2f, -0.77f)
                curveToRelative(0.53f, 0.48f, 1.23f, 0.77f, 2f, 0.77f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(7f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveTo(11f, 0.45f, 10.55f, 0f, 10f, 0f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.29f, -2f, 0.77f)
                curveTo(7.47f, 0.29f, 6.77f, 0f, 6f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _TextInputLeft = it}
