package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPenHead: ImageVector? = null

val Icons.Ss.UserPenHead: ImageVector
    get() = _UserPenHead ?: UXIcon(name = "UserPenHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.96f, 7.0f)
                lineToRelative(-1.45f, 3.0f)
                horizontalLineToRelative(-7.03f)
                lineToRelative(-1.45f, -3.0f)
                lineTo(11f, 0f)
                lineTo(11f, 6.0f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(0f, -6.0f, 0f, -6.0f)
                lineToRelative(3.96f, 7.0f)
                close()
                moveTo(24f, 14.5f)
                curveToRelative(0f, 1.85f, -1.45f, 3.37f, -3.27f, 3.49f)
                curveToRelative(-1.41f, 3.06f, -4.87f, 6.01f, -8.73f, 6.01f)
                reflectiveCurveToRelative(-7.33f, -2.94f, -8.73f, -6.01f)
                curveToRelative(-1.82f, -0.12f, -3.27f, -1.64f, -3.27f, -3.49f)
                curveToRelative(0f, -1.7f, 1.07f, -2.68f, 2f, -3.14f)
                verticalLineToRelative(-3.36f)
                horizontalLineToRelative(3.3f)
                lineToRelative(1.94f, 4.0f)
                horizontalLineToRelative(9.54f)
                lineToRelative(1.94f, -4.0f)
                horizontalLineToRelative(3.3f)
                verticalLineToRelative(3.36f)
                curveToRelative(0.93f, 0.46f, 2f, 1.44f, 2f, 3.14f)
                close()
                moveTo(10f, 15.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(17f, 15.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _UserPenHead = it}
