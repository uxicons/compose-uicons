package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceDisappointed: ImageVector? = null

val Icons.Bs.FaceDisappointed: ImageVector
    get() = _FaceDisappointed ?: UXIcon(name = "FaceDisappointed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(12f, 15f)
                curveToRelative(2.09f, 0f, 3.72f, 1.16f, 3.9f, 1.3f)
                lineToRelative(-1.79f, 2.41f)
                reflectiveCurveToRelative(-0.99f, -0.7f, -2.1f, -0.7f)
                reflectiveCurveToRelative(-2.1f, 0.7f, -2.11f, 0.71f)
                lineToRelative(-1.78f, -2.41f)
                curveToRelative(0.18f, -0.13f, 1.8f, -1.3f, 3.9f, -1.3f)
                close()
                moveTo(10.51f, 12.97f)
                lineToRelative(-4f, 1.44f)
                lineToRelative(-1.02f, -2.82f)
                lineToRelative(4f, -1.44f)
                lineToRelative(1.02f, 2.82f)
                close()
                moveTo(18.51f, 11.59f)
                lineToRelative(-1.02f, 2.82f)
                lineToRelative(-4f, -1.44f)
                lineToRelative(1.02f, -2.82f)
                lineToRelative(4f, 1.44f)
                close()
            }
        }.also { _FaceDisappointed = it}
