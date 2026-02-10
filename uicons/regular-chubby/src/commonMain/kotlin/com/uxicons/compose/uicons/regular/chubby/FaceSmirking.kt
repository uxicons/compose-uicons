package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmirking: ImageVector? = null

val Icons.Rc.FaceSmirking: ImageVector
    get() = _FaceSmirking ?: UXIcon(name = "FaceSmirking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                reflectiveCurveToRelative(-2.44f, 9f, -9f, 9f)
                close()
                moveTo(17.79f, 15.38f)
                curveToRelative(0.34f, 0.44f, 0.26f, 1.06f, -0.17f, 1.4f)
                curveToRelative(-1.04f, 0.81f, -2.52f, 1.21f, -4.52f, 1.21f)
                horizontalLineToRelative(-4.09f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.09f)
                curveToRelative(1.54f, 0f, 2.61f, -0.26f, 3.29f, -0.79f)
                curveToRelative(0.44f, -0.34f, 1.06f, -0.26f, 1.4f, 0.17f)
                close()
                moveTo(8f, 12f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(1.3f, 0f, 2f, 1.03f, 2f, 2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(13f, 10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(1.3f, 0f, 2f, 1.03f, 2f, 2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _FaceSmirking = it}
