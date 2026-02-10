package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CassetteTape: ImageVector? = null

val Icons.Rr.CassetteTape: ImageVector
    get() = _CassetteTape ?: UXIcon(name = "CassetteTape") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                lineTo(5f, 3f)
                curveTo(2.24f, 3f, 0f, 5.24f, 0f, 8f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 8f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 16f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-0.67f)
                lineToRelative(-0.74f, -1.11f)
                curveToRelative(-0.37f, -0.56f, -1f, -0.89f, -1.66f, -0.89f)
                horizontalLineToRelative(-7.86f)
                curveToRelative(-0.67f, 0f, -1.29f, 0.33f, -1.66f, 0.89f)
                lineToRelative(-0.74f, 1.11f)
                horizontalLineToRelative(-0.67f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                close()
                moveTo(17f, 8f)
                lineTo(7f, 8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(14.18f, 10f)
                curveToRelative(-0.11f, 0.31f, -0.18f, 0.65f, -0.18f, 1f)
                reflectiveCurveToRelative(0.07f, 0.69f, 0.18f, 1f)
                horizontalLineToRelative(-4.37f)
                curveToRelative(0.11f, -0.31f, 0.18f, -0.65f, 0.18f, -1f)
                reflectiveCurveToRelative(-0.07f, -0.69f, -0.18f, -1f)
                horizontalLineToRelative(4.37f)
                close()
                moveTo(7f, 10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(17f, 12f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _CassetteTape = it}
