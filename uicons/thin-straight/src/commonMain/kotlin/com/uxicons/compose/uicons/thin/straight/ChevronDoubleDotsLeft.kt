package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsLeft: ImageVector? = null

val Icons.Ts.ChevronDoubleDotsLeft: ImageVector
    get() = _ChevronDoubleDotsLeft ?: UXIcon(name = "ChevronDoubleDotsLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(10f, 12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(19f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(23f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12.63f, 3.16f)
                lineTo(5.47f, 10.87f)
                curveToRelative(-0.62f, 0.62f, -0.62f, 1.64f, -0.01f, 2.25f)
                lineToRelative(7.18f, 7.72f)
                lineToRelative(0.73f, -0.68f)
                lineToRelative(-7.19f, -7.73f)
                curveToRelative(-0.23f, -0.23f, -0.23f, -0.62f, 0.01f, -0.86f)
                lineToRelative(7.18f, -7.72f)
                lineToRelative(-0.73f, -0.68f)
                close()
                moveTo(1.19f, 11.56f)
                lineTo(10.86f, 1.34f)
                lineTo(10.14f, 0.66f)
                lineTo(0.47f, 10.87f)
                curveToRelative(-0.62f, 0.62f, -0.62f, 1.64f, -0.01f, 2.26f)
                lineToRelative(9.68f, 10.22f)
                lineToRelative(0.73f, -0.69f)
                lineToRelative(-9.69f, -10.23f)
                curveToRelative(-0.23f, -0.23f, -0.23f, -0.62f, 0.01f, -0.86f)
                close()
            }
        }.also { _ChevronDoubleDotsLeft = it}
