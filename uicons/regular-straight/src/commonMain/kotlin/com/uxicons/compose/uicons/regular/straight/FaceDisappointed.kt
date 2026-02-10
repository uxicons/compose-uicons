package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceDisappointed: ImageVector? = null

val Icons.Rs.FaceDisappointed: ImageVector
    get() = _FaceDisappointed ?: UXIcon(name = "FaceDisappointed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(12f, 16f)
                curveToRelative(1.97f, 0f, 3.53f, 1.15f, 3.6f, 1.2f)
                lineToRelative(-1.2f, 1.6f)
                curveToRelative(-0.01f, -0.01f, -1.11f, -0.8f, -2.4f, -0.8f)
                reflectiveCurveToRelative(-2.4f, 0.8f, -2.41f, 0.81f)
                lineToRelative(-1.19f, -1.61f)
                curveToRelative(0.07f, -0.05f, 1.63f, -1.2f, 3.6f, -1.2f)
                close()
                moveTo(10.34f, 13.0f)
                lineToRelative(-4f, 1.44f)
                lineToRelative(-0.68f, -1.88f)
                lineToRelative(4f, -1.44f)
                lineToRelative(0.68f, 1.88f)
                close()
                moveTo(14.34f, 11.12f)
                lineToRelative(4f, 1.44f)
                lineToRelative(-0.68f, 1.88f)
                lineToRelative(-4f, -1.44f)
                lineToRelative(0.68f, -1.88f)
                close()
            }
        }.also { _FaceDisappointed = it}
