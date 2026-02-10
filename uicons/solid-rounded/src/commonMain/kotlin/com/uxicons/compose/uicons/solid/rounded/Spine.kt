package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spine: ImageVector? = null

val Icons.Sr.Spine: ImageVector
    get() = _Spine ?: UXIcon(name = "Spine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 3.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.49f)
                curveToRelative(0.74f, -1.48f, 2.25f, -2.5f, 4.01f, -2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.76f, 0f, 3.27f, 1.02f, 4.01f, 2.5f)
                horizontalLineToRelative(2.49f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(20f, 19.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.49f)
                curveToRelative(0.74f, 1.48f, 2.25f, 2.5f, 4.01f, 2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.76f, 0f, 3.27f, -1.02f, 4.01f, -2.5f)
                horizontalLineToRelative(2.49f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(4f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _Spine = it}
