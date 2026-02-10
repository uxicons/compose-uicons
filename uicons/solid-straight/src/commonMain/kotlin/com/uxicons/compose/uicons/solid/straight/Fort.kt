package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fort: ImageVector? = null

val Icons.Ss.Fort: ImageVector
    get() = _Fort ?: UXIcon(name = "Fort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 7f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Fort = it}
