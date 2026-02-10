package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meeting: ImageVector? = null

val Icons.Ss.Meeting: ImageVector
    get() = _Meeting ?: UXIcon(name = "Meeting") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 14.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(15f, 14.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(14.93f, 9f)
                horizontalLineToRelative(3.07f)
                lineTo(18f, 2.05f)
                curveToRelative(0f, -1.13f, -0.92f, -2.05f, -2.05f, -2.05f)
                horizontalLineToRelative(-7.9f)
                curveToRelative(-1.13f, 0f, -2.05f, 0.92f, -2.05f, 2.05f)
                verticalLineToRelative(6.95f)
                horizontalLineToRelative(3.2f)
                lineToRelative(1.83f, 1.62f)
                curveToRelative(0.29f, 0.26f, 0.65f, 0.38f, 1.02f, 0.38f)
                curveToRelative(0.36f, 0f, 0.72f, -0.13f, 1.0f, -0.38f)
                lineToRelative(1.88f, -1.62f)
                close()
                moveTo(8f, 19f)
                lineTo(3f, 19f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _Meeting = it}
