package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CassetteTape: ImageVector? = null

val Icons.Bs.CassetteTape: ImageVector
    get() = _CassetteTape ?: UXIcon(name = "CassetteTape") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 3f)
                lineTo(3.5f, 3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                lineTo(24f, 21f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-2.8f)
                lineToRelative(-1.2f, -2f)
                lineTo(7f, 16f)
                lineToRelative(-1.33f, 2f)
                lineTo(3f, 18f)
                lineTo(3f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(14.56f, 9f)
                curveToRelative(-0.34f, 0.59f, -0.56f, 1.27f, -0.56f, 2f)
                reflectiveCurveToRelative(0.21f, 1.41f, 0.56f, 2f)
                horizontalLineToRelative(-5.11f)
                curveToRelative(0.34f, -0.59f, 0.56f, -1.27f, 0.56f, -2f)
                reflectiveCurveToRelative(-0.21f, -1.41f, -0.56f, -2f)
                horizontalLineToRelative(5.11f)
                close()
                moveTo(8f, 11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(20f, 11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _CassetteTape = it}
