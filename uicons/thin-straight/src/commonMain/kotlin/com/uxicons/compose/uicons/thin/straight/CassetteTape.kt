package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CassetteTape: ImageVector? = null

val Icons.Ts.CassetteTape: ImageVector
    get() = _CassetteTape ?: UXIcon(name = "CassetteTape") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 3f)
                lineTo(2.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                lineTo(24f, 21f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5.93f, 20f)
                lineToRelative(1.33f, -2f)
                horizontalLineToRelative(9.46f)
                lineToRelative(1.33f, 2f)
                lineTo(5.93f, 20f)
                close()
                moveTo(23f, 20f)
                horizontalLineToRelative(-3.73f)
                lineToRelative(-2f, -3f)
                lineTo(6.73f, 17f)
                lineToRelative(-2f, 3f)
                lineTo(1f, 20f)
                lineTo(1f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                close()
                moveTo(17f, 8f)
                lineTo(7f, 8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(14.77f, 9f)
                curveToRelative(-0.48f, 0.53f, -0.77f, 1.23f, -0.77f, 2f)
                reflectiveCurveToRelative(0.29f, 1.47f, 0.77f, 2f)
                horizontalLineToRelative(-5.53f)
                curveToRelative(0.48f, -0.53f, 0.77f, -1.23f, 0.77f, -2f)
                reflectiveCurveToRelative(-0.29f, -1.47f, -0.77f, -2f)
                horizontalLineToRelative(5.53f)
                close()
                moveTo(5f, 11f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(17f, 13f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _CassetteTape = it}
