package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sink: ImageVector? = null

val Icons.Ts.Sink: ImageVector
    get() = _Sink ?: UXIcon(name = "Sink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6.5f)
                lineTo(12.5f, 4.25f)
                curveToRelative(0f, -1.79f, 1.46f, -3.25f, 3.25f, -3.25f)
                reflectiveCurveToRelative(3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0f, -2.34f, -1.91f, -4.25f, -4.25f, -4.25f)
                reflectiveCurveToRelative(-4.25f, 1.91f, -4.25f, 4.25f)
                verticalLineToRelative(8.75f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                lineTo(0f, 13f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 4.14f, 3.36f, 7.5f, 7.5f, 7.5f)
                horizontalLineToRelative(9f)
                curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(23f, 16.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                lineTo(7.5f, 23f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _Sink = it}
