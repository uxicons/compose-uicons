package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceEyesXmarks: ImageVector? = null

val Icons.Ss.FaceEyesXmarks: ImageVector
    get() = _FaceEyesXmarks ?: UXIcon(name = "FaceEyesXmarks") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(5.02f, 11.79f)
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
                lineToRelative(-1.57f, 1.57f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(9f, 18f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(18.98f, 11.79f)
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
                lineToRelative(-1.57f, 1.57f)
                lineToRelative(1.57f, 1.57f)
                close()
            }
        }.also { _FaceEyesXmarks = it}
