package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AirplaneModeOn: ImageVector? = null

val Icons.Bs.AirplaneModeOn: ImageVector
    get() = _AirplaneModeOn ?: UXIcon(name = "AirplaneModeOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 18f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(7.59f)
                curveToRelative(0.47f, -1.16f, 1.21f, -2.19f, 2.13f, -3f)
                horizontalLineToRelative(-12.72f)
                verticalLineToRelative(21f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-7.26f)
                curveToRelative(-1.11f, -0.29f, -2.13f, -0.8f, -3f, -1.5f)
                close()
                moveTo(10.0f, 22.01f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(6f, 15f)
                lineTo(7.36f, 12f)
                horizontalLineToRelative(-1.71f)
                lineToRelative(-1.55f, -1.83f)
                curveToRelative(-0.3f, -0.52f, 0.08f, -1.17f, 0.68f, -1.17f)
                curveToRelative(0.21f, 0f, 0.41f, 0.08f, 0.55f, 0.23f)
                lineToRelative(0.92f, 0.77f)
                horizontalLineToRelative(1.12f)
                lineToRelative(-1.38f, -3f)
                horizontalLineToRelative(1.1f)
                curveToRelative(0.41f, 0f, 0.78f, 0.22f, 0.97f, 0.58f)
                lineToRelative(1.93f, 2.42f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.8f, 0f, 1.25f, 0.45f, 1.25f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                lineToRelative(-1.91f, 2.42f)
                curveToRelative(-0.2f, 0.36f, -0.57f, 0.58f, -0.97f, 0.58f)
                horizontalLineToRelative(-1.11f)
                close()
                moveTo(18f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.75f, 8.44f)
                lineTo(18.75f, 8.44f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-2.18f, -2.27f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.22f, 2.3f)
                lineToRelative(3.61f, -3.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.61f, 3.7f)
                close()
            }
        }.also { _AirplaneModeOn = it}
