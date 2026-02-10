package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckArrowLeft: ImageVector? = null

val Icons.Ss.TruckArrowLeft: ImageVector
    get() = _TruckArrowLeft ?: UXIcon(name = "TruckArrowLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.94f, 20f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                horizontalLineToRelative(4.88f)
                close()
                moveTo(3.06f, 20f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.06f, -0.5f)
                lineTo(3.06f, 20f)
                close()
                moveTo(12f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(5.64f)
                curveToRelative(0.07f, -0.39f, 0.25f, -0.76f, 0.55f, -1.05f)
                lineToRelative(3.52f, -3.52f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.52f, 2.52f)
                horizontalLineToRelative(8.04f)
                verticalLineToRelative(2f)
                lineTo(2.96f, 11f)
                lineToRelative(2.52f, 2.52f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.52f, -3.52f)
                curveToRelative(-0.3f, -0.3f, -0.48f, -0.67f, -0.55f, -1.05f)
                verticalLineToRelative(7.64f)
                horizontalLineToRelative(15f)
                lineTo(15f, 4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _TruckArrowLeft = it}
