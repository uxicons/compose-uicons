package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DegreeCredential: ImageVector? = null

val Icons.Rs.DegreeCredential: ImageVector
    get() = _DegreeCredential ?: UXIcon(name = "DegreeCredential") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                lineTo(22f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                lineTo(0f, 22f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(19f, 7f)
                lineTo(5f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 16f)
                curveToRelative(0f, 1.0f, -0.39f, 1.91f, -1f, 2.62f)
                verticalLineToRelative(5.38f)
                lineToRelative(-3f, -2.5f)
                lineToRelative(-3f, 2.5f)
                verticalLineToRelative(-5.38f)
                curveToRelative(-0.61f, -0.7f, -1f, -1.61f, -1f, -2.62f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(14f, 16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(12.69f, 11f)
                horizontalLineToRelative(-7.69f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.81f)
                curveToRelative(0.47f, -0.8f, 1.11f, -1.49f, 1.88f, -2f)
                close()
                moveTo(5f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5.09f)
                curveToRelative(-0.06f, -0.33f, -0.09f, -0.66f, -0.09f, -1f)
                reflectiveCurveToRelative(0.04f, -0.67f, 0.09f, -1f)
                horizontalLineToRelative(-5.09f)
                close()
            }
        }.also { _DegreeCredential = it}
