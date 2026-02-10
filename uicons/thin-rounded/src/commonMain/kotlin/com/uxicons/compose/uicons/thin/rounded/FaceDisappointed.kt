package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceDisappointed: ImageVector? = null

val Icons.Tr.FaceDisappointed: ImageVector
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
                moveTo(15.4f, 17.8f)
                curveToRelative(-0.1f, 0.13f, -0.25f, 0.2f, -0.4f, 0.2f)
                curveToRelative(-0.1f, 0f, -0.21f, -0.03f, -0.3f, -0.1f)
                curveToRelative(-0.01f, -0.01f, -1.24f, -0.9f, -2.7f, -0.9f)
                reflectiveCurveToRelative(-2.69f, 0.89f, -2.7f, 0.9f)
                curveToRelative(-0.22f, 0.16f, -0.53f, 0.12f, -0.7f, -0.1f)
                curveToRelative(-0.16f, -0.22f, -0.12f, -0.53f, 0.1f, -0.7f)
                curveToRelative(0.06f, -0.04f, 1.5f, -1.1f, 3.3f, -1.1f)
                reflectiveCurveToRelative(3.24f, 1.05f, 3.3f, 1.1f)
                curveToRelative(0.22f, 0.17f, 0.27f, 0.48f, 0.1f, 0.7f)
                close()
                moveTo(9.67f, 11.97f)
                lineToRelative(-4f, 1.44f)
                curveToRelative(-0.06f, 0.02f, -0.11f, 0.03f, -0.17f, 0.03f)
                curveToRelative(-0.2f, 0f, -0.4f, -0.13f, -0.47f, -0.33f)
                curveToRelative(-0.09f, -0.26f, 0.04f, -0.55f, 0.3f, -0.64f)
                lineToRelative(4f, -1.44f)
                curveToRelative(0.26f, -0.09f, 0.55f, 0.04f, 0.64f, 0.3f)
                curveToRelative(0.09f, 0.26f, -0.04f, 0.55f, -0.3f, 0.64f)
                close()
                moveTo(18.97f, 13.11f)
                curveToRelative(-0.07f, 0.2f, -0.27f, 0.33f, -0.47f, 0.33f)
                curveToRelative(-0.06f, 0f, -0.11f, -0.01f, -0.17f, -0.03f)
                lineToRelative(-4f, -1.44f)
                curveToRelative(-0.26f, -0.09f, -0.4f, -0.38f, -0.3f, -0.64f)
                curveToRelative(0.1f, -0.26f, 0.38f, -0.39f, 0.64f, -0.3f)
                lineToRelative(4f, 1.44f)
                curveToRelative(0.26f, 0.09f, 0.4f, 0.38f, 0.3f, 0.64f)
                close()
            }
        }.also { _FaceDisappointed = it}
