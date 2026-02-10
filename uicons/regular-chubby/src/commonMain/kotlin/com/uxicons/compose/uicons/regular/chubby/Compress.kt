package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Compress: ImageVector? = null

val Icons.Rc.Compress: ImageVector
    get() = _Compress ?: UXIcon(name = "Compress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.15f, 1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 3.18f, -0.86f, 5.15f, -5.12f, 5.15f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(6.39f, 0f, 7.12f, -4.08f, 7.12f, -7.15f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.98f, 9.15f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveToRelative(-4.27f, 0f, -5.12f, -1.97f, -5.12f, -5.15f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 3.07f, 0.74f, 7.15f, 7.12f, 7.15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.98f, 14.85f)
                curveToRelative(-6.39f, 0f, -7.12f, 4.08f, -7.12f, 7.15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -3.18f, 0.86f, -5.15f, 5.12f, -5.15f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.02f, 14.85f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(4.27f, 0f, 5.12f, 1.97f, 5.12f, 5.15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -3.07f, -0.74f, -7.15f, -7.12f, -7.15f)
                close()
            }
        }.also { _Compress = it}
