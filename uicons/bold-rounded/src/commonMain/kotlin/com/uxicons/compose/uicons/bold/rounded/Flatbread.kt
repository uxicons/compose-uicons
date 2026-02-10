package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flatbread: ImageVector? = null

val Icons.Br.Flatbread: ImageVector
    get() = _Flatbread ?: UXIcon(name = "Flatbread") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.56f, 9.56f)
            lineToRelative(-7f, 7f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(7f, -7f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            close()
            moveTo(8.06f, 11.06f)
            lineToRelative(3f, -3f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            close()
            moveTo(18.06f, 12.94f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(3f, -3f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            close()
            moveTo(24f, 12.0f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(21f, 12.0f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            reflectiveCurveTo(3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            close()
        }
    }.also { _Flatbread = it }
