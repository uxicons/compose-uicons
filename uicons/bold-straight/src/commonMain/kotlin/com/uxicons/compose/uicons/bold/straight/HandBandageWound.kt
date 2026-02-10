package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBandageWound: ImageVector? = null

val Icons.Bs.HandBandageWound: ImageVector
    get() = _HandBandageWound ?: UXIcon(name = "HandBandageWound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-2f)
                lineTo(14f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-2.01f)
                lineTo(8.99f, 3.58f)
                curveToRelative(0f, -0.75f, -0.51f, -1.44f, -1.25f, -1.56f)
                curveToRelative(-0.94f, -0.15f, -1.74f, 0.57f, -1.74f, 1.48f)
                verticalLineToRelative(12.27f)
                lineToRelative(-2.64f, -2.3f)
                curveToRelative(-0.87f, -0.72f, -2.15f, -0.6f, -2.87f, 0.26f)
                curveToRelative(-0.72f, 0.87f, -0.6f, 2.15f, 0.26f, 2.87f)
                lineToRelative(4.52f, 4.05f)
                lineToRelative(3.65f, 3.34f)
                horizontalLineToRelative(15.08f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13.29f, 13f)
                lineToRelative(-4.31f, 3.94f)
                verticalLineToRelative(-3.94f)
                horizontalLineToRelative(4.31f)
                close()
                moveTo(9.54f, 20.5f)
                lineToRelative(8.21f, -7.5f)
                horizontalLineToRelative(3.26f)
                verticalLineToRelative(0.11f)
                lineToRelative(-8.63f, 7.89f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(-0.55f, -0.5f)
                close()
                moveTo(16.82f, 21f)
                lineToRelative(4.18f, -3.82f)
                verticalLineToRelative(3.82f)
                horizontalLineToRelative(-4.18f)
                close()
            }
        }.also { _HandBandageWound = it}
