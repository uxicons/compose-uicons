package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shelves: ImageVector? = null

val Icons.Ts.Shelves: ImageVector
    get() = _Shelves ?: UXIcon(name = "Shelves") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(6f)
                lineTo(1f, 8f)
                lineTo(1f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(16f, 2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7f)
                reflectiveCurveToRelative(-7f, 0f, -7f, 0f)
                lineTo(16f, 2f)
                close()
                moveTo(1f, 14f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                lineTo(1f, 20f)
                verticalLineToRelative(-6f)
                close()
                moveTo(16f, 20f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                close()
                moveTo(17f, 20f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.6f, 0f, -1.13f, 0.26f, -1.5f, 0.68f)
                curveToRelative(-0.37f, -0.42f, -0.9f, -0.68f, -1.5f, -0.68f)
                lineTo(2f, 12f)
                curveToRelative(-0.36f, 0f, -0.71f, 0.1f, -1f, 0.27f)
                verticalLineToRelative(-3.27f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Shelves = it}
