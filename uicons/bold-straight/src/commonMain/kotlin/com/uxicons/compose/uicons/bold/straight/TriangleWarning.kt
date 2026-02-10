package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleWarning: ImageVector? = null

val Icons.Bs.TriangleWarning: ImageVector
    get() = _TriangleWarning ?: UXIcon(name = "TriangleWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.6f, 20.48f)
                curveToRelative(-0.54f, 0.95f, -1.52f, 1.52f, -2.62f, 1.52f)
                horizontalLineToRelative(-4.98f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.98f)
                lineTo(12.02f, 4.02f)
                lineTo(3f, 19.01f)
                horizontalLineToRelative(5f)
                reflectiveCurveToRelative(0f, 2.99f, 0f, 2.99f)
                lineTo(3.02f, 22f)
                curveToRelative(-1.1f, 0f, -2.08f, -0.57f, -2.62f, -1.52f)
                curveToRelative(-0.54f, -0.95f, -0.53f, -2.07f, 0.02f, -3.01f)
                lineTo(9.4f, 2.48f)
                curveToRelative(0.54f, -0.92f, 1.51f, -1.48f, 2.6f, -1.48f)
                reflectiveCurveToRelative(2.06f, 0.56f, 2.6f, 1.49f)
                lineToRelative(8.98f, 14.98f)
                curveToRelative(0.56f, 0.95f, 0.56f, 2.07f, 0.02f, 3.02f)
                close()
                moveTo(10.5f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                close()
                moveTo(10.5f, 22f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _TriangleWarning = it}
