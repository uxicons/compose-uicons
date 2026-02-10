package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FirstMedal: ImageVector? = null

val Icons.Ts.FirstMedal: ImageVector
    get() = _FirstMedal ?: UXIcon(name = "FirstMedal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.66f, 0f)
                horizontalLineToRelative(-8.47f)
                lineToRelative(-2.97f, 6.0f)
                curveToRelative(-0.07f, -0.0f, -0.15f, -0.0f, -0.22f, -0.0f)
                curveToRelative(-0.08f, 0f, -0.15f, 0f, -0.23f, 0.0f)
                lineTo(8.81f, 0f)
                lineTo(0.32f, 0f)
                lineToRelative(4.64f, 9.4f)
                curveToRelative(-1.23f, 1.54f, -1.96f, 3.48f, -1.96f, 5.6f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -2.12f, -0.73f, -4.06f, -1.96f, -5.6f)
                lineTo(23.66f, 0f)
                close()
                moveTo(15.81f, 1f)
                horizontalLineToRelative(6.24f)
                lineToRelative(-3.75f, 7.58f)
                curveToRelative(-1.33f, -1.31f, -3.07f, -2.21f, -5.01f, -2.49f)
                lineToRelative(2.52f, -5.09f)
                close()
                moveTo(1.93f, 1f)
                horizontalLineToRelative(6.26f)
                lineToRelative(2.51f, 5.09f)
                curveToRelative(-1.94f, 0.28f, -3.69f, 1.19f, -5.02f, 2.5f)
                lineTo(1.93f, 1f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 7f, 12f, 7f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
                moveTo(12.2f, 10f)
                horizontalLineToRelative(0.8f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-8.35f)
                lineToRelative(-1.64f, 1.7f)
                lineToRelative(-0.72f, -0.69f)
                lineToRelative(2.56f, -2.65f)
                close()
            }
        }.also { _FirstMedal = it}
