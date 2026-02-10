package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaravanAlt: ImageVector? = null

val Icons.Ts.CaravanAlt: ImageVector
    get() = _CaravanAlt ?: UXIcon(name = "CaravanAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 20f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 21f)
                lineTo(4.04f, 21f)
                curveToRelative(0.24f, 1.69f, 1.7f, 3f, 3.46f, 3f)
                reflectiveCurveToRelative(3.22f, -1.31f, 3.46f, -3f)
                horizontalLineToRelative(13.04f)
                verticalLineToRelative(-1f)
                close()
                moveTo(1f, 7f)
                lineTo(7f, 7f)
                verticalLineToRelative(4f)
                lineTo(1f, 11f)
                lineTo(1f, 7f)
                close()
                moveTo(1f, 12f)
                horizontalLineToRelative(7f)
                lineTo(8f, 6f)
                lineTo(1f, 6f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(18.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(20f, 20f)
                lineTo(10.96f, 20f)
                curveToRelative(-0.24f, -1.69f, -1.7f, -3f, -3.46f, -3f)
                reflectiveCurveToRelative(-3.22f, 1.31f, -3.46f, 3f)
                lineTo(1f, 20f)
                lineTo(1f, 12f)
                close()
                moveTo(7.5f, 23f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(17f, 6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                lineTo(17f, 6f)
                close()
                moveTo(16f, 11f)
                horizontalLineToRelative(-4f)
                lineTo(12f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _CaravanAlt = it}
