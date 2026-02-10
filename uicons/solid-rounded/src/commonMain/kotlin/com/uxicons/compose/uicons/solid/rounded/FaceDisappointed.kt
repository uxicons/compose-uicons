package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceDisappointed: ImageVector? = null

val Icons.Sr.FaceDisappointed: ImageVector
    get() = _FaceDisappointed ?: UXIcon(name = "FaceDisappointed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(6f, 14.5f)
                curveToRelative(-0.41f, 0f, -0.79f, -0.25f, -0.94f, -0.66f)
                curveToRelative(-0.19f, -0.52f, 0.08f, -1.09f, 0.6f, -1.28f)
                lineToRelative(4f, -1.44f)
                curveToRelative(0.52f, -0.19f, 1.09f, 0.08f, 1.28f, 0.6f)
                curveToRelative(0.19f, 0.52f, -0.08f, 1.09f, -0.6f, 1.28f)
                lineToRelative(-4f, 1.44f)
                curveToRelative(-0.11f, 0.04f, -0.23f, 0.06f, -0.34f, 0.06f)
                close()
                moveTo(15.8f, 18.6f)
                curveToRelative(-0.2f, 0.26f, -0.5f, 0.4f, -0.8f, 0.4f)
                curveToRelative(-0.21f, 0f, -0.42f, -0.06f, -0.6f, -0.2f)
                curveToRelative(-0.01f, -0.01f, -1.11f, -0.8f, -2.4f, -0.8f)
                reflectiveCurveToRelative(-2.4f, 0.8f, -2.41f, 0.81f)
                curveToRelative(-0.45f, 0.32f, -1.07f, 0.23f, -1.4f, -0.21f)
                curveToRelative(-0.33f, -0.44f, -0.24f, -1.06f, 0.2f, -1.39f)
                curveToRelative(0.07f, -0.05f, 1.63f, -1.2f, 3.6f, -1.2f)
                reflectiveCurveToRelative(3.53f, 1.15f, 3.6f, 1.2f)
                curveToRelative(0.44f, 0.33f, 0.53f, 0.96f, 0.2f, 1.4f)
                close()
                moveTo(18.94f, 13.84f)
                curveToRelative(-0.15f, 0.41f, -0.53f, 0.66f, -0.94f, 0.66f)
                curveToRelative(-0.11f, 0f, -0.23f, -0.02f, -0.34f, -0.06f)
                lineToRelative(-4f, -1.44f)
                curveToRelative(-0.52f, -0.19f, -0.79f, -0.76f, -0.6f, -1.28f)
                curveToRelative(0.19f, -0.52f, 0.76f, -0.79f, 1.28f, -0.6f)
                lineToRelative(4f, 1.44f)
                curveToRelative(0.52f, 0.19f, 0.79f, 0.76f, 0.6f, 1.28f)
                close()
            }
        }.also { _FaceDisappointed = it}
