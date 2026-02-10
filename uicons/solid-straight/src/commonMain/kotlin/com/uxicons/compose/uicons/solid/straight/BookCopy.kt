package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookCopy: ImageVector? = null

val Icons.Ss.BookCopy: ImageVector
    get() = _BookCopy ?: UXIcon(name = "BookCopy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 20f)
                horizontalLineToRelative(14f)
                reflectiveCurveToRelative(0f, 4f, 0f, 4f)
                lineTo(2f, 24f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(14f)
                reflectiveCurveToRelative(0f, 4f, 0f, 4f)
                horizontalLineToRelative(-14f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
                moveTo(11f, 0f)
                horizontalLineToRelative(11f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(10f)
                reflectiveCurveToRelative(-14f, 0f, -14f, 0f)
                curveToRelative(-0.74f, -0.0f, -1.45f, 0.27f, -2f, 0.77f)
                lineTo(8f, 3f)
                curveTo(8f, 1.34f, 9.34f, 0f, 11f, 0f)
                close()
                moveTo(6f, 16f)
                lineTo(6f, 6f)
                horizontalLineToRelative(-3f)
                curveTo(1.34f, 6f, 0f, 7.34f, 0f, 9f)
                verticalLineToRelative(9.77f)
                curveToRelative(0.55f, -0.49f, 1.26f, -0.77f, 2f, -0.77f)
                horizontalLineToRelative(4.54f)
                curveToRelative(-0.34f, -0.59f, -0.54f, -1.27f, -0.54f, -2f)
                close()
            }
        }.also { _BookCopy = it}
