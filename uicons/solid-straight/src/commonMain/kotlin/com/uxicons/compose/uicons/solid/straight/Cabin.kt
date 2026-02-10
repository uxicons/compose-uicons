package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cabin: ImageVector? = null

val Icons.Ss.Cabin: ImageVector
    get() = _Cabin ?: UXIcon(name = "Cabin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 7.68f)
                lineToRelative(-0.87f, -0.68f)
                horizontalLineToRelative(0.02f)
                lineTo(22f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.45f)
                lineTo(13.85f, 0.64f)
                curveToRelative(-1.09f, -0.85f, -2.61f, -0.85f, -3.7f, 0f)
                lineTo(1.15f, 7.68f)
                curveToRelative(-0.73f, 0.57f, -1.15f, 1.44f, -1.15f, 2.36f)
                verticalLineToRelative(0.96f)
                lineTo(24f, 11f)
                verticalLineToRelative(-0.96f)
                curveToRelative(0f, -0.93f, -0.42f, -1.79f, -1.15f, -2.36f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8f, 13f)
                verticalLineToRelative(11f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                lineTo(6f, 21f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                verticalLineToRelative(-2f)
                lineTo(6f, 17f)
                verticalLineToRelative(-2f)
                lineTo(0f, 15f)
                verticalLineToRelative(-2f)
                lineTo(8f, 13f)
                close()
                moveTo(24f, 13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                lineTo(16f, 13f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _Cabin = it}
