package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceViewfinder: ImageVector? = null

val Icons.Bs.FaceViewfinder: ImageVector
    get() = _FaceViewfinder ?: UXIcon(name = "FaceViewfinder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 24f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 21.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                lineTo(24f, 2.5f)
                close()
                moveTo(3f, 3f)
                horizontalLineToRelative(5f)
                lineTo(8f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3f)
                lineTo(3f, 3f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 3.87f, -3.13f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.13f, -7f, -7f)
                reflectiveCurveToRelative(3.13f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.13f, 7f, 7f)
                close()
                moveTo(9.5f, 12f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(15.55f, 14.83f)
                lineToRelative(-1.11f, -1.66f)
                curveToRelative(-0.01f, 0.01f, -1.28f, 0.83f, -2.44f, 0.83f)
                curveToRelative(-0.97f, 0f, -2.1f, -0.6f, -2.45f, -0.83f)
                lineToRelative(-1.11f, 1.67f)
                curveToRelative(0.18f, 0.12f, 1.8f, 1.17f, 3.56f, 1.17f)
                reflectiveCurveToRelative(3.38f, -1.05f, 3.56f, -1.17f)
                close()
                moveTo(16f, 10.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _FaceViewfinder = it}
