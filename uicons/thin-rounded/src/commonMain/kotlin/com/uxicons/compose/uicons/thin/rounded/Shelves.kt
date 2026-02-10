package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shelves: ImageVector? = null

val Icons.Tr.Shelves: ImageVector
    get() = _Shelves ?: UXIcon(name = "Shelves") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                lineTo(1f, 8f)
                lineTo(1f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(23f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(24f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(16f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-7f)
                lineTo(16f, 2.5f)
                close()
                moveTo(1f, 14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                lineTo(1f, 20f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(16f, 20f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(17f, 20f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.82f, 0f, -1.54f, 0.39f, -2f, 1.0f)
                curveToRelative(-0.46f, -0.61f, -1.18f, -1.0f, -2f, -1.0f)
                lineTo(2.5f, 12f)
                curveToRelative(-0.56f, 0f, -1.08f, 0.19f, -1.5f, 0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Shelves = it}
