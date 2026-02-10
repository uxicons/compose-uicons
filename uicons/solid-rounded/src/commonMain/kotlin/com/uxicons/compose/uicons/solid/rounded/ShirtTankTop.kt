package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtTankTop: ImageVector? = null

val Icons.Sr.ShirtTankTop: ImageVector
    get() = _ShirtTankTop ?: UXIcon(name = "ShirtTankTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.65f, 8.47f)
                curveToRelative(-1.03f, -0.65f, -1.65f, -1.76f, -1.65f, -2.97f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.22f, -0.62f, 2.33f, -1.65f, 2.97f)
                curveToRelative(-0.83f, 0.52f, -1.35f, 1.48f, -1.35f, 2.5f)
                verticalLineToRelative(8.03f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8.03f)
                curveToRelative(0f, -1.02f, -0.52f, -1.98f, -1.35f, -2.5f)
                close()
            }
        }.also { _ShirtTankTop = it}
