package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserBag: ImageVector? = null

val Icons.Sr.UserBag: ImageVector
    get() = _UserBag ?: UXIcon(name = "UserBag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(22f, 14.05f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(0.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(16f, 14f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(10f, 20f)
                curveToRelative(0f, 1.54f, 0.59f, 2.94f, 1.54f, 4f)
                lineTo(2f, 24f)
                curveToRelative(-1.3f, 0f, -2f, -1.03f, -2f, -2f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                curveToRelative(0.88f, 0f, 1.73f, 0.15f, 2.52f, 0.41f)
                curveToRelative(-0.33f, 0.63f, -0.52f, 1.34f, -0.52f, 2.09f)
                verticalLineToRelative(3.5f)
                close()
            }
        }.also { _UserBag = it}
