package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AccessDenied: ImageVector? = null

val Icons.Ss.AccessDenied: ImageVector
    get() = _AccessDenied ?: UXIcon(name = "AccessDenied") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(9.73f)
                curveToRelative(-1.67f, -1.47f, -2.73f, -3.61f, -2.73f, -6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.09f)
                curveToRelative(1.39f, -2.39f, 3.96f, -4f, 6.91f, -4f)
                curveToRelative(0.69f, 0f, 1.36f, 0.1f, 2f, 0.26f)
                verticalLineToRelative(-2.26f)
                close()
                moveTo(15f, 8f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                close()
                moveTo(22.24f, 13.76f)
                curveToRelative(-2.34f, -2.34f, -6.14f, -2.34f, -8.48f, 0f)
                reflectiveCurveToRelative(-2.34f, 6.14f, 0f, 8.48f)
                reflectiveCurveToRelative(6.14f, 2.34f, 8.48f, 0f)
                reflectiveCurveToRelative(2.34f, -6.14f, 0f, -8.48f)
                close()
                moveTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18.0f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.47f, 20.12f)
                lineTo(16.59f, 18f)
                lineTo(14.47f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18.0f, 16.59f)
                lineTo(20.12f, 14.46f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18f)
                close()
            }
        }.also { _AccessDenied = it}
