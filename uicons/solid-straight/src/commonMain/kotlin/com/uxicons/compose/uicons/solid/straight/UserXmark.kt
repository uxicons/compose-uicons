package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserXmark: ImageVector? = null

val Icons.Ss.UserXmark: ImageVector
    get() = _UserXmark ?: UXIcon(name = "UserXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(11f, 14f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(20.91f, 11.5f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.79f, -2.79f)
                lineToRelative(-2.79f, 2.79f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.79f, -2.79f)
                lineToRelative(-2.79f, -2.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(2.79f, -2.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.79f, 2.79f)
                close()
            }
        }.also { _UserXmark = it}
