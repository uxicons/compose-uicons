package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBurst: ImageVector? = null

val Icons.Ss.PersonBurst: ImageVector
    get() = _PersonBurst ?: UXIcon(name = "PersonBurst") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                lineTo(14f, 9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                close()
                moveTo(8.54f, 4.67f)
                lineTo(-0.06f, 0.05f)
                lineTo(5.13f, 8.2f)
                lineTo(0.16f, 10.65f)
                lineToRelative(5.1f, 2.25f)
                lineToRelative(-1.89f, 5.15f)
                lineToRelative(5.14f, -1.77f)
                lineToRelative(2.61f, 4.88f)
                lineToRelative(0.88f, -1.73f)
                lineTo(12f, 9f)
                curveToRelative(0f, -1.54f, 0.72f, -2.91f, 1.82f, -3.83f)
                lineTo(11.01f, 0.03f)
                lineToRelative(-2.47f, 4.64f)
                close()
            }
        }.also { _PersonBurst = it}
