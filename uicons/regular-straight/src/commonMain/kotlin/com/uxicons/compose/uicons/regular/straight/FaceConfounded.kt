package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceConfounded: ImageVector? = null

val Icons.Rs.FaceConfounded: ImageVector
    get() = _FaceConfounded ?: UXIcon(name = "FaceConfounded") {
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
                moveTo(16.38f, 11.78f)
                lineToRelative(-3.48f, -2.78f)
                lineToRelative(3.48f, -2.78f)
                lineToRelative(1.25f, 1.56f)
                lineToRelative(-1.52f, 1.22f)
                lineToRelative(1.52f, 1.22f)
                lineToRelative(-1.25f, 1.56f)
                close()
                moveTo(6.38f, 10.22f)
                lineToRelative(1.52f, -1.22f)
                lineToRelative(-1.52f, -1.22f)
                lineToRelative(1.25f, -1.56f)
                lineToRelative(3.48f, 2.78f)
                lineToRelative(-3.48f, 2.78f)
                lineToRelative(-1.25f, -1.56f)
                close()
                moveTo(19.09f, 15.35f)
                lineToRelative(-3.07f, 3.07f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-2.02f, 2.0f)
                lineToRelative(-2.02f, -2f)
                lineToRelative(-2.02f, 2.0f)
                lineToRelative(-3.05f, -3.05f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.64f, 1.64f)
                lineToRelative(2.02f, -2.0f)
                lineToRelative(2.02f, 2f)
                lineToRelative(2.02f, -2.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(1.65f, -1.65f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _FaceConfounded = it}
