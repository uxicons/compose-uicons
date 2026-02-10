package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BigDrop: ImageVector? = null

val Icons.Bs.BigDrop: ImageVector
    get() = _BigDrop ?: UXIcon(name = "BigDrop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.5f)
                reflectiveCurveTo(12f, 0f, 12f, 0f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-3.5f, 0f, -3.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(9f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineTo(12f)
                horizontalLineToRelative(9f)
                close()
                moveTo(5f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }.also { _BigDrop = it}
