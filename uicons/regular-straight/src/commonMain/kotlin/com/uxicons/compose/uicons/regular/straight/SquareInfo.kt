package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareInfo: ImageVector? = null

val Icons.Rs.SquareInfo: ImageVector
    get() = _SquareInfo ?: UXIcon(name = "SquareInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(7f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                close()
            }
        }.also { _SquareInfo = it}
