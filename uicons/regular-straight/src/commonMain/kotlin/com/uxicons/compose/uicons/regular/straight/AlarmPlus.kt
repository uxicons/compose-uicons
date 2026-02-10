package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmPlus: ImageVector? = null

val Icons.Rs.AlarmPlus: ImageVector
    get() = _AlarmPlus ?: UXIcon(name = "AlarmPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.05f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2.05f)
                curveTo(5.4f, 2.56f, 1f, 7.27f, 1f, 13f)
                curveToRelative(0f, 2.88f, 1.12f, 5.5f, 2.94f, 7.46f)
                lineToRelative(-1.93f, 2.12f)
                lineToRelative(1.48f, 1.35f)
                lineToRelative(1.94f, -2.13f)
                curveToRelative(1.84f, 1.38f, 4.11f, 2.2f, 6.58f, 2.2f)
                reflectiveCurveToRelative(4.74f, -0.83f, 6.58f, -2.2f)
                lineToRelative(1.94f, 2.13f)
                lineToRelative(1.48f, -1.35f)
                lineToRelative(-1.93f, -2.12f)
                curveToRelative(1.82f, -1.96f, 2.94f, -4.58f, 2.94f, -7.46f)
                curveToRelative(0f, -5.73f, -4.4f, -10.44f, -10f, -10.95f)
                close()
                moveTo(3f, 13f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 17.96f, 3f, 13f)
                close()
                moveTo(1.68f, 5.12f)
                lineTo(0.02f, 4.01f)
                curveTo(1.22f, 2.42f, 2.73f, 1.07f, 4.46f, 0.06f)
                lineToRelative(1.07f, 1.69f)
                curveToRelative(-1.49f, 0.86f, -2.8f, 2.01f, -3.84f, 3.38f)
                close()
                moveTo(18.48f, 1.75f)
                lineTo(19.54f, 0.06f)
                curveToRelative(1.73f, 1.01f, 3.24f, 2.36f, 4.44f, 3.96f)
                lineToRelative(-1.66f, 1.11f)
                curveToRelative(-1.04f, -1.36f, -2.35f, -2.51f, -3.84f, -3.38f)
                close()
                moveTo(13f, 12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _AlarmPlus = it}
