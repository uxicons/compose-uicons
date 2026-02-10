package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trailer: ImageVector? = null

val Icons.Ts.Trailer: ImageVector
    get() = _Trailer ?: UXIcon(name = "Trailer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 20f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 18.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.54f)
                curveToRelative(0.24f, 1.69f, 1.7f, 3f, 3.46f, 3f)
                reflectiveCurveToRelative(3.22f, -1.31f, 3.46f, -3f)
                horizontalLineToRelative(13.04f)
                verticalLineToRelative(-1f)
                close()
                moveTo(2.5f, 1f)
                lineTo(18.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(20f, 13f)
                horizontalLineToRelative(-3f)
                lineTo(17f, 3.5f)
                horizontalLineToRelative(-1f)
                lineTo(16f, 13f)
                horizontalLineToRelative(-3f)
                lineTo(13f, 3.5f)
                horizontalLineToRelative(-1f)
                lineTo(12f, 13f)
                horizontalLineToRelative(-3f)
                lineTo(9f, 3.5f)
                horizontalLineToRelative(-1f)
                lineTo(8f, 13f)
                horizontalLineToRelative(-3f)
                lineTo(5f, 3.5f)
                horizontalLineToRelative(-1f)
                lineTo(4f, 13f)
                lineTo(1f, 13f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 18.5f)
                verticalLineToRelative(-4.5f)
                lineTo(20f, 14f)
                verticalLineToRelative(6f)
                lineTo(10.96f, 20f)
                curveToRelative(-0.24f, -1.69f, -1.7f, -3f, -3.46f, -3f)
                reflectiveCurveToRelative(-3.22f, 1.31f, -3.46f, 3f)
                horizontalLineToRelative(-1.54f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(7.5f, 23f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _Trailer = it}
