package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckCircle: ImageVector? = null

val Icons.Rr.CheckCircle: ImageVector
    get() = _CheckCircle ?: UXIcon(name = "CheckCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.21f, 9.1f)
                curveToRelative(0.39f, 0.39f, 0.38f, 1.03f, -0.01f, 1.41f)
                lineToRelative(-4.43f, 4.34f)
                curveToRelative(-0.78f, 0.77f, -1.79f, 1.15f, -2.8f, 1.15f)
                curveToRelative(-1.0f, 0f, -2.0f, -0.38f, -2.78f, -1.13f)
                lineToRelative(-1.9f, -1.87f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.01f)
                lineToRelative(1.89f, 1.86f)
                curveToRelative(0.78f, 0.75f, 2.0f, 0.75f, 2.78f, -0.02f)
                lineToRelative(4.42f, -4.34f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.38f, 1.41f, 0.01f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                close()
            }
        }.also { _CheckCircle = it}
