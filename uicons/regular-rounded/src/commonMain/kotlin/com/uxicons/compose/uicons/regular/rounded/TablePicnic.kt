package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TablePicnic: ImageVector? = null

val Icons.Rr.TablePicnic: ImageVector
    get() = _TablePicnic ?: UXIcon(name = "TablePicnic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.92f, 19.6f)
                lineToRelative(-2.45f, -5.6f)
                horizontalLineToRelative(1.53f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.41f)
                lineToRelative(-3.06f, -7f)
                horizontalLineToRelative(2.47f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.47f)
                lineToRelative(-3.06f, 7f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.53f)
                lineTo(0.08f, 19.6f)
                curveToRelative(-0.22f, 0.51f, 0.01f, 1.09f, 0.52f, 1.32f)
                curveToRelative(0.13f, 0.06f, 0.27f, 0.08f, 0.4f, 0.08f)
                curveToRelative(0.39f, 0f, 0.75f, -0.22f, 0.92f, -0.6f)
                lineToRelative(2.8f, -6.4f)
                horizontalLineToRelative(14.57f)
                lineToRelative(2.8f, 6.4f)
                curveToRelative(0.16f, 0.38f, 0.53f, 0.6f, 0.92f, 0.6f)
                curveToRelative(0.13f, 0f, 0.27f, -0.03f, 0.4f, -0.08f)
                curveToRelative(0.51f, -0.22f, 0.74f, -0.81f, 0.52f, -1.32f)
                close()
                moveTo(5.59f, 12f)
                lineToRelative(3.06f, -7f)
                horizontalLineToRelative(6.69f)
                lineToRelative(3.06f, 7f)
                horizontalLineTo(5.59f)
                close()
            }
        }.also { _TablePicnic = it}
