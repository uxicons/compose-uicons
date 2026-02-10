package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmirking: ImageVector? = null

val Icons.Rs.FaceSmirking: ImageVector
    get() = _FaceSmirking ?: UXIcon(name = "FaceSmirking") {
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
                moveTo(17.16f, 14.46f)
                lineToRelative(1.7f, 1.06f)
                curveToRelative(-0.06f, 0.1f, -1.57f, 2.47f, -4.85f, 2.47f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(2.14f, 0f, 3.11f, -1.47f, 3.15f, -1.53f)
                close()
                moveTo(15.09f, 11f)
                horizontalLineToRelative(-2.09f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.65f, 0f, -1.21f, -0.42f, -1.41f, -1f)
                close()
                moveTo(7.09f, 11f)
                horizontalLineToRelative(-2.09f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.65f, 0f, -1.21f, -0.42f, -1.41f, -1f)
                close()
            }
        }.also { _FaceSmirking = it}
