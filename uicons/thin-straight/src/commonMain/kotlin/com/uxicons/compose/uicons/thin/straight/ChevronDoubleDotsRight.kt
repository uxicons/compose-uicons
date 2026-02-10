package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsRight: ImageVector? = null

val Icons.Ts.ChevronDoubleDotsRight: ImageVector
    get() = _ChevronDoubleDotsRight ?: UXIcon(name = "ChevronDoubleDotsRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(14f, 12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(5f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(1f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, -0.43f, -0.17f, -0.83f, -0.46f, -1.12f)
                lineToRelative(-7.18f, -7.72f)
                lineToRelative(-0.73f, 0.68f)
                lineToRelative(7.19f, 7.73f)
                curveToRelative(0.24f, 0.23f, 0.24f, 0.63f, -0.01f, 0.86f)
                lineToRelative(-7.18f, 7.72f)
                lineToRelative(0.73f, 0.68f)
                lineToRelative(7.16f, -7.71f)
                curveToRelative(0.3f, -0.3f, 0.47f, -0.7f, 0.47f, -1.13f)
                close()
                moveTo(23.54f, 10.88f)
                lineTo(13.86f, 0.66f)
                lineTo(13.14f, 1.34f)
                lineTo(22.82f, 11.57f)
                curveToRelative(0.24f, 0.23f, 0.24f, 0.63f, -0.01f, 0.86f)
                lineToRelative(-9.68f, 10.22f)
                lineToRelative(0.73f, 0.69f)
                lineToRelative(9.67f, -10.21f)
                curveToRelative(0.62f, -0.59f, 0.62f, -1.67f, 0.01f, -2.26f)
                close()
            }
        }.also { _ChevronDoubleDotsRight = it}
