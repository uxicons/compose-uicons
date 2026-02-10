package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceEyesXmarks: ImageVector? = null

val Icons.Rs.FaceEyesXmarks: ImageVector
    get() = _FaceEyesXmarks ?: UXIcon(name = "FaceEyesXmarks") {
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
                moveTo(18.98f, 8.66f)
                lineToRelative(-1.57f, 1.57f)
                lineToRelative(1.57f, 1.57f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.57f, -1.57f)
                lineToRelative(-1.57f, 1.57f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.57f, -1.57f)
                lineToRelative(-1.57f, -1.57f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.57f, 1.57f)
                lineToRelative(1.57f, -1.57f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(8f, 11.64f)
                lineToRelative(-1.57f, 1.57f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.57f, -1.57f)
                lineToRelative(-1.57f, -1.57f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.57f, 1.57f)
                lineToRelative(1.57f, -1.57f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.57f, 1.57f)
                lineToRelative(1.57f, 1.57f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.57f, -1.57f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(-6f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
            }
        }.also { _FaceEyesXmarks = it}
