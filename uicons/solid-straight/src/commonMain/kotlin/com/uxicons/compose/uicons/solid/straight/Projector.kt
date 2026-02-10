package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Projector: ImageVector? = null

val Icons.Ss.Projector: ImageVector
    get() = _Projector ?: UXIcon(name = "Projector") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 6f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                curveToRelative(-0.07f, 0.32f, -0.1f, 0.66f, -0.1f, 1f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -0.34f, -0.04f, -0.68f, -0.1f, -1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.13f, 4.57f)
                lineToRelative(2f, -3.46f)
                lineToRelative(1.73f, 1f)
                lineToRelative(-2f, 3.46f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10f)
                horizontalLineToRelative(-0.08f)
                curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -0.34f, 0.03f, -0.67f, 0.08f, -1f)
                horizontalLineTo(3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineTo(13f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3.5f, 15f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.13f, 2.11f)
                lineToRelative(1.73f, -1f)
                lineToRelative(2f, 3.46f)
                lineToRelative(-1.73f, 1f)
                close()
            }
        }.also { _Projector = it}
