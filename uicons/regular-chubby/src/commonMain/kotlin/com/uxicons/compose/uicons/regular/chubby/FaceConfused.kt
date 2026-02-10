package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceConfused: ImageVector? = null

val Icons.Rc.FaceConfused: ImageVector
    get() = _FaceConfused ?: UXIcon(name = "FaceConfused") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(-7.71f, 0f, -11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                reflectiveCurveToRelative(-3.29f, 11f, -11f, 11f)
                close()
                moveTo(12f, 3f)
                curveToRelative(-6.56f, 0f, -9f, 2.44f, -9f, 9f)
                reflectiveCurveToRelative(2.44f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -2.44f, 9f, -9f)
                reflectiveCurveToRelative(-2.44f, -9f, -9f, -9f)
                close()
                moveTo(14f, 10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(8f, 10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(8.62f, 16.79f)
                curveToRelative(0.68f, -0.53f, 1.76f, -0.79f, 3.29f, -0.79f)
                horizontalLineToRelative(4.09f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.09f)
                curveToRelative(-2.03f, 0f, -3.46f, 0.39f, -4.53f, 1.21f)
                curveToRelative(-0.44f, 0.34f, -0.51f, 0.97f, -0.17f, 1.4f)
                curveToRelative(0.34f, 0.44f, 0.97f, 0.51f, 1.4f, 0.17f)
                close()
            }
        }.also { _FaceConfused = it}
