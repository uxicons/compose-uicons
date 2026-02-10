package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckCircle: ImageVector? = null

val Icons.Br.CheckCircle: ImageVector
    get() = _CheckCircle ?: UXIcon(name = "CheckCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.58f, 8.46f)
            curveToRelative(0.57f, 0.6f, 0.56f, 1.55f, -0.04f, 2.12f)
            lineToRelative(-4.61f, 4.42f)
            curveToRelative(-0.67f, 0.66f, -1.55f, 0.99f, -2.44f, 0.99f)
            reflectiveCurveToRelative(-1.77f, -0.33f, -2.45f, -0.99f)
            lineToRelative(-1.55f, -1.39f)
            curveToRelative(-0.62f, -0.55f, -0.67f, -1.5f, -0.11f, -2.12f)
            curveToRelative(0.55f, -0.61f, 1.5f, -0.67f, 2.12f, -0.11f)
            lineToRelative(1.59f, 1.43f)
            curveToRelative(0.24f, 0.23f, 0.56f, 0.23f, 0.75f, 0.04f)
            lineToRelative(4.62f, -4.44f)
            curveToRelative(0.6f, -0.57f, 1.54f, -0.56f, 2.12f, 0.04f)
            close()
            moveTo(24f, 12f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            reflectiveCurveTo(3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            close()
        }
    }.also { _CheckCircle = it }
