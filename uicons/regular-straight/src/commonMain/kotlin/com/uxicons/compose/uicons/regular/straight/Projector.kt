package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Projector: ImageVector? = null

val Icons.Rs.Projector: ImageVector
    get() = _Projector ?: UXIcon(name = "Projector") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1.34f)
                curveToRelative(-0.82f, -2.33f, -3.05f, -4f, -5.66f, -4f)
                reflectiveCurveToRelative(-4.83f, 1.67f, -5.66f, 4f)
                lineTo(3f, 10f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(9f)
                lineTo(3f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                lineTo(24f, 13f)
                close()
                moveTo(14f, 8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(22f, 20f)
                lineTo(2f, 20f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                close()
                moveTo(7f, 15.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(15f, 4f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 0f)
                horizontalLineToRelative(2f)
                lineTo(15f, 4f)
                close()
                moveTo(18.87f, 5.57f)
                lineToRelative(-1.73f, -1f)
                lineToRelative(2f, -3.46f)
                lineToRelative(1.73f, 1f)
                lineToRelative(-2f, 3.46f)
                close()
                moveTo(9.13f, 5.57f)
                lineToRelative(-2f, -3.46f)
                lineToRelative(1.73f, -1f)
                lineToRelative(2f, 3.46f)
                lineToRelative(-1.73f, 1f)
                close()
            }
        }.also { _Projector = it}
