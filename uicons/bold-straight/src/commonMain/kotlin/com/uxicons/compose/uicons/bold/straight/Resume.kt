package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Resume: ImageVector? = null

val Icons.Bs.Resume: ImageVector
    get() = _Resume ?: UXIcon(name = "Resume") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.43f, 0f)
                lineTo(5.55f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(2.05f, 24f)
                lineTo(22.0f, 24f)
                lineToRelative(0.05f, -18.33f)
                lineTo(16.43f, 0f)
                close()
                moveTo(5.05f, 21f)
                lineTo(5.05f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(14.05f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-0.04f, 13f)
                lineTo(5.05f, 21f)
                close()
                moveTo(7f, 16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                lineTo(7f, 19f)
                verticalLineToRelative(-3f)
                close()
                moveTo(8.5f, 8f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(14f, 14f)
                lineTo(7f, 14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Resume = it}
