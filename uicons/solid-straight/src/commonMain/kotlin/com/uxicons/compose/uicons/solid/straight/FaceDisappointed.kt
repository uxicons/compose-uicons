package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceDisappointed: ImageVector? = null

val Icons.Ss.FaceDisappointed: ImageVector
    get() = _FaceDisappointed ?: UXIcon(name = "FaceDisappointed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(5.66f, 12.56f)
                lineToRelative(4f, -1.44f)
                lineToRelative(0.68f, 1.88f)
                lineToRelative(-4f, 1.44f)
                lineToRelative(-0.68f, -1.88f)
                close()
                moveTo(14.4f, 18.8f)
                curveToRelative(-0.01f, -0.01f, -1.11f, -0.8f, -2.4f, -0.8f)
                reflectiveCurveToRelative(-2.4f, 0.8f, -2.41f, 0.81f)
                lineToRelative(-1.19f, -1.61f)
                curveToRelative(0.07f, -0.05f, 1.63f, -1.2f, 3.6f, -1.2f)
                reflectiveCurveToRelative(3.53f, 1.15f, 3.6f, 1.2f)
                lineToRelative(-1.2f, 1.6f)
                close()
                moveTo(17.66f, 14.44f)
                lineToRelative(-4f, -1.44f)
                lineToRelative(0.68f, -1.88f)
                lineToRelative(4f, 1.44f)
                lineToRelative(-0.68f, 1.88f)
                close()
            }
        }.also { _FaceDisappointed = it}
