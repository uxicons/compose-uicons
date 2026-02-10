package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmirking: ImageVector? = null

val Icons.Ss.FaceSmirking: ImageVector
    get() = _FaceSmirking ?: UXIcon(name = "FaceSmirking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13f, 9f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.65f, 0f, -1.2f, -0.42f, -1.41f, -1f)
                horizontalLineToRelative(-2.09f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.65f, 0f, -1.2f, -0.42f, -1.41f, -1f)
                horizontalLineToRelative(-2.09f)
                close()
                moveTo(14f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(2.14f, 0f, 3.11f, -1.47f, 3.15f, -1.53f)
                lineToRelative(1.7f, 1.06f)
                curveToRelative(-0.06f, 0.1f, -1.57f, 2.47f, -4.85f, 2.47f)
                close()
            }
        }.also { _FaceSmirking = it}
