package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ObjectGroup: ImageVector? = null

val Icons.Sr.ObjectGroup: ImageVector
    get() = _ObjectGroup ?: UXIcon(name = "ObjectGroup") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(24f, 21f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                curveToRelative(-1.31f, 0f, -2.42f, -0.83f, -2.83f, -2f)
                lineTo(5.83f, 22f)
                curveToRelative(-0.41f, 1.17f, -1.52f, 2f, -2.83f, 2f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                curveToRelative(0f, -1.31f, 0.83f, -2.42f, 2f, -2.83f)
                lineTo(2f, 5.83f)
                curveToRelative(-1.17f, -0.41f, -2f, -1.52f, -2f, -2.83f)
                curveTo(0f, 1.34f, 1.34f, 0f, 3f, 0f)
                curveToRelative(1.31f, 0f, 2.42f, 0.83f, 2.83f, 2f)
                horizontalLineToRelative(12.34f)
                curveToRelative(0.41f, -1.17f, 1.52f, -2f, 2.83f, -2f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                curveToRelative(0f, 1.31f, -0.83f, 2.42f, -2f, 2.83f)
                verticalLineToRelative(12.34f)
                curveToRelative(1.17f, 0.41f, 2f, 1.52f, 2f, 2.83f)
                close()
                moveTo(3.99f, 18.17f)
                reflectiveCurveToRelative(0f, -0.0f, -0.0f, 0f)
                curveToRelative(0f, 0f, 0.0f, 0f, 0.0f, 0f)
                close()
                moveTo(20f, 5.83f)
                curveToRelative(-0.85f, -0.3f, -1.53f, -0.98f, -1.83f, -1.83f)
                lineTo(5.83f, 4f)
                curveToRelative(-0.3f, 0.85f, -0.98f, 1.53f, -1.83f, 1.83f)
                verticalLineToRelative(12.34f)
                curveToRelative(0.85f, 0.3f, 1.53f, 0.98f, 1.83f, 1.83f)
                horizontalLineToRelative(12.34f)
                curveToRelative(0.3f, -0.85f, 0.98f, -1.53f, 1.83f, -1.83f)
                lineTo(20f, 5.83f)
                close()
                moveTo(17f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ObjectGroup = it}
