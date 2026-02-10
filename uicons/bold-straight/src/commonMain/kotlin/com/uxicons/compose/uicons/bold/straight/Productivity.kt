package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Productivity: ImageVector? = null

val Icons.Bs.Productivity: ImageVector
    get() = _Productivity ?: UXIcon(name = "Productivity") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 12f)
                curveToRelative(0f, -1.28f, -0.25f, -2.51f, -0.7f, -3.64f)
                lineToRelative(1.84f, -1.06f)
                lineToRelative(-1.5f, -2.6f)
                lineToRelative(-1.84f, 1.06f)
                curveToRelative(-1.54f, -1.92f, -3.77f, -3.25f, -6.3f, -3.64f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.12f)
                curveToRelative(-2.54f, 0.39f, -4.77f, 1.72f, -6.3f, 3.64f)
                lineToRelative(-1.84f, -1.06f)
                lineToRelative(-1.5f, 2.6f)
                lineToRelative(1.84f, 1.06f)
                curveToRelative(-0.44f, 1.13f, -0.7f, 2.35f, -0.7f, 3.64f)
                reflectiveCurveToRelative(0.25f, 2.51f, 0.7f, 3.64f)
                lineToRelative(-1.84f, 1.06f)
                lineToRelative(1.5f, 2.6f)
                lineToRelative(1.84f, -1.06f)
                curveToRelative(1.54f, 1.92f, 3.77f, 3.25f, 6.3f, 3.64f)
                verticalLineToRelative(2.12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.12f)
                curveToRelative(2.54f, -0.39f, 4.77f, -1.72f, 6.3f, -3.64f)
                lineToRelative(1.84f, 1.06f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(-1.84f, -1.06f)
                curveToRelative(0.44f, -1.13f, 0.7f, -2.35f, 0.7f, -3.64f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
                moveTo(16.5f, 11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.79f, -3.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.79f, 3.71f)
                close()
            }
        }.also { _Productivity = it}
