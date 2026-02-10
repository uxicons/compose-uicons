package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmSnooze: ImageVector? = null

val Icons.Rs.AlarmSnooze: ImageVector
    get() = _AlarmSnooze ?: UXIcon(name = "AlarmSnooze") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.48f, 1.75f)
                lineTo(19.54f, 0.06f)
                curveToRelative(1.73f, 1.01f, 3.24f, 2.36f, 4.44f, 3.96f)
                lineToRelative(-1.66f, 1.11f)
                curveToRelative(-1.04f, -1.36f, -2.35f, -2.51f, -3.84f, -3.38f)
                close()
                moveTo(5.52f, 1.75f)
                lineTo(4.46f, 0.06f)
                curveTo(2.73f, 1.07f, 1.22f, 2.42f, 0.02f, 4.01f)
                lineToRelative(1.66f, 1.11f)
                curveToRelative(1.04f, -1.36f, 2.35f, -2.51f, 3.84f, -3.38f)
                close()
                moveTo(8f, 11f)
                horizontalLineToRelative(4.95f)
                lineToRelative(-4.95f, 3.97f)
                verticalLineToRelative(2.03f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.84f)
                lineToRelative(4.84f, -3.88f)
                verticalLineToRelative(-2.12f)
                lineTo(8f, 9f)
                verticalLineToRelative(2f)
                close()
                moveTo(23f, 13f)
                curveToRelative(0f, 2.88f, -1.12f, 5.5f, -2.94f, 7.46f)
                lineToRelative(1.93f, 2.12f)
                lineToRelative(-1.48f, 1.35f)
                lineToRelative(-1.94f, -2.13f)
                curveToRelative(-1.84f, 1.38f, -4.11f, 2.2f, -6.58f, 2.2f)
                reflectiveCurveToRelative(-4.74f, -0.83f, -6.58f, -2.2f)
                lineToRelative(-1.94f, 2.13f)
                lineToRelative(-1.48f, -1.35f)
                lineToRelative(1.93f, -2.12f)
                curveToRelative(-1.82f, -1.96f, -2.94f, -4.58f, -2.94f, -7.46f)
                curveTo(1f, 7.27f, 5.4f, 2.56f, 11f, 2.05f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                lineTo(13f, 2.05f)
                curveToRelative(5.6f, 0.51f, 10f, 5.22f, 10f, 10.95f)
                close()
                moveTo(21f, 13f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 8.04f, 3f, 13f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
            }
        }.also { _AlarmSnooze = it}
