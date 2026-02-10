package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TablePicnic: ImageVector? = null

val Icons.Br.TablePicnic: ImageVector
    get() = _TablePicnic ?: UXIcon(name = "TablePicnic") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.88f, 18.9f)
            lineToRelative(-1.69f, -3.9f)
            horizontalLineToRelative(0.32f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.61f)
            lineToRelative(-2.6f, -6f)
            horizontalLineToRelative(1.22f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.22f)
            lineToRelative(-2.6f, 6f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.32f)
            lineTo(0.12f, 18.9f)
            curveToRelative(-0.33f, 0.76f, 0.02f, 1.64f, 0.78f, 1.97f)
            curveToRelative(0.19f, 0.09f, 0.4f, 0.12f, 0.6f, 0.12f)
            curveToRelative(0.58f, 0f, 1.13f, -0.34f, 1.38f, -0.9f)
            lineToRelative(2.21f, -5.1f)
            horizontalLineToRelative(13.83f)
            lineToRelative(2.21f, 5.1f)
            curveToRelative(0.24f, 0.56f, 0.8f, 0.9f, 1.38f, 0.9f)
            curveToRelative(0.2f, 0f, 0.4f, -0.04f, 0.6f, -0.12f)
            curveToRelative(0.76f, -0.33f, 1.11f, -1.21f, 0.78f, -1.97f)
            close()
            moveTo(6.38f, 12f)
            lineToRelative(2.6f, -6f)
            horizontalLineToRelative(6.03f)
            lineToRelative(2.6f, 6f)
            horizontalLineTo(6.38f)
            close()
        }
    }.also { _TablePicnic = it }
