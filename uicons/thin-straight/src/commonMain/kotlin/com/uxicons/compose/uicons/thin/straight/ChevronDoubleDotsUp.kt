package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsUp: ImageVector? = null

val Icons.Ts.ChevronDoubleDotsUp: ImageVector
    get() = _ChevronDoubleDotsUp ?: UXIcon(name = "ChevronDoubleDotsUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(10.88f, 5.46f)
                lineTo(3.16f, 12.63f)
                lineTo(3.84f, 13.37f)
                lineTo(11.57f, 6.18f)
                curveToRelative(0.23f, -0.23f, 0.62f, -0.23f, 0.86f, 0.01f)
                lineToRelative(7.72f, 7.18f)
                lineToRelative(0.68f, -0.73f)
                lineToRelative(-7.71f, -7.17f)
                curveToRelative(-0.62f, -0.62f, -1.64f, -0.62f, -2.25f, -0.01f)
                close()
                moveTo(13.13f, 0.47f)
                curveToRelative(-0.62f, -0.62f, -1.64f, -0.62f, -2.26f, -0.01f)
                lineToRelative(-10.22f, 9.68f)
                lineToRelative(0.69f, 0.73f)
                lineToRelative(10.23f, -9.69f)
                curveToRelative(0.23f, -0.23f, 0.62f, -0.23f, 0.86f, 0.01f)
                lineToRelative(10.22f, 9.68f)
                lineToRelative(0.69f, -0.73f)
                close()
            }
        }.also { _ChevronDoubleDotsUp = it}
