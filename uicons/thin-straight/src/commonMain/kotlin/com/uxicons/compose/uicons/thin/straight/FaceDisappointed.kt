package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceDisappointed: ImageVector? = null

val Icons.Ts.FaceDisappointed: ImageVector
    get() = _FaceDisappointed ?: UXIcon(name = "FaceDisappointed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(12f, 16f)
                curveToRelative(1.97f, 0f, 3.53f, 1.15f, 3.6f, 1.2f)
                lineToRelative(-0.6f, 0.8f)
                curveToRelative(-0.01f, -0.01f, -1.38f, -1.0f, -3.0f, -1.0f)
                reflectiveCurveToRelative(-2.99f, 0.99f, -3.0f, 1.0f)
                lineToRelative(-0.6f, -0.8f)
                curveToRelative(0.07f, -0.05f, 1.63f, -1.2f, 3.6f, -1.2f)
                close()
                moveTo(10.17f, 12.03f)
                lineToRelative(-4f, 1.44f)
                lineToRelative(-0.34f, -0.94f)
                lineToRelative(4f, -1.44f)
                lineToRelative(0.34f, 0.94f)
                close()
                moveTo(14.17f, 11.09f)
                lineToRelative(4f, 1.44f)
                lineToRelative(-0.34f, 0.94f)
                lineToRelative(-4f, -1.44f)
                lineToRelative(0.34f, -0.94f)
                close()
            }
        }.also { _FaceDisappointed = it}
