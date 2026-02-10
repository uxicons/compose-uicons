package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sink: ImageVector? = null

val Icons.Rs.Sink: ImageVector
    get() = _Sink ?: UXIcon(name = "Sink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                lineTo(13f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(0f, 13f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                horizontalLineToRelative(8f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(22f, 16f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                horizontalLineToRelative(-8f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Sink = it}
