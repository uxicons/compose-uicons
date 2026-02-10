package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PatientFile: ImageVector? = null

val Icons.Sr.PatientFile: ImageVector
    get() = _PatientFile ?: UXIcon(name = "PatientFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 9f)
                horizontalLineToRelative(-7.03f)
                curveToRelative(-0.15f, 0f, -0.31f, -0.04f, -0.45f, -0.1f)
                lineToRelative(-3.15f, -1.58f)
                curveToRelative(-0.41f, -0.21f, -0.88f, -0.32f, -1.34f, -0.32f)
                horizontalLineToRelative(-2.03f)
                curveToRelative(-2.76f, -0.0f, -5f, 2.24f, -5f, 5.0f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(7.03f, 5f)
                horizontalLineToRelative(-2.03f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(5.67f)
                curveToRelative(0.8f, 0f, 1.55f, 0.31f, 2.12f, 0.88f)
                lineToRelative(1.33f, 1.33f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(-6.79f)
                lineToRelative(-2.94f, -1.47f)
                curveToRelative(-0.69f, -0.34f, -1.46f, -0.53f, -2.23f, -0.53f)
                close()
            }
        }.also { _PatientFile = it}
