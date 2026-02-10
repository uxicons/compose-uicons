package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Webinar: ImageVector? = null

val Icons.Bs.Webinar: ImageVector
    get() = _Webinar ?: UXIcon(name = "Webinar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                lineTo(13.5f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineTo(6.5f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(12f, 2f)
                verticalLineToRelative(3f)
                lineTo(3f, 5f)
                verticalLineToRelative(11f)
                lineTo(21f, 16f)
                verticalLineToRelative(-5f)
                close()
                moveTo(8.5f, 11f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(24f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-5.87f)
                lineToRelative(-2.45f, 1.69f)
                curveToRelative(-0.19f, 0.12f, -0.39f, 0.17f, -0.58f, 0.17f)
                curveToRelative(-0.57f, 0f, -1.09f, -0.45f, -1.09f, -1.09f)
                lineToRelative(-0.0f, -7.77f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2.0f, -2.0f)
                lineToRelative(6f, -0.0f)
                horizontalLineToRelative(0f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(21f, 3f)
                horizontalLineToRelative(-4f)
                reflectiveCurveToRelative(0f, 3.0f, 0f, 3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(21.0f, 3f)
                close()
            }
        }.also { _Webinar = it}
