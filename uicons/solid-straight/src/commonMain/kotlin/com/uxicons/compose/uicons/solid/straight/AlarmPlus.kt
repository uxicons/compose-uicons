package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmPlus: ImageVector? = null

val Icons.Ss.AlarmPlus: ImageVector
    get() = _AlarmPlus ?: UXIcon(name = "AlarmPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.68f, 5.12f)
                lineTo(0.02f, 4.01f)
                curveTo(1.22f, 2.42f, 2.73f, 1.07f, 4.46f, 0.06f)
                lineToRelative(1.07f, 1.69f)
                curveToRelative(-1.49f, 0.86f, -2.8f, 2.01f, -3.84f, 3.38f)
                close()
                moveTo(22.32f, 5.12f)
                lineToRelative(1.66f, -1.11f)
                curveToRelative(-1.2f, -1.59f, -2.71f, -2.94f, -4.44f, -3.96f)
                lineToRelative(-1.07f, 1.69f)
                curveToRelative(1.49f, 0.86f, 2.8f, 2.01f, 3.84f, 3.38f)
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
                moveTo(16f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _AlarmPlus = it}
