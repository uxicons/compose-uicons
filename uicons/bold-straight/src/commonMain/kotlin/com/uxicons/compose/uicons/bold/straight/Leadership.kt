package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leadership: ImageVector? = null

val Icons.Bs.Leadership: ImageVector
    get() = _Leadership ?: UXIcon(name = "Leadership") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19f, 14.22f)
                lineToRelative(5f, -3.47f)
                verticalLineToRelative(3.65f)
                lineToRelative(-13.82f, 9.59f)
                horizontalLineToRelative(-5.26f)
                lineToRelative(1.09f, -0.75f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(-0.02f, 1.38f)
                lineToRelative(-0.85f, 2.62f)
                lineTo(0f, 24f)
                lineToRelative(1f, -3.19f)
                verticalLineToRelative(-6.31f)
                curveToRelative(0f, -1.27f, 0.94f, -2.3f, 2.17f, -2.47f)
                lineToRelative(4.47f, -1.36f)
                lineToRelative(4.13f, -3.97f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.45f, -0.43f, 1.06f, -0.7f, 1.74f, -0.7f)
                horizontalLineToRelative(4.5f)
                lineTo(18.0f, 0f)
                lineToRelative(6f, 2.5f)
                lineToRelative(-3f, 2f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.23f)
                close()
                moveTo(11f, 11.59f)
                lineToRelative(-1.8f, 1.74f)
                lineToRelative(-3.2f, 0.97f)
                verticalLineToRelative(2.69f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4.16f)
                lineToRelative(2f, -1.39f)
                verticalLineToRelative(-8.18f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.69f)
                lineToRelative(2f, -1.39f)
                verticalLineToRelative(-2.31f)
                close()
                moveTo(3.5f, 11f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _Leadership = it}
