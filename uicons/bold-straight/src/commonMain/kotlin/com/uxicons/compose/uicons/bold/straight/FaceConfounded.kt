package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceConfounded: ImageVector? = null

val Icons.Bs.FaceConfounded: ImageVector
    get() = _FaceConfounded ?: UXIcon(name = "FaceConfounded") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                curveToRelative(0f, -2.27f, 3.37f, -3f, 5f, -3f)
                curveToRelative(0f, 0f, -2f, 2f, -2f, 3f)
                reflectiveCurveToRelative(2f, 3f, 2f, 3f)
                curveToRelative(-1.63f, 0f, -5f, -0.73f, -5f, -3f)
                close()
                moveTo(11f, 9f)
                curveToRelative(0f, -2.27f, -3.37f, -3f, -5f, -3f)
                curveToRelative(0f, 0f, 2f, 2f, 2f, 3f)
                reflectiveCurveToRelative(-2f, 3f, -2f, 3f)
                curveToRelative(1.63f, 0f, 5f, -0.73f, 5f, -3f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
                moveTo(16.44f, 12.94f)
                lineToRelative(-1.44f, 1.44f)
                lineToRelative(-1.48f, -1.48f)
                lineToRelative(-1.51f, 1.49f)
                lineToRelative(-1.51f, -1.51f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(3.56f, 3.56f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.49f, 1.49f)
                lineToRelative(1.51f, -1.49f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(3.56f, -3.56f)
                lineToRelative(-2.12f, -2.12f)
                close()
            }
        }.also { _FaceConfounded = it}
