package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sink: ImageVector? = null

val Icons.Bs.Sink: ImageVector
    get() = _Sink ?: UXIcon(name = "Sink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                lineTo(13.5f, 4.75f)
                curveToRelative(0f, -0.96f, 0.79f, -1.75f, 1.75f, -1.75f)
                reflectiveCurveToRelative(1.75f, 0.79f, 1.75f, 1.75f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0f, -2.62f, -2.13f, -4.75f, -4.75f, -4.75f)
                reflectiveCurveToRelative(-4.75f, 2.13f, -4.75f, 4.75f)
                verticalLineToRelative(8.25f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                lineTo(0f, 13f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 4.69f, 3.81f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(7f)
                curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(15.5f, 21f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.86f, 0f, -5.22f, -2.2f, -5.48f, -5f)
                horizontalLineToRelative(17.95f)
                curveToRelative(-0.25f, 2.8f, -2.61f, 5f, -5.48f, 5f)
                close()
            }
        }.also { _Sink = it}
