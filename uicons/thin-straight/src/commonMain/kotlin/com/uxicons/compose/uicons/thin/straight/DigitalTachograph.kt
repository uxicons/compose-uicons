package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DigitalTachograph: ImageVector? = null

val Icons.Ts.DigitalTachograph: ImageVector
    get() = _DigitalTachograph ?: UXIcon(name = "DigitalTachograph") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 3f)
                lineTo(2.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 20f)
                lineTo(1f, 20f)
                lineTo(1f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                close()
                moveTo(3f, 17f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                lineTo(3f, 18f)
                verticalLineToRelative(-1f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                close()
                moveTo(13f, 6f)
                lineTo(3f, 6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-5f)
                close()
                moveTo(12f, 10f)
                lineTo(4f, 10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                close()
                moveTo(3f, 14f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(8f, 13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(13f, 14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _DigitalTachograph = it}
