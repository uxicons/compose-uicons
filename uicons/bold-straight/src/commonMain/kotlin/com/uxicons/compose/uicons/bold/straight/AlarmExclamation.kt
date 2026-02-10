package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmExclamation: ImageVector? = null

val Icons.Bs.AlarmExclamation: ImageVector
    get() = _AlarmExclamation ?: UXIcon(name = "AlarmExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                curveToRelative(0f, -5.0f, -3.69f, -9.16f, -8.5f, -9.89f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 3.11f)
                curveTo(5.7f, 3.84f, 2f, 8.0f, 2f, 13f)
                curveToRelative(0f, 2.43f, 0.87f, 4.66f, 2.32f, 6.4f)
                lineToRelative(-2.42f, 2.58f)
                lineToRelative(2.19f, 2.05f)
                lineToRelative(2.47f, -2.63f)
                curveToRelative(1.56f, 1.02f, 3.43f, 1.61f, 5.43f, 1.61f)
                reflectiveCurveToRelative(3.87f, -0.59f, 5.43f, -1.61f)
                lineToRelative(2.47f, 2.63f)
                lineToRelative(2.19f, -2.05f)
                lineToRelative(-2.42f, -2.58f)
                curveToRelative(1.45f, -1.74f, 2.32f, -3.97f, 2.32f, -6.4f)
                close()
                moveTo(5f, 13f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                close()
                moveTo(2.51f, 5.67f)
                lineTo(0.02f, 4.01f)
                curveTo(1.22f, 2.42f, 2.73f, 1.07f, 4.46f, 0.06f)
                lineToRelative(1.6f, 2.53f)
                curveToRelative(-1.38f, 0.79f, -2.58f, 1.84f, -3.54f, 3.09f)
                close()
                moveTo(17.95f, 2.59f)
                lineTo(19.54f, 0.06f)
                curveToRelative(1.73f, 1.01f, 3.24f, 2.36f, 4.44f, 3.96f)
                lineToRelative(-2.49f, 1.66f)
                curveToRelative(-0.96f, -1.25f, -2.17f, -2.3f, -3.54f, -3.09f)
                close()
                moveTo(10.5f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                close()
                moveTo(10.5f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _AlarmExclamation = it}
