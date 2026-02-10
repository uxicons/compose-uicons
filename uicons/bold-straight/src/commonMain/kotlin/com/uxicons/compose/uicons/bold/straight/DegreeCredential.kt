package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DegreeCredential: ImageVector? = null

val Icons.Bs.DegreeCredential: ImageVector
    get() = _DegreeCredential ?: UXIcon(name = "DegreeCredential") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 12f)
                horizontalLineToRelative(4.82f)
                curveToRelative(-0.79f, 0.82f, -1.36f, 1.85f, -1.64f, 3f)
                horizontalLineToRelative(-3.18f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19.5f, 2f)
                lineTo(4.5f, 2f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-0.82f)
                curveToRelative(-0.64f, -0.61f, -1.15f, -1.35f, -1.5f, -2.18f)
                lineTo(3f, 19f)
                lineTo(3f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.35f, 0.83f, -0.86f, 1.57f, -1.5f, 2.18f)
                verticalLineToRelative(0.82f)
                horizontalLineToRelative(5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(17f, 20.24f)
                verticalLineToRelative(3.75f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                verticalLineToRelative(-3.75f)
                curveToRelative(-1.21f, -0.81f, -2f, -2.18f, -2f, -3.74f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 1.56f, -0.8f, 2.93f, -2f, 3.74f)
                close()
                moveTo(13f, 16.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(19f, 7f)
                lineTo(5f, 7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _DegreeCredential = it}
