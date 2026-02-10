package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Calendar: ImageVector? = null

val Icons.Ts.Calendar: ImageVector
    get() = _Calendar ?: UXIcon(name = "Calendar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                horizontalLineToRelative(-3.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                verticalLineTo(2f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineTo(21.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                verticalLineTo(9f)
                horizontalLineTo(23f)
                verticalLineToRelative(14f)
                horizontalLineTo(1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Calendar = it}
