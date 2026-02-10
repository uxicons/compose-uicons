package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckCircle: ImageVector? = null

val Icons.Tr.CheckCircle: ImageVector
    get() = _CheckCircle ?: UXIcon(name = "CheckCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.76f, 8.05f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.01f, 0.71f)
                lineToRelative(-5.33f, 5.24f)
                curveToRelative(-0.69f, 0.67f, -1.57f, 1.01f, -2.45f, 1.01f)
                curveToRelative(-0.87f, 0f, -1.75f, -0.33f, -2.43f, -0.99f)
                lineToRelative(-2.3f, -2.26f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.01f, -0.71f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, -0.01f)
                lineToRelative(2.29f, 2.26f)
                curveToRelative(0.97f, 0.94f, 2.5f, 0.94f, 3.48f, -0.02f)
                lineToRelative(5.32f, -5.24f)
                curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0.01f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                close()
            }
        }.also { _CheckCircle = it}
