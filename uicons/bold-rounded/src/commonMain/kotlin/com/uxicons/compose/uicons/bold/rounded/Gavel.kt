package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gavel: ImageVector? = null

val Icons.Br.Gavel: ImageVector
    get() = _Gavel ?: UXIcon(name = "Gavel") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.57f, 10.94f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-0.2f, 0.2f)
            curveToRelative(-1.96f, -1.96f, -6.74f, -6.74f, -8.38f, -8.38f)
            lineToRelative(0.2f, -0.2f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineTo(3.95f, 7.45f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(0.23f, -0.23f)
            lineToRelative(3.12f, 3.12f)
            lineTo(0.44f, 21.44f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineTo(11.54f, 14.58f)
            lineToRelative(3.13f, 3.13f)
            lineToRelative(-0.23f, 0.23f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(7f, -7f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            close()
            moveTo(15.54f, 14.34f)
            lineToRelative(-5.88f, -5.88f)
            lineToRelative(2.33f, -2.33f)
            lineToRelative(5.88f, 5.88f)
            lineToRelative(-2.33f, 2.33f)
            close()
        }
    }.also { _Gavel = it }
