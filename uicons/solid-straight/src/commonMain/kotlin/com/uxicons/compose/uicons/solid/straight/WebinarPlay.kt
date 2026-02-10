package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WebinarPlay: ImageVector? = null

val Icons.Ss.WebinarPlay: ImageVector
    get() = _WebinarPlay ?: UXIcon(name = "WebinarPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(21.31f, 0f, 18f, 0f)
                close()
                moveTo(16f, 9.06f)
                lineTo(16f, 2.94f)
                lineToRelative(5.5f, 3.06f)
                lineToRelative(-5.5f, 3.06f)
                close()
                moveTo(24f, 20f)
                lineTo(24f, 11.28f)
                curveToRelative(-1.47f, 1.67f, -3.61f, 2.72f, -6f, 2.72f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                curveToRelative(0f, -1.46f, 0.4f, -2.82f, 1.08f, -4f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                verticalLineToRelative(15.5f)
                lineTo(11f, 20f)
                verticalLineToRelative(2f)
                lineTo(6f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                close()
                moveTo(6f, 7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(10f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(2f, 17f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _WebinarPlay = it}
