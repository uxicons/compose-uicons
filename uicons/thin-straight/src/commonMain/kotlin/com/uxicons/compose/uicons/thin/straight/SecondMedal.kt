package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SecondMedal: ImageVector? = null

val Icons.Ts.SecondMedal: ImageVector
    get() = _SecondMedal ?: UXIcon(name = "SecondMedal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.14f, 18f)
                horizontalLineToRelative(4.86f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.35f, 1.26f, -2.06f, 2.49f, -2.75f)
                curveToRelative(1.29f, -0.73f, 2.51f, -1.41f, 2.51f, -2.75f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.93f, -1.68f, 2.87f, -3.02f, 3.62f)
                curveToRelative(-0.81f, 0.46f, -1.54f, 0.86f, -1.84f, 1.38f)
                close()
                moveTo(19.04f, 9.4f)
                curveToRelative(1.23f, 1.54f, 1.96f, 3.49f, 1.96f, 5.6f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 19.96f, 3f, 15f)
                curveToRelative(0f, -2.12f, 0.73f, -4.06f, 1.96f, -5.6f)
                lineTo(0.32f, 0f)
                horizontalLineToRelative(8.49f)
                lineToRelative(2.96f, 6.0f)
                curveToRelative(0.08f, -0.0f, 0.15f, -0.0f, 0.23f, -0.0f)
                reflectiveCurveToRelative(0.15f, 0f, 0.23f, 0.0f)
                lineTo(15.19f, 0f)
                horizontalLineToRelative(8.49f)
                lineToRelative(-4.64f, 9.4f)
                close()
                moveTo(13.3f, 6.09f)
                curveToRelative(1.94f, 0.28f, 3.69f, 1.19f, 5.02f, 2.5f)
                lineToRelative(3.75f, -7.6f)
                horizontalLineToRelative(-6.26f)
                lineToRelative(-2.51f, 5.09f)
                close()
                moveTo(1.93f, 1f)
                lineToRelative(3.75f, 7.6f)
                curveToRelative(1.33f, -1.32f, 3.08f, -2.22f, 5.02f, -2.5f)
                lineToRelative(-2.51f, -5.09f)
                lineTo(1.93f, 1f)
                close()
                moveTo(20f, 15f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                close()
            }
        }.also { _SecondMedal = it}
