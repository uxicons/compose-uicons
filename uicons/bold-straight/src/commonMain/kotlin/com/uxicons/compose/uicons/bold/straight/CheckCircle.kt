package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckCircle: ImageVector? = null

val Icons.Bs.CheckCircle: ImageVector
    get() = _CheckCircle ?: UXIcon(name = "CheckCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.45f, 7.93f)
                lineToRelative(2.1f, 2.14f)
                lineToRelative(-5.29f, 5.21f)
                curveToRelative(-0.48f, 0.48f, -1.12f, 0.72f, -1.76f, 0.72f)
                reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
                lineToRelative(-2.78f, -2.69f)
                lineToRelative(2.09f, -2.15f)
                lineToRelative(2.45f, 2.38f)
                lineToRelative(4.95f, -4.87f)
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
        }.also { _CheckCircle = it}
