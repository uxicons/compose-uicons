package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsDown: ImageVector? = null

val Icons.Ts.ChevronDoubleDotsDown: ImageVector
    get() = _ChevronDoubleDotsDown ?: UXIcon(name = "ChevronDoubleDotsDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(12f, 14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(12f, 6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(12f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(12f, 19f)
                curveToRelative(0.43f, 0f, 0.83f, -0.17f, 1.12f, -0.46f)
                lineToRelative(7.72f, -7.18f)
                lineToRelative(-0.68f, -0.73f)
                lineToRelative(-7.73f, 7.19f)
                curveToRelative(-0.23f, 0.23f, -0.61f, 0.24f, -0.86f, -0.01f)
                lineToRelative(-7.72f, -7.18f)
                lineToRelative(-0.68f, 0.73f)
                lineToRelative(7.71f, 7.16f)
                curveToRelative(0.3f, 0.3f, 0.7f, 0.47f, 1.13f, 0.47f)
                close()
                moveTo(22.66f, 13.14f)
                lineTo(12.43f, 22.82f)
                curveToRelative(-0.23f, 0.23f, -0.61f, 0.24f, -0.86f, -0.01f)
                lineToRelative(-10.22f, -9.68f)
                lineToRelative(-0.69f, 0.73f)
                lineToRelative(10.21f, 9.67f)
                curveToRelative(0.3f, 0.3f, 0.7f, 0.47f, 1.13f, 0.47f)
                reflectiveCurveToRelative(0.83f, -0.17f, 1.12f, -0.46f)
                lineToRelative(10.22f, -9.68f)
                close()
            }
        }.also { _ChevronDoubleDotsDown = it}
