package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnglesUpDown: ImageVector? = null

val Icons.Br.AnglesUpDown: ImageVector
    get() = _AnglesUpDown ?: UXIcon(name = "AnglesUpDown") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(2.77f, 9.57f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.53f, -0.01f, -2.12f)
            lineTo(8.81f, 1.32f)
            curveToRelative(0.85f, -0.86f, 1.99f, -1.32f, 3.19f, -1.32f)
            reflectiveCurveToRelative(2.33f, 0.47f, 3.18f, 1.32f)
            lineToRelative(6.06f, 6.13f)
            curveToRelative(0.58f, 0.59f, 0.58f, 1.54f, -0.01f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.67f, 0.43f, -1.05f, 0.43f)
            curveToRelative(-0.39f, 0f, -0.77f, -0.15f, -1.07f, -0.45f)
            lineToRelative(-6.05f, -6.12f)
            curveToRelative(-0.56f, -0.56f, -1.55f, -0.56f, -2.12f, 0.01f)
            lineToRelative(-6.05f, 6.12f)
            curveToRelative(-0.58f, 0.59f, -1.53f, 0.59f, -2.12f, 0.01f)
            close()
            moveTo(19.11f, 14.45f)
            lineToRelative(-6.05f, 6.12f)
            curveToRelative(-0.57f, 0.57f, -1.56f, 0.56f, -2.12f, 0.01f)
            lineToRelative(-6.05f, -6.12f)
            curveToRelative(-0.58f, -0.59f, -1.53f, -0.59f, -2.12f, -0.01f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.01f, 2.12f)
            lineToRelative(6.06f, 6.13f)
            curveToRelative(0.85f, 0.85f, 1.98f, 1.32f, 3.18f, 1.32f)
            reflectiveCurveToRelative(2.33f, -0.47f, 3.19f, -1.32f)
            lineToRelative(6.05f, -6.12f)
            curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
            reflectiveCurveToRelative(-1.54f, -0.58f, -2.12f, 0.01f)
            close()
        }
    }.also { _AnglesUpDown = it }
